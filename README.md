# UD26-API04

Para utilizar los endpoint es necesario hacer login atraves del body a la siguiente URL. Esta te devolvera un token en los headers con el que podras hacer cualquier otra consulta.

## URL de la API

https://ud2704.herokuapp.com/login

### Endpoints de FACULTADES

  1- Obtener una lista de las facultades
  - GET /api/facultades
  
  2- Obtener una facultad por su codigo
  - GET /api/facultades/{codigo}
  
  3- Insertar una facultad nuevo desde un request body
  - POST /api/facultades
  
  4- Actualizar una facultad indicando su codigo y sus campos en el body
  - PUT /api/facultades/{codigo}
  
  5- Borrar una facultad por su codigo 
  - DELETE /api/facultades/{codigo}

### Endpoints de EQUIPOS

  1- Obtener una lista de los equipos
  - GET /api/equipos
  
  2- Obtener un equipo por su numero de serie
  - GET /api/equipos/{numSerie}
  
  3- Insertar un equipo nuevo desde un request body
  - POST /api/equipos
  
  4- Actualizar un equipo indicando su numero de serie y sus campos en el body
  - PUT /api/equipos/{numSerie}
  
  5- Borrar un equipo por su numero de serie 
  - DELETE /api/equipos/{numSerie}
  
### Endpoints de INVESTIGADORES

  1- Obtener una lista de los investigadores
  - GET /api/investigadores
  
  2- Obtener un investigador por su dni
  - GET /api/investigadores/{dni}
  
  3- Insertar un investigador nuevo desde un request body
  - POST /api/investigadores
  
  4- Actualizar un investigador indicando su dni y sus campos en el body
  - PUT /api/investigadores/{dni}
  
  5- Borrar un investigador por su dni 
  - DELETE /api/investigadores/{dni}
  
### Endpoints de RESERVAS

  1- Obtener una lista de las reservas
  - GET /api/reservas
  
  2- Obtener una reserva por su id
  - GET /api/reservas/{id}
  
  3- Insertar una reserva nuevo desde un request body
  - POST /api/reservas
  
  4- Actualizar una reserva indicando su id y sus campos en el body
  - PUT /api/reservas/{id}
  
  5- Borrar una reserva por su id 
  - DELETE /api/reservas/{id}
