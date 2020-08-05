package cn.johnsen.learnandroid.canvas.canvas_one;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CanvasOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GuaGuaCardView_SRCOUT(this));
    }
}
