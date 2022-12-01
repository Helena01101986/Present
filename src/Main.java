public class Main {
    public static void main(String[] args) {

        int count = 350;
        int payment = 1500;

        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}