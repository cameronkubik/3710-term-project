package cmk0037.spring2018.comp3710.csse.eng.auburn.edu.aubieball;

import android.widget.ImageView;

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
        /*Line line2 = lineIterator.next();
        Line line3 = lineIterator.next();
        Line line4 = lineIterator.next();*/
        // lines 1,2 start LTR
        line1.setDirection(false);
        line1.setInitialMargins(200, 650);
        //line2.setDirection(false);
        //ine2.setInitialMargins(100, 450);
        // lines 3,4 start RTL
        //line3.setDirection(true);
        //line3.setInitialMargins(400, 400);
        //line4.setDirection(true);
        //line4.setInitialMargins(600, 200);
    }

    public void beginLineMovement(int speed) {
        ListIterator<Line> lineIterator = lines.listIterator();

        Line line1 = lineIterator.next();
        /*Line line2 = lineIterator.next();
        Line line3 = lineIterator.next();
        Line line4 = lineIterator.next();*/
        // lines 1,2 start LTR
        line1.orchestrateMovement(speed);
        /*line2.orchestrateMovement(speed);
        line3.orchestrateMovement(speed);
        line4.orchestrateMovement(speed);*/
    }

    public DefenseController() {
        //empty default constructor for subclasses
    }

}
