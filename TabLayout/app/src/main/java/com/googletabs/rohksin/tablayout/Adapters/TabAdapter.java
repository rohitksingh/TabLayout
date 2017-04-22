package com.googletabs.rohksin.tablayout.Adapters;

/**
 * Created by Illuminati on 4/22/2017.
 */


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.util.Log;

import com.googletabs.rohksin.tablayout.Fragments.BasicFragment;
import com.googletabs.rohksin.tablayout.Fragments.Impl.ButtonFragment;
import com.googletabs.rohksin.tablayout.Fragments.Impl.ImageFragment;

import java.util.ArrayList;


public class TabAdapter extends FragmentPagerAdapter {

    private int PageCount;
    private String[] PageTitle;
    private Context context;

    private ArrayList<Fragment> tabFragments;

    public TabAdapter(FragmentManager fm, Context context,String[] PageTitle,int PageCount) {

        super(fm);
        tabFragments = new ArrayList<Fragment>();
        tabFragments.add(new ImageFragment().newInstance());
        tabFragments.add(new ButtonFragment().newInstance());

        this.context = context;
        this.PageTitle = PageTitle;
        this.PageCount = PageCount;



    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();

        Fragment fragment;
        fragment= tabFragments.get(position);
        //incase you want to pass some info to fragment
        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public int getCount() {
        return PageCount;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return PageTitle[position];
    }
}
