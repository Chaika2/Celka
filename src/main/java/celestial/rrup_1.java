/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rjK_2;
import celestial.rji_3;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.rrtu_3;
import celestial.rruu_1;
import celestial.rruv_1;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrup_1
extends rruu_1 {
    private static boolean[] id_break;
    public Object[] id_byte;
    private static byte[] id_protected;
    private static float[] id_throws;
    private static short[] id_case;

    public <T extends rrup_1> T id_byte(boolean bl) {
        this.id_package();
        Boolean bl2 = bl;
        this.id_byte[rrup_1.id_case[30]] = bl2;
        return (T)this;
    }

    private static void id_int() {
        short[] sArray = new short[36];
        sArray[0] = 7;
        sArray[1] = 8;
        sArray[2] = 9;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        sArray[8] = 5;
        sArray[9] = 6;
        sArray[10] = 4;
        sArray[11] = 6;
        sArray[12] = 5;
        sArray[13] = 11;
        sArray[14] = 7;
        sArray[15] = 9;
        sArray[16] = 9;
        sArray[17] = 9;
        sArray[18] = 9;
        sArray[19] = 9;
        sArray[20] = 1;
        sArray[21] = 10;
        sArray[23] = 8;
        sArray[25] = 8;
        sArray[26] = 2;
        sArray[27] = 3;
        sArray[28] = 8;
        sArray[29] = 10;
        sArray[30] = 11;
        sArray[31] = 9;
        sArray[32] = 8;
        sArray[33] = 7;
        sArray[34] = 11;
        sArray[35] = 8;
        id_case = sArray;
    }

    public rrup_1(rrZO rrZO2, Supplier<String> supplier, Supplier<rjK_2> supplier2, Supplier<rjK_2> supplier3, Supplier<rjK_2> supplier4, Supplier<Integer> supplier5, Supplier<rji_3> supplier6) {
        Supplier<rji_3> supplier7;
        Supplier<Integer> supplier8;
        Supplier<rjK_2> supplier9;
        Supplier<rjK_2> supplier10;
        Supplier<rjK_2> supplier11;
        Supplier<String> supplier12;
        Supplier<Float> supplier13;
        Supplier<Boolean> supplier14;
        this.id_package();
        this.id_byte[rrup_1.id_case[0]] = supplier14 = () -> id_break[3];
        this.id_byte[rrup_1.id_case[1]] = supplier13 = () -> Float.valueOf(id_throws[10]);
        Float f = Float.valueOf(id_throws[0]);
        this.id_byte[rrup_1.id_case[2]] = f;
        rrZO rrZO3 = rrZO2;
        this.id_byte[rrup_1.id_case[3]] = rrZO3;
        this.id_byte[rrup_1.id_case[4]] = supplier12 = supplier;
        this.id_byte[rrup_1.id_case[5]] = supplier11 = supplier2;
        this.id_byte[rrup_1.id_case[6]] = supplier10 = supplier3;
        this.id_byte[rrup_1.id_case[7]] = supplier9 = supplier4;
        this.id_byte[rrup_1.id_case[8]] = supplier8 = supplier5;
        this.id_byte[rrup_1.id_case[9]] = supplier7 = supplier6;
    }

    static {
        rrup_1.ntfClinit();
    }

    private static void id_this() {
        boolean[] blArray = new boolean[6];
        blArray[2] = true;
        blArray[3] = true;
        id_break = blArray;
    }

    public <T extends rrup_1> T id_class(int n) {
        this.id_package();
        Float f = Float.valueOf(n);
        this.id_byte[rrup_1.id_case[31]] = f;
        return (T)this;
    }

    public <T extends rrup_1> T id_class(Supplier<Float> supplier) {
        Supplier<Float> supplier2;
        this.id_package();
        this.id_byte[rrup_1.id_case[32]] = supplier2 = supplier;
        return (T)this;
    }

    @Override
    public Supplier<rjK_2> id_class() {
        this.id_package();
        return (Supplier)this.id_byte[id_case[26]];
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n2, int n3, boolean bl) {
        this.id_package();
        super.id_class(ml_1, rrtu_32, n2, n3, bl);
        rruv_1 rruv_12 = this.id_catch();
        rjK_2 rjK_22 = this.id_extends().get();
        rjK_2 rjK_23 = (rjK_2)((Supplier)this.id_byte[id_case[10]]).get();
        rji_3 rji_32 = (rji_3)((Supplier)this.id_byte[id_case[11]]).get();
        int n4 = ColorHelper.id_class((int)((Integer)((Supplier)this.id_byte[id_case[12]]).get()), this.id_finally());
        UnaryOperator unaryOperator = n -> {
            this.id_package();
            return ColorHelper.id_break((int)n, (int)(id_throws[8] * ((Boolean)this.id_byte[id_case[34]] != false ? this.id_protected() : id_throws[9]) * ((Float)((Supplier)this.id_byte[id_case[35]]).get()).floatValue()));
        };
        int n5 = (Integer)unaryOperator.apply((int)rji_32.id_class());
        int n6 = (Integer)unaryOperator.apply((int)rji_32.id_break());
        int n7 = (Integer)unaryOperator.apply((int)rji_32.id_byte());
        int n8 = (Integer)unaryOperator.apply((int)rji_32.id_protected());
        float f = rjK_22.id_byte * ((Boolean)this.id_byte[id_case[13]] != false ? this.id_protected() : id_throws[1]);
        if (((Boolean)((Supplier)this.id_byte[id_case[14]]).get()).booleanValue()) {
            rrfD_2.id_class(ml_1, rruv_12.id_break(), rruv_12.id_protected() - id_throws[2], f, rjK_22.id_protected + id_throws[3], ((Float)this.id_byte[id_case[15]]).floatValue() / id_throws[4], (int)id_protected[0], (int)id_protected[1], n5, n6, n7, n8);
        }
        rrfD_2.id_break(ml_1, rruv_12.id_break(), rruv_12.id_protected(), f, rjK_22.id_protected, ((Float)this.id_byte[id_case[16]]).floatValue(), ((Float)this.id_byte[id_case[17]]).floatValue(), ((Float)this.id_byte[id_case[18]]).floatValue(), ((Float)this.id_byte[id_case[19]]).floatValue(), n5, n6, n7, n8);
        String string = this.id_class((String)((Supplier)this.id_byte[id_case[20]]).get());
        if (((Boolean)this.id_byte[id_case[21]]).booleanValue()) {
            ((rrZO)this.id_byte[id_case[22]]).id_byte(ml_1, string, rruv_12.id_break() + rruv_12.id_byte() / id_throws[5] + rjK_23.id_byte, rruv_12.id_protected() + rjK_23.id_protected, ColorHelper.id_break(n4, (int)(id_throws[6] * ((Float)((Supplier)this.id_byte[id_case[23]]).get()).floatValue())), id_break[0]);
        } else {
            ((rrZO)this.id_byte[id_case[24]]).id_protected(ml_1, string, rruv_12.id_break() + rjK_23.id_byte, rruv_12.id_protected() + rjK_23.id_protected, ColorHelper.id_break(n4, (int)(id_throws[7] * ((Float)((Supplier)this.id_byte[id_case[25]]).get()).floatValue())), id_break[1]);
        }
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC5B6E6C70DE4F9FFL;
    }

    public <T extends rrup_1> T id_break(Supplier<Boolean> supplier) {
        Supplier<Boolean> supplier2;
        this.id_package();
        this.id_byte[rrup_1.id_case[33]] = supplier2 = supplier;
        return (T)this;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCED89B2A;
    }

    private static /* synthetic */ void ntfClinit() {
        rrup_1.id_this();
        rrup_1.id_int();
        rrup_1.id_synchronized();
        rrup_1.id_return();
    }

    @Override
    public Supplier<rjK_2> id_extends() {
        this.id_package();
        return (Supplier)this.id_byte[id_case[27]];
    }

    public Supplier<Float> id_continue() {
        this.id_package();
        return (Supplier)this.id_byte[id_case[28]];
    }

    private void id_package() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[2]];
            objectArray[rrup_1.id_protected[3]] = Float.valueOf(id_throws[11]);
            objectArray[rrup_1.id_protected[4]] = id_break[4];
            objectArray[rrup_1.id_protected[5]] = id_break[5];
        }
    }

    private static void id_return() {
        id_protected = new byte[]{4, 9, 12, 9, 10, 11};
    }

    public rruu_1 id_super() {
        this.id_package();
        Boolean bl = id_break[2];
        this.id_byte[rrup_1.id_case[29]] = bl;
        return this;
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{5, -122, -14, 77, 88, -58, 75, -106}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_synchronized() {
        float[] fArray = new float[12];
        fArray[0] = 4.0f;
        fArray[1] = 1.0f;
        fArray[2] = 2.0f;
        fArray[3] = 4.0f;
        fArray[4] = 2.0f;
        fArray[5] = 2.0f;
        fArray[6] = 255.0f;
        fArray[7] = 255.0f;
        fArray[8] = 255.0f;
        fArray[9] = 1.0f;
        fArray[10] = 1.0f;
        id_throws = fArray;
    }
}

