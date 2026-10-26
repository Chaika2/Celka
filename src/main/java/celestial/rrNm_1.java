/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNd_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNm_1 {
    public Object[] id_class;
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        id_break = new byte[]{2, 2};
    }

    public rrNm_1(rrNd_1 rrNd_12, String string) {
        this.id_throws();
        rrNd_1 rrNd_13 = rrNd_12;
        this.id_class[rrNm_1.id_byte[8]] = rrNd_13;
        String string2 = string;
        this.id_class[rrNm_1.id_byte[9]] = string2;
    }

    static {
        rrNm_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_protected[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_protected[1];
        }
        rrNm_1 rrNm_12 = (rrNm_1)object;
        return Objects.equals((rrNd_1)this.id_class[id_byte[0]], (rrNd_1)rrNm_12.id_class[id_byte[1]]) && Objects.equals((String)this.id_class[id_byte[2]], (String)rrNm_12.id_class[id_byte[3]]) ? id_protected[2] : id_protected[3];
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_break[0]];
        objectArray[rrNm_1.id_protected[4]] = (rrNd_1)this.id_class[id_byte[4]];
        objectArray[rrNm_1.id_protected[5]] = (String)this.id_class[id_byte[5]];
        return Objects.hash(objectArray);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x10F9DF0C;
    }

    public rrNd_1 id_class() {
        return (rrNd_1)this.id_class[id_byte[6]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9403C6A4803A008L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-87, 100, -55, 118, 30, -10, 115, 115}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_break() {
        return (String)this.id_class[id_byte[7]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[1]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrNm_1.id_case();
        rrNm_1.id_protected();
        rrNm_1.id_byte();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[10];
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        id_byte = sArray;
    }
}

