package iteration4.model;

public class De {
    private int value;

    public De() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void lancer() {
        // valeur aléatoire entre 1 et 6
        this.value = (int) (Math.random() * 6) + 1;
    }

    public void lancerTest(){
        this.value = 6;
    }

}
