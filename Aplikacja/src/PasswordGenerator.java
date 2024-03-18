import java.util.Random;
public    class PasswordGenerator {
    private   String lowercase = "qwertyuiopasdfghjklzxcvbnm";
    private   String uppercase = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private   String number = "1234567890";
    public   String GeneratePassword(PasswordTypes passwordType, int size) throws Exception {
        String chars;
        Random rnd = new Random();
        String password = "";
        switch (passwordType) {
            case LowercaseLetterOnly:
                chars = lowercase;
                break;
            case MixedCaseLetter:
                chars = lowercase + uppercase;
                break;
            case UppercaseLettersOnly:
                chars =  uppercase;
                break;
            case LowerAndNumber :
                chars = lowercase + number;
                break;
            case UpperAndNumber :
                chars = number + uppercase;
                break;
            case ALL:
                chars = lowercase + uppercase + number;
                break;

            default:

                throw new Exception("Incorect PasswordType");
        }
                while (password.length()< size) {
                    int index = (int) (rnd.nextFloat() * chars.length());
                    password += chars.charAt(index);
                }
        return password;
    }
}
