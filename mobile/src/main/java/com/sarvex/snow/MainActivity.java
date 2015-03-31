package com.sarvex.snow;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Cocos2dxActivity {
    private Cocos2dxGLSurfaceView surfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (detectOpenGLES20()) {
            String packageName = getApplication().getPackageName();
            super.setPackageName(packageName);

            setContentView(R.layout.game_demo);
            surfaceView = (Cocos2dxGLSurfaceView) findViewById(R.id.game_gl_surfaceview);
            Cocos2dxEditText editText = (Cocos2dxEditText) findViewById(R.id.game_edittext);

            surfaceView.setEGLContextClientVersion(2;
            surfaceView.setCocos2dxRenderer(new Cocos2dxRenderer()));
            surfaceView.setTextField(editText);
        } else {
            Log.d("activity", "does not support gles 2.0");
            finish
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
