/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rryT;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryt_1 {
    public Object[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        id_byte = new byte[]{2};
    }

    public rryt_1(String string, rryT rryT2) {
        this.id_throws();
        String string2 = string;
        this.id_class[rryt_1.id_break[2]] = string2;
        rryT rryT3 = rryT2;
        this.id_class[rryt_1.id_break[3]] = rryT3;
    }

    static {
        rryt_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-108, -34, -80, -124, 17, -95, 33, -70}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public String id_class() {
        return (String)this.id_class[id_break[0]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCFD81846;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBA64F9D9261EE735L;
    }

    public rryT id_break() {
        return (rryT)((Object)this.id_class[id_break[1]]);
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rryt_1.id_protected();
        rryt_1.id_byte();
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_break = sArray;
    }
}

