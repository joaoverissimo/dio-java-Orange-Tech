public class OperadorTernário {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;
        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        
        System.out.println(resultado);


        //o operador ternário escreveria : String resultado = a == b ? "verdadeiro" : "falso";
    
    }
}
