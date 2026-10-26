/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FP;
import celestial.Ml_1;
import celestial.lD_2;
import celestial.manager.FontManager;
import celestial.module.render.Hud;
import celestial.rdy_3;
import celestial.rqR_2;
import celestial.rrAM;
import celestial.rrFB;
import celestial.rrFP;
import celestial.rrFr_1;
import celestial.rrHv_1;
import celestial.rrQX;
import celestial.rrTZ;
import celestial.rrTm_1;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.rrtu_3;
import celestial.rrvj_1;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvi_1
extends rrvj_1
implements rrTZ {
    private static long[] id_native;
    private static float[] id_volatile;
    public Object[] id_byte;
    private static int[] id_final;
    private static byte[] id_package;
    private static short[] id_int;
    private static boolean[] id_new;
    private static String[] id_continue;
    public static Object[] id_protected;

    public rrvi_1() {
        super(id_continue[0], () -> Float.valueOf(id_volatile[54]), () -> Float.valueOf(id_volatile[53]));
        ArrayList arrayList;
        this.d();
        this.id_byte[rrvi_1.id_int[0]] = arrayList = new ArrayList();
        AnimValue animValue = new AnimValue(id_volatile[0], id_new[0]).id_package();
        this.id_byte[rrvi_1.id_int[1]] = animValue;
        AnimValue animValue2 = new AnimValue(id_volatile[1], id_new[1]).id_package();
        this.id_byte[rrvi_1.id_int[2]] = animValue2;
        Boolean bl = id_new[2];
        this.id_byte[rrvi_1.id_int[3]] = bl;
        Boolean bl2 = id_new[3];
        this.id_byte[rrvi_1.id_int[4]] = bl2;
        ((rrTm_1)((Object)rrTm_1.staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[id_int[5]])).id_break(this);
        for (rrHv_1 rrHv_12 : ((rrTm_1)((Object)rrTm_1.staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[id_int[6]])).id_break()) {
            ((List)this.id_byte[id_int[7]]).add(new rrFP(rrHv_12));
        }
        ((List)this.id_byte[id_int[8]]).add(new rrFB(this, rdy_3.OW, id_continue[1]));
        ((List)this.id_byte[id_int[9]]).add(new rrFB(this, rdy_3.Jd, id_continue[2]));
        ((List)this.id_byte[id_int[10]]).add(new rrFB(this, rdy_3.JT, id_continue[3]));
        ((List)this.id_byte[id_int[11]]).add(new rrFB(this, rdy_3.XY, id_continue[4]));
        ((List)this.id_byte[id_int[12]]).add(new rrFB(this, rdy_3.ko, id_continue[5]));
        ((List)this.id_byte[id_int[13]]).add(new rrFB(this, rdy_3.xa, id_continue[6]));
    }

    static {
        rrvi_1.ntfClinit();
    }

    private static boolean B() {
        Hud hud = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_int[54]]).id_private().w();
        return hud.aJ_() && hud.id_else() ? id_new[29] : id_new[30];
    }

    private static void J() {
        float[] fArray = new float[72];
        fArray[0] = 0.5f;
        fArray[1] = 0.5f;
        fArray[4] = 0.001f;
        fArray[5] = 4.0f;
        fArray[6] = 150.0f;
        fArray[8] = 4.0f;
        fArray[10] = 15.0f;
        fArray[11] = 0.001f;
        fArray[12] = 4.0f;
        fArray[16] = 0.001f;
        fArray[17] = 4.0f;
        fArray[18] = 150.0f;
        fArray[20] = 4.0f;
        fArray[23] = 10.0f;
        fArray[24] = 5.0f;
        fArray[26] = 1.0f;
        fArray[28] = 225.0f;
        fArray[29] = 255.0f;
        fArray[30] = 1.5f;
        fArray[31] = 1.0f;
        fArray[32] = 0.5f;
        fArray[35] = 8.0f;
        fArray[36] = 2.0f;
        fArray[37] = 4.0f;
        fArray[38] = 1.0f;
        fArray[39] = 0.7f;
        fArray[40] = 0.5f;
        fArray[41] = 0.5f;
        fArray[42] = 8.0f;
        fArray[43] = 4.5f;
        fArray[44] = 10.0f;
        fArray[45] = 2.0f;
        fArray[46] = 1.0f;
        fArray[47] = 10.0f;
        fArray[49] = 90.0f;
        fArray[50] = 270.0f;
        fArray[51] = 180.0f;
        fArray[52] = 4.0f;
        fArray[57] = 0.5f;
        fArray[58] = 8.0f;
        fArray[59] = 10.0f;
        fArray[60] = 4.0f;
        fArray[61] = 4.0f;
        fArray[62] = 5.0f;
        fArray[63] = 150.0f;
        fArray[64] = 1.5f;
        fArray[65] = 2.5f;
        fArray[66] = 4.5f;
        fArray[67] = 0.5f;
        fArray[68] = 8.0f;
        fArray[69] = 0.7f;
        fArray[70] = 4.0f;
        fArray[71] = 0.001f;
        id_volatile = fArray;
    }

    private static void S() {
        id_continue = new String[]{new String("Item Keybinds"), new String("Q"), new String("W"), new String("E"), new String("R"), new String("T"), new String("Y")};
    }

    public boolean x() {
        return (vm_3)rrvi_1.id_import.id_class[id_int[49]] instanceof FP && !this.h() ? id_new[18] : id_new[19];
    }

    private static void s() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(3.6893488E19f), 0xFFFFFF, Float.valueOf(0.0f), 300L, Float.valueOf(-3.6893488E19f)};
        id_protected = objectArray;
    }

    private boolean h() {
        this.d();
        for (rrFr_1 rrFr_12 : (List)this.id_byte[id_int[50]]) {
            if (rrFr_12.id_byte() || !rrFr_12.id_protected()) continue;
            return id_new[20];
        }
        return id_new[21];
    }

    private void d() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_package[2]];
            objectArray[rrvi_1.id_new[36]] = Float.valueOf(id_volatile[55]);
            objectArray[rrvi_1.id_package[3]] = Float.valueOf(id_volatile[56]);
            objectArray[rrvi_1.id_package[4]] = id_new[37];
            objectArray[rrvi_1.id_package[5]] = id_new[38];
        }
    }

    @Override
    public void id_class(rrHv_1 rrHv_12) {
        rrFr_1 rrFr_12;
        Object object2;
        this.d();
        for (Object object2 : (List)this.id_byte[id_int[55]]) {
            if (!(object2 instanceof rrFP) || (rrHv_1)((rrFP)object2).id_break[id_int[56]] != rrHv_12) continue;
            return;
        }
        int n = id_new[31];
        object2 = ((List)this.id_byte[id_int[57]]).iterator();
        while (object2.hasNext() && !(rrFr_12 = (rrFr_1)object2.next()).id_byte()) {
            ++n;
        }
        ((List)this.id_byte[id_int[58]]).add(n, new rrFP(rrHv_12));
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        this.d();
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_int[14]]).id_private();
        boolean bl2 = rrvi_1.B();
        float f = this.id_long();
        long l = rqR_2.id_break();
        boolean bl3 = this.x();
        if (bl3 && !((Boolean)this.id_byte[id_int[15]]).booleanValue()) {
            for (rrFr_1 rrFr_12 : (List)this.id_byte[id_int[16]]) {
                if (rrFr_12.id_byte()) continue;
                ((AnimValue)rrFr_12.id_class[id_int[17]]).id_class(id_volatile[2]);
                rrFr_12.id_case();
            }
        }
        Boolean bl4 = bl3;
        this.id_byte[rrvi_1.id_int[18]] = bl4;
        this.id_protected(bl2);
        float f2 = this.id_default();
        float f3 = this.id_abstract();
        int n3 = id_new[4];
        int n4 = id_new[5];
        float f4 = id_volatile[3];
        rrZO2.id_class((lD_2)rrfD_2.id_class[id_int[19]]);
        rrfD_2.id_throws((lD_2)rrfD_2.id_class[id_int[20]]);
        for (rrFr_1 rrFr_13 : (List)this.id_byte[id_int[21]]) {
            boolean bl5 = rrFr_13.id_class(bl2);
            boolean bl6 = ((AnimValue)rrFr_13.id_class[id_int[22]]).id_byte() > id_volatile[4] ? id_new[6] : id_new[7];
            rrFr_13.id_class(bl2, l);
            if (!bl5 && !bl6) {
                rrFr_13.id_case();
                continue;
            }
            float f5 = ((Float)rrFr_13.id_class[id_int[23]]).floatValue();
            if (n4 > 0 && f4 + id_volatile[5] + f5 > id_volatile[6]) {
                ++n3;
                n4 = id_new[8];
                f4 = id_volatile[7];
            }
            float f6 = f4 + (n4 > 0 ? id_volatile[8] : id_volatile[9]);
            float f7 = (float)n3 * id_volatile[10];
            rrFr_13.id_class(f6, f7);
            float f8 = rrFr_13.id_catch();
            float f9 = ((AnimValue)rrFr_13.id_class[id_int[24]]).id_byte();
            if (f9 > id_volatile[11]) {
                float f10 = f2 + rrFr_13.id_break();
                float f11 = f3 + rrFr_13.id_private() + rrFr_13.id_class(l);
                this.id_class(ml_1, rrZO2, rrFr_13, f10, f11, f8, f9, f);
            }
            f4 += (n4 > 0 ? id_volatile[12] : id_volatile[13]) + f5;
            ++n4;
        }
        rrfD_2.id_private((lD_2)rrfD_2.id_class[id_int[25]]);
        rrZO2.id_byte((lD_2)rrfD_2.id_class[id_int[26]]);
    }

    private static void id_class(Ml_1 ml_1, float f, float f2, float f3, int n) {
        rrfD_2.id_class(ml_1, f, f2, f3, id_volatile[47], n, ColorHelper.id_class(id_volatile[48], n), ColorHelper.id_class(id_volatile[49], n), ColorHelper.id_class(id_volatile[50], n), ColorHelper.id_class(id_volatile[51], n), id_new[28], id_volatile[52]);
    }

    private void id_class(Ml_1 ml_1, rrZO rrZO2, rrFr_1 rrFr_12, float f, float f2, float f3, float f4, float f5) {
        int n = (int)(id_volatile[28] * f4 * f5);
        int n2 = (int)(id_volatile[29] * f4 * f5);
        rrvi_1.id_class(ml_1, f, f2, f3, n);
        float f6 = f + id_volatile[30];
        float f7 = f2 + id_volatile[31];
        rrfD_2.id_class(ml_1, rrFr_12.id_class(), f6, f7, f4 * f5, id_volatile[32], id_volatile[33], id_volatile[34], id_new[22], id_new[23], !rrFr_12.id_byte() ? id_new[24] : id_new[25]);
        float f8 = f6 + id_volatile[35] + id_volatile[36];
        float f9 = id_volatile[37];
        float f10 = f2 + id_volatile[38];
        float f11 = f10 + f9;
        int n3 = ColorHelper.id_break((int)id_package[1], (int)((float)n2 * id_volatile[39]));
        rrfD_2.id_class(ml_1, (lD_2)rrfD_2.id_class[id_int[51]], f8, f10, id_volatile[40], f9, n3, n3, id_final[0], id_final[1]);
        rrfD_2.id_class(ml_1, (lD_2)rrfD_2.id_class[id_int[52]], f8, f11, id_volatile[41], f9, id_final[2], id_final[3], n3, n3);
        float f12 = f6 + id_volatile[42] + id_volatile[43];
        float f13 = f2 + (id_volatile[44] - (float)rrZO2.id_class()) / id_volatile[45] + id_volatile[46];
        ml_1.id_class();
        rrZO2.id_break(ml_1, (lD_2)rrfD_2.id_class[id_int[53]], rrFr_12.id_implements(), f12, f13, ColorHelper.id_break(rrZF.d_, n2), id_new[26], id_new[27]);
        ml_1.id_break();
    }

    public void id_class(rrAM rrAM2) {
        this.d();
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_int[42]]).id_private();
        boolean bl = rrvi_1.B();
        for (rrFr_1 rrFr_12 : (List)this.id_byte[id_int[43]]) {
            rrFr_12.id_class(rrZO2);
            boolean bl2 = rrFr_12.id_class(bl);
            ((AnimValue)rrFr_12.id_class[id_int[44]]).id_class(bl2 ? id_volatile[26] : id_volatile[27]);
            ((AnimValue)rrFr_12.id_class[id_int[45]]).id_package();
            rrFr_12.id_case();
        }
        ((AnimValue)this.id_byte[id_int[46]]).id_package();
        ((AnimValue)this.id_byte[id_int[47]]).id_package();
        Boolean bl3 = id_new[17];
        this.id_byte[rrvi_1.id_int[48]] = bl3;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4B90E513;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3A97400744A23C1DL;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-51, 60, 87, 76, 75, 92, 74, 5}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrvi_1.id_throw();
        rrvi_1.S();
        rrvi_1.M();
        rrvi_1.G();
        rrvi_1.J();
        rrvi_1.X();
        rrvi_1.id_try();
        rrvi_1.s();
    }

    private static void M() {
        id_native = new long[]{300L};
    }

    private static void G() {
        short[] sArray = new short[63];
        sArray[1] = 3;
        sArray[2] = 4;
        sArray[3] = 5;
        sArray[4] = 6;
        sArray[15] = 6;
        sArray[18] = 6;
        sArray[19] = 7;
        sArray[20] = 8;
        sArray[23] = 5;
        sArray[25] = 8;
        sArray[26] = 7;
        sArray[29] = 5;
        sArray[30] = 5;
        sArray[31] = 4;
        sArray[32] = 3;
        sArray[33] = 5;
        sArray[34] = 4;
        sArray[35] = 3;
        sArray[36] = 4;
        sArray[37] = 1;
        sArray[38] = 3;
        sArray[39] = 2;
        sArray[45] = 1;
        sArray[46] = 3;
        sArray[47] = 4;
        sArray[48] = 5;
        sArray[49] = 73;
        sArray[51] = 8;
        sArray[52] = 8;
        sArray[53] = 7;
        sArray[59] = 1;
        sArray[60] = 2;
        id_int = sArray;
    }

    @Override
    public float id_implements() {
        this.d();
        return ((Float)this.id_byte[id_int[59]]).floatValue();
    }

    @Override
    public void id_instanceof() {
        this.d();
        super.id_instanceof();
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_int[40]]).id_private();
        for (rrFr_1 rrFr_12 : (List)this.id_byte[id_int[41]]) {
            rrFr_12.id_class(rrZO2);
        }
    }

    @Override
    public boolean id_package() {
        this.d();
        if (!rrvi_1.B()) {
            return id_new[32];
        }
        for (rrFr_1 rrFr_12 : (List)this.id_byte[id_int[61]]) {
            if (!rrFr_12.id_protected()) continue;
            return id_new[33];
        }
        return id_new[34];
    }

    private static void id_throw() {
        boolean[] blArray = new boolean[41];
        blArray[6] = true;
        blArray[11] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[18] = true;
        blArray[20] = true;
        blArray[24] = true;
        blArray[29] = true;
        blArray[33] = true;
        blArray[36] = true;
        blArray[40] = true;
        id_new = blArray;
    }

    private static void id_try() {
        id_final = new int[]{0xFFFFFF, 0xFFFFFF, 0xFFFFFF, 0xFFFFFF, 0xFFFFFF};
    }

    private void id_protected(boolean bl) {
        boolean bl2;
        this.d();
        float f = id_volatile[14];
        float f2 = id_volatile[15];
        int n = id_new[9];
        int n2 = id_new[10];
        int n3 = id_package[0];
        for (rrFr_1 rrFr_12 : (List)this.id_byte[id_int[27]]) {
            boolean bl3;
            bl2 = rrFr_12.id_class(bl);
            boolean bl4 = bl3 = ((AnimValue)rrFr_12.id_class[id_int[28]]).id_byte() > id_volatile[16] ? id_new[11] : id_new[12];
            if (!bl2 && !bl3) continue;
            float f3 = ((Float)rrFr_12.id_class[id_int[29]]).floatValue();
            if (n2 > 0 && f2 + id_volatile[17] + f3 > id_volatile[18]) {
                f = Math.max(f, f2);
                ++n;
                n2 = id_new[13];
                f2 = id_volatile[19];
            }
            if (n > n3) {
                n3 = n;
            }
            f2 += (n2 > 0 ? id_volatile[20] : id_volatile[21]) + f3;
            ++n2;
        }
        f = Math.max(f, f2);
        float f4 = Math.max(id_volatile[22], f);
        float f5 = n3 >= 0 ? (float)(n3 + id_new[14]) * id_volatile[23] + (float)n3 * id_volatile[24] : id_volatile[25];
        boolean bl5 = bl2 = n3 >= 0 ? id_new[15] : id_new[16];
        if (bl2 && !((Boolean)this.id_byte[id_int[30]]).booleanValue()) {
            ((AnimValue)this.id_byte[id_int[31]]).id_package();
            ((AnimValue)this.id_byte[id_int[32]]).id_package();
        }
        Boolean bl6 = bl2;
        this.id_byte[rrvi_1.id_int[33]] = bl6;
        ((AnimValue)this.id_byte[id_int[34]]).id_break(f4);
        ((AnimValue)this.id_byte[id_int[35]]).id_break(f5);
        Float f6 = Float.valueOf(((AnimValue)this.id_byte[id_int[36]]).id_byte());
        this.id_byte[rrvi_1.id_int[37]] = f6;
        Float f7 = Float.valueOf(((AnimValue)this.id_byte[id_int[38]]).id_byte());
        this.id_byte[rrvi_1.id_int[39]] = f7;
    }

    @Override
    public boolean id_protected() {
        return id_new[35];
    }

    private static void X() {
        id_package = new byte[]{-1, -1, 7, 2, 5, 6, 17, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
    }

    @Override
    public float ao_() {
        this.d();
        return ((Float)this.id_byte[id_int[60]]).floatValue();
    }

    @Override
    public void at_() {
        super.at_();
        ((rrTm_1)((Object)rrTm_1.staticFields9ecc5a8aa54b3c499a2c916d8fcc4ea4[id_int[62]])).id_class(this);
    }
}

