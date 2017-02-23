
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linj4653
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // create new city kw
        City kw = new City();
        
        //create robot karel
        RobotSE karel = new RobotSE(kw, 4, 0, Direction.EAST);
        
        //set up staircase
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
        
        //setting up lights
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        
        //making karel move up the staircase and pick up lights
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.pickThing();
        
        //making karel move and drop lights along the way
        karel.move();
        karel.putThing();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.turnLeft();
        karel.putThing();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.putThing();
        karel.turnLeft();
        karel.move();

    }
}

