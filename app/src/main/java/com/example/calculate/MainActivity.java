package com.example.calculate;

import java.math.BigDecimal;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Toast;


import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.land);
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
            final Button bn_div = (Button) findViewById(R.id.button_div);
            final Button bn_mult = (Button) findViewById(R.id.button_mult);
            final Button bn_sub = (Button) findViewById(R.id.button_sub);
            final Button bn_sum = (Button) findViewById(R.id.button_sum);
            final Button bn_left = (Button) findViewById(R.id.button_left);
            final Button bn_right = (Button) findViewById(R.id.button_right);
            final Button bn_tan = (Button) findViewById(R.id.button_tan);
            final Button bn_cos = (Button) findViewById(R.id.button_cos);
            final Button bn_sin = (Button) findViewById(R.id.button_sin);
            final Button bn_PI = (Button) findViewById(R.id.button_PI);
            final Button bn_yu = (Button) findViewById(R.id.button_yu);
            final Button bn_jiecheng = (Button) findViewById(R.id.button_jiecheng);
            final Button bn_daoshu = (Button) findViewById(R.id.button_doshu);
            final Button bn_pingfang = (Button) findViewById(R.id.button_pingfang);
            final Button bn_sancifang = (Button) findViewById(R.id.button_sancifang);
            final Button bn_genhao = (Button) findViewById(R.id.button_genhao);
            final Button bn_ln = (Button) findViewById(R.id.button_ln);
            final Button bn_log = (Button) findViewById(R.id.button_log);
            final Button bn_point = (Button) findViewById(R.id.button_point);
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
            bn_div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_div.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_mult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_mult.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_sub.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_sum.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_sum.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_result.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    String result=null;
                    if(str.contains("tan")&&str.contains("Π")==false){
                        double a=getTan(str);
                        result=a+"";
                    }else if(str.contains("cos")&&str.contains("Π")==false){
                        double a=getCos(str);
                        result=a+"";
                    }else if(str.contains("sin")&&str.contains("Π")==false){
                        double a=getSin(str);
                        result=a+"";
                    }else if(str.contains("tan")&&str.contains("Π")){
                        double a=getTanPI(str);
                        result=a+"";
                    }else if(str.contains("cos")&&str.contains("Π")){
                        double a=getCosPI(str);
                        result=a+"";
                    }else if(str.contains("sin")&&str.contains("Π")){
                        double a=getSinPI(str);
                        result=a+"";
                    }else if(str.contains("²")){
                        double a=getPingfang(str);
                        result=a+"";
                    }else if(str.contains("³")){
                        double a=getSancifang(str);
                        result=a+"";
                    }else if(str.contains("ln")){
                        double a=getln(str);
                        result=a+"";
                    }else if(str.contains("log")){
                        double a=getlog(str);
                        result=a+"";
                    }else if(str.contains("√")){
                        double a=getGenhao(str);
                        result=a+"";
                    }else if(str.contains("!")){
                        double a=getJiecheng(str);
                        result=a+"";
                    }else if(str.contains("%")){
                        double a=getYu(str);
                        result=a+"";
                    }else if(str.contains("1/")){
                        double a=getDaoshu(str);
                        result=a+"";
                    }else {
                        result=getresult(str);
                    }
                    editText.setText(str + bn_result.getText().toString() + result);
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
            bn_sin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_sin.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_cos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_cos.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_tan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_tan.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_PI.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_PI.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_yu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_yu.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_jiecheng.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str +"!");
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_daoshu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str +"1/");
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_pingfang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str +"²");
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_sancifang.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str +"³");
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_genhao.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str +"√");
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_ln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_ln.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_log.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_log.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_point.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_point.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });

        }else{
            setContentView(R.layout.activity_main);
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
            final Button bn_div = (Button) findViewById(R.id.button_div);
            final Button bn_mult = (Button) findViewById(R.id.button_mult);
            final Button bn_sub = (Button) findViewById(R.id.button_sub);
            final Button bn_sum = (Button) findViewById(R.id.button_sum);
            final Button bn_result = (Button) findViewById(R.id.button_result);
            final Button bn_point = (Button) findViewById(R.id.button_point);
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
            bn_div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_div.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_mult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_mult.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_sub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_sub.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_sum.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_sum.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_point.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    editText.setText(str + bn_point.getText().toString());
                    editText.setSelection(editText.getText().length());
                }
            });
            bn_result.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String str = editText.getText().toString();
                    String result = getresult(str);
                    editText.setText(str + bn_result.getText().toString() + result);
                    editText.setSelection(editText.getText().length());
                }
            });
        }
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
            case R.id.action_jzhs:
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, JZhsActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
                break;
            case R.id.action_dwhs:
                Intent intent2 = new Intent();
                intent2.setClass(MainActivity.this, DWActivity.class);
                startActivity(intent2);
                MainActivity.this.finish();
                break;
            case R.id.action_help:
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("这是帮助");
                builder.setTitle("HELP");
                builder.show();
                break;
            case R.id.action_back:
                MainActivity.this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public static List<String> getList(String s) {
        List<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        boolean isChar = false;
        if (s != null && s.length() != 0) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if ((c >= '0' && c <= '9')) {
                    sb.append(s.charAt(i));
                    if (i == s.length() - 1) {
                        list.add(sb.toString());
                        sb.setLength(0);
                    }
                    isChar = false;
                } else {
                    if (sb.length() > 0 && isChar == false) {
                        list.add(sb.toString());
                        sb.setLength(0);
                    }
                    isChar = true;
                }
            }
        }
        return list;
    }

    public double getCos(String s){
        List<String> str=getList(s);
        double a=Double.parseDouble(str.get(0));
        double result=Math.cos(Math.toRadians(a));
        return result;
    }
    public double getTan(String s){
        List<String> str=getList(s);
        double a=Double.parseDouble(str.get(0));
        double result=Math.tan(Math.toRadians(a));
        return result;
    }
    public double getSin(String s){
        List<String> str=getList(s);
        double a=Double.parseDouble(str.get(0));
        double result=Math.sin(Math.toRadians(a));
        return result;
    }

    public double getCosPI(String s){
        List<String> str=getList(s);
        double a=Double.parseDouble(str.get(0));
        double result=Math.cos(Math.PI/a);
        return result;
    }
    public double getTanPI(String s){
        List<String> str=getList(s);
        double a=Double.parseDouble(str.get(0));
        double result=Math.tan(Math.PI/a);
        return result;
    }
    public double getSinPI(String s){
        List<String> str=getList(s);
        double a=Double.parseDouble(str.get(0));
        double result=Math.sin(Math.PI/a);
        return result;
    }

    public double getPingfang(String s){
        List<String> str=getList(s);
        double a=Double.parseDouble(str.get(0));
        double result=a*a;
        return result;
    }

    public double getSancifang(String s){
        List<String> str=getList(s);
        double a=Double.parseDouble(str.get(0));
        double result=a*a*a;
        return result;
    }

    public double getGenhao(String s){
        List<String> str=getList(s);
        double a=Double.parseDouble(str.get(0));
        double result=Math.sqrt(a);
        return result;
    }

    public double getDaoshu(String s){
        List<String> str=getList(s);
        double a=Double.parseDouble(str.get(1));
        double result=1/a;
        return result;
    }

    public double getln(String s){
        List<String> str=getList(s);
        double a=Double.parseDouble(str.get(0));
        double result=Math.log(a);
        return result;
    }

    public double getlog(String s){
        List<String> str=getList(s);
        double a=Double.parseDouble(str.get(0));
        double b=Double.parseDouble(str.get(1));
        double result=Math.log(b) / Math.log(a);
        return  result;
    }

    public double getJiecheng(String s){
        List<String> str=getList(s);
        int a= Integer.parseInt(str.get(0));
        int b=1;
        for(int i=1;i<=a;i++)
        {
            b*=i;
        }
        double result=(double)b;
        return result;
    }

    public double getYu(String s){
        List<String> str=getList(s);
        double a=Double.parseDouble(str.get(0));
        double result=a/100;
        return result;
    }


    public static String getresult(String s){
        List<String>  str=expressionToList(s);
        List<String>  str1=parseToSuffixExpression(str);
        BigDecimal results=GetResult(str1);
        String result=results+"";
        return result;
    }

    private static List<String> parseToSuffixExpression(List<String> expressionList) {
        Stack<String> opStack = new Stack<>();
        List<String> suffixList = new ArrayList<>();
        for(String item : expressionList){
            if(isOperator(item)){
                if(opStack.isEmpty() || "(".equals(opStack.peek()) || Priority(item) > Priority(opStack.peek())){
                    opStack.push(item);
                }else {
                    while (!opStack.isEmpty() && !"(".equals(opStack.peek())){
                        if(Priority(item) <= Priority(opStack.peek())){
                            suffixList.add(opStack.pop());
                        }
                    }
                    opStack.push(item);
                }
            }else if(isNumber(item)){
                suffixList.add(item);
            }else if("(".equals(item)){
                opStack.push(item);
            }else if(")".equals(item)){
                while (!opStack.isEmpty()){
                    if("(".equals(opStack.peek())){
                        opStack.pop();
                        break;
                    }else {
                        suffixList.add(opStack.pop());
                    }
                }
            }else {
                throw new RuntimeException("有非法字符！");
            }
        }
        while (!opStack.isEmpty()){
            suffixList.add(opStack.pop());
        }
        return suffixList;
    }


    public static boolean isOperator(String op){
        return op.equals("+") || op.equals("-") || op.equals("×") || op.equals("÷");
    }

    public static boolean isNumber(String num){
        if(num.contains("+")==false&&num.contains("-")==false&&num.contains("×")==false&&num.contains("÷")==false&&num.contains("(")==false&&num.contains(")")==false)
            return true;
        else
            return false;
    }


    public static int Priority(String op){
        if(op.equals("×") || op.equals("÷")){
            return 1;
        }else if(op.equals("+") || op.equals("-")){
            return 0;
        }
        return -1;
    }

    private static List<String> expressionToList(String expression) {
        int index = 0;
        List<String> list = new ArrayList<>();
        do{
            char ch = expression.charAt(index);
            if(ch < 46 || ch > 58){
                index ++ ;
                list.add(ch+"");
            }else if(ch >= 46 && ch <= 58){
                String str = "";
                while (index < expression.length() && expression.charAt(index) >=46 && expression.charAt(index) <= 58){
                    str += expression.charAt(index);
                    index ++;
                }
                list.add(str);
            }
        }while (index < expression.length());
        return list;
    }


    private static BigDecimal GetResult(List<String> list) {
        Stack<BigDecimal> stack = new Stack<>();
        for(int i=0; i<list.size(); i++){
            String item = list.get(i);
            if(isNumber(item)){
                stack.push(new BigDecimal(item));
            }else {
                BigDecimal num2 = stack.pop();
                BigDecimal num1 = stack.pop();
                BigDecimal res = null;
                if(item.equals("+")){
                    res = num2.add(num1);
                }else if(item.equals("-")){
                    res = num1.subtract(num2);
                }else if(item.equals("×")){
                    res = num1.multiply(num2);
                }else if(item.equals("÷")){
                    res = num1.divide(num2);
                }else {
                    throw new RuntimeException ("运算符错误！");
                }
                stack.push(res);
            }
        }
        return stack.pop();
    }

}





