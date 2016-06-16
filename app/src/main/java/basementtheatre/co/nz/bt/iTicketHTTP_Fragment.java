package basementtheatre.co.nz.bt;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//Unimplemented Iticket fragment, was meant to have an api for ticket purchases

/**
 * A simple {@link Fragment} subclass.
 */
public class iTicketHTTP_Fragment extends Fragment {


    public iTicketHTTP_Fragment() {
        // Required empty public constructor/
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_i_tickect_http_, container, false);
    }

}
