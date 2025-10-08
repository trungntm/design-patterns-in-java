package com.trungntm;

public interface Callback<T> {

  void onSuccess(T result);
  void onFailure(String error);

}
