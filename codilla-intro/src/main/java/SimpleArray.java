public class SimpleArray {
    public static void main (String[] args) {
        String[]name=new String[5];
        name[0] = "Max";
        name[1] = "Margaryta";
        name[2] = "Svitlana";
        name[3] = "Molly";
        name[4] = "Natalia";
        String names=name[3];
        System.out.println(names);
        int numberOfElements = name.length;
        System.out.println(numberOfElements);
    }
}
