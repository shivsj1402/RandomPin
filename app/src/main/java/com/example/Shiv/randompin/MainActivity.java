package com.example.vipul.randompin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String numbers[]=new String[]{"0","1","2","3","4","5","6","7","8","9"};
    String random_numbers[]=new String[numbers.length];
    TextView pin;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,clear;
    String str_pin=null;
    ArrayList<String> generated = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        clear=(Button)findViewById(R.id.button13);

        //adding the numbers array elements to generated list.
        for(int i=0;i<numbers.length;i++)
        {
            generated.add(Integer.toString(i));
        }
        //randomize the numbers in the arraylist.
        Collections.shuffle(generated);
        //put the randomized list into an array.
        random_numbers= generated.toArray(new String[generated.size()]);

        //set the elements from the randomized array to the respective buttons.
        b0.setText(random_numbers[0]);
        //set button text color according to the index in randomized array elements.
        if(random_numbers[0].matches("0")) b0.setTextColor(getResources().getColor(R.color.colorAccent));
        if(random_numbers[0].matches("1")) b0.setTextColor(getResources().getColor(R.color.blue));
        if(random_numbers[0].matches("2")) b0.setTextColor(getResources().getColor(R.color.green));
        if(random_numbers[0].matches("3")) b0.setTextColor(getResources().getColor(R.color.magenta));
        if(random_numbers[0].matches("4")) b0.setTextColor(getResources().getColor(R.color.orange));
        if(random_numbers[0].matches("5")) b0.setTextColor(getResources().getColor(R.color.black));
        if(random_numbers[0].matches("6")) b0.setTextColor(getResources().getColor(R.color.yellow));
        if(random_numbers[0].matches("7")) b0.setTextColor(getResources().getColor(R.color.red));
        if(random_numbers[0].matches("8")) b0.setTextColor(getResources().getColor(R.color.purple));
        if(random_numbers[0].matches("9")) b0.setTextColor(getResources().getColor(R.color.turquoise));


        b1.setText(random_numbers[1]);
        if(random_numbers[1].matches("0")) b1.setTextColor(getResources().getColor(R.color.colorAccent));
        if(random_numbers[1].matches("1")) b1.setTextColor(getResources().getColor(R.color.blue));
        if(random_numbers[1].matches("2")) b1.setTextColor(getResources().getColor(R.color.green));
        if(random_numbers[1].matches("3")) b1.setTextColor(getResources().getColor(R.color.magenta));
        if(random_numbers[1].matches("4")) b1.setTextColor(getResources().getColor(R.color.orange));
        if(random_numbers[1].matches("5")) b1.setTextColor(getResources().getColor(R.color.black));
        if(random_numbers[1].matches("6")) b1.setTextColor(getResources().getColor(R.color.yellow));
        if(random_numbers[1].matches("7")) b1.setTextColor(getResources().getColor(R.color.red));
        if(random_numbers[1].matches("8")) b1.setTextColor(getResources().getColor(R.color.purple));
        if(random_numbers[1].matches("9")) b1.setTextColor(getResources().getColor(R.color.turquoise));


        b2.setText(random_numbers[2]);
        if(random_numbers[2].matches("0")) b2.setTextColor(getResources().getColor(R.color.colorAccent));
        if(random_numbers[2].matches("1")) b2.setTextColor(getResources().getColor(R.color.blue));
        if(random_numbers[2].matches("2")) b2.setTextColor(getResources().getColor(R.color.green));
        if(random_numbers[2].matches("3")) b2.setTextColor(getResources().getColor(R.color.magenta));
        if(random_numbers[2].matches("4")) b2.setTextColor(getResources().getColor(R.color.orange));
        if(random_numbers[2].matches("5")) b2.setTextColor(getResources().getColor(R.color.black));
        if(random_numbers[2].matches("6")) b2.setTextColor(getResources().getColor(R.color.yellow));
        if(random_numbers[2].matches("7")) b2.setTextColor(getResources().getColor(R.color.red));
        if(random_numbers[2].matches("8")) b2.setTextColor(getResources().getColor(R.color.purple));
        if(random_numbers[2].matches("9")) b2.setTextColor(getResources().getColor(R.color.turquoise));


        b3.setText(random_numbers[3]);
        if(random_numbers[3].matches("0")) b3.setTextColor(getResources().getColor(R.color.colorAccent));
        if(random_numbers[3].matches("1")) b3.setTextColor(getResources().getColor(R.color.blue));
        if(random_numbers[3].matches("2")) b3.setTextColor(getResources().getColor(R.color.green));
        if(random_numbers[3].matches("3")) b3.setTextColor(getResources().getColor(R.color.magenta));
        if(random_numbers[3].matches("4")) b3.setTextColor(getResources().getColor(R.color.orange));
        if(random_numbers[3].matches("5")) b3.setTextColor(getResources().getColor(R.color.black));
        if(random_numbers[3].matches("6")) b3.setTextColor(getResources().getColor(R.color.yellow));
        if(random_numbers[3].matches("7")) b3.setTextColor(getResources().getColor(R.color.red));
        if(random_numbers[3].matches("8")) b3.setTextColor(getResources().getColor(R.color.purple));
        if(random_numbers[3].matches("9")) b3.setTextColor(getResources().getColor(R.color.turquoise));

        b4.setText(random_numbers[4]);
        if(random_numbers[4].matches("0")) b4.setTextColor(getResources().getColor(R.color.colorAccent));
        if(random_numbers[4].matches("1")) b4.setTextColor(getResources().getColor(R.color.blue));
        if(random_numbers[4].matches("2")) b4.setTextColor(getResources().getColor(R.color.green));
        if(random_numbers[4].matches("3")) b4.setTextColor(getResources().getColor(R.color.magenta));
        if(random_numbers[4].matches("4")) b4.setTextColor(getResources().getColor(R.color.orange));
        if(random_numbers[4].matches("5")) b4.setTextColor(getResources().getColor(R.color.black));
        if(random_numbers[4].matches("6")) b4.setTextColor(getResources().getColor(R.color.yellow));
        if(random_numbers[4].matches("7")) b4.setTextColor(getResources().getColor(R.color.red));
        if(random_numbers[4].matches("8")) b4.setTextColor(getResources().getColor(R.color.purple));
        if(random_numbers[4].matches("9")) b4.setTextColor(getResources().getColor(R.color.turquoise));

        b5.setText(random_numbers[5]);
        if(random_numbers[5].matches("0")) b5.setTextColor(getResources().getColor(R.color.colorAccent));
        if(random_numbers[5].matches("1")) b5.setTextColor(getResources().getColor(R.color.blue));
        if(random_numbers[5].matches("2")) b5.setTextColor(getResources().getColor(R.color.green));
        if(random_numbers[5].matches("3")) b5.setTextColor(getResources().getColor(R.color.magenta));
        if(random_numbers[5].matches("4")) b5.setTextColor(getResources().getColor(R.color.orange));
        if(random_numbers[5].matches("5")) b5.setTextColor(getResources().getColor(R.color.black));
        if(random_numbers[5].matches("6")) b5.setTextColor(getResources().getColor(R.color.yellow));
        if(random_numbers[5].matches("7")) b5.setTextColor(getResources().getColor(R.color.red));
        if(random_numbers[5].matches("8")) b5.setTextColor(getResources().getColor(R.color.purple));
        if(random_numbers[5].matches("9")) b5.setTextColor(getResources().getColor(R.color.turquoise));

        b6.setText(random_numbers[6]);
        if(random_numbers[6].matches("0")) b6.setTextColor(getResources().getColor(R.color.colorAccent));
        if(random_numbers[6].matches("1")) b6.setTextColor(getResources().getColor(R.color.blue));
        if(random_numbers[6].matches("2")) b6.setTextColor(getResources().getColor(R.color.green));
        if(random_numbers[6].matches("3")) b6.setTextColor(getResources().getColor(R.color.magenta));
        if(random_numbers[6].matches("4")) b6.setTextColor(getResources().getColor(R.color.orange));
        if(random_numbers[6].matches("5")) b6.setTextColor(getResources().getColor(R.color.black));
        if(random_numbers[6].matches("6")) b6.setTextColor(getResources().getColor(R.color.yellow));
        if(random_numbers[6].matches("7")) b6.setTextColor(getResources().getColor(R.color.red));
        if(random_numbers[6].matches("8")) b6.setTextColor(getResources().getColor(R.color.purple));
        if(random_numbers[6].matches("9")) b6.setTextColor(getResources().getColor(R.color.turquoise));

        b7.setText(random_numbers[7]);
        if(random_numbers[7].matches("0")) b7.setTextColor(getResources().getColor(R.color.colorAccent));
        if(random_numbers[7].matches("1")) b7.setTextColor(getResources().getColor(R.color.blue));
        if(random_numbers[7].matches("2")) b7.setTextColor(getResources().getColor(R.color.green));
        if(random_numbers[7].matches("3")) b7.setTextColor(getResources().getColor(R.color.magenta));
        if(random_numbers[7].matches("4")) b7.setTextColor(getResources().getColor(R.color.orange));
        if(random_numbers[7].matches("5")) b7.setTextColor(getResources().getColor(R.color.black));
        if(random_numbers[7].matches("6")) b7.setTextColor(getResources().getColor(R.color.yellow));
        if(random_numbers[7].matches("7")) b7.setTextColor(getResources().getColor(R.color.red));
        if(random_numbers[7].matches("8")) b7.setTextColor(getResources().getColor(R.color.purple));
        if(random_numbers[7].matches("9")) b7.setTextColor(getResources().getColor(R.color.turquoise));


        b8.setText(random_numbers[8]);
        if(random_numbers[8].matches("0")) b8.setTextColor(getResources().getColor(R.color.colorAccent));
        if(random_numbers[8].matches("1")) b8.setTextColor(getResources().getColor(R.color.blue));
        if(random_numbers[8].matches("2")) b8.setTextColor(getResources().getColor(R.color.green));
        if(random_numbers[8].matches("3")) b8.setTextColor(getResources().getColor(R.color.magenta));
        if(random_numbers[8].matches("4")) b8.setTextColor(getResources().getColor(R.color.orange));
        if(random_numbers[8].matches("5")) b8.setTextColor(getResources().getColor(R.color.black));
        if(random_numbers[8].matches("6")) b8.setTextColor(getResources().getColor(R.color.yellow));
        if(random_numbers[8].matches("7")) b8.setTextColor(getResources().getColor(R.color.red));
        if(random_numbers[8].matches("8")) b8.setTextColor(getResources().getColor(R.color.purple));
        if(random_numbers[8].matches("9")) b8.setTextColor(getResources().getColor(R.color.turquoise));

        b9.setText(random_numbers[9]);
        if(random_numbers[9].matches("0")) b9.setTextColor(getResources().getColor(R.color.colorAccent));
        if(random_numbers[9].matches("1")) b9.setTextColor(getResources().getColor(R.color.blue));
        if(random_numbers[9].matches("2")) b9.setTextColor(getResources().getColor(R.color.green));
        if(random_numbers[9].matches("3")) b9.setTextColor(getResources().getColor(R.color.magenta));
        if(random_numbers[9].matches("4")) b9.setTextColor(getResources().getColor(R.color.orange));
        if(random_numbers[9].matches("5")) b9.setTextColor(getResources().getColor(R.color.black));
        if(random_numbers[9].matches("6")) b9.setTextColor(getResources().getColor(R.color.yellow));
        if(random_numbers[9].matches("7")) b9.setTextColor(getResources().getColor(R.color.red));
        if(random_numbers[9].matches("8")) b9.setTextColor(getResources().getColor(R.color.purple));
        if(random_numbers[9].matches("9")) b9.setTextColor(getResources().getColor(R.color.turquoise));


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

                    Toast.makeText(getApplicationContext(),"Pin Successful",Toast.LENGTH_SHORT).show();
                    /*Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);*/
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
                    Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
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
                    Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
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
                    Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
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
                    Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
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
                    Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
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
                    Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
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
                    Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
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
                    Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
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
                    Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
                }

                pin.setText(str_pin);
            }
        });


    }


}

