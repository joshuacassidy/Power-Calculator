public class Power {

    public int raiseTo(int num, int power) {
        if (power==1) {
            return num;
        } else {
            return raiseTo(num * num, power - 1);
        }
    }

}
