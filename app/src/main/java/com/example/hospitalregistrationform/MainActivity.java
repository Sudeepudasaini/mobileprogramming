package com.example.hospitalregistrationform;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hospitalregistrationform.R;

public class MainActivity extends AppCompatActivity {

    EditText name, age, gender, address, phone;
    Button registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.etName);
        age = findViewById(R.id.etAge);
        gender = findViewById(R.id.etGender);
        address = findViewById(R.id.etAddress);
        phone = findViewById(R.id.etPhone);
        registerBtn = findViewById(R.id.btnRegister);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "Patient Registered:\n"
                        + "Name: " + name.getText().toString() + "\n"
                        + "Age: " + age.getText().toString() + "\n"
                        + "Gender: " + gender.getText().toString() + "\n"
                        + "Address: " + address.getText().toString() + "\n"
                        + "Phone: " + phone.getText().toString();

                Toast.makeText(MainActivity.this, data, Toast.LENGTH_LONG).show();
            }
        });
    }
}
