package com.manukumar.tabbar;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private boolean isUserClickedBackButton=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.container);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);
        TabLayout tabLayout=(TabLayout)findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        mViewPager.setOffscreenPageLimit(3);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setSelectedTabIndicatorHeight(0);
        mViewPager.setCurrentItem(1);
        mViewPager.setCurrentItem(0);

        tabLayout.getTabAt(0).setIcon(R.drawable.latest);
        tabLayout.getTabAt(1).setIcon(R.drawable.category);
        tabLayout.getTabAt(2).setIcon(R.drawable.contact_us);
        tabLayout.getTabAt(0).getIcon().setColorFilter(Color.parseColor("#d13030"), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(1).getIcon().setColorFilter(Color.parseColor("#797980"), PorterDuff.Mode.SRC_IN);
        tabLayout.getTabAt(2).getIcon().setColorFilter(Color.parseColor("#797980"), PorterDuff.Mode.SRC_IN);

        tabLayout.setTabTextColors(Color.parseColor("#797980"),Color.parseColor("#d13030"));
        tabLayout.setBackgroundColor(Color.parseColor("#bababa"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#d13030"), PorterDuff.Mode.SRC_IN);
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#797980"), PorterDuff.Mode.SRC_IN);
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tab, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }




    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {

            Fragment fragment = null;
            Bundle args = new Bundle();
            if (position == 0) {
                Tab1 t0 = new Tab1();
                return t0;
            } else if (position == 1){
                Tab2 t1 = new Tab2();
                return t1;
            } else {
                Tab3 t2 = new Tab3();
                return t2;
            }
            // return null;
        }

        public int getCount() {
            return 3;
        }

        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Tab1";
                case 1:
                    return "Tab2";
                case 2:
                    return "Tab3";
            }
            return null;
        }
    }
}
