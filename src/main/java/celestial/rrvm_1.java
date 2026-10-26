/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.setting.KeyBind;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvm_1 {
    private static byte[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static short[] id_protected;

    public String id_byte() {
        return (String)this.id_class[id_protected[4]];
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-25, 126, 51, -98, -8, 77, 20, -104}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrvm_1(String string, String string2, KeyBind keyBind) {
        this.id_catch();
        String string3 = string;
        this.id_class[rrvm_1.id_protected[9]] = string3;
        String string4 = string2;
        this.id_class[rrvm_1.id_protected[10]] = string4;
        KeyBind keyBind2 = keyBind;
        this.id_class[rrvm_1.id_protected[11]] = keyBind2;
    }

    static {
        rrvm_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[0];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_byte[1];
        }
        rrvm_1 rrvm_12 = (rrvm_1)object;
        return (KeyBind)this.id_class[id_protected[1]] == (KeyBind)rrvm_12.id_class[id_protected[2]] ? id_byte[2] : id_byte[3];
    }

    public int hashCode() {
        Object[] objectArray = new Object[id_byte[4]];
        objectArray[rrvm_1.id_byte[5]] = (KeyBind)this.id_class[id_protected[3]];
        return Objects.hash(objectArray);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x45C491A66064D387L;
    }

    public KeyBind id_class() {
        return (KeyBind)this.id_class[id_protected[6]];
    }

    public rrvm_1 id_class(KeyBind keyBind) {
        KeyBind keyBind2 = keyBind;
        this.id_class[rrvm_1.id_protected[0]] = keyBind2;
        return this;
    }

    public void id_class(String string) {
        String string2 = string;
        this.id_class[rrvm_1.id_protected[7]] = string2;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA2808AD5;
    }

    public String id_break() {
        return (String)this.id_class[id_protected[5]];
    }

    public void id_break(String string) {
        String string2 = string;
        this.id_class[rrvm_1.id_protected[8]] = string2;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvm_1.id_throws();
        rrvm_1.id_case();
        rrvm_1.id_protected();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static void id_case() {
        short[] sArray = new short[12];
        sArray[0] = 2;
        sArray[1] = 2;
        sArray[2] = 2;
        sArray[3] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[8] = 1;
        sArray[10] = 1;
        sArray[11] = 2;
        id_protected = sArray;
    }

    private static void id_protected() {
        id_break = new byte[]{3};
    }
}

