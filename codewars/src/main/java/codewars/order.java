package codewars;

public class order {

    public static void main(String[] args) {
        String w = "Juan3, Pepe2 hola1";
        System.out.println(order(w));
    }

    public static String order(String words) {
        String order = "";
        String[] wordsArray = words.split(" ");

        for (int i = 1; i <= wordsArray.length; i++) {
            for (int j = 0; j < wordsArray.length; j++) {
                if (wordsArray[j].contains(Integer.toString(i))) {
                    order += wordsArray[j] + " ";
                }
            }
        }

        // Elimina el espacio en blanco adicional al final, si lo hay.
        if (!order.isEmpty()) {
            order = order.substring(0, order.length() - 1);
        }

        return order;
    }
}