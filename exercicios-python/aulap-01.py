print("Digite as tres notas: ")
nota1 = float(input("Nota 1: "))
nota2 = float(input("Nota 2: "))
nota3 = float(input("Nota 3: "))

media = (nota1 + nota2 + nota3) / 3
print("A media do aluno é: ", media)

# Exercicio 01

print("Area do Triangulo")
base = float(input("Digite a base: "))
altura = float(input("Digite a altura: "))
area = (base * altura) / 2
print("A area do triangulo é: ", area)


# Exercicio 03
print("Digite a temperatura em Celsius: ")
celsius = float(input("Celsius: "))
fahrenheit = (celsius * 9/5) + 32
print("A temperatura em Fahrenheit é: ", fahrenheit)

# Exercicio 04
print("Digite a temperatura em Fahrenheit: ")
fahrenheit = float(input("Fahrenheit: "))
celsius = (fahrenheit - 32) * 5/9
print("A temperatura em Celsius é: ", celsius)

########################################################################

# Exercicio 05
n1 = 2
n2 = 4

n3 = n1
n2 = n3
n1 = n2

print(n1)
print(n2)

print(f"Os valores originais -> a: {n1}, b: {n2}")
