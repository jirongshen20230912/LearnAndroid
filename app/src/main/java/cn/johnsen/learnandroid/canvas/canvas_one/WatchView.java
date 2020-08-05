package cn.johnsen.learnandroid.canvas.canvas_one;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;


public class WatchView extends View {
    private static final String TAG = "WatchView";
    private int mWidth;
    private int mHerght;


    public WatchView(Context context) {
        super(context);
    }

    public WatchView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public WatchView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mWidth = getMeasuredWidth();
        mHerght = getMeasuredHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //画外圆
        Paint paintCircle = new Paint();
        paintCircle.setStrokeWidth(5);
        paintCircle.setAntiAlias(true);
        paintCircle.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(mWidth / 2,
                mHerght / 2, mWidth / 2, paintCircle);

        //画刻度线
        Paint paintDegree = new Paint();
        paintCircle.setStrokeWidth(3);
        for (int i = 0; i < 12; i++) {
            if (i == 0 || i == 3 || i == 6 || i == 9) {
                paintDegree.setStrokeWidth(5);
                paintDegree.setTextSize(100);
                canvas.drawLine(mWidth / 2, mHerght / 2 - mWidth / 2,
                        mWidth / 2, mHerght / 2 - mWidth / 2 + 60,
                        paintDegree);
                String degree = String.valueOf(i);
                canvas.drawText(degree, mWidth / 2 - paintDegree.measureText(degree) / 2,
                        mHerght / 2 - mWidth / 2 + 160, paintDegree);
            } else {
                paintDegree.setStrokeWidth(3);
                paintDegree.setTextSize(50);
                canvas.drawLine(mWidth / 2, mHerght / 2 - mWidth / 2,
                        mWidth / 2, mHerght / 2 - mWidth / 2 + 30,
                        paintDegree);
                String degree = String.valueOf(i);
                canvas.drawText(degree, mWidth / 2 - paintDegree.measureText(degree) / 2,
                        mHerght / 2 - mWidth / 2 + 60, paintDegree);
            }
            canvas.rotate(30, mWidth / 2, mHerght / 2);
        }
        //画指针
        Paint paintHour = new Paint();
        paintHour.setStrokeWidth(20);
        Paint paintMinute = new Paint();
        paintMinute.setStrokeWidth(10);
//        Log.i(TAG, "Current SaveCount1 = " + canvas.getSaveCount());
//        canvas.save();
//        Log.i(TAG, "Current SaveCount2 = " + canvas.getSaveCount());
        canvas.translate(mWidth/2, mHerght/2);
        canvas.drawLine(0,0,100,100,paintHour);
        canvas.drawLine(0,0,100,200,paintMinute);
//        canvas.restore();
        Log.i(TAG, "Current SaveCount3 = " + canvas.getSaveCount());
    }
}
