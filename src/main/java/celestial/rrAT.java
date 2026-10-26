/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAT {
    private static boolean[] id_byte;
    public Object[] id_class;
    public static Object[] id_break;
    private static short[] id_protected;
    private static byte[] id_throws;

    public List<rJY> id_byte() {
        return (List)this.id_class[id_protected[10]];
    }

    public rrAT() {
        this.id_throws();
    }

    static {
        rrAT.ntfClinit();
    }

    public static void id_class(rJr_1 rJr_12, List<rJY> list, int n) {
        rrAT rrAT2 = rrAT.id_break(rJr_12, list, n);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[7]]).id_class(rrAT2);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[8]]).id_finally().id_class(rrAT2);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-71, 8, 39, 71, -95, -16, 0, -4}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x22D2CE17;
    }

    public rJr_1 id_class() {
        return (rJr_1)this.id_class[id_protected[9]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x789F5DCC7EC516D6L;
    }

    public static rrAT id_break(rJr_1 rJr_12, List<rJY> list, int n) {
        List<rJY> list2;
        rJr_1 rJr_13 = rJr_12;
        ((rrAT)rrAT.id_break[rrAT.id_protected[0]]).id_class[rrAT.id_protected[1]] = rJr_13;
        ((rrAT)rrAT.id_break[rrAT.id_protected[2]]).id_class[rrAT.id_protected[3]] = list2 = list;
        Integer n2 = n;
        ((rrAT)rrAT.id_break[rrAT.id_protected[4]]).id_class[rrAT.id_protected[5]] = n2;
        return (rrAT)id_break[id_protected[6]];
    }

    public int id_break() {
        return (Integer)this.id_class[id_protected[11]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrAT.id_throws[1]] = id_byte[1];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrAT.id_protected();
        rrAT.id_case();
        rrAT.id_catch();
        rrAT.id_private();
    }

    private static void id_catch() {
        id_throws = new byte[]{3, 2};
    }

    private static void id_case() {
        short[] sArray = new short[12];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[10] = 1;
        sArray[11] = 2;
        id_protected = sArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_byte = blArray;
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new rrAT()};
        id_break = objectArray;
    }
}

