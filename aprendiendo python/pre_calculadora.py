opcion = 0

while opcion != 5:    

    print("1. suma")
    print("2. resta")
    print("3. multiplicacion")
    print("4. division")        
    print("5. salir")

    opcion = int(input( "ingrese la opcion que deasea :"))

    if opcion == 1: 
        num1 = int(input("ingrese el primer numero :"))
        num2 = int(input("ingrese el segundo numero :"))
        resultado = num1 + num2
        print("el resultado de la suma es", resultado)

    elif opcion == 2:
        num1 = int(input("ingresa el primer numero :"))
        num2 = int(input("ingresa el segundo numero :"))
        resultado = num1 - num2
        print("el resultado es :", resultado)

    elif opcion == 3:
        num1 = int(input("ingresa el primer numero :"))
        num2 = int(input("ingresa el segundo numero :"))
        resultado = num1 * num2
        print("el resultado es :", resultado)


    elif opcion == 4:
        num1 = int(input("ingresa el primer numero :"))
        num2 = int(input("ingresa el segundo numero :"))
        if num2 != 0:
            resultado = num1 / num2
            print("el resultado es :", resultado)
        else:
            print("no se puede dividir por cero")

    elif opcion == 5:
        print("gracias por usar el programa")
        break