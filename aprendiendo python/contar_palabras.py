contador = 1
print("tienes tres intentos para ingresar tu contraeña correctamente")
while contador <= 3:
    palabra = input("Ingrese su contraseña (o 'salir' para terminar); ")
    if palabra.lower() == 'salir':
        break
    contador += 1