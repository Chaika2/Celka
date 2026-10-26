/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ri_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqU_2 {
    public Object[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;
    private static byte[] id_protected;

    public String id_byte() {
        return (String)this.id_class[id_break[7]];
    }

    public rrqU_2(xd_3 xd_32, int n) {
        this.id_throws();
        xd_3 xd_33 = xd_32;
        this.id_class[rrqU_2.id_break[0]] = xd_33;
        Integer n2 = n;
        this.id_class[rrqU_2.id_break[1]] = n2;
        String string = ri_3.id_class(xd_32);
        this.id_class[rrqU_2.id_break[2]] = string;
    }

    static {
        rrqU_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[1];
        }
        rrqU_2 rrqU_22 = (rrqU_2)object;
        return Objects.equals((String)this.id_class[id_break[3]], (String)rrqU_22.id_class[id_break[4]]);
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_byte[2]];
        objectArray[rrqU_2.id_byte[3]] = (String)this.id_class[id_break[5]];
        return Objects.hash(objectArray);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEBC2C26789C68179L;
    }

    public int id_class() {
        return (Integer)this.id_class[id_break[8]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA2B4D708;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-29, -43, 52, -83, 125, -36, 95, 126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public xd_3 id_break() {
        return (xd_3)this.id_class[id_break[6]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
            this.id_class[2] = 0;
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrqU_2.id_protected();
        rrqU_2.id_case();
        rrqU_2.id_catch();
    }

    private static void id_catch() {
        id_protected = new byte[]{3, 2};
    }

    private static void id_case() {
        short[] sArray = new short[9];
        sArray[1] = 2;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[8] = 2;
        id_break = sArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        id_byte = blArray;
    }
}

