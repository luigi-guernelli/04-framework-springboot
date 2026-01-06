# 02 - CRUD con database H2
Secondo progetto: operazioni CRUD complete su un database in-memory.

# Concetti
- Entità JPA (Java Persistence API) >> @Entity; @Id; @GeneratedValue. <br>
- Repository con Spring Data JPA (nessuna query SQL). <br>
- Database H2 in-memory con console web. <br>
- API REST complete: POST; GET; PUT; DELETE. <br>
- Gestione errori base (404 Not found).

# Endpoint
- GET    > /api/libri       >> tutta la lista dei libri
- GET    > /api/libri/{id}  >> dettaglio di un libro per ID
- POST   > /api/libri       >> crea un libro
- PUT    > /api/libri/{id}  >> modifica un libro per ID
- DELETE > /api/libri/{id}  >> elimina un libro per ID


# Console h2
http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:testdb)
