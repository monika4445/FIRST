package hotel.service;

import hotel.entity.Payment;

import java.util.Date;

public interface PaymentService {
    void initSystem();

    void makePayment();

    void onPause();

    void onStart();

    void onStop();

    void onDestroy();

    void onActivityResult(int requestCode, int resultCode, Date data);
}
