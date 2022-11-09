# Tasca_S5_01_N3_01  
## Exercici API Rest connectada a una altra API Rest amb RestTemplate

![N|Solid](https://logistreak.com/images/icon/mysql.png)


Fent servir RestTemplate o WebClient, t’hauràs de connectar a l’API que has fet al nivell 2, per cridar i testar totes les peticions que permet aquesta API.



## Objetius
- Protocol HTTP / REST.
- JPA.
- CRUD amb Spring.
- MySQL.
- RestTemplate.

Fent servir RestTemplate o WebClient, t’hauràs de connectar a l’API que has fet al nivell 2, per cridar i testar totes les peticions que permet aquesta API.

Tingues en compte, que en aquesta tasca del nivell 3, no tens cap referència a cap base de dades, ni necessites fer servir JPA, ja que el teu repositori accedirà a l’API del nivell 2.

Per a això, depenent del package principal, crearàs una estructura de packages, on ubicaràs les classes que necessitis:

-   cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.controllers
-   cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.domain
-   cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.dto
-   cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.services
-   cat.itacademy.barcelonactiva.cognoms.nom.s05.t01.n03.model.repository

    <img src="https://github.com/gonzashan/Tasca_S5_01_N3/blob/main/tree.png" height="263" width="300" >
  

 
La classe ubicada al paquet controllers (FlorController, per exemple), haurà de ser capaç de donar resposta a les següents peticions per actualitzar i consultar informació:

    http://localhost:9002/flor/clientFlorsAdd
    http://localhost:9002/flor/clientFlorsUpdate
    http://localhost:9002/flor/clientFlorsDelete/{id}
    http://localhost:9002/flor/clientFlorsGetOne/{id}
    http://localhost:9002/flor/clientFlorsAll
    


