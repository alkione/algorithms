public class HundredDoors {

    private static final int NUMBER_OF_DOORS = 100;
    private static final int NUMBER_OF_PASSAGES = 100;
    boolean[] corridor = new boolean[NUMBER_OF_DOORS];
    HundredDoors(){
        for (int i = 0; i < NUMBER_OF_DOORS; i++) {
            corridor[i] = false;
        }

        openAndCloseDoors();
    }

    void openAndCloseDoors(){
        for (int i = 0; i <NUMBER_OF_PASSAGES ; i++) {
            for (int j = 0; j <i ; j++) {
                corridor[i] = !corridor[i];
            }
        }
    }

    boolean isDoorOpen(int doorNumber){
        if (doorNumber < NUMBER_OF_DOORS){
            return corridor[doorNumber];
        }
        return false;
    }
}

