package com.example.mvvmnewsapp.util

//recommended by Google to be used to wrap around network responses
//a generic class (with a generic type T) to differentiate between successful and error responses and also help us to handle the loading state
sealed class Resource<T>(
    //response body
    val data: T? = null,
    //respnse message , 4eg, the error message
    val message: String? = null
) {

    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T> : Resource<T>()
}