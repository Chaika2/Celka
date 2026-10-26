/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.H;
import celestial.Y;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class l_1 {
    private static byte[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static short[] id_protected;

    public int id_byte() {
        return (Integer)this.id_class[id_protected[6]];
    }

    public l_1(Y y, H h, int n, int n2) {
        this.id_private();
        Y y2 = y;
        this.id_class[l_1.id_protected[0]] = y2;
        H h2 = h;
        this.id_class[l_1.id_protected[1]] = h2;
        Integer n3 = n;
        this.id_class[l_1.id_protected[2]] = n3;
        Integer n4 = n2;
        this.id_class[l_1.id_protected[3]] = n4;
    }

    static {
        l_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB1EBA4921F02805DL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-78, 118, -46, 107, 107, -101, 46, -24}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_class() {
        return (Integer)this.id_class[id_protected[7]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x52D50E2D;
    }

    public H id_break() {
        return (H)((Object)this.id_class[id_protected[5]]);
    }

    private static void id_throws() {
        id_break = new byte[]{4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        l_1.id_case();
        l_1.id_catch();
        l_1.id_throws();
    }

    private static void id_catch() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        id_protected = sArray;
    }

    private static void id_case() {
        id_byte = new boolean[2];
    }

    public Y id_protected() {
        return (Y)((Object)this.id_class[id_protected[4]]);
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[l_1.id_break[1]] = id_byte[0];
            objectArray[l_1.id_break[2]] = id_byte[1];
        }
    }
}

