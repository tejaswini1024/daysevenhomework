package daysevenhomework;

public class PC {


// A class really just has a few things
// access/abstraction modifiers
// instance variables/methods
// constructor



        // Create instance variables
        Case pcCase;
        MotherBoard motherboard;
        Monitor monitor;

        //create parameterized constructor with all ivar
        public PC (Case pcCase,MotherBoard motherboard,Monitor monitor) {
            this.pcCase = pcCase;
            this.motherboard = motherboard;
            this.monitor = monitor;

        }



        private void drawLogo() {

            monitor.drawPixel(10,10,"PurpleS");
        }
        public void description(){
            //printing objects

            System.out.println("Welcome to the worst buy below is the description of the pc on sale today" + "\n" + monitor +"\n"+ pcCase + "\n" + motherboard );

        }

        @Override
        public String toString() {
            return "PC{" +
                    "pcCase=" + pcCase +
                    ", motherboard=" + motherboard +
                    ", monitor=" + monitor +
                    '}';
        }
        public void powerUp(){
            pcCase.pressPowerButton();
            this.drawLogo();
            motherboard.loadProgram("Photoshop");


        }
    }

