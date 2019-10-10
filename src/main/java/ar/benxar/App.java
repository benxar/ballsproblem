package ar.benxar;

import java.util.ArrayList;
import java.util.List;

/**
 * Balls Problem
 *
 */
public class App 
{
    public static void main( String[] args ) {

        BallsProblem bp = new BallsProblem();
        List<Ball> balls =  new ArrayList<Ball>();
        balls.add(new Ball(1,1));
        balls.add(new Ball(2,1));
        balls.add(new Ball(3,1));
        balls.add(new Ball(4,1));
        balls.add(new Ball(5,1));
        balls.add(new Ball(6,1));
        balls.add(new Ball(7,2));
        balls.add(new Ball(8,1));

        System.out.println("Heaviest Ball:" + bp.getHeaviestBall(balls));
        System.out.println("Number of Scales:" + bp.getScaleCounter());
    
    }
}
