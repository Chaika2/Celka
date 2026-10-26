/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rjK_2;
import celestial.rqO_2;
import celestial.rrfD_2;
import celestial.rrtu_3;
import celestial.rruC;
import celestial.rrul_1;
import celestial.rruu_1;
import celestial.rruv_1;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrun_1
extends rruu_1 {
    private static float[] id_byte;
    private static byte[] id_protected;
    public Object[] id_break;
    private static boolean[] id_throws;
    private static short[] id_case;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{52, -70, 102, 58, -127, 123, -110, -68}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_int() {
        short[] sArray = new short[18];
        sArray[1] = 4;
        sArray[2] = 5;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 3;
        sArray[10] = 5;
        sArray[12] = 4;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[15] = 5;
        sArray[16] = 5;
        sArray[17] = 4;
        id_case = sArray;
    }

    public rrun_1(Supplier<rqO_2> supplier, Supplier<rjK_2> supplier2, Supplier<rjK_2> supplier3, Supplier<Integer> supplier4) {
        Supplier<Integer> supplier5;
        Supplier<rjK_2> supplier6;
        Supplier<rjK_2> supplier7;
        Supplier<rqO_2> supplier8;
        Supplier<Float> supplier9;
        this.id_new();
        rrul_1 rrul_12 = (rrul_1)((Object)rrul_1.staticFields9897caebb88b3588975198b6a548d1f7[id_case[0]]);
        this.id_break[rrun_1.id_case[1]] = rrul_12;
        this.id_break[rrun_1.id_case[2]] = supplier9 = () -> Float.valueOf(id_byte[5]);
        this.id_break[rrun_1.id_case[3]] = supplier8 = supplier;
        this.id_break[rrun_1.id_case[4]] = supplier7 = supplier2;
        this.id_break[rrun_1.id_case[5]] = supplier6 = supplier3;
        this.id_break[rrun_1.id_case[6]] = supplier5 = supplier4;
    }

    static {
        rrun_1.ntfClinit();
    }

    private static void id_this() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_throws = blArray;
    }

    @Override
    public void id_class(boolean bl) {
        super.id_class(bl || !this.id_native() ? id_throws[0] : id_throws[1]);
    }

    public <T extends rrun_1> T id_class(Supplier<Float> supplier) {
        Supplier<Float> supplier2;
        this.id_new();
        this.id_break[rrun_1.id_case[16]] = supplier2 = supplier;
        return (T)this;
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        this.id_new();
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        rruv_1 rruv_12 = this.id_catch();
        rjK_2 rjK_22 = this.id_extends().get();
        int n3 = ColorHelper.id_class((int)((Integer)((Supplier)this.id_break[id_case[7]]).get()), this.id_finally());
        if ((Supplier)this.id_break[id_case[8]] != null) {
            rrfD_2.id_class(ml_1, (rqO_2)((Supplier)this.id_break[id_case[9]]).get(), rruv_12.id_break(), rruv_12.id_protected(), rjK_22.id_byte, rjK_22.id_protected, ColorHelper.id_break(n3, (int)(id_byte[0] * ((Float)((Supplier)this.id_break[id_case[10]]).get()).floatValue())));
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFA413F3B;
    }

    @Override
    public Supplier<rjK_2> id_class() {
        this.id_new();
        return (Supplier)this.id_break[id_case[13]];
    }

    public <T extends rrun_1> T id_class(rrul_1 rrul_12) {
        this.id_new();
        rrul_1 rrul_13 = rrul_12;
        this.id_break[rrun_1.id_case[17]] = rrul_13;
        return (T)this;
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB08F355A619975E2L;
    }

    private static /* synthetic */ void ntfClinit() {
        rrun_1.id_this();
        rrun_1.id_int();
        rrun_1.id_super();
        rrun_1.id_else();
    }

    @Override
    public float id_finally() {
        this.id_new();
        return switch (((int[])rruC.id_class[id_case[11]])[((rrul_1)((Object)this.id_break[id_case[12]])).ordinal()]) {
            default -> throw new IncompatibleClassChangeError();
            case 1 -> id_byte[1] - id_byte[2] * this.id_protected();
            case 2 -> id_byte[3] + id_byte[4] * this.id_protected();
        };
    }

    @Override
    public Supplier<rjK_2> id_extends() {
        this.id_new();
        return (Supplier)this.id_break[id_case[14]];
    }

    private static void id_else() {
        id_protected = new byte[]{6};
    }

    private void id_new() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
        }
    }

    public Supplier<Float> id_package() {
        this.id_new();
        return (Supplier)this.id_break[id_case[15]];
    }

    private static void id_super() {
        id_byte = new float[]{255.0f, 1.0f, 0.2f, 0.8f, 0.2f, 1.0f};
    }
}

