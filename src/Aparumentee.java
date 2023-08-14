public class Aparumentee {
    private String tittle;
    private int prise;
    private String address;

    public Aparumentee(String tittle, int prise, String address) {
        this.tittle = tittle;
        this.prise = prise;
        this.address = address;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int skoko(int bankAmount, int apartmentPrice) {
        return bankAmount / apartmentPrice;
    }
    public static 
}
