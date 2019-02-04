package com.projects.diye.medib;


import android.content.Context;
import android.content.Intent;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.os.Bundle;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.appcompat.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    RecyclerView matchRecycler;
    SwipeRefreshLayout mSwipeRefreshLayout;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private BottomNavigationView mBottomNav;
    private Toolbar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        mBottomNav = findViewById(R.id.bottomNavigationView);
        mBottomNav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);





        matchRecycler = findViewById(R.id.recycler);
        MatchAdapter adapter = new MatchAdapter(this);
        matchRecycler.setAdapter(adapter);
        matchRecycler.setLayoutManager(new LinearLayoutManager(this));

        //mSwipeRefreshLayout = findViewById(R.id.swipeToRefresh);
        //mSwipeRefreshLayout.setColorSchemeResources(R.color.black);


//        mSwipeRefreshLayout.setOnRefreshListener(() -> {
//            swipRefresh();
//            mSwipeRefreshLayout.setRefreshing(false);
//        });

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

    private void swipRefresh() {
    }

    private class MatchAdapter extends RecyclerView.Adapter {
        Context context;
        ArrayList<MatchModel> matches;

        public MatchAdapter(Context context){
            this.context = context;
            matches = new ArrayList<>();

            MatchModel modelMatch = new MatchModel();
            modelMatch.setLeague("Test Lauge");
            modelMatch.setTimeandDay("Time");
            modelMatch.setHomeTeam("Home");
            modelMatch.setAwayTeam("Away");
            modelMatch.setHomeTeamOdd(1.5);
            modelMatch.setAwayTeamOdd(2.0);
            matches.add(modelMatch);


            MatchModel modelMatch2 = new MatchModel();
            modelMatch.setLeague("Test Lauge");
            modelMatch.setTimeandDay("Time");
            modelMatch.setHomeTeam("Home");
            modelMatch.setAwayTeam("Away");
            modelMatch.setHomeTeamOdd(1.5);
            modelMatch.setAwayTeamOdd(2.0);
            matches.add(modelMatch2);


            MatchModel modelMatch3 = new MatchModel();
            modelMatch.setLeague("Test Lauge");
            modelMatch.setTimeandDay("Time");
            modelMatch.setHomeTeam("Home");
            modelMatch.setAwayTeam("Away");
            modelMatch.setHomeTeamOdd(1.5);
            modelMatch.setAwayTeamOdd(2.0);
            matches.add(modelMatch3);

            MatchModel modelMatch4 = new MatchModel();
            modelMatch.setLeague("Test Lauge");
            modelMatch.setTimeandDay("Time");
            modelMatch.setHomeTeam("Home");
            modelMatch.setAwayTeam("Away");
            modelMatch.setHomeTeamOdd(1.5);
            modelMatch.setAwayTeamOdd(2.0);
            matches.add(modelMatch4);


            MatchModel modelMatch5 = new MatchModel();
            modelMatch.setLeague("Test Lauge");
            modelMatch.setTimeandDay("Time");
            modelMatch.setHomeTeam("Home");
            modelMatch.setAwayTeam("Away");
            modelMatch.setHomeTeamOdd(1.5);
            modelMatch.setAwayTeamOdd(2.0);
            matches.add(modelMatch5);


            MatchModel modelMatch6 = new MatchModel();
            modelMatch.setLeague("Test Lauge");
            modelMatch.setTimeandDay("Time");
            modelMatch.setHomeTeam("Home");
            modelMatch.setAwayTeam("Away");
            modelMatch.setHomeTeamOdd(1.5);
            modelMatch.setAwayTeamOdd(2.0);
            matches.add(modelMatch6);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.match_card, parent, false);

            return new MatchViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

            holder.itemView.setOnClickListener(v ->{
                Intent intent = new Intent(MainActivity.this, MatchDetailActivity.class);
                startActivity(intent);
            });

        }

        @Override
        public int getItemCount() {
            return matches.size();
        }

        private class MatchViewHolder extends RecyclerView.ViewHolder {
            public MatchViewHolder(View itemView) {
                super(itemView);
            }
        }
    }
}

