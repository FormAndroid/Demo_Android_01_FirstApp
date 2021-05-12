package be.bxl.formation.demo_01_firstapp;

import android.app.Application;
import android.util.Log;

public class DemoApplication extends Application {

    public final String DEBUG_TAG = "DEMO_BXL";


    @Override
    public void onCreate() {
        super.onCreate();

        Log.i(DEBUG_TAG, "L'application démarre !");
    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();

        Log.i(DEBUG_TAG, "Peu de mémoire !!! ");
        // Pour faire de l'optimisation (Si necessaire)
    }
}
