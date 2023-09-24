CREATE TABLE Contact(
    NumCnt INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    NomCnt VARCHAR(50),
    NumClt INTEGER,
    FOREIGN KEY (NumClt) REFERENCES Client(NumClt)
);

CREATE TABLE CategoriesPossible(
    Categorie VARCHAR(1) FOREIGN KEY
);
INSERT INT CategoriesPossible (Categorie) VALUES
('A'), ('B'), ('C');
ALTER TABLE Reservation
ADD FOREIGN KEY (Categorie) REFERENCES CategoriesPossible(Categorie);

UPDATE Client
SET VilleClt = 'Antsiranana'
WHERE VilleClt = 'Diego';

DELETE FROM Reservation
WHERE DateDep = '01/05/17';

SELECT NumClt, COUNT(*) AS Effectif
FROM Contact
GROUP BY NumClt;

SELECT NomCont
From Contact c
LEFT JOIN Reservation r ON r.NumCnt = c.NumCnt
WHERE Categorie != 'C';

1
CREATE OR REPLACE FUNCTION Mafonc(mt INTEGER) RETURNS INTEGER AS $$
# declare une fonction appeler Mafonc qui accepte un paramètre "mt" de type entier et que la function return un entier
# $$ = signifie que tout le code de la fonction, doît être inclus entre les délimiteurs (BEGIN END DECLARE)
2
DECLARE
    vpt Pointage%ROWTYPE;
3
SELECT INTO vpt *
FROM Pointage
WHERE Matricule = 17005 AND DatePointage = '2017-08-20';
4
DECLARE
    vpt Pointage%ROWTYPE;
    vns INTEGER; -- Declaration de la variable vns de type entier
BEGIN
    vns := vpt.NumSentier;
END;
5
DECLARE
    vpt Pointage%ROWTYPE;
    vns INTEGER;
    cpt INTEGER := 0;
BEGIN
    vns := vpt.NumSentier;
    IF vns = 201701 THEN
        cpt := cpt + 1;
    END IF;
END; 