#es el ejercicio 3.10
def ejercicio08():
  #Inicio
  print("Binvenido a Tortuga, la linea de autobuses que ofrece viajes fantasticos")
  #Ingreso de datos
  #el problema no menciona el precio por un kilometro
  print("Estos son nuestros destinos:")
  print("Mexico 750 km")
  print("P.V. 800 km")
  print("Acapulco 1200 km")
  print("Cancun 1800 km")
  print("El precio por kilometro es de S/ 1.00")
  saldo=int(input("Cuanto dinero dispone para su viaje:"))
  #Proceso
  destino=""
  precioporkilometro=1

  if saldo<750:
    destino="Lo sentimos, no tenemos ningun viaje para usted"
  elif saldo>=750 and saldo<800:
    destino="Solo dispone para un viaje de ida a Mexico"
  elif saldo>=800 and saldo<1200:
    destino="Los destinos que dispone para un viaje de ida son: Mexico y P.V."
  elif saldo>=1200 and saldo<1500:
    destino="Los destinos que dispone para un viaje de ida son: Mexico, P.V, y Acapulco"
  elif saldo>=1500 and saldo<1600:
    destino="Los destinos que posee para un viaje de ida y vuelta son: Mexico. Y para un viaje solo de ida son: P.V. y Acapulco"
  elif saldo>=1600 and saldo<1800:
    destino="Los destinos que posee para un viaje de ida y vuelta son: Mexico, P.V. Y para un viaje solo de ida son: Acapulco"
  elif saldo>=1800 and saldo<2400:
    destino="Los destinos que posee para un viaje de ida y vuelta son: Mexico, P.V. Y para un viaje solo de ida son: Acapulco y Cancun"
  elif saldo>=2400 and saldo<3600:
    destino="Los destinos que posee para un viaje de ida y vuelta son: Mexico, P.V, Acapulco. Y para un viaje solo de ida son: Cancun"
  elif saldo>=3600:
    destino="Los destinos que posee para un viaje de ida y vuelta son: Mexico, P.V, Acapulco y Cancun."
  #Datos de salida
  print(destino)
ejercicio08()