package com.example.schoolmanagementsystem_student;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class studentdetails extends AppCompatActivity {
    private ImageButton StudentInfo,StudentAcc,StudentRotune;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentdetails);
        StudentInfo= findViewById(R.id.student_info);
        StudentAcc = findViewById(R.id.student_accadimic);
        StudentRotune = findViewById(R.id.student_rotune);


    }
}
