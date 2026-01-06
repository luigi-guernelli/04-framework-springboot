-- URL per il database h2 > http://localhost:8080/h2-console
-- Popoliamo la tabella *libri* con alcuni libri famosi
INSERT INTO libri (titolo, autore, anno_pubblicazione) VALUES
('Il Nome della Rosa', 'Umberto Eco', 1980),
('1984', 'George Orwell', 1949),
('Cent''anni di solitudine', 'Gabriel García Márquez', 1967),
('Il Signore degli Anelli', 'J.R.R. Tolkien', 1954),
('Orgoglio e Pregiudizio', 'Jane Austen', 1813),
('Harry Potter e la Pietra Filosofale', 'J.K. Rowling', 1997),
('Il Piccolo Principe', 'Antoine de Saint-Exupéry', 1943),
('Delitto e Castigo', 'Fëdor Dostoevskij', 1866),
('La Divina Commedia', 'Dante Alighieri', 1320),
('Cronache del Ghiaccio e del Fuoco', 'George R.R. Martin', 1996);

-- Query di selezione
SELECT * FROM LIBRI;