# ASI


## Les noms des membres du groupe
* TAIDER Silia.
* BEN SALAH Mariem.
* BOITEUX Baptise.
* MESSIE Louis.

## Les éléments réalisés du cahier des charges

### Partie Web Dynamique
* Utilisation de Springboot, Maven, Thymeleaf.
* Création d'un formulaire de saisie d’informations.
* Affichage d’une carte en Web Dynamique en utilisant les informations saisies dans le formulaire.

### Partie Web Statique
* Utilisation de JavaScript, AJAX et des requêtes HTTP.
* Création d'un formulaire de saisie d'informations.
* Envoi des données saisies dans un formulaire au serveur.
* Affichage des cartes stockées sur le serveur.


## Les éléments non-réalisés du cahier des charges
* Appliquer le tutoriel au TP pour la partie du web dynamique.

## Des éléments éventuels réalisés en plus du cahier des charges
* Nada.



La comparaison ci-dessous est aussi disponible dans le pdf Comparaison Web Statique et Web Dynamique.pdf
disponible dans le dossier.



## En quoi est ce que le web dynamique est-il plus interessant que le web statique ?

Contrairement à un site statique, un site dynamique utilise un language de programmation dynamique (en l'occurence java), et utilise en général une base de données pour stocker les ressources qui constitueront par la suite ses pages HTML.
Un site web dynamique est surtout un site Internet dont les pages sont créées "dynamiquement" en fonction des requêtes des internautes.

Comparé au web statique, le web dynamique (même si plus long pour charger les pages):
* est plus rapide à mettre à jour.
* comporte des fonctionnalités plus faciles à mettre en oeuvre qu'en statique.
* permet la facilité de transformation de la charte graphique.
* impose une présentation de contenu normalisée.
* n'a pas de difficulté à gérer un grand nombre de clients en même temps.
* beaucoup plus pratique et moins cher à maintenir, même si le cout de développement initial est plus important.
* utilise des bases de données.

## En quoi le web statique est-il plus intéressant que le web dynamique ?

Le web statique présente comme avantage d'être beaucoup plus léger pour le serveur. En effet, contrairement au web dynamique, le serveur n'a ici qu'à répondre aux requêtes HTTP effectuées par le web browser du client (ici dans la partie JavaScript).

On pourra également penser à la facilité de programmation du web statique. Cette facilité est cependant nuancée sur le long terme, car comme souligné plus haut, le web dynamique est plus facile à mettre à jour.


## En quoi nos prototypes respectent le modèle MVC ?

**MVC** (Model-View-Controller ou Modèle-Vue-Contrôleur) est un modèle dans la conception de logiciels. Il met l'accent sur la séparation entre la logique métier et l'affichage du logiciel. Cette «séparation des préoccupations» permet une meilleure répartition du travail et une maintenance améliorée.

1. Model (modèle) : gère les données et la logique métier.
2. View (vue) : gère la disposition et l'affichage.
3. Controller (contrôleur) : achemine les commandes des parties "model" et "view".

Dans le premier atelier réalisé au sein de ce module, l'implémentation du modèle MVC a bien été mise en évidence grâce à la création de différents paquets : le __com.sp.controller__, le __com.sp.model__ ainsi que les répértoires __src/main/resources/templates__ et __src/main/resources/static__

Le controller HTTP (controller qui peut intercepter les requètes HTTP) avait pour objectif la définition des routes (endpoint) et par suite l'affichage des pages dynamiquement complétées (templating). Le cycle de vie de ce dernier est géré par SpringBoot.
* La définition des routes se fait dans le fichier __RequestCrt.java__ 

``` java
...
  @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
  public String index(Model model) {
  	model.addAttribute("messageLocal", messageLocal);
  	return "index";
  }
...

```
Dans ce cas, une page __index.html__ a été créée dans le dossier templates et qui va être appelée par le controller et affichée sur le navigateur.

La création de modèles se fait dans le paquet __com.sp.model__, dans notre cas, on a créé un premier modèle de Poney et son controller __PoneyDao.java__ dans le paquet __com.sp.controller__ pour qu'il puisse intéragir avec le modèle.
Le retour d'une vue affichant un poney est controlée par le __RequestCrt.java __
``` java

      @Autowired
      PoneyDao poneyDao;
    ...
     	@RequestMapping(value = { "/view"}, method = RequestMethod.GET)
          public String view(Model model) {
          model.addAttribute("myPoney",poneyDao.getRandomPoney() );
            return "poneyView";
        }
    ...
```
La page __poneyView.html__ qui va être appelée lors de l'appel de la route __/view__ a ensuite été créée dans le dossier __templates__.

On voit bien la séparation entre les diffèrentes parties, la vue qui est présente dans le répertoire __templates__, les modèles dans le paquet __com.sp.model__ et le controller dans le paquet __com.sp.controller__

Dans le cas du prototype réalisé en statique, on respecte moins le modèle MVC : 

1. La vue est réalisée par le HTML et le CSS.
2. Le controlleur est représenté par les requêtes HTTP, réalisées par le JavaScript.
3. Le modèle est également réalisé par la réception des données du formulaire et l'affichage des données de la carte par le JavaScript.





