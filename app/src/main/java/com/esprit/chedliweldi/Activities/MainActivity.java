package com.esprit.chedliweldi.Activities;

import android.net.Uri;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import com.esprit.chedliweldi.Entities.Babysitter;
import com.esprit.chedliweldi.Fragments.Login;
import com.esprit.chedliweldi.Fragments.ParentProfil;
import com.esprit.chedliweldi.R;

public class MainActivity extends AppCompatActivity implements ParentProfil.OnFragmentInteractionListener {
    private FragmentManager fragmentManager;
    private Fragment fragment;
    public static List<Babysitter> bbySitters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Making notification bar transparent
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        bbySitters = new ArrayList<>();
        fragmentManager = getSupportFragmentManager();
        fragment = new Login();
        fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
