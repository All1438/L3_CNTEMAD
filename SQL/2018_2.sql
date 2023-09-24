CREATE OR REPLACE FUNCTION a_double(matricule_etudiant INTEGER) RETURNS TEXT
DECLARE
    v_double BOOLEAN := FALSE;
    v_prec_filiere TEXTE := NULL;
    v_prec_niveau TEXTE := NULL;
BEGIN
    FOR insc IN (SELECT * FROM Inscrire WHERE Matricule = matricule_etudiant ORDER BY AnneeU) # insc = est une variable temporaire qui représente chaque ligne de résultat
    LOOP # LOOP = permet de faire une boucle infini jusqu'a exit ou return
        IF v_prec_filiere = insc.Filiere AND v_prec_niveau = insc.Niveau THEN
            v_double := TRUE;
            EXIT;
        ELSE
            v_prec_filiere := insc.Filiere;
            v_prec_niveau := insc.Niveau;
        END IF;
    END LOOP;
    IF v_double THEN
        RETURN 'Il a déjà doublé!'
    ELSE
        RETURN 'Il n''a pas redoublé!'
    END IF;
END;
