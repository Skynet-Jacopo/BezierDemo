package cn.usmaker.bezierdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Bezier2     mBezier;
    private RadioButton mRadioButton1;
    private RadioButton mRadioButton2;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBezier = (Bezier2) findViewById(R.id.bezier);
        mRadioButton1 = (RadioButton) findViewById(R.id.radio1);
        mRadioButton2 = (RadioButton) findViewById(R.id.radio2);
        mButton = (Button) findViewById(R.id.button);

        mRadioButton1.setOnClickListener(this);
        mRadioButton2.setOnClickListener(this);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.radio1:
                mRadioButton1.setChecked(true);
                mRadioButton2.setChecked(false);
                mBezier.setMode(true);
                break;
            case R.id.radio2:
                mRadioButton1.setChecked(false);
                mRadioButton2.setChecked(true);
                mBezier.setMode(false);
                break;
            case R.id.button:
                startActivity(new Intent(this,SecondActivity.class));
                break;
        }
    }
}
