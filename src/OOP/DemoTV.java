package OOP;

public class DemoTV {
    class TV {
        int chenal = 1;
        int volumlevel = 1;
        boolean on = false;

        public TV() {

        }
        public void turnOn(){
            on = true;
        }
        public void turnOff(){
            on = false;
        }

        public void setChanel(int newChanel){
            if ( on && chenal >= 1 && newChanel <=120){
                    chenal = newChanel;
            }
        }
        public void setVolumlevel(int newVolumLevel){

        }
    }
}

