# MajesticCup - API de gestion des coupes de football ⚽

## **Description**
MajesticCup est une API robuste et sécurisée pour gérer les compétitions de football en mode élimination directe. Elle permet aux administrateurs de configurer les compétitions, de suivre les performances des équipes et des joueurs, et d'offrir des statistiques en temps réel.

---

## **Fonctionnalités principales**
- **Gestion des équipes** :
    - Ajouter, modifier et supprimer des équipes et des joueurs.
- **Organisation des compétitions** :
    - Gestion des tours en fonction des résultats des matchs.
    - Tirage au sort automatique pour les matchs des tours suivants.
- **Suivi des résultats et statistiques** :
    - Saisie des résultats des matchs (buts, assists, cartons).
    - Classements des buteurs, passeurs, et joueurs sanctionnés.
- **Sécurité avancée** :
    - Authentication avec JWT.
    - Autorisations basées sur les rôles (`ADMIN`, `OPERATOR`, `USER`).

---

## **Architecture des collections MongoDB**
### **Team**
```json
{
  "_id": "ObjectId",
  "name": "string",
  "city": "string",
  "players": [
    {
      "id": "ObjectId",
      "name": "string",
      "surname": "string",
      "position": "string",
      "number": "int"
    }
  ]
}
  ```
### **Match**
```json
{
  "_id": "ObjectId",
  "round": "int",
  "team1": "ObjectId",
  "team2": "ObjectId",
  "result": {
    "team1Goals": "int",
    "team2Goals": "int",
    "statistics": [
      {
        "playerId": "ObjectId",
        "goals": "int",
        "assists": "int",
        "yellowCards": "int",
        "redCards": "int"
      }
    ]
  },
  "winner": "ObjectId"
}
  ```
### **Competition**
```json
{
"_id": "ObjectId",
"name": "string",
"numberOfTeams": "int",
"teams": ["ObjectId"],
"currentRound": "int",
"rounds": ["ObjectId"]
}
 ```

## Endpoints REST

### Admin API (requiert le rôle ADMIN)
POST /api/admin/teams : Ajouter une équipe.
POST /api/admin/competitions : Créer une compétition.
Operator API (requiert le rôle OPERATOR)
POST /api/operator/matches/results : Saisir les résultats d’un match.

### Public API
 ````GET /api/public/results ````: Consulter les résultats des matchs.
````GET /api/public/statistics/top-scorers```` : Classement des meilleurs buteurs.
```` GET /api/public/statistics/top-assists ````: Classement des meilleurs passeurs.
````GET /api/public/statistics/cards ````: Classement des cartons.

## Technologies utilisées
Framework : Spring Boot
Base de données : MongoDB
Sécurité : Spring Security, JWT
Configuration : YAML
