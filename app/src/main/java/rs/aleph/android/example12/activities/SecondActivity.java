package rs.aleph.android.example12.activities;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.model.Jelo;

// Each activity extends Activity class
public class SecondActivity extends Activity {

    private int position = 0;
    private Jelo[] meals = new Jelo[] {
            new Jelo("spaghetti.jpg","spaghetti", "Spaghetti with bologneze sauce", "salty meal", 500.0f,250.00f,1.0f,"Spaghetti"),
            new Jelo("nuggat_cake.jpg", "Nugat Cake", "Cake with a lot of cream", "sweet meal",400.0f, 350.00f,3.0f,"Chocolate cream"),
            new Jelo("barbecue.png", "Barbecue", "Roasted a few types of meat.", "salty meal", 600.0f,740.35f,4.0f,"Lamb meat, Hamburger")
    };






    //private static final int PERMISSIONS_REQUEST_CAMERA = 0;

    // onCreate method is a lifecycle method called when he activity is starting
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Each lifecycle method should call the method it overrides
        super.onCreate(savedInstanceState);
        // setContentView method draws UI
        setContentView(R.layout.activity_second);


        // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onCreate()", Toast.LENGTH_SHORT);
        toast.show();

        final int position = getIntent().getIntExtra("position", 0);


        TextView tvName = (TextView) findViewById(R.id.tv_name);
        tvName.setText(meals[position].getNaziv());

        TextView tvOpis = (TextView) findViewById(R.id.tv_opis);
        tvOpis.setText(meals[position].getOpisJela());


        TextView tvKategorija = (TextView) findViewById(R.id.tv_kategorija);
        tvKategorija.setText(meals[position].getKategorija());


        TextView tvKalorijskaVrednost = (TextView) findViewById(R.id.tv_kalorija);
        tvKalorijskaVrednost.setText(meals[position].getKalorijskaVrednost() + "");

        TextView tvCena = (TextView) findViewById(R.id.tv_cena);
        tvCena.setText(meals[position].getCena() + "");

        RatingBar rbOcena = (RatingBar) findViewById(R.id.rb_ocena);
        rbOcena.setRating(meals[position].getOcena());


        ImageView ivImage = (ImageView) findViewById(R.id.iv_slika);
        InputStream is = null;
        try {
            is = getAssets().open(meals[position].getSlika());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }



        TextView tvSastojci = (TextView) findViewById(R.id.tv_sastojci);
        tvSastojci.setText(meals[position].getSastojci() + "");


        Button btnOrder = (Button) findViewById(R.id.btn_order);
        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "You've ordered " + meals[position].getNaziv() + "!", Toast.LENGTH_LONG);
                toast.show();
            }
        });



        // Checks for permission dynamically (Manifest.permission.INTERNET is a normal permission that is granted automatically,
        // but for the sake of explanation ...)

        //Permission forusing camera from API 23

       /* if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CAMERA)) {

                // Show an explanation to the user *asynchronously* -- don't block this thread waiting for the user's response!

            } else {

                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CAMERA}, PERMISSIONS_REQUEST_CAMERA);

                // PERMISSIONS_REQUEST_READ_CONTACTS is an app-defined int constant. The callback method gets the result of the request.
            }
        } else {

            // Loads an URL into the WebView
            String URL = getIntent().getStringExtra("URL");
            if (!URL.trim().equalsIgnoreCase("")) {
                WebView myWebView = (WebView) findViewById(R.id.pageInfo);
                myWebView.getSettings().setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new MyWebViewClient());
                myWebView.loadUrl(URL.trim());
            }

        }*/
    }




    // onCreate method is a lifecycle method called when he activity is starting

    // onStart method is a lifecycle method called after onCreate (or after onRestart when the
    // activity had been stopped, but is now again being displayed to the user)
    @Override
    protected void onStart() {
        super.onStart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStart()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onRestart method is a lifecycle method called after onStop when the current activity is
    // being re-displayed to the user
    @Override
    protected void onRestart() {
        super.onRestart();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onRestart()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onResume method is a lifecycle method called after onRestoreInstanceState, onRestart, or
    // onPause, for your activity to start interacting with the user
    @Override
    protected void onResume() {
        super.onResume();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onPause method is a lifecycle method called when an activity is going into the background,
    // but has not (yet) been killed
    @Override
    protected void onPause() {
        super.onPause();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onPause()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onStop method is a lifecycle method called when the activity are no longer visible to the user
    @Override
    protected void onStop() {
        super.onStop();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onStop()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onDestroy method is a lifecycle method that perform any final cleanup before an activity is destroyed
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast toast = Toast.makeText(getBaseContext(), "SecondActivity.onDestroy()", Toast.LENGTH_SHORT);
        toast.show();
    }


    /*private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            return false;
        }
    }*/


   /* public void btnOpenCameraClicked(View view){
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(i);
    }*/

   /* private boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            // this device has a camera
            return true;
        } else {
            // no camera on this device
            return false;
        }
    }*/
    //@Override
  /*  public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case PERMISSIONS_REQUEST_CAMERA: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // Permission was granted

                    // Loads an URL into the WebView
                    String URL = getIntent().getStringExtra("URL");
                    if (!URL.trim().equalsIgnoreCase("")) {
                        WebView myWebView = (WebView) findViewById(R.id.pageInfo);
                        myWebView.getSettings().setJavaScriptEnabled(true);
                        myWebView.setWebViewClient(new MyWebViewClient());
                        myWebView.loadUrl(URL.trim());
                    }

                } else {

                    // Permission denied
                }
                return;
            }

            // other 'case' lines to check for other permissions this app might request
        }
    }*/






}
