package com.example.mycontactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToggleButton();
        setForEditing(false);
    }
    private void initToggleButton(){
        ToggleButton toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                setForEditing(toggleButton.isChecked());
            }
        });

    }



    private void setForEditing(boolean enabled){
        EditText editContact = findViewById(R.id.editContact);
        EditText editAddress = findViewById(R.id.editAddress);
        EditText editCity = findViewById(R.id.editCity);
        EditText editState = findViewById(R.id.editState);
        EditText editZipCode = findViewById(R.id.editZipcode);
        EditText editHome = findViewById(R.id.editHomePhone);
        EditText editCell = findViewById(R.id.editCellPhone);
        EditText editEmail = findViewById(R.id.editEmail);
        Button buttonSave = findViewById(R.id.buttonSave);
        Button buttonChange = findViewById(R.id.buttonChange);

        editContact.setEnabled(enabled);
        editAddress.setEnabled(enabled);
        editCity.setEnabled(enabled);
        editState.setEnabled(enabled);
        editZipCode.setEnabled(enabled);
        editHome.setEnabled(enabled);
        editCell.setEnabled(enabled);
        editEmail.setEnabled(enabled);
        buttonChange.setEnabled(enabled);
        buttonSave.setEnabled(enabled);



    }
}