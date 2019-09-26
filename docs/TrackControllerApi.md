# TrackControllerApi

All URIs are relative to *https://spotify-song-suggester.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allTracksUsingGET**](TrackControllerApi.md#allTracksUsingGET) | **GET** /tracks/tracks | allTracks
[**deleteTrackUsingDELETE**](TrackControllerApi.md#deleteTrackUsingDELETE) | **DELETE** /tracks/remove/{trackid} | deleteTrack
[**getSavedTracksUsingGET**](TrackControllerApi.md#getSavedTracksUsingGET) | **GET** /tracks/savedtracks | getSavedTracks
[**getTrackByNameUsingGET**](TrackControllerApi.md#getTrackByNameUsingGET) | **GET** /tracks/track/{name} | getTrackByName
[**recTrackUsingGET**](TrackControllerApi.md#recTrackUsingGET) | **GET** /tracks/recs/{trackid} | recTrack
[**saveTrackUsingPOST**](TrackControllerApi.md#saveTrackUsingPOST) | **POST** /tracks/save/{trackid} | saveTrack


<a name="allTracksUsingGET"></a>
# **allTracksUsingGET**
> Object allTracksUsingGET()

allTracks

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TrackControllerApi;


TrackControllerApi apiInstance = new TrackControllerApi();
try {
    Object result = apiInstance.allTracksUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackControllerApi#allTracksUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteTrackUsingDELETE"></a>
# **deleteTrackUsingDELETE**
> Object deleteTrackUsingDELETE(trackid, authenticated, authorities0Authority, credentials, details, principal)

deleteTrack

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TrackControllerApi;


TrackControllerApi apiInstance = new TrackControllerApi();
String trackid = "trackid_example"; // String | trackid
Boolean authenticated = true; // Boolean | 
String authorities0Authority = "authorities0Authority_example"; // String | 
Map<String, String> credentials = new HashMap(); // Map<String, String> | 
Map<String, String> details = new HashMap(); // Map<String, String> | 
Map<String, String> principal = new HashMap(); // Map<String, String> | 
try {
    Object result = apiInstance.deleteTrackUsingDELETE(trackid, authenticated, authorities0Authority, credentials, details, principal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackControllerApi#deleteTrackUsingDELETE");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackid** | **String**| trackid |
 **authenticated** | **Boolean**|  | [optional]
 **authorities0Authority** | **String**|  | [optional]
 **credentials** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **principal** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSavedTracksUsingGET"></a>
# **getSavedTracksUsingGET**
> Object getSavedTracksUsingGET(authenticated, authorities0Authority, credentials, details, principal)

getSavedTracks

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TrackControllerApi;


TrackControllerApi apiInstance = new TrackControllerApi();
Boolean authenticated = true; // Boolean | 
String authorities0Authority = "authorities0Authority_example"; // String | 
Map<String, String> credentials = new HashMap(); // Map<String, String> | 
Map<String, String> details = new HashMap(); // Map<String, String> | 
Map<String, String> principal = new HashMap(); // Map<String, String> | 
try {
    Object result = apiInstance.getSavedTracksUsingGET(authenticated, authorities0Authority, credentials, details, principal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackControllerApi#getSavedTracksUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticated** | **Boolean**|  | [optional]
 **authorities0Authority** | **String**|  | [optional]
 **credentials** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **principal** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTrackByNameUsingGET"></a>
# **getTrackByNameUsingGET**
> Object getTrackByNameUsingGET(name)

getTrackByName

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TrackControllerApi;


TrackControllerApi apiInstance = new TrackControllerApi();
String name = "name_example"; // String | name
try {
    Object result = apiInstance.getTrackByNameUsingGET(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackControllerApi#getTrackByNameUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| name |

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="recTrackUsingGET"></a>
# **recTrackUsingGET**
> Object recTrackUsingGET(trackid)

recTrack

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TrackControllerApi;


TrackControllerApi apiInstance = new TrackControllerApi();
String trackid = "trackid_example"; // String | trackid
try {
    Object result = apiInstance.recTrackUsingGET(trackid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackControllerApi#recTrackUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackid** | **String**| trackid |

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveTrackUsingPOST"></a>
# **saveTrackUsingPOST**
> Object saveTrackUsingPOST(trackid, authenticated, authorities0Authority, credentials, details, principal)

saveTrack

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.TrackControllerApi;


TrackControllerApi apiInstance = new TrackControllerApi();
String trackid = "trackid_example"; // String | trackid
Boolean authenticated = true; // Boolean | 
String authorities0Authority = "authorities0Authority_example"; // String | 
Map<String, String> credentials = new HashMap(); // Map<String, String> | 
Map<String, String> details = new HashMap(); // Map<String, String> | 
Map<String, String> principal = new HashMap(); // Map<String, String> | 
try {
    Object result = apiInstance.saveTrackUsingPOST(trackid, authenticated, authorities0Authority, credentials, details, principal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TrackControllerApi#saveTrackUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trackid** | **String**| trackid |
 **authenticated** | **Boolean**|  | [optional]
 **authorities0Authority** | **String**|  | [optional]
 **credentials** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **details** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]
 **principal** | [**Map&lt;String, String&gt;**](String.md)|  | [optional]

### Return type

**Object**

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

