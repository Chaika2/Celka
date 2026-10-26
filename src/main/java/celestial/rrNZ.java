/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNd_1;
import celestial.rrNw_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNZ {
    private static short[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;

    public rrNd_1 id_byte() {
        return (rrNd_1)this.id_class[id_break[3]];
    }

    public rrNZ(rrNd_1 rrNd_12, rrNw_1 rrNw_12, int n) {
        this.id_protected();
        rrNd_1 rrNd_13 = rrNd_12;
        this.id_class[rrNZ.id_break[6]] = rrNd_13;
        rrNw_1 rrNw_13 = rrNw_12;
        this.id_class[rrNZ.id_break[7]] = rrNw_13;
        Integer n2 = n;
        this.id_class[rrNZ.id_break[8]] = n2;
    }

    static {
        rrNZ.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_protected[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_protected[1];
        }
        rrNZ rrNZ2 = (rrNZ)object;
        return Objects.equals(((rrNd_1)this.id_class[id_break[0]]).id_case(), ((rrNd_1)rrNZ2.id_class[id_break[1]]).id_case());
    }

    public int hashCode() {
        return Objects.hashCode(((rrNd_1)this.id_class[id_break[2]]).id_case());
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAD8E9258B05BC6C1L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-30, 66, 103, -15, 108, -108, 61, -82}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xADEE1B8B;
    }

    public rrNw_1 id_class() {
        return (rrNw_1)this.id_class[id_break[4]];
    }

    public int id_break() {
        return (Integer)this.id_class[id_break[5]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrNZ.id_throws();
        rrNZ.id_case();
        rrNZ.id_catch();
    }

    private static void id_catch() {
        id_byte = new byte[]{3, 2};
    }

    private static void id_case() {
        short[] sArray = new short[9];
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        id_break = sArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrNZ.id_byte[1]] = id_protected[2];
        }
    }
}

