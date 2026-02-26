package com.mycompany.exercise.jawa1;

interface DialogState {
    void render();
    DialogState next();
}

class Dialog1 implements DialogState {

    @Override
    public void render() {
        System.out.println("Ini adalah dialog pertama.");
        System.out.println("Tekan ENTER untuk lanjut...");
    }

    @Override
    public DialogState next() {
        return new Dialog2();
    }
}

class Dialog2 implements DialogState {

    @Override
    public void render() {
        System.out.println("Sekarang kamu di dialog kedua.");
        System.out.println("Tekan ENTER lagi...");
    }

    @Override
    public DialogState next() {
        return new Dialog3();
    }
}

class Dialog3 implements DialogState {

    @Override
    public void render() {
        System.out.println("Ini dialog terakhir.");
        System.out.println("udah selesai.");
    }

    @Override
    public DialogState next() {
        return null; // tidak ada lagi
    }
}