package basementtheatre.co.nz.bt;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class ContactAndLocationFragment extends Fragment implements OnMapReadyCallback {


    /**
     * Note that this may be null if the Google Play services APK is not
     * available.
     */
    private static GoogleMap mMap;
    private SupportMapFragment mapFrag;
    private static Double latitude, longitude;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        latitude = -36.853654439472;
        longitude = 174.76280283467;
        View rootView = inflater.inflate(R.layout.fragment_contact_and_location, container, false);

        mapFrag = ((SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.ContactAndLocationFragment));
        mapFrag.getMapAsync(this);

        return rootView;
    }

    @Override
    public void onMapReady(GoogleMap map) {
        mMap = map;
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.addMarker(new MarkerOptions().position(new LatLng(latitude, longitude)).title("Basement Theatre").snippet("321 Queen St,Auckland CBD"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude, longitude), 19));
    }
}