/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrtN_2;
import celestial.rrtc_3;
import celestial.rrtn_3;
import celestial.rrtu_3;
import celestial.rrtv_3;
import celestial.rruv_1;
import celestial.rrwf_3;
import celestial.util.AnimValue;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrtm_3
implements MinecraftAccessor,
rrtc_3,
rrwf_3 {
    private static int[] id_byte;
    private static byte[] id_protected;
    private static float[] id_throws;
    public static Object[] id_class;
    public Object[] id_break;
    private static short[] id_native;
    private static boolean[] id_volatile;

    private void id_byte(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2) {
    }

    public float id_byte() {
        return ((Float)this.id_break[id_native[15]]).floatValue();
    }

    public void id_byte(int n, int n2, int n3) {
    }

    public float id_int() {
        return ((rrtv_3)this.id_break[id_native[13]]).id_class().id_byte();
    }

    public rrtm_3(float f, float f2, float f3, float f4) {
        this(f, f2);
        Float f5 = Float.valueOf(f3);
        this.id_break[rrtm_3.id_native[4]] = f5;
        Float f6 = Float.valueOf(f4);
        this.id_break[rrtm_3.id_native[5]] = f6;
    }

    public rrtm_3(float f, float f2) {
        this.id_return();
        rrtv_3 rrtv_32 = new rrtv_3(id_throws[0], id_volatile[0]);
        this.id_break[rrtm_3.id_native[0]] = rrtv_32;
        rrtv_3 rrtv_33 = new rrtv_3(id_throws[1], id_volatile[1]);
        this.id_break[rrtm_3.id_native[1]] = rrtv_33;
        Float f3 = Float.valueOf(f);
        this.id_break[rrtm_3.id_native[2]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_break[rrtm_3.id_native[3]] = f4;
    }

    static {
        rrtm_3.ntfClinit();
    }

    public rrtv_3 id_this() {
        return (rrtv_3)this.id_break[id_native[14]];
    }

    public int id_class(int n) {
        return (int)((float)n * this.id_int());
    }

    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        if (!this.id_private().P()) {
            return id_volatile[2];
        }
        if ((float)n2 < this.id_private().id_abstract() + id_throws[2] && this.id_volatile().id_break(n, n2)) {
            this.id_class(rrtu_32, n, n2, n3);
            return id_volatile[3];
        }
        return id_volatile[4];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{90, 31, 95, -86, 34, 97, 103, 48}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC98D08DB4F6C9A1EL;
    }

    public float id_class(rrtm_3 rrtm_32) {
        rrtN_2 rrtN_22 = this.id_private();
        float f = rrtN_22.id_interface().id_byte() && !rrtN_22.P() ? id_throws[7] : rrtm_32.id_int();
        return (rrtm_32.id_continue() + id_throws[8]) * f;
    }

    public boolean id_class(float f, float f2, float f3) {
        return f >= this.id_package() && f <= this.id_package() + this.id_new() && f2 >= this.id_final() && f2 <= this.id_final() + f3 ? id_volatile[10] : id_volatile[11];
    }

    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3) {
        return id_volatile[7];
    }

    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2) {
        if (!this.id_private().ap_()) {
            ((rrtv_3)this.id_break[id_native[6]]).id_class().id_class(this.id_finally().id_private());
        }
    }

    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_break[rrtm_3.id_native[16]] = f2;
    }

    public static boolean id_class(rrtm_3 rrtm_32, rrtN_2 rrtN_22) {
        byte by;
        float f;
        float f2 = rrtm_32.id_final();
        float f3 = rrtN_22.id_abstract();
        float f4 = rrtN_22.ao_();
        float f5 = rrtm_32.id_class(rrtm_32);
        return f2 + f5 + (f = rrtm_32.id_super()) < f3 + (float)(by = id_protected[0]) || f2 > f3 + f4 + (float)by ? id_volatile[14] : id_volatile[15];
    }

    public boolean id_class(char c, int n) {
        return id_volatile[8];
    }

    public void id_class(int n, int n2, int n3) {
    }

    public int id_class(int n, AnimValue animValue) {
        return (int)((float)n * animValue.id_byte());
    }

    public void id_break() {
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x510BB17C;
    }

    public void id_break(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2) {
        this.id_byte(ml_1, rrtu_32, n, n2);
    }

    public boolean id_break(int n, int n2, int n3) {
        return n3 == 0 ? id_volatile[5] : id_volatile[6];
    }

    public void id_break(float f) {
        Float f2 = Float.valueOf(f);
        this.id_break[rrtm_3.id_native[10]] = f2;
    }

    public boolean id_throws() {
        return this.id_finally().id_private() || this.id_int() > id_throws[10] ? id_volatile[12] : id_volatile[13];
    }

    private static /* synthetic */ void ntfClinit() {
        rrtm_3.id_try();
        rrtm_3.id_while();
        rrtm_3.id_instanceof();
        rrtm_3.id_goto();
        rrtm_3.id_public();
        rrtm_3.id_synchronized();
    }

    public void id_catch() {
    }

    public void id_extends() {
    }

    private static void id_goto() {
        id_protected = new byte[]{20, 7, 2, 3, 4};
    }

    public void id_case() {
    }

    public float id_continue() {
        return ((Float)this.id_break[id_native[12]]).floatValue();
    }

    public void id_else() {
    }

    public boolean id_implements() {
        return id_volatile[9];
    }

    private static void id_instanceof() {
        short[] sArray = new short[18];
        sArray[0] = 5;
        sArray[1] = 6;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[6] = 5;
        sArray[8] = 1;
        sArray[9] = 4;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 3;
        sArray[13] = 5;
        sArray[14] = 5;
        sArray[15] = 4;
        sArray[16] = 4;
        sArray[17] = 5;
        id_native = sArray;
    }

    public float id_new() {
        return ((Float)this.id_break[id_native[11]]).floatValue();
    }

    public float id_package() {
        return this.id_private().id_default() + ((Float)this.id_break[id_native[7]]).floatValue();
    }

    private void id_return() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[1]];
            objectArray[rrtm_3.id_volatile[16]] = Float.valueOf(id_throws[11]);
            objectArray[rrtm_3.id_volatile[17]] = Float.valueOf(id_throws[12]);
            objectArray[rrtm_3.id_protected[2]] = Float.valueOf(id_throws[13]);
            objectArray[rrtm_3.id_protected[3]] = Float.valueOf(id_throws[14]);
            objectArray[rrtm_3.id_protected[4]] = Float.valueOf(id_throws[15]);
        }
    }

    public float id_super() {
        return id_throws[9];
    }

    private static void id_try() {
        boolean[] blArray = new boolean[20];
        blArray[4] = true;
        blArray[5] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[17] = true;
        blArray[18] = true;
        id_volatile = blArray;
    }

    private static void id_while() {
        float[] fArray = new float[16];
        fArray[0] = 0.5f;
        fArray[1] = 0.4f;
        fArray[2] = 5.0f;
        fArray[3] = 22.0f;
        fArray[5] = 0.6f;
        fArray[6] = 1.0f;
        fArray[7] = 1.0f;
        id_throws = fArray;
    }

    private static void id_public() {
        id_byte = new int[]{6781311};
    }

    public List<? extends rrtn_3> id_protected() {
        return Collections.emptyList();
    }

    public abstract rrtN_2 id_private();

    public float id_final() {
        rrtN_2 rrtN_22 = this.id_private();
        float f = id_throws[3];
        for (rrtm_3 rrtm_32 : this.id_private().id_strictfp()) {
            if (!rrtm_32.id_throws()) continue;
            rrtm_32.id_break(f);
            f += this.id_class(rrtm_32);
        }
        float f2 = !rrtN_22.P() && rrtN_22.id_interface().id_byte() ? id_throws[4] : this.id_continue() * id_throws[5] * (id_throws[6] - this.id_int());
        return rrtN_22.id_abstract() + (((Float)this.id_break[id_native[8]]).floatValue() - f2) + ((Float)this.id_break[id_native[9]]).floatValue();
    }

    public abstract rruv_1 id_volatile();

    private static void id_synchronized() {
        Object[] objectArray = new Object[]{6781311};
        id_class = objectArray;
    }

    public void id_native() {
        ((rrtv_3)this.id_break[id_native[17]]).id_class().id_extends();
    }

    public void aP_() {
    }
}

