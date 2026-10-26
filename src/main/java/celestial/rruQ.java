/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rruN;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruQ {
    private static byte[] id_break;
    public Object[] id_class;
    private static short[] id_byte;

    public rruN id_byte() {
        return (rruN)((Object)this.id_class[id_byte[5]]);
    }

    public rruQ(rVi_1 rVi_12, rruN rruN2) {
        this(rVi_12, null, rruN2);
    }

    public rruQ(rVi_1 rVi_12, rVi_1 rVi_13, rruN rruN2) {
        this.id_throws();
        rVi_1 rVi_14 = rVi_12;
        this.id_class[rruQ.id_byte[0]] = rVi_14;
        rVi_1 rVi_15 = rVi_13;
        this.id_class[rruQ.id_byte[1]] = rVi_15;
        rruN rruN3 = rruN2;
        this.id_class[rruQ.id_byte[2]] = rruN3;
    }

    static {
        rruQ.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{123, -3, -2, 81, -103, 34, 86, 0}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBC2CF697;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8402865F178D1037L;
    }

    public rVi_1 id_class() {
        return (rVi_1)this.id_class[id_byte[3]];
    }

    public rVi_1 id_break() {
        return (rVi_1)this.id_class[id_byte[4]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rruQ.id_protected();
        rruQ.id_case();
    }

    private static void id_case() {
        id_break = new byte[]{3};
    }

    private static void id_protected() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        id_byte = sArray;
    }
}

