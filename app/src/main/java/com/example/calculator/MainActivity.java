package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Double first, second;
    private Boolean isOperationClick;
    private String sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_clear:
                textView.setText("0");

            case R.id.btn_zero:
                if(textView.getText().toString().equals("0")){
                    textView.setText("0");
                }else if (isOperationClick) {
                    textView.setText("0");
                }else{
                    textView.append("0");
                }
                isOperationClick = false;
                break;

            case R.id.btn_one:
                if(textView.getText().toString().equals("0")){
                    textView.setText("1");
                }else if (isOperationClick) {
                    textView.setText("1");
                }else{
                    textView.append("1");
                }
                isOperationClick = false;

                break;
            case R.id.btn_two:
                if(textView.getText().toString().equals("0")){
                    textView.setText("2");
                }else if (isOperationClick) {
                    textView.setText("2");
                }else{
                    textView.append("2");
                }
                isOperationClick = false;

                break;
            case R.id.btn_three:
                if(textView.getText().toString().equals("0")){
                    textView.setText("3");
                }else if (isOperationClick) {
                    textView.setText("3");
                }else{
                    textView.append("3");
                }
                isOperationClick = false;

                break;
            case R.id.btn_four:
                if(textView.getText().toString().equals("0")){
                    textView.setText("4");
                }else if (isOperationClick) {
                    textView.setText("4");
                }else{
                    textView.append("4");
                }
                isOperationClick = false;

                break;
            case R.id.btn_five:
                if(textView.getText().toString().equals("0")){
                    textView.setText("5");
                }else if (isOperationClick) {
                    textView.setText("5");
                }else{
                    textView.append("5");
                }
                isOperationClick = false;

                break;
            case R.id.btn_six:
                if(textView.getText().toString().equals("0")){
                    textView.setText("6");
                }else if (isOperationClick) {
                    textView.setText("6");
                }else{
                    textView.append("6");
                }
                isOperationClick = false;

                break;
            case R.id.btn_seven:
                if(textView.getText().toString().equals("0")){
                    textView.setText("7");
                }else if (isOperationClick) {
                    textView.setText("7");
                }else{
                    textView.append("7");
                }
                isOperationClick = false;

                break;
            case R.id.btn_eight:
                if(textView.getText().toString().equals("0")){
                    textView.setText("8");
                }else if (isOperationClick) {
                    textView.setText("8");
                }else{
                    textView.append("8");
                }
                isOperationClick = false;

                break;
            case R.id.btn_nine:
                isOperationClick = false;
                if(textView.getText().toString().equals("0")){
                    textView.setText("9");
                }else if (isOperationClick) {
                    textView.setText("9");
                }else{
                    textView.append("9");
                }
                isOperationClick = false;

                break;
        }

    }

    public void onOperationClick(View view) {
        Double result = Double.valueOf(0);
        switch (view.getId()){
            case R.id.btn_equal:
                secondVariable();
                switch (sign){
                    case "+":
                        result = first + second;
                        textView.setText(result.toString());
                        break;
                    case "-":
                        result = first - second;
                        textView.setText(result.toString());
                        break;
                    case "*":
                        result = first * second;
                        textView.setText(result.toString());
                        break;
                    case "/":
                        result = first / second;
                        textView.setText(result.toString());
                        break;
                }
                break;
            case R.id.btn_plus:
                sign = "+";
                firstVariable();
                isOperationClick = true;
                break;
            case R.id.btn_subtraction:
                sign = "-";
                firstVariable();
                isOperationClick = true;
                break;
            case R.id.btn_multiplication:
                sign = "*";
                firstVariable();
                isOperationClick = true;
                break;
            case R.id.btn_division:
                sign = "/";
                firstVariable();
                isOperationClick = true;
                break;
        }

    }
    public void firstVariable(){
        first = Double.parseDouble(textView.getText().toString());
    }
    public void secondVariable(){
        second = Double.parseDouble(textView.getText().toString());
    }
}