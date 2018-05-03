package cmk0037.spring2018.comp3710.csse.eng.auburn.edu.aubieball;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment homeFragment = fm.findFragmentById(R.id.frame_container);

        if(homeFragment == null) {
            homeFragment = new HomeFragment();
            fm.beginTransaction()
                    .add(R.id.frame_container, homeFragment)
                    .commit();
        }
    }

    public void stackContentFragment(int sourceContainerId, Fragment targetFragmentInstance, String sourceContentName) {
        FragmentTransaction t = getSupportFragmentManager().beginTransaction();
        t.add(sourceContainerId, targetFragmentInstance).addToBackStack(sourceContentName);
        t.commit();
    }
}
