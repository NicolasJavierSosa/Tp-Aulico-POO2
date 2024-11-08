*Grupo I*
--
*Enunciado:*

Estás desarrollando un sistema de gestión de conexiones a una base de datos en el que varias partes
de la aplicación deben acceder a la base de datos de manera controlada. El sistema debe asegurarse
de que todas las conexiones a la base de datos se gestionen de manera centralizada y que no existan
conflictos entre las diferentes solicitudes de conexión. Implementa el patrón correspondiente.
--
Razon por la cual se implemento el patrón Singleton:
El patrón Singleton se utiliza en este caso para garantizar que haya una única instancia de la clase que gestiona la conexión a la base de datos. Las razones para usarlo son:
Control Centralizado: Asegura que todas las partes de la aplicación usen la misma conexión a la base de datos, evitando conexiones redundantes.
Evitar Conflictos: Gestiona de manera centralizada las conexiones, evitando posibles conflictos de acceso concurrente a la base de datos.
Ahorro de Recursos: Reutiliza la misma conexión, lo que reduce el consumo de recursos y mejora el rendimiento.
Mantenimiento Simplificado: Si se necesita cambiar la lógica de conexión, solo se realiza en un lugar, facilitando el mantenimiento.
Instanciación Perezosa: La conexión solo se crea cuando se necesita, optimizando el uso de recursos.
