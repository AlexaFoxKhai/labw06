package com.example.labw06;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.server.converter.StringToIntConverter;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8,b9;
    EditText x, y, e3;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        y = (EditText) findViewById(R.id.editText);
        x = (EditText) findViewById(R.id.editText2);
        e3 = (EditText) findViewById(R.id.editText3);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button7);
        b7 = (Button) findViewById(R.id.button8);
        b8 = (Button) findViewById(R.id.button9);
        b9 = (Button) findViewById(R.id.button10);
        // String s = e1.getText().toString();

        b1.setOnClickListener(listner);
        b2.setOnClickListener(listner);
        b3.setOnClickListener(listner);
        b4.setOnClickListener(listner);
        b5.setOnClickListener(listner);
        b6.setOnClickListener(listner);
        b7.setOnClickListener(listner);
        b8.setOnClickListener(listner);
        b9.setOnClickListener(listner);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }
    View.OnClickListener listner = new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            if (arg0.getId() == R.id.button) {
                int X = Integer.parseInt(x.getText().toString());
                int Y = Integer.parseInt(y.getText().toString());
                Integer RES = X*Y;
                e3.setText(RES.toString());
            }
            if (arg0.getId() == R.id.button2) {
                int X = Integer.parseInt(x.getText().toString());
                int Y = Integer.parseInt(y.getText().toString());
                Integer RES = X+Y;
                e3.setText(RES.toString());
            }
            if (arg0.getId() == R.id.button3) {
                int X = Integer.parseInt(x.getText().toString());
                int Y = Integer.parseInt(y.getText().toString());
                Integer RES = X-Y;
                e3.setText(RES.toString());
            }
            if (arg0.getId() == R.id.button4) {
                int X = Integer.parseInt(x.getText().toString());
                int Y = Integer.parseInt(y.getText().toString());
                Integer RES = X/Y;
                e3.setText(RES.toString());
            }
            if (arg0.getId() == R.id.button5) {
                int X = Integer.parseInt(x.getText().toString());
                int Y = Integer.parseInt(y.getText().toString());
                String RES = Integer.toBinaryString(X);
                e3.setText(RES);
            }
            if (arg0.getId() == R.id.button8) {
                int X = Integer.parseInt(x.getText().toString());
                int Y = Integer.parseInt(y.getText().toString());
                Integer RES = X%Y;
                e3.setText(RES.toString());
            }
            if (arg0.getId() == R.id.button9) {
                int X = Integer.parseInt(x.getText().toString());
                int Y = Integer.parseInt(y.getText().toString());
                Integer RES = X^Y;
                e3.setText(RES.toString());
            }
            if (arg0.getId() == R.id.button7) {
                int X = Integer.parseInt(x.getText().toString());
                int Y = Integer.parseInt(y.getText().toString());
                Double RES = Math.pow(X, Y);
                e3.setText(RES.toString());
            }
            if (arg0.getId() == R.id.button10) {
                x.setText(e3.getText().toString());
            }
        }
    };

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
