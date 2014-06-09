package com.tabdemonew.tabdemonew;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

/**
 * Created by Knight on 06-Jun-14.
 */
public class Myadapter extends FragmentPagerAdapter {


    public Myadapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Log.d("item", "Get item is called");
        Fragment frag=null;
        if(position==0)

        {
            frag=new DisplayBirds();

        }
        if(position==1)

        {
            frag=new BirdsSearch();

        }
        if(position==2)

        {
            frag=new Showresult();

        }

        return frag;
    }

    @Override
    public int getCount() {
        Log.d("count","Get count is called");

        return 3;
    }
}
