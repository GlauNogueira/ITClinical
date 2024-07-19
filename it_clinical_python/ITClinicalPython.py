import unittest


class MyTestCase(unittest.TestCase):
    def test_something(self):
        self.assertEqual(True, False)  # add assertion here

class TesteMaiusculas(unittest.TestCase):
    def teste_numero_maiusculas_nome(self):
        nome = "Glaucia"
        resultado = numero_letras_maiusculas(nome)
        self.assertEqual(1, resultado)


if __name__ == '__main__':
    unittest.main()
