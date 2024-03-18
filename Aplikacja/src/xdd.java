public class xdd {

    public int policzSlowa(String tekst) {
        if (tekst == null || tekst.isEmpty()) {
            return 0;
        }

        String[] slowa = tekst.split("\\s+");

        return slowa.length;
    }
}