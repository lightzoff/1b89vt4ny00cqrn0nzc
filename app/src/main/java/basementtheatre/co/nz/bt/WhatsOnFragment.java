package basementtheatre.co.nz.bt;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class WhatsOnFragment extends Fragment {


    public WhatsOnFragment() {
        // Required empty public constructor
    }

//
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_whats_on_, container, false);
       // ImageButton button1 = (ImageButton) getView().findViewById(R.id.button1);
       // button1.setOnClickListener(new View.OnClickListener() {

          //  @Override
          //  public void onClick(View v) {
                //   FragmentManager fm = getFragmentManager();
                //   ft.commit();
                //  FragmentTransaction ft = fm.beginTransaction();

                // }

                //   });
                //   }

    }
}



