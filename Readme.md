# EXAMEN 24/05/23

Previamente tuve que añadir a la rama angel_v3 los métodos aumentar/bajar
velocidad ya que no se subieron a GitHub en su momento. Desde esta
rama creo otra llamada 'ex3' que es donde incorporo el código solicitado
en el examen. Añado un commit puntualizando el principio de la tarea.

## Primera parte
> Los siguientes pasos se desencatenarán sólo después de accionarse el botón
> creado en `IU` el cual tiene un `actionPerformed()` que le pasa a `Controller`
> el texto del campo de la matricula.
1. En la clase `Controller` llamo a un método de la clase Model
para que me devuelva el coche que se pase por parámetro.
2. Una vez obtenido el objeto `Coche` buscado, se llama a un método de la 
clase que a su vez llama a un método de la clase `Dialog`. A este método
se le pasarán por parámetros los atributos del objeto que hemos recogido.
3. El método de la clase `Dialog` simplemente mostrará al usuario 
una ventanita con los
atributos del objeto buscado.
4. Se completa el _javadoc_ de los métodos y se hace un _commit_

## Segunda parte

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

    usuario->>IU: click! Buscar coche
    IU->>Controller: buscarCoche()
    activate Controller
    Controller->>Model: getCoche
    activate Model
    Model-->>Controller: Coche
    deactivate Model
    Controller->>+View: mostrarCoche
    deactivate Controller
    View-->>Dialog: atributosDialogo()
```


