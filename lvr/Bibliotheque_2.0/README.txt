Bibliotheque 2.0.0

Le programme bibliotheque cree les objets suivants:

- Un objet de type Abonne: monAbonne
- Un objet de type Livre: monLivre
- Un objet de type BD: maBD; BD etant une sous-classe de la classe Livre 
- Un objet de type MusiqueCD: monCD
- Un objet de type FilmDVD: monDVD;
- Les classes Livre, MusiqueCD et FilmDVD étant des implementations de l'interface IDocument.

Pour une description detaillée de ces classes, se referer
au diagramme de classes UML_Bibliotheque_2.0.0.jpg dans le repertoire.

Puis le programme associe les objets monLivre et maBD à l'objet monAbonne,
et affiche:

- Des informations liés à monLivre et maBD
- Des informations liés à monAbonne
- Des informations sur la disponibilité de monCD, monDVD, monLivre et maBD (NOUVEAU sur 2.0)
- Une demande d'emprunt par monAbonne (NOUVEAU sur 2.0)
- Une demande de retour par monAbonne (NOUVEAU sur 2.0)

Dans l'exemple,les informations affichées sont les suivantes:

---Infos sur monLivre et maBD:
Auteur:Ingmar BERGMAN	Annee publication:1987	Titre:Linterna magica
Le document selectionné est un(e) livre.
Vous pouvez emprunter un maximum de 5.
Auteur:Wilfrid LUPANO	Annee publication:2014	Titre:Les vieux fourneaux(tome 1)	Dessinateur: Paul CAUUET
Le document selectionné est un(e) BD.
Vous pouvez emprunter un maximum de 3.

---Infos sur monAbonne:
Abonne: Beatriz MORENO.
Documents empruntés: 
Linterna magica
Les vieux fourneaux(tome 1)

---Infos disponiblilité monCD, monDVD, monLivre, maBD:
Le CD Temple of Low Men est bien disponible
Le DVD Mary Reilly est bien disponible
Le livre Linterna magica est bien disponible
Le livre Les vieux fourneaux(tome 1) est bien disponible

---Demande d'emprunt de plusieurs IDocuments avec methode unique .emprunter()
Le livre Linterna magica est bien disponible
L'abonné Beatriz MORENO souhaite l'emprunter.
Le CD Temple of Low Men est bien disponible
L'abonné Beatriz MORENO souhaite l'emprunter.
Le DVD Mary Reilly est bien disponible
L'abonné Beatriz MORENO souhaite l'emprunter.
Le livre Les vieux fourneaux(tome 1) est bien disponible
L'abonné Beatriz MORENO souhaite l'emprunter.

---Demande de retour de plusieurs IDocuments avec methode unique .retourner()
L'abonné Beatriz MORENO souhaite rendre le document Linterna magica.
L'abonné Beatriz MORENO souhaite rendre le document Temple of Low Men.
L'abonné Beatriz MORENO souhaite rendre le document Mary Reilly.
L'abonné Beatriz MORENO souhaite rendre le document Les vieux fourneaux(tome 1).
