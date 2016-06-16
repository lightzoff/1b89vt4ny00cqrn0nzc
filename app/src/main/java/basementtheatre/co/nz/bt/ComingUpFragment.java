package basementtheatre.co.nz.bt;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//Inflates fragment from the navigation bar, view xml for structure - fragment_coming_up

/**
 * A simple {@link Fragment} subclass.
 */
public class ComingUpFragment extends Fragment {


    public ComingUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_coming_up, container, false);
    }

}
