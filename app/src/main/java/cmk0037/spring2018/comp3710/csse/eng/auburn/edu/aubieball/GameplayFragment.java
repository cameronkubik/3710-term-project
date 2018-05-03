package cmk0037.spring2018.comp3710.csse.eng.auburn.edu.aubieball;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by camkubikpro on 5/3/18.
 */

public class GameplayFragment extends Fragment {
    //declare game artifacts
    private float mTotalGameTime;
    //declare actors
    private ImageView aubie;
    private ImageView d11;
    private ImageView d12;
    private ImageView d21;
    private ImageView d22;
    private ImageView d31;
    private ImageView d32;
    private ImageView d41;
    private ImageView d42;
    private FrameLayout endzone;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_gameplay, container, false);

        linkDefense(v);

        //DefenseController defenseController = getDefenseController();

        //defenseController.beginLineMovement(8000);

        return v;
    }

    @Override
    public void onStart() {
        super.onStart();

        DefenseController defenseController = getDefenseController();

        defenseController.beginLineMovement(8000);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void linkDefense(View v) {
        aubie = v.findViewById(R.id.aubie);
        d11 = v.findViewById(R.id.d11);
        d12 = v.findViewById(R.id.d12);
        d21 = v.findViewById(R.id.d21);
        d22 = v.findViewById(R.id.d22);
        d31 = v.findViewById(R.id.d31);
        d32 = v.findViewById(R.id.d32);
        d41 = v.findViewById(R.id.d41);
        d42 = v.findViewById(R.id.d42);
    }

    private DefenseController getDefenseController() {
        ArrayList<ImageView> defenseArray = new ArrayList<>(8);
        defenseArray.add(0, d11);
        defenseArray.add(1, d12);
        defenseArray.add(2, d21);
        defenseArray.add(3, d22);
        defenseArray.add(4, d31);
        defenseArray.add(5, d32);
        defenseArray.add(6, d41);
        defenseArray.add(7, d42);

        return new DefenseController(defenseArray);
    }


}
