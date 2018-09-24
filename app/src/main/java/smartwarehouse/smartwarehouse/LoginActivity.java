package smartwarehouse.smartwarehouse;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Typeface font = Typeface.createFromAsset(getAssets(), "Montserrat-Medium.tff");
        ((EditText)findViewById(R.id.namaPengguna)).setTypeface(font);
        ((EditText)findViewById(R.id.password)).setTypeface(font);
    }
}
