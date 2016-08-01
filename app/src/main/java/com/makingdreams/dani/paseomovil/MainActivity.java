package com.makingdreams.dani.paseomovil;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

import com.makingdreams.dani.paseomovil.rutasConvencional.Convencional;

public class MainActivity extends AppCompatActivity {
    /**
     * Instancia del drawer
     */
    private DrawerLayout drawerLayout;

    /**
     * Titulo inicial del drawer
     */
    private String drawerTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar(); // Setear Toolbar como action bar

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }

        drawerTitle = getResources().getString(R.string.home_item);
        if (savedInstanceState == null) {
            selectItem(drawerTitle);
        }

    }

    private void setToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
        if (ab != null) {
            // Poner ícono del drawer toggle
            ab.setHomeAsUpIndicator(R.drawable.ic_menu);
            ab.setDisplayHomeAsUpEnabled(true);
        }

    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {

                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // Marcar item presionado
                        menuItem.setChecked(true);
                        // Crear nuevo fragmento
                        String title = menuItem.getTitle().toString();
                        selectItem(title);
                        return true;
                    }
                }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!drawerLayout.isDrawerOpen(GravityCompat.START)) {
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
            case R.id.action_home:
                reload_app();
                return true;
            case R.id.action_exit:
                close_app();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void selectItem(String title) {
        // Enviar título como arguemento del fragmento
        Fragment fragmentRemove = getSupportFragmentManager().findFragmentById(R.id.map);
        if(fragmentRemove != null)
            getSupportFragmentManager().beginTransaction().remove(fragmentRemove).commit();

        Bundle args = new Bundle();
        args.putString(PlaceholderFragment.ARG_SECTION_TITLE, title);
        Fragment fragment = PlaceholderFragment.newInstance(title);

        String inicio = getResources().getString(R.string.home_item);
        String rutas = getResources().getString(R.string.rutas_item);
        String ubicacion = getResources().getString(R.string.ubicacion_item);
        String mapas = getResources().getString(R.string.map_item);
        String salir = getResources().getString(R.string.exit);
        if (title.equals(inicio)) {
            fragment = Inicio.newInstance(title);
        }
        else if (title.equals(rutas)) {
            fragment = SeleccionRutas.newInstance(title);
        }
        else if (title.equals(ubicacion)) {
            fragment = UbicacionActivity.newInstance(title);
        }
        else if (title.equals(mapas)) {
            fragment = UbicacionActivity.newInstance(title);
        }
        else if (title.equals(salir)) {
            close_app();
        }

        fragment.setArguments(args);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.main_content, fragment)
                .commit();

        drawerLayout.closeDrawers(); // Cerrar drawer

        setTitle(title); // Setear título actual
    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    public void reload_app(){
        finish();
        startActivity(getIntent());
    }

    public void close_app(){
        finish();
        System.exit(0);
    }

}
