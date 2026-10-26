/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BG;
import celestial.LF;
import celestial.Ml_1;
import celestial.Qw_1;
import celestial.ch_3;
import celestial.cm_3;
import celestial.manager.FontManager;
import celestial.rVi_1;
import celestial.rfU_2;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgp_3;
import celestial.rgy_3;
import celestial.rqR_2;
import celestial.rrZO;
import celestial.rrbb_3;
import celestial.rrnE_2;
import celestial.rruN;
import celestial.rruQ;
import celestial.rruc_1;
import celestial.rruv_1;
import celestial.rruz_1;
import celestial.rrvA;
import celestial.rrvC;
import celestial.rrvk_1;
import celestial.rrvn_1;
import celestial.util.ColorHelper;
import celestial.vB_2;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvL
extends vB_2 {
    private static double[] id_private;
    public Object[] id_catch;
    private static String[] id_implements;
    private static boolean[] id_finally;
    private static short[] id_else;
    private static byte[] id_synchronized;
    private static int[] id_return;
    private static float[] id_public;

    private static void id_char() {
        id_private = new double[]{2.0};
    }

    private static void id_int() {
        id_synchronized = new byte[]{24, 50, 50, 50, -1, 2, 2, 6, 2, 2, 3, 5, 2, 50, 100, 5, 102, 2, 22, 100, 20};
    }

    public rrvL() {
        ArrayList arrayList;
        this.id_native();
        this.id_catch[rrvL.id_else[0]] = arrayList = new ArrayList();
    }

    public rrvL(boolean bl) {
        super(bl);
        ArrayList arrayList;
        this.id_native();
        this.id_catch[rrvL.id_else[1]] = arrayList = new ArrayList();
    }

    static {
        rrvL.ntfClinit();
    }

    private static void id_interface() {
        float[] fArray = new float[19];
        fArray[0] = 1000.0f;
        fArray[1] = 1.0f;
        fArray[2] = 1.0f;
        fArray[4] = 1.0f;
        fArray[5] = 1.0f;
        fArray[6] = 255.0f;
        fArray[7] = 170.0f;
        fArray[8] = 0.7f;
        fArray[9] = 255.0f;
        fArray[10] = 2.0f;
        fArray[11] = 4.0f;
        fArray[12] = 6.0f;
        fArray[13] = 1.0f;
        fArray[14] = 4.0f;
        fArray[15] = 2.0f;
        fArray[16] = 2.0f;
        fArray[17] = 1.0f;
        fArray[18] = 3.0f;
        id_public = fArray;
    }

    private rgF_2 id_class(rruN rruN2) {
        return switch (((int[])rrvA.id_class[id_else[17]])[rruN2.ordinal()]) {
            default -> throw new IncompatibleClassChangeError();
            case 1 -> rgF_2.GREEN;
            case 2 -> rgF_2.RED;
            case 3 -> rgF_2.YELLOW;
            case 4 -> rgF_2.GOLD;
            case 5 -> rgF_2.AQUA;
        };
    }

    private static /* synthetic */ void id_class(BG bG, LF lF) {
        URI uRI = URI.create(bG.id_class());
        rrbb_3.id_class(uRI);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEF17462E03818F90L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-60, 91, -109, 12, -56, -15, 1, -52}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        List<rrvC> list;
        boolean bl;
        this.id_native();
        super.id_class(ml_1, n, n2, f);
        float f2 = this.id_throws ? (float)(rqR_2.id_break() - this.id_case) / id_public[0] : id_public[1];
        float f3 = this.id_throws ? rfU_2.id_class(f2 - id_public[2], id_public[3], id_public[4]) : id_public[5];
        int n3 = rfU_2.id_case(f3 * id_public[6]) << id_synchronized[0];
        if ((n3 & id_return[0]) == 0) {
            return;
        }
        int n4 = ColorHelper.id_class((int)id_synchronized[1], (int)id_synchronized[2], (int)id_synchronized[3], (int)(id_public[7] * f3));
        int n5 = ColorHelper.id_class(n4, id_public[8]);
        int n6 = ColorHelper.id_break((int)id_synchronized[4], (int)(id_public[9] * f3));
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_else[2]]).id_class();
        int n7 = rrZO2.id_class();
        rruz_1 rruz_12 = null;
        int n8 = id_finally[0];
        boolean bl2 = bl = ((Qw_1)rrvL.id_import.id_class[rrvL.id_else[3]]).rs != id_synchronized[5] ? id_finally[1] : id_finally[2];
        if (bl) {
            rrnE_2.id_class(id_private[0]);
        }
        for (rrvn_1 rrvn_12 : (List)this.id_catch[id_else[4]]) {
            list = rrvn_12.id_class();
            rruz_1 rruz_13 = rrvn_12.id_break();
            if (!rruz_13.equals(rruz_12)) {
                if (rruz_12 != null) {
                    n8 += 10;
                }
                rruz_12 = rruz_13;
                Object object = new rgN_2(id_implements[0]).id_class(rgF_2.YELLOW).id_class(new rgN_2(id_implements[1]).id_class(rgF_2.GRAY)).id_class(new rgN_2(rruz_13.id_class()).id_class(rgF_2.WHITE)).id_class(new rgN_2(id_implements[2]).id_class(rgF_2.GRAY)).id_class(new rgN_2(rruz_13.id_break())).id_class(new rgN_2(id_implements[3]).id_class(rgF_2.GRAY));
                if (!id_implements[4].equals(rruz_12.id_class())) {
                    object = object.id_class(rgF_2.STRIKETHROUGH);
                }
                float f4 = id_public[10];
                float f5 = id_synchronized[6] + n8;
                float f6 = id_public[11] + rrZO2.id_break(object.getString());
                float f7 = f5 + (float)n7 + id_public[12];
                ch_3.id_class(ml_1, f4, f5, f6, f7, n4);
                rrZO2.id_class(ml_1, (rgP_2)object, (double)(f4 + id_public[13]), (double)(f5 + id_public[14]), n6, (int)id_else[5]);
                n8 += n7 + id_synchronized[7];
            }
            for (rrvC rrvC2 : list) {
                rruQ rruQ2 = rrvC2.id_break();
                rVi_1 rVi_12 = rruQ2.id_break();
                rVi_1 rVi_13 = new rgN_2(this.id_break(rruQ2.id_byte())).id_class(this.id_class(rruQ2.id_byte()));
                rVi_1 rVi_14 = rruQ2.id_class().id_case().id_class(rgF_2.WHITE);
                rVi_1 rVi_15 = rVi_13.id_break(id_implements[5]).id_class(rVi_14);
                if (rVi_12 != null && !rVi_12.id_break().isEmpty()) {
                    rVi_1 rVi_16 = new rgN_2(id_implements[6]).id_class(rgF_2.YELLOW);
                    rVi_16.id_class(rVi_16.id_class().id_class(new rgy_3(rgp_3.id_class, rVi_12)));
                    rVi_15 = rVi_15.id_break(id_implements[7]).id_class(rVi_16);
                }
                float f8 = id_synchronized[8] + n8;
                float f9 = id_public[15];
                float f10 = rrZO2.id_break(rVi_15.getString()) + id_public[16];
                float f11 = id_synchronized[9] + n7 + id_synchronized[10];
                rrvC2.id_class(new rruv_1(f9, f8, f10, f11));
                rruv_1 rruv_12 = rrvC2.id_class();
                float f12 = rruv_12.id_break();
                float f13 = rruv_12.id_protected();
                float f14 = rruv_12.id_byte();
                float f15 = rruv_12.id_class();
                ch_3.id_class(ml_1, f12, f13, f12 + f14, f13 + f15, n5);
                rrZO2.id_class(ml_1, rVi_15, (double)(f12 + id_public[17]), (double)(f13 + id_public[18]), n6, (int)id_else[6]);
                n8 += n7 + id_synchronized[11];
            }
        }
        for (rrvn_1 rrvn_12 : (List)this.id_catch[id_else[7]]) {
            list = rrvn_12.id_class();
            boolean bl3 = id_finally[3];
            for (rrvC rrvC3 : list) {
                rruQ rruQ3 = rrvC3.id_break();
                rruv_1 rruv_13 = rrvC3.id_class();
                rVi_1 rVi_17 = rruQ3.id_break();
                if (!rruv_13.id_break(((Integer)rrvk_1.id_class[id_else[8]]).intValue(), ((Integer)rrvk_1.id_class[id_else[9]]).intValue())) continue;
                if (rVi_17 != null && !rVi_17.id_break().isEmpty()) {
                    this.id_break(ml_1, ((cm_3)this.id_volatile.id_class[id_else[10]]).id_break(rVi_17, Math.max(this.id_package / id_synchronized[12] - id_synchronized[13], id_synchronized[14])), (Integer)rrvk_1.id_class[id_else[11]], (Integer)rrvk_1.id_class[id_else[12]] + id_synchronized[15]);
                }
                bl3 = id_finally[4];
                break;
            }
            if (!bl3) continue;
            break;
        }
        if (bl) {
            rrnE_2.id_class(id_const.id_return());
        }
    }

    private String id_break(rruN rruN2) {
        return rruN2.id_class();
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB680138;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvL.id_final();
        rrvL.id_abstract();
        rrvL.id_finally();
        rrvL.id_interface();
        rrvL.id_char();
        rrvL.id_int();
        rrvL.id_package();
    }

    private static void id_finally() {
        short[] sArray = new short[18];
        sArray[3] = 20;
        sArray[5] = 255;
        sArray[6] = 255;
        sArray[9] = 1;
        sArray[10] = 15;
        sArray[12] = 1;
        sArray[16] = 4;
        id_else = sArray;
    }

    private static void id_package() {
        id_return = new int[]{-67108864};
    }

    private static void id_abstract() {
        id_implements = new String[]{new String("Build"), new String(": "), new String(" ("), new String(")"), new String("1.1"), new String(" "), new String("(?)"), new String(" ")};
    }

    private static void id_final() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[4] = true;
        blArray[6] = true;
        id_finally = blArray;
    }

    private void id_native() {
        if (this.id_catch == null) {
            Object[] objectArray = this.id_catch = new Object[id_finally[6]];
        }
    }

    @Override
    public void v_() {
        Object object;
        this.id_native();
        super.v_();
        ((List)this.id_catch[id_else[13]]).clear();
        for (Map.Entry<rruz_1, List<rruQ>> entry : ((rruc_1)((Object)rruc_1.staticFields8976bba2dba834c8b8aad687eeef9d7a[id_else[14]])).id_class().entrySet()) {
            object = entry.getKey();
            List<rruQ> list = entry.getValue();
            ArrayList<rrvC> arrayList = new ArrayList<rrvC>();
            for (rruQ rruQ2 : list) {
                rrvC rrvC2 = new rrvC(rruQ2);
                arrayList.add(rrvC2);
            }
            rrvn_1 rrvn_12 = new rrvn_1((rruz_1)object, arrayList);
            ((List)this.id_catch[id_else[15]]).add(rrvn_12);
        }
        BG[] bGArray = (BG[])BG.staticFieldsd25d445181413210921a2969c1bcd756[id_else[16]];
        for (int i = id_finally[5]; i < bGArray.length; ++i) {
            object = bGArray[i];
            this.id_class(new LF(this.id_package - id_synchronized[16], id_synchronized[17] + id_synchronized[18] * i, id_synchronized[19], id_synchronized[20], ((BG)((Object)object)).id_break(), arg_0 -> rrvL.id_class((BG)((Object)object), arg_0)));
        }
    }
}

