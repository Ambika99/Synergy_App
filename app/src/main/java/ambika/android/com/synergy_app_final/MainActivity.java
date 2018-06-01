package ambika.android.com.synergy_app_final;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.alexfu.countdownview.CountDownView;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextInsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView aboutus,synergy,events,gallery,faqs,contactus;
    int[] images ={R.drawable.vlsi,R.drawable.ml,R.drawable.robo,R.drawable.code,R.drawable.paperpresentation,R.drawable.android};
    String[] eventnames ={"VLSI Workshop","Machine Learning Workshop","Robotics Workshop","CodeOlympia",
            "Paper Presentation (CSE/ECE/EEE)","Android APP DEV WORKSHOP"};
    int i;
    private PopupWindow popup;
    private CoordinatorLayout clayout;
    Intent intenttab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountDownView countDownView = findViewById(R.id.count_down);
        countDownView.start();
        aboutus = (CardView) findViewById(R.id.aboutus);
        synergy = (CardView) findViewById(R.id.synergy);
        events = (CardView) findViewById(R.id.events);
        gallery = (CardView) findViewById(R.id.gallery);
        faqs = (CardView) findViewById(R.id.faqs);
        contactus = (CardView) findViewById(R.id.contactus);
        clayout = (CoordinatorLayout) findViewById(R.id.Clayout);

        aboutus.setOnClickListener(this);
        synergy.setOnClickListener(this);
        events.setOnClickListener(this);
        gallery.setOnClickListener(this);
        faqs.setOnClickListener(this);
        contactus.setOnClickListener(this);
        BoomMenuButton bmb = (BoomMenuButton) findViewById(R.id.bmb);
        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            HamButton.Builder builder = new HamButton.Builder()
                    .normalImageRes(images[i])
                    .normalText(eventnames[i]);
            bmb.addBuilder(builder);
            builder.listener(new OnBMClickListener() {
                @Override
                public void onBoomButtonClick(int index) {
                    if(index ==1){
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this,Machinelearning.class);
                        startActivity(intent);
                    }
                    if(index ==0){
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this,Vlsi.class);
                        startActivity(intent);
                    }
                    if(index ==2){
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this,Robotics.class);
                        startActivity(intent);
                    }
                    if(index ==3){
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this,Codeolympia.class);
                        startActivity(intent);
                    }
                    if(index ==5){
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this,Appdev.class);
                        startActivity(intent);
                    }
                    if(index ==4){
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this,Paperpresentation.class);
                        startActivity(intent);
                    }
                }
            });
        }

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.contactus:
                Intent i = new Intent();
                i.setClass(MainActivity.this,ContactUs.class);
                startActivity(i);
                break;
                case R.id.aboutus:
                Toast.makeText(MainActivity.this,"About Us Page",Toast.LENGTH_LONG).show();
                break;

            case R.id.synergy:
                Toast.makeText(MainActivity.this,"Synergy Page",Toast.LENGTH_LONG).show();
                break;
            case R.id.events:
                Toast.makeText(MainActivity.this,"Click on the Ham Button to get the Event List",Toast.LENGTH_LONG).show();
            case R.id.gallery:
                Intent i2 = new Intent();
                i2.setClass(MainActivity.this,Gallery.class);
                startActivity(i2);
                break;
            case R.id.faqs:
              Toast.makeText(MainActivity.this,"FAQs Page",Toast.LENGTH_LONG).show();
               break;

        }


    }
}
