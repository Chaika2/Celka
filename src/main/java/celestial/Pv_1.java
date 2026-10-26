/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_native;
import celestial.Ps_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pv_1
implements C_native {
    private static byte[] id_break;
    public Object[] id_class;
    private static short[] id_byte;

    private static void id_byte() {
        short[] sArray = new short[2];
        sArray[1] = 1;
        id_byte = sArray;
    }

    public Pv_1(C_class c_class) {
        this.id_break();
        C_class c_class2 = c_class;
        this.id_class[Pv_1.id_byte[0]] = c_class2;
        Ps_1 ps_1 = c_class.id_throw();
        this.id_class[Pv_1.id_byte[1]] = ps_1;
        c_class.id_break(this);
    }

    static {
        Pv_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-92, 37, 1, 90, 103, 120, -122, 72}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE0446471507A0832L;
    }

    private static void id_class() {
        id_break = new byte[]{2};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8F21EBC2;
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Pv_1.id_byte();
        Pv_1.id_class();
    }
}

