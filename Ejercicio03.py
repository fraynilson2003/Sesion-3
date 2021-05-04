#este es el ejercicio 3.3
def ejercicio03():
  #Inicio
  print("Buenos dias")
  #proceso de eleccion
  saldo=int(input("¿Cuanto dinero dispone para su compra? "))
  #proceso
  opciones=""
  if saldo<=10.0:
    opciones="tarjeta"
  elif saldo>=11.0 and saldo<=100.0:
    opciones="tarjeta o chocolate"
  elif saldo>=101.0 and saldo<=250.0:
    opciones="tarjeta, chocolate o flores"
  else:
    opciones="tarjeta, chocolate, flores o un anillo"
    #datos de salida
  print("puede adquirir los siguientes elementos:", opciones)

  
ejercicio03()