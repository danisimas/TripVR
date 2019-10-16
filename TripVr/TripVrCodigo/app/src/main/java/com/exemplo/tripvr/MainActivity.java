package com.exemplo.tripvr;

import android.os.Bundle;
import android.view.MenuItem;

import com.exemplo.tripvr.fragments.ExplorarFragment;
import com.exemplo.tripvr.fragments.FavoritosFragment;
import com.exemplo.tripvr.fragments.PrincipalFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main_activity);

            loadFragment(new PrincipalFragment());

            BottomNavigationView bottomNav = findViewById(R.id.nav_view);
            bottomNav.setOnNavigationItemSelectedListener(this);

        }


        @Override
        public void onPointerCaptureChanged(boolean hasCapture) {

        }

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;

            switch(menuItem.getItemId()){
                case R.id.explorar:
                    selectedFragment = new ExplorarFragment();
                    break;
                case R.id.favoritar:
                    selectedFragment = new FavoritosFragment();
            }

            return loadFragment(selectedFragment);
        }


        private boolean loadFragment(Fragment fragment) {
            //switching fragment
            if (fragment != null) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, fragment)
                        .commit();
                return true;
            }
            return false;
        }
    }

