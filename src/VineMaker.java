import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

public class VineMaker implements Methods {
    private int experience;
    private String address;
    private Vine[] vineMaking;

    public VineMaker(int experience, String address, Vine[] vineMaking) {
        this.experience = experience;
        this.address = address;
        this.vineMaking = vineMaking;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Vine[] getVineMaking() {
        return vineMaking;
    }

    public void setVineMaking(Vine[] vineMaking) {
        this.vineMaking = vineMaking;
    }

    @Override
    public String toString() {
        return "VineMaker{" +
                "experience=" + experience +
                ", address='" + address + '\'' +
                ", vineMaking=" + Arrays.toString(vineMaking) +
                '}';
    }

    @Override
    public String data() {
        for (Vine v : vineMaking) {
            long a = Period.between(v.getDateOfBirth(), LocalDate.now()).getYears();
            System.out.println(v.getName() + " " + "years:" + "" + a);
        }

        return "";
    }

    @Override
    public Vine newVine(Vine [] vines) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("name?");
        String name = scanner.nextLine();
        System.out.println("brand?");
        String brand= scanner.nextLine();
        System.out.println("Country?");
        String country= scanner.nextLine();
        System.out.println("Data?");
        LocalDate date= LocalDate.of(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
        Vine vine =new Vine(name,brand,country,date);
        return vine;
    }
}
