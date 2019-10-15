package com.exemplo.tripvr.activity;

import android.os.Bundle;
import android.view.MenuItem;

import com.exemplo.tripvr.R;
import com.exemplo.tripvr.fragments.FavoritosFragment;
import com.exemplo.tripvr.fragments.PrincipalFragment;
import com.exemplo.tripvr.fragments.SobreFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener  {

    // Configuracao sobre o método da chamada da Activity
    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            getSupportActionBar().hide();
            setContentView(R.layout.main_activity);

            loadFragment(new PrincipalFragment());

            BottomNavigationView bottomNav = findViewById(R.id.nav_view);
            bottomNav.setOnNavigationItemSelectedListener(this);

        }

        @Override
        public void onPointerCaptureChanged(boolean hasCapture) {
        }


        // Configuração da tela visualizada no bottom navigation
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;

            switch(menuItem.getItemId()){
                case R.id.explorar:
                    selectedFragment = new PrincipalFragment();
                    break;
                case R.id.favoritar:
                    selectedFragment = new FavoritosFragment();
                    break;
                case R.id.sobre:
                    selectedFragment = new SobreFragment();
                    break;
            }

            return loadFragment(selectedFragment);
        }


        // carregamento do fragment que ocupa o outro fragment
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

