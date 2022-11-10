package ru.lepaev.tictactoeia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Boolean Sequence=true;
    Boolean Active=false;
    Boolean Reset=true;

    Button btn1;Button btn2;Button btn3;Button btn4;Button btn5;Button btn6;Button btn7;Button btn8;Button btn9;Button btnSTART;TextView textEND;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2= (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);
        btn9 = (Button)findViewById(R.id.btn9);
        btnSTART = (Button)findViewById(R.id.btnSTART);
        textEND = (TextView) findViewById(R.id.textEND);

    }
    public void onCLick(View View1)
    {
        if (Active) { Button simb = (Button) View1;
            if (Sequence) {
                simb.setText("x");
                simb.setEnabled(false);
                Sequence = !Sequence;
            } else {
                simb.setText("o");
                simb.setEnabled(false);
                Sequence = !Sequence; }


            if (btn1.getText().toString() == btn2.getText().toString()&&
                    btn1.getText().toString()==btn3.getText().toString()&&btn1.getText().toString().length()!=0)
            { textEND.setText(btn1.getText().toString()+" Выиграл");Active=!Active; }

            else if (btn4.getText().toString() == btn5.getText().toString()&&
                    btn4.getText().toString()==btn6.getText().toString()&&btn4.getText().toString().length()!=0)
            { textEND.setText(btn4.getText().toString()+" Выиграл");Active=!Active; }

           else if (btn7.getText().toString() == btn8.getText().toString()&&
                    btn7.getText().toString()==btn9.getText().toString()&&btn7.getText().toString().length()!=0)
            { textEND.setText(btn7.getText().toString()+" Выиграл");Active=!Active; }//

            else if (btn1.getText().toString() == btn4.getText().toString()&&
                    btn1.getText().toString()==btn7.getText().toString()&&btn1.getText().toString().length()!=0)
            { textEND.setText(btn1.getText().toString()+" Выиграл");Active=!Active; }

            else if (btn2.getText().toString() == btn5.getText().toString()&&
                    btn2.getText().toString()==btn8.getText().toString()&&btn2.getText().toString().length()!=0)
            { textEND.setText(btn2.getText().toString()+" Выиграл");Active=!Active; }

            else if (btn3.getText().toString() == btn6.getText().toString()&&
                    btn3.getText().toString()==btn9.getText().toString()&&btn3.getText().toString().length()!=0)
            { textEND.setText(btn3.getText().toString()+" Выиграл");Active=!Active; }//

            else if (btn1.getText().toString() == btn5.getText().toString()&&
                    btn1.getText().toString()==btn9.getText().toString()&&btn1.getText().toString().length()!=0)
            { textEND.setText(btn1.getText().toString()+" Выиграл");Active=!Active; }

            else if (btn3.getText().toString() == btn5.getText().toString()&&
                    btn3.getText().toString()==btn7.getText().toString()&&btn3.getText().toString().length()!=0)
            { textEND.setText(btn3.getText().toString()+" Выиграл"); Active=!Active; }

            else if (btn1.getText().toString().length() == btn2.getText().toString().length() &&
                    btn3.getText().toString().length() ==btn4.getText().toString().length() &&
                    btn5.getText().toString().length() ==btn6.getText().toString().length() &&
                    btn7.getText().toString().length() ==btn8.getText().toString().length() &&btn9.getText().toString().length() !=0)
                {textEND.setText("Ничья"); }

        }
    }

    public void onClickStart(View View1)
    { if (Reset==true)
        { Button btntext =(Button)View1;
            Active=true;
            btntext.setText("Заново");
            Reset=false;}
        else
        { Intent act = new Intent(this, MainActivity.class);
        startActivity(act); }

    }

}