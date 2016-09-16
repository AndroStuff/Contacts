package san.contacts;

/**
 * Created by sanjit on 15/9/16.
 * Project: Contacts
 */
public class contact {
    private String name;
    private String number;

    public contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public contact() {
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name + '\n' + number;
    }
}
