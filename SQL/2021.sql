CREATE OR REPLACE FUNCTION Detenteur(IdMeuble Integer) RETURNS TEXT
DECLARE
    v_service TEXT,
    v_porte TEXT
BEGIN
    SELECT b.Service, b.Porte INTO v_service, v_porte # SELECT donné INTO variable = Permet de récuperer les données dans la variable
    FROM Bureau b
    JOIN Dotation d ON d.NumPorte = b.NumPorte
    WHERE d.IdMeuble = IdMeuble;
    IF FOUND THEN
        RETURN 'Service '|| v_service ||'porte '|| v_porte; # || = une opération de concaténation de chaine dans RETURN
    ELSE
        RETURN 'Meuble not found!';
    END IF;
END;

3
SELECT Detenteur(123); # Remplacer 123 per ID du meuble souhaiter