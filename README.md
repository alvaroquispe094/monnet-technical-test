# Monnet Payment Solutions - prueba técnica
Enunciado: Quiero construir un auto el cual lo voy a utilizar de diferentes maneras durante la semana. El lunes quiero usarlo para ir al trabajo, el martes quiero usarlo para correr en un circuito, el miércoles y jueves quiero usarlo para hacer offroad y el viernes quisiera usarlo para ser un agente secreto; para poder ser un agente secreto el auto debería poder activar un camuflaje y poder utilizar armas de fuego preinstaladas en el vehiculo.

## ¿Que se ha utilizado?
- Java Application
- Java 11
- Maven
- Polimorfismo
- Herencia multiple
- Inversion de control por constructor (Ioc)

## Clona el repositorio

```bash
git clone https://github.com/alvaroquispe094/monnet-technical-test.git
```

## Explicación de la resolución del problema

**1. Creacion de la Interfaz Car con un metodo general vacio que debera ser implementado.**

**2. Creacion de sub clases de Car que implementan la interfaz Car ccon el funcionamiento especifico del tipo de vehiculo. En particular la clase SecretAgentCar posee herencia multiple para poder soportar el camuflaje y armas de fuego.**

**3. Creacion de la clase Vehiculo que inyecta por constructor el tipo de Car y solo llama al metodo use() de la instancia de Car ya que esta implementa la funcion especifica del tipo de auto.**

**4. Se realizan la prueba en la clase principal.**

