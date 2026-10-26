/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rdn_3;
import celestial.rpm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAY
extends Om_1 {
    private static boolean[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    private static byte[] id_throws;
    public static Object[] id_break;

    public rrAY() {
        this.id_throws();
    }

    static {
        rrAY.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-11, -114, -115, 60, 76, -58, 31, 117}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rpm_3 id_class() {
        this.id_throws();
        return (rpm_3)((Object)this.id_class[id_protected[7]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB2C8B5C297CA2206L;
    }

    public static rrAY id_class(rdn_3 rdn_32, rpm_3 rpm_32) {
        rdn_3 rdn_33 = rdn_32;
        ((rrAY)rrAY.id_break[rrAY.id_protected[0]]).id_class[rrAY.id_protected[1]] = rdn_33;
        rpm_3 rpm_33 = rpm_32;
        ((rrAY)rrAY.id_break[rrAY.id_protected[2]]).id_class[rrAY.id_protected[3]] = rpm_33;
        ((rrAY)id_break[id_protected[4]]).id_class(id_byte[0]);
        return (rrAY)id_break[id_protected[5]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6A19F437;
    }

    public rdn_3 id_break() {
        this.id_throws();
        return (rdn_3)this.id_class[id_protected[6]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrAY.id_case();
        rrAY.id_protected();
        rrAY.id_catch();
        rrAY.id_private();
    }

    private static void id_catch() {
        id_throws = new byte[]{2};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_byte = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[8];
        sArray[3] = 1;
        sArray[7] = 1;
        id_protected = sArray;
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new rrAY()};
        id_break = objectArray;
    }
}

