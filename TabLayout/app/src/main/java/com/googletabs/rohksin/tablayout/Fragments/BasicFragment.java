package com.googletabs.rohksin.tablayout.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Illuminati on 4/22/2017.
 */
public abstract class BasicFragment extends Fragment {

    public BasicFragment newInstance()
    {
        Log.d("Rohit", "new Instance");
        Bundle args = new Bundle();
       // args.putInt(ARG_PAGE, page);
        BasicFragment fragment = provideYourFragment();
        fragment.setArguments(args);
        return fragment;

    }



    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater,ViewGroup parent, Bundle savedInstanseState)
    {
        View view = provideYourFragmentView(inflater,parent,savedInstanseState);
        return view;
    }

    public abstract BasicFragment provideYourFragment();

    public abstract View provideYourFragmentView(LayoutInflater inflater,ViewGroup parent, Bundle savedInstanceState);

}
