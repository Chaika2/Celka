/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.VZ;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLw_1
extends Om_1 {
    private static boolean[] id_byte;
    private static short[] id_protected;
    public static Object[] id_class;
    public Object[] id_break;
    private static byte[] id_throws;

    public rrLw_1() {
        this.id_throws();
    }

    static {
        rrLw_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBDD6F8D2;
    }

    public void id_class(VZ vZ) {
        this.id_throws();
        VZ vZ2 = vZ;
        this.id_break[rrLw_1.id_protected[8]] = vZ2;
    }

    public static rrLw_1 id_class(VZ vZ, VZ vZ2) {
        ((rrLw_1)id_class[id_protected[0]]).id_class(id_byte[0]);
        VZ vZ3 = vZ;
        ((rrLw_1)rrLw_1.id_class[rrLw_1.id_protected[1]]).id_break[rrLw_1.id_protected[2]] = vZ3;
        VZ vZ4 = vZ2;
        ((rrLw_1)rrLw_1.id_class[rrLw_1.id_protected[3]]).id_break[rrLw_1.id_protected[4]] = vZ4;
        return (rrLw_1)id_class[id_protected[5]];
    }

    public VZ id_class() {
        this.id_throws();
        return (VZ)((Object)this.id_break[id_protected[6]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE43E59D2479A0541L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-31, -120, -98, 86, -120, 86, -2, 105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public VZ id_break() {
        this.id_throws();
        return (VZ)((Object)this.id_break[id_protected[7]]);
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrLw_1.id_case();
        rrLw_1.id_catch();
        rrLw_1.id_private();
        rrLw_1.id_protected();
    }

    private static void id_catch() {
        short[] sArray = new short[9];
        sArray[4] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        id_protected = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_byte = blArray;
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrLw_1()};
        id_class = objectArray;
    }

    private static void id_private() {
        id_throws = new byte[]{2};
    }
}

