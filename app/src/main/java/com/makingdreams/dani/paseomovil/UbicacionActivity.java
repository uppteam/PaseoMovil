package com.makingdreams.dani.paseomovil;

//import android.app.Fragment;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class UbicacionActivity extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;
    private SupportMapFragment fragment;
    private static View view;
    public static final String ARG_SECTION_TITLE = "section_number";

    public static UbicacionActivity newInstance(String sectionTitle) {
        UbicacionActivity fragment = new UbicacionActivity();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_TITLE, sectionTitle);
        fragment.setArguments(args);
        return fragment;
    }

    public UbicacionActivity() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        if (view != null) {
            ViewGroup parent = (ViewGroup) view.getParent();
            if (parent != null)
                parent.removeView(view);
        }
        try {
            view = inflater.inflate(R.layout.activity_maps, container, false);
        } catch (InflateException e) {
        /* map is already there, just return view as it is */
        }
        return view;
    }

    ;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        FragmentManager fm = getChildFragmentManager();
        fragment = (SupportMapFragment) fm.findFragmentById(R.id.map);
        if (fragment == null) {
            fragment = SupportMapFragment.newInstance();
            fm.beginTransaction().replace(R.id.map, fragment).commit();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mMap == null) {
            fragment.getMapAsync(this);
            //mMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)));
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        googleMap.setMyLocationEnabled(true);

        // Getting LocationManager object from System Service LOCATION_SERVICE
        LocationManager locationManager = (LocationManager) getContext().getSystemService(Context.LOCATION_SERVICE);

        // Creating a criteria object to retrieve provider
        Criteria criteria = new Criteria();

        // Getting the name of the best provider
        String provider = locationManager.getBestProvider(criteria, true);

        // Getting Current Location
        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        Location location = locationManager.getLastKnownLocation(provider);

        if (location == null) {
            LatLng latlong = new LatLng(20.117, -98.7333);
            mMap.moveCamera(CameraUpdateFactory.newLatLng(latlong));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
        }

        LocationListener listener  = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                double latitude = location.getLatitude();

                // Getting longitude of the current location
                double longitude = location.getLongitude();

                // Creating a LatLng object for the current location
                LatLng latLng = new LatLng(latitude, longitude);

                // Showing the current location in Google Map
                mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));

                // Zoom in the Google Map
                mMap.animateCamera(CameraUpdateFactory.zoomTo(15));
            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {

            }

            @Override
            public void onProviderDisabled(String s) {

            }

            //TODO -- Barney implements the other three interface methods

            }; //Close AIC declaration, implementation and terminate line.

        if(location!=null){
            listener.onLocationChanged(location);
        }
        locationManager.requestLocationUpdates(provider, 20000, 0,listener);
    }
}
