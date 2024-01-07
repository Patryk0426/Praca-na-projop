import java.util.Random;
public    class PasswordGenerator {
    private   String _lowercase = "qwertyuiopasdfghjklzxcvbnm";
    private   String _uppercase = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private   String _number = "1234567890";
    public   String GeneratePassword(PasswordTypes passwordType, int size) throws Exception {
        String chars;
        Random rnd = new Random();
        String password = "";
        switch (passwordType) {
            case LowercaseLetterOnly:
                chars = _lowercase;
                break;
            case MixedCaseLetter:
                chars = _lowercase + _uppercase;
                break;
            case UppercaseLettersOnly:
                chars =  _uppercase;
                break;
            case LowerAndNumber :
                chars = _lowercase + _number;
                break;
            case UpperAndNumber :
                chars = _number + _uppercase;
                break;
            case ALL:
                chars = _lowercase + _uppercase + _number;
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
