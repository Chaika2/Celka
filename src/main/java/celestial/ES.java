/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EP;
import celestial.MM;
import celestial.rja_3;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ES
extends MM {
    private static short[] id_protected;
    private static byte[] id_throws;
    public Object[] id_break;

    public ES(EP eP, xc_3[][][] xc_3Array, rja_3 rja_32) {
        xc_3[][][] xc_3Array2;
        xc_3[][][] xc_3Array3;
        this.id_throws();
        this.id_break[ES.id_protected[0]] = xc_3Array3 = xc_3Array;
        rja_3 rja_33 = rja_32;
        this.id_break[ES.id_protected[1]] = rja_33;
        this.id_byte[ES.id_protected[3]] = xc_3Array2 = (xc_3[][][])this.id_break[id_protected[2]];
        Integer n = ((rja_3)this.id_break[id_protected[4]]).b_();
        this.id_class[ES.id_protected[5]] = n;
        Integer n2 = ((rja_3)this.id_break[id_protected[6]]).c_();
        this.id_class[ES.id_protected[7]] = n2;
        Integer n3 = ((rja_3)this.id_break[id_protected[8]]).d_();
        this.id_class[ES.id_protected[9]] = n3;
    }

    static {
        ES.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC36158F7A37821E5L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA93A7A16;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-80, -72, 111, -47, 15, 112, -51, 54}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        ES.id_catch();
        ES.id_case();
    }

    private static void id_catch() {
        short[] sArray = new short[10];
        sArray[1] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 2;
        id_protected = sArray;
    }

    private static void id_case() {
        id_throws = new byte[]{2};
    }
}

