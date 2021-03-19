package sn.isi.entité;

import sn.isi.service.IUser;

import java.util.Scanner;

public class ImpUser implements IUser {
    User U=new User();
    Scanner scan =new Scanner(System.in);
    @Override
    public User saisi() {
        System.out.print("entrer l'identifiant de l'utilisateur");
        U.setId(Integer.parseInt(scan.nextLine()));
        System.out.print("entrer le nom de l'utilisateur ");
        U.setNom(scan.nextLine());
        System.out.print("entrer prenom de l'utilisateur");
        U.setPrenom(scan.nextLine());
        System.out.print("entrer l'email de l'utilisateur");
        U.setEmail(scan.nextLine());
        System.out.print("entrer l'etat de l'utilisateur");
        U.setEta(Integer.parseInt(scan.nextLine()));
        return U;
    }

    @Override
    public void  affiche(User U) {

        System.out.print("l'identifiant de l'utilisateur est : \n"+U.getId());
        System.out.print("le nom de l'utilisateur est : \n"+U.getNom());
        System.out.print("le prenom de l'utilisateur est :\n"+U.getPrenom());
        System.out.print("l'email de l'utilisateur est : \n"+U.getEmail());
        System.out.print("l'etat de l'utilisateur est : \n"+U.getEta());
    }
}
