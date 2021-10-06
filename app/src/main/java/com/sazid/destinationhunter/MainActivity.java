package com.sazid.destinationhunter;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button btnlogin;
    TextView SignUp;
    EditText etName,etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        SignUp = (TextView) findViewById(R.id.SignUp);
        etName = (EditText)findViewById(R.id.etName);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etName.getText().toString().equals(etPassword.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(), "Log-In Successful" ,Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Log-In Failed" ,Toast.LENGTH_LONG).show();
                }
            }
        });
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),registerpage.class);
                startActivity(intent);
            }
        });
    }
}
