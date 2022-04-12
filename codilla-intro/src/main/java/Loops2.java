public class Loops2 {
    public static void main(String[] args) {
        String[] names = new String[4];
        names [0] = "Zygfryd";
        names [1] = "Gwidon";
        names [2] = "Florentyna";
        names [3] = "Natalka";
        int numberOfElements = names.length;
        System.out.println("Tablica zawiera elementow:" + numberOfElements);
        for (int i = names.length - 2; i >= 0; i--) {
            System.out.println(names[i]);
        }
    }
}
