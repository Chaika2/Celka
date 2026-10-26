/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZk_1 {
    private static short[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[4]];
        }
    }

    public rrZk_1(String string) {
        this.id_byte();
        String string2 = string;
        this.id_class[rrZk_1.id_break[4]] = string2;
    }

    static {
        rrZk_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[1];
        }
        rrZk_1 rrZk_12 = (rrZk_1)object;
        return Objects.equals(((String)this.id_class[id_break[0]]).toLowerCase(), ((String)rrZk_12.id_class[id_break[1]]).toLowerCase());
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_byte[2]];
        objectArray[rrZk_1.id_byte[3]] = ((String)this.id_class[id_break[2]]).toLowerCase();
        return Objects.hash(objectArray);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{25, 38, -109, 56, 11, -20, 85, -29}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_class() {
        return (String)this.id_class[id_break[3]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9F8559F2D4B46D97L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x676B1603;
    }

    private static void id_break() {
        id_break = new short[5];
    }

    private static /* synthetic */ void ntfClinit() {
        rrZk_1.id_protected();
        rrZk_1.id_break();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_byte = blArray;
    }
}

