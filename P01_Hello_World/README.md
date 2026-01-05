# 01 Hello World REST API
Primo progetto Spring Boot per imparare le basi.

## Concetti appresi
- Creazione progetto con Spring embedeed in Eclipse
- @SpringBootApplication e auto-configuration
- Server Tomcat embedded
- @RestController e metodi HTTP (@GetMapping; @PostMapping)
- @PathVariable e @RequestParam
- Gestione body JSON con @RequestBody e record

## Endpoint disponibili da utilizzati in locale
- GET   /api/                   -> Messaggio di benvenuto
- GET   /api/ciao/{nome}        -> Saluto personalizzato
- GET   /api/saluta?nome=...    -> Saluto con parametro query 
- POST   /api/eco               -> Eco del messaggio con JSON    

## Endpoint completi
GET http://localhost:8080/api/                   → "Benvenuto..." <br>
GET http://localhost:8080/api/ciao/Luca          → "Ciao, Luca!" <br>
GET http://localhost:8080/api/saluta?nome=Anna   → "Buongiorno, Anna! ..." <br><br>
POST http://localhost:8080/api/eco

Body JSON: {"testo": "Ciao Spring Boot!"}
→ "Hai detto: Ciao Spring Boot!"
