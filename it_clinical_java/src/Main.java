import org.junit.Assert;
import org.junit.Test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    @Test
    public void teste_numero_maiusculas(){
        String nome = "Glaucia";
        int resultado = numero_letras_maiusculas(nome);
        Assert.assertEquals(1, resultado);
    }
    public int numero_letras_maiusculas(String nome){
        int maiusculas = 0;
        return maiusculas;
    }
}
