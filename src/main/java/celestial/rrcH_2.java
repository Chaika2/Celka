/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdb_3;
import celestial.rrcy_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcH_2 {
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    public rrcH_2(rdb_3 rdb_32, rrcy_3[] rrcy_3Array) {
        rrcy_3[] rrcy_3Array2;
        this.id_byte();
        rdb_3 rdb_33 = rdb_32;
        this.id_class[rrcH_2.id_protected[5]] = rdb_33;
        this.id_class[rrcH_2.id_protected[6]] = rrcy_3Array2 = rrcy_3Array;
    }

    static {
        rrcH_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_break[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_break[1];
        }
        rrcH_2 rrcH_22 = (rrcH_2)object;
        return Objects.equals((rdb_3)this.id_class[id_protected[0]], (rdb_3)rrcH_22.id_class[id_protected[1]]);
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_break[2]];
        objectArray[rrcH_2.id_break[3]] = (rdb_3)this.id_class[id_protected[2]];
        return Objects.hash(objectArray);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF11B51D9;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-71, 46, 15, -55, -42, 50, -64, -108}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA14F5DE194119A49L;
    }

    public rdb_3 id_class() {
        return (rdb_3)this.id_class[id_protected[3]];
    }

    public rrcy_3[] id_break() {
        return (rrcy_3[])this.id_class[id_protected[4]];
    }

    private static void id_throws() {
        id_byte = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrcH_2.id_protected();
        rrcH_2.id_case();
        rrcH_2.id_throws();
    }

    private static void id_case() {
        short[] sArray = new short[7];
        sArray[4] = 1;
        sArray[6] = 1;
        id_protected = sArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        id_break = blArray;
    }
}

