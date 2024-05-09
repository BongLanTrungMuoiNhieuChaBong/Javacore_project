public class User {
    private String username;
    private String address;
    private int number;

    public User() {
    }

    public User(String username, String address, int number) {
        this.username=username;
        this.address = address;
        this.number = number;
    }
    public String getUsername(){
        return username;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
