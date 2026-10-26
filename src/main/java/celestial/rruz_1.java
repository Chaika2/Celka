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

public class rruz_1 {
    private static boolean[] id_break;
    public Object[] id_class;
    private static short[] id_byte;
    private static byte[] id_protected;

    private static void id_byte() {
        id_protected = new byte[]{2, 2};
    }

    public rruz_1(String string, String string2) {
        this.id_protected();
        String string3 = string;
        this.id_class[rruz_1.id_byte[8]] = string3;
        String string4 = string2;
        this.id_class[rruz_1.id_byte[9]] = string4;
    }

    static {
        rruz_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_break[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_break[1];
        }
        rruz_1 rruz_12 = (rruz_1)object;
        return Objects.equals((String)this.id_class[id_byte[0]], (String)rruz_12.id_class[id_byte[1]]) && Objects.equals((String)this.id_class[id_byte[2]], (String)rruz_12.id_class[id_byte[3]]) ? id_break[2] : id_break[3];
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_protected[0]];
        objectArray[rruz_1.id_break[4]] = (String)this.id_class[id_byte[4]];
        objectArray[rruz_1.id_break[5]] = (String)this.id_class[id_byte[5]];
        return Objects.hash(objectArray);
    }

    public String id_class() {
        return (String)this.id_class[id_byte[6]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6E1AA37F;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-126, 44, -120, 85, -78, 56, -97, 113}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4C1D77923C2A88EDL;
    }

    public String id_break() {
        return (String)this.id_class[id_byte[7]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rruz_1.id_throws();
        rruz_1.id_case();
        rruz_1.id_byte();
    }

    private static void id_case() {
        short[] sArray = new short[10];
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        id_byte = sArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[1]];
        }
    }
}

