#es el ejercicio 3.6
def ejercicio05():
  #inicio
  print("Buenos dias")
  #introduccion de datos
  precio=int(input("ingrese el precio del producto:"))
  #proceso
  pago=0.0
  descuento1=precio*0.10
  descuento2=precio*0.12
  descuento3=precio*0.15
  if precio<100:
    pago=precio-descuento1
  elif precio<100 and precio<200:
    pago=precio-descuento2
  else:
    pago=precio-descuento3
  descuento=precio-pago

  #datos de salida
  print("El precio bruto es:", precio)
  print("El descuento es", descuento)
  print("El monto a pagar es:", pago)
ejercicio05()
    


