/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.iB_2;
import celestial.rLY;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLC {
    public Object[] id_class;
    private static boolean[] id_byte;
    private static short[] id_protected;
    public static Object[] id_break;
    private static byte[] id_throws;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new rrLC()};
        id_break = objectArray;
    }

    public rrLC() {
        this.id_throws();
    }

    static {
        rrLC.ntfClinit();
    }

    public iB_2 id_class() {
        return (iB_2)this.id_class[id_protected[7]];
    }

    public static rrLC id_class(iB_2 iB_22, rLY rLY2) {
        iB_2 iB_23 = iB_22;
        ((rrLC)rrLC.id_break[rrLC.id_protected[0]]).id_class[rrLC.id_protected[1]] = iB_23;
        rLY rLY3 = rLY2;
        ((rrLC)rrLC.id_break[rrLC.id_protected[2]]).id_class[rrLC.id_protected[3]] = rLY3;
        return (rrLC)id_break[id_protected[4]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD6BDB68B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-69, 46, 106, 35, 0, -98, 93, 13}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD7498DC3005074CCL;
    }

    public static void id_break(iB_2 iB_22, rLY rLY2) {
        rrLC rrLC2 = rrLC.id_class(iB_22, rLY2);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[5]]).id_finally().id_class(rrLC2);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[6]]).id_class(rrLC2);
    }

    public rLY id_break() {
        return (rLY)this.id_class[id_protected[8]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrLC.id_catch();
        rrLC.id_protected();
        rrLC.id_case();
        rrLC.id_byte();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static void id_case() {
        id_throws = new byte[]{2};
    }

    private static void id_protected() {
        short[] sArray = new short[9];
        sArray[3] = 1;
        sArray[8] = 1;
        id_protected = sArray;
    }
}

