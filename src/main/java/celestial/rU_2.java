/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 */
package celestial;

import celestial.Pd_1;
import celestial.eX_2;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rpr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.annotation.Nonnull;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rU_2
extends rfH_2 {
    private static double[] id_catch;
    private static boolean[] id_private;
    public static Object[] id_class;
    private static short[] id_implements;
    public Object[] id_break;
    private static String[] id_finally;
    private static byte[] id_extends;
    private static long[] id_native;

    public rU_2 id_byte(rpr_3 rpr_32, int n) {
        this.id_public();
        if (n == 0) {
            return this;
        }
        rja_3 rja_32 = rpr_32.id_int();
        return new rU_2((Integer)this.id_break[id_implements[33]] + rja_32.b_() * n, (Integer)this.id_break[id_implements[34]] + rja_32.c_() * n, (Integer)this.id_break[id_implements[35]] + rja_32.d_() * n);
    }

    public static long id_byte(int n, int n2, int n3) {
        long l = id_native[0];
        l = id_native[1] * l + (long)n;
        l = id_native[2] * l + (long)n2;
        l = id_native[3] * l + (long)n3;
        return l;
    }

    @Override
    public /* synthetic */ rfH_2 id_byte() {
        return this.id_native();
    }

    public rU_2 id_byte(int n) {
        this.id_public();
        return n == 0 ? this : new rU_2((Integer)this.id_break[id_implements[45]], (Integer)this.id_break[id_implements[46]], (Integer)this.id_break[id_implements[47]] + n);
    }

    public rU_2(rjU_2 rjU_22) {
        this(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    public rU_2(eX_2 eX_22) {
        this(eX_22.id_class(), eX_22.id_break(), eX_22.id_byte());
    }

    public rU_2(rja_3 rja_32) {
        this(rja_32.b_(), rja_32.c_(), rja_32.d_());
    }

    public rU_2(double d, double d2, double d3) {
        this(rfU_2.id_byte(d), rfU_2.id_byte(d2), rfU_2.id_byte(d3));
    }

    public rU_2(int n, int n2, int n3) {
        super(n, n2, n3);
        this.id_public();
        Integer n4 = n;
        this.id_break[rU_2.id_implements[0]] = n4;
        Integer n5 = n2;
        this.id_break[rU_2.id_implements[1]] = n5;
        Integer n6 = n3;
        this.id_break[rU_2.id_implements[2]] = n6;
    }

    public rU_2(rfH_2 rfH_22) {
        this(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    static {
        rU_2.ntfClinit();
    }

    @Override
    public boolean equals(Object object) {
        this.id_public();
        if (object == null) {
            return id_private[0];
        }
        if (object instanceof rU_2) {
            rU_2 rU_22 = (rU_2)object;
            return ((Integer)rU_22.id_break[id_implements[9]]).intValue() == ((Integer)this.id_break[id_implements[10]]).intValue() && ((Integer)rU_22.id_break[id_implements[11]]).intValue() == ((Integer)this.id_break[id_implements[12]]).intValue() && ((Integer)rU_22.id_break[id_implements[13]]).intValue() == ((Integer)this.id_break[id_implements[14]]).intValue() ? id_private[1] : id_private[2];
        }
        rfH_2 rfH_22 = (rfH_2)object;
        return rfH_22.b_() == ((Integer)this.id_break[id_implements[15]]).intValue() && rfH_22.c_() == ((Integer)this.id_break[id_implements[16]]).intValue() && rfH_22.d_() == ((Integer)this.id_break[id_implements[17]]).intValue() ? id_private[3] : id_private[4];
    }

    @Override
    @Nonnull
    public String toString() {
        this.id_public();
        Object[] objectArray = new Object[id_extends[0]];
        objectArray[rU_2.id_private[11]] = Pd_1.id_class((Integer)this.id_break[id_implements[63]]);
        objectArray[rU_2.id_private[12]] = Pd_1.id_class((Integer)this.id_break[id_implements[64]]);
        objectArray[rU_2.id_extends[1]] = Pd_1.id_class((Integer)this.id_break[id_implements[65]]);
        return String.format(id_finally[0], objectArray);
    }

    @Override
    public int hashCode() {
        this.id_public();
        return (int)rU_2.id_byte((Integer)this.id_break[id_implements[3]], (Integer)this.id_break[id_implements[4]], (Integer)this.id_break[id_implements[5]]);
    }

    @Override
    public /* synthetic */ rfH_2 id_class(double d, double d2, double d3) {
        return this.id_break(d, d2, d3);
    }

    @Override
    public /* synthetic */ rfH_2 id_class(int n) {
        return this.id_throws(n);
    }

    public rU_2 id_class(rpr_3 rpr_32) {
        this.id_public();
        rja_3 rja_32 = rpr_32.id_int();
        return new rU_2((Integer)this.id_break[id_implements[30]] + rja_32.b_(), (Integer)this.id_break[id_implements[31]] + rja_32.c_(), (Integer)this.id_break[id_implements[32]] + rja_32.d_());
    }

    public rU_2 id_class(int n, int n2, int n3) {
        this.id_public();
        return new rU_2((Integer)this.id_break[id_implements[60]] + n, (Integer)this.id_break[id_implements[61]] + n2, (Integer)this.id_break[id_implements[62]] + n3);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{3, 44, -61, 54, -66, -13, 69, -97}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static long id_class(rU_2 rU_22) {
        return rU_2.id_byte((Integer)rU_22.id_break[id_implements[6]], (Integer)rU_22.id_break[id_implements[7]], (Integer)rU_22.id_break[id_implements[8]]);
    }

    public static rU_2 id_class(rfH_2 rfH_22) {
        if (rfH_22 == null) {
            return null;
        }
        return new rU_2(rfH_22);
    }

    public rU_2 id_class() {
        this.id_public();
        return new rU_2((Integer)this.id_break[id_implements[18]], (Integer)this.id_break[id_implements[19]] + id_private[5], (Integer)this.id_break[id_implements[20]]);
    }

    @Override
    public /* synthetic */ rfH_2 id_class(rpr_3 rpr_32, int n) {
        return this.id_byte(rpr_32, n);
    }

    @Override
    public /* synthetic */ rfH_2 id_break(int n) {
        return this.id_final(n);
    }

    @Override
    public /* synthetic */ rfH_2 id_break() {
        return this.id_case();
    }

    @Override
    public /* synthetic */ rfH_2 id_break(rpr_3 rpr_32) {
        return this.id_class(rpr_32);
    }

    public rU_2 id_break(double d, double d2, double d3) {
        return d == id_catch[0] && d2 == id_catch[1] && d3 == id_catch[2] ? this : new rU_2((double)this.b_() + d, (double)this.c_() + d2, (double)this.d_() + d3);
    }

    @Override
    public /* synthetic */ rfH_2 id_break(int n, int n2, int n3) {
        return this.id_class(n, n2, n3);
    }

    @Override
    public /* synthetic */ rja_3 id_break(rpr_3 rpr_32, int n) {
        return this.id_byte(rpr_32, n);
    }

    public rU_2 id_throws() {
        this.id_public();
        return new rU_2((Integer)this.id_break[id_implements[48]] + id_private[9], (Integer)this.id_break[id_implements[49]], (Integer)this.id_break[id_implements[50]]);
    }

    public rU_2 id_throws(int n) {
        this.id_public();
        return n == 0 ? this : new rU_2((Integer)this.id_break[id_implements[57]] - n, (Integer)this.id_break[id_implements[58]], (Integer)this.id_break[id_implements[59]]);
    }

    private static /* synthetic */ void ntfClinit() {
        rU_2.id_try();
        rU_2.id_return();
        rU_2.id_while();
        rU_2.id_continue();
        rU_2.id_synchronized();
        rU_2.id_goto();
        rU_2.id_super();
    }

    public rU_2 id_finally(int n) {
        this.id_public();
        return n == 0 ? this : new rU_2((Integer)this.id_break[id_implements[39]], (Integer)this.id_break[id_implements[40]], (Integer)this.id_break[id_implements[41]] - n);
    }

    public rU_2 id_finally() {
        this.id_public();
        return new rU_2((Integer)this.id_break[id_implements[36]], (Integer)this.id_break[id_implements[37]], (Integer)this.id_break[id_implements[38]] - id_private[7]);
    }

    @Override
    public /* synthetic */ rfH_2 id_catch(int n) {
        return this.id_protected(n);
    }

    @Override
    public /* synthetic */ rja_3 id_catch() {
        return this.id_case();
    }

    public rU_2 id_extends(int n) {
        this.id_public();
        return n == 0 ? this : new rU_2((Integer)this.id_break[id_implements[51]] + n, (Integer)this.id_break[id_implements[52]], (Integer)this.id_break[id_implements[53]]);
    }

    @Override
    public /* synthetic */ rfH_2 id_extends() {
        return this.id_throws();
    }

    private static void id_goto() {
        id_extends = new byte[]{3, 2, 3, 2};
    }

    private static long id_case(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD2379313FF7440ECL;
    }

    public rU_2 id_case() {
        this.id_public();
        return new rU_2((Integer)this.id_break[id_implements[24]], (Integer)this.id_break[id_implements[25]] - id_private[6], (Integer)this.id_break[id_implements[26]]);
    }

    @Override
    public /* synthetic */ rja_3 id_case(int n) {
        return this.id_final(n);
    }

    private static void id_continue() {
        short[] sArray = new short[66];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 2;
        sArray[14] = 2;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[22] = 1;
        sArray[23] = 2;
        sArray[25] = 1;
        sArray[26] = 2;
        sArray[28] = 1;
        sArray[29] = 2;
        sArray[31] = 1;
        sArray[32] = 2;
        sArray[34] = 1;
        sArray[35] = 2;
        sArray[37] = 1;
        sArray[38] = 2;
        sArray[40] = 1;
        sArray[41] = 2;
        sArray[43] = 1;
        sArray[44] = 2;
        sArray[46] = 1;
        sArray[47] = 2;
        sArray[49] = 1;
        sArray[50] = 2;
        sArray[52] = 1;
        sArray[53] = 2;
        sArray[55] = 1;
        sArray[56] = 2;
        sArray[58] = 1;
        sArray[59] = 2;
        sArray[61] = 1;
        sArray[62] = 2;
        sArray[64] = 1;
        sArray[65] = 2;
        id_implements = sArray;
    }

    @Override
    public /* synthetic */ rja_3 id_implements() {
        return this.id_class();
    }

    @Override
    public /* synthetic */ rja_3 id_implements(int n) {
        return this.id_protected(n);
    }

    private static int id_package(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x96F0AB9;
    }

    private static void id_return() {
        id_finally = new String[]{new String("X: %s, Y: %s, Z: %s")};
    }

    private static void id_super() {
        Object[] objectArray = new Object[]{new rU_2(0, 0, 0)};
        id_class = objectArray;
    }

    private static void id_try() {
        boolean[] blArray = new boolean[23];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[19] = true;
        blArray[22] = true;
        id_private = blArray;
    }

    private static void id_while() {
        id_native = new long[]{3241L, 3457689L, 8734625L, 2873465L};
    }

    private void id_public() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_extends[2]];
            objectArray[rU_2.id_private[17]] = id_private[18];
            objectArray[rU_2.id_private[19]] = id_private[20];
            objectArray[rU_2.id_extends[3]] = id_private[21];
        }
    }

    public rU_2 id_protected(int n) {
        this.id_public();
        return n == 0 ? this : new rU_2((Integer)this.id_break[id_implements[27]], (Integer)this.id_break[id_implements[28]] - n, (Integer)this.id_break[id_implements[29]]);
    }

    @Override
    public /* synthetic */ rfH_2 id_protected() {
        return this.id_volatile();
    }

    @Override
    public /* synthetic */ rfH_2 id_private(int n) {
        return this.id_byte(n);
    }

    @Override
    public /* synthetic */ rfH_2 id_private() {
        return this.id_finally();
    }

    public rU_2 id_final(int n) {
        this.id_public();
        return n == 0 ? this : new rU_2((Integer)this.id_break[id_implements[21]], (Integer)this.id_break[id_implements[22]] + n, (Integer)this.id_break[id_implements[23]]);
    }

    @Override
    public /* synthetic */ rfH_2 id_final() {
        return this.id_class();
    }

    public rU_2 id_volatile() {
        this.id_public();
        return new rU_2((Integer)this.id_break[id_implements[42]], (Integer)this.id_break[id_implements[43]], (Integer)this.id_break[id_implements[44]] + id_private[8]);
    }

    @Override
    public /* synthetic */ rfH_2 id_volatile(int n) {
        return this.id_extends(n);
    }

    private static void id_synchronized() {
        id_catch = new double[3];
    }

    public rU_2 id_native() {
        this.id_public();
        return new rU_2((Integer)this.id_break[id_implements[54]] - id_private[10], (Integer)this.id_break[id_implements[55]], (Integer)this.id_break[id_implements[56]]);
    }

    @Override
    public /* synthetic */ rfH_2 id_native(int n) {
        return this.id_finally(n);
    }
}

