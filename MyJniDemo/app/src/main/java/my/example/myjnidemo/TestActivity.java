package my.example.myjnidemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 *
 * Created by admin on 2016/1/4.
 */
public class TestActivity extends Activity{
    private TextView showTxt;
    private TestUtils testUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showTxt= (TextView) findViewById(R.id.textView_show);
        testUtils=new TestUtils();
        showTxt.setText(""+testUtils.CreateKey(""));
    }
}
