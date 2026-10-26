/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.Y;
import celestial.rdn_3;
import celestial.rpm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAC
extends Om_1 {
    public Object[] id_class;
    public static Object[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;

    public rrAC() {
        this.id_implements();
    }

    static {
        rrAC.ntfClinit();
    }

    public rpm_3 id_class() {
        this.id_implements();
        return (rpm_3)((Object)this.id_class[id_byte[9]]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC253857D;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{12, 41, 84, 24, 18, -114, -115, -53}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrAC id_class(Y y, rdn_3 rdn_32, rpm_3 rpm_32) {
        Y y2 = y;
        ((rrAC)rrAC.id_break[rrAC.id_byte[0]]).id_class[rrAC.id_byte[1]] = y2;
        rdn_3 rdn_33 = rdn_32;
        ((rrAC)rrAC.id_break[rrAC.id_byte[2]]).id_class[rrAC.id_byte[3]] = rdn_33;
        rpm_3 rpm_33 = rpm_32;
        ((rrAC)rrAC.id_break[rrAC.id_byte[4]]).id_class[rrAC.id_byte[5]] = rpm_33;
        ((rrAC)id_break[id_byte[6]]).id_class(id_protected[0]);
        return (rrAC)id_break[id_byte[7]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2576FB4080AF11E7L;
    }

    public Y id_break() {
        this.id_implements();
        return (Y)((Object)this.id_class[id_byte[10]]);
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAC.id_throws();
        rrAC.id_catch();
        rrAC.id_case();
        rrAC.id_private();
    }

    private static void id_catch() {
        short[] sArray = new short[11];
        sArray[1] = 2;
        sArray[5] = 1;
        sArray[9] = 1;
        sArray[10] = 2;
        id_byte = sArray;
    }

    private static void id_case() {
        id_throws = new byte[]{3};
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
        }
    }

    public rdn_3 id_protected() {
        this.id_implements();
        return (rdn_3)this.id_class[id_byte[8]];
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new rrAC()};
        id_break = objectArray;
    }
}

