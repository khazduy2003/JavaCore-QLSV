package character;


public abstract class Character {
    private String fullName;
    private int age;
    private String address;

    public Character(String fullName) {
        this.fullName = fullName;
    }

    // getter
    public String getFullName() {
        return fullName;
    }
    protected int getAge() {
        return age;
    }
    protected String getAddress() {
        return address;
    }

    // setter
    protected void changeInformation(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }
    public String getInformation() {
        String str="Full Name: " + fullName + "\nAge: " + age + "\nAddress: " + address;
        return str;
    }
    protected abstract void getState();
}
