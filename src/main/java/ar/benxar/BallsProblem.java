package ar.benxar;

import java.util.List;

public class BallsProblem {

    private int scaleCounter = 0;

    public int getHeaviestBall(List<Ball> balls) {
        List<Ball> sublistA = balls.subList(0, 6);
        List<Ball> sublistB = balls.subList(6, 8);
        List<Ball> firstScale = this.scale(sublistA);

        Integer result = null;
        if(firstScale !=null) {
            List<Ball> secondScale = this.scale(firstScale.subList(0, 2));
            if (secondScale == null) {
                result = firstScale.get(2).getNumber();
            } else {
                result = secondScale.get(0).getNumber();
            }
        } else {
            List<Ball> secondScale = this.scale(sublistB);
            result = secondScale.get(0).getNumber();
        }
        return result;
    }


    public List<Ball> scale(List<Ball> balls) {
        this.scaleCounter++;
        List<Ball> subListA =  balls.subList(0, balls.size()/2);
        List<Ball> subListB =  balls.subList(balls.size()/2, balls.size());

        if (this.sum(subListA) > this.sum(subListB)) {
            return subListA;
        } else if ( this.sum(subListA) < this.sum(subListB)){
            return subListB;
        }
        return null;
     }

     private Integer sum(List<Ball> balls) {
        return balls.stream()
            .map(x -> x.getWeight())
            .reduce(0, Integer::sum);
     }

    public int getScaleCounter() {
        return scaleCounter;
    }
}