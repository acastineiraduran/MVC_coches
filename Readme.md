# Arquitectura MVC

Aplicación que trabaja con objetos coches, modifica la velocidad y la muestra

---

En esta rama está añadido los eventos en la IU

-----

## Diagrama de clases:

```mermaid
classDiagram
    class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
      class Controller{
          +main()
      }
      class View {+muestraVelocidad(String, Integer)}
      class Model {
          ArrayList~Coche~: parking
          +crearCoche(String, String, String)
          +getCoche(String)
          +cambiarVelocidad(String, Integer)
          +getVelocidad(String)
      }
    class IU {
        mostrarVelocidad()
    }
    class Dialog {
        mostrarVelocidad()
    }
    Controller "1" *-- "1" Model : association
    Controller "1" *-- "1" View : association
    Model "1" *-- "1..n" Coche : association
    View "1" *-- "1..n" IU : association
    View "1" *-- "1..n" Dialog : association
      
```

---

## Evento en el View

Cuando ocurre un evento en la vista, el `controller` se tiene que enterar.
Tenemos que tener en cuenta que en el MVC estricto, la vista no se comunica con el modelo.

En el listener del botón llamamos al `controller`


```mermaid
sequenceDiagram
    actor usuario
    participant View
    participant Controller
    participant Model
    
    usuario->>View: click! Crear coche
    View->>Controller: el usuario quiere crear un coche
    activate Controller
    Controller->>Model: crea un coche, porfa
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller->>View: ok, coche creado!
    deactivate Controller
    View-->>usuario: tu coche se creó!
```

Ahora la parte de la Arquitectura de la vista, son tres clases

```mermaid
sequenceDiagram
    autonumber
    actor usuario
    box gray Vista con JFrame
        participant IU
        participant Dialog
        participant View
        end
        
    participant Controller
    participant Model

    usuario->>IU: click! Crear coche
    IU->>Controller: crearCoche()
    activate Controller
    Controller->>Model: crearCoche
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller->>+View: mostrarVelocidad
    deactivate Controller
    View-->>-Dialog: mostrarVelocidad()
```

-----

# Examen 26/05/23 - Observer
_commit_ indicando el inicio del examen

## Observador
Creo la clase que va a observar llamada `ObsExceso`
```java
public class ObsExceso implements Observer { 
    @Override
    public void update(Observable o, Object arg) {

    }
}
```
Implementa la interfaz `Observer` por lo que hay que sobreescribir el implementar
obligatoriamente el método `update()`

## Observado - _subject_
La clase `Model` extiende de `Observable`.
Le añadimos al método `subirVelocidad()` de esa clase los métodos:
* `setChanged()`
* `notifyObservers()` pasando por parámetro el objeto de la clase que se ha modificado

## Observador
Sobreescribimos el método `update()` indicando al usuario una advertencia sólo si 
después de haber modificado la velocidad, esta supera los 120 km/h

## Controller
Instanciamos el Observer y lo met



