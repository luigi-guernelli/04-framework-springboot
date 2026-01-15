# 03 TODO List API avanzate
Questo progetto in Spring Boot implementa una **Todo List** completa:
- **CRUD**: complete
- **API REST**: codici e metodi HTTP.
- **Validazione dei dati**: in ingresso (non si accettano todo vuoti o date sbagliate).
- **Gestione errori**: meggaggi chiari invece di interruzioni (stack tarce).
- **Uso del Service layer**: separiamo la logica dal (Controller).

## Tecnologie utilizzate
- Spring Boot
- Spring Web
- Sprign Data JPA
- h2 Database (embedded)
- Spring Boot Validation > (Bean Validation)
- Maven

## Concetti
- *@Entity* con validazione Jakarta Bean Validation >(*@NotBlank*; *@Size*; *@FutureOrPresent*).
- Uso di *@Valid* nel Controller per attivare la validazione.
- *Service Layer > (*@Service*) per separare logica dal Controller.
- Gestione errori globali con *@ControllerAdvice* e *@ExceptionHandler*.
- Risposte HTTP codici di stato:(201 Created; 400 Bad Request; 404 Not found).
- Popolamento iniziale con *data.sql*.