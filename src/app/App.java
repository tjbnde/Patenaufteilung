package app;

public class App {
    static String[] patenKinder = {
        "Finn", "Robin", "Adrian", "Patryk", "Johannes", "Leon", "Marius", "Noah", "Niklas", "Das Mädchen"
    };

    static String[] wwi18sea = {
        "Ali", "Calo", "Daniel", "Jan", "Jonas", "Mahmoud", "Marcel", "Anton", "Sinan", "Tristan", "Tizian", "Tobias", "Benno", "Katlene"
    };

    //static String[] takenPatenKinder = new String[patenKinder.length];
    static String[] takenWwi18sea = new String[patenKinder.length];

    public static void main(String[] args) throws Exception {
        for(String patenKind : patenKinder) {
            // Generate random wwi18sea
            boolean check = false;
            while(!check) {
                check = true;
                int rnd = (int) Math.floor(Math.random() * wwi18sea.length);

                for(String s : takenWwi18sea) {
                    if (s == wwi18sea[rnd]) {
                        check = false;
                    }
                }

                if(check) {
                    // Add rnd wwi18sea to taken array
                    // Print out pair
                    boolean done = false;
                    for(int i = 0; i < takenWwi18sea.length && !done; i++) {
                        if(takenWwi18sea[i] == null) {
                            takenWwi18sea[i] = wwi18sea[rnd];
                            done = true;
                        }
                    }
                    takenWwi18sea[0] = wwi18sea[rnd];
                    System.out.println(patenKind + ": " + wwi18sea[rnd]);
                }
            }
        }
    }
}