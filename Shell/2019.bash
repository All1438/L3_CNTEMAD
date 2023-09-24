factoriel(){
    fact=1
    for ((i = 2; i <= "$nombre"; i++)); do
        fact=$((fact * i))
    done
    echo "Le factorielle $nombre est $fact"
}

read -p "Entrer un nombre: " nombre
if ((nombre % 2 == 0)) then
    echo "Votre nombre est pair"
    factoriel
else
    echo "Votre nombre est impair"
fi