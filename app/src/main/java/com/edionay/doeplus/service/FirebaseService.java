package com.edionay.doeplus.service;

import com.edionay.doeplus.model.Event;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseService {

    private static FirebaseAuth autentication;
    private static DatabaseReference firebaseReference;
    private static Event event;

    public static FirebaseAuth getAutentication() {

        if (autentication == null) {
            autentication = FirebaseAuth.getInstance();
        }
        return autentication;
    }

    public static DatabaseReference getFirebaseReference() {
        if (firebaseReference == null) {
            firebaseReference = FirebaseDatabase.getInstance().getReference();
        }
        return firebaseReference;
    }

    public static void publishEvent(Event event) {
        firebaseReference = getFirebaseReference();
        firebaseReference.child("events").push().setValue(event);
    }
}
