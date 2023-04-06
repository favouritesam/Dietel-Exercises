package turtle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtle.Direction.*;

public class TurtleTest {
    private Turtle ijapa = new Turtle();
    private SketchPad sketchPad = new SketchPad(20,20);

    @Test
    public void thereIsATurtleTest(){

        assertNotNull(ijapa);
    }
    @Test
    public void turtleCanMovePenDownTest(){
        ijapa.movePenDown();
        assertTrue(ijapa.isPenDown());

    }
    @Test
    public void turtleCanMovePenUpTest(){
        ijapa.movePenDown();
        ijapa.movePenUp();
        assertFalse(ijapa.isPenDown());

    }
    @Test
    public void turtleCanTurnRightFacingEastTest(){
        assertSame(EAST, ijapa.getDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getDirection());

    }
    @Test
    public void turtleCanTurnRightFacingSouthTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnRightFacingWest(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH,ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnRightFacingNorth(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(EAST,ijapa.getDirection());
    }




    @Test
    public void turtleCanTurnLeftFacingEastTest(){
        assertSame(EAST,ijapa.getDirection());
        ijapa.turnLeft();
        assertSame(NORTH,ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnLeftFacingNorthTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(WEST,ijapa.getDirection());
    }
    @Test
    public void turtleCanTurnLeftFacingWestTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(SOUTH,ijapa.getDirection());

    }
    @Test
    public void turtleCanTurnLeftFacingSouthTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertSame(EAST,ijapa.getDirection());
    }
    @Test
    public void testThatTurtleCanMoveForwardFacingEast(){
        assertSame(EAST, ijapa.getDirection());
        assertFalse(ijapa.isPenDown());
        assertEquals(new Position(0, 0), ijapa.getPosition());
        ijapa.moveForward(5,sketchPad);
        ijapa.moveForward(2,sketchPad);
        assertEquals(new Position(0, 7),  ijapa.getPosition());
    }

    @Test
    public void turtleCanWriteWithPenDownWhileFacingEastTest(){
        SketchPad sketchPad = new SketchPad(20, 20);
        assertSame(EAST, ijapa.getDirection());
        assertEquals(new Position(0,0), ijapa.getPosition());
        ijapa.movePenDown();
        assertTrue(ijapa.isPenDown());
        ijapa.moveForward(5,sketchPad);
        ijapa.moveForward(5,sketchPad);
        assertEquals(new Position(0,10), ijapa.getPosition());
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[0][3]);
        assertEquals(1, floor[0][4]);
        assertEquals(1, floor[0][5]);
        sketchPad.display();
    }


}



