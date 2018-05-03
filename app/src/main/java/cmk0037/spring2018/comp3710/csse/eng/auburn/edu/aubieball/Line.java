package cmk0037.spring2018.comp3710.csse.eng.auburn.edu.aubieball;

import android.text.Layout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by camkubikpro on 5/3/18.
 */

public class Line extends DefenseController {
    private ImageView leftman;
    private ImageView rightman;
    private boolean direction; // true=left , false=right
    private int speed;
    private int gap;



    public Line(ImageView def1, ImageView def2) {
        leftman = def1;
        rightman = def2;
    }

    public void move(int frequency) {
        speed = frequency;

        LayoutParams leftParams = (LayoutParams) leftman.getLayoutParams();
        LayoutParams rightParams = (LayoutParams) rightman.getLayoutParams();

        int rightBuffer = rightParams.getMarginStart();
        int leftBuffer = leftParams.getMarginStart();

        System.out.println(rightBuffer);
        System.out.println(leftBuffer);
        //rightParams.setMarginStart(rightBuffer);
        //leftParams.setMarginStart(leftBuffer);
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
