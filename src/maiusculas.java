public class maiusculas {
    public static void main (String[]args){
        String texto = "Desenvolvimento é muito legal";
        String troca = "Programação";
        String fica = texto.replace("Desenvolvimento", troca);

        String maiusculas = fica.toUpperCase();

        System.out.println(maiusculas);

    }
}
