while True:
    eres = (input("De que color eres?: "))
    if eres.lower() == "soy negro":
        print("acceso denegado, Intentelo de nuevo")
        continue
    elif eres.lower()== "soy blanco":
        print("acceso admitido")   
    else:
        print("denegado")
        continue

        # Si el usuario tiene acceso, preguntar edad
    while True:  
        try:  
            acceso_admitido = int(input("¿Qué edad tienes? "))  
            
            if acceso_admitido >= 18:  
                print("¡Repórtate para el deber!")  
            else:  
                print("Vete a estudiar o balacear una escuela.")  
                continue

            reportate_para_el_deber = input("¿Vas a reportarte? (si/no): ").lower()  

            if reportate_para_el_deber == "si":  
                print("5 * 5 - 12 / 8 + 5")  
                  # Termina solo si dice "si"  
        except ValueError:  
            print("Por favor, resuelva el ejercicio.")
            resuelto = input("¿Resuelto? (si/no): ").lower()
            if resuelto == "si":
                print("¡Bien hecho!")
                break