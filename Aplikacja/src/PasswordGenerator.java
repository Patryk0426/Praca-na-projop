import java.util.Random;
public    class PasswordGenerator {
    private   String _lowercase = "qwertyuiopasdfghjklzxcvbnm";
    private   String _updarcase = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private   String _specials = "!@#$%^&*()<>,.:;{}[]|?/+=-_";
    public   String GeneratePassword(PasswordTypes passwordType, int size) throws Exception {
        String chars;
        Random rnd = new Random();
        String password = "";
        switch (passwordType) {
            case LowercaseLetterOnly:
                chars = _lowercase;
                break;
            case MixedCaseLetter:
                chars = _lowercase + _updarcase;
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
