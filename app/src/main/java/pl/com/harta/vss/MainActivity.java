package pl.com.harta.vss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1;
    TextView resultE1;
    TextView resultE2;
    TextView resultI0;
    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button1Click(View v) {
       button1 = findViewById(R.id.button1);
       resultE1 = findViewById(R.id.resultE1);
       resultE2 = findViewById(R.id.resultE2);
       resultI0 = findViewById(R.id.resultI0);
       et1 = findViewById(R.id.primaryPressureAt05);
       et2 = findViewById(R.id.primaryPressureAt15);
       et3 = findViewById(R.id.secondaryPressureAt05);
       et4 = findViewById(R.id.secondaryPressureAt15);
       Double primaryPressure05 = Double.parseDouble(et1.getText().toString());
       Double primaryPressure15 = Double.parseDouble(et2.getText().toString());
       Double secondaryPressure05 = Double.parseDouble(et3.getText().toString());
       Double secondaryPressure15 = Double.parseDouble(et4.getText().toString());
       Double E1 = Math.round(0.75 * 300 * 0.1 / (primaryPressure15-primaryPressure05) * 100.0) / 100.0;
       Double E2 = Math.round(0.75 * 300 * 0.1 / (secondaryPressure15-secondaryPressure05) * 100.0) / 100.0;
       Double I0 = Math.round(E2 / E1 * 100.0) / 100.0;
       resultE1.setText(E1.toString());
       resultE2.setText(E2.toString());
       resultI0.setText(I0.toString());

    }
}