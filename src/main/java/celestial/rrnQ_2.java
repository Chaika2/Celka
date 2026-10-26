/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Sz_1;
import celestial.rfl_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnQ_2 {
    private static short[] id_byte;
    public Object[] id_class;
    private static byte[] id_protected;
    public static Object[] id_break;
    private static boolean[] id_throws;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new rrnQ_2()};
        id_break = objectArray;
    }

    public rrnQ_2() {
        this.id_catch();
    }

    static {
        rrnQ_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCE0135A507724F51L;
    }

    public Sz_1 id_class() {
        return (Sz_1)this.id_class[id_byte[5]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC9CE7EEF;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{20, -58, 37, -86, -27, 38, 80, -12}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrnQ_2 id_class(Sz_1 sz_1, rfl_3 rfl_32) {
        Sz_1 sz_12 = sz_1;
        ((rrnQ_2)rrnQ_2.id_break[rrnQ_2.id_byte[0]]).id_class[rrnQ_2.id_byte[1]] = sz_12;
        rfl_3 rfl_33 = rfl_32;
        ((rrnQ_2)rrnQ_2.id_break[rrnQ_2.id_byte[2]]).id_class[rrnQ_2.id_byte[3]] = rfl_33;
        return (rrnQ_2)id_break[id_byte[4]];
    }

    public rfl_3 id_break() {
        return (rfl_3)this.id_class[id_byte[6]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrnQ_2.id_throws();
        rrnQ_2.id_case();
        rrnQ_2.id_protected();
        rrnQ_2.id_byte();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    private static void id_case() {
        short[] sArray = new short[7];
        sArray[3] = 1;
        sArray[6] = 1;
        id_byte = sArray;
    }

    private static void id_protected() {
        id_protected = new byte[]{2};
    }
}

