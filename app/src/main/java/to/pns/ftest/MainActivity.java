package to.pns.ftest;





import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.MotionEvent;


public class MainActivity extends Activity {

    @Override
	public boolean onTouchEvent(MotionEvent event)
	{
		// TODO 自動生成されたメソッド・スタブ
    	glView.onTouchEvent(event);
		return super.onTouchEvent(event);
	}

	@Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        glView = new Grp(this);
	   	Log.e("Activity","onCreate");
        setContentView(glView);
    }

    protected void finalize()
    {
    	Log.e("Activity","finalize");    	
    }

	@Override
	protected void onPause() {
		// TODO 自動生成されたメソッド・スタブ
    	Log.e("Activity","onPause");
        //setContentView(R.layout.activity_main);
   
		super.onPause();
    }


	@Override
	protected void onStop() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStop();
	   	Log.e("Activity","onStop");
	   	System.gc();
    }


	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
	   	Log.e("Activity","onResume");
		super.onResume();

	}
   GLSurfaceView glView;
}
