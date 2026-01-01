import java.util.Scanner;

public class TurtleMain {
    public static void main(String...ekwe){

        Scanner input = new Scanner(System.in);
        Turtle turtle= new Turtle();

            System.out.print("""
	======My Turtle chesBoard=====
	1. Pen Up
	2. Pen Down
	3. Turn Right
	4. Turn Left
	5. Move (Enter number of steps)
	6. Print Floor
	-1. End Program

	""");

            int command = 0;

            while (command != -1){
                command = input.nextInt();
                switch(command){
                    case 1:
                        turtle.penUp();
                        System.out.println("pen Up");
                        break;
                    case 2:
                        turtle.penDown();
                        System.out.println("pen Down");
                        break;
                    case 3:
                        turtle.positionRight();
                        System.out.println("Tur right");
                        break;
                    case 4:
                        turtle.positionLeft();
                        System.out.println("Turn left");
                        break;
                    case 5:
                        System.out.print("ENter number of movement ");
                        int numberMove = input.nextInt();
                        turtle.move(numberMove);
                        System.out.println("you moved " +numberMove+ "steps");
                        break;
                    case 6:
                        System.out.println("Your are drawing");
                        turtle.displaySketchBoard();
                        break;

                    case -1:
                        System.out.println("See you Bye");
                        break;
                    default:
                        System.out.println("invalid");
                        break;
                }


            }



        }


    }

