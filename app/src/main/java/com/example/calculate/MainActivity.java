package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button bn1=(Button)findViewById(R.id.button1);
        final Button bn2=(Button)findViewById(R.id.button2);
        final Button bn3=(Button)findViewById(R.id.button3);
        final  Button bn4=(Button)findViewById(R.id.button4);
        final Button bn5=(Button)findViewById(R.id.button5);
        final  Button bn6=(Button)findViewById(R.id.button6);
        final Button bn7=(Button)findViewById(R.id.button7);
        final Button bn8=(Button)findViewById(R.id.button8);
        final Button bn9=(Button)findViewById(R.id.button9);
        final Button bn10=(Button)findViewById(R.id.button10);
        final Button bn11=(Button)findViewById(R.id.button11);
        final Button bn12=(Button)findViewById(R.id.button12);
        final Button bn13=(Button)findViewById(R.id.button13);
        final  Button bn14=(Button)findViewById(R.id.button14);
        final Button bn15=(Button)findViewById(R.id.button15);
        final Button bn16=(Button)findViewById(R.id.button16);
        final Button bn17=(Button)findViewById(R.id.button17);
        final  Button bn18=(Button)findViewById(R.id.button18);
        final Button bn19=(Button)findViewById(R.id.button19);
        final EditText editText=(EditText)findViewById(R.id.edit_text);

        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=" ";
                editText.setText(str1);
                editText.setSelection(editText.getText().length());
                }
            });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str2=editText.getText().toString();
                editText.setText(str2.substring(0,str2.length()-1));
                editText.setSelection(editText.getText().length());
            }
        });
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str3=editText.getText().toString();
                editText.setText(str3+bn3.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str4=editText.getText().toString();
                editText.setText(str4+bn4.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str5=editText.getText().toString();
                editText.setText(str5+bn5.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str6=editText.getText().toString();
                editText.setText(str6+bn6.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str7=editText.getText().toString();
                editText.setText(str7+bn7.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str8=editText.getText().toString();
                editText.setText(str8+bn8.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str9=editText.getText().toString();
                editText.setText(str9+bn9.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str10=editText.getText().toString();
                editText.setText(str10+bn10.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str11=editText.getText().toString();
                editText.setText(str11+bn11.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str12=editText.getText().toString();
                editText.setText(str12+bn12.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str13=editText.getText().toString();
                editText.setText(str13+bn13.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str14=editText.getText().toString();
                editText.setText(str14+bn14.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str15=editText.getText().toString();
                editText.setText(str15+bn15.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str16=editText.getText().toString();
                editText.setText(str16+bn16.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str17=editText.getText().toString();
                editText.setText(str17+bn17.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str18=editText.getText().toString();
                editText.setText(str18+bn18.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
