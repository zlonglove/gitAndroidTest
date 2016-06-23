package cin.hello.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {
    private final String TAG="MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.init(TAG);
        Logger.d("zhanglong","--->onCreate()");
        Logger.e("zhanglong","--->error()");
    }
}
