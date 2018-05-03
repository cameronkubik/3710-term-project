package cmk0037.spring2018.comp3710.csse.eng.auburn.edu.aubieball;

import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by camkubikpro on 5/3/18.
 */

public class DefenseController {
    private ArrayList<ImageView> defensemen;
    private ArrayList<Line> lines;

    public DefenseController(ArrayList<ImageView> _defensemen) {
        defensemen = _defensemen;
        lines = new ArrayList<>(4);
        makeLines();
        setLineMetaData();
    }

    private void makeLines() {
        ListIterator<ImageView> defenseIterator = defensemen.listIterator();
        ListIterator<Line> lineIterator = lines.listIterator();


        while(defenseIterator.hasNext()) {
            lineIterator.add(new Line(defenseIterator.next(), defenseIterator.next()));
        }
    }

    private void setLineMetaData() {
        ListIterator<Line> lineIterator = lines.listIterator();

        Line line1 = lineIterator.next();
        Line line2 = lineIterator.next();
        Line line3 = lineIterator.next();
        Line line4 = lineIterator.next();
        // lines 1,2 start LTR
        line1.setDirection(false);
        line2.setDirection(false);
        // lines 3,4 start RTL
        line3.setDirection(true);
        line4.setDirection(true);
    }

    public void beginLineMovement(int speed) {
        ListIterator<Line> lineIterator = lines.listIterator();

        Line line1 = lineIterator.next();
        Line line2 = lineIterator.next();
        Line line3 = lineIterator.next();
        Line line4 = lineIterator.next();
        // lines 1,2 start LTR
        line1.move(speed);
        line2.move(speed);
        line3.move(speed);
        line4.move(speed);
    }

    public DefenseController() {
        //empty default constructor for subclasses
    }

}
