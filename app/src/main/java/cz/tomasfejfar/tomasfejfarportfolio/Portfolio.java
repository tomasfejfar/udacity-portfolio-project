package cz.tomasfejfar.tomasfejfarportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Portfolio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    public void sendMessage(View view) {
        CharSequence buttonId = "";
        if (view instanceof Button) {
            buttonId = ((Button) view).getText();
        }
        Context context = getApplicationContext();
        CharSequence text = "This will display the " + buttonId + " app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
