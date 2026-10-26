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

public class rrHc_1 {
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;

    public String id_byte() {
        return (String)this.id_class[id_byte[12]];
    }

    public rrHc_1(String string, String string2, String string3) {
        this.id_protected();
        String string4 = string;
        this.id_class[rrHc_1.id_byte[9]] = string4;
        String string5 = string2;
        this.id_class[rrHc_1.id_byte[10]] = string5;
        String string6 = string3;
        this.id_class[rrHc_1.id_byte[11]] = string6;
    }

    static {
        rrHc_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_protected[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_protected[1];
        }
        rrHc_1 rrHc_12 = (rrHc_1)object;
        return Objects.equals((String)this.id_class[id_byte[0]], (String)rrHc_12.id_class[id_byte[1]]) && Objects.equals((String)this.id_class[id_byte[2]], (String)rrHc_12.id_class[id_byte[3]]) && Objects.equals((String)this.id_class[id_byte[4]], (String)rrHc_12.id_class[id_byte[5]]) ? id_protected[2] : id_protected[3];
    }

    public String toString() {
        return "AutoAuthModule.AccountData(login=" + this.id_byte() + ", server=" + this.id_break() + ", password=" + this.id_class() + ")";
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_break[0]];
        objectArray[rrHc_1.id_protected[4]] = (String)this.id_class[id_byte[6]];
        objectArray[rrHc_1.id_protected[5]] = (String)this.id_class[id_byte[7]];
        objectArray[rrHc_1.id_break[1]] = (String)this.id_class[id_byte[8]];
        return Objects.hash(objectArray);
    }

    public String id_class() {
        return (String)this.id_class[id_byte[14]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEBBEC170;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x923FCB1FF86C554EL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-13, -22, -62, 22, -88, -12, -2, 11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_break() {
        return (String)this.id_class[id_byte[13]];
    }

    private static void id_throws() {
        id_break = new byte[]{3, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrHc_1.id_case();
        rrHc_1.id_catch();
        rrHc_1.id_throws();
    }

    private static void id_catch() {
        short[] sArray = new short[15];
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[13] = 1;
        sArray[14] = 2;
        id_byte = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        blArray[5] = true;
        id_protected = blArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
        }
    }
}

