num_personas = int(input("Ingrese el numero de personas: "))
costo_por_persona = float(input("Ingrese el costo por persona: "))
costo_total = num_personas * costo_por_persona

if num_personas < 5:
    costo_por_persona = 20
else:
    if num_personas >= 5 and num_personas <= 8:
        costo_por_persona = 18
    else:
        if num_personas > 9 and num_personas <= 12:
            costo_por_persona = 15
        else:
            if num_personas > 15:
                costo_por_persona = 12.5
            else:
                costo_por_persona = 15

print(f"El costo por persona es: {costo_por_persona}")
print(f"El costo total es: {costo_total}")