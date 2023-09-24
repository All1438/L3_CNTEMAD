CREATE TABLE IF NOT EXISTS Participation(
    NumParticipation INTEGER  NOT NULL,
    IdMembre INTEGER NOT NULL,
    IdFormation INTEGER NOT NULL,
    FOREIGN KEY (IdMembre) REFERENCES Membre(IdMembre),
    FOREIGN KEY (IdFormation) REFERENCES Formation(IdFormation),
    PRIMARY KEY(IdMembre, IdFormation)
);

UPDATE Formation
SET FraisDeParticipation = FraisDeParticipation + (FraisDeParticipation * 20 / 100)
WHERE Duree > 5;

SELECT IdFormation, COUNT(*) AS Effectif
FROM Formation
GROUP BY IdFormation;

SELECT NomMembre
FROM Membre m
LEFT JOIN Participation p ON p.IdMembre = m.IdMembre
WHERE p.IdFormation IS NULL;

SELECT NomMembre
FROM Membre m
JOIN Participation p ON p.IdMembre = m.IdMembre
JOIN Formation f ON f.IdFormation = p.IdFormation
ORDER BY Duree DESC
LIMIT 1;


DECLARE # declare un variable de même type que l'attribut
    VPART Formation.FraisDeParticipation%Type; 

DECLARE # une variable déstiné à recevoir une ligne de la tabe Formation
    VFORM Formation%ROWTYPE;#

3
DECLARE
    VPART Formation.FraisDeParticipation%TYPE;
BEGIN
    SELECT FraisDeParticipation
    INTO VPART
    FROM Formation
    WHERE IdFormation = 5;
END;

4
DECLARE
    VFORM Formation%ROWTYPE;
    -- une ligne de curseur est une manière efficace de parcourir et de traiter des résultats de requête un par un
    CURFORM CURSOR FOR -- permet de déclarer une ligne de curseur
        SELECT *
        FROM Formation;
BEGIN
    OPEN CURFORM;
    FETCH CURFORM INTO VFORM; -- Récupère la ligne de curseur dans VFORM
    CLOSE CURFORM;
END;

5
DECLARE
    VFORM Formation%ROWTYPE;
    CURFORM CURSOR FOR
        SELECT *
        FROM Formation
BEGIN
    OPEN CURFORM;
    FETCH CURFORM INTO VFORM;
    VARDUREE := VFORM.Duree;
    CLOSE CURFORM;
END;

