package ambika.android.com.synergy_app_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.alexfu.countdownview.CountDownView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView aboutus,synergy,events,gallery,faqs,contactus;

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

        aboutus.setOnClickListener(this);
        synergy.setOnClickListener(this);
        events.setOnClickListener(this);
        gallery.setOnClickListener(this);
        faqs.setOnClickListener(this);
        contactus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent();
        switch(v.getId()){
            case R.id.contactus:
                i.setClass(this,ContactUs.class);
                break;
                default:break;

        }
        startActivity(i);

    }
}
