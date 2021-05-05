def notaPostulanteEstMultiple():
  #Definir Variables
  notaFinal=0
  #Datos de entrada  
  areaCarrera=input("Introduce el area a la que corresponde tu carrera:\nB=Biomedicas\nI=Ingenieria\nS=Sociales")  
  notaEP=float(input("Ingrese la nota de EP:"))
  notaRM=float(input("Ingrese la nota de RM:"))
  notaRV=float(input("Ingrese la nota de RV:"))
  notaAB=float(input("Ingrese la nota de AB:"))
  #Proceso
  if areaCarrera=="B":    
    notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.20)+(notaAB*0.30)
    areaCarrera="Biomedicas"
  elif areaCarrera=="I":
    notaFinal=(notaEP*0.40)+(notaRM*0.30)+(notaRV*0.15)+(notaAB*0.15)
    areaCarrera="Ingenierias"
  elif areaCarrera=="S":
    notaFinal=(notaEP*0.40)+(notaRM*0.10)+(notaRV*0.30)+(notaAB*0.20)
    areaCarrera="Sociales"
  else:
    print("La opcion que ingreso no es valida...intente nuevamente!.")
  print("El postulante obtuvo un nota de:",notaFinal,"\nY su carrera corresponde al area de:",areaCarrera)         



notaPostulanteEstMultiple()