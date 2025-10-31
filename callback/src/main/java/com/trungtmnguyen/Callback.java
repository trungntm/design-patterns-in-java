package com.trungtmnguyen;

public interface Callback<T> {

  void onSuccess(T result);
  void onFailure(String error);

}
