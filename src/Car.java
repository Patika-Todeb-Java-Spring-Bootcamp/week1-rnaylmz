import java.awt.Color;
import java.time.LocalDate;

    final class Car {
    private final int year;
    private final int seats;
    private final LocalDate productionYear;
    private final int kilometers;
    private final Color colour;
    private final Models models;

     Car(int year, int seats,LocalDate productionYear, int kilometers, Color colour, Models models) {
        this.year = year;
        this.seats = seats;
        this.productionYear = productionYear;
        this.kilometers = kilometers;
        this.colour = colour;
        this.models = models;
    }

   public int getYear(){
        return this.year;
    }

    public int getSeats(){
        return this.seats;
    }
    public LocalDate getProductionYear(){
        return this.productionYear;
    }
    public int getKilometers(){
        return this.kilometers;
    }
    public Color getColour(){
        return this.colour;
    }
    public Models getModels(){
        return this.models;
    }

    public void Print(){
        System.out.println("Markası: " + getModels());
        System.out.println("Üretim Tarihi: " + getProductionYear());
        System.out.println("Arabanın piyasaya çıkış yılı: " + getYear());
        System.out.println("Kişi kapasitesi: " + getSeats());
        System.out.println("Kullanılan Kilometresi: " + getKilometers());
        System.out.println("Rengi: " + getColour().getRGB());
    }


}