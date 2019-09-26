# OpenControllerApi

All URIs are relative to *https://spotify-song-suggester.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewUserUsingPOST**](OpenControllerApi.md#addNewUserUsingPOST) | **POST** /createnewuser | addNewUser


<a name="addNewUserUsingPOST"></a>
# **addNewUserUsingPOST**
> Object addNewUserUsingPOST(newuser)

addNewUser

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.OpenControllerApi;


OpenControllerApi apiInstance = new OpenControllerApi();
User newuser = new User(); // User | newuser
try {
    Object result = apiInstance.addNewUserUsingPOST(newuser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpenControllerApi#addNewUserUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newuser** | [**User**](User.md)| newuser |

### Return type

**Object**
