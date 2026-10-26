/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfU_2;
import celestial.setting.Setting;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIm_1
extends Setting<Float> {
    private static byte[] id_byte;
    public Object[] id_break;
    private static short[] id_protected;
    private static boolean[] id_throws;
    private static float[] id_case;

    public void id_byte(BiFunction<rrIm_1, Float, String> biFunction) {
        BiFunction<rrIm_1, Float, String> biFunction2;
        this.id_this();
        this.id_break[rrIm_1.id_protected[17]] = biFunction2 = biFunction;
    }

    public boolean id_int() {
        this.id_this();
        return ((Float)this.id_byte()).floatValue() >= ((Float)this.id_break[id_protected[6]]).floatValue() ? id_throws[0] : id_throws[1];
    }

    public rrIm_1(String string, Float f, Float f2, Float f3, Float f4) {
        super(string, f);
        this.id_this();
        Float f5 = Float.valueOf(f.floatValue());
        this.id_break[rrIm_1.id_protected[0]] = f5;
        Float f6 = Float.valueOf(f4.floatValue());
        this.id_break[rrIm_1.id_protected[1]] = f6;
        Float f7 = Float.valueOf(f2.floatValue());
        this.id_break[rrIm_1.id_protected[2]] = f7;
        Float f8 = Float.valueOf(f3.floatValue());
        this.id_break[rrIm_1.id_protected[3]] = f8;
    }

    static {
        rrIm_1.ntfClinit();
    }

    private void id_this() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
            objectArray[rrIm_1.id_throws[3]] = Float.valueOf(id_case[0]);
            objectArray[rrIm_1.id_throws[4]] = Float.valueOf(id_case[1]);
            objectArray[rrIm_1.id_byte[1]] = Float.valueOf(id_case[2]);
            objectArray[rrIm_1.id_byte[2]] = Float.valueOf(id_case[3]);
            objectArray[rrIm_1.id_byte[3]] = id_throws[5];
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x83DE8A77;
    }

    @Override
    public void id_class(Float f, boolean bl, boolean bl2) {
        this.id_this();
        super.id_class(Float.valueOf(rfU_2.id_class(f.floatValue(), ((Float)this.id_break[id_protected[4]]).floatValue(), ((Float)this.id_break[id_protected[5]]).floatValue())), bl, bl2);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x20DFB4AA777B20C9L;
    }

    public float id_class() {
        this.id_this();
        return ((Float)this.id_break[id_protected[10]]).floatValue();
    }

    public rrIm_1 id_class(BiFunction<rrIm_1, Float, String> biFunction) {
        BiFunction<rrIm_1, Float, String> biFunction2;
        this.id_this();
        this.id_break[rrIm_1.id_protected[7]] = biFunction2 = biFunction;
        return this;
    }

    public rrIm_1 id_break(BiFunction<rrIm_1, Float, String> biFunction) {
        BiFunction<rrIm_1, Float, String> biFunction2;
        this.id_this();
        this.id_break[rrIm_1.id_protected[8]] = biFunction2 = biFunction;
        return this;
    }

    public BiFunction<rrIm_1, Float, String> id_break() {
        this.id_this();
        return (BiFunction)this.id_break[id_protected[16]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIm_1.id_new();
        rrIm_1.id_else();
        rrIm_1.id_continue();
        rrIm_1.id_super();
    }

    public rrIm_1 id_finally() {
        this.id_this();
        Boolean bl = id_throws[2];
        this.id_break[rrIm_1.id_protected[9]] = bl;
        return this;
    }

    public float id_extends() {
        this.id_this();
        return ((Float)this.id_break[id_protected[12]]).floatValue();
    }

    private static void id_continue() {
        id_case = new float[4];
    }

    private static void id_else() {
        short[] sArray = new short[19];
        sArray[0] = 2;
        sArray[1] = 3;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[7] = 5;
        sArray[8] = 6;
        sArray[9] = 4;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 3;
        sArray[14] = 4;
        sArray[15] = 5;
        sArray[16] = 6;
        sArray[17] = 5;
        sArray[18] = 6;
        id_protected = sArray;
    }

    private static void id_new() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        id_throws = blArray;
    }

    public BiFunction<rrIm_1, Float, String> id_package() {
        this.id_this();
        return (BiFunction)this.id_break[id_protected[15]];
    }

    private static void id_super() {
        id_byte = new byte[]{7, 2, 3, 4};
    }

    public void id_protected(BiFunction<rrIm_1, Float, String> biFunction) {
        BiFunction<rrIm_1, Float, String> biFunction2;
        this.id_this();
        this.id_break[rrIm_1.id_protected[18]] = biFunction2 = biFunction;
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{96, -10, 127, -38, 122, 48, 114, 43}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_final() {
        this.id_this();
        return (Boolean)this.id_break[id_protected[14]];
    }

    public float id_volatile() {
        this.id_this();
        return ((Float)this.id_break[id_protected[13]]).floatValue();
    }

    public float id_native() {
        this.id_this();
        return ((Float)this.id_break[id_protected[11]]).floatValue();
    }
}

