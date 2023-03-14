En esta relación, implementaremos la clase Dinero que nos permitirá guardar información sobre
una cantidad de dinero expresada en una moneda concreta (p.ej.: 23,45 dólares). Para que todo
funcione como es debido, mantendremos una lista con los cambios de moneda (p.ej.: cuántos
dólares corresponden a un euro) que se mantendrá de manera estática para todos los objetos
de la clase Dinero, de manera que todos usaran la misma tabla para las conversiones.
Para que todo esto funcione, necesitaremos los siguientes elementos:

1) Un enum que se llamará TipoMoneda en el que tendremos una lista de las monedas

con las que trabajaremos. El hecho de que esté en un enum le facilita al usuario el poder
escoger la moneda fácilmente.

2) Una clase Moneda que nos servirá para mantener la información sobre cada moneda (es decir, euros, dólares, etc.) que usemos. De cada moneda guardaremos el símbolo, el
   número de decimales que usa y el cambio en euros.
   - Atributos:
     - tMoneda, de tipo TipoMoneda, que usaremos para identificar de qué
       moneda estamos guardando los datos.
     - decimales, de tipo int, en el que guardaremos cuántos decimales se
       muestran para esta moneda (p.ej.: en el euro tenemos dos decimales, los
       céntimos de euro, mientras que los yenes no tienen decimales). Estos
       decimales lo usaremos solamente a la hora de mostrar las cantidades por
       pantalla. Internamente, guardaremos todos los decimales para que no haya
       problema con los redondeos.
     - simbolo, de tipo String, en el que almacenamos el símbolo que se usa para
       representar la moneda (€, $, etc.).
     - cambioEuro, de tipo double, en el que guardaremos el cambio con respecto
       al euro de cada moneda. Más concretamente, guardaremos a qué cantidad
       de esta moneda corresponde un euro (p.ej.: 1€ = 136.0497¥).
   - Constructor:
     - Tendrá un único constructor que leerá los cuatro valores y los pondrá en los
       cuatro atributos. Haremos las comprobaciones pertinentes: que el número
       de decimales sea sensato (entre 0 y 4 es lo normal), que la cadena del
       símbolo no esté vacía y que el cambio con el euro no sea negativo.
   - Propiedades:
     - Para tMoneda, decimales y simbolo, sólo escribiremos el get, ya que una
       vez creada una moneda no vamos a cambiar estos valores.
     - Para el atributo cambioEuro, tendremos un get y un set. A la hora de
       modificarlo, habrá que tener cuidado de que el valor no sea negativo.

Una vez tengamos lista la clase Moneda y el enum TipoMoneda, ya podremos hacer nuestra
clase Dinero. Esta clase tendrá los siguientes elementos:

- Atributo estático:

  - Tendremos un atributo estático listaMonedas que será una lista de la clase
    Moneda. Será estático para que una vez rellena con datos la lista, nos sirva
    para todas las cantidades de dinero (es independiente de cada objeto).
    Además, si actualizamos esta lista, se actualizarán automáticamente todos
    los objetos Dinero que la usan.
  - Bloque estático:
    - A continuación, escribiremos un bloque static para inicializar esa lista de
      monedas con unos datos iniciales.
      Por cada valor que tengamos en TipoMoneda, tendremos que añadir una
      entrada a esa lista de monedas con los datos de esa moneda concreta. Este
      constructor se ejecuta automáticamente una sola vez cuando vayamos usar
      el primer objeto de la clase Dinero, así que tendremos la lista rellena cuando
      nos haga falta.
      Por ejemplo, el primer dato podría insertarse así:
      listaMonedas.add(new Moneda(TipoMoneda.euro, 2, "€", 1));
  - Métodos estáticos:
    - actualizaCambio(TipoMoneda t, double cambio), al que le pasaremos un
      TipoMoneda y un nuevo valor para el cambio en euros de esa moneda y lo
      actualizará en la lista.
    - Como nos va a hacer falta en varios métodos consultar datos sobre nuestra
      moneda, también vendría bien hacer un método (en este caso privado)
      buscaMoneda(TipoMoneda t) que nos devuelva la moneda de la lista.

  Hasta aquí sería la parte estática, que es la menos habitual. Con esto, ya tendríamos una lista
  con las diferentes monedas y algunas funciones para acceder a ella. A continuación,
  escribiremos los atributos y métodos normales, en los que usaremos esa listaMonedas:

  - Atributos:
    - cantidad, será un double en el que se guardará la cantidad exacta de dinero,
      independientemente del número de decimales que use la moneda concreta.
    - tMoneda, será de TipoMoneda y nos guardará en qué moneda está
      representada la cantidad (ej.: euros).
  - Constructores:
    - Un constructor con dos parámetros: cantidad (double) y tMoneda
      (TipoMoneda), que inicializará los atributos.
    - Otro constructor igual al que le pasamos un int en lugar de un double.
  - Propiedades:
    - getCantidad y setCantidad
    - getMoneda y setMoneda
  - Métodos:
    - toString(), nos devolverá un String con la representación en texto de
      nuestro dinero (ej.: “4.25$”). El símbolo correspondiente a nuestra moneda
      lo cogeremos de la lista estática listaMonedas, así como el número de decimales que tendremos que escribir. Para redondear a los decimales deseados, usaremos Math.round()
    - valorEn(TipoMoneda) nos devolverá un double que corresponderá al valor
      de nuestro dinero en la moneda que nos pasen por parámetro (p.ej.: si
      nuestro dinero es “2€” y pedimos el valor en yenes, nos devolverá
      “251.53”). Para ello, tendremos que buscar la conversión en euros de cada
      moneda en la lista estática listaMonedas.
    - convierteEn(TipoMoneda) es similar al método anterior pero nos devuelve
      un objeto de tipo Dinero con la cantidad y la moneda correspondiente (p.ej.:
      si nuestro dinero es “2€” nos devolverá otro dinero que será “251.53¥”).
    - toString(TipoMoneda) será como el toString() anterior pero nos escribirá la
      cantidad representada en la moneda que nosotros le digamos (con sus
      correspondientes decimales y su simbolito).
  - Métodos (operadores):
    - add(Dinero) y substract(Dinero) que nos permiten sumar y restar
      cantidades de dinero y nos devuelven un objeto Dinero con el resultado. Si
      las cantidades están en diferentes monedas, habrá que convertir el segundo
      Dinero a nuestra moneda para poder hacer las operaciones.
    - multiply(double) y divide(double) nos divide nuestro Dinero entre el
      número que le pasamos y nos devuelve otro Dinero con el resultado.
    - negate() nos devolverá nuestro Dinero en negativo.
    - equals(Dinero) nos dirá si nuestros Dinero son iguales. Si no están en la
      misma Moneda, convertiremos el segundo a la Moneda del primero para
      compararlos.
    - compareTo(Dinero) será parecido al anterior pero devolverá:
      - -1 si nuestro Dinero es menor que el parámetro.
      - +1 si nuestro Dinero es mayor que el parámetro.
      - 0 si son iguales.