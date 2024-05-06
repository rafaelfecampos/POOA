package br.edu.vianna.game.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UtilService {

    public static String md5(String valor) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        BigInteger hash = new BigInteger(md.digest( valor.getBytes() ));
        return hash.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.println( md5("a") );
            System.out.println( md5("123") );
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Erro na criptografia");
        }
    }
}
