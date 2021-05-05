#Es el ejercicio 3.12}
def ejercicio10():
  #Inicio
  print("Buenos dias")
  #Ingreso de datos
  horas=int(input("¿Cuantas hora de trabajo realizao esta semana?:"))
  preciohora=float(input("¿Cual es precio por hora de trabajo?:"))
  #Proceso
  sueldo:0.0
  mensaje=""
  if horas<=40:
    sueldo=horas*preciohora
  elif horas>=41 and horas<=45:
    sueldo=(preciohora*40)+((horas-40)*2*preciohora)
  elif horas>=46 and horas<=50:
    sueldo=(preciohora*40)+((45-40)*preciohora*2)+((horas-45)*3*preciohora)
  else:
    sueldo=(preciohora*40)+((50-45)*2*preciohora)+((50-45)*3*preciohora)

  if horas<=50:
    mensaje="Su sueldo de esta semana es de:"
  else:
    mensaje="El limite de horas de trabajo maximo es de 50 horas, por lo tanto su sueldo es de"  
  print(mensaje, sueldo)
ejercicio10()