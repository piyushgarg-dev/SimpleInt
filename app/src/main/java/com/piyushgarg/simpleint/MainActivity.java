package com.piyushgarg.simpleint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final EditText Principal_amt = (EditText) findViewById(R.id.pamt);
        final EditText Rate_of_Interest = (EditText) findViewById(R.id.ramt);
        final EditText Time = (EditText) findViewById(R.id.time);

        final TextView simpleint = (TextView) findViewById(R.id.si_ans) ;
        final TextView compud = (TextView) findViewById(R.id.compund);

        Button cal = (Button) findViewById(R.id.cal);


        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double pa = Integer.parseInt(Principal_amt.getText().toString());
               double roi = Integer.parseInt(Rate_of_Interest.getText().toString());
               int time = Integer.parseInt(Time.getText().toString());

               double si = (pa*roi*time)/100;

               simpleint.setText("S.I. : "+si);



               double ci = pa*(Math.pow(1+roi/100,time)-1);

               compud.setText("C.I : "+ci);





            }
        });



    }
}
