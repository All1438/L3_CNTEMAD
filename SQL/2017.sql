SELECT e.NomAgent
FROM Employé e
JOIN Pointage p ON p.Matricule = e.Matricule
WHERE p.NumSentier = 201703;

SELECT NomAgent
FROM Employé
ORDER BY SalaireJournalier DESC
LIMIT 1;

SELECT NumSentier, COUNT(*) AS nombre_jours
FROM Pointage
GROUP BY NumSentier;

SELECT COUNT(*) AS Nombres_jours
FROM Pointage p
JOIN Employé e ON e.Matricule = p.Matricule
WHERE e.NomAgent = 'Sitraka' AND p.DataPointage >= '2017-08-01' AND p.DataPointage <= '2017-08-31';

SELECT NomAgent
FROM Employé
WHERE Matricule NOT IN(SELECT Matricule FROM Pointage WHERE NumSentier = '201701');

-- Autre façon de l'écrire
SELECT e.NomAgent
FROM Employé e
LEFT JOIN Pointage p ON p.Matricule = e.Matricule AND p.NumSentier = '201701' -- Limite la jointure aux enregistrements de la table "Pointage" où le numéro de sentier est 201701.
WHERE p.Matricule IS NULL;


CREATE OR REPLACE FUNCTION ListeContact(n INTEGER) RETURNS TEXT
DECLARE
    v_contacts TEXT := '';
    v_nomClient TEXT;
BEGIN
    SELECT String_agg(c.NomCnt, ',') INTO v_contacts
    FROM Contact c
    WHERE c.NumClt = n;
    SELECT NomClt INTO v_client
    FROM Client c
    WHERE c.NumClt = n;
    IF v_contacts IS NOT NULL THEN
        RETURN 'Les contacts du client ' || v_client || 'sont' || v_contact;
    ELSE
        RETURN 'Aucun contact trouvé pour le client' || v_client;
    END IF;
 