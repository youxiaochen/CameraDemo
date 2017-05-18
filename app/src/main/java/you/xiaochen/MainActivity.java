package you.xiaochen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt1).setOnClickListener(this);


        /**
         *
         *
         *
         *
         *
         * 注意权限,6.0以上需要另请权限或将targetSdkVersion 设置成 22或以下版本
         *
         *
         *
         *
         *
         *
         */



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt1:
                CameraActivity.lanuchForPhoto(this);
                break;
        }
    }



}
