monto = int( input("ingrese el monto: "))

if monto < 500 :
    print("descuento no aplica")
else:
    if monto >= 501 and monto <= 1000:
        descuento = monto * 0.05
    else:
        if monto >= 1001 and monto <= 7000:
            descuento = monto * 0.11
        else:
            if monto >= 7001 and monto <= 15000:
                descuento = monto * 0.18
            else:
                if monto > 15000:
                    descuento = monto * 0.25

precio_final = monto - descuento
print("el precio final es de: ", precio_final)

num = int(input("ingrese un numero del 1 al 10: "))
suma = 0


