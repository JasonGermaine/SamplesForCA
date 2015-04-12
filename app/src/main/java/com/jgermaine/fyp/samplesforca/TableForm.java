package com.jgermaine.fyp.samplesforca;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class TableForm extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_form);
    }

    public void submitForm(View view) {
        String name = ((EditText) findViewById(R.id.formName)).getText().toString();
        String number = ((EditText) findViewById(R.id.formNumber)).getText().toString();
        String password = ((EditText) findViewById(R.id.formPassword)).getText().toString();

        String message = "Submitted:";

        if (isNotNullOrEmpty(name)) {
            message += "\nName: " + name;
        }

        if (isNotNullOrEmpty(number)) {
            message += "\nNumber: " + number;
        }

        if (isNotNullOrEmpty(password)) {
            message += "\nPassword: " + password;
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


    private boolean isNotNullOrEmpty(String value) {
        return value != null && !value.isEmpty();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_table_form, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
