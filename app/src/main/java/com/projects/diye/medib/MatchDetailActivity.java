package com.projects.diye.medib;

import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.alespero.expandablecardview.ExpandableCardView;

public class MatchDetailActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Toolbar mToolBar;
    private BottomNavigationView mBottomNav;
    private ExpandableCardView mExpandViewCleanSheetHome;
    private ExpandableCardView mExpandViewCleanSheetAway;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matchdetail);

        mBottomNav = findViewById(R.id.bottomNavigationView);
        try{
            mBottomNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        }
        catch (Exception e){

        }

        mExpandViewCleanSheetHome = findViewById(R.id.cleansheethome);
        mExpandViewCleanSheetAway = findViewById(R.id.cleansheetaway);




//        mExpandViewCleanSheetHome.setOnExpandedListener((v, isExpanded) -> {
//            if(isExpanded){
//                Toast.makeText(getApplicationContext(), "Expanded!", Toast.LENGTH_SHORT).show();
//            }
//            else {
//                Toast.makeText(getApplicationContext(), "Collapsed!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        mExpandViewCleanSheetAway.setOnExpandedListener((v, isExpanded) -> {
//            if(isExpanded){
//                Toast.makeText(getApplicationContext(), "Expanded!", Toast.LENGTH_SHORT).show();
//            }
//            else {
//                Toast.makeText(getApplicationContext(), "Collapsed!", Toast.LENGTH_SHORT).show();
//            }
//        });





        mToolBar = findViewById(R.id.side_nav_action);
        setSupportActionBar(mToolBar);

        mDrawerLayout = findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        try {
            mDrawerLayout.addDrawerListener(mToggle);
            mToggle.syncState();
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        catch (Exception e){

        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = menuItem -> {
        switch (menuItem.getItemId()){

            case R.id.slips:
                Toast.makeText(this, "Slip Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.matches:
                Toast.makeText(this, "Matches Selected", Toast.LENGTH_LONG).show();
                return true;
            case R.id.user:
                Toast.makeText(this, "User Selected", Toast.LENGTH_LONG).show();
                return true;
        }
        return false;
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
