print("Hola porfavor ingrese su usuario:")
while True:
    usuario = (input("ingrese su usuario: "))
    if len(usuario) > 5:
        print("usuario valido")
        break
    print("Usuario no válido, debe tener al menos 6 caracteres")
    

nombre = (input("escribe tu nomrbe en clave: ")) 
edad = float(input("escribe tu edad: "))
 

if edad >= 18:
    print("acceso admitido")
    
else:
    print("acceso denegado")
        
while True:
    if edad >= 18:
        print("Recuerda rellenar tus actividades")
       
    elif edad <= 17:
        print("no puedes entrar aqui")
    break