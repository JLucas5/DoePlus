package com.edionay.doeplus.activity;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.edionay.doeplus.R;
import com.edionay.doeplus.model.Event;
import com.edionay.doeplus.service.FirebaseService;
import com.google.firebase.auth.FirebaseAuth;

public class NewEventActivity extends AppCompatActivity {

    FloatingActionButton registerButton;
    Event event;
    TextInputEditText title, description, date, startTime, endTime, location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);

        title = findViewById(R.id.titleInput);
        description = findViewById(R.id.descriptionInput);
        startTime = findViewById(R.id.startTimeInput);
        endTime = findViewById(R.id.endTimeInput);
        location = findViewById(R.id.locationInput);
        date = findViewById(R.id.dateInput);

        registerButton = findViewById(R.id.registerActionButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                event = new Event();
                event.setTitle(title.getText().toString());
                event.setDescription(description.getText().toString());
                event.setDate(date.getText().toString());
                event.setTimeEnd(endTime.getText().toString());
                event.setTimeStart(startTime.getText().toString());
                event.setLocation(location.getText().toString());

                FirebaseService.publishEvent(event);
            }
        });


    }
}
