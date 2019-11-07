package cn.johnsen.learnandroid.canvas.canvas_one;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class TestView extends View {

    private static final String TAG = "TestView";

    private Paint mPaint = null;

    public TestView(Context context) {
        this(context, null);
    }

    public TestView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        init();
    }

    public TestView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);

        mPaint.setStrokeWidth(10);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        //==============绘图坐标的平移=========
        /**
         * 1、坐标的平移
         * 2、特性就是在修改坐标后，这个过程中是不可逆的
         */
//        RectF r = new RectF(0,0,400,400);
//        canvas.drawRect(r,mPaint);
////
////        //1
//        canvas.translate(100,100);
////
//        mPaint.setColor(Color.BLUE);
//        RectF r2 = new RectF(-100,-100,400,400);
//        canvas.drawRect(r2,mPaint);
////
////        //2
//        mPaint.setColor(Color.YELLOW);
//        canvas.drawRect(new RectF(0, 0, 400, 400), mPaint);

        //=============Matrix变换矩阵=========
        Matrix matrix0 = canvas.getMatrix();
        Log.i(TAG, matrix0.toString());
//
//        //默认有一个绘图坐标系
        RectF r = new RectF(0, 0, 400, 400);
        canvas.drawRect(r, mPaint);
        Matrix matrix = canvas.getMatrix();
        Log.i(TAG, matrix.toString());
//
        canvas.translate(100, 200);
//
        mPaint.setColor(Color.BLUE);
        RectF r2 = new RectF(0, 0, 400, 400);
        canvas.drawRect(r2, mPaint);
        Matrix matrix1 = canvas.getMatrix();
        Log.i(TAG, matrix1.toString());
//



        canvas.rotate(30,200,200);
        mPaint.setColor(Color.YELLOW);
        canvas.drawRect(new RectF(0, 0, 400, 400), mPaint);
        Matrix matrix2 = canvas.getMatrix();
        Log.i(TAG, matrix2.toString());

        mPaint.setColor(Color.BLACK);
        canvas.drawRect(new RectF(0, 0, 400, 400), mPaint);
//        canvas.save();//0,0
        //translate  他对坐标系进行了改变
//        canvas.translate(100,100);

//        canvas.save();//50,50
//        mPaint.setColor(Color.BLUE);
//        RectF r2 = new RectF(0,0,400,400);
//        canvas.drawRect(r2,mPaint);
//        Matrix matrix1 = canvas.getMatrix();
//        Log.i(TAG, matrix1.toString());

//        canvas.rotate(30,200,200);
//        Matrix matrix2 = canvas.getMatrix();
//        Log.i(TAG, matrix2.toString());

//        canvas.scale(0.5f,0.5f);
//        mPaint.setColor(Color.YELLOW);
//        canvas.drawRect(new RectF(0, 0, 400, 400), mPaint);
//        Matrix matrix3 = canvas.getMatrix();
//        Log.i(TAG, matrix3.toString());

        // x 方向上倾斜45 度
//        canvas.skew(1, 0);
//        mPaint.setColor(0x8800ff00);
//        canvas.drawRect(new Rect(0, 0, 400, 400), mPaint);
//        Matrix matrix4 = canvas.getMatrix();
//        Log.i(TAG, matrix4.toString());

//        canvas.restore();//?  0,0    50,50
//        canvas.translate(70,50);
//
//        //此处再次进行绘制运用了-50那么这里不是将坐标系改变
//        mPaint.setColor(Color.YELLOW);
//        RectF r3 = new RectF(0,0,400,400);
//        canvas.drawRect(r3,mPaint);

    }
}
