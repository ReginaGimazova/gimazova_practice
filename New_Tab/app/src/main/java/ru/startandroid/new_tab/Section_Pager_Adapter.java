package ru.startandroid.new_tab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class Section_Pager_Adapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList;

    public Section_Pager_Adapter(FragmentManager fm, List<Fragment> fragments){
        super(fm);
        this.fragmentList = fragments;
    }


    @Override
    public Fragment getItem(int position) {
        return this.fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return this.fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "1 Tab";
            case 1:
            default:
                return "2 Tab";
        }
    }
}
