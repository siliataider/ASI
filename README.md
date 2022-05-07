# ASI


## Les noms des membres du groupe
* TAIDER Silia.
* BEN SALAH Mariem.
* BOITEUX Baptise.
* JOACHIN Louis.

## Les éléments réalisés du cahier des charges

### Partie Web Dynamique
* Utilisation de Springboot, Maven, Thymeleaf.
* Création d'un formulaire de saisie d’informations.
* Affichage d’une carte en Web Dynamique en utilisant les informations saisies dans le formulaire.


## Les éléments non-réalisés du cahier des charges
* Appliquer le tutoriel au TP pour la partie du web dynamique.

## Des éléments éventuels réalisés en plus du cahier des charges
* Nada    

## En quoi est ce que le web dynamique est-il plus onteressant que le web statique?
le web statique est plus rapide et si on a une page
essentiellement statique, avec quelques éléments dynamiques on peut charger tout le site en une fois et
mettre à jour seulement des éléments ponctuels ( dans le cas de la carte c'est du micro service avec plein de
de requêtes ).Niveau inconvénients, plus la quantité de client est grande,plus les requêtes sont démultipliées
et on risque de casser le site avec trop de demandes sur la bande passante. Pour le web dynamique, Il faut
recharger toute la page ce qui présent un inconvénient mais on a beaucoup moins de requête. lorsque le client
voudra changer le contenu c'est toute la page qui change. L'un est l'opposé de l'autre. On ne peut donc pas
proprement parler d'avantages et d'inconvénients mais plutôt de différences qui doivent être étudiée dans le
but d'optimiser la solution qui est désirée. Pour le projet qui nous est demandé, nous devrions réfléchir à la
taille de la database, l'aisance par rapport au langage utilisé mais aussi l'étude du comportement des clients
pour le dimensionnement de la solution
