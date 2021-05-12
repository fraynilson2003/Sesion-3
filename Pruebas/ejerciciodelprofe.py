
def pagoSemanaBase40horas():
  print("Pago semanal del trabajador")
  sueldoPagarSem=0.0
  #Datos de entrada
  horasTra=int(input("Ingrese horas trabajadas a la semana:"))
  horasPago=int(input("Ingrese el pago por hora:")) 
  #Proceso 
  if horasTra>40:
    sueldoPagarSem=40*horasPago+(horasTra-40)*2*horasPago
  else:
    sueldoPagarSem=horasTra*horasPago
  #Datos de salida
  print("El sueldo a pagar al trabajador es:", sueldoPagarSem)
pagoSemanaBase40horas()
