## Java Spring Back End - Build Week

Spotifier (Spotify Song Suggester) using Java Spring/Maven


Project GitHub: https://github.com/Build-Week-Spotify-Song-Suggester

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.LogoutControllerApi;

import java.io.File;
import java.util.*;

public class LogoutControllerApiExample {

    public static void main(String[] args) {
        
        LogoutControllerApi apiInstance = new LogoutControllerApi();
        try {
            apiInstance.logoutUsingGET();
        } catch (ApiException e) {
            System.err.println("Exception when calling LogoutControllerApi#logoutUsingGET");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://spotify-song-suggester.herokuapp.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*LogoutControllerApi* | [**logoutUsingGET**](docs/LogoutControllerApi.md#logoutUsingGET) | **GET** /oauth/revoke-token | logout
*OpenControllerApi* | [**addNewUserUsingPOST**](docs/OpenControllerApi.md#addNewUserUsingPOST) | **POST** /createnewuser | addNewUser
*TrackControllerApi* | [**allTracksUsingGET**](docs/TrackControllerApi.md#allTracksUsingGET) | **GET** /tracks/tracks | allTracks
*TrackControllerApi* | [**deleteTrackUsingDELETE**](docs/TrackControllerApi.md#deleteTrackUsingDELETE) | **DELETE** /tracks/remove/{trackid} | deleteTrack
*TrackControllerApi* | [**getSavedTracksUsingGET**](docs/TrackControllerApi.md#getSavedTracksUsingGET) | **GET** /tracks/savedtracks | getSavedTracks
*TrackControllerApi* | [**getTrackByNameUsingGET**](docs/TrackControllerApi.md#getTrackByNameUsingGET) | **GET** /tracks/track/{name} | getTrackByName
*TrackControllerApi* | [**recTrackUsingGET**](docs/TrackControllerApi.md#recTrackUsingGET) | **GET** /tracks/recs/{trackid} | recTrack
*TrackControllerApi* | [**saveTrackUsingPOST**](docs/TrackControllerApi.md#saveTrackUsingPOST) | **POST** /tracks/save/{trackid} | saveTrack