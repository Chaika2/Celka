/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rjG_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnx_3 {
    private static boolean[] id_byte;
    private static byte[] id_protected;
    public static Object[] id_class;
    private static short[] id_throws;
    public Object[] id_break;

    private static void id_byte() {
        short[] sArray = new short[7];
        sArray[3] = 1;
        sArray[6] = 1;
        id_throws = sArray;
    }

    public rrnx_3() {
        this.id_catch();
    }

    static {
        rrnx_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x889351B4E584646DL;
    }

    public static rrnx_3 id_class(iB_2 iB_22, rjG_2 rjG_22) {
        iB_2 iB_23 = iB_22;
        ((rrnx_3)rrnx_3.id_class[rrnx_3.id_throws[0]]).id_break[rrnx_3.id_throws[1]] = iB_23;
        rjG_2 rjG_23 = rjG_22;
        ((rrnx_3)rrnx_3.id_class[rrnx_3.id_throws[2]]).id_break[rrnx_3.id_throws[3]] = rjG_23;
        return (rrnx_3)id_class[id_throws[4]];
    }

    public rjG_2 id_class() {
        return (rjG_2)this.id_break[id_throws[6]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{37, 39, 6, -13, 15, 123, -80, 38}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD6511268;
    }

    public iB_2 id_break() {
        return (iB_2)this.id_break[id_throws[5]];
    }

    private static void id_throws() {
        id_protected = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrnx_3.id_case();
        rrnx_3.id_byte();
        rrnx_3.id_throws();
        rrnx_3.id_protected();
    }

    private void id_catch() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
        }
    }

    private static void id_case() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrnx_3()};
        id_class = objectArray;
    }
}

