package com.exemplo.tripvr.helper;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class FirebaseHelper {

    private static DatabaseReference db;
    private static StorageReference referenciaStorage;


    public static DatabaseReference getFirebase(){
        if(db==null){
            db = FirebaseDatabase.getInstance().getReference();
        }
        return db;
    }

    public static StorageReference getFirebaseStorage(){

        if(referenciaStorage==null){
            referenciaStorage = FirebaseStorage.getInstance().getReference();
        }
        return referenciaStorage;
    }



}
