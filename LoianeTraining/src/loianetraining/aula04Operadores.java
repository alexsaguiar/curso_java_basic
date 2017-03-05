package loianetraining;

public class aula04Operadores {

    public static void main(String[] args) {
        /* -- Operadores --
        +  adição
        -  subtração
        *  multiplicação
        /  divisão
        %  módulo  (resto da divisão)
        ++ incremento (pos ou pré fixo - acrescenta)
        -- decremento (pos ou pré fixo - retira)
         */

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado = resultado * 1;
        System.out.println(resultado);

        resultado = resultado / 1;
        System.out.println(resultado);

        /*
           Operadores relacionais
        ==  igual a 
        != dirente de 
        > maior
        < menor
        >= maior ou igual
        <= menor ou igual
         */
 /*
            Operadores lógicos
        &  and  
        |  or
        ^  xor
        || or curto circuito
        && and curto circuito
        !  not
        
        
         */
        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("valor1 é and valor2 é - resultado: " + resultado1);

        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("valor1 é and valor2 é - resultado: " + resultado2);

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(verdadeiro && falso);

    }

}
