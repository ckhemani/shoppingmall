package Email;

public class EmailID {
    String emailID;

    public EmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    @Override
    public String toString() {
        return "EmailID{" +
                "emailID='" + emailID + '\'' +
                '}';
    }
}
