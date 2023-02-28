import java.time.LocalDate;

public class Vine {
    private String name;
    private String brand;
    private String country;
    private LocalDate dateOfBirth;

    public Vine(String name, String brand, String country, LocalDate dateOfBirth) {
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Vine\n" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", country='" + country + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
