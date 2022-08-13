package com.myanimelist.app.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.myanimelist.app.beans.Picture;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageSliderAdapter extends PagerAdapter {

    private Context context;
    private List<Picture> pictureList;

    public ImageSliderAdapter(Context context, List<Picture> pictureList) {
        this.context = context;
        this.pictureList = pictureList;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Picasso.get().load(pictureList.get(position).getLarge()).into(imageView);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public int getCount() {
        return pictureList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
