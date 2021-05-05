#Es el ejercicio 3.11
def ejercicio09():
  #Inicio
  print("Buenos dias")
  #Introducccion de datos
  años=int(input("¿Cuantos años lleva trabajando?:"))
  #Proceso
  bono=0.0
  mensaje=""
  cantidad=años*100
  if años>=1 and años<=5:
    bono=cantidad
  elif años>5:
    bono=1000
  else:
    bono="Datos nulos, vuelva a intertarlo"

  
  #Datos de salida
  print("Su bono es de:", bono)
ejercicio09()

   
  
