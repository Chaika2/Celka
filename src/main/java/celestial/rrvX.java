/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Ml_1;
import celestial.Qj_1;
import celestial.manager.FontManager;
import celestial.rfU_2;
import celestial.rjK_2;
import celestial.rji_3;
import celestial.rqO_2;
import celestial.rrZF;
import celestial.rrZI;
import celestial.rrfD_2;
import celestial.rrtH_2;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rruF;
import celestial.rruL;
import celestial.rrum_1;
import celestial.rrup_1;
import celestial.rruu_1;
import celestial.rruv_1;
import celestial.setting.Setting;
import celestial.util.ColorHelper;
import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrvX
extends rrtN_2 {
    private static int[] id_byte;
    private static byte[] id_protected;
    private static String[] id_native;
    private static short[] id_volatile;
    public Object[] id_class;
    public static Object[] id_break;
    private static double[] id_final;
    private static float[] id_package;
    private static boolean[] id_int;

    @Override
    public String id_byte() {
        return id_native[1];
    }

    @Override
    public void id_int() {
        super.id_int();
        this.x();
    }

    public rrvX(rrtH_2 rrtH_22, Supplier<Float> supplier, Supplier<Float> supplier2) {
        super(supplier, supplier2, () -> Float.valueOf(id_package[72]), () -> Float.valueOf(id_package[71]));
        this.S();
        rruL rruL2 = new rruL();
        this.id_class[rrvX.id_volatile[0]] = rruL2;
        Float f = Float.valueOf(supplier.get().floatValue());
        this.id_class[rrvX.id_volatile[1]] = f;
        Float f2 = Float.valueOf(supplier2.get().floatValue());
        this.id_class[rrvX.id_volatile[2]] = f2;
        rrtH_2 rrtH_23 = rrtH_22;
        this.id_class[rrvX.id_volatile[3]] = rrtH_23;
        this.id_class(() -> Float.valueOf(id_package[68] + (this.d() ? id_package[69] : id_package[70])));
        this.id_break((Integer)rrtH_22.id_synchronized().id_byte(), id_int[0], id_int[1], id_int[2]);
        this.id_super();
        ((rrtH_2)this.id_class[id_volatile[4]]).id_synchronized().id_class(id_native[0], (Setting<T> setting, Pair<T, Boolean> pair) -> {
            if (((Boolean)pair.getRight()).booleanValue()) {
                this.id_break((Integer)pair.getLeft(), id_int[51], id_int[52], id_int[53]);
            }
        });
    }

    static {
        rrvX.ntfClinit();
    }

    private static void F() {
        id_native = new String[]{new String("setup_color"), new String("\u0426\u0432\u0435\u0442"), new String("ColorPickerPopUp"), new String("#%08X"), new String("#%06X"), new String("\u0423\u0441\u043f\u0435\u0448\u043d\u043e!"), new String("\u041e\u0448\u0438\u0431\u043a\u0430!"), new String("#"), new String("\u0423\u0441\u043f\u0435\u0448\u043d\u043e!"), new String("\u041e\u0448\u0438\u0431\u043a\u0430!"), new String("\u0412\u0441\u0442\u0430\u0432\u0438\u0442\u044c"), new String("\u041a\u043e\u043f\u0438\u0440\u043e\u0432\u0430\u0442\u044c"), new String("celestial/images/huebar.png")};
    }

    private void S() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[10]];
            objectArray[rrvX.id_protected[11]] = Float.valueOf(id_package[73]);
            objectArray[rrvX.id_protected[12]] = Float.valueOf(id_package[74]);
            objectArray[rrvX.id_protected[13]] = Float.valueOf(id_package[75]);
            objectArray[rrvX.id_protected[14]] = Float.valueOf(id_package[76]);
            objectArray[rrvX.id_protected[15]] = Float.valueOf(id_package[77]);
            objectArray[rrvX.id_protected[16]] = Float.valueOf(id_package[78]);
            objectArray[rrvX.id_protected[17]] = id_int[55];
            objectArray[rrvX.id_protected[18]] = id_int[56];
            objectArray[rrvX.id_protected[19]] = id_int[57];
        }
    }

    private void id_this() {
        this.S();
        try {
            String string = ((Qj_1)rrvX.id_import.id_class[id_volatile[59]]).id_class().trim();
            if (string.startsWith(id_native[7])) {
                string = string.substring(id_int[44]);
            }
            int n = (int)Long.parseLong(string, id_protected[9]);
            if (!((rrtH_2)this.id_class[id_volatile[60]]).id_synchronized().id_class().get().booleanValue()) {
                n |= id_byte[3];
            } else if ((n & id_byte[4]) == 0) {
                n |= id_byte[5];
            }
            this.id_class(n, id_int[45], id_int[46], id_int[47]);
            ((rruu_1)this.id_class[id_volatile[61]]).id_class(rrum_1.id_class(id_native[8], id_package[54]));
        }
        catch (Exception exception) {
            ((rruu_1)this.id_class[id_volatile[62]]).id_class(rrum_1.id_class(id_native[9], id_package[55]));
        }
    }

    private void x() {
        this.S();
        Boolean bl = id_int[30];
        this.id_class[rrvX.id_volatile[42]] = bl;
        Boolean bl2 = id_int[31];
        this.id_class[rrvX.id_volatile[43]] = bl2;
        Boolean bl3 = id_int[32];
        this.id_class[rrvX.id_volatile[44]] = bl3;
    }

    private static void h() {
        Object[] objectArray = new Object[]{new rqO_2("minecraft", id_native[12]), 60};
        id_break = objectArray;
    }

    private boolean d() {
        this.S();
        return ((rrtH_2)this.id_class[id_volatile[41]]).id_synchronized().id_class().get();
    }

    public void id_class(float f) {
        this.S();
        Float f2 = Float.valueOf(f);
        this.id_class[rrvX.id_volatile[66]] = f2;
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        this.id_interface().id_class(ml_1, () -> this.id_class(ml_1, rrtu_32, n, n2, id_int[48], bl), rrtu_32, n, n2, bl);
    }

    private static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6, int n) {
        int n2 = ColorHelper.id_break((int)((Integer)rrZI.id_break[id_volatile[33]]), n);
        rrfD_2.id_class(ml_1, f - f6, f2 - f6, f3 + f6 * id_package[29], f4 + f6 * id_package[30], f5, id_package[31], id_package[32], n2, n2, n2, n2);
    }

    private void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl, boolean bl2) {
        this.S();
        RenderSystem.disableBlend();
        RenderSystem.disableAlphaTest();
        double d = this.id_long();
        int n3 = (int)(id_final[0] * d);
        this.id_class(ml_1, n3);
        this.id_class(ml_1, n3, bl2);
        if (!bl2) {
            this.id_class(ml_1, n, n2, n3);
            this.id_break(ml_1, n, n3);
            if (this.d()) {
                this.id_class(ml_1, n, n3);
            }
        }
        RenderSystem.enableBlend();
        RenderSystem.enableAlphaTest();
        ((rruL)this.id_class[id_volatile[10]]).id_class(ml_1, rrtu_32, n, n2, bl, bl2);
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl, boolean bl2) {
        this.S();
        super.id_class(rrtu_32, n, n2, n3, bl, bl2);
        if (this.id_class().id_break(n, n2)) {
            if (n3 == 0) {
                Boolean bl3 = id_int[16];
                this.id_class[rrvX.id_volatile[34]] = bl3;
                return id_int[17];
            }
            if (n3 == id_protected[5]) {
                this.id_class(((rrtH_2)this.id_class[id_volatile[35]]).id_synchronized().id_finally(), id_int[18], id_int[19], id_int[20]);
                return id_int[21];
            }
        } else if (this.id_finally().id_break(n, n2)) {
            if (n3 == 0) {
                Boolean bl4 = id_int[22];
                this.id_class[rrvX.id_volatile[36]] = bl4;
                return id_int[23];
            }
        } else if (this.d() && this.id_volatile().id_break(n, n2) && n3 == 0) {
            Boolean bl5 = id_int[24];
            this.id_class[rrvX.id_volatile[37]] = bl5;
            return id_int[25];
        }
        return ((rruL)this.id_class[id_volatile[38]]).id_class(rrtu_32, n, n2, n3, bl);
    }

    @Override
    public void id_class(int n, int n2, int n3) {
        super.id_class(n, n2, n3);
        this.x();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x57A3B9B8;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBC8DD2A90654A8ABL;
    }

    public rruv_1 id_class() {
        float f = this.id_default();
        float f2 = this.id_abstract();
        float f3 = this.id_implements();
        return new rruv_1(f + id_package[33], f2 + id_package[34], f3 - id_package[35], id_package[36]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{31, -27, 117, -98, 77, -20, -12, 62}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_class(Ml_1 ml_1, int n, int n2) {
        this.S();
        rruv_1 rruv_12 = this.id_volatile();
        float f = rruv_12.id_break();
        float f2 = rruv_12.id_protected();
        float f3 = rruv_12.id_byte();
        float f4 = rruv_12.id_class();
        int n3 = Color.HSBtoRGB(((Float)this.id_class[id_volatile[27]]).floatValue(), ((Float)this.id_class[id_volatile[28]]).floatValue(), ((Float)this.id_class[id_volatile[29]]).floatValue());
        if (((Boolean)this.id_class[id_volatile[30]]).booleanValue()) {
            int n4 = rfU_2.id_class(n, (int)f, (int)(f + f3));
            Float f5 = Float.valueOf(((float)n4 - f) / f3);
            this.id_class[rrvX.id_volatile[31]] = f5;
            this.id_class(n3, id_int[12], id_int[13], id_int[14]);
        }
        float f6 = id_package[14];
        rrfD_2.id_break(ml_1, f + id_package[15], f2 + id_package[16], f3 - id_package[17], f4 - id_package[18], f6, f6, f6, f6, ColorHelper.id_break(id_int[15], n2), ColorHelper.id_break(id_byte[2], n2), ColorHelper.id_break((int)id_protected[3], n2), ColorHelper.id_break((int)id_protected[4], n2));
        rrvX.id_class(ml_1, f, f2, f3, f4, id_package[19], id_package[20], n2);
        rrfD_2.id_class(ml_1, (double)rfU_2.id_class(f + ((Float)this.id_class[id_volatile[32]]).floatValue() * f3, f + id_package[21], f + f3 - id_package[22]), (double)(f2 + f4 / id_package[23]), id_package[24], ColorHelper.id_break(rrZF.d_, n2), this.id_long());
    }

    private void id_class(int n, boolean bl, boolean bl2, boolean bl3) {
        this.S();
        this.id_break(n, bl, bl2, bl3);
        int n2 = Math.max(id_int[35], n >> id_protected[7] & id_volatile[49]);
        int n3 = Math.max(id_int[36], n >> id_protected[8] & id_volatile[50]);
        int n4 = Math.max(id_int[37], n & id_volatile[51]);
        ((rrtH_2)this.id_class[id_volatile[52]]).id_synchronized().id_class(ColorHelper.id_class(n2, n3, n4, (int)(((Float)this.id_class[id_volatile[53]]).floatValue() * id_package[51])), id_int[38], id_int[39]);
    }

    private void id_class(Ml_1 ml_1, int n) {
        float f = this.id_default();
        float f2 = this.id_abstract();
        float f3 = this.id_implements();
        float f4 = this.id_double();
        rrfD_2.id_class(ml_1, f, f2, f3, f4, id_package[25], id_package[26], id_package[27], id_package[28], ColorHelper.id_break(rrZF.n_, n));
    }

    private void id_class(Ml_1 ml_1, int n, boolean bl) {
    }

    private void id_class(Ml_1 ml_1, int n, int n2, int n3) {
        this.S();
        rruv_1 rruv_12 = this.id_class();
        float f = rruv_12.id_break();
        float f2 = rruv_12.id_protected();
        float f3 = rruv_12.id_byte();
        float f4 = rruv_12.id_class();
        if (((Boolean)this.id_class[id_volatile[11]]).booleanValue()) {
            int n4 = rfU_2.id_class(n, (int)f, (int)(f + f3));
            int n5 = rfU_2.id_class(n2, (int)f2 + id_int[5], (int)(f2 + f4));
            Float f5 = Float.valueOf(((float)n4 - f) / f3);
            this.id_class[rrvX.id_volatile[12]] = f5;
            Float f6 = Float.valueOf(id_package[0] - ((float)n5 - f2) / f4);
            this.id_class[rrvX.id_volatile[13]] = f6;
            this.id_class(Color.HSBtoRGB(((Float)this.id_class[id_volatile[14]]).floatValue(), ((Float)this.id_class[id_volatile[15]]).floatValue(), ((Float)this.id_class[id_volatile[16]]).floatValue()), id_int[6], id_int[7], id_int[8]);
        }
        float f7 = id_package[1];
        rrvX.id_class(ml_1, f, f2, f3, f4, f7 + id_package[2], id_package[3], n3);
        rrfD_2.id_break(ml_1, f, f2, f3, f4, f7, f7, f7, f7, ColorHelper.id_break((int)id_protected[1], n3), ColorHelper.id_break(id_byte[0], n3), ColorHelper.id_break(Color.HSBtoRGB(((Float)this.id_class[id_volatile[17]]).floatValue(), id_package[4], id_package[5]), n3), ColorHelper.id_break(id_byte[1], n3));
        rrfD_2.id_class(ml_1, (double)(f + ((Float)this.id_class[id_volatile[18]]).floatValue() * f3), (double)(f2 + (id_package[6] - ((Float)this.id_class[id_volatile[19]]).floatValue()) * f4), id_package[7], ColorHelper.id_break(rrZF.d_, n3), this.id_long());
    }

    @Override
    public void id_class(Ml_1 ml_1, float f) {
        this.S();
        float f2 = id_package[49] - f;
        ml_1.id_class((double)(f2 * ((Float)this.id_class[id_volatile[39]]).floatValue()), (double)(f2 * ((Float)this.id_class[id_volatile[40]]).floatValue()), id_final[1]);
        ml_1.id_class(f, f, f);
    }

    private static void m() {
        id_byte = new int[]{0x18000000, 0x18000000, -16777216, -16777216, -16777216, -16777216};
    }

    private static void v() {
        double[] dArray = new double[2];
        dArray[0] = 255.0;
        id_final = dArray;
    }

    private static void u() {
        boolean[] blArray = new boolean[59];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[20] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[26] = true;
        blArray[34] = true;
        blArray[35] = true;
        blArray[36] = true;
        blArray[37] = true;
        blArray[39] = true;
        blArray[40] = true;
        blArray[42] = true;
        blArray[44] = true;
        blArray[45] = true;
        blArray[46] = true;
        blArray[47] = true;
        blArray[51] = true;
        blArray[52] = true;
        blArray[53] = true;
        blArray[58] = true;
        id_int = blArray;
    }

    @Override
    public void id_break(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl, boolean bl2) {
        super.id_break(rrtu_32, n, n2, n3, bl, bl2);
        this.id_int();
    }

    public void id_break(float f) {
        this.S();
        Float f2 = Float.valueOf(f);
        this.id_class[rrvX.id_volatile[67]] = f2;
    }

    private void id_break(Ml_1 ml_1, int n, int n2) {
        this.S();
        rruv_1 rruv_12 = this.id_finally();
        float f = rruv_12.id_break();
        float f2 = rruv_12.id_protected();
        float f3 = rruv_12.id_byte();
        float f4 = rruv_12.id_class();
        if (((Boolean)this.id_class[id_volatile[20]]).booleanValue()) {
            int n3 = rfU_2.id_class(n, (int)f, (int)(f + f3));
            Float f5 = Float.valueOf(((float)n3 - f) / f3);
            this.id_class[rrvX.id_volatile[21]] = f5;
            this.id_class(Color.HSBtoRGB(((Float)this.id_class[id_volatile[22]]).floatValue(), ((Float)this.id_class[id_volatile[23]]).floatValue(), ((Float)this.id_class[id_volatile[24]]).floatValue()), id_int[9], id_int[10], id_int[11]);
        }
        rrfD_2.id_class(ml_1, (rqO_2)id_break[id_volatile[25]], f, f2, f3, f4, ColorHelper.id_break((int)id_protected[2], n2));
        rrvX.id_class(ml_1, f, f2, f3, f4, id_package[8], id_package[9], n2);
        rrfD_2.id_class(ml_1, (double)rfU_2.id_class(f + ((Float)this.id_class[id_volatile[26]]).floatValue() * f3, f + id_package[10], f + f3 - id_package[11]), (double)(f2 + f4 / id_package[12]), id_package[13], ColorHelper.id_break(rrZF.d_, n2), this.id_long());
    }

    private void id_break(int n, boolean bl, boolean bl2, boolean bl3) {
        this.S();
        if (bl) {
            Float f = Float.valueOf(ColorHelper.id_class(n)[id_int[33]]);
            this.id_class[rrvX.id_volatile[45]] = f;
        }
        if (bl2) {
            Float f = Float.valueOf(ColorHelper.id_class(n)[id_int[34]]);
            this.id_class[rrvX.id_volatile[46]] = f;
            Float f2 = Float.valueOf(ColorHelper.id_class(n)[id_protected[6]]);
            this.id_class[rrvX.id_volatile[47]] = f2;
        }
        if (bl3) {
            Float f = Float.valueOf((float)ColorHelper.id_throws(n) / id_package[50]);
            this.id_class[rrvX.id_volatile[48]] = f;
        }
    }

    public float id_break() {
        this.S();
        return ((Float)this.id_class[id_volatile[63]]).floatValue();
    }

    private static /* synthetic */ void ntfClinit() {
        rrvX.u();
        rrvX.F();
        rrvX.X();
        rrvX.v();
        rrvX.G();
        rrvX.id_else();
        rrvX.m();
        rrvX.h();
    }

    private void W() {
        this.S();
        try {
            String string;
            int n = (Integer)((rrtH_2)this.id_class[id_volatile[54]]).id_synchronized().id_byte();
            if (this.d() && ColorHelper.id_throws(n) < id_volatile[55]) {
                Object[] objectArray = new Object[id_int[40]];
                objectArray[rrvX.id_int[41]] = n;
                string = String.format(id_native[3], objectArray);
            } else {
                Object[] objectArray = new Object[id_int[42]];
                objectArray[rrvX.id_int[43]] = n;
                string = String.format(id_native[4], objectArray);
            }
            ((Qj_1)rrvX.id_import.id_class[id_volatile[56]]).id_class(string);
            ((rruu_1)this.id_class[id_volatile[57]]).id_class(rrum_1.id_class(id_native[5], id_package[52]));
        }
        catch (Exception exception) {
            ((rruu_1)this.id_class[id_volatile[58]]).id_class(rrum_1.id_class(id_native[6], id_package[53]));
        }
    }

    public rruv_1 id_finally() {
        float f = this.id_default();
        float f2 = this.id_abstract();
        float f3 = this.id_implements();
        return new rruv_1(f + id_package[37], f2 + id_package[38] + id_package[39] + id_package[40], f3 - id_package[41], id_package[42]);
    }

    @Override
    public String id_catch() {
        return id_native[2];
    }

    private static void G() {
        float[] fArray = new float[79];
        fArray[0] = 1.0f;
        fArray[1] = 4.0f;
        fArray[2] = 1.0f;
        fArray[3] = 2.0f;
        fArray[4] = 1.0f;
        fArray[5] = 1.0f;
        fArray[6] = 1.0f;
        fArray[7] = 5.0f;
        fArray[8] = 2.0f;
        fArray[9] = 0.5f;
        fArray[10] = 2.0f;
        fArray[11] = 2.0f;
        fArray[12] = 2.0f;
        fArray[13] = 8.0f;
        fArray[14] = 1.0f;
        fArray[15] = 1.0f;
        fArray[16] = 1.0f;
        fArray[17] = 2.0f;
        fArray[18] = 2.0f;
        fArray[19] = 2.0f;
        fArray[20] = 0.5f;
        fArray[21] = 2.0f;
        fArray[22] = 2.0f;
        fArray[23] = 2.0f;
        fArray[24] = 8.0f;
        fArray[25] = 8.0f;
        fArray[26] = 8.0f;
        fArray[27] = 8.0f;
        fArray[28] = 8.0f;
        fArray[29] = 2.0f;
        fArray[30] = 2.0f;
        fArray[31] = 1.0f;
        fArray[32] = 1.0f;
        fArray[33] = 5.0f;
        fArray[34] = 5.0f;
        fArray[35] = 10.0f;
        fArray[36] = 60.0f;
        fArray[37] = 5.0f;
        fArray[38] = 5.0f;
        fArray[39] = 60.0f;
        fArray[40] = 8.0f;
        fArray[41] = 10.0f;
        fArray[42] = 5.0f;
        fArray[43] = 5.0f;
        fArray[44] = 5.0f;
        fArray[45] = 60.0f;
        fArray[46] = 22.0f;
        fArray[47] = 10.0f;
        fArray[48] = 5.0f;
        fArray[49] = 1.0f;
        fArray[50] = 255.0f;
        fArray[51] = 255.0f;
        fArray[52] = 1.0f;
        fArray[53] = 1.0f;
        fArray[54] = 1.0f;
        fArray[55] = 1.0f;
        fArray[57] = 3.5f;
        fArray[58] = 40.0f;
        fArray[59] = 10.0f;
        fArray[60] = 60.5f;
        fArray[61] = 15.0f;
        fArray[63] = 3.5f;
        fArray[64] = 50.5f;
        fArray[65] = 10.0f;
        fArray[66] = 5.0f;
        fArray[67] = 15.0f;
        fArray[68] = 60.0f;
        fArray[69] = 55.0f;
        fArray[70] = 41.0f;
        fArray[72] = 105.5f;
        id_package = fArray;
    }

    @Override
    public boolean id_extends() {
        return id_int[29];
    }

    private static void id_else() {
        id_protected = new byte[]{2, -1, -1, -1, -1, 2, 2, 16, 8, 16, 13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 60};
    }

    @Override
    public boolean id_new() {
        return id_int[28];
    }

    public float id_package() {
        this.S();
        return ((Float)this.id_class[id_volatile[65]]).floatValue();
    }

    private void id_super() {
        this.S();
        rruF[] rruFArray = new rruF[id_protected[0]];
        rruu_1 rruu_12 = ((rrup_1)((rrup_1)new rrup_1(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_volatile[6]]).id_class(), () -> id_native[11], () -> new rjK_2(this.id_default() + id_package[66], this.id_abstract() + this.id_double() - id_package[67]), () -> new rjK_2(id_package[64], id_package[65]), () -> new rjK_2(id_package[62], id_package[63]), () -> rrZF.k_, () -> new rji_3(((Integer)rrZI.id_break[id_volatile[72]]).intValue(), ((Integer)rrZI.id_break[id_volatile[73]]).intValue(), ((Integer)rrZI.id_break[id_volatile[74]]).intValue(), ((Integer)rrZI.id_break[id_volatile[75]]).intValue())).id_break(() -> id_int[50])).id_class(this::id_long)).id_super();
        this.id_class[rrvX.id_volatile[7]] = rruu_12;
        rruFArray[rrvX.id_int[3]] = new rruF(rruu_12).id_class(this::W);
        rruu_1 rruu_13 = ((rrup_1)((rrup_1)new rrup_1(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_volatile[8]]).id_class(), () -> id_native[10], () -> new rjK_2(this.id_default() + id_package[60], this.id_abstract() + this.id_double() - id_package[61]), () -> new rjK_2(id_package[58], id_package[59]), () -> new rjK_2(id_package[56], id_package[57]), () -> rrZF.k_, () -> new rji_3(((Integer)rrZI.id_break[id_volatile[68]]).intValue(), ((Integer)rrZI.id_break[id_volatile[69]]).intValue(), ((Integer)rrZI.id_break[id_volatile[70]]).intValue(), ((Integer)rrZI.id_break[id_volatile[71]]).intValue())).id_break(() -> id_int[49])).id_class(this::id_long)).id_super();
        this.id_class[rrvX.id_volatile[9]] = rruu_13;
        rruFArray[rrvX.id_int[4]] = new rruF(rruu_13).id_class(this::id_this);
        ((rruL)this.id_class[id_volatile[5]]).id_class(rruFArray);
    }

    @Override
    public boolean id_protected() {
        return id_int[26];
    }

    @Override
    public void id_private() {
        super.id_private();
        this.id_int();
    }

    @Override
    public boolean id_final() {
        return id_int[27];
    }

    public rruv_1 id_volatile() {
        float f = this.id_default();
        float f2 = this.id_abstract();
        float f3 = this.id_implements();
        return new rruv_1(f + id_package[43], f2 + id_package[44] + id_package[45] + id_package[46], f3 - id_package[47], id_package[48]);
    }

    public float id_native() {
        this.S();
        return ((Float)this.id_class[id_volatile[64]]).floatValue();
    }

    private static void X() {
        short[] sArray = new short[76];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[2] = 3;
        sArray[5] = 1;
        sArray[7] = 11;
        sArray[9] = 12;
        sArray[10] = 1;
        sArray[11] = 8;
        sArray[12] = 5;
        sArray[13] = 6;
        sArray[14] = 4;
        sArray[15] = 5;
        sArray[16] = 6;
        sArray[17] = 4;
        sArray[18] = 5;
        sArray[19] = 6;
        sArray[20] = 9;
        sArray[21] = 4;
        sArray[22] = 4;
        sArray[23] = 5;
        sArray[24] = 6;
        sArray[26] = 4;
        sArray[27] = 4;
        sArray[28] = 5;
        sArray[29] = 6;
        sArray[30] = 10;
        sArray[31] = 7;
        sArray[32] = 7;
        sArray[33] = 4;
        sArray[34] = 8;
        sArray[36] = 9;
        sArray[37] = 10;
        sArray[38] = 1;
        sArray[39] = 2;
        sArray[40] = 3;
        sArray[42] = 8;
        sArray[43] = 9;
        sArray[44] = 10;
        sArray[45] = 4;
        sArray[46] = 5;
        sArray[47] = 6;
        sArray[48] = 7;
        sArray[49] = 255;
        sArray[50] = 255;
        sArray[51] = 255;
        sArray[53] = 7;
        sArray[55] = 255;
        sArray[56] = 23;
        sArray[57] = 11;
        sArray[58] = 11;
        sArray[59] = 23;
        sArray[61] = 12;
        sArray[62] = 12;
        sArray[63] = 7;
        sArray[64] = 2;
        sArray[65] = 3;
        sArray[66] = 2;
        sArray[67] = 3;
        sArray[68] = 4;
        sArray[69] = 4;
        sArray[70] = 4;
        sArray[71] = 4;
        sArray[72] = 4;
        sArray[73] = 4;
        sArray[74] = 4;
        sArray[75] = 4;
        id_volatile = sArray;
    }
}

