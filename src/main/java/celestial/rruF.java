/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rruu_1;
import celestial.rruv_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruF {
    public Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;

    public void id_byte() {
        if ((Runnable)this.id_class[id_protected[18]] == null) {
            return;
        }
        ((Runnable)this.id_class[id_protected[19]]).run();
        ((rruu_1)this.id_class[id_protected[20]]).id_class(System.currentTimeMillis());
    }

    public rruF(rrtN_2 rrtN_22, rruu_1 rruu_12) {
        Supplier<Boolean> supplier;
        Supplier<Boolean> supplier2;
        this.id_native();
        this.id_class[rruF.id_protected[4]] = supplier2 = () -> id_break[10];
        this.id_class[rruF.id_protected[5]] = supplier = () -> id_break[9];
        Boolean bl = id_break[1];
        this.id_class[rruF.id_protected[6]] = bl;
        rruu_1 rruu_13 = rruu_12;
        this.id_class[rruF.id_protected[7]] = rruu_13;
        rrtN_2 rrtN_23 = rrtN_22;
        this.id_class[rruF.id_protected[8]] = rrtN_23;
    }

    public rruF(rruu_1 rruu_12) {
        Supplier<Boolean> supplier;
        Supplier<Boolean> supplier2;
        this.id_native();
        this.id_class[rruF.id_protected[0]] = supplier2 = () -> id_break[10];
        this.id_class[rruF.id_protected[1]] = supplier = () -> id_break[9];
        Boolean bl = id_break[0];
        this.id_class[rruF.id_protected[2]] = bl;
        rruu_1 rruu_13 = rruu_12;
        this.id_class[rruF.id_protected[3]] = rruu_13;
    }

    static {
        rruF.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x48FC9593;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9BAD3AE3821FD721L;
    }

    public rruF id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rruF.id_protected[29]] = bl2;
        return this;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-32, -123, -121, -98, 124, 25, -33, 8}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        if (!((Boolean)((Supplier)this.id_class[id_protected[9]]).get()).booleanValue()) {
            return;
        }
        boolean bl2 = this.id_class().id_break(n, n2);
        if (bl && rrtu_3.id_class(rrtu_32, n, n2)) {
            bl2 = id_break[2];
        }
        if ((rrtN_2)this.id_class[id_protected[10]] != null && rrtu_32.id_class((rrtN_2)this.id_class[id_protected[11]], n, n2)) {
            bl2 = id_break[3];
        }
        ((rruu_1)this.id_class[id_protected[12]]).id_break((Boolean)((Supplier)this.id_class[id_protected[13]]).get());
        ((rruu_1)this.id_class[id_protected[14]]).id_class(bl2);
        ((rruu_1)this.id_class[id_protected[15]]).id_class(ml_1, rrtu_32, n, n2, bl);
    }

    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = n3 == 0 && (Boolean)((Supplier)this.id_class[id_protected[16]]).get() != false && (Boolean)((Supplier)this.id_class[id_protected[17]]).get() != false ? id_break[4] : id_break[5];
        if (bl && rrtu_3.id_class(rrtu_32, n, n2)) {
            bl2 = id_break[6];
        }
        if (bl2) {
            this.id_byte();
            return id_break[7];
        }
        return id_break[8];
    }

    public rruF id_class(Supplier<Boolean> supplier) {
        Supplier<Boolean> supplier2;
        this.id_class[rruF.id_protected[25]] = supplier2 = supplier;
        return this;
    }

    public rruF id_class(Runnable runnable) {
        Runnable runnable2 = runnable;
        this.id_class[rruF.id_protected[28]] = runnable2;
        return this;
    }

    public rruv_1 id_class() {
        return ((rruu_1)this.id_class[id_protected[21]]).id_catch();
    }

    public boolean id_break() {
        return (Boolean)this.id_class[id_protected[24]];
    }

    public rruF id_break(Supplier<Boolean> supplier) {
        Supplier<Boolean> supplier2;
        this.id_class[rruF.id_protected[26]] = supplier2 = supplier;
        return this;
    }

    public boolean id_throws() {
        return (Boolean)((Supplier)this.id_class[id_protected[27]]).get();
    }

    private static /* synthetic */ void ntfClinit() {
        rruF.id_catch();
        rruF.id_finally();
        rruF.id_implements();
    }

    private static void id_finally() {
        short[] sArray = new short[30];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[2] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 5;
        sArray[8] = 4;
        sArray[9] = 2;
        sArray[10] = 4;
        sArray[11] = 4;
        sArray[13] = 1;
        sArray[16] = 2;
        sArray[17] = 1;
        sArray[18] = 3;
        sArray[19] = 3;
        sArray[24] = 5;
        sArray[25] = 1;
        sArray[26] = 2;
        sArray[27] = 2;
        sArray[28] = 3;
        sArray[29] = 5;
        id_protected = sArray;
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[12];
        blArray[0] = true;
        blArray[1] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        id_break = blArray;
    }

    public rruu_1 id_case() {
        return (rruu_1)this.id_class[id_protected[23]];
    }

    private static void id_implements() {
        id_byte = new byte[]{6, 5};
    }

    public rruv_1 id_protected() {
        return ((rruu_1)this.id_class[id_protected[22]]).id_break();
    }

    private void id_native() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rruF.id_byte[1]] = id_break[11];
        }
    }
}

