package com.example.calculate;
import java.util.ArrayList;
import java.util.List;
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

public class JZhsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jzhs);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        final Button bn0=(Button)findViewById(R.id.button0);
        final Button bn1=(Button)findViewById(R.id.button1);
        final Button bn2=(Button)findViewById(R.id.button2);
        final Button bn3=(Button)findViewById(R.id.button3);
        final Button bn4=(Button)findViewById(R.id.button4);
        final Button bn5=(Button)findViewById(R.id.button5);
        final Button bn6=(Button)findViewById(R.id.button6);
        final Button bn7=(Button)findViewById(R.id.button7);
        final Button bn8=(Button)findViewById(R.id.button8);
        final Button bn9=(Button)findViewById(R.id.button9);
        final Button bnA=(Button)findViewById(R.id.buttonA);
        final Button bnB=(Button)findViewById(R.id.buttonB);
        final Button bnC=(Button)findViewById(R.id.buttonC);
        final Button bnD=(Button)findViewById(R.id.buttonD);
        final Button bnE=(Button)findViewById(R.id.buttonE);
        final Button bnF=(Button)findViewById(R.id.buttonF);
        final Button bn_del=(Button)findViewById(R.id.button_del);
        final Button bn_clear=(Button)findViewById(R.id.button_clear);
        final Button bn_left=(Button)findViewById(R.id.button_left);
        final Button bn_right=(Button)findViewById(R.id.button_right);
        final Button bn_result=(Button)findViewById(R.id.button_result);
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
        bnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bnA.getText().toString());
                editText.setSelection(editText.getText().length());

            }
        });

        bnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bnB.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bnC.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bnD.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bnE.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bnF.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str11 = "";
                editText.setText(str11);
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
        bn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn_left.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                editText.setText(str + bn_right.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                String result=getResult(str);
                editText.setText(str + bn_result.getText().toString() + result);
                editText.setSelection(editText.getText().length());
            }
        });
    }
        public String getResult(String s){
            List<String> list =getList(s);
            int a=getTen(list.get(0),list.get(1));
            String b=getNum(a,list.get(2));
            String c=b.toUpperCase();
            return c;
        }
    public static List<String> getList(String s) {
        List<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        boolean isChar = false;
        if (s != null && s.length() != 0) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if ((c >= '0' && c <= '9')||(c>='A'&&c<='F')) {
                    sb.append(s.charAt(i));
                    if (i == s.length() - 1) {
                        //list.add(Integer.parseInt(sb.toString()));
                        list.add(sb.toString());
                        sb.setLength(0);
                    }
                    isChar = false;
                } else {
                    if (sb.length() > 0 && isChar == false) {
                        //list.add(Integer.parseInt(sb.toString()));
                        list.add(sb.toString());
                        sb.setLength(0);
                    }
                    isChar = true;
                }
            }

        }
        return list;
    }

    public static int getTen(String a,String b) {
        int bb=Integer.parseInt(b);
        int result=0;
        if(bb==10) {
            result=Integer.parseInt(a);
        }else if(bb==2) {
            result=Integer.parseInt(a,2);
        }else if(bb==8) {
            result=Integer.parseInt(a,8);
        }else if(bb==16) {
            result= (int) Long.parseLong(a, 16);
        }
        return result;
    }

    public static String getNum(int a,String b) {
        String result="";
        int bb=Integer.parseInt(b);
        if(bb==2) {
            result=Integer.toBinaryString(a);
        }else if(bb==8) {;
            result=Integer.toOctalString(a);
        }else if(bb==10) {
            result=a+"";
        }else if(bb==16) {
            result=Integer.toHexString(a);
        }
        return result;
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
                intent1.setClass(JZhsActivity.this, MainActivity.class);
                startActivity(intent1);
                JZhsActivity.this.finish();
                break;
            case R.id.action_help:
                Toast.makeText(this, "这是帮助。", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_dwhs:
                Intent intent2 = new Intent();
                intent2.setClass(JZhsActivity.this, DWhsActivity.class);
                startActivity(intent2);
                JZhsActivity.this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
