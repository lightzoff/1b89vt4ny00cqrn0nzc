package basementtheatre.co.nz.bt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import com.onesignal.OneSignal;

//Inflates fragment from the navigation bar, view xml for structure - fragment_fragment_main
public class MainActivity extends AppCompatActivity {

    //Displays button and sets OnClickListener, when clicked goes back to HomeClass
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OneSignal.startInit(this).init();
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HomeClassActivity();
            }

        });
    }
    //Intent for starting the above activity
    public void HomeClassActivity() {
        Intent in = new Intent(this, HomeClass.class);
        this.startActivity(in);
    }

}
