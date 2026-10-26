/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdb_3;
import celestial.rrcn_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcA_2 {
    public Object[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    public rrcA_2(rdb_3 rdb_32, rrcn_3[] rrcn_3Array) {
        rrcn_3[] rrcn_3Array2;
        this.id_protected();
        rdb_3 rdb_33 = rdb_32;
        this.id_class[rrcA_2.id_break[5]] = rdb_33;
        this.id_class[rrcA_2.id_break[6]] = rrcn_3Array2 = rrcn_3Array;
    }

    static {
        rrcA_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_protected[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_protected[1];
        }
        rrcA_2 rrcA_22 = (rrcA_2)object;
        return Objects.equals((rdb_3)this.id_class[id_break[0]], (rdb_3)rrcA_22.id_class[id_break[1]]);
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_protected[2]];
        objectArray[rrcA_2.id_protected[3]] = (rdb_3)this.id_class[id_break[2]];
        return Objects.hash(objectArray);
    }

    public rrcn_3[] id_class() {
        return (rrcn_3[])this.id_class[id_break[4]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA45A1144;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-6, 5, -111, 1, 69, 40, 60, -25}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAEE3E60A2BFD24C6L;
    }

    public rdb_3 id_break() {
        return (rdb_3)this.id_class[id_break[3]];
    }

    private static void id_throws() {
        id_byte = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrcA_2.id_byte();
        rrcA_2.id_case();
        rrcA_2.id_throws();
    }

    private static void id_case() {
        short[] sArray = new short[7];
        sArray[4] = 1;
        sArray[6] = 1;
        id_break = sArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }
}

