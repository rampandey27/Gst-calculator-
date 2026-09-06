package com.example.gstcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText amountInput;
    EditText gstInput;
    TextView gstResult;
    TextView totalResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(40, 40, 40, 40);
        layout.setGravity(Gravity.CENTER_HORIZONTAL);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("GST 18% Calculator");
        title.setTextSize(28);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 0, 0, 40);

        layout.addView(title);

        amountInput = new EditText(this);
        amountInput.setHint("Amount");
        amountInput.setInputType(2);
        layout.addView(amountInput);

        gstInput = new EditText(this);
        gstInput.setHint("GST % (जैसे 18)");
        gstInput.set
