package com.jgermaine.fyp.samplesforca;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void toCheckBox(View view) {
        toActivity(CheckboxActivity.class);
    }

    public void toRadio(View view) {
        toActivity(RadioActivity.class);
    }

    public void toSpinner(View view) {
        toActivity(SpinnerActivity.class);
    }

    public void toTableForm(View view) {
        toActivity(TableForm.class);
    }

    public void toScrollView(View view) {
        toActivity(ScrollViewActivity.class);
    }

    private void toActivity(Class clazz) {
        Intent intent = new Intent(getApplicationContext(), clazz);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
