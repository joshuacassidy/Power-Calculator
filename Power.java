public class Power {

    public int raiseTo(int num, int power) {
        if (power==1) {
            return num;
        } else {
            return num * raiseTo(num, power - 1);
        }
    }

}
