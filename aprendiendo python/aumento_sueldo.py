nombre = input("Ingrese su nombre: ")
edad = int(input("Ingrese su edad: "))
hijos = int(input("Ingrese la cantidad de hijos: "))
sueldo = float(input("Ingrese su sueldo actual: "))
aumento = 0

if edad > 50:
    aumento = aumento + 500

if hijos > 0:
    aumento = aumento + (sueldo * 0.04)

sueldo_final = sueldo + aumento

print(f"El sueldo final de {nombre} es: {sueldo_final}")
print(f"El aumento total es: {aumento}")
# Programa para calcular el aumento de sueldo basado en edad y cantidad de hijos
