/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import celestial.rvY_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLN {
    public Object[] id_class;
    private static boolean[] id_byte;
    public static Object[] id_break;
    private static byte[] id_protected;
    private static short[] id_throws;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }

    public rrLN() {
        this.id_byte();
    }

    static {
        rrLN.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{47, 110, 73, -48, -97, 49, -62, -79}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrLN id_class(Aw_1 aw_1, rvY_2 rvY_22) {
        Aw_1 aw_12 = aw_1;
        ((rrLN)rrLN.id_break[rrLN.id_throws[0]]).id_class[rrLN.id_throws[1]] = aw_12;
        rvY_2 rvY_23 = rvY_22;
        ((rrLN)rrLN.id_break[rrLN.id_throws[2]]).id_class[rrLN.id_throws[3]] = rvY_23;
        return (rrLN)id_break[id_throws[4]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x439AC4BBD50897B2L;
    }

    public Aw_1 id_class() {
        return (Aw_1)this.id_class[id_throws[6]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x596C4C72;
    }

    public rvY_2 id_break() {
        return (rvY_2)((Object)this.id_class[id_throws[5]]);
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLN.id_throws();
        rrLN.id_protected();
        rrLN.id_catch();
        rrLN.id_case();
    }

    private static void id_catch() {
        id_protected = new byte[]{2};
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrLN()};
        id_break = objectArray;
    }

    private static void id_protected() {
        short[] sArray = new short[7];
        sArray[1] = 1;
        sArray[6] = 1;
        id_throws = sArray;
    }
}

