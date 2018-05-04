package cmk0037.spring2018.comp3710.csse.eng.auburn.edu.aubieball;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ImageView;

import com.scalified.viewmover.configuration.MovingParams;
import com.scalified.viewmover.movers.ViewMover;
import com.scalified.viewmover.movers.ViewMoverFactory;

/**
 * Created by camkubikpro on 5/3/18.
 */

public class Line {
    private ImageView leftman, rightman;
    private boolean direction; // true=left , false=right
    private boolean movementFlag;


    public Line(ImageView def1, ImageView def2, String _direction) {
        leftman = def1;
        rightman = def2;
        direction = _direction.equals("left");
        movementFlag = true;
    }

    public void move(Context context) {
        // Create ViewMover instance
        ViewMover leftMover = ViewMoverFactory.createInstance(leftman);
        ViewMover rightMover = ViewMoverFactory.createInstance(rightman);

        // Create MovingDetails instance
        MovingParams leftParams = new MovingParams(context, 220f, 0.0f, 3000L);
        MovingParams rightParams = new MovingParams(context, -220f, 0.0f, 3000L);

        // Move the view
        leftMover.move(leftParams);
        rightMover.move(rightParams);

    }




}
