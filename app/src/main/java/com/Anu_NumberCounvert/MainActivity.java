package com.Anu_NumberCounvert;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etNumber;
    private TextView tvOutput;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber = findViewById(R.id.etNum);
        tvOutput = findViewById(R.id.tvOutput);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int number = Integer.parseInt(etNumber.getText().toString());
        Anu_NumberConvert ac = new Anu_NumberConvert();
        String word = ac.Convert(number);
        tvOutput.setText(word);
    }
}
