while True:
    print("Bienvenido a tu calculadora personalizada")
    print("Operaciones disponibles: suma, resta, multiplicacion, division")
    ope= str(input("Ingrese su operacion: "))
    
    cantidad_numeros = int(input("¿Cuántos números desea operar?: "))
    numeros = []

    for i in range(cantidad_numeros):
        num = float(input(f"Ingrese el número {i + 1}: "))
        numeros.append(num)
   
    if ope == "suma":
        resultado = sum(numeros)
        print("El resultado es: ", resultado)
    elif ope == "resta":
        resultado = numeros[0]
        for num in numeros[1:]:
            resultado -= num
        print("El resultado es: ", resultado)
    elif ope == "multiplicacion":
        resultado = 1
        for num in numeros:
            resultado *= num
        print("El resultado es: ", resultado)
    elif ope == "division":
        resultado = numeros[0]
        for num in numeros[1:]:
            if num == 0:
                print("Error: División por cero no permitida.")
                break
            resultado /= num
        else:
            print("El resultado es: ", resultado)

    repeat = str(input("Desea realizar otra operacion? (si/no): "))
    if repeat.lower() != "si":
        print("Gracias por usar la calculadora. ¡Hasta luego!")
        break
 

  