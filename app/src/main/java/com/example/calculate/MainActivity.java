package com.example.calculate;

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
                    if(str.contains("tan")){
                        double a=getTan(str);
                        result=a+"";
                    }else if(str.contains("cos")){
                        double a=getCos(str);
                        result=a+"";
                    }else if(str.contains("sin")){
                        double a=getSin(str);
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
                    String result = getResult(str);
                    editText.setText(str + bn_result.getText().toString() + result);
                    editText.setSelection(editText.getText().length());
                }
            });
        }
    }

    public String getResult (String temp){
        Stack<String> numStack = new Stack<String>();
        numStack.push("#");
        Stack<String> oprStack = new Stack<String>();
        String[] ss = new String[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            ss[i] = temp.substring(i, i + 1);
        }
        for (String s : ss) {
            if (isOpr(s)) {
                linkString(numStack);
                if (oprStack.isEmpty()) {
                    oprStack.push(s);
                } else {
                    while (!oprStack.isEmpty() && priority(s) <= priority(oprStack.peek())) {
                        linkString(numStack);
                        calculate(numStack, oprStack);
                    }
                    oprStack.push(s);
                }
            } else {
                numStack.push(s);
            }
        }
        while (!oprStack.isEmpty()) {
            linkString(numStack);
            calculate(numStack, oprStack);
        }
        numStack.pop();
        return numStack.peek();
    }

    public boolean isOpr (String s){
        if ("+".equals(s) || "-".equals(s) || "×".equals(s) || "÷".equals(s)) {
            return true;
        }
        return false;
    }

    //判断操作符优先级
    public int priority (String s){
        if ("+".equals(s) || "-".equals(s)) {
            return 1;
        } else {
            return 2;
        }
    }

    //将栈内单字符粘成字符串
    public void linkString (Stack < String > stack) {
        if (stack.peek().equals("#")) {
            return;
        }
        StringBuilder number = new StringBuilder();
        while (true) {
            String s = stack.peek();
            if (s.equals("#")) {
                break;
            }
            number.insert(0, s);
            stack.pop();
        }
        stack.push(number.toString());
        stack.push("#");
        number.delete(0, number.length());
    }

    //计算运算式
    public void calculate (Stack < String > numStack, Stack < String > oprStack){
        double res = 0;        //弹出右操作数上的#并将其转为double计算
        numStack.pop();
        double rightNum = Double.parseDouble(numStack.pop());
        //弹出左操作数上的#并将其转为double计算
        numStack.pop();
        double leftNum = Double.parseDouble(numStack.pop());
        String opr = oprStack.pop();
        switch (opr) {
            case "+":
                res = leftNum + rightNum;
                break;
            case "-":
                res = leftNum - rightNum;
                break;
            case "×":
                res = leftNum * rightNum;
                break;
            case "÷":
                res = leftNum / rightNum;
                break;
            default:
                break;
        }                //将计算结果压栈
        numStack.push(String.valueOf(res));
        numStack.push("#");
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
                intent2.setClass(MainActivity.this, DWhsActivity.class);
                startActivity(intent2);
                MainActivity.this.finish();
                break;
            case R.id.action_help:
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("这是帮助")//显示的消息内容
                .setTitle("HELP");//对话框标题
//                builder.setPositiveButton("确定", new DialogInterface().OnClickListener(){
//                    @Override
//                    public void onClick(DialogInterface dialog, int which){
//                    Toast.makeText(MainActivity.this, "用户按下了确认按钮", Toast.LENGTH_LONG).show();
//                }
//                });
            builder.show();
                break;
            case R.id.action_back:
                MainActivity.this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    public static String getresult(String s){
        List<String>  str=expressionToList(s);
        List<String>  str1=parseToSuffixExpression(str);
        int results=GetResult(str1);
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
        return num.matches("\\d+");
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
            if(ch < 47 || ch > 58){
                index ++ ;
                list.add(ch+"");
            }else if(ch >= 47 && ch <= 58){
                String str = "";
                while (index < expression.length() && expression.charAt(index) >=47 && expression.charAt(index) <= 58){
                    str += expression.charAt(index);
                    index ++;
                }
                list.add(str);
            }
        }while (index < expression.length());
        return list;
    }


    private static int GetResult(List<String> list) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<list.size(); i++){
            String item = list.get(i);
            if(item.matches("\\d+")){
                stack.push(Integer.parseInt(item));
            }else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                int res = 0;
                if(item.equals("+")){
                    res = num1 + num2;
                }else if(item.equals("-")){
                    res = num1 - num2;
                }else if(item.equals("×")){
                    res = num1 * num2;
                }else if(item.equals("÷")){
                    res = num1 / num2;
                }else {
                    throw new RuntimeException ("运算符错误！");
                }
                stack.push(res);
            }
        }
        return stack.pop();
    }

}





