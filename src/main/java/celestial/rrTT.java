/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.C_class;
import celestial.C_package;
import celestial.C_throws;
import celestial.C_volatile;
import celestial.PJ;
import celestial.PX;
import celestial.Pv_1;
import celestial.V;
import celestial.an_3;
import celestial.cb_3;
import celestial.g_1;
import celestial.j_1;
import celestial.q_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfo_3;
import celestial.rjG_2;
import celestial.rjU_2;
import celestial.rrAO;
import celestial.rrAX;
import celestial.rrAz_1;
import celestial.rrQX;
import celestial.rrTA;
import celestial.rrTI;
import celestial.rrTR;
import celestial.rrTV;
import celestial.rrTg_1;
import celestial.rrTj_1;
import celestial.rrTp_1;
import celestial.rrTq_1;
import celestial.rrTt_1;
import celestial.rrTw_1;
import celestial.rrTy_1;
import celestial.rrfj_3;
import celestial.rrnF_2;
import celestial.t_1;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrTT
extends Pv_1
implements MinecraftAccessor,
C_volatile {
    public static Object[] id_break;
    private static byte[] id_protected;
    private static short[] id_throws;
    private static boolean[] id_case;
    public Object[] id_byte;
    private static float[] id_catch;
    private static double[] id_private;

    @Override
    public PX id_byte() {
        this.id_goto();
        return (PX)this.id_byte[id_throws[114]];
    }

    public rrTj_1 id_int() {
        this.id_goto();
        return (rrTj_1)this.id_byte[id_throws[132]];
    }

    public rrTT(C_class c_class, rrnF_2 rrnF_22) {
        super(c_class);
        this.id_goto();
        Boolean bl = id_case[0];
        this.id_byte[rrTT.id_throws[0]] = bl;
        Integer n = id_protected[0];
        this.id_byte[rrTT.id_throws[1]] = n;
        rrnF_2 rrnF_23 = rrnF_22;
        this.id_byte[rrTT.id_throws[2]] = rrnF_23;
        rrTy_1 rrTy_12 = new rrTy_1(this);
        this.id_byte[rrTT.id_throws[3]] = rrTy_12;
        rrTT rrTT2 = this;
        rrTT.id_break[rrTT.id_throws[4]] = rrTT2;
    }

    public rrTT(rrnF_2 rrnF_22) {
        this(C_throws.id_byte(), rrnF_22);
    }

    static {
        rrTT.ntfClinit();
    }

    public rrnF_2 id_this() {
        this.id_goto();
        return (rrnF_2)this.id_byte[id_throws[126]];
    }

    @Override
    public void id_class(g_1 g_12) {
        this.id_final();
    }

    private Pair<rjU_2, rjU_2> id_class(rrTj_1 rrTj_12, PX pX) {
        this.id_goto();
        if (rrTj_12 instanceof an_3) {
            an_3 an_32 = (an_3)rrTj_12;
            Pair<rrTA, rrTA> pair = ((rrnF_2)this.id_byte[id_throws[35]]).id_class(an_32, pX);
            rrTA rrTA2 = (rrTA)pair.getRight();
            rrTT.id_break[rrTT.id_throws[36]] = rrTA2;
            return Pair.of((Object)((rrTA)pair.getLeft()).rr(), (Object)((rrTA)pair.getRight()).rr());
        }
        if (rrTj_12 instanceof rrTV) {
            rrTV rrTV2 = (rrTV)rrTj_12;
            Pair<rrTA, rrTA> pair = ((rrnF_2)this.id_byte[id_throws[37]]).id_class(rrTV2, pX);
            rrTA rrTA3 = (rrTA)pair.getRight();
            rrTT.id_break[rrTT.id_throws[38]] = rrTA3;
            return Pair.of((Object)((rrTA)pair.getLeft()).rr(), (Object)((rrTA)pair.getRight()).rr());
        }
        if (rrTj_12 instanceof rfH_2) {
            rfH_2 rfH_22 = (rfH_2)rrTj_12;
            rjU_2 rjU_22 = new rjU_2((double)rfH_22.b_() + id_private[0], (double)rfH_22.c_() + id_private[1], (double)rfH_22.d_() + id_private[2]);
            return Pair.of((Object)rjU_22, (Object)rjU_22);
        }
        if (rrTj_12 instanceof rrTR) {
            rrTR rrTR2 = (rrTR)rrTj_12;
            rjU_2 rjU_23 = rrTR2.rr();
            return Pair.of((Object)rjU_23, (Object)rjU_23);
        }
        return Pair.of((Object)rjU_2.id_class, (Object)rjU_2.id_class);
    }

    @Override
    public void id_class(rrAX rrAX2) {
        this.id_goto();
        if ((PX)this.id_byte[id_throws[108]] != null && (rrTj_1)this.id_byte[id_throws[109]] != null) {
            rrAX2.id_class(PJ.id_class((rrTj_1)this.id_byte[id_throws[110]]));
        }
    }

    public void id_class(boolean bl) {
        this.id_goto();
        Boolean bl2 = bl;
        this.id_byte[rrTT.id_throws[137]] = bl2;
    }

    public boolean id_class(rrTR rrTR2) {
        rfo_3 rfo_32;
        this.id_goto();
        if (!((rrnF_2)this.id_byte[id_throws[39]]).aG_()) {
            return id_case[8];
        }
        rjG_2 rjG_22 = (rjG_2)rrTT.id_import.id_class[id_throws[40]];
        return (!(rjG_22 instanceof rfo_3) || (rfo_32 = (rfo_3)rjG_22).id_class() == rrTR2) && !((cb_3)rrTT.id_import.id_class[id_throws[41]]).id_class(rrTR2) ? id_case[9] : id_case[10];
    }

    @Override
    public void id_class(rrAz_1 rrAz_12) {
        this.id_goto();
        if ((PX)this.id_byte[id_throws[83]] != null) {
            rrTq_1 rrTq_12 = ((rrnF_2)this.id_byte[id_throws[84]]).aB_();
            if (rrTq_12 != null) {
                rrAz_12.id_class(rrTq_12.id_break());
                rrAz_12.id_class(rrTq_12.id_class());
            } else {
                rrAz_12.id_class((PX)this.id_byte[id_throws[85]]);
                rrAz_12.id_class(PJ.id_class((PX)this.id_byte[id_throws[86]], rrAz_12.id_protected(), id_case[11]));
            }
        }
    }

    public void id_class(rrTy_1 rrTy_12) {
        this.id_goto();
        rrTy_1 rrTy_13 = rrTy_12;
        this.id_byte[rrTT.id_throws[136]] = rrTy_13;
    }

    @Override
    public /* synthetic */ C_package id_class() {
        return this.id_protected();
    }

    private static float id_class(float f) {
        return Math.abs(rfU_2.id_catch(((PX)PJ.id_class[id_throws[123]]).id_throws() - f));
    }

    @Override
    public void id_class(t_1 t_12) {
        this.id_goto();
        if ((PX)this.id_byte[id_throws[103]] != null) {
            if (((rrnF_2)this.id_byte[id_throws[104]]).id_catch() == (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_throws[105]])) {
                t_12.id_class(id_case[12]);
                return;
            }
            if (!this.id_else()) {
                return;
            }
            t_12.id_class(((rrnF_2)this.id_byte[id_throws[106]]).id_catch() == (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_throws[107]]) ? id_case[13] : id_case[14]);
        }
    }

    public void id_class(rrTj_1 rrTj_12, rrTI rrTI2) {
        float f;
        float f2;
        Object object;
        this.id_goto();
        rrTj_1 rrTj_13 = rrTj_12;
        this.id_byte[rrTT.id_throws[5]] = rrTj_13;
        if (rrTj_12 == null) {
            rrTj_1 rrTj_14 = ((rrnF_2)this.id_byte[id_throws[6]]).aF_();
            if (rrTj_14 == null) {
                return;
            }
            rrTj_12 = rrTj_14;
            rrTj_1 rrTj_15 = rrTj_14;
            this.id_byte[rrTT.id_throws[7]] = rrTj_15;
        }
        ((Set)id_break[id_throws[8]]).add(this);
        if (((Set)id_break[id_throws[9]]).size() > id_case[1]) {
            return;
        }
        rrTT rrTT2 = this;
        rrTT.id_break[rrTT.id_throws[10]] = rrTT2;
        rrTI rrTI3 = rrTI2;
        this.id_byte[rrTT.id_throws[11]] = rrTI3;
        Boolean bl = id_case[2];
        this.id_byte[rrTT.id_throws[12]] = bl;
        Boolean bl2 = id_case[3];
        this.id_byte[rrTT.id_throws[13]] = bl2;
        rrTT rrTT3 = this;
        int n = (Integer)rrTT3.id_byte[id_throws[14]] - id_case[4];
        Integer n2 = n;
        rrTT3.id_byte[rrTT.id_throws[15]] = n2;
        Integer n3 = Math.max(n, id_case[5]);
        this.id_byte[rrTT.id_throws[16]] = n3;
        if (rrTj_12 instanceof rrTg_1) {
            object = (rrTg_1)rrTj_12;
            PX pX = object.getNeedRotation();
            f2 = pX.id_throws();
            f = pX.id_protected();
        } else {
            Pair<rjU_2, rjU_2> pair = this.id_class(rrTj_12, (PX)PJ.id_class[id_throws[17]]);
            rjU_2 rjU_22 = ((cb_3)rrTT.id_import.id_class[id_throws[18]]).id_new(id_catch[0]);
            f2 = ((rrnF_2)this.id_byte[id_throws[19]]).id_class(rjU_22, (rjU_2)pair.getLeft());
            f = ((rrnF_2)this.id_byte[id_throws[20]]).id_break(rjU_22, (rjU_2)pair.getRight());
        }
        if (rrTj_12 instanceof rrTR && this.id_class((rrTR)(object = (rrTR)rrTj_12))) {
            Boolean bl3 = id_case[6];
            this.id_byte[rrTT.id_throws[21]] = bl3;
            if (rrTI2 != (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_throws[22]])) {
                if ((Integer)this.id_byte[id_throws[23]] < id_case[7]) {
                    f2 += id_catch[1];
                }
            } else {
                Integer n4 = id_protected[1];
                this.id_byte[rrTT.id_throws[24]] = n4;
            }
        }
        Float f3 = Float.valueOf(rrTT.id_class(f2));
        this.id_byte[rrTT.id_throws[25]] = f3;
        Float f4 = Float.valueOf(rrTT.id_break(f));
        this.id_byte[rrTT.id_throws[26]] = f4;
        object = ((rrTy_1)this.id_byte[id_throws[27]]).id_class(new PX(f2, f));
        if ((PX)this.id_byte[id_throws[28]] == null) {
            PX pX = (PX)PX.id_class[id_throws[29]];
            this.id_byte[rrTT.id_throws[30]] = pX;
        }
        if (((rrnF_2)this.id_byte[id_throws[31]]).id_class((PX)object)) {
            ((PX)this.id_byte[id_throws[32]]).id_class(((PX)object).id_throws());
        }
        if (((rrnF_2)this.id_byte[id_throws[33]]).id_break((PX)object)) {
            ((PX)this.id_byte[id_throws[34]]).id_byte(((PX)object).id_protected());
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDF1550BDC70492A6L;
    }

    @Override
    public void id_class(j_1 j_12) {
        this.id_goto();
        if (j_12.id_class() == (V)((Object)V.staticFields30e1cd8580ce39faa61be3646b7cc079[id_throws[111]])) {
            ((rrTy_1)this.id_byte[id_throws[112]]).id_break();
            ((Set)id_break[id_throws[113]]).clear();
        }
    }

    public rrTT id_class(rrTw_1 rrTw_12) {
        this.id_goto();
        rrTw_1 rrTw_13 = rrTw_12;
        this.id_byte[rrTT.id_throws[118]] = rrTw_13;
        return this;
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_goto();
        if ((C_volatile)id_break[id_throws[52]] != this) {
            Object var6_2 = null;
            this.id_byte[rrTT.id_throws[53]] = var6_2;
            return;
        }
        if ((PX)this.id_byte[id_throws[54]] == null) {
            return;
        }
        switch (((int[])rrTt_1.id_class[id_throws[55]])[q_12.id_class().ordinal()]) {
            case 1: {
                PX pX = ((cb_3)rrTT.id_import.id_class[id_throws[56]]).rO();
                this.id_byte[rrTT.id_throws[57]] = pX;
                Float f = Float.valueOf(((PX)this.id_byte[id_throws[59]]).id_throws());
                ((cb_3)rrTT.id_import.id_class[rrTT.id_throws[58]]).id_throws[rrTT.id_throws[60]] = f;
                Float f2 = Float.valueOf(((PX)this.id_byte[id_throws[62]]).id_protected());
                ((cb_3)rrTT.id_import.id_class[rrTT.id_throws[61]]).id_throws[rrTT.id_throws[63]] = f2;
                Float f3 = Float.valueOf(rfU_2.id_class(((Float)((cb_3)rrTT.id_import.id_class[rrTT.id_throws[65]]).id_throws[id_throws[66]]).floatValue(), id_catch[2], id_catch[3]));
                ((cb_3)rrTT.id_import.id_class[rrTT.id_throws[64]]).id_throws[rrTT.id_throws[67]] = f3;
                break;
            }
            case 2: {
                if ((PX)this.id_byte[id_throws[68]] != null) {
                    Float f = Float.valueOf(((PX)this.id_byte[id_throws[70]]).id_throws());
                    ((cb_3)rrTT.id_import.id_class[rrTT.id_throws[69]]).id_throws[rrTT.id_throws[71]] = f;
                    Float f4 = Float.valueOf(((PX)this.id_byte[id_throws[73]]).id_protected());
                    ((cb_3)rrTT.id_import.id_class[rrTT.id_throws[72]]).id_throws[rrTT.id_throws[74]] = f4;
                    Float f5 = Float.valueOf(rfU_2.id_class(((Float)((cb_3)rrTT.id_import.id_class[rrTT.id_throws[76]]).id_throws[id_throws[77]]).floatValue(), id_catch[4], id_catch[5]));
                    ((cb_3)rrTT.id_import.id_class[rrTT.id_throws[75]]).id_throws[rrTT.id_throws[78]] = f5;
                    Object var14_10 = null;
                    this.id_byte[rrTT.id_throws[79]] = var14_10;
                }
                if ((rrTj_1)this.id_byte[id_throws[80]] == null) {
                    this.id_final();
                }
                if ((rrTw_1)this.id_byte[id_throws[81]] == null) break;
                ((rrTw_1)this.id_byte[id_throws[82]]).id_class(() -> {
                    this.id_goto();
                    ((rrTw_1)this.id_byte[id_throws[138]]).id_break();
                    Object var5_1 = null;
                    this.id_byte[rrTT.id_throws[139]] = var5_1;
                    Object var6_2 = null;
                    this.id_byte[rrTT.id_throws[140]] = var6_2;
                });
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEF06977;
    }

    @Override
    public void id_class(rrAO rrAO2) {
        this.id_goto();
        if (this.id_else()) {
            return;
        }
        if ((PX)this.id_byte[id_throws[87]] != null) {
            switch (((int[])rrTt_1.id_class[id_throws[88]])[((rrnF_2)this.id_byte[id_throws[89]]).id_catch().ordinal()]) {
                case 1: {
                    rrfj_3.id_class(rrAO2, ((PX)this.id_byte[id_throws[90]]).id_throws(), ((Float)((cb_3)rrTT.id_import.id_class[rrTT.id_throws[91]]).id_break[id_throws[92]]).floatValue());
                    break;
                }
                case 2: {
                    rrTR rrTR2;
                    rrTj_1 rrTj_12 = (rrTj_1)this.id_byte[id_throws[93]];
                    if (rrTj_12 instanceof rrTR && ((cb_3)rrTT.id_import.id_class[id_throws[94]]).id_class(rrTR2 = (rrTR)rrTj_12) && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[95]]).id_private().P().id_super()) {
                        if (rrTR2 instanceof an_3) {
                            rrTj_12 = (an_3)rrTR2;
                            rrfj_3.id_class(rrAO2, (an_3)rrTj_12, ((rrnF_2)this.id_byte[id_throws[96]]).az_(), ((rrnF_2)this.id_byte[id_throws[97]]).aD_(), ((PX)this.id_byte[id_throws[98]]).id_throws());
                            break;
                        }
                        rrfj_3.id_class(rrAO2, rrTR2.rr(), ((PX)this.id_byte[id_throws[99]]).id_throws());
                        break;
                    }
                    rrfj_3.id_class(rrAO2, ((PX)this.id_byte[id_throws[100]]).id_throws(), ((Float)((cb_3)rrTT.id_import.id_class[rrTT.id_throws[101]]).id_break[id_throws[102]]).floatValue());
                }
            }
        }
    }

    @Override
    public rrTj_1 id_break() {
        this.id_goto();
        return (rrTj_1)this.id_byte[id_throws[117]];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-105, 33, -91, 109, -107, 19, 53, -42}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static float id_break(float f) {
        return Math.abs(((PX)PJ.id_class[id_throws[124]]).id_protected() - f);
    }

    public PX id_throws() {
        return Optional.ofNullable(this.id_byte()).orElse(((cb_3)rrTT.id_import.id_class[id_throws[116]]).z());
    }

    private static /* synthetic */ void ntfClinit() {
        rrTT.id_while();
        rrTT.id_public();
        rrTT.id_try();
        rrTT.id_return();
        rrTT.id_instanceof();
        rrTT.id_synchronized();
    }

    public void id_finally() {
    }

    public boolean id_catch() {
        this.id_goto();
        return (Boolean)this.id_byte[id_throws[130]];
    }

    public PX id_extends() {
        this.id_goto();
        return (PX)this.id_byte[id_throws[127]];
    }

    private void id_goto() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[2]];
            objectArray[rrTT.id_protected[3]] = id_case[20];
            objectArray[rrTT.id_protected[4]] = id_case[21];
            objectArray[rrTT.id_protected[5]] = id_case[22];
            objectArray[rrTT.id_protected[6]] = Float.valueOf(id_catch[6]);
            objectArray[rrTT.id_protected[7]] = Float.valueOf(id_catch[7]);
        }
    }

    public rrTw_1 id_case() {
        this.id_goto();
        return (rrTw_1)this.id_byte[id_throws[128]];
    }

    public int id_continue() {
        this.id_goto();
        return (Integer)this.id_byte[id_throws[131]];
    }

    public boolean id_else() {
        this.id_goto();
        if (((cb_3)rrTT.id_import.id_class[id_throws[119]]).PZ() || ((cb_3)rrTT.id_import.id_class[id_throws[120]]).Sy()) {
            return id_case[15];
        }
        return ((rrnF_2)this.id_byte[id_throws[121]]).id_catch() == (rrTp_1)((Object)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[id_throws[122]]) ? id_case[16] : id_case[17];
    }

    public rrTI id_implements() {
        this.id_goto();
        return (rrTI)((Object)this.id_byte[id_throws[133]]);
    }

    private static void id_instanceof() {
        id_protected = new byte[]{-1, 2, 12, 5, 6, 7, 10, 11, 4};
    }

    public Optional<PX> id_new() {
        return Optional.ofNullable((PX)PJ.id_class[id_throws[115]]);
    }

    public boolean id_package() {
        this.id_goto();
        return (Boolean)this.id_byte[id_throws[129]];
    }

    private static void id_return() {
        id_private = new double[]{0.5, 0.5, 0.5};
    }

    public float id_super() {
        this.id_goto();
        return ((Float)this.id_byte[id_throws[135]]).floatValue();
    }

    private static void id_try() {
        float[] fArray = new float[8];
        fArray[0] = 1.0f;
        fArray[1] = 40.0f;
        fArray[2] = -90.0f;
        fArray[3] = 90.0f;
        fArray[4] = -90.0f;
        fArray[5] = 90.0f;
        id_catch = fArray;
    }

    private static void id_while() {
        boolean[] blArray = new boolean[23];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[19] = true;
        id_case = blArray;
    }

    private static void id_public() {
        short[] sArray = new short[141];
        sArray[0] = 5;
        sArray[1] = 7;
        sArray[2] = 1;
        sArray[4] = 3;
        sArray[5] = 8;
        sArray[6] = 1;
        sArray[7] = 8;
        sArray[10] = 3;
        sArray[11] = 9;
        sArray[12] = 5;
        sArray[13] = 6;
        sArray[14] = 7;
        sArray[15] = 7;
        sArray[16] = 7;
        sArray[18] = 57;
        sArray[19] = 1;
        sArray[20] = 1;
        sArray[21] = 6;
        sArray[22] = 1;
        sArray[23] = 7;
        sArray[24] = 7;
        sArray[25] = 10;
        sArray[26] = 11;
        sArray[28] = 2;
        sArray[30] = 2;
        sArray[31] = 1;
        sArray[32] = 2;
        sArray[33] = 1;
        sArray[34] = 2;
        sArray[35] = 1;
        sArray[36] = 2;
        sArray[37] = 1;
        sArray[38] = 2;
        sArray[39] = 1;
        sArray[40] = 64;
        sArray[41] = 57;
        sArray[43] = 57;
        sArray[44] = 2;
        sArray[45] = 3;
        sArray[46] = 57;
        sArray[47] = 57;
        sArray[48] = 15;
        sArray[49] = 15;
        sArray[50] = 2;
        sArray[51] = 8;
        sArray[52] = 3;
        sArray[53] = 2;
        sArray[54] = 2;
        sArray[56] = 57;
        sArray[57] = 3;
        sArray[58] = 57;
        sArray[59] = 2;
        sArray[60] = 15;
        sArray[61] = 57;
        sArray[62] = 2;
        sArray[63] = 16;
        sArray[64] = 57;
        sArray[65] = 57;
        sArray[66] = 16;
        sArray[67] = 16;
        sArray[68] = 3;
        sArray[69] = 57;
        sArray[70] = 3;
        sArray[71] = 15;
        sArray[72] = 57;
        sArray[73] = 3;
        sArray[74] = 16;
        sArray[75] = 57;
        sArray[76] = 57;
        sArray[77] = 16;
        sArray[78] = 16;
        sArray[79] = 3;
        sArray[80] = 8;
        sArray[81] = 4;
        sArray[82] = 4;
        sArray[83] = 2;
        sArray[84] = 1;
        sArray[85] = 2;
        sArray[86] = 2;
        sArray[87] = 2;
        sArray[88] = 1;
        sArray[89] = 1;
        sArray[90] = 2;
        sArray[91] = 57;
        sArray[92] = 45;
        sArray[93] = 8;
        sArray[94] = 57;
        sArray[96] = 1;
        sArray[97] = 1;
        sArray[98] = 2;
        sArray[99] = 2;
        sArray[100] = 2;
        sArray[101] = 57;
        sArray[102] = 45;
        sArray[103] = 2;
        sArray[104] = 1;
        sArray[105] = 3;
        sArray[106] = 1;
        sArray[107] = 3;
        sArray[108] = 2;
        sArray[109] = 8;
        sArray[110] = 8;
        sArray[114] = 2;
        sArray[116] = 57;
        sArray[117] = 8;
        sArray[118] = 4;
        sArray[119] = 57;
        sArray[120] = 57;
        sArray[121] = 1;
        sArray[122] = 1;
        sArray[126] = 1;
        sArray[127] = 3;
        sArray[128] = 4;
        sArray[129] = 5;
        sArray[130] = 6;
        sArray[131] = 7;
        sArray[132] = 8;
        sArray[133] = 9;
        sArray[134] = 10;
        sArray[135] = 11;
        sArray[137] = 5;
        sArray[138] = 4;
        sArray[139] = 2;
        sArray[140] = 8;
        id_throws = sArray;
    }

    public rrTy_1 id_protected() {
        this.id_goto();
        return (rrTy_1)this.id_byte[id_throws[125]];
    }

    public float id_private() {
        this.id_goto();
        return ((Float)this.id_byte[id_throws[134]]).floatValue();
    }

    public void id_final() {
        this.id_goto();
        PX pX = (PX)PJ.id_class[id_throws[42]];
        if ((cb_3)rrTT.id_import.id_class[id_throws[43]] != null && (PX)this.id_byte[id_throws[44]] != null && pX != null && (C_volatile)id_break[id_throws[45]] == this) {
            Float f = Float.valueOf(pX.id_throws() + rfU_2.id_catch(((Float)((cb_3)rrTT.id_import.id_class[rrTT.id_throws[47]]).id_throws[id_throws[48]]).floatValue() - pX.id_throws()));
            ((cb_3)rrTT.id_import.id_class[rrTT.id_throws[46]]).id_throws[rrTT.id_throws[49]] = f;
        }
        Object var7_3 = null;
        this.id_byte[rrTT.id_throws[50]] = var7_3;
        Object var8_4 = null;
        this.id_byte[rrTT.id_throws[51]] = var8_4;
    }

    private static void id_synchronized() {
        Object[] objectArray = new Object[4];
        objectArray[0] = new HashSet();
        objectArray[1] = new ArrayList();
        id_break = objectArray;
    }
}

