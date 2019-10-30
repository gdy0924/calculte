package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bn_jz=(Button)findViewById(R.id.action_jzzh);
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

        bn_jz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,JZhsActivity.class);
                startActivity(intent);
            }
        });

        bn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = editText.getText().toString();
                editText.setText(str1 + bn0.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str2 = editText.getText().toString();
                editText.setText(str2 + bn1.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str3 = editText.getText().toString();
                editText.setText(str3 + bn2.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str4 = editText.getText().toString();
                editText.setText(str4 + bn3.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str5 = editText.getText().toString();
                editText.setText(str5 + bn4.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str6 = editText.getText().toString();
                editText.setText(str6 + bn5.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str7 = editText.getText().toString();
                editText.setText(str7 + bn6.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str8 = editText.getText().toString();
                editText.setText(str8 + bn7.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str9 = editText.getText().toString();
                editText.setText(str9 + bn8.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str10 = editText.getText().toString();
                editText.setText(str10 + bn9.getText().toString());
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
                String str12 = editText.getText().toString();
                editText.setText(str12.substring(0, str12.length() - 1));
                editText.setSelection(editText.getText().length());
            }
        });
        bn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str13 = editText.getText().toString();
                editText.setText(str13 + bn_div.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str14 = editText.getText().toString();
                editText.setText(str14 + bn_mult.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str15 = editText.getText().toString();
                editText.setText(str15 + bn_sub.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str16 = editText.getText().toString();
                editText.setText(str16 + bn_sum.getText().toString());
                editText.setSelection(editText.getText().length());
            }
        });
        bn_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str18 = editText.getText().toString();
                editText.setText(str18 + bn_point.getText().toString());
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

        private String getResult(String temp){
        Stack<String> numStack = new Stack<String>();
        numStack.push("#");
        Stack<String> oprStack = new Stack<String>();
        String[] ss= new String[temp.length()];
        for(int i=0;i<temp.length();i++){
            ss[i] = temp.substring(i, i+1);		}
        for (String s : ss) {
            if (isOpr(s)) {
                linkString(numStack);
                if (oprStack.isEmpty()) {
                    oprStack.push(s);
                } else {
                    while (!oprStack.isEmpty()&&priority(s)<=priority(oprStack.peek())) {
                        linkString(numStack);
                        calculate(numStack, oprStack);
                    }
                    oprStack.push(s);
                }
            }else {
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
    public boolean isOpr(String s){
        if ("+".equals(s)||"-".equals(s)||"×".equals(s)||"÷".equals(s))
        {
            return true;
        }
        return false;
    }		//判断操作符优先级
    public int priority(String s) {
        if ("+".equals(s)||"-".equals(s))
        {
            return 1;
        } else {
            return 2;
        }
    }		//将栈内单字符粘成字符串
    public void linkString(Stack<String> stack) {
        if (stack.peek().equals("#"))
        {			return;
        }
        StringBuilder number = new StringBuilder();
        while (true)
        {
            String s = stack.peek();
            if (s.equals("#"))
            {
                break;
            }
            number.insert(0, s);
            stack.pop();
        }
        stack.push(number.toString());
        stack.push("#");
        number.delete(0, number.length());	}
    //计算运算式
    public void calculate(Stack<String> numStack, Stack<String> oprStack) {
        double res=0;		//弹出右操作数上的#并将其转为double计算
        numStack.pop();
        double rightNum = Double.parseDouble(numStack.pop());
        //弹出左操作数上的#并将其转为double计算
        numStack.pop();
        double leftNum = Double.parseDouble(numStack.pop());
        String opr = oprStack.pop();
        switch(opr){
            case "+": res = leftNum + rightNum;break;
            case "-": res = leftNum - rightNum;break;
            case "×": res = leftNum * rightNum;break;
            case "÷": res = leftNum / rightNum;break;
            default:break;		}				//将计算结果压栈
        numStack.push(String.valueOf(res));
        numStack.push("#");	}



//            private String  GetResult(String temp){
//                String[] dataArray = getDataArray(temp);
//                String[] postfixArray = getPostFix(dataArray);
//                return computeWithPostFix(postfixArray);
//            }
//            private static String[] getDataArray(String temp) {
//                     if (temp == null || "".equals(temp.trim()) || temp.trim().length() < 1) {
//                return null;
//            }
//                int dataLength = temp.length();
//                String[] dataArray = new String[dataLength];// 根据字符串的长度创建数组
//                int top = 0;
//                String numStr = "";
//                for (int i = 0; i < dataLength; i++) {
//                char datai = temp.charAt(i);
//                String num = String.valueOf(datai);
//                if (isNum(num)) {// 数字
//                    numStr += num;
//                         if (i + 1 == dataLength) {
//                             dataArray[top] = numStr;
//                             top++;
//                         }
//                } else {
//                if (!"".equals(numStr)) {// numStr 存在
//                    dataArray[top] = numStr;// 数字存放到结果数组中
//                    numStr = "";// 还原
//                    top++;// 指针下移
//                }
//                // 符号
//                dataArray[top] = num;
//                top++;// 指针下移
//            }
//        }
//        return removeNull(dataArray, top);
//    }
//    /**
//     * 获取后缀表达式
//     *
//     */
//    private static String[] getPostFix(String[] dataArray) {
//        if (dataArray == null || dataArray.length < 1) {
//            return null;
//        }
//        // 1.遍历数组 数字输出
//        // 2.若是符号 则判断和栈顶符号的优先级 是右括号 或者优先级低于栈顶符号(乘除高于加减)则栈顶元素依次出栈 输出 并将当前符号入栈
//        // 3.数组结束 栈内符号依次出栈
//        int dataLength = dataArray.length;
//        Stack<String> dataStack = new Stack<String>();
//        String[] dataBuffer = new String[dataLength];
//        int top = 0;
//        for (int i = 0; i < dataLength; i++) {
//            String datai = dataArray[i];
//            if (isNum(datai)) {// 数字
//                dataBuffer[top] = datai;
//                top++;// 指针下移
//            } else if (isLeftBracket(datai)) {// 左括号
//                dataStack.push(datai);// 压栈
//            } else if (ComputeEnum.isCompute(datai)) {// 运算符
//                List<String> lessThenMeList = getNotLessThenMeta(dataStack,
//                        datai);
//                if (lessThenMeList != null && !lessThenMeList.isEmpty()) {
//                    for (String lessThen : lessThenMeList) {// 小于当前运算符的符号输出
//                        dataBuffer[top] = lessThen;
//                        top++;// 指针下移
//                    }
//                }
//                dataStack.push(datai);// 当前元素入栈
//            } else if (isRightBracket(datai)) {// 右括号 查找到最近左括号之间的所有符号 出栈
//                List<String> betweenLeftBracketList = getBetweenLeftBracketMeta(dataStack);
//                if (betweenLeftBracketList != null
//                        && !betweenLeftBracketList.isEmpty()) {
//                    for (String between : betweenLeftBracketList) {// 小于当前运算符的符号输出
//                        dataBuffer[top] = between;
//                        top++;// 指针下移
//                    }
//                }
//            } else {
//                System.err.println("请注意中英文符号,检查出包含不支持的运算符！");
//                return null;
//            }
//        }
//        while (!dataStack.isEmpty()) {
//            dataBuffer[top] = dataStack.pop();
//            top++;// 指针下移
//        }
//        return removeNull(dataBuffer, top);
//    }
//
//    // 根据后缀表达式计算出结果 并打印
//    private static String computeWithPostFix(String[] postfixArray) {
//        if (postfixArray == null || postfixArray.length < 1) {
//            System.err.println("postfixArray is null !");
//            return "";
//        }
//        // 1.遇到数字则入栈
//        // 2.遇到运算符号 则将栈顶两元素出栈
//        // 3.将运算结果入栈
//        // 4.数组遍历结束 将栈顶元素 取出
//        Stack<String> stack = new Stack<String>();
//        for (String meta : postfixArray) {
//            if (isNum(meta)) {// 数字
//                stack.push(meta);
//            } else if (ComputeEnum.isCompute(meta)) {// 运算符号
//                double pop = Double.parseDouble(stack.pop());
//                double popNext = Double.parseDouble(stack.pop());
//                double result = compute(pop, popNext, meta);
//                stack.push(String.valueOf(result));
//            }
//        }
//        return stack.pop();
//    }
//
//    private static double compute(double pop, double popNext, String meta) {
//        double result = 0;
//        ComputeEnum compute = ComputeEnum.get(meta);
//        switch (compute) {
//            case plus:// 加
//                result = popNext + pop;
//                break;
//            case minus:// 减
//                result = popNext - pop;
//                break;
//            case multiply:// 乘
//                result = popNext * pop;
//                break;
//            case divide:// 除
//                if ((pop < 0.000000001) && (pop > -0.000000001)) {
//                    System.err.println("被除数不能为0！");
//                    break;
//                }
//                result = popNext / pop;
//                break;
//        }
//        return result;
//    }
//
//    private static List<String> getBetweenLeftBracketMeta(
//            Stack<String> dataStack) {
//        if (dataStack == null || dataStack.size() < 1) {
//            return null;
//        }
//        List<String> list = new ArrayList<String>(dataStack.size());
//        while (!dataStack.isEmpty()) {
//            String pop = dataStack.pop();// 栈顶元素出栈
//            if (isLeftBracket(pop)) {
//                break;
//            }
//            list.add(pop);
//        }
//        return list;
//    }
//
//    /**
//     * 取出所有不比自己优先级低的元素
//     *
//     * @param dataStack
//     * @param datai
//     * @return
//     */
//    private static List<String> getNotLessThenMeta(Stack<String> dataStack,
//                                                   String datai) {
//        if (dataStack == null || dataStack.size() < 1) {
//            return null;
//        }
//        ComputeEnum computei = ComputeEnum.get(datai);
//        List<String> list = new ArrayList<String>(dataStack.size());
//        while (!dataStack.isEmpty()) {
//            String pop = dataStack.peek();// 栈顶元素
//            ComputeEnum compute = ComputeEnum.get(pop);
//            if (compute == null) {
//                break;
//            }
//            if (compute.level < computei.level) {
//                break;
//            } else {// 优先级高于当前符号 出栈
//                dataStack.pop();
//                list.add(pop);
//            }
//        }
//        return list;
//    }
//
//    private static String[] removeNull(String[] dataArray, int size) {
//        String[] dataResult = new String[size];
//        System.arraycopy(dataArray, 0, dataResult, 0, dataResult.length);
//        return dataResult;
//    }
//
//    private static boolean isNum(String num) {
//        String reg = "^\\d+$";
//        return Pattern.compile(reg).matcher(num).find();
//    }
//
//    /**
//     * 左括号
//     *
//     * @param num
//     * @return
//     */
//    private static boolean isLeftBracket(String num) {
//        return "(".equals(num);
//    }
//
//    /**
//     * 右括号
//     *
//     * @param num
//     * @return
//     */
//    private static boolean isRightBracket(String num) {
//        return ")".equals(num);
//    }
//}
//
//enum ComputeEnum {
//    plus("+", 0), // 加法
//    minus("-", 0), // 减法
//    multiply("×", 1), // 乘法
//    divide("÷", 1), // 除法
//    ;
//
//    private static Map<String, ComputeEnum> dataMap = new HashMap<String, ComputeEnum>();
//    static {
//        dataMap.put(plus.code, plus);
//        dataMap.put(minus.code, minus);
//        dataMap.put(multiply.code, multiply);
//        dataMap.put(divide.code, divide);
//    }
//    public String code;
//
//    public int level;
//
//    private ComputeEnum(String code, int level) {
//        this.code = code;
//        this.level = level;
//    }
//
//    public static ComputeEnum get(String code) {
//        return dataMap.get(code);
//    }
//
//    public static boolean isCompute(String code) {
//        return dataMap.containsKey(code);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item)
//    {    int id = item.getItemId();
//        //noinspection SimplifiableIfStatement
//        switch (id) {
//            case R.id.action_jzzh:
//                setContentView(R.layout.activity_jzhs);
//                break;
//            case R.id.action_main:
//                setContentView(R.layout.activity_main);
//            case R.id.action_help:
//                Toast.makeText(this, "another", Toast.LENGTH_SHORT).show();
//                break;
//    }
//        return super.onOptionsItemSelected(item);
//    }

}





