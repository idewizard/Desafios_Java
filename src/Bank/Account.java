package Bank;

public class Account extends Client  {

    private Client client;
    private int number;
    private int password;

    public Account(Client client, int number, int password) {
        super(client.getName(), client.getAddress());
        this.client = client;
        this.number = number;
        this.password = password;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
