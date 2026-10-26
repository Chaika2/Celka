/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rpm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLK {
    private static short[] id_byte;
    public Object[] id_class;
    public static Object[] id_break;
    private static boolean[] id_protected;
    private static byte[] id_throws;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
        }
    }

    public rrLK() {
        this.id_byte();
    }

    static {
        rrLK.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEBF687CB839BD670L;
    }

    public static rrLK id_class(rdn_3 rdn_32, rpm_3 rpm_32) {
        rdn_3 rdn_33 = rdn_32;
        ((rrLK)rrLK.id_break[rrLK.id_byte[0]]).id_class[rrLK.id_byte[1]] = rdn_33;
        rpm_3 rpm_33 = rpm_32;
        ((rrLK)rrLK.id_break[rrLK.id_byte[2]]).id_class[rrLK.id_byte[3]] = rpm_33;
        return (rrLK)id_break[id_byte[4]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-64, -128, -36, -54, 9, 115, -76, 4}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7AF5B0F7;
    }

    public rdn_3 id_class() {
        return (rdn_3)this.id_class[id_byte[5]];
    }

    public rpm_3 id_break() {
        return (rpm_3)((Object)this.id_class[id_byte[6]]);
    }

    private static void id_throws() {
        id_throws = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrLK.id_catch();
        rrLK.id_case();
        rrLK.id_throws();
        rrLK.id_protected();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[7];
        sArray[3] = 1;
        sArray[6] = 1;
        id_byte = sArray;
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrLK()};
        id_break = objectArray;
    }
}

