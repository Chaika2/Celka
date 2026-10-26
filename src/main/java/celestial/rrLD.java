/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rLY;
import celestial.rdn_3;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLD {
    public static Object[] id_class;
    private static double[] id_byte;
    public Object[] id_break;
    private static short[] id_protected;
    private static byte[] id_throws;
    private static boolean[] id_case;

    public rdn_3 id_byte() {
        return (rdn_3)this.id_break[id_protected[11]];
    }

    public rrLD() {
        this.id_case();
    }

    static {
        rrLD.ntfClinit();
    }

    public static void id_class(iB_2 iB_22, rdn_3 rdn_32, List<rLY> list, double d) {
        rrLD rrLD2 = rrLD.id_break(iB_22, rdn_32, list, d);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[9]]).id_finally().id_class(rrLD2);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-76, 69, -103, 0, -48, 60, 85, 31}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD68F6223;
    }

    public double id_class() {
        return (Double)this.id_break[id_protected[13]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBE59C626F29FAEB7L;
    }

    public iB_2 id_break() {
        return (iB_2)this.id_break[id_protected[10]];
    }

    public static rrLD id_break(iB_2 iB_22, rdn_3 rdn_32, List<rLY> list, double d) {
        List<rLY> list2;
        iB_2 iB_23 = iB_22;
        ((rrLD)rrLD.id_class[rrLD.id_protected[0]]).id_break[rrLD.id_protected[1]] = iB_23;
        rdn_3 rdn_33 = rdn_32;
        ((rrLD)rrLD.id_class[rrLD.id_protected[2]]).id_break[rrLD.id_protected[3]] = rdn_33;
        ((rrLD)rrLD.id_class[rrLD.id_protected[4]]).id_break[rrLD.id_protected[5]] = list2 = list;
        Double d2 = d;
        ((rrLD)rrLD.id_class[rrLD.id_protected[6]]).id_break[rrLD.id_protected[7]] = d2;
        return (rrLD)id_class[id_protected[8]];
    }

    private static void id_throws() {
        id_byte = new double[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrLD.id_finally();
        rrLD.id_catch();
        rrLD.id_throws();
        rrLD.id_implements();
        rrLD.id_private();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_case = blArray;
    }

    private static void id_catch() {
        short[] sArray = new short[14];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[7] = 3;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 3;
        id_protected = sArray;
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
            objectArray[rrLD.id_throws[1]] = id_byte[0];
        }
    }

    private static void id_implements() {
        id_throws = new byte[]{4, 3};
    }

    public List<rLY> id_protected() {
        return (List)this.id_break[id_protected[12]];
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new rrLD()};
        id_class = objectArray;
    }
}

