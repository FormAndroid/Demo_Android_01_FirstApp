package be.bxl.formation.demo_01_firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "DEMO_BXL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "L'activité a été créé !");


        DemoApplication app = (DemoApplication) getApplication();


        // Différent niveau d'affichage de message dans la console
        // - Verbose (Le type de message les moins importants)
        Log.v(app.DEBUG_TAG, "Ceci est un simple message");

        // - Debug
        Log.d(app.DEBUG_TAG, "Ceci est mon message de debug !!! :o");

        // - Information
        Log.i(app.DEBUG_TAG, "Ceci est un message d'information");

        // - Attention (Warning)
        Log.w(app.DEBUG_TAG, "Ceci est un message de warning !!!");

        // - Erreur
        Log.e(app.DEBUG_TAG, "Ceci est un message d'erreur ! :( ");

        // - Erreur (Le type de message le plus important)
        //   -> What the failure
        Log.wtf(app.DEBUG_TAG, "Ceci est un message ultra important !!!!!!!");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "L'activité a été demarré !");


        // Pour acceder au ressource => Utilise la classe "R" (Generer automatiquement)
        String text = getString(R.string.demo_text);

        // Affichage d'une notification "Toast"
        Toast.makeText(this, R.string.message_hello, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "L'activité a lancé la méthode 'onResume'");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "L'activité est en pause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "L'activité est arrêté");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "L'activité a été redemarré !");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "L'activité va être detruite :( ");
    }
}