package cmk0037.spring2018.comp3710.csse.eng.auburn.edu.aubieball;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Cameron Kubik on 5/3/18.
 */

public class HomeFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        Button mStartButton = v.findViewById(R.id.start_game_button);
        Button mScoreButton = v.findViewById(R.id.view_score_button);

        // On click - Start Game Button
        mStartButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Replace home content fragment with game fragment
            }
        });
        // On click - View Score Records Button
        mScoreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Replace home fragment with score fragment
            }
        });

        return v;
    }
}
