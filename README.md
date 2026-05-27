# Lost and Found Mobile App (7.1P)

This is an Android Lost and Found mobile application developed in Android Studio using Java and SQLite database.

The purpose of this application is to help users report lost or found items and allow owners to reconnect with their belongings through advert postings.

## Features

- Create lost or found adverts
- Enter item details such as:
  - Name
  - Phone number
  - Description
  - Location
  - Category
- Upload an image for each advert
- Store date and time stamp for each advert
- Save advert data using SQLite database
- Display all lost and found adverts
- View full advert details
- Remove adverts after the item is found
- Filter adverts by category

## Technologies Used

- Java
- Android Studio
- SQLite Database
- XML Layouts
- Android Intents
- ListView
- Image Upload Functionality

## App Structure

### MainActivity.java
Handles the home screen navigation between different app screens.

### CreateAdvertActivity.java
Allows users to create adverts, upload images, validate input, and save advert data into SQLite database.

### DatabaseHelper.java
Manages SQLite database operations including table creation, inserting adverts, retrieving adverts, filtering data, and deleting adverts.

### Advert.java
Model class used to store advert information such as description, category, image, and timestamp.

### ItemListActivity.java
Displays all saved adverts in a list format and supports category filtering.

### ItemDetailActivity.java
Displays full advert details and allows adverts to be removed after the item is returned.

## SQLite Database

The application uses SQLite database for local storage. The database stores:

- Advert ID
- Lost or found type
- Name
- Phone number
- Description
- Location
- Category
- Image URI
- Timestamp

This allows advert data to remain saved even after the application is closed and reopened.

## Testing

The application was tested on Android Emulator for the following functionality:

- Creating adverts
- Uploading images
- Saving data into SQLite
- Viewing advert list
- Viewing advert details
- Filtering adverts by category
- Removing adverts
- Database persistence after restarting the app

## Author

Kamlesh
