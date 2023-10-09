# DiningReview Spring Application

DiningReview is a Spring application for managing restaurant reviews. It allows users to add reviews for restaurants, search for restaurants by allergies (peanut, dairy, or egg), and manage user profiles.

## Table of Contents
- [Entities](#entities)
- [Repositories](#repositories)
- [Controllers](#controllers)
- [Application Configuration](#application-configuration)
- [Getting Started](#getting-started)

## Entities<a name="entities"></a>

### Restaurant Entity
- Represents a restaurant with various attributes.
- Fields:
  - `id`: Unique identifier for the restaurant.
  - `name`: Name of the restaurant.
  - `address`: Address of the restaurant.
  - `city`: City where the restaurant is located.
  - `zipCode`: Zip code of the restaurant's location.
  - `overallScore`: Overall score of the restaurant (not defined in the provided code).
  - `peanutScore`: Score related to peanut allergies (not defined in the provided code).
  - `dairyScore`: Score related to dairy allergies (not defined in the provided code).
  - `eggScore`: Score related to egg allergies (not defined in the provided code).

### Review Entity
- Represents a user review for a restaurant.
- Fields:
  - `id`: Unique identifier for the review.
  - `userName`: Name of the user who wrote the review.
  - `restaurantId`: Identifier of the restaurant being reviewed.
  - `review`: The actual review content.
  - `peanutScore`: User's rating for peanut allergies.
  - `dairyScore`: User's rating for dairy allergies.
  - `eggScore`: User's rating for egg allergies.

### User Entity
- Represents a user profile with various attributes.
- Fields:
  - `id`: Unique identifier for the user.
  - `displayName`: User's display name.
  - `city`: City where the user is located.
  - `state`: State where the user is located (not defined in the provided code).
  - `zipCode`: User's zip code.
  - `peanutWatch`: Indicates if the user is watching for peanut allergies.
  - `dairyWatch`: Indicates if the user is watching for dairy allergies.
  - `eggWatch`: Indicates if the user is watching for egg allergies.

## Repositories<a name="repositories"></a>

### RestaurantRepository
- Interface extending `CrudRepository` for managing restaurant entities.
- Provides methods for querying restaurants, such as finding restaurants by name and zip code, and sorting by allergy scores.

### ReviewRepository
- Interface extending `CrudRepository` for managing review entities.
- Provides methods for querying reviews, such as finding reviews by restaurant ID and user name.

### UserRepository
- Interface extending `CrudRepository` for managing user entities.
- Provides methods for querying users, such as finding users by display name.

## Controllers<a name="controllers"></a>

### UserController
- Manages user-related operations.
- Endpoints:
  - `POST /users`: Adds a new user profile.
  - `GET /users/{displayName}`: Retrieves a user profile by display name.
  - `PUT /users/{displayName}`: Updates user profile information by display name.

### ReviewController
- Manages review-related operations.
- Endpoints:
  - `POST /reviews`: Adds a new review for a restaurant.
  
### RestaurantController
- Manages restaurant-related operations.
- Endpoints:
  - `POST /restaurants`: Adds a new restaurant.
  - `GET /restaurants/{id}`: Retrieves a restaurant by its unique identifier.
  - `GET /restaurants`: Retrieves a list of all restaurants.
  - `GET /restaurants/search`: Searches for restaurants by zip code and allergy type.

## Application Configuration<a name="application-configuration"></a>

- The application is configured to use an H2 database.
- The server runs on port 8080.

## Getting Started<a name="getting-started"></a>

1. Clone the DiningReview repository to your local machine.

2. Open the project in your preferred Java IDE.

3. Build and run the application using Spring Boot.

4. Access the application using the following URLs:
   - Application: [http://localhost:8080](http://localhost:8080)
   - H2 Database Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
     - JDBC URL: jdbc:h2:file:/Users/maria/Library/Mobile Documents/com~apple~CloudDocs/projects/DiningReview/DiningReview/src/main/resources
     - Username: sa
     - Password: password

5. Use the provided controllers to interact with the application, such as adding users, restaurants, and reviews, as well as searching for restaurants by allergies.

Feel free to customize and extend the application according to your needs.
