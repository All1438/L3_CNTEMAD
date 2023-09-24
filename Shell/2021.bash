# 8 et 12 = 4

# a = 12
# b = 8
# temp = 8
# b = 4
# a = 8 

# temp = 4
# b = 0 
# a = 4

# produit = 96
# pgcd = 4
# ppcm = 24

calculer_pgcd(){
    a=$1 # $1 = signifie le premier variable sur l'appel de la fonction
    b=$2
    while(($b != 0)); do 
        temp=$b
        b=$((a % b))
        a=$temp
    done
    echo "$a" # echo"$variable" = equivaut return dans une autre language
}
calculer_ppcm() {
    a=$1
    b=$2
    produit=$((a * b))
    pgcd=$(calculer_pgcd $1 $2)
    ppcm=$((produit / pgcd))
    echo "$ppcm"
}

read -p "Entrer le premier nombre: " nombre1
read -p "Entrer le deuxième nombre: " nombre2
pgcd=$(calculer_pgcd $nombre1 $nombre2) # la valeur de la variable pgcd sera return par echo "$variable"
echo "le PGCD de $nombre1 et $nombre2 est $pgcd"
ppcm=$(calculer_ppcm $nombre1 $nombre2)
echo "le PPCM de $nombre1 et $nombre2 est $ppcm"