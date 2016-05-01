package com.example.administrator.snrurun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SignUp extends AppCompatActivity {
    private EditText nameEditText, userEditText, passwordEditText;
    private RadioGroup radioGroup;
    private RadioButton choice1radioButton,choice2RadioButton,choice3RadioButton,choice4RadioButton, choice5RadioButton;
    private String nameString,userString,passwordString, avatarString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        bindWidget();
    }

    private void bindWidget() {
        nameEditText = (EditText) findViewById(R.id.editText);
        userEditText = (EditText) findViewById(R.id.editText2);
        passwordEditText = (EditText) findViewById(R.id.editText3);
        radioGroup = (RadioGroup) findViewById(R.id.ragAvatar);
        choice1radioButton = (RadioButton) findViewById(R.id.radioButton);
        choice2RadioButton = (RadioButton) findViewById(R.id.radioButton2);
        choice3RadioButton = (RadioButton) findViewById(R.id.radioButton3);
        choice4RadioButton = (RadioButton) findViewById(R.id.radioButton4);
        choice5RadioButton = (RadioButton) findViewById(R.id.radioButton5);
    }

    public void clickSignUpSign(View view) {

        //Get Value From EditText
        nameString = nameEditText.getText().toString().trim();
        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Check Space
        if (nameString.equals("") ||userString.equals("") || passwordString.equals("") ) {

            MyAlert myAlert = new MyAlert();
            myAlert.myDialog(this,"มีช่องว่าง","กรุณากรอกทุกช่อง");
        } else {

        }


    }
}
