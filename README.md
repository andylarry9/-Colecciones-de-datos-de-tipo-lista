Tema: Colecciones de datos de tipo lista.
Objetivo: Resolución de ejercicios mediante la aplicación de colecciones de datos de tipo
la estructura de lista.
Actividad: Implemente un proyecto de consola de POO en Java que permita gestionar una
filmoteca con el objetivo de saber la disponibilidad de las películas, además, de otros
aspectos de información importantes para la filmoteca. De cada película se desea conocer
su título, nombre del actor principal, nombre del director de la película, su género
(Comedia, Acción, Ciencia Ficción o Thriller) y año de producción. El sistema debe
permitir gestionar la información de todas las películas de la filmoteca y utilizará
internamente Colecciones de Datos de Java para almacenar las películas, para ello
permitirá añadir películas, eliminarlas y/o ver la lista de todas las películas con que cuenta
hasta el momento la filmoteca. El sistema debe permitir los siguientes requerimientos:
 Las operaciones más comunes que haremos en la aplicación van a consistir en
o añadir una película al final de la lista,
o eliminar una película dado su identificador (habrá que buscarla en la lista),
o obtener el listado de todas las películas y recorrerla entera para mostrarlo.
o Nota: debe considerar el tipo de colección más apropiada para almacenar
esta información.
 Añadir el código necesario a las operaciones para consultar la lista de películas
disponibles. Comprobar que la aplicación funciona correctamente.
 Al obtener la lista de películas almacenadas, mostrarlas ordenadas
alfabéticamente. Utilizar para ello los algoritmos que se nos proporcionan en el
marco de colecciones.
o Sugerencia: Si internamente estamos almacenando las películas en un tipo de colección
sin información de orden, para ordenarlas tendríamos que volcar esta colección a otro tipo
de colección que sí que sea ordenable. Es más, aunque internamente se almacenen en una
colección con orden, siempre es recomendable volcar los elementos a otra colección antes
de devolverla, para evitar que se pueda manipular directamente desde cualquier lugar del
código la estructura interna en la que guardamos la información. Además, las películas
deberán ser comparables, para que los algoritmos sepan en qué orden se deben ordenar.
Por último, implemente un menú de opciones, en la clase principal del proyecto de
consola de Java, para cada uno de los requerimientos descritos anteriormente.
