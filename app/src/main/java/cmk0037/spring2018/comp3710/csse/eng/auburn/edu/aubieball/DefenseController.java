package cmk0037.spring2018.comp3710.csse.eng.auburn.edu.aubieball;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.view.View;
import android.widget.ImageView;

import com.scalified.viewmover.configuration.MovingParams;
import com.scalified.viewmover.movers.ViewMover;
import com.scalified.viewmover.movers.ViewMoverFactory;

import org.slf4j.IMarkerFactory;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by camkubikpro on 5/3/18.
 */

public class DefenseController {
    private ArrayList<ImageView> defense;
    private Context mContext;
    private Line line1;
    private Line line2;
    private Line line3;
    private Line line4;

    public DefenseController(ArrayList<ImageView> def, Context context) {
        defense = def;
        mContext = context;
    }

    public DefenseController() {
        // default empty constructor
    }

    public void initializeDefense() {
        ListIterator<ImageView> listIterator = defense.listIterator();

        while(listIterator.hasNext()) {
            line1 = new Line(listIterator.next(), listIterator.next(), "right");

            line2 = new Line(listIterator.next(), listIterator.next(), "right");

            line3 = new Line(listIterator.next(), listIterator.next(), "left");

            line4 = new Line(listIterator.next(), listIterator.next(), "left");
        }

    }

    public void moveDefense() {
        line1.move(mContext);

        line2.move(mContext);

        line3.move(mContext);

        line4.move(mContext);

    }

    /*
    public void beginMovement(Context context) {
        ListIterator<ImageView> defenseIterator = defense.listIterator();
        int index = 0;
        while(defenseIterator.hasNext()) {
            // Create ViewMover instance
            ViewMover mover = ViewMoverFactory.createInstance(defenseIterator.next());

            // Create MovingDetails instance
            MovingParams params = new MovingParams(context, getDefenseMargin(index), 0.0f, 3000L);

            // Move the view
            mover.move(params);
            index++;
        }


    }

    private float getDefenseMargin(int index) {
        int _case = index % 2;
        switch (_case) {
            case 0:
                return 100.0f;
            case 1:
                return 300.0f;
            default:
                return 50.0f;
        }
    }
     */



}
