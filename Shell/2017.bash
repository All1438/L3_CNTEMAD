#!/bin/bash
declare -A notes # declare = permet de declarer le tableau notes
# -A = pour indiquer que nous créons un tableau assossiatif: les indices ne sont pas limité a des nombres entiers
calculer_moyenne() {
    somme = 0
    count = 0
    for nom in "${!notes[@]}"; do # {notes[@]} = fait référence a tout les valeurs du tableau
    # ! = pour obtenir tout les clé du tableau assossiatif 
         for note in "${notes[$nom][@]}"; do
            somme = $((somme + note))
            count = $((count + 1))
         done
    done
    if [$count -eq 0]; then
        echo "Aucun note n'a été choisis "
    else
         moyenne = $(echo "scale=2; $comme / $count" | bc) 
         # echo = est ici utilisé pour afficher une expression arithmétique
         # | bc = redige l'expression echo. qui est un calculateur en ligne de commande capable d'évaluer des expression mathématique
    fi
}
while true; do
    echo "Menu :"
    echo "1. ajouter une note"
    echo "2. Calculer la moyenne"
    echo "3. Quitter"
    read -p "Choisissez une option: " choix
    if ["$choix" -eq 1]; then # -eq = qui veut dire égal
        read -p "Entrer le nom de l'etudiant: " nom
        read -p "Entrer la note de $nom: "note
        if [-z "notes[$nom]+x"] then # vérifie si le tableau à l'indice nom est est vide
        # -z = permet de verifier si l'occurence de "..." est vide
            notes[$nom]=() # permet de créer un tableau pour stocker les notes de cet étudiant
        fi
        notes["$nom"] += ($note) # permet d'ajouter la note au tableau de cette étudiant
        echo "Note de $nom ajouter: $note"
    elif ["$choix" -eq 2]; then
        calculer_moyenne
    elif ["$choix" -eq 3]; then
        echo "Au revoir!"
        exit
    else
        echo "option non valide"
    fi
done