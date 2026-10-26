/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLt_1 {
    public static Object[] id_class;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_break;
    private static short[] id_throws;

    public boolean id_byte() {
        return (Boolean)this.id_break[id_throws[9]];
    }

    public rrLt_1() {
        this.id_case();
    }

    static {
        rrLt_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-33, 74, -74, -12, -28, 108, -56, 108}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rjU_2 rjU_22) {
        rjU_2 rjU_23 = rjU_22;
        this.id_break[rrLt_1.id_throws[10]] = rjU_23;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCFBB598134AF97F4L;
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_break[rrLt_1.id_throws[12]] = bl2;
    }

    public static rrLt_1 id_class(rjU_2 rjU_22, rjU_2 rjU_23, boolean bl) {
        rjU_2 rjU_24 = rjU_22;
        ((rrLt_1)rrLt_1.id_class[rrLt_1.id_throws[0]]).id_break[rrLt_1.id_throws[1]] = rjU_24;
        rjU_2 rjU_25 = rjU_23;
        ((rrLt_1)rrLt_1.id_class[rrLt_1.id_throws[2]]).id_break[rrLt_1.id_throws[3]] = rjU_25;
        Boolean bl2 = bl;
        ((rrLt_1)rrLt_1.id_class[rrLt_1.id_throws[4]]).id_break[rrLt_1.id_throws[5]] = bl2;
        return (rrLt_1)id_class[id_throws[6]];
    }

    public rjU_2 id_class() {
        return (rjU_2)this.id_break[id_throws[8]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCD4D9042;
    }

    public void id_break(rjU_2 rjU_22) {
        rjU_2 rjU_23 = rjU_22;
        this.id_break[rrLt_1.id_throws[11]] = rjU_23;
    }

    public rjU_2 id_break() {
        return (rjU_2)this.id_break[id_throws[7]];
    }

    private static void id_throws() {
        short[] sArray = new short[13];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[11] = 1;
        sArray[12] = 2;
        id_throws = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLt_1.id_protected();
        rrLt_1.id_throws();
        rrLt_1.id_catch();
        rrLt_1.id_private();
    }

    private static void id_catch() {
        id_byte = new byte[]{3, 2};
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
            objectArray[rrLt_1.id_byte[1]] = id_protected[1];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_protected = blArray;
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new rrLt_1()};
        id_class = objectArray;
    }
}

