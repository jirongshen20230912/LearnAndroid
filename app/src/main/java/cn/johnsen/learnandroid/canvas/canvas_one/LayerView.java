package cn.johnsen.learnandroid.canvas.canvas_one;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;


public class LayerView extends View {
    private Paint mPaint;

    public LayerView(Context context) {
        super(context);
        init();
    }

    public LayerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public LayerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(Color.RED);
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.FILL);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //图层一
        canvas.drawColor(Color.WHITE);//白色底色图层
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(200, 200, 100, mPaint);//黑色圆形

        //图层二
        canvas.saveLayerAlpha(0, 0, 400, 400, 127, Canvas.ALL_SAVE_FLAG);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(250, 250, 100, mPaint);//黄色圆形
        canvas.restore();//合并
    }


}
