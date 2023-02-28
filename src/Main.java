import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vine vine = new Vine("Drevniy", "Merlo", "Russia", LocalDate.of(1896, 9, 6));
        Vine vine1 = new Vine("Kabarne", "Merlo", "Russia", LocalDate.of(1998, 1, 26));
        Vine vine2 = new Vine("Legend", "Inkermana", "Italy", LocalDate.of(2000, 9, 3));
        Vine vine3 = new Vine("Kagor", "Merlo", "Ukraine", LocalDate.of(1976, 2, 6));
        Vine[] vines = new Vine[5];
        VineMaker vineMaker = new VineMaker(4, "Moscow", vines);
        System.out.println(vineMaker);
        vines[0] = vine;
        vines[1] = vine1;
        vines[2] = vine2;
        vines[3] = vine3;
        vines[4] = vineMaker.newVine(vines);
        System.out.println(vineMaker);
        vineMaker.data();

    }
}