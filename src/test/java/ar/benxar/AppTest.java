package ar.benxar;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void test1() {
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
        assertTrue( bp.getHeaviestBall(balls) == 7 );
    }

    @Test
    public void test2() {
        BallsProblem bp = new BallsProblem();
        List<Ball> balls =  new ArrayList<Ball>();
        balls.add(new Ball(1,1));
        balls.add(new Ball(2,2));
        balls.add(new Ball(3,1));
        balls.add(new Ball(4,1));
        balls.add(new Ball(5,1));
        balls.add(new Ball(6,1));
        balls.add(new Ball(7,1));
        balls.add(new Ball(8,1));
        assertTrue( bp.getHeaviestBall(balls) == 2 );
    }

    @Test
    public void test3() {
        BallsProblem bp = new BallsProblem();
        List<Ball> balls =  new ArrayList<Ball>();
        balls.add(new Ball(1,1));
        balls.add(new Ball(2,1));
        balls.add(new Ball(3,1));
        balls.add(new Ball(4,2));
        balls.add(new Ball(5,1));
        balls.add(new Ball(6,1));
        balls.add(new Ball(7,1));
        balls.add(new Ball(8,1));
        assertTrue( bp.getHeaviestBall(balls) == 4 );
    }
}
