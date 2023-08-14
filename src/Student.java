public class Student {
    private String fio;
    private int phoneNomber;
    private String address;
    private int bank;

    public Student(String fio, int phoneNomber, String address, int bank) {
        this.fio = fio;
        this.phoneNomber = phoneNomber;
        this.address = address;
        this.bank = bank;
    }

    public Student(){

    }
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getPhoneNomber() {
        return phoneNomber;
    }

    public void setPhoneNomber(int phoneNomber) {
        this.phoneNomber = phoneNomber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }
}
