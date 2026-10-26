/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rjK_2;
import celestial.rrtu_3;
import celestial.rrum_1;
import celestial.rruv_1;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rruu_1 {
    private static boolean[] id_break;
    private static short[] id_byte;
    private static float[] id_protected;
    private static long[] id_throws;
    private static byte[] id_case;
    public Object[] id_class;

    public rrum_1 id_byte() {
        return (rrum_1)this.id_class[id_byte[11]];
    }

    public void id_byte(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rruu_1.id_byte[16]] = f2;
    }

    private static void id_int() {
        short[] sArray = new short[19];
        sArray[0] = 5;
        sArray[1] = 5;
        sArray[2] = 6;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 5;
        sArray[6] = 5;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 3;
        sArray[11] = 4;
        sArray[12] = 5;
        sArray[13] = 6;
        sArray[15] = 1;
        sArray[16] = 2;
        sArray[17] = 3;
        sArray[18] = 4;
        id_byte = sArray;
    }

    public rruu_1() {
        this.id_package();
        Float f = Float.valueOf(id_protected[0]);
        this.id_class[rruu_1.id_byte[0]] = f;
        AnimValue animValue = new AnimValue(((Float)this.id_class[id_byte[1]]).floatValue(), id_break[0]);
        this.id_class[rruu_1.id_byte[2]] = animValue;
    }

    static {
        rruu_1.ntfClinit();
    }

    private static void id_this() {
        float[] fArray = new float[6];
        fArray[0] = 0.3f;
        fArray[1] = 1.0f;
        fArray[2] = 0.2f;
        id_protected = fArray;
    }

    public void id_class(long l) {
        Long l2 = l;
        this.id_class[rruu_1.id_byte[17]] = l2;
    }

    public <T extends rruu_1> T id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rruu_1.id_byte[6]] = f2;
        return (T)this;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x94CF5B4B;
    }

    public void id_class(rrum_1 rrum_12) {
        rrum_1 rrum_13 = rrum_12;
        this.id_class[rruu_1.id_byte[18]] = rrum_13;
    }

    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
    }

    public abstract Supplier<rjK_2> id_class();

    public String id_class(String string) {
        rrum_1 rrum_12 = this.id_byte();
        if (rrum_12 != null && this.id_throws() > id_throws[0]) {
            if ((float)(System.currentTimeMillis() - this.id_throws()) > rrum_12.id_class()) {
                this.id_class(id_throws[1]);
            }
            return rrum_12.id_break();
        }
        return string;
    }

    public void id_class(boolean bl) {
        AnimValue animValue = this.id_case();
        animValue.id_break().id_break(((Float)this.id_class[id_byte[5]]).floatValue());
        animValue.id_class(bl);
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF0EB541A8779CEDDL;
    }

    public rruv_1 id_break() {
        return this.id_catch();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{110, 0, 52, -7, 25, -107, -41, -57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_break(float f) {
        Float f2 = Float.valueOf(f);
        this.id_class[rruu_1.id_byte[15]] = f2;
    }

    public void id_break(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rruu_1.id_byte[14]] = bl2;
    }

    public long id_throws() {
        return (Long)this.id_class[id_byte[10]];
    }

    private static /* synthetic */ void ntfClinit() {
        rruu_1.id_super();
        rruu_1.id_new();
        rruu_1.id_this();
        rruu_1.id_int();
        rruu_1.id_continue();
    }

    public float id_finally() {
        return id_protected[1] - id_protected[2] * this.id_protected();
    }

    public rruv_1 id_catch() {
        rjK_2 rjK_22 = this.id_class().get();
        rjK_2 rjK_23 = this.id_extends().get();
        return new rruv_1(rjK_22.id_byte + ((Float)this.id_class[id_byte[3]]).floatValue(), rjK_22.id_protected + ((Float)this.id_class[id_byte[4]]).floatValue(), rjK_23.id_byte, rjK_23.id_protected);
    }

    public abstract Supplier<rjK_2> id_extends();

    public AnimValue id_case() {
        return (AnimValue)this.id_class[id_byte[13]];
    }

    private static void id_continue() {
        id_case = new byte[]{7, 2, 3, 5};
    }

    public float id_implements() {
        return ((Float)this.id_class[id_byte[9]]).floatValue();
    }

    private static void id_new() {
        id_throws = new long[3];
    }

    private void id_package() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[0]];
            objectArray[rruu_1.id_break[1]] = id_break[2];
            objectArray[rruu_1.id_break[3]] = Float.valueOf(id_protected[3]);
            objectArray[rruu_1.id_case[1]] = Float.valueOf(id_protected[4]);
            objectArray[rruu_1.id_case[2]] = id_throws[2];
            objectArray[rruu_1.id_case[3]] = Float.valueOf(id_protected[5]);
        }
    }

    private static void id_super() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[3] = true;
        id_break = blArray;
    }

    public float id_protected() {
        return this.id_case().id_byte();
    }

    public float id_private() {
        return ((Float)this.id_class[id_byte[8]]).floatValue();
    }

    public float id_final() {
        return ((Float)this.id_class[id_byte[12]]).floatValue();
    }

    public boolean id_volatile() {
        return this.id_case().id_case();
    }

    public boolean id_native() {
        return (Boolean)this.id_class[id_byte[7]];
    }
}

