# DecemberLabsAutomation

tener instalado jdk 8
tener instalado maven 3.6 o superior

## Instalar dependencias
mvn clean install

## Ejecutar tests

run TestRunner


### Solucion

    • Descargar todas las dependencias mediante maven 
    • Ejecutar desde la .java TestRunner se encuentra entro de package testRunner 

    • Se crea una feature con dos escenarios  donde se define el comportamiento para el desarrollo.
    • En estos escenarios se validan los puntos solicitados.
    • Se aplica el patrón Page Object Model lo que permite un mejor claridad del código 
    • Los Elementos del DOM se encuentran el las paginas dentro de la package POM, los steps dentro del package Steps Definitions y las features de cucumber dentro de la carpeta Features.
    • Dentro de la carpeta test-output se puede encontrar el reporte asociado a la ejecución de las pruebas.
    • El chrome usado debe ser mayor a 75 y el chromedriver se envía en la solución.
