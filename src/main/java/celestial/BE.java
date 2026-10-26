/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BG;
import celestial.C_class;
import celestial.Pv_1;
import celestial.rrFU;
import celestial.rrbb_3;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BE
extends Pv_1 {
    private static short[] id_break;
    private static boolean[] id_byte;

    public BE(C_class c_class) {
        super(c_class);
    }

    static {
        BE.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x37C4A1CA;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF1AA189013A66E9EL;
    }

    private static void id_class() {
        id_byte = new boolean[1];
    }

    @Override
    public void id_class(rrFU rrFU2) {
        try {
            BG[] bGArray = (BG[])BG.staticFieldsd25d445181413210921a2969c1bcd756[id_break[0]];
            int n = bGArray.length;
            for (int i = id_byte[0]; i < n; ++i) {
                BG bG = bGArray[i];
                URI uRI = URI.create(bG.id_class());
                rrbb_3.id_class(uRI);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void id_break() {
        id_break = new short[]{4};
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-72, -3, -80, 19, 120, 42, 57, -40}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        BE.id_class();
        BE.id_break();
    }
}

