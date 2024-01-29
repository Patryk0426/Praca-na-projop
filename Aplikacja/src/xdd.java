public class xdd {

    public int policzSlowa(String tekst) {
        if (tekst == null || tekst.isEmpty()) {
            return 0;
        }

        String[] slowa = tekst.split("\\s+"); // Rozdzielanie tekstu na słowa

        return slowa.length;
    }
}