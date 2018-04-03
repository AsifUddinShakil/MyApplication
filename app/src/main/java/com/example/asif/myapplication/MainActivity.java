package com.example.asif.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText literET,halfET,quaterET,mangoET,chockletET,doisweetET,doisourET,doismallET,FreeET;
    TextView literP,halfP,quaterP,mangoP,chockletP,doisweetP,doisourP,doismallP;
    TextView literPrice,halfPrice,quaterPrice,mangoPrice,chockletPrice,doisweetPrice,doisourPrice,doismallPrice,totalPrice,totalLiter;
    int litter,half,quater,mango,chocklet,doisweet,doisour,doismall,total=0,temp=0,free;
    float average=0,sum=0,totalliter=0f,flag=0;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.CountBTN);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Allprocess();
            }
        });
        FreeET=findViewById(R.id.freeET);
        literET=findViewById(R.id.literET);
        halfET=findViewById(R.id.halfET);
        quaterET=findViewById(R.id.quaterET);
        mangoET=findViewById(R.id.mangoET);
        chockletET=findViewById(R.id.chokletET);
        doisweetET=findViewById(R.id.doiMET);
        doisourET=findViewById(R.id.doiSET);
        doismallET=findViewById(R.id.doiET);
        literP=findViewById(R.id.Lpice);
        halfP=findViewById(R.id.Hpice);
        quaterP=findViewById(R.id.Qpice);
        mangoP=findViewById(R.id.Mpice);
        chockletP=findViewById(R.id.Cpice);
        doisweetP=findViewById(R.id.Dswpice);
        doisourP=findViewById(R.id.Dsoupice);
        doismallP=findViewById(R.id.Dsmallpice);
        literPrice=findViewById(R.id.Lprice);
        halfPrice=findViewById(R.id.Hprice);
        quaterPrice=findViewById(R.id.Qprice);
        mangoPrice=findViewById(R.id.Mprice);
        chockletPrice=findViewById(R.id.Cprice);
        doisweetPrice=findViewById(R.id.Dswprice);
        doisourPrice=findViewById(R.id.Dsouprice);
        doismallPrice=findViewById(R.id.Dsmallprice);
        totalPrice=findViewById(R.id.totalprice);
        totalLiter=findViewById(R.id.totalliter);
    }
    public void Allprocess(){
        free=Integer.parseInt(FreeET.getText().toString());
        litter=Integer.parseInt(literET.getText().toString());
        half=Integer.parseInt(halfET.getText().toString());
        quater=Integer.parseInt(quaterET.getText().toString());
        mango=Integer.parseInt(mangoET.getText().toString());
        chocklet=Integer.parseInt(chockletET.getText().toString());
        doisweet=Integer.parseInt(doisweetET.getText().toString());
        doisour=Integer.parseInt(doisourET.getText().toString());
        doismall=Integer.parseInt(doismallET.getText().toString());
        sum=(litter+(half/2)+(quater/5));
        average=sum/5;
        temp=(int)average;
        flag=average-temp;
        if(flag>=0.8){
            temp=temp+1;
            }
        else {
            temp=temp;
        }
        if(free==200)
        {
            quater=quater-temp;
        }
        else {
            half=half-temp;
        }
        total=(litter*60+half*32+quater*14+mango*17+chocklet*17+doisweet*73+doisour*65+doismall*192);
        totalliter=(half/2+quater/5);
        literP.setText(String.valueOf(litter)+" Pices");
        halfP.setText(String.valueOf(half)+" Pices");
        quaterP.setText(String.valueOf(quater)+" Pices");
        mangoP.setText(String.valueOf(mango)+" Pices");
        chockletP.setText(String.valueOf(chocklet)+" Pices");
        doisweetP.setText(String.valueOf(doisweet)+" Pices");
        doisourP.setText(String.valueOf(doisour)+" Pices");
        doismallP.setText(String.valueOf(doismall)+" Pices");
        totalPrice.setText("Total "+String.valueOf(total));
        totalLiter.setText(String.valueOf(totalliter));
        litter=litter*60;
        literPrice.setText(String.valueOf(litter));
        half=half*32;
        halfPrice.setText(String.valueOf(half));
        quater=quater*14;
        quaterPrice.setText(String.valueOf(quater));
        mango=mango*17;
        mangoPrice.setText(String.valueOf(mango));
        chocklet=chocklet*17;
        chockletPrice.setText(String.valueOf(chocklet));
        doisweet=doisweet*73;
        doisweetPrice.setText(String.valueOf(doisweet));
        doisour=doisour*65;
        doisourPrice.setText(String.valueOf(doisour));
        doismall=doismall*192;
        doismallPrice.setText(String.valueOf(doismall));
    }
}
