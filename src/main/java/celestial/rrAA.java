/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rpm_3;
import celestial.rym_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAA
extends Om_1 {
    private static short[] id_byte;
    private static byte[] id_protected;
    public static Object[] id_class;
    public Object[] id_break;
    private static boolean[] id_throws;

    public rrAA() {
        this.id_private();
    }

    static {
        rrAA.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA7889E4F72689DA8L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{106, 44, -120, 24, 38, -11, -122, 110}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrAA id_class(rym_3<rdn_3> rym_32, rpm_3 rpm_32) {
        rym_3<rdn_3> rym_33;
        ((rrAA)rrAA.id_class[rrAA.id_byte[0]]).id_break[rrAA.id_byte[1]] = rym_33 = rym_32;
        rdb_3 rdb_32 = rym_32.id_break().id_break();
        ((rrAA)rrAA.id_class[rrAA.id_byte[2]]).id_break[rrAA.id_byte[3]] = rdb_32;
        rpm_3 rpm_33 = rpm_32;
        ((rrAA)rrAA.id_class[rrAA.id_byte[4]]).id_break[rrAA.id_byte[5]] = rpm_33;
        ((rrAA)id_class[id_byte[6]]).id_class(id_throws[0]);
        return (rrAA)id_class[id_byte[7]];
    }

    public rym_3<rdn_3> id_class() {
        this.id_private();
        return (rym_3)this.id_break[id_byte[8]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC681E6E1;
    }

    public rdb_3 id_break() {
        this.id_private();
        return (rdb_3)this.id_break[id_byte[9]];
    }

    private static void id_throws() {
        id_protected = new byte[]{3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrAA.id_implements();
        rrAA.id_catch();
        rrAA.id_throws();
        rrAA.id_case();
    }

    private static void id_catch() {
        short[] sArray = new short[11];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[9] = 1;
        sArray[10] = 2;
        id_byte = sArray;
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrAA()};
        id_class = objectArray;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_throws = blArray;
    }

    public rpm_3 id_protected() {
        this.id_private();
        return (rpm_3)((Object)this.id_break[id_byte[10]]);
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
        }
    }
}

