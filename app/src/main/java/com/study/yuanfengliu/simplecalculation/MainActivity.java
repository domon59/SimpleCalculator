package com.study.yuanfengliu.simplecalculation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

import static java.lang.Float.parseFloat;

public class MainActivity extends AppCompatActivity {



    private float valueOne ;
    private float valueTwo;

    private DecimalFormat decimalFormat;

    private Button num0, num1, num2, num3, num4, num5, num6, num7, num8, num9,point;
    private Button add, substract, multiple, divide;
    private Button clear, change, percent, equal;
    private TextView result;
    private boolean mAddition, mSubctraction, mMutiple, mDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num0 = (Button) findViewById(R.id.txt0);
        num1 = (Button) findViewById(R.id.txt1);
        num2 = (Button) findViewById(R.id.txt2);
        num3 = (Button) findViewById(R.id.txt3);
        num4 = (Button) findViewById(R.id.txt4);
        num5 = (Button) findViewById(R.id.txt5);
        num6 = (Button) findViewById(R.id.txt6);
        num7 = (Button) findViewById(R.id.txt7);
        num8 = (Button) findViewById(R.id.txt8);
        num9 = (Button) findViewById(R.id.txt9);
        point = (Button) findViewById(R.id.txtspl);

        add = (Button) findViewById(R.id.add);
        substract = (Button) findViewById(R.id.minus);
        multiple = (Button) findViewById(R.id.multiple);
        divide = (Button) findViewById(R.id.divide);
        clear = (Button) findViewById(R.id.ac);
        change = (Button) findViewById(R.id.chars);
        percent = (Button) findViewById(R.id.percent);
        equal = (Button) findViewById(R.id.equal);

        result = (TextView) findViewById(R.id.show_result);



        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText() + "0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result == null){
                    result.setText(" ");
                }
                else{
                    valueOne = parseFloat(result.getText()+ " ");
                    mAddition = true;
                    result.setText(null);


                }
            }
        });

        substract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    valueOne = parseFloat(result.getText()+ " ");
                    mSubctraction = true;
                    result.setText(null);

            }
        });

        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = parseFloat(result.getText()+ " ");
                mMutiple = true;
                result.setText(null);
            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = parseFloat(result.getText()+ " ");
                mDivision= true;
                result.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = parseFloat(result.getText() + " ");
                if(mAddition==true){
                    result.setText(valueOne + valueTwo +" ");
                    mAddition=false;
                }

                if(mSubctraction==true){
                    result.setText(valueOne-valueTwo+ " ");
                    mSubctraction = false;
                }

                if(mMutiple == true){
                    result.setText(valueOne * valueTwo+ " ");
                    mMutiple = false;
                }
                if(mDivision == true){
                    result.setText(valueOne/valueTwo + " ");
                    mDivision = false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(" ");
            }
        });

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = parseFloat(result.getText()+ " ");
                result.setText((0-valueOne) + " ");
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = parseFloat(result.getText() + " ");
                result.setText((valueOne/100) + " ");
            }
        });



    }

//    private void calculate(){
//        if(!Double.isNaN(valueOne)){
//            valueTwo = Double.parseDouble(process.getText().toString());
//            process.setText(null);
//            if(CURRENT_ACTION == ADDITION){
//                valueOne = this.valueOne + valueTwo;
//            }
//            else if(CURRENT_ACTION == SUBCTRACTION){
//                valueOne = this.valueOne - valueTwo;
//            }
//            else if(CURRENT_ACTION == MULTIPLICATION){
//                valueOne = this.valueOne * valueTwo;
//            }
//            else if(CURRENT_ACTION == DIVISION){
//                valueOne = this.valueOne / valueTwo;
//            }
//        }else{
//            try{
//                valueOne = Double.parseDouble(process.getText().toString());
//            }
//            catch (Exception e){}
//
//        }
//
//
//    }
}
