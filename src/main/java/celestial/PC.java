/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PC {
    public Object[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    public String id_byte() {
        return (String)this.id_class[id_protected[2]];
    }

    public PC(rdn_3 rdn_32, String string, String string2, int n) {
        this.id_private();
        rdn_3 rdn_33 = rdn_32;
        this.id_class[PC.id_protected[4]] = rdn_33;
        String string3 = string;
        this.id_class[PC.id_protected[5]] = string3;
        String string4 = string2;
        this.id_class[PC.id_protected[6]] = string4;
        Integer n2 = n;
        this.id_class[PC.id_protected[7]] = n2;
    }

    static {
        PC.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x26AE3E69662C8D5BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE673D99F;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-30, 75, -35, 93, 10, 125, 123, 29}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_class() {
        return (String)this.id_class[id_protected[1]];
    }

    public rdn_3 id_break() {
        return (rdn_3)this.id_class[id_protected[0]];
    }

    private static void id_throws() {
        id_break = new byte[]{4, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        PC.id_catch();
        PC.id_case();
        PC.id_throws();
    }

    private static void id_catch() {
        id_byte = new boolean[1];
    }

    private static void id_case() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        id_protected = sArray;
    }

    public int id_protected() {
        return (Integer)this.id_class[id_protected[3]];
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[PC.id_break[1]] = id_byte[0];
        }
    }
}

