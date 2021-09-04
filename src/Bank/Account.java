package Bank;

public class Account extends Client  {


    private int number;
    private int password;

    public Account(String name, String address, int number, int password) {
        super(name,address);
        this.number = number;
        this.password = password;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
