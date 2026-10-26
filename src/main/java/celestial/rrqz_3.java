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

public class rrqz_3 {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    public Object[] id_class;

    public xd_3 id_byte() {
        return (xd_3)this.id_class[id_break[6]];
    }

    public rrqz_3(xd_3 xd_32, int n) {
        this.id_throws();
        xd_3 xd_33 = xd_32;
        this.id_class[rrqz_3.id_break[0]] = xd_33;
        Integer n2 = n;
        this.id_class[rrqz_3.id_break[1]] = n2;
        String string = ri_3.id_class(xd_32);
        this.id_class[rrqz_3.id_break[2]] = string;
    }

    static {
        rrqz_3.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[1];
        }
        rrqz_3 rrqz_32 = (rrqz_3)object;
        return Objects.equals((String)this.id_class[id_break[3]], (String)rrqz_32.id_class[id_break[4]]);
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_byte[2]];
        objectArray[rrqz_3.id_byte[3]] = (String)this.id_class[id_break[5]];
        return Objects.hash(objectArray);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5669774967D930EL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x292615B0;
    }

    public int id_class() {
        return (Integer)this.id_class[id_break[8]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-35, 124, -22, 2, 50, 11, -102, 100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_break() {
        return (String)this.id_class[id_break[7]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
            this.id_class[2] = 0;
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrqz_3.id_protected();
        rrqz_3.id_catch();
        rrqz_3.id_case();
    }

    private static void id_catch() {
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

    private static void id_case() {
        id_protected = new byte[]{3, 2};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        id_byte = blArray;
    }
}

