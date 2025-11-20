[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/rGfOobSC)


eleve :
CS (15)

![alt text](pLRDZjem4Bv7oZlCRKFRRE-8ebr8r5AnGW9sxquo1AySExMTIbMtxzDzZdsnEY7_G0c7IlK1iCVVp3UVPspkb2PIPmcpBTkw-NHk61iKO_Cu--hFj_0HLhEDltxort-7sHRb6kMEX0YhGA7yZX9-sbRkwpraQKGqEXijAOyXGQL8Z2FR-jK5RhBW6KFTu8ZM9DmxjKCngYmHdhDmeUdkHsLG.png)



✅ Ce que ton implémentation viole (court et précis)
1️⃣ Builder → viole le principe SRP (Responsabilité unique)

📍 Où :
Si ton CoursBuilder gère à la fois la construction et la validation ou la logique métier, il viole SRP.
Il doit uniquement construire l’objet.

2️⃣ Observer → viole le principe OCP (Ouvert/Fermé)

📍 Où :
Dans GestionnaireEmploiDuTemps, si tu dois modifier la classe pour ajouter un nouvel observer ou changer la logique de notification, tu violes OCP.
La classe ne devrait pas être modifiée pour chaque nouvel observer.

3️⃣ Decorator → peut violer le principe LSP (Substitution de Liskov)

📍 Où :
Si un décorateur (ex : EnLigneDecorator, MagistralDecorator) change le comportement du cours au lieu de simplement étendre la description, il ne peut plus remplacer un ICours correctement → violation du LSP.