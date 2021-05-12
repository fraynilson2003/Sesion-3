def suma10NumerosMientras():
  contador=1
  sumaNumeros=0.0
  while contador<=10:
    numeros=float(input(f"Ingrese el valor en la posicion {contador}:"))
    sumaNumeros=sumaNumeros+numeros
    contador=contador+1
  print(f"La suma de los 10 numeros es: {sumaNumeros}")

#suma10NumerosMientras()

def suma10NumerosPara():  
  sumaNumeros=0.0
  for contador in range(1,11):
    numeros=float(input(f"Ingrese el valor en la posicion {contador}:"))
    sumaNumeros=sumaNumeros+numeros
  print(f"La suma de los 10 numeros es: {sumaNumeros}")
suma10NumerosPara()