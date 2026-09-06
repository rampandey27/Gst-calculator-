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
        title.setText("GST Calculator");
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
        gstInput.setInputType(2);
        layout.addView(gstInput);

        Button calculateButton = new Button(this);
        calculateButton.setText("Calculate GST");
        layout.addView(calculateButton);

        gstResult = new TextView(this);
        gstResult.setText("GST: ₹0.00");
        gstResult.setTextSize(20);
        gstResult.setTextColor(Color.BLACK);
        gstResult.setPadding(0, 30, 0, 10);
        layout.addView(gstResult);

        totalResult = new TextView(this);
        totalResult.setText("Total: ₹0.00");
        totalResult.setTextSize(22);
        totalResult.setTextColor(Color.BLACK);
        layout.addView(totalResult);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String amountText = amountInput.getText().toString();
                String gstText = gstInput.getText().toString();

                if (amountText.isEmpty() || gstText.isEmpty()) {
                    gstResult.setText("कृपया Amount और GST % भरें");
                    totalResult.setText("");
                    return;
                }

                double amount = Double.parseDouble(amountText);
                double gstPercent = Double.parseDouble(gstText);

                double gstAmount = amount * gstPercent / 100;
                double totalAmount = amount + gstAmount;

                gstResult.setText(
                        String.format("GST: ₹%.2f", gstAmount)
                );

                totalResult.setText(
                        String.format("Total: ₹%.2f", totalAmount)
                );
            }
        });

        setContentView(layout);
    }
}package com.example.gstcalculator;

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
