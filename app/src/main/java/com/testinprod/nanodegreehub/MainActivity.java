package com.testinprod.nanodegreehub;

import android.content.res.Resources;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();

        setClickToast((Button) findViewById(R.id.btnSpotify),res.getString(R.string.button_toast, res.getString(R.string.spotify_streamer)));
        setClickToast((Button) findViewById(R.id.btnScores),res.getString(R.string.button_toast, res.getString(R.string.scores_app)));
        setClickToast((Button) findViewById(R.id.btnLibrary),res.getString(R.string.button_toast, res.getString(R.string.library_app)));
        setClickToast((Button) findViewById(R.id.btnBuildItBigger),res.getString(R.string.button_toast, res.getString(R.string.build_it_bigger)));
        setClickToast((Button) findViewById(R.id.btnBaconReader),res.getString(R.string.button_toast, res.getString(R.string.xyz_reader)));
        setClickToast((Button) findViewById(R.id.btnCapstone),res.getString(R.string.button_toast, res.getString(R.string.capstone_app)));
    }

    /**
     * Small helper for having the button click throw a toast
     *
     * @param btn Button that we should add the on click listener to
     * @param toast Message to display in the toast
     */
    private void setClickToast(Button btn, String toast)
    {
        btn.setOnClickListener(new ToastOnClickListener(toast));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}


