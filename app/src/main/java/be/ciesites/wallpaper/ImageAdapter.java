package be.ciesites.wallpaper;

import android.app.ActionBar;
import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import static android.view.ViewGroup.*;

/**
 * Created by tywinlannister on 14/10/16.
 */

public class ImageAdapter extends BaseAdapter{


    public Integer [] mThumbIds = {
            R.drawable.pic01 , R.drawable.pic03, R.drawable.pic05, R.drawable.pic07, R.drawable.pic09
    };

    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(LayoutParams.WRAP_CONTENT, 200));


        return imageView;
    }
}
