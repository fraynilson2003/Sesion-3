#este es el ejercicio 3.2
def Ejercicio2():
  print("Pago semanal del trabajador")
  sueldopagarsemanal=0.0
  #datos de entrada
  horastrabajadas=int(input("ingrese horas trabajadas a la semana:"))
  preciopagadoporhora=int(input("ingrese el pago por horas:"))
  #proceso
  if horastrabajadas>40:
    sueldopagarsemanal=40*preciopagadoporhora+((horastrabajadas-40)*(2*preciopagadoporhora))
  else:
    sueldopagarsemanal=horastrabajadas*preciopagadoporhora
  #datos de salida
  print("el sueldo a pagar al trbajador es:", sueldopagarsemanal)
Ejercicio2()