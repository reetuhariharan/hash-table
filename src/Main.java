public class Main {

    public static void main(String[] args) {

        AutocompleteSystem auto = new AutocompleteSystem();

        auto.addQuery("java tutorial");
        auto.addQuery("java interview");
        auto.addQuery("javascript course");

        System.out.println("Suggestions for 'jav':");
        auto.suggest("jav");
    }
}