precio = float(input("Ingrese el precio del producto: "))
descuento = float(input("Ingrese el porcentaje de descuento: "))
costo_total = precio - (precio * descuento / 100)

if precio >= 200:
    descuento = precio * descuento / 100
else:
    descuento = precio * descuento / 100

print(f"El costo total después del descuento es: {costo_total}")
print(f"El descuento aplicado es: {descuento}")