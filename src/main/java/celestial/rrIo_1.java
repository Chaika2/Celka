/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrfw_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIo_1 {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static long[] id_protected;
    private static short[] id_throws;

    public rrfw_3 id_byte() {
        return (rrfw_3)this.id_class[id_throws[13]];
    }

    public rrIo_1(Runnable runnable, long l, int n) {
        this.id_finally();
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_class[rrIo_1.id_throws[0]] = rrfw_32;
        Runnable runnable2 = runnable;
        this.id_class[rrIo_1.id_throws[1]] = runnable2;
        Long l2 = l;
        this.id_class[rrIo_1.id_throws[2]] = l2;
        Integer n2 = n;
        this.id_class[rrIo_1.id_throws[3]] = n2;
    }

    public rrIo_1(Runnable runnable, long l) {
        this(runnable, l, id_break[0]);
    }

    static {
        rrIo_1.ntfClinit();
    }

    public int id_class() {
        return (Integer)this.id_class[id_throws[15]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{16, 95, 81, 95, 14, -38, 49, 59}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9AC9DFB6;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2860EFE6B70FC44BL;
    }

    public long id_break() {
        return (Long)this.id_class[id_throws[14]];
    }

    public boolean id_throws() {
        return (Boolean)this.id_class[id_throws[17]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIo_1.id_implements();
        rrIo_1.id_extends();
        rrIo_1.id_volatile();
        rrIo_1.id_native();
    }

    private void id_finally() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrIo_1.id_byte[1]] = id_protected[0];
            objectArray[rrIo_1.id_byte[2]] = id_break[3];
            objectArray[rrIo_1.id_byte[3]] = id_break[4];
            objectArray[rrIo_1.id_byte[4]] = id_break[5];
        }
    }

    public Runnable id_catch() {
        return (Runnable)this.id_class[id_throws[12]];
    }

    private static void id_extends() {
        id_protected = new long[1];
    }

    public void id_case() {
        Boolean bl = id_break[2];
        this.id_class[rrIo_1.id_throws[11]] = bl;
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        id_break = blArray;
    }

    public int id_protected() {
        return (Integer)this.id_class[id_throws[16]];
    }

    public void id_private() {
        if (((rrfw_3)this.id_class[id_throws[4]]).id_class(((Long)this.id_class[id_throws[5]]).longValue())) {
            ((Runnable)this.id_class[id_throws[6]]).run();
            ((rrfw_3)this.id_class[id_throws[7]]).id_class();
            rrIo_1 rrIo_12 = this;
            int n = (Integer)rrIo_12.id_class[id_throws[8]] + id_break[1];
            Integer n2 = n;
            rrIo_12.id_class[rrIo_1.id_throws[9]] = n2;
            if (n >= (Integer)this.id_class[id_throws[10]]) {
                this.id_case();
            }
        }
    }

    private static void id_volatile() {
        short[] sArray = new short[18];
        sArray[0] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[7] = 1;
        sArray[8] = 4;
        sArray[9] = 4;
        sArray[10] = 3;
        sArray[11] = 5;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[15] = 3;
        sArray[16] = 4;
        sArray[17] = 5;
        id_throws = sArray;
    }

    private static void id_native() {
        id_byte = new byte[]{6, 2, 3, 4, 5};
    }
}

