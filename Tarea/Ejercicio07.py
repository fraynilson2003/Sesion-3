#Ejercicio 3.8
def ejercicio07():
  #Inicio
  print("Buenos dias")
  #ingreso de datos
  años=int(input("Ingrese sus años de labor:"))
  sueldo=float(input("Ingrese su sueldo laboral:"))
  #Proceso
  sueldototal=0.0
  sueldototal1=0.0
  sueldototal2=0.0
  if años>2 and años<5:
    sueldototal1=(sueldo*0.2)
  else:
    sueldototal1=(sueldo*0.3)

  if sueldo<1000:
    sueldototal2=(sueldo*0.25)
  elif sueldo>=1000 and sueldo<=3500:
    sueldototal2=(sueldo*0.15)
  elif sueldo>3500:
    sueldototal2=(sueldo*0.1)
  
  if sueldototal1>sueldototal2:
    sueldototal=sueldototal1
  elif sueldototal2>sueldototal1:
    sueldototal=sueldototal2
  
  #Datos de salida
  print("El Bono que recibira es de:", sueldototal)
ejercicio07()


    

  

  
  
