/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Pv_1;
import celestial.j_1;
import celestial.rqR_2;
import celestial.rrAM;
import celestial.rrFa_1;
import celestial.rrFe_1;
import celestial.rrLU;
import celestial.rrfw_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pq_1
extends Pv_1 {
    private static long[] id_protected;
    public Object[] id_break;
    private static boolean[] id_throws;
    private static short[] id_case;
    private static double[] id_catch;
    private static byte[] id_private;
    public static Object[] id_byte;

    private static void id_byte() {
        Object[] objectArray = new Object[]{20};
        id_byte = objectArray;
    }

    public Pq_1(C_class c_class) {
        super(c_class);
        ArrayDeque arrayDeque;
        this.id_private();
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_break[Pq_1.id_case[0]] = rrfw_32;
        Long l = TimeUnit.MINUTES.toMillis(id_protected[0]);
        this.id_break[Pq_1.id_case[1]] = l;
        this.id_break[Pq_1.id_case[2]] = arrayDeque = new ArrayDeque();
        Long l2 = id_protected[1];
        this.id_break[Pq_1.id_case[3]] = l2;
    }

    static {
        Pq_1.ntfClinit();
    }

    @Override
    public void id_class(rrLU rrLU2) {
        this.id_private();
        super.id_class(rrLU2);
        if ((Long)this.id_break[id_case[15]] != id_protected[3]) {
            ((Queue)this.id_break[id_case[16]]).add(rqR_2.id_break() - (Long)this.id_break[id_case[17]]);
            Long l = id_protected[4];
            this.id_break[Pq_1.id_case[18]] = l;
        }
    }

    @Override
    public void id_class(rrAM rrAM2) {
        this.id_private();
        super.id_class(rrAM2);
        ((rrfw_3)this.id_break[id_case[19]]).id_class();
        ((Queue)this.id_break[id_case[20]]).clear();
        Long l = id_protected[5];
        this.id_break[Pq_1.id_case[21]] = l;
    }

    @Override
    public void id_class(j_1 j_12) {
        this.id_private();
        super.id_class(j_12);
        if (!((Queue)this.id_break[id_case[4]]).isEmpty()) {
            if (((rrfw_3)this.id_break[id_case[5]]).id_class(((Long)this.id_break[id_case[6]]).longValue())) {
                ((Queue)this.id_break[id_case[7]]).clear();
                ((rrfw_3)this.id_break[id_case[8]]).id_class();
            }
            if (((Queue)this.id_break[id_case[9]]).size() > id_private[0]) {
                ((Queue)this.id_break[id_case[10]]).poll();
            }
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9509F3B111CC8B13L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5E711D13;
    }

    public long id_class() {
        this.id_private();
        if (((Queue)this.id_break[id_case[22]]).size() < id_private[1]) {
            return id_protected[6];
        }
        return (long)((Queue)this.id_break[id_case[23]]).stream().mapToLong(Long::longValue).average().orElse(id_catch[0]);
    }

    @Override
    public void id_class(rrFe_1 rrFe_12) {
        this.id_private();
        super.id_class(rrFe_12);
        rrFa_1 rrFa_12 = rrFe_12.id_break();
        if (rrFa_12 == (rrFa_1)((Object)rrFa_1.staticFieldsc276c0e8494830db9e45df4464b752ad[id_case[11]]) && (Long)this.id_break[id_case[12]] == id_protected[2]) {
            Long l = rqR_2.id_break();
            this.id_break[Pq_1.id_case[13]] = l;
            ((rrfw_3)this.id_break[id_case[14]]).id_class();
        }
    }

    private static void id_break() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[1] = true;
        id_throws = blArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{80, -112, -50, 110, -28, -66, -97, 57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_private = new byte[]{20, 20, 4, 3, 20};
    }

    private static /* synthetic */ void ntfClinit() {
        Pq_1.id_break();
        Pq_1.id_case();
        Pq_1.id_catch();
        Pq_1.id_protected();
        Pq_1.id_throws();
        Pq_1.id_byte();
    }

    private static void id_catch() {
        short[] sArray = new short[24];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 2;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[12] = 3;
        sArray[13] = 3;
        sArray[15] = 3;
        sArray[16] = 2;
        sArray[17] = 3;
        sArray[18] = 3;
        sArray[20] = 2;
        sArray[21] = 3;
        sArray[22] = 2;
        sArray[23] = 2;
        id_case = sArray;
    }

    private static void id_case() {
        long[] lArray = new long[9];
        lArray[0] = 2L;
        lArray[1] = -1L;
        lArray[2] = -1L;
        lArray[3] = -1L;
        lArray[4] = -1L;
        lArray[5] = -1L;
        id_protected = lArray;
    }

    private static void id_protected() {
        id_catch = new double[1];
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_private[2]];
            objectArray[Pq_1.id_throws[0]] = id_protected[7];
            objectArray[Pq_1.id_private[3]] = id_protected[8];
        }
    }
}

