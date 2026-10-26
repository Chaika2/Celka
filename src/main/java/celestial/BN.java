/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BN {
    private static short[] id_break;
    private static double[] id_byte;
    public Object[] id_class;
    private static byte[] id_protected;
    private static boolean[] id_throws;

    private static void id_byte() {
        id_byte = new double[1];
    }

    public BN(iB_2 iB_22, double d) {
        this.id_protected();
        iB_2 iB_23 = iB_22;
        this.id_class[BN.id_break[2]] = iB_23;
        Double d2 = d;
        this.id_class[BN.id_break[3]] = d2;
    }

    static {
        BN.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1A019BA6;
    }

    public iB_2 id_class() {
        return (iB_2)this.id_class[id_break[0]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{12, 23, -93, -128, 109, -6, -3, 48}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD32D3D3D813B51D2L;
    }

    public double id_break() {
        return (Double)this.id_class[id_break[1]];
    }

    private static void id_throws() {
        id_protected = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        BN.id_catch();
        BN.id_case();
        BN.id_byte();
        BN.id_throws();
    }

    private static void id_catch() {
        id_throws = new boolean[]{true};
    }

    private static void id_case() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_break = sArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[BN.id_throws[0]] = id_byte[0];
        }
    }
}

