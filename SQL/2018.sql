CREATE OR REPLACE FUNCTION ff(n INTEGER, s TEXTE) RETURNS TEXT

DECLARE
    v_date Billet.Date_Billet%TYPE;
    v_nb_place Billet.Nombre_Place%TYPE;
    v_billet Billet%ROWTYPE;

SELECT Date_Billet INTO v_date
FROM Billet
WHERE Numero = 2501 AND Destination = 'Mahajanga';

DECLARE
    v_date Billet.DateBillet%TYPE;
    v_nb INTEGER;
BEGIN
    v_nb := EXTRACT(YEAR FROM v_date); -- permet d'extraire l'anné de v_date est l'affecter en v_nb
END;

DECLARE
    v_date Billet.Date_Billet%TYPE;
    v_quinzaine INTEGER;
BEGIN
    IF v_date <= 15 THEN
        v_quinzaine := 1;
    ELSE
        v_quinzaine := 2;
    END IF;
END;

BEGIN
    SELECT INTO v_billet *
    FROM Billet
    WHERE Numero = n AND Destination = s;
END;

DECLARE
    v_billet Billet%TYPE;
    v_cumul := 0;
BEGIN
    v_cumul := v_billet.Nombre_Place;
END;
