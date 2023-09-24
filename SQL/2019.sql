CREATE OR REPLACE FUNCTION ListeLivraison(num_Livraison INTEGER) RETURNS TABLE(libelle text)
# RUTURNS TABLE(nom_colonne type) = indique que la function renverra une ensemble de resultat avec une colonne "nom_colonne" de type texte
BEGIN
    RETURN QUERY # pour renvoyer le resultat de la requête SQL en bas
    SELECT p.Libelle
    FROM ProdLiv p
    WHERE p.NumLiv = num_Livraison;
END;