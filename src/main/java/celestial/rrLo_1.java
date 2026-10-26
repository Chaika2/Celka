/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rLY;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLo_1 {
    public static Object[] id_class;
    public Object[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_throws;

    private static void id_byte() {
        short[] sArray = new short[8];
        sArray[3] = 1;
        sArray[7] = 1;
        id_throws = sArray;
    }

    public rrLo_1() {
        this.id_protected();
    }

    static {
        rrLo_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFDE0902F44936AADL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA5C6CBC4;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{2, 79, -60, 101, -18, -45, -33, -53}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rLY id_class() {
        return (rLY)this.id_break[id_throws[7]];
    }

    public static void id_class(iB_2 iB_22, rLY rLY2) {
        rrLo_1 rrLo_12 = rrLo_1.id_break(iB_22, rLY2);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[5]]).id_finally().id_class(rrLo_12);
    }

    public iB_2 id_break() {
        return (iB_2)this.id_break[id_throws[6]];
    }

    public static rrLo_1 id_break(iB_2 iB_22, rLY rLY2) {
        iB_2 iB_23 = iB_22;
        ((rrLo_1)rrLo_1.id_class[rrLo_1.id_throws[0]]).id_break[rrLo_1.id_throws[1]] = iB_23;
        rLY rLY3 = rLY2;
        ((rrLo_1)rrLo_1.id_class[rrLo_1.id_throws[2]]).id_break[rrLo_1.id_throws[3]] = rLY3;
        return (rrLo_1)id_class[id_throws[4]];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLo_1()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLo_1.id_case();
        rrLo_1.id_byte();
        rrLo_1.id_catch();
        rrLo_1.id_throws();
    }

    private static void id_catch() {
        id_byte = new byte[]{2};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
        }
    }
}

