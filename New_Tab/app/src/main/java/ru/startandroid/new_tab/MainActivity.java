package ru.startandroid.new_tab;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //инициализируем tab и pager vews
        TabLayout tabLayout = (TabLayout)findViewById(R.id.my_tab_layout);
        final ViewPager viewPager = (ViewPager)findViewById(R.id.my_view_pager);

        //создаем новые табы и добавляем их в tablayout
        tabLayout.addTab(tabLayout.newTab().setText("1 Tab"));
        tabLayout.addTab(tabLayout.newTab().setText("2 Tab"));

        //добавляем фрагменты в лист
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(Fragment.instantiate(this,MyFirstTabFragment.class.getName()));
        fragmentList.add(Fragment.instantiate(this,MySecondTabFragment.class.getName()));

        //прикрепляем фрагменты в tablayout с viewpager
        viewPager.setAdapter(new Section_Pager_Adapter(getSupportFragmentManager(), fragmentList));
        tabLayout.setupWithViewPager(viewPager);
    }
}
