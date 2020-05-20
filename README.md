
## Librairie Partition  
#### A propos de la librarie Partition  
> Cette librairie contient une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments`  
  
- Librairie Java  
- Version 1.0.0  
  
### Prérequis Installer Java JDK (minimum version 8), si cela n'est pas déjà le cas.  
* *[Guide d'installation sur Mac](https://mkyong.com/java/how-to-install-java-on-mac-osx/)*  
* *[Guide d'installation sur Linux (Debian ou Ubuntu)](https://docs.datastax.com/en/jdk-install/doc/jdk-install/installOpenJdkDeb.html)*  
* *[Guide d'installation sur Windows](http://objis.com/tutoriel-java-installation-java-jdk-8/)*  
  
### Instruction d'installation de la librairie  
1. Télécharger le fichier **partition-1.0.0.jar**, se trouvant dans le repertoire /libs ou cloner le projet et accéder au repertoire /libs  
2. Copier le fichier **partition-1.0.0.jar** dans le repertoire /libs à la racine de votre projet Java [le créer s'il n'existe pas]  
3. Importer le fichier **partition-1.0.0.jar** à dans votre projet  
	* Configuration avec IntelliJ IDE  
       - Ouvrir les paramètres du projet (Ctrl Alt Shift S)  
       - Dans le panneau Paramètres du projet à gauche, choisissez Modules  
       - Dans le volet droit plus grand, choisissez l'onglet Dépendances  
       - Appuyez sur le bouton Ajouter ... à l'extrême droite de l'écran (si vous avez un écran plus petit comme moi, vous devrez peut-être faire glisser redimensionner vers la droite pour le voir)  
       - Dans le menu déroulant des options Ajouter, choisissez "Bibliothèque". Une boîte de dialogue "Choisir les bibliothèques" apparaît.  
       - Appuyez sur "Nouvelle bibliothèque ..."  
       - Choisissez un titre approprié pour la bibliothèque  
       - Appuyez sur "Attach Classes ..."  
       - Choisissez le Jar dans votre répertoire libs / et appuyez sur OK pour ignorer  
          
   * Configuration avec Eclipse IDE  
       - Faites un clic droit sur votre projet  
       - Sélectionnez Build Path  
       - Cliquez sur Configure Build Path  
       - Cliquez sur Bibliothèques et sélectionnez Ajouter des fichiers JAR externes  
       - Sélectionnez le fichier jar dans le dossier /libs  
       - Cliquez et appliquez et OK  
          
   * Configuration avec VS Code : *[Suivre ce lien](https://stackoverflow.com/questions/50232557/visual-studio-code-java-extension-howto-add-jar-to-classpath/54535301#54535301)*  
4. Utilisation de la librairie  
   - Importer la librairie  
    ```java   
    import com.adneom.stephanekoman.Library;  
	 ```
	 - Créer un objet Library en spécifiant le type  
   ```java  
	 Library<Integer> libraryInt = new Library<Integer>(); Library<String> libraryStr = Library<String>(); 
	 ```  
	 - Initialiser la liste et la taille  
      ```java  
	 List<Integer> listInt = Arrays.asList(3, 4, 6, 8, 9); int size = 2; 
	 ```  
	 ou     
     ```java  
	 List<String> listStr = Arrays.asList("A", "B", "C", "D", "E"); int size = 2; 
	 ```  
	 - Appeler la fonction partition de la classe Library  
   ```java   
	List<List<Integer>> listOfListsInt = new ArrayList<>();  
	// Appeler la méthode partition dans votre fonction  
	listOfLists = libraryInt.partition(listInt, size); 
	 ``` 
	 ``resultat : [[3, 4], [6, 8], [9]]`` 
	 ou  
     
   ```java   
	 List<List<String>> listOfListsStr = new ArrayList<>();  
	 // Appeler la méthode partition dans votre fonction  
	 listOfListsStr = libraryStr.partition(listStr, size); 
	 ``` 
	 ``resultat : [[A, B], [C, D], [E]]``
 5. Exemple d'utilisation de la fonction partition de la classe Library avec une liste d'entier  
```java  
// importer la librairie  
import com.adneom.stephanekoman.Library;  
... 
// Créer un objet Library et spécifier le type  
Library<Integer> library = new Library<Integer>();  
  
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);  
int size = 2;  
  
List<List<Integer>> listOfLists = new ArrayList<>();  
  
// Appeler la méthode partition dans votre fonction  
listOfLists = library.partition(list, size);  
...
```  
> ``resultat : [[1, 2], [3, 4], [5]]``  
  
6. Exemple d'utilisation de la fonction partition de la classe Library avec une liste de chaine de caractère  
```java  
// importer la librairie  
import com.adneom.stephanekoman.Library;  
...  
// Créer un objet Library et spécifier le type  
Library<String> library = new Library<String>();  
  
List<String> list = Arrays.asList("Bjr", "Stef", "Chris", "Thanks", "All");  
int size = 2;  
  
List<List<String>> listOfLists = new ArrayList<>();  
  
// Appeler la méthode partition dans votre fonction  
listOfLists = library.partition(list, size); 
... 
```  
> ``resultat : [[Bjr, Stef], [Chris, Thanks], [All]]``

**Merci  d'utiliser ma librairie :smiley:**