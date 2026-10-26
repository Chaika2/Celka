/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQK;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class rrNr_1
extends rrQK {
    private static double[] doublesbffd289e7f4e3a1694c7105bb77b8007;

    static {
        rrNr_1.id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFFA3173D5B53ADDEL;
    }

    @Override
    public double id_class(double d) {
        double d2 = doublesbffd289e7f4e3a1694c7105bb77b8007[0];
        return d == doublesbffd289e7f4e3a1694c7105bb77b8007[1] ? doublesbffd289e7f4e3a1694c7105bb77b8007[2] : (d == doublesbffd289e7f4e3a1694c7105bb77b8007[3] ? doublesbffd289e7f4e3a1694c7105bb77b8007[4] : Math.pow(doublesbffd289e7f4e3a1694c7105bb77b8007[5], doublesbffd289e7f4e3a1694c7105bb77b8007[6] * d) * Math.sin((d * doublesbffd289e7f4e3a1694c7105bb77b8007[7] - doublesbffd289e7f4e3a1694c7105bb77b8007[8]) * d2) + doublesbffd289e7f4e3a1694c7105bb77b8007[9]);
    }

    private static void id_class() {
        double[] dArray = new double[10];
        dArray[0] = 2.0943951023931953;
        dArray[3] = 1.0;
        dArray[4] = 1.0;
        dArray[5] = 2.0;
        dArray[6] = -10.0;
        dArray[7] = 10.0;
        dArray[8] = 0.75;
        dArray[9] = 1.0;
        doublesbffd289e7f4e3a1694c7105bb77b8007 = dArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x53B5EEC4;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{55, 33, -99, -124, 54, 117, -107, -80}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

