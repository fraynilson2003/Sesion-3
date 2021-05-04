#este es el ejercicio 3.1
def ejercicio01():
  print ("Como saber si puedes votar por tu edad")
  mensaje=""
  #Ingreso de datos
  edadP=int(input("ingrese la edad que tiene:"))
  #Proceso
  if edadP>=18:
    mensaje="Usted tiene la edad necesaria para votar"
  else:
    mensaje="Usted no cumple con la edad minima para votar"
  print(mensaje)
ejercicio01()