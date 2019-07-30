package com.example.firebasepushnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView title_text, message_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title_text = (TextView) findViewById(R.id.title);
        message_text = (TextView) findViewById(R.id.message);

        setUI();
    }

    public void setUI()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("Data",MODE_PRIVATE);
        String title = sharedPreferences.getString("title",null);
        String message = sharedPreferences.getString("message",null);

        title_text.setText("Title: "+title);
        message_text.setText("Message: "+message);
    }
}
