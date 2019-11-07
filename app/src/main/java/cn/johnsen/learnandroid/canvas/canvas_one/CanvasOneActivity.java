package cn.johnsen.learnandroid.canvas.canvas_one;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.johnsen.learnandroid.R;

public class CanvasOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GuaGuaCardView_SRCOUT(this));
    }
}
