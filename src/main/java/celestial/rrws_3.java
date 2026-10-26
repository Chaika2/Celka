/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.glfw.GLFW
 */
package celestial;

import celestial.rfU_2;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rrvj_1;
import celestial.rrwE_2;
import celestial.rrwG_2;
import celestial.rrwO_2;
import celestial.rrwh_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.glfw.GLFW;

public class rrws_3
implements MinecraftAccessor {
    private static float[] id_byte;
    private static short[] id_protected;
    public static Object[] id_class;
    private static boolean[] id_throws;
    public Object[] id_break;
    private static byte[] id_case;

    public float id_byte() {
        return ((Float)this.id_break[id_protected[78]]).floatValue();
    }

    private boolean id_int() {
        long l = id_const.id_implements();
        return GLFW.glfwGetKey((long)l, (int)id_protected[1]) == id_throws[0] || GLFW.glfwGetKey((long)l, (int)id_protected[2]) == id_throws[1] ? id_throws[2] : id_throws[3];
    }

    public rrws_3(rrtN_2 rrtN_22) {
        this.id_native();
        rrtN_2 rrtN_23 = rrtN_22;
        this.id_break[rrws_3.id_protected[0]] = rrtN_23;
    }

    static {
        rrws_3.ntfClinit();
    }

    private void id_this() {
        if ((rrtu_3)this.id_break[id_protected[47]] == null) {
            return;
        }
        rrwh_3 rrwh_32 = rrwO_2.id_class((rrtN_2)this.id_break[id_protected[48]], (rrtu_3)this.id_break[id_protected[49]], ((rrtN_2)this.id_break[id_protected[50]]).id_default(), ((rrtN_2)this.id_break[id_protected[51]]).id_abstract(), id_const.id_volatile(), id_const.id_final());
        if (((Boolean)rrwh_32.id_class[id_protected[52]]).booleanValue() || ((Boolean)rrwh_32.id_class[id_protected[53]]).booleanValue()) {
            ((rrtN_2)this.id_break[id_protected[54]]).id_class(((Float)rrwh_32.id_class[id_protected[55]]).floatValue(), ((Float)rrwh_32.id_class[id_protected[56]]).floatValue());
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF23AC146838BACA2L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD53A315B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{68, 126, 102, 120, 3, 90, -45, -2}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_class(float f, float f2) {
        float f3 = id_const.id_volatile();
        float f4 = id_const.id_final();
        float f5 = ((rrtN_2)this.id_break[id_protected[17]]).id_import();
        float f6 = f3 - f - f5;
        float f7 = f4 - f2 - f5;
        if (f6 >= f5 && f7 >= f5) {
            float f8 = rfU_2.id_class(((rrtN_2)this.id_break[id_protected[18]]).id_default(), f5, f6);
            float f9 = rfU_2.id_class(((rrtN_2)this.id_break[id_protected[19]]).id_abstract(), f5, f7);
            ((rrtN_2)this.id_break[id_protected[20]]).id_class(f8, f9);
        }
    }

    private boolean id_class(rrtu_3 rrtu_32) {
        List<rrtN_2> list = rrtu_32.id_class();
        int n = id_case[0];
        for (int i = id_throws[14]; i < list.size(); ++i) {
            rrtN_2 rrtN_22 = list.get(i);
            if (!rrtN_22.id_extends() || rrtN_22 == (rrtN_2)this.id_break[id_protected[68]]) continue;
            for (int j = id_throws[15]; j < i; ++j) {
                rrtN_2 rrtN_23 = list.get(j);
                if (!rrtN_22.id_transient().id_class(rrtN_23.id_transient()) || rrtN_23 != (rrtN_2)id_class[id_protected[69]]) continue;
                n = j;
                break;
            }
            if (n == id_case[1]) continue;
            Collections.swap(list, i, n);
            n = id_case[2];
        }
        return id_throws[16];
    }

    public void id_class(rrtu_3 rrtu_32, int n, int n2) {
        float f;
        float f2;
        if (!((rrtN_2)this.id_break[id_protected[3]]).id_final()) {
            return;
        }
        float f3 = ((rrtN_2)this.id_break[id_protected[4]]).id_implements();
        float f4 = ((rrtN_2)this.id_break[id_protected[5]]).ao_();
        float f5 = id_const.id_volatile();
        float f6 = id_const.id_final();
        if (!((rrtN_2)this.id_break[id_protected[6]]).P()) {
            return;
        }
        if (((Boolean)this.id_break[id_protected[7]]).booleanValue() && !((Boolean)this.id_break[id_protected[8]]).booleanValue()) {
            f2 = (float)n - ((Float)this.id_break[id_protected[9]]).floatValue();
            if (f2 * f2 + (f = (float)n2 - ((Float)this.id_break[id_protected[10]]).floatValue()) * f >= id_byte[0]) {
                this.id_super();
            } else {
                return;
            }
        }
        if (this.id_catch()) {
            rrtu_3 rrtu_33 = rrtu_32;
            this.id_break[rrws_3.id_protected[11]] = rrtu_33;
            f2 = (float)n - this.id_finally();
            f = (float)n2 - this.id_break();
            if ((rrtN_2)this.id_break[id_protected[12]] instanceof rrvj_1 && !this.id_int()) {
                rrwh_3 rrwh_32 = rrwO_2.id_class((rrtN_2)this.id_break[id_protected[13]], rrtu_32, f2, f, f5, f6);
                this.id_break[rrws_3.id_protected[14]] = rrwh_32;
            } else {
                Object var16_12 = null;
                this.id_break[rrws_3.id_protected[15]] = var16_12;
            }
            ((rrtN_2)this.id_break[id_protected[16]]).id_class(f2, f);
            if (f3 < f5 || f4 < f6) {
                this.id_class(f3, f4);
            }
        }
    }

    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3) {
        rrtN_2 rrtN_22;
        if (n3 == id_throws[4] && (rrtN_22 = (rrtN_2)this.id_break[id_protected[21]]) instanceof rrvj_1) {
            rrvj_1 rrvj_12 = (rrvj_1)rrtN_22;
            if (((rrtN_2)this.id_break[id_protected[22]]).id_transient().id_break(n, n2)) {
                rrvj_12.id_this();
                return id_throws[5];
            }
        }
        if (n3 == 0 && ((rrtN_2)this.id_break[id_protected[23]]).id_class(rrtu_32, n, n2)) {
            this.id_class((float)n - ((rrtN_2)this.id_break[id_protected[24]]).id_default());
            this.id_break((float)n2 - ((rrtN_2)this.id_break[id_protected[25]]).id_abstract());
            Float f = Float.valueOf(n);
            this.id_break[rrws_3.id_protected[26]] = f;
            Float f2 = Float.valueOf(n2);
            this.id_break[rrws_3.id_protected[27]] = f2;
            rrtN_2 rrtN_23 = (rrtN_2)this.id_break[id_protected[28]];
            rrws_3.id_class[rrws_3.id_protected[29]] = rrtN_23;
            if (this.id_class(rrtu_32)) {
                Boolean bl = id_throws[6];
                this.id_break[rrws_3.id_protected[30]] = bl;
                return id_throws[7];
            }
        }
        return id_throws[8];
    }

    public boolean id_class() {
        return (Boolean)this.id_break[id_protected[77]];
    }

    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_break[rrws_3.id_protected[73]] = f2;
    }

    public float id_break() {
        return ((Float)this.id_break[id_protected[74]]).floatValue();
    }

    public void id_break(float f) {
        Float f2 = Float.valueOf(f);
        this.id_break[rrws_3.id_protected[75]] = f2;
    }

    public float id_throws() {
        return ((Float)this.id_break[id_protected[79]]).floatValue();
    }

    private static /* synthetic */ void ntfClinit() {
        rrws_3.id_continue();
        rrws_3.id_final();
        rrws_3.id_new();
        rrws_3.id_package();
        rrws_3.id_volatile();
    }

    public float id_finally() {
        return ((Float)this.id_break[id_protected[72]]).floatValue();
    }

    public boolean id_catch() {
        return (Boolean)this.id_break[id_protected[71]];
    }

    public float id_extends() {
        return ((Float)this.id_break[id_protected[80]]).floatValue();
    }

    public void id_case() {
        rrtN_2 rrtN_22;
        if (((Boolean)this.id_break[id_protected[42]]).booleanValue() && (rrtN_22 = (rrtN_2)this.id_break[id_protected[43]]) instanceof rrvj_1) {
            rrvj_1 rrvj_12 = (rrvj_1)rrtN_22;
            if (!this.id_int()) {
                this.id_this();
                this.id_synchronized();
            }
            if (rrvj_12.id_continue()) {
                this.id_else();
            }
        }
        Object var7_3 = null;
        this.id_break[rrws_3.id_protected[44]] = var7_3;
        Boolean bl = id_throws[12];
        this.id_break[rrws_3.id_protected[45]] = bl;
        Boolean bl2 = id_throws[13];
        this.id_break[rrws_3.id_protected[46]] = bl2;
        this.id_protected();
    }

    private static void id_continue() {
        boolean[] blArray = new boolean[23];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[22] = true;
        id_throws = blArray;
    }

    private void id_else() {
        if (((rrtN_2)this.id_break[id_protected[62]]).id_const() == null) {
            return;
        }
        float f = ((rrtN_2)this.id_break[id_protected[63]]).id_implements();
        float f2 = ((rrtN_2)this.id_break[id_protected[64]]).ao_();
        float f3 = ((rrtN_2)this.id_break[id_protected[65]]).id_default() + f / id_byte[1];
        float f4 = ((rrtN_2)this.id_break[id_protected[66]]).id_abstract() + f2 / id_byte[2];
        rrwE_2 rrwE_22 = rrwE_2.id_class(f3, f4, id_const.id_volatile(), id_const.id_final());
        ((rrtN_2)this.id_break[id_protected[67]]).id_class(rrwE_22);
    }

    public rrwh_3 id_implements() {
        return (rrwh_3)this.id_break[id_protected[76]];
    }

    private static void id_new() {
        float[] fArray = new float[13];
        fArray[0] = 4.0f;
        fArray[1] = 2.0f;
        fArray[2] = 2.0f;
        fArray[11] = 2.0f;
        fArray[12] = 4.0f;
        id_byte = fArray;
    }

    private static void id_package() {
        id_case = new byte[]{-1, -1, -1, 14, 2, 3, 5, 6, 7, 9, 10, 11, 12, 13, 3, 2};
    }

    private void id_super() {
        Boolean bl = id_throws[9];
        this.id_break[rrws_3.id_protected[31]] = bl;
        Boolean bl2 = id_throws[10];
        this.id_break[rrws_3.id_protected[32]] = bl2;
        Float f = Float.valueOf(((rrtN_2)this.id_break[id_protected[33]]).id_default());
        this.id_break[rrws_3.id_protected[34]] = f;
        Float f2 = Float.valueOf(((rrtN_2)this.id_break[id_protected[35]]).id_abstract());
        this.id_break[rrws_3.id_protected[36]] = f2;
        Float f3 = Float.valueOf(((rrtN_2)this.id_break[id_protected[37]]).id_implements());
        this.id_break[rrws_3.id_protected[38]] = f3;
        Float f4 = Float.valueOf(((rrtN_2)this.id_break[id_protected[39]]).ao_());
        this.id_break[rrws_3.id_protected[40]] = f4;
        Boolean bl3 = id_throws[11];
        this.id_break[rrws_3.id_protected[41]] = bl3;
    }

    public void id_protected() {
        Boolean bl = id_throws[17];
        this.id_break[rrws_3.id_protected[70]] = bl;
    }

    public float id_private() {
        return ((Float)this.id_break[id_protected[81]]).floatValue();
    }

    private static void id_final() {
        short[] sArray = new short[82];
        sArray[1] = 342;
        sArray[2] = 346;
        sArray[7] = 5;
        sArray[8] = 1;
        sArray[9] = 6;
        sArray[10] = 7;
        sArray[11] = 8;
        sArray[14] = 4;
        sArray[15] = 4;
        sArray[26] = 6;
        sArray[27] = 7;
        sArray[30] = 5;
        sArray[31] = 1;
        sArray[32] = 5;
        sArray[34] = 10;
        sArray[36] = 11;
        sArray[38] = 12;
        sArray[40] = 13;
        sArray[41] = 9;
        sArray[42] = 1;
        sArray[44] = 4;
        sArray[45] = 5;
        sArray[46] = 9;
        sArray[47] = 8;
        sArray[49] = 8;
        sArray[52] = 2;
        sArray[53] = 3;
        sArray[56] = 1;
        sArray[70] = 1;
        sArray[71] = 1;
        sArray[72] = 2;
        sArray[73] = 2;
        sArray[74] = 3;
        sArray[75] = 3;
        sArray[76] = 4;
        sArray[77] = 9;
        sArray[78] = 10;
        sArray[79] = 11;
        sArray[80] = 12;
        sArray[81] = 13;
        id_protected = sArray;
    }

    private static void id_volatile() {
        Object[] objectArray = new Object[3];
        objectArray[1] = Float.valueOf(0.0f);
        objectArray[2] = Float.valueOf(0.0f);
        id_class = objectArray;
    }

    private void id_synchronized() {
        float f = rrwG_2.id_class(((rrtN_2)this.id_break[id_protected[57]]).id_default());
        float f2 = rrwG_2.id_class(((rrtN_2)this.id_break[id_protected[58]]).id_abstract());
        ((rrtN_2)this.id_break[id_protected[59]]).id_class(f, f2);
        float f3 = ((rrtN_2)this.id_break[id_protected[60]]).id_implements();
        float f4 = ((rrtN_2)this.id_break[id_protected[61]]).ao_();
        if (f3 < id_const.id_volatile() || f4 < id_const.id_final()) {
            this.id_class(f3, f4);
        }
    }

    private void id_native() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[3]];
            objectArray[rrws_3.id_throws[18]] = id_throws[19];
            objectArray[rrws_3.id_case[4]] = Float.valueOf(id_byte[3]);
            objectArray[rrws_3.id_case[5]] = Float.valueOf(id_byte[4]);
            objectArray[rrws_3.id_case[6]] = id_throws[20];
            objectArray[rrws_3.id_case[7]] = Float.valueOf(id_byte[5]);
            objectArray[rrws_3.id_case[8]] = Float.valueOf(id_byte[6]);
            objectArray[rrws_3.id_case[9]] = id_throws[21];
            objectArray[rrws_3.id_case[10]] = Float.valueOf(id_byte[7]);
            objectArray[rrws_3.id_case[11]] = Float.valueOf(id_byte[8]);
            objectArray[rrws_3.id_case[12]] = Float.valueOf(id_byte[9]);
            objectArray[rrws_3.id_case[13]] = Float.valueOf(id_byte[10]);
        }
    }
}

