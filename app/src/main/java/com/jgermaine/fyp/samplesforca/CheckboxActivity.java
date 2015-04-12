package com.jgermaine.fyp.samplesforca;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;


public class CheckboxActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
    }


    /**
     * For a single specific checkbox action
     * @param view
     */
    public void onSingleCheckboxClick(View view) {
        String message = "Checkbox one is ";
        if (((CheckBox) view).isChecked()) {
            message += "checked!";
        } else {
            message += "unchecked!";
        }
        showMessage(message);
    }

    /**
     * Common method for multiple checkboxes
     * @param view
     */
    public void onCheckboxClick(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String message = "Checkbox ";
        switch (view.getId()) {
            case R.id.sample_checkbox2:
                message += "two is ";
                if (checked) {
                    message += "checked!";
                } else {
                    message += "unchecked!";
                }
                break;
            case R.id.sample_checkbox3:
                message += "three is ";
                if (checked) {
                    message += "checked!";
                } else {
                    message += "unchecked!";
                }
                break;
            default:
                break;
        }
        showMessage(message);
    }

    private void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_checkbox, menu);
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
