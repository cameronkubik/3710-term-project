package cmk0037.spring2018.comp3710.csse.eng.auburn.edu.aubieball;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by camkubikpro on 5/3/18.
 */

public class DifficultyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_difficulty, container, false);

        Button mEasyButton = v.findViewById(R.id.easyButton);
        Button mHardButton = v.findViewById(R.id.hardButton);

        // On click - Easy Button
        mEasyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Replace home content fragment with game fragment
                GameplayFragment gameplayFragment = new GameplayFragment();
                ((MainActivity)getActivity()).stackContentFragment(R.id.root_home_fragment, gameplayFragment, "Difficulty Select");
            }
        });
        // On click - Hard Button
        mHardButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Replace home fragment with score fragment
                GameplayFragment gameplayFragment = new GameplayFragment();
                ((MainActivity)getActivity()).stackContentFragment(R.id.root_home_fragment, gameplayFragment, "Difficulty Select");
            }
        });

        return v;
    }
}
