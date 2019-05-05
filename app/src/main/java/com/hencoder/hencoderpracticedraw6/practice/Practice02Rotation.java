package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice02Rotation extends RelativeLayout {
    Button animateBt;
    ImageView imageView;
    int clickcount = 0 ;
    public Practice02Rotation(Context context) {
        super(context);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                // // TODO 在这里处理点击事件，通过 View.animate().rotation/X/Y() 来让 View 旋转
                clickcount = ( clickcount >= 10 ) ? 0 : (clickcount++) ;
                Log.i("clickcount",( clickcount >= 9 )+"clickcount"+""+(clickcount++));
                switch (clickcount){
                    case 1 :
                        imageView.animate().rotationX(120);
                        break;
                    case 2 :
                        imageView.animate().rotationX(0);
                        break;
                    case 3 :
                        imageView.animate().rotationBy(100);
                        break;
                    case 4 :
                        imageView.animate().rotationBy(-100);
                        break;
                    case 5 :
                        imageView.animate().rotationXBy(100);
                        break;
                    case 6 :
                        imageView.animate().rotationXBy(-100);
                        break;
                    case 7 :
                        imageView.animate().rotationY(100);
                        break;
                    case 8 :
                        imageView.animate().rotationY(0);
                        break;
                    case  9:
                        imageView.animate().rotationYBy(100);
                        break;
                    case  10:
                        imageView.animate().rotationYBy(-100);
                        break;
                    default:
                        break;
                }
            }
        });
    }
}