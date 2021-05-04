#es el ejercicio 3.4
def ejercicio04():
  #Inicio
  print("Buenos dias")
  #proceso de introduccion de datos
  horas=int(input("Cuantas horas uso o usara el estacionamiento:"))
  
  #proceso
  precio1=5
  precio2=4
  precio3=3
  saldo=0.0
  cantidad1=(horas-2)
  cantidad2=(horas-5)
  if horas>=1 and horas<=2:
    saldo=(horas*precio1)
  elif horas>=3 and horas<=5:
    saldo=(precio1*2)+(cantidad1*precio2)
  else:
    saldo=(precio1*2)+(precio2*3)+(cantidad2*precio3)
  #datos de salida
  #nose como se me ocurrio profesor. me emocione :´)
  print("El monto a pagar es:", saldo)
ejercicio04()
