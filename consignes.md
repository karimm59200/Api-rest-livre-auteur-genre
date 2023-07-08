# TP validator Spring #



## Vous devez développer une application de gestion de livres en utiliisant Spring Boot avec des validators. 

L'applica2on doit perme;re aux u2lisateurs de créer, lire, me;re à jour et supprimer des
livres.

### Chaque livre possède un titre, un auteur, un genre et une année de publication.

**Un livre** n’a qu’un seul genre et un seul auteur.
• Titre : une chaîne de caractères non vides, Le 2tre ne peut pas dépasser {max}
caractères"

- • Auteur : objet non null
- • Genre : objet non null.
• Année de publica2on : un en2er posi2f et L'année de publica2on ne peut pas être
supérieure à 2023.

- • Si les données sont valides, le livre doit être enregistré dans la base de données.

- • Si les données sont invalides, une réponse d'erreur appropriée doit être renvoyée.

Faire un CRUD complet pour le livre. A;en2on quand on supprime un livre, l’auteur et le
genre ne doivent pas disparaître de la base de données.

**Un Auteur :**
• Nom : une chaîne de caractères non vides, le nom de l'auteur ne peut pas dépasser
50 caractères
**• Un email :** une chaîne de caractères non vides et l'adresse e-mail doit être de la forme
*@editor.com.

**Le Genre :**
• Nom : une chaîne de caractères non vides, le nom de l'auteur ne peut pas dépasser
10 caractères.

• Descrip2on : La descrip2on du genre ne peut pas dépasser 200 caractères.
Faire un CRUD complet pour le genre et l’auteur.

Vous allez pouvoir gérer ces contraintes de validité avec un Valida2onExcep2onHandler, si
vous le souhaitez ou dans le controller

### Ajout de la dépendance swagger ###

```
<dependency>
			<groupId>org.springdoc</groupId>
			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
			<version>2.1.0</version>
</dependency>

cf sprinddoc.org
```

