# LogoutControllerApi

All URIs are relative to *https://spotify-song-suggester.herokuapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**logoutUsingGET**](LogoutControllerApi.md#logoutUsingGET) | **GET** /oauth/revoke-token | logout


<a name="logoutUsingGET"></a>
# **logoutUsingGET**
> logoutUsingGET()

logout

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LogoutControllerApi;


LogoutControllerApi apiInstance = new LogoutControllerApi();
try {
    apiInstance.logoutUsingGET();
} catch (ApiException e) {
    System.err.println("Exception when calling LogoutControllerApi#logoutUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.
