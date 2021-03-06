package com.example.firstproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu,menu);
            return super.onCreateOptionsMenu(menu);
        }

        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()){
                case R.id.mnuLogin:
                    Toast.makeText(this, "Login Clicked", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.mnuAbout:
                    Intent intentabout=new Intent(LoginActivity.this,AboutActivity.class);
                    startActivity(intentabout);
                    Toast.makeText(this, "About Clicked", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.mnuContact:
                    Intent intentContact=new Intent(LoginActivity.this,ContactUsActivity.class);
                    startActivity(intentContact);
                    Toast.makeText(this, "Contact Clicked", Toast.LENGTH_SHORT).show();
                    break;
            }
            return super.onOptionsItemSelected(item);
        }
    }
