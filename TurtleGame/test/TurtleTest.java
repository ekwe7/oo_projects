import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.BeforeAll;

    public class TurtleTest{

        public static Turtle turtle;

        @BeforeAll
        public static void setup(){
            turtle = new Turtle();
        }

        @Test
        public void testPenStartsUp(){
            Assertions.assertFalse(turtle.penDown, "Pen should start UP (false)");
        }

        @Test
        public void testThatPenDownMarksCurrentPosition(){
            turtle.penDown();
            Assertions.assertTrue(turtle.penDown);

            int[][] board = turtle.sketchBoard;
            Assertions.assertEquals(1, board[0][0], "Pen down mark initial position");
        }

        @Test
        public void testThatPenUpDoesNotDraw(){
            turtle.penUp();
            Assertions.assertFalse(turtle.penDown);

            turtle.move(1);

            int[][] board = turtle.sketchBoard;
            Assertions.assertEquals(1, board[0][0], "Pen up should NOT mark movement");
        }

        @Test
        public void testThatTurtleTurnRight(){
            turtle.positionRight();
            turtle.positionRight();

            Assertions.assertEquals(2, turtle.direction);
        }

        @Test
        public void testThatTurtleTurnLeft(){
            turtle.positionLeft();
            //turtle.positionLeft();

            Assertions.assertEquals(0, turtle.direction);
        }

        @Test
        public void testThatDrawingStopsAtBoundary(){
            turtle.penDown();

            turtle.positionRight();
            turtle.move(30);

            Assertions.assertEquals(0, turtle.col, "Column must stop at boundary");
        }
    }


