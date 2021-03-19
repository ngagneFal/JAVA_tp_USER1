package com.company;

import sn.isi.entité.ImpUser;
import sn.isi.entité.User;
import sn.isi.service.IUser;

public class Main {

    public static void main(String[] args) {
	// write your code here
        IUser IU= new ImpUser();
        User U= IU.saisi();
        IU.affiche(U);
    }
}
