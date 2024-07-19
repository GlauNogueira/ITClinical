import unittest


class MyTestCase(unittest.TestCase):
    def test_something(self):
        self.assertEqual(True, False)  # add assertion here

class TesteMaiusculas(unittest.TestCase):
    def teste_numero_maiusculas_nome(self):
        nome = "Glaucia"
        resultado = numero_letras_maiusculas(nome)
        self.assertEqual(1, resultado)

    def teste_numero_maiusculas_frase(self):
        frase = "Uma String de Teste"
        resultado = numero_letras_maiusculas(frase)
        self.assertEqual(3, resultado)

    def teste_numero_maiusculas_sem_maiuscula(self):
        palavra = "gato"
        resultado = numero_letras_maiusculas(palavra)
        self.assertEqual(0, resultado)

    def teste_numero_maiusculas_nulo(self):
        nula = ""
        resultado = numero_letras_maiusculas(nula)
        self.assertEqual(0, resultado)

if __name__ == '__main__':
    unittest.main()
