package com.jgermaine.fyp.samplesforca;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class SpinnerActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        setupXmlSpinner();
        initJavaSpinner();
    }

    private void initJavaSpinner() {
        List<String> list = new ArrayList<String>();

        // Fill list with enum values
        for (JavaSpinner spinner : JavaSpinner.values()) {
            list.add(spinner.getMessage());
        }

        // Set up adapter for spinner using built in layouts
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        setupJavaSpinner((Spinner) findViewById(R.id.spinner_java), dataAdapter);
    }

    private void setupJavaSpinner(Spinner spinner, ArrayAdapter dataAdapter) {
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(getListener());
    }

    private void setupXmlSpinner() {
        ((Spinner) findViewById(R.id.spinner_xml)).setOnItemSelectedListener(getListener());
    }

    private AdapterView.OnItemSelectedListener getListener() {
        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                showMessage(parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
    }

    private void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_spinner, menu);
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

    public enum JavaSpinner {
        ONE, TWO, THREE, FOUR;

        public String getMessage() {
            String message = "Option: ";

            switch (this) {
                case ONE:
                    message += "Java One";
                    break;
                case TWO:
                    message += "Java Two";
                    break;
                case THREE:
                    message += "Java Three";
                    break;
                case FOUR:
                    message += "Java Four";
                    break;
                default:
                    break;
            }
            return message;
        }
    }
}
