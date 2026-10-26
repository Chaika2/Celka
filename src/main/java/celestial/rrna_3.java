/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Aq_1;
import celestial.PJ;
import celestial.PX;
import celestial.Ph_1;
import celestial.Y;
import celestial.an_3;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.iB_2;
import celestial.module.combat.AttackAura;
import celestial.q_1;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhj_3;
import celestial.rjU_2;
import celestial.rmq_3;
import celestial.rpm_3;
import celestial.rrFj_1;
import celestial.rrTA;
import celestial.rrTH;
import celestial.rrTI;
import celestial.rrTR;
import celestial.rrTT;
import celestial.rrTf_1;
import celestial.rrTj_1;
import celestial.rrTn_1;
import celestial.rrfQ_2;
import celestial.rrfq_3;
import celestial.rrnD_2;
import celestial.rrnK_2;
import celestial.rrni_3;
import celestial.rrwW_2;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrna_3
extends rrnK_2 {
    private static short[] id_protected;
    public Object[] id_byte;
    private static boolean[] id_case;
    private static byte[] id_catch;
    private static float[] id_private;
    private static double[] id_implements;

    @Override
    public float id_byte() {
        return id_private[7];
    }

    @Override
    public float id_int() {
        an_3 an_32;
        this.id_try();
        if (this.id_synchronized()) {
            return id_private[8];
        }
        AttackAura attackAura = (AttackAura)this.id_continue();
        iB_2 iB_22 = attackAura.id_continue();
        if (iB_22 == null && ((Boolean)this.id_byte[id_protected[38]]).booleanValue()) {
            return (float)rrfQ_2.id_class(((cb_3)rrna_3.id_import.id_class[id_protected[39]]).Sa(), id_implements[4], id_implements[5]);
        }
        PX pX = this.id_private();
        float f = attackAura.id_try();
        if (this.id_extends() == (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_protected[40]]) && iB_22 != null && pX != null && (an_32 = Ph_1.id_class((an_3)iB_22, ((cb_3)rrna_3.id_import.id_class[id_protected[41]]).id_new(id_private[9]), new PX(((Float)this.id_byte[id_protected[42]]).floatValue(), pX.id_protected()), f, id_case[14])) != iB_22) {
            return id_private[10];
        }
        return id_private[11];
    }

    public rrna_3(AttackAura attackAura) {
        super(attackAura, new rrTT(attackAura));
        this.id_try();
        rrni_3 rrni_32 = new rrni_3(this);
        this.id_byte[rrna_3.id_protected[0]] = rrni_32;
        Boolean bl = id_case[0];
        this.id_byte[rrna_3.id_protected[1]] = bl;
        Float f = Float.valueOf(id_private[0]);
        this.id_byte[rrna_3.id_protected[2]] = f;
        this.id_class(id_case[1]);
    }

    static {
        rrna_3.ntfClinit();
    }

    private boolean id_this() {
        an_3 an_32 = Ph_1.id_class(((cb_3)rrna_3.id_import.id_class[id_protected[57]]).z(), id_private[12], id_case[18], null);
        if (an_32 == null) {
            ((Aq_1)((cb_3)rrna_3.id_import.id_class[rrna_3.id_protected[58]]).id_break[id_protected[59]]).id_break(new rmq_3(rpm_3.MAIN_HAND));
            return id_case[19];
        }
        return id_case[20];
    }

    @EventTarget
    public void id_class(rrFj_1 rrFj_12) {
        this.id_try();
        if (((rrwW_2)rrwW_2.staticFieldsd828d5c982463367b63d6cc3c26fd998[id_protected[30]]).id_class((rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[31]]))) {
            rrna_3 rrna_32 = this;
            Integer n = (Integer)rrna_32.id_byte[id_protected[32]] + id_case[11];
            rrna_32.id_byte[rrna_3.id_protected[33]] = n;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDBE0D8E08AA24D4EL;
    }

    @Override
    public float id_class(rjU_2 rjU_22, rjU_2 rjU_23) {
        this.id_try();
        float f = super.id_class(rjU_22, rjU_23);
        Float f2 = Float.valueOf(f);
        this.id_byte[rrna_3.id_protected[43]] = f2;
        float f3 = f;
        if (((Boolean)this.id_byte[id_protected[44]]).booleanValue()) {
            f3 = ((Float)((cb_3)rrna_3.id_import.id_class[rrna_3.id_protected[45]]).id_throws[id_protected[46]]).floatValue();
            if (((Boolean)this.id_byte[id_protected[47]]).booleanValue()) {
                f3 = ((cb_3)rrna_3.id_import.id_class[id_protected[48]]).N();
            }
        }
        return f3;
    }

    @Override
    public Pair<rrTA, rrTA> id_class(an_3 an_32, PX pX) {
        ((List)rrTT.id_break[id_protected[34]]).clear();
        rfl_3 rfl_32 = an_32.rN();
        List<rrTA> list = this.id_class(an_32, rfl_32);
        PX pX2 = pX.id_byte();
        rjU_2 rjU_22 = an_32.id_new(id_private[2]);
        ((List)rrTT.id_break[id_protected[35]]).addAll(list);
        rrTA rrTA2 = new rrTn_1(rjU_22);
        double d = id_implements[0];
        for (rrTA rrTA3 : list) {
            PX pX3 = PJ.id_class(rrTA3);
            double d2 = PJ.id_class(pX2.id_protected(), pX3.id_protected());
            if (!(d2 < d)) continue;
            d = d2;
            rrTA2 = rrTA3;
        }
        return Pair.of((Object)rrTA2, (Object)rrTA2);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x145D8D50;
    }

    @Override
    public List<rrTA> id_class(an_3 an_32, rfl_3 rfl_32) {
        Object object;
        rrTR rrTR2;
        ArrayList<rrTA> arrayList = new ArrayList<rrTA>();
        rjU_2 rjU_22 = ((cb_3)rrna_3.id_import.id_class[id_protected[36]]).id_new(id_private[3]);
        float f = id_private[4];
        float f2 = id_private[5];
        float f3 = id_private[6];
        double d = rfl_32.id_class + (double)f;
        double d2 = rfl_32.id_protected - (double)f;
        double d3 = rfl_32.id_byte + (double)f;
        double d4 = rfl_32.id_case - (double)f;
        double d5 = d2 - d;
        double d6 = d5 / id_implements[1];
        double d7 = (rfl_32.id_throws - rfl_32.id_break) / id_implements[2];
        float f4 = ((AttackAura)this.id_continue()).id_try();
        for (double d8 = rfl_32.id_break; d8 < rfl_32.id_throws; d8 += d7) {
            if (d8 < an_32.re() + (double)f3 || d8 > rfl_32.id_throws - (double)f2) continue;
            for (double d9 = id_implements[3]; d9 < d5; d9 += d6) {
                rrTA rrTA3 = new rrTn_1(new rjU_2(d, d8, d3 + d9));
                arrayList.add(rrTA3);
                rrTR2 = new rrTn_1(new rjU_2(d2, d8, d3 + d9));
                arrayList.add((rrTA)rrTR2);
                object = new rrTn_1(new rjU_2(d + d9, d8, d3));
                arrayList.add((rrTA)object);
                rrTn_1 rrTn_12 = new rrTn_1(new rjU_2(d + d9, d8, d4));
                arrayList.add(rrTn_12);
            }
            rrTn_1 rrTn_13 = new rrTn_1(new rjU_2(d2, d8, d4));
            arrayList.add(rrTn_13);
        }
        ArrayList<rrTA> arrayList2 = new ArrayList<rrTA>();
        boolean bl = this.id_native();
        boolean bl2 = !bl || arrayList.stream().anyMatch(rrTA2 -> rrTA2.id_class(rjU_22, an_32, (xc_3 xc_32) -> !this.id_class((xc_3)xc_32) ? id_case[26] : id_case[27])) ? id_case[12] : id_case[13];
        for (rrTA rrTA3 : arrayList) {
            rrTR2 = rrTA3.rr();
            if (bl && !rrTA3.id_class(rjU_22, an_32, (xc_3 xc_32) -> !this.id_class((xc_3)xc_32) ? id_case[24] : id_case[25]) && bl2 || (object = rhj_3.id_class((cb_3)rrna_3.id_import.id_class[id_protected[37]], an_32, rjU_22, rrTR2, f4)) == null) continue;
            arrayList2.add(rrTA3);
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        return arrayList2;
    }

    @Override
    public void id_class(q_1 q_12) {
        this.id_try();
        super.id_class(q_12);
        AttackAura attackAura = (AttackAura)this.id_continue();
        rrnD_2 rrnD_22 = attackAura.id_long();
        iB_2 iB_22 = attackAura.id_continue();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_protected[3]])) {
            Boolean bl = (Integer)((cb_3)rrna_3.id_import.id_class[rrna_3.id_protected[4]]).id_private[id_protected[5]] > 0 && (Integer)((cb_3)rrna_3.id_import.id_class[rrna_3.id_protected[6]]).id_private[id_protected[7]] < id_catch[0] ? id_case[2] : id_case[3];
            this.id_byte[rrna_3.id_protected[8]] = bl;
            if (((Boolean)this.id_byte[id_protected[9]]).booleanValue()) {
                Float f = Float.valueOf(this.id_while());
                this.id_byte[rrna_3.id_protected[10]] = f;
            }
            this.id_class((rrTj_1)iB_22, (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_protected[11]]));
            boolean bl2 = this.id_synchronized();
            if (bl2 && this.id_this()) {
                Boolean bl3 = id_case[4];
                this.id_byte[rrna_3.id_protected[12]] = bl3;
                Integer n = id_catch[1];
                this.id_byte[rrna_3.id_protected[13]] = n;
            }
            rrna_3 rrna_32 = this;
            Integer n = (Integer)rrna_32.id_byte[id_protected[14]] - id_case[5];
            rrna_32.id_byte[rrna_3.id_protected[15]] = n;
            if (iB_22 != null || ((cb_3)rrna_3.id_import.id_class[id_protected[16]]).z().id_class(((Float)((cb_3)rrna_3.id_import.id_class[rrna_3.id_protected[17]]).id_throws[id_protected[18]]).floatValue(), id_private[1])) {
                Boolean bl4 = id_case[6];
                this.id_byte[rrna_3.id_protected[19]] = bl4;
            }
            if (rrnD_22.id_class(attackAura)) {
                Boolean bl5 = id_case[7];
                this.id_byte[rrna_3.id_protected[20]] = bl5;
                if (!bl2 && (Integer)this.id_byte[id_protected[21]] <= 0) {
                    this.id_class((rrTj_1)iB_22, (rrTI)((Object)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[id_protected[22]]));
                    this.id_class(iB_22);
                }
                if ((Integer)this.id_byte[id_protected[23]] >= id_catch[2] && ((rrwW_2)rrwW_2.staticFieldsd828d5c982463367b63d6cc3c26fd998[id_protected[24]]).id_class((rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_protected[25]]))) {
                    Integer n2 = id_case[8];
                    this.id_byte[rrna_3.id_protected[26]] = n2;
                    Boolean bl6 = id_case[9];
                    this.id_byte[rrna_3.id_protected[27]] = bl6;
                }
            } else {
                Boolean bl7 = id_case[10];
                this.id_byte[rrna_3.id_protected[28]] = bl7;
            }
        }
        rrnD_22.id_class(attackAura, q_12);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-28, -89, 113, 43, -81, 44, -92, 10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public float id_break(rjU_2 rjU_22, rjU_2 rjU_23) {
        this.id_try();
        if (this.id_synchronized()) {
            return ((Float)this.id_byte[id_protected[49]]).floatValue();
        }
        return (Boolean)this.id_byte[id_protected[50]] != false && (Boolean)this.id_byte[id_protected[51]] != false ? ((cb_3)rrna_3.id_import.id_class[id_protected[52]]).b() : super.id_break(rjU_22, rjU_23);
    }

    @Override
    public void id_throws() {
        this.id_try();
        super.id_throws();
        Boolean bl = id_case[17];
        this.id_byte[rrna_3.id_protected[56]] = bl;
    }

    private static /* synthetic */ void ntfClinit() {
        rrna_3.id_public();
        rrna_3.id_return();
        rrna_3.id_throw();
        rrna_3.id_else();
        rrna_3.id_instanceof();
    }

    @Override
    public rrTH id_finally() {
        return (f, f2, f3) -> {
            float f4;
            float f5 = rfU_2.id_catch(f2 - f);
            float f6 = f3 * Math.abs(f5) / id_private[16];
            if (f6 < (f4 = id_private[17])) {
                f6 = f4;
            }
            if (f5 > id_private[18]) {
                return f + f6;
            }
            return f - f6;
        };
    }

    private static void id_else() {
        double[] dArray = new double[6];
        dArray[0] = Double.MAX_VALUE;
        dArray[1] = 2.0;
        dArray[2] = 12.0;
        dArray[4] = 8.0;
        dArray[5] = 10.0;
        id_implements = dArray;
    }

    private static void id_instanceof() {
        id_catch = new byte[]{10, 2, 50, -90, 90, 9, 2, 3, 4, 5, 6, 7, 8};
    }

    @Override
    public rrTH id_package() {
        return (f, f2, f3) -> {
            float f4 = rfU_2.id_catch(f2 - f);
            if (f4 > f3) {
                return f + f3;
            }
            if (f4 < -f3) {
                return f - f3;
            }
            return f2;
        };
    }

    private static void id_return() {
        short[] sArray = new short[64];
        sArray[1] = 1;
        sArray[2] = 7;
        sArray[4] = 57;
        sArray[5] = 16;
        sArray[6] = 57;
        sArray[7] = 16;
        sArray[8] = 4;
        sArray[9] = 6;
        sArray[10] = 7;
        sArray[12] = 6;
        sArray[13] = 8;
        sArray[14] = 8;
        sArray[15] = 8;
        sArray[16] = 57;
        sArray[17] = 57;
        sArray[18] = 16;
        sArray[19] = 5;
        sArray[20] = 1;
        sArray[21] = 8;
        sArray[22] = 1;
        sArray[23] = 3;
        sArray[25] = 2;
        sArray[26] = 3;
        sArray[27] = 6;
        sArray[28] = 1;
        sArray[29] = 5;
        sArray[31] = 2;
        sArray[32] = 3;
        sArray[33] = 3;
        sArray[34] = 1;
        sArray[35] = 1;
        sArray[36] = 57;
        sArray[37] = 57;
        sArray[38] = 5;
        sArray[39] = 57;
        sArray[40] = 1;
        sArray[41] = 57;
        sArray[42] = 2;
        sArray[43] = 2;
        sArray[44] = 1;
        sArray[45] = 57;
        sArray[46] = 15;
        sArray[47] = 4;
        sArray[48] = 57;
        sArray[49] = 7;
        sArray[50] = 1;
        sArray[51] = 4;
        sArray[52] = 57;
        sArray[54] = 1;
        sArray[55] = 5;
        sArray[56] = 5;
        sArray[57] = 57;
        sArray[58] = 57;
        sArray[60] = 57;
        sArray[61] = 6;
        sArray[62] = 7;
        sArray[63] = 57;
        id_protected = sArray;
    }

    private static void id_throw() {
        float[] fArray = new float[21];
        fArray[0] = Float.MIN_VALUE;
        fArray[1] = 0.1f;
        fArray[2] = 1.0f;
        fArray[3] = 1.0f;
        fArray[4] = 0.08f;
        fArray[7] = -1.0f;
        fArray[8] = -1.0f;
        fArray[9] = 1.0f;
        fArray[10] = -1.0f;
        fArray[11] = 1.0f;
        fArray[12] = 3.0f;
        fArray[13] = Float.MIN_VALUE;
        fArray[14] = 3.0f;
        fArray[15] = Float.MIN_VALUE;
        fArray[16] = 180.0f;
        fArray[17] = 1.0f;
        id_private = fArray;
    }

    private void id_try() {
        if (this.id_byte == null) {
            this.id_byte = new Object[9];
            this.id_byte[1] = false;
            this.id_byte[2] = Float.valueOf(0.0f);
            this.id_byte[3] = 0;
            this.id_byte[4] = false;
            this.id_byte[5] = false;
            this.id_byte[6] = false;
            this.id_byte[7] = Float.valueOf(0.0f);
            this.id_byte[8] = 0;
        }
    }

    private float id_while() {
        PX pX = ((cb_3)rrna_3.id_import.id_class[id_protected[60]]).z();
        float f = pX.id_throws();
        float f2 = id_private[13];
        for (int i = id_catch[3]; i <= id_catch[4]; i += 20) {
            an_3 an_32 = Ph_1.id_class(new PX(f, i), id_private[14], id_case[21], null);
            if (an_32 != null) continue;
            return i;
        }
        return f2;
    }

    private static void id_public() {
        boolean[] blArray = new boolean[35];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[5] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[26] = true;
        blArray[28] = true;
        id_case = blArray;
    }

    @Override
    public rrTf_1 id_protected() {
        this.id_try();
        return (rrTf_1)this.id_byte[id_protected[53]];
    }

    @Override
    public rrTj_1 id_final() {
        this.id_try();
        if (((Boolean)this.id_byte[id_protected[29]]).booleanValue()) {
            return () -> ((cb_3)rrna_3.id_import.id_class[id_protected[63]]).rO();
        }
        return super.id_final();
    }

    @Override
    public void id_volatile() {
        this.id_try();
        super.id_volatile();
        Boolean bl = id_case[15];
        this.id_byte[rrna_3.id_protected[54]] = bl;
        Boolean bl2 = id_case[16];
        this.id_byte[rrna_3.id_protected[55]] = bl2;
    }

    public boolean id_synchronized() {
        this.id_try();
        return (Boolean)this.id_byte[id_protected[61]] != false && ((Float)this.id_byte[id_protected[62]]).floatValue() != id_private[15] ? id_case[22] : id_case[23];
    }
}

