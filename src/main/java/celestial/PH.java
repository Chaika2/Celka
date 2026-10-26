/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PH {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;
    private static byte[] id_protected;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD3C60DE8;
    }

    public int id_byte() {
        return this.id_protected() - this.id_class();
    }

    public PH(String string, int n) {
        this.id_implements();
        String string2 = string;
        this.id_class[PH.id_byte[3]] = string2;
        Integer n2 = n;
        this.id_class[PH.id_byte[4]] = n2;
    }

    static {
        PH.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-124, -10, -44, -24, 30, 87, -85, 54}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(int n) {
        this.id_break(this.id_class() + n);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x337F861DC20A136FL;
    }

    public int id_class() {
        return (Integer)this.id_class[id_byte[2]];
    }

    public String id_break() {
        return (String)this.id_class[id_byte[0]];
    }

    public void id_break(int n) {
        Integer n2 = n;
        this.id_class[PH.id_byte[5]] = n2;
    }

    public boolean id_throws() {
        return this.id_class() >= this.id_protected() ? id_break[0] : id_break[1];
    }

    private static /* synthetic */ void ntfClinit() {
        PH.id_private();
        PH.id_catch();
        PH.id_case();
    }

    private static void id_catch() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        id_byte = sArray;
    }

    private static void id_case() {
        id_protected = new byte[]{3, 2};
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[PH.id_break[2]] = id_break[3];
            objectArray[PH.id_protected[1]] = id_break[4];
        }
    }

    public int id_protected() {
        return (Integer)this.id_class[id_byte[1]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        id_break = blArray;
    }
}

