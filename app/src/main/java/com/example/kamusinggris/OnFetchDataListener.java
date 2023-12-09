package com.example.kamusinggris;

import com.example.kamusinggris.Models.APIResponse;

public interface OnFetchDataListener {
    void onFetchData(APIResponse apiResponse, String message);
    void onError(String message);

}
