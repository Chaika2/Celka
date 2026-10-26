/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFT {
    private static short[] id_byte;
    public Object[] id_class;
    private static byte[] id_protected;
    public static Object[] id_break;
    private static boolean[] id_throws;

    private static void id_byte() {
        short[] sArray = new short[7];
        sArray[3] = 1;
        sArray[6] = 1;
        id_byte = sArray;
    }

    public rrFT() {
        this.id_case();
    }

    static {
        rrFT.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA6006E07;
    }

    public static rrFT id_class(Aw_1 aw_1, String string) {
        Aw_1 aw_12 = aw_1;
        ((rrFT)rrFT.id_break[rrFT.id_byte[0]]).id_class[rrFT.id_byte[1]] = aw_12;
        String string2 = string;
        ((rrFT)rrFT.id_break[rrFT.id_byte[2]]).id_class[rrFT.id_byte[3]] = string2;
        return (rrFT)id_break[id_byte[4]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x71C30E5707EDA24FL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-51, 100, -4, 6, -49, -123, -18, 30}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Aw_1 id_class() {
        return (Aw_1)this.id_class[id_byte[5]];
    }

    public String id_break() {
        return (String)this.id_class[id_byte[6]];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFT.id_throws();
        rrFT.id_byte();
        rrFT.id_protected();
        rrFT.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrFT()};
        id_break = objectArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    private static void id_protected() {
        id_protected = new byte[]{2};
    }
}

