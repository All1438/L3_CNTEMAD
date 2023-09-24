declare -A notes

ajouter_note(){
    read -p "Entrer le nom: " nom
    read -p "Entrer la note: " note
    notes["nom"] = $note
}
liste_par_mérite(){
    tri_notes = (
        $(for nom in "${!notes[@]}"; do
            echo "$nom ${etudiants[$nom]}"
        done | sort -k2,2nr -k1
        # sort = c'est la commande utilisé pour trié la ligne de text
        # -k2,2 = signifie de trié en utilisant le deuxième champs. "2" signifie que nous limitons au deuxième champ
        # -n = indique que la comparaison doit être numérique
        # -r = indique de trier par ordre inverse. les valeurs les plus élevé viennent en premier
    ))
    echo "liste des étudiants par ordre de mérite: "
    for etudiant in "${tri_notes[@]}"; do
        echo "$nom : $moyenne"
    done
}

while true; do
    echo "Menu:"
    echo "1. Ajouter un note"
    echo "2. Lister les étudiant par ordre de mérite"
    echo "3. Quiter!"
    read -p "Choisissez une option: " choix
    if ["$choix" -eq 1] then
        ajouter_note
    elif ["$choix" -eq 2] then
        liste_par_mérite
    elif ["$choix" -eq 3] then
        echo "Au revoir!"
        exit
    else
        echo "Option non valide"
    fi
done