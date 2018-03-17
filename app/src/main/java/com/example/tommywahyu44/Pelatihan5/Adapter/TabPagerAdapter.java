package com.example.tommywahyu44.Pelatihan5.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.tommywahyu44.Pelatihan5.CardviewFragment;
import com.example.tommywahyu44.Pelatihan5.GridviewFragment;

/**
 * Created by Fauziw97 on 9/12/17.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount = tabCount;
    }


    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                CardviewFragment tab1 = new CardviewFragment();
                return tab1;
            case 1:
               GridviewFragment tab2 = new GridviewFragment();
                return tab2;
            default:
                return null;
        }
    }


    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}
