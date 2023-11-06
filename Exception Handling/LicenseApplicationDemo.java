class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class LicenseApplication {
    public void applyForLicense(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to apply for a vehicle license.");
        } else {
            System.out.println("License application accepted. Age: " + age);
        }
    }
}
public class LicenseApplicationDemo {
    public static void main(String[] args) {
        LicenseApplication licenseApp = new LicenseApplication();

        try {
            int appage2=98;
            int applicantAge = 17; // Change the age to test the exception
            licenseApp.applyForLicense(appage2);
            licenseApp.applyForLicense(applicantAge);
        } catch (InvalidAgeException e) {
            System.err.println("InvalidAgeException: " + e.getMessage());
        }
    }
}

