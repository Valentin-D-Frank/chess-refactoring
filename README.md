# chess-refactoring
Refactorización de aplicación de ajedrez

En el presente repositorio se realizo el mantenimiento y refactorizacion de una aplicacion Java, para ello se utilizo SonarQube para detectar los Code Smells, por otro lado se emploe el plugin CodeMetrics en el IDE IntelliJIdea para obtner la complejidad ciclomatica de los metodos de la presente aplicacion.

En este repositorio se encuentra tambien como evidencia la carpeta **Complejidad Inicial** en la que se encuentran capturas de la complejidad de los metodos de la aplicacion, esta parte del analisis me permitio conocer que clases eran las que tenian mayor complejidad, las cuales en el proceso de refactorizacion fueron descompuestas en metodos con responsabilidad unica.

Tambien como evidencia se encuentra la carpeta ** Sonar Evidencia Avances **, en la que se encuentran capturas del analisis y escaneo realizado con SonarQube, en dichas capturas se puede apreciar el avance sistematico que se realizo partiendo de los paquetes previamente separados conforme a la programacion orientada objetos. Partiendo de aquellas clases con menor cantidad de Code Smells para finalmente llegar a las que contenian el mayor porcentaje en el proyecto.

# Antes de Refactorizacion

![alt text](https://github.com/Valentin-D-Frank/chess-refactoring/blob/master/Sonar%20Evidencia%20Avances/Sonar1.png)

# Despues de Refactorizacion

![alt text](https://github.com/Valentin-D-Frank/chess-refactoring/blob/master/Sonar%20Evidencia%20Avances/Sonar_Refactor_7_Final.png)
