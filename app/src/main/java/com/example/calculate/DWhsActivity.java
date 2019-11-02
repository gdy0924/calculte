package com.example.calculate;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DWhsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwhs);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final Button bn0 = (Button) findViewById(R.id.button0);
        final Button bn1 = (Button) findViewById(R.id.button1);
        final Button bn2 = (Button) findViewById(R.id.button2);
        final Button bn3 = (Button) findViewById(R.id.button3);
        final Button bn4 = (Button) findViewById(R.id.button4);
        final Button bn5 = (Button) findViewById(R.id.button5);
        final Button bn6 = (Button) findViewById(R.id.button6);
        final Button bn7 = (Button) findViewById(R.id.button7);
        final Button bn8 = (Button) findViewById(R.id.button8);
        final Button bn9 = (Button) findViewById(R.id.button9);
        final Button bn_clear = (Button) findViewById(R.id.button_clear);
        final Button bn_del = (Button) findViewById(R.id.button_del);
        final Button bn_m = (Button) findViewById(R.id.button_m);
        final Button bn_cm = (Button) findViewById(R.id.button_cm);
        final Button bn_nm = (Button) findViewById(R.id.button_nm);
        final Button bn_km = (Button) findViewById(R.id.button_km);
        final Button bn_mm = (Button) findViewById(R.id.button_mm);
        final Button bn_lfm = (Button) findViewById(R.id.button_lfm);
        final Button bn_lflm = (Button) findViewById(R.id.button_lflm);
        final Button bn_lffm = (Button) findViewById(R.id.button_lffm);
        final Button bn_l = (Button) findViewById(R.id.button_l);
        final Button bn_ml = (Button) findViewById(R.id.button_ml);
        final Button bn_blank = (Button) findViewById(R.id.button_blank);
        final Button bn_result = (Button) findViewById(R.id.button_result);
        final EditText editText = (EditText) findViewById(R.id.edit_text);

        bn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn0.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn1.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn2.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn3.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn4.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn5.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn6.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn7.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn8.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn9.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn_blank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + "  ");
                editText.setSelection(editText.getText().length());
            }
        });
        bn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "";
                editText.setText(str);
                editText.setSelection(editText.getText().length());
            }
        });
        bn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str.substring(0, str.length() - 1));
                editText.setSelection(editText.getText().length());
            }
        });

        bn_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn_m.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn_cm.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn_mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn_mm.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });


        bn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        switch (id) {
            case R.id.action_main:
                Intent intent1 = new Intent();
                intent1.setClass(DWhsActivity.this, MainActivity.class);
                startActivity(intent1);
                DWhsActivity.this.finish();
                break;
            case R.id.action_help:
                Toast.makeText(this, "这是帮助。", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_jzhs:
                Intent intent2 = new Intent();
                intent2.setClass(DWhsActivity.this, JZhsActivity.class);
                startActivity(intent2);
                DWhsActivity.this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
