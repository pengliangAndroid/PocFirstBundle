package test.android.taobao.com.firstlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Log.i("FirstActivity","FirstActivity");
        Toast.makeText(this,TestUtil.getData(),Toast.LENGTH_SHORT).show();
    }
}
