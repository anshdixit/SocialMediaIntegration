package com.example.migokart.socialmediaintegration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainFragment m = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.main,m).commit();
    }
}
