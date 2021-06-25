public class TestaCaracteres {
    public static void main(String[] args){
        
        char letra = 'a';
        System.out.println(letra);

        char valor = 65;
        System.out.println(valor);

        //valor = valor + 1;
        //System.out.println(valor) //não compila ! pois o java 
        //transforma para o maior tipo, nesse cado: int
        
        //Para compilar devemos fazer:
        valor = (char) (valor + 1);
        System.out.println(valor); //não compila !

    }
}
