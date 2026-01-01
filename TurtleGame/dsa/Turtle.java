public class Turtle {

        static int[][] sketchBoard = new int[20][20];
        static int row = 0;
        static int col = 0;
        static int direction = 0;
        static boolean penDown = false;


        public void displaySketchBoard(){

            for(int row = 0; row < 20; row++){
                for(int col = 0; col < 20; col++){

                    int result = sketchBoard[row][col];
                    if(result == 1){
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

        }

        public void move(int step){

            for(int index = 0; index < step; index++){

                int rowMove = row;
                int colMove = col;


                if(direction == 0){
                    colMove++;
                }else if(direction == 1){
                    rowMove++;
                }else if(direction == 2){
                    colMove--;
                }else if(direction == 3){
                    rowMove--;
                }


                if(rowMove < 0 || rowMove >= 20 || colMove < 0 || colMove >= 20){
                    break;
                }

                if(penDown) markPosition();

                row = rowMove;
                col = colMove;


            }
        }

        private void markPosition(){

            sketchBoard[row][col] = 1;
        }

        public void penUp(){
            penDown = false;

        }

        public void penDown(){
            penDown = true;
            sketchBoard[row][col] = 1;

        }

        public void positionRight(){

            direction = (direction + 1) % 4;

        }

        public void positionLeft(){
            direction = (direction + 3) % 4;

        }

    }



