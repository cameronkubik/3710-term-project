package cmk0037.spring2018.comp3710.csse.eng.auburn.edu.aubieball;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ImageView;

/**
 * Created by camkubikpro on 5/3/18.
 */

public class Line extends DefenseController {
    private ImageView leftman, rightman;
    private LayoutParams leftParams, rightParams;
    private boolean direction; // true=left , false=right
    private int speed, gap;

    private boolean movementFlag;


    public Line(ImageView def1, ImageView def2) {
        leftman = def1;
        rightman = def2;

        leftParams = (LayoutParams) leftman.getLayoutParams();
        rightParams = (LayoutParams) rightman.getLayoutParams();

        movementFlag = false;
    }

    public void orchestrateMovement(int _speed) {
        speed = _speed;
        movementFlag = true;
        final Handler handler = new Handler();

        while(movementFlag) {
            moveIndividual(rightman);

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Do something after 5s = 5000ms
                    moveIndividual(leftman);
                }
            }, speed/2);
        }
    }

    private void moveIndividual(ImageView defender) {
        LayoutParams defenderParams = (LayoutParams) defender.getLayoutParams();
        Float pxRemaining = (float)1150-defenderParams.getMarginStart();
        ObjectAnimator animationR = ObjectAnimator.ofFloat(defender, "translationX", pxRemaining);
        animationR.setDuration(speed);
        animationR.start();
        resetDefenseMargins(defender);
    }

    private void resetDefenseMargins(ImageView defender) {
        LayoutParams defenderParams = (LayoutParams) defender.getLayoutParams();
        defenderParams.setMarginEnd(1150);
    }

    public void stopMovement() {
        movementFlag = false;
    }


    public void setInitialMargins(int pxLeft, int pxRight) {
        leftParams.setMarginStart(0);
        rightParams.setMarginStart(0);
    }

    public ImageView getLeftman() {
        return leftman;
    }

    public void setLeftman(ImageView leftman) {
        this.leftman = leftman;
    }

    public ImageView getRightman() {
        return rightman;
    }

    public void setRightman(ImageView rightman) {
        this.rightman = rightman;
    }

    public boolean isDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGap() {
        return gap;
    }

    public void setGap(int gap) {
        this.gap = gap;
    }
}
