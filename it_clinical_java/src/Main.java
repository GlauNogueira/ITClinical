import org.junit.Assert;
import org.junit.Test;

public class Main {
    @Test
    public void teste_numero_maiusculas_nome(){
        String nome = "Glaucia";
        int resultado = numero_letras_maiusculas(nome);
        Assert.assertEquals(1, resultado);
    }
    @Test
    public void teste_numero_maiusculas_frase(){
        String frase = "Uma String de Teste";
        int resultado = numero_letras_maiusculas(frase);
        Assert.assertEquals(3, resultado);
    }
    @Test
    public void teste_numero_maiusculas_sem_maiuscula(){
        String palavra = "gato";
        int resultado = numero_letras_maiusculas(palavra);
        Assert.assertEquals(0, resultado);
    }
    @Test
    public void teste_numero_maiusculas_nulo(){
        String nula = "";
        int resultado = numero_letras_maiusculas(nula);
        Assert.assertEquals(0, resultado);
    }
    public int numero_letras_maiusculas(String nome){
        int maiusculas = -1;
        return maiusculas;
    }
}
