package ambika.android.com.synergy_app_final;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Githubadapter extends PagerAdapter {
    private Context context;
    private  String[] imageurls;
    Githubadapter(Context context, String[] imageurls){
        this.context = context;
        this.imageurls = imageurls;
    }

    @Override
    public int getCount() {
        return imageurls.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view ==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        Picasso.with(context)
                .load(imageurls[position])
                .fit()
                .centerCrop()
                .into(imageView);
        container.addView(imageView);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
