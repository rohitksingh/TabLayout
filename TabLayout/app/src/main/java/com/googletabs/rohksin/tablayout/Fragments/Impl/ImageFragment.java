package com.googletabs.rohksin.tablayout.Fragments.Impl;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.googletabs.rohksin.tablayout.Fragments.BasicFragment;
import com.googletabs.rohksin.tablayout.R;

/**
 * Created by Illuminati on 4/22/2017.
 */
public class ImageFragment extends BasicFragment{
    @Override
    public BasicFragment provideYourFragment() {

        return new ImageFragment();
    }

    @Override
    public View provideYourFragmentView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.image_fragment,parent,false);

        //Get your parent layout of fragment
        RelativeLayout layout = (RelativeLayout)view;

        //Now specific components here

        ImageView imageView = (ImageView)layout.findViewById(R.id.myImage);
        imageView.setImageResource(android.R.drawable.ic_media_play);

        return view;

    }


}
