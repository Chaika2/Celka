/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rryv_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryu_1 {
    private static short[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;

    private static void id_byte() {
        short[] sArray = new short[7];
        sArray[4] = 1;
        sArray[6] = 1;
        id_break = sArray;
    }

    public rryu_1(String string, rryv_1 rryv_12) {
        this.id_protected();
        String string2 = string;
        this.id_class[rryu_1.id_break[5]] = string2;
        rryv_1 rryv_13 = rryv_12;
        this.id_class[rryu_1.id_break[6]] = rryv_13;
    }

    static {
        rryu_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_protected[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_protected[1];
        }
        rryu_1 rryu_12 = (rryu_1)object;
        return Objects.equals((String)this.id_class[id_break[0]], (String)rryu_12.id_class[id_break[1]]);
    }

    public int hashCode() {
        return Objects.hashCode((String)this.id_class[id_break[2]]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-59, -24, -17, -46, -56, 96, -87, 95}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6F95267;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7FF2110A53CCD5EAL;
    }

    public String id_class() {
        return (String)this.id_class[id_break[3]];
    }

    public rryv_1 id_break() {
        return (rryv_1)this.id_class[id_break[4]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rryu_1.id_throws();
        rryu_1.id_byte();
        rryu_1.id_case();
    }

    private static void id_case() {
        id_byte = new byte[]{2};
    }

    private void id_protected() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
        }
    }
}

