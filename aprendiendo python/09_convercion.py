temperatura = float(input("Ingrese temperatura:"))
escala = input("Es farenhigt(f) o es celcius(c)?:").lower()

if escala == "f":
    celcius = (temperatura - 32) * 5/9
    print(celcius)
elif escala == "c":
    farenhigt = temperatura * 1.8 + 32
    print(farenhigt)
else:
    print("escala incorrecta")