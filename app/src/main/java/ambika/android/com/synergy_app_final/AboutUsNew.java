package ambika.android.com.synergy_app_final;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.ramotion.foldingcell.FoldingCell;
import com.thekhaeng.pushdownanim.PushDownAnim;
import com.ugurtekbas.fadingindicatorlibrary.FadingIndicator;

public class AboutUsNew extends AppCompatActivity {
    ViewPager pager;
    Contactus_slider adapter;
    LinearLayout sliderlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_new);
        Intent in = getIntent();
        final FoldingCell aboutVit = (FoldingCell) findViewById(R.id.aboutVit);
        final FoldingCell whatDoWeDo = (FoldingCell) findViewById(R.id.whatDoWeDo);
        final FoldingCell whoAreWe = (FoldingCell) findViewById(R.id.whoAreWe);
        final FoldingCell moreAboutUs = (FoldingCell) findViewById(R.id.moreAboutUs);
        aboutVit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutVit.toggle(false);
            }
        });
        whatDoWeDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whatDoWeDo.toggle(false);
            }
        });
        whoAreWe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whoAreWe.toggle(false);
            }
        });
        moreAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moreAboutUs.toggle(false);
            }
        });
        Button button = findViewById(R.id.back);

        PushDownAnim.setPushDownAnimTo( button)
                .setOnClickListener( new View.OnClickListener(){
                    @Override
                    public void onClick( View view ){
                        Intent i= new Intent();
                        i.setClass(AboutUsNew.this,MainActivity.class);
                        startActivity(i);
                    }

                } );
        pager = findViewById(R.id.pager);
        sliderlayout = (LinearLayout) findViewById(R.id.slidedots);
        adapter = new Contactus_slider(this);
        pager.setAdapter(adapter);
        FadingIndicator indicator = (FadingIndicator) findViewById(R.id.indicator);
        ViewPager viewpagerDefault = (ViewPager) findViewById(R.id.pager);
//assigning indicator to viewpager
        indicator.setViewPager(viewpagerDefault);

//Set fill color
        indicator.setFillColor(Color.LTGRAY);
//Set stroke color
        indicator.setStrokeColor(Color.CYAN);
    }
}
