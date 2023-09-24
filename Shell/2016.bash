#!/bin/bash
read -p "Entrer votre nom: " nom  # permet de faire entrer les données par les utilisateurs
read -p "Entrer votre prenom: " prenom
read -p "Votre Date de Naissance: " date_naissance
read -p "Votre adresse: " adresse
annee_naissance =$(date -d "$date_naissance" +%Y) # date = permet de formater ou afficher la date et l'heur actuel ou d'autre date spécifier
# -d "$variable" = permet de traiter la valeur de la variable comme une date
# +%Y = permet de renvoyer l'année sous forme de 4chiffres (Y = Year)
annee_actuel =$(date +%Y)
age =$((annee_actuel - annee_naissance)) # ((...)) = les doubles parenthèses est effectuer des operation arithmétique
echo "L'age de la personne est $age"
