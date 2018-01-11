package com.example.vipul.randompin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Normal_layout extends AppCompatActivity {
    String numbers[]=new String[]{"0","1","2","3","4","5","6","7","8","9"};
    TextView pin;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,next,clear;
    String str_pin=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_layout);

        pin=(TextView)findViewById(R.id.PIN);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b0=(Button)findViewById(R.id.button0);
        next =(Button)findViewById(R.id.button10);
        clear =(Button)findViewById(R.id.button11);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Random_wo_color.class);
                startActivity(intent);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_pin=null;
                pin.setText("");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if PIN is null at the start
                if(str_pin==null)
                {
                    str_pin=b0.getText().toString();
                }
                //if PIN contains some numbers, append the next
                else
                {
                    str_pin+=b0.getText().toString();
                }
                //terminate the PIN when the length is 4 numbers.
                if(str_pin.length()==4)
                {
                    Toast.makeText(getApplicationContext(),"Pin verified", Toast.LENGTH_SHORT).show();
                }

                pin.setText(str_pin);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str_pin==null)
                {
                    str_pin=b1.getText().toString();
                }

                else
                {
                    str_pin+=b1.getText().toString();
                }

                if(str_pin.length()==4)
                {
                    Toast.makeText(getApplicationContext(),"Pin verified", Toast.LENGTH_SHORT).show();
                }

                pin.setText(str_pin);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str_pin==null)
                {
                    str_pin=b2.getText().toString();
                }

                else
                {
                    str_pin+=b2.getText().toString();
                }

                if(str_pin.length()==4)
                {
                    Toast.makeText(getApplicationContext(),"Pin verified", Toast.LENGTH_SHORT).show();
                }

                pin.setText(str_pin);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str_pin==null)
                {
                    str_pin=b3.getText().toString();
                }

                else
                {
                    str_pin+=b3.getText().toString();
                }

                if(str_pin.length()==4)
                {
                    Toast.makeText(getApplicationContext(),"Pin verified", Toast.LENGTH_SHORT).show();
                }

                pin.setText(str_pin);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str_pin==null)
                {
                    str_pin=b4.getText().toString();
                }

                else
                {
                    str_pin+=b4.getText().toString();
                }

                if(str_pin.length()==4)
                {
                    Toast.makeText(getApplicationContext(),"Pin verified", Toast.LENGTH_SHORT).show();
                }

                pin.setText(str_pin);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str_pin==null)
                {
                    str_pin=b5.getText().toString();
                }

                else
                {
                    str_pin+=b5.getText().toString();
                }

                if(str_pin.length()==4)
                {
                    Toast.makeText(getApplicationContext(),"Pin verified", Toast.LENGTH_SHORT).show();
                }

                pin.setText(str_pin);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str_pin==null)
                {
                    str_pin=b6.getText().toString();
                }

                else
                {
                    str_pin+=b6.getText().toString();
                }

                if(str_pin.length()==4)
                {
                    Toast.makeText(getApplicationContext(),"Pin verified", Toast.LENGTH_SHORT).show();
                }

                pin.setText(str_pin);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str_pin==null)
                {
                    str_pin=b7.getText().toString();
                }

                else
                {
                    str_pin+=b7.getText().toString();
                }

                if(str_pin.length()==4)
                {
                    Toast.makeText(getApplicationContext(),"Pin verified", Toast.LENGTH_SHORT).show();
                }

                pin.setText(str_pin);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str_pin==null)
                {
                    str_pin=b8.getText().toString();
                }

                else
                {
                    str_pin+=b8.getText().toString();
                }

                if(str_pin.length()==4)
                {
                    Toast.makeText(getApplicationContext(),"Pin verified", Toast.LENGTH_SHORT).show();
                }

                pin.setText(str_pin);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str_pin==null)
                {
                    str_pin=b9.getText().toString();
                }

                else
                {
                    str_pin+=b9.getText().toString();
                }

                if(str_pin.length()==4)
                {
                    Toast.makeText(getApplicationContext(),"Pin verified", Toast.LENGTH_SHORT).show();
                }

                pin.setText(str_pin);
            }
        });

    }
}
