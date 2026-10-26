/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongSupplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pr_1 {
    private static double[] id_byte;
    public static Object[] id_class;
    private static long[] id_protected;
    private static byte[] id_throws;
    private static boolean[] id_case;
    private static short[] id_catch;
    public Object[] id_break;

    public double id_byte() {
        return (double)(this.id_break() >>> id_throws[3]) * id_byte[0];
    }

    public Pr_1() {
        this(System.nanoTime() ^ System.currentTimeMillis());
    }

    private Pr_1(long[] lArray) {
        this.id_throws();
        long[] lArray2 = lArray;
        this.id_break[Pr_1.id_catch[1]] = lArray2;
    }

    public Pr_1(long l) {
        this.id_throws();
        AtomicLong atomicLong = new AtomicLong(l);
        LongSupplier longSupplier = () -> {
            long l = atomicLong.addAndGet(id_protected[0]);
            l = (l ^ l >>> id_throws[17]) * id_protected[1];
            l = (l ^ l >>> id_throws[18]) * id_protected[2];
            return l ^ l >>> id_throws[19];
        };
        long[] lArray = new long[id_throws[0]];
        lArray[Pr_1.id_case[0]] = longSupplier.getAsLong();
        lArray[Pr_1.id_case[1]] = longSupplier.getAsLong();
        lArray[Pr_1.id_throws[1]] = longSupplier.getAsLong();
        lArray[Pr_1.id_throws[2]] = longSupplier.getAsLong();
        long[] lArray2 = lArray;
        this.id_break[Pr_1.id_catch[0]] = lArray2;
    }

    static {
        Pr_1.ntfClinit();
    }

    private static long id_class(long l, int n) {
        return l << n | l >>> id_throws[16] - n;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5543BBE2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6ACAC0CE7F859C90L;
    }

    public Pr_1 id_class() {
        return new Pr_1(Arrays.copyOf((long[])this.id_break[id_catch[17]], (int)id_throws[15]));
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-33, -47, -49, -44, 126, 83, -10, -29}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public long id_break() {
        long l = Pr_1.id_class(((long[])this.id_break[id_catch[2]])[id_case[2]] + ((long[])this.id_break[id_catch[3]])[id_throws[4]], id_throws[5]) + ((long[])this.id_break[id_catch[4]])[id_case[3]];
        long l2 = ((long[])this.id_break[id_catch[5]])[id_case[4]] << id_throws[6];
        long[] lArray = (long[])this.id_break[id_catch[6]];
        byte by = id_throws[7];
        lArray[by] = lArray[by] ^ ((long[])this.id_break[id_catch[7]])[id_case[5]];
        long[] lArray2 = (long[])this.id_break[id_catch[8]];
        byte by2 = id_throws[8];
        lArray2[by2] = lArray2[by2] ^ ((long[])this.id_break[id_catch[9]])[id_case[6]];
        long[] lArray3 = (long[])this.id_break[id_catch[10]];
        int n = id_case[7];
        lArray3[n] = lArray3[n] ^ ((long[])this.id_break[id_catch[11]])[id_throws[9]];
        long[] lArray4 = (long[])this.id_break[id_catch[12]];
        int n2 = id_case[8];
        lArray4[n2] = lArray4[n2] ^ ((long[])this.id_break[id_catch[13]])[id_throws[10]];
        long[] lArray5 = (long[])this.id_break[id_catch[14]];
        byte by3 = id_throws[11];
        lArray5[by3] = lArray5[by3] ^ l2;
        ((long[])this.id_break[Pr_1.id_catch[15]])[Pr_1.id_throws[12]] = Pr_1.id_class(((long[])this.id_break[id_catch[16]])[id_throws[13]], id_throws[14]);
        return l;
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[9]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Pr_1.id_case();
        Pr_1.id_catch();
        Pr_1.id_private();
        Pr_1.id_implements();
        Pr_1.id_protected();
        Pr_1.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{(double)1.110223E-16f};
        id_class = objectArray;
    }

    private static void id_catch() {
        id_protected = new long[]{-7046029254386353131L, -4658895280553007687L, -7723592293110705685L};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[12];
        blArray[1] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        id_case = blArray;
    }

    private static void id_implements() {
        id_byte = new double[]{1.110223E-16f, 1.110223E-16f};
    }

    private static void id_protected() {
        id_throws = new byte[]{4, 2, 3, 11, 3, 23, 17, 2, 3, 2, 3, 2, 3, 3, 45, 4, 64, 30, 27, 31};
    }

    private static void id_private() {
        id_catch = new short[18];
    }
}

