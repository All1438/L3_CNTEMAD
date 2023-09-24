declare -A etudiants

ajouter_etudiants(){
    read -p "Entrer le nom de l'étudiant: " nom
    etudiants["$nom"] = 1 # ici nom est un indice de tableau
}

ordre_alphabetique(){
    echo "Liste des étudiants par ordre alphabétique:"
    ordre = $(echo "${!etudiants[@]}" | sort)
    for nom in "$ordre"; do
        echo "$nom"
    done
}

while true; do
    echo "Menu:"
    echo "1. Entrer le nom de l'étudiant"
    echo "2. Affiche par ordre Alphabétique"
    echo "3. Quiter!"
    read -p "Votre Choix: " choix
    if ["$choix" -eq 1] then
        ajouter_etudiants
    elif ["$choix"  -eq 2] then
        ordre_alphabetique
    elif ["$choix" -eq 3] then
        echo "Au revoir!"
        exit
    else
        echo "Option non valide!"
    fi
done


