/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.C_throws;
import celestial.C_volatile;
import celestial.Ph_1;
import celestial.an_3;
import celestial.cb_3;
import celestial.gm_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.module.combat.AttackAura;
import celestial.q_1;
import celestial.rLD;
import celestial.rSY;
import celestial.rZq_1;
import celestial.rdy_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rmD_2;
import celestial.rmU_2;
import celestial.rme_3;
import celestial.rmq_3;
import celestial.rpm_3;
import celestial.rqr_3;
import celestial.rrQX;
import celestial.rrTT;
import celestial.rrfH_2;
import celestial.rrfY_2;
import celestial.rrff_3;
import celestial.rrfo_3;
import celestial.rrjS_2;
import celestial.rrnU_2;
import celestial.rrne_3;
import celestial.rrvy_1;
import celestial.rxM_2;
import celestial.setting.CheckGroup;
import celestial.util.MinecraftAccessor;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnD_2
implements MinecraftAccessor {
    public static Object[] id_class;
    private static short[] id_byte;
    private static byte[] id_protected;
    private static long[] id_throws;
    private static boolean[] id_case;
    private static float[] id_catch;
    public Object[] id_break;
    private static double[] id_private;

    public void id_byte() {
        Integer n = id_case[56];
        this.id_break[rrnD_2.id_byte[98]] = n;
        Integer n2 = id_case[57];
        this.id_break[rrnD_2.id_byte[99]] = n2;
    }

    private static void id_int() {
        short[] sArray = new short[119];
        sArray[1] = 1;
        sArray[4] = 56;
        sArray[5] = 56;
        sArray[6] = 57;
        sArray[7] = 1;
        sArray[8] = 3;
        sArray[10] = 57;
        sArray[13] = 57;
        sArray[14] = 6;
        sArray[15] = 6;
        sArray[16] = 57;
        sArray[18] = 57;
        sArray[19] = 4;
        sArray[21] = 57;
        sArray[22] = 55;
        sArray[23] = 57;
        sArray[24] = 55;
        sArray[25] = 57;
        sArray[26] = 7;
        sArray[27] = 7;
        sArray[28] = 7;
        sArray[29] = 6;
        sArray[30] = 2;
        sArray[32] = 57;
        sArray[33] = 57;
        sArray[34] = 5;
        sArray[36] = 57;
        sArray[37] = 57;
        sArray[38] = 5;
        sArray[39] = 5;
        sArray[40] = 57;
        sArray[41] = 31;
        sArray[42] = 57;
        sArray[43] = 57;
        sArray[44] = 31;
        sArray[46] = 57;
        sArray[47] = 57;
        sArray[48] = 57;
        sArray[49] = 17;
        sArray[50] = 57;
        sArray[51] = 57;
        sArray[52] = 56;
        sArray[53] = 57;
        sArray[54] = 57;
        sArray[55] = 57;
        sArray[56] = 57;
        sArray[57] = 57;
        sArray[58] = 57;
        sArray[59] = 18;
        sArray[60] = 57;
        sArray[61] = 57;
        sArray[62] = 57;
        sArray[63] = 57;
        sArray[64] = 57;
        sArray[65] = 57;
        sArray[66] = 57;
        sArray[67] = 57;
        sArray[69] = 57;
        sArray[70] = 57;
        sArray[72] = 57;
        sArray[73] = 57;
        sArray[74] = 57;
        sArray[75] = 57;
        sArray[77] = 2;
        sArray[78] = 55;
        sArray[79] = 57;
        sArray[81] = 57;
        sArray[83] = 57;
        sArray[85] = 55;
        sArray[86] = 57;
        sArray[87] = 57;
        sArray[89] = 57;
        sArray[90] = 1;
        sArray[91] = 55;
        sArray[92] = 57;
        sArray[94] = 57;
        sArray[96] = 55;
        sArray[97] = 57;
        sArray[98] = 5;
        sArray[99] = 6;
        sArray[101] = 57;
        sArray[102] = 1;
        sArray[103] = 3;
        sArray[104] = 2;
        sArray[105] = 57;
        sArray[106] = 57;
        sArray[107] = 2;
        sArray[108] = 3;
        sArray[109] = 4;
        sArray[110] = 4;
        sArray[112] = 57;
        sArray[113] = 57;
        sArray[115] = 57;
        sArray[116] = 57;
        sArray[117] = 57;
        sArray[118] = 57;
        id_byte = sArray;
    }

    public rrnD_2(AttackAura attackAura) {
        this.id_private();
        AttackAura attackAura2 = attackAura;
        this.id_break[rrnD_2.id_byte[0]] = attackAura2;
        rrnU_2 rrnU_22 = new rrnU_2(attackAura);
        this.id_break[rrnD_2.id_byte[1]] = rrnU_22;
    }

    static {
        rrnD_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-47, 78, 39, 51, 26, 119, 78, 105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x25EC1045;
    }

    public boolean id_class(AttackAura attackAura, float f, int n, boolean bl, boolean bl2, int n2) {
        if (attackAura.id_continue() == null) {
            return id_case[42];
        }
        if ((attackAura.id_instanceof().id_class().booleanValue() || attackAura.s()) && ((cb_3)rrnD_2.id_import.id_class[id_byte[74]]).sL() && (((cb_3)rrnD_2.id_import.id_class[id_byte[75]]).sX().id_break() != rdy_3.kN || !((AttackAura)this.id_break[id_byte[76]]).id_double().id_class().booleanValue())) {
            return id_case[43];
        }
        if (attackAura.id_else().id_class().booleanValue() && C_throws.id_byte().id_return().id_class()) {
            return id_case[44];
        }
        if (!this.id_class(f, n)) {
            return id_case[45];
        }
        if (attackAura.id_public().id_class().booleanValue()) {
            return this.id_class(bl, bl2, n2);
        }
        return id_case[46];
    }

    public boolean id_class(AttackAura attackAura) {
        return this.id_class(attackAura, id_catch[6], id_case[38], id_case[39], id_case[40], id_case[41]);
    }

    public boolean id_class(float f, int n) {
        if (!rrfo_3.id_class(f)) {
            return id_case[47];
        }
        return (float)(System.currentTimeMillis() - (Long)this.id_break[id_byte[77]]) >= id_catch[7] - (float)n ? id_case[48] : id_case[49];
    }

    public boolean id_class(boolean bl, boolean bl2, int n) {
        rrvy_1 rrvy_12;
        List<Float> list;
        boolean bl3;
        Object object;
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[35]]).id_private().t().id_new()) {
            return id_case[14];
        }
        if (bl && !this.id_case()) {
            return id_case[15];
        }
        if (bl2) {
            double d = Math.abs((double)((int)((cb_3)rrnD_2.id_import.id_class[id_byte[36]]).re()) - ((cb_3)rrnD_2.id_import.id_class[id_byte[37]]).re());
            if (d == id_private[1]) {
                Integer n2 = id_protected[2];
                this.id_break[rrnD_2.id_byte[38]] = n2;
            } else if (d == id_private[2]) {
                Integer n3 = id_protected[3];
                this.id_break[rrnD_2.id_byte[39]] = n3;
            }
        }
        if (n > 0) {
            object = new rrvy_1((cb_3)rrnD_2.id_import.id_class[id_byte[40]]);
            ((rrvy_1)object).id_class(n);
            bl3 = !((an_3)object).BL() && ((Float)((rrvy_1)object).id_throws[id_byte[41]]).floatValue() > id_catch[3] ? id_case[16] : id_case[17];
        } else {
            bl3 = !((cb_3)rrnD_2.id_import.id_class[id_byte[42]]).BL() && ((Float)((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[43]]).id_throws[id_byte[44]]).floatValue() > id_catch[4] ? id_case[18] : id_case[19];
        }
        object = ((AttackAura)this.id_break[id_byte[45]]).id_for();
        if (((rrne_3)object).id_break() && ((rrne_3)object).id_class() && (list = (rrvy_12 = new rrvy_1((cb_3)rrnD_2.id_import.id_class[id_byte[46]])).id_else()).size() > id_case[20]) {
            return id_case[21];
        }
        return bl3;
    }

    public boolean id_class(iB_2 iB_22, rrTT rrTT2) {
        an_3 an_32;
        if ((C_volatile)rrTT.id_break[id_byte[8]] != rrTT2) {
            return id_case[1];
        }
        float f = ((AttackAura)this.id_break[id_byte[9]]).id_try();
        if (rrTT2.id_package() && (an_32 = Ph_1.id_class(iB_22, ((cb_3)rrnD_2.id_import.id_class[id_byte[10]]).id_new(id_catch[2]), rrTT2.id_throws(), f, (boolean)((AttackAura)this.id_break[id_byte[11]]).id_switch().id_class(), xc_32 -> !((AttackAura)this.id_break[id_byte[111]]).P().id_class((xc_3)xc_32) ? id_case[60] : id_case[61])) != iB_22) {
            return id_case[2];
        }
        boolean bl = ((AttackAura)this.id_break[id_byte[12]]).id_float();
        if (rmD_2.id_break && this.id_case()) {
            ((cb_3)rrnD_2.id_import.id_class[id_byte[13]]).c_(id_case[3]);
            if (bl) {
                if ((Integer)this.id_break[id_byte[14]] == 0) {
                    Integer n = id_case[4];
                    this.id_break[rrnD_2.id_byte[15]] = n;
                }
                return id_case[5];
            }
            ((Aq_1)((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[16]]).id_break[id_byte[17]]).id_class(new rmD_2((cb_3)rrnD_2.id_import.id_class[id_byte[18]], rmU_2.STOP_SPRINTING));
            Boolean bl2 = id_case[6];
            this.id_break[rrnD_2.id_byte[19]] = bl2;
        }
        if (((AttackAura)this.id_break[id_byte[20]]).id_double().id_class().booleanValue() && ((cb_3)rrnD_2.id_import.id_class[id_byte[21]]).sd()) {
            ((Ax_1)rrnD_2.id_import.id_class[id_byte[22]]).id_break((cb_3)rrnD_2.id_import.id_class[id_byte[23]]);
        }
        ((Ax_1)rrnD_2.id_import.id_class[id_byte[24]]).id_class((rhd_3)((cb_3)rrnD_2.id_import.id_class[id_byte[25]]), (an_3)iB_22, id_case[7]);
        if (bl && rrjS_2.id_protected()) {
            rrnD_2 rrnD_22 = this;
            int n = (Integer)rrnD_22.id_break[id_byte[26]] + id_case[8];
            Integer n2 = n;
            rrnD_22.id_break[rrnD_2.id_byte[27]] = n2;
            if (n >= id_case[9]) {
                Integer n3 = id_case[10];
                this.id_break[rrnD_2.id_byte[28]] = n3;
                Integer n4 = id_case[11];
                this.id_break[rrnD_2.id_byte[29]] = n4;
            }
        }
        Long l = System.currentTimeMillis();
        this.id_break[rrnD_2.id_byte[30]] = l;
        if (((AttackAura)this.id_break[id_byte[31]]).id_this().id_class().booleanValue()) {
            this.id_class(iB_22);
        }
        if (this.id_new()) {
            int n = ((cb_3)rrnD_2.id_import.id_class[id_byte[32]]).id_byte(rLD.id_protected).id_byte() + id_case[12];
            int n5 = n * id_protected[0] - n / id_protected[1];
            if (((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[33]]).rv().id_byte < id_private[0]) {
                ++n5;
            }
            Integer n6 = n5;
            this.id_break[rrnD_2.id_byte[34]] = n6;
        }
        return id_case[13];
    }

    public long id_class() {
        return (Long)this.id_break[id_byte[107]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAAF1673794E730AFL;
    }

    private void id_class(iB_2 iB_22) {
        if (iB_22 instanceof rhd_3) {
            int n;
            rhd_3 rhd_32 = (rhd_3)iB_22;
            if (!(!iB_22.id_extends(id_protected[4]) || rhd_32.id_native() && rhd_32.id_implements() || rrfH_2.id_class(iB_22, rdy_3.kN) == null || (n = this.id_class((iB_2)rhd_32, id_case[50])) <= id_protected[5])) {
                ((Ax_1)rrnD_2.id_import.id_class[id_byte[78]]).id_class(n);
            }
        }
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_break[rrnD_2.id_byte[110]] = bl2;
    }

    private int id_class(iB_2 iB_22, boolean bl) {
        int n = rrfY_2.id_class(rxM_2.class);
        if (n >= 0) {
            ((Aq_1)((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[79]]).id_break[id_byte[80]]).id_class(new rme_3(n));
            if (bl) {
                ((Aq_1)((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[81]]).id_break[id_byte[82]]).id_class(new rZq_1(iB_22, rpm_3.MAIN_HAND, id_case[51]));
                ((Aq_1)((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[83]]).id_break[id_byte[84]]).id_class(new rmq_3(rpm_3.MAIN_HAND));
            } else {
                ((Ax_1)rrnD_2.id_import.id_class[id_byte[85]]).id_break((cb_3)rrnD_2.id_import.id_class[id_byte[86]], iB_22, id_case[52]);
            }
            ((Aq_1)((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[87]]).id_break[id_byte[88]]).id_class(new rme_3(((rhz_3)((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[89]]).id_implements[rrnD_2.id_byte[90]]).id_protected));
            this.id_extends();
            return n;
        }
        int n2 = rrfY_2.id_class(rxM_2.class, id_case[53]);
        if (n2 >= 0) {
            ((Ax_1)rrnD_2.id_import.id_class[id_byte[91]]).id_class(n2);
            if (bl) {
                ((Aq_1)((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[92]]).id_break[id_byte[93]]).id_class(new rZq_1(iB_22, rpm_3.MAIN_HAND, id_case[54]));
                ((Aq_1)((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[94]]).id_break[id_byte[95]]).id_class(new rmq_3(rpm_3.MAIN_HAND));
            } else {
                ((Ax_1)rrnD_2.id_import.id_class[id_byte[96]]).id_break((cb_3)rrnD_2.id_import.id_class[id_byte[97]], iB_22, id_case[55]);
            }
            this.id_extends();
            return n2;
        }
        return id_protected[6];
    }

    public iB_2 id_class(CheckGroup checkGroup) {
        List<Object> list;
        iB_2 iB_23;
        float f = ((AttackAura)this.id_break[id_byte[2]]).G();
        Predicate<iB_2> predicate = iB_22 -> {
            if (iB_22 == null) {
                return id_case[62];
            }
            if (iB_22 == ((cb_3)rrnD_2.id_import.id_class[id_byte[112]]).ra()) {
                return id_case[63];
            }
            if (iB_22 == (cb_3)rrnD_2.id_import.id_class[id_byte[113]]) {
                return id_case[64];
            }
            if (iB_22.id_native()) {
                return id_case[65];
            }
            if (iB_22 instanceof rSY) {
                return id_case[66];
            }
            if (!iB_22.Pu()) {
                return id_case[67];
            }
            if (((AttackAura)this.id_break[id_byte[114]]).id_throw()) {
                if (((cb_3)rrnD_2.id_import.id_class[id_byte[115]]).id_class((iB_2)iB_22, iM_2.STANDING, iB_22.Pb()) > (double)f && ((cb_3)rrnD_2.id_import.id_class[id_byte[116]]).id_class((iB_2)iB_22, iM_2.FALL_FLYING, iM_2.STANDING) > (double)f) {
                    return id_case[68];
                }
            } else if (((cb_3)rrnD_2.id_import.id_class[id_byte[117]]).id_class((iB_2)iB_22, iM_2.STANDING, iB_22.Pb()) > (double)f && ((cb_3)rrnD_2.id_import.id_class[id_byte[118]]).id_class((iB_2)iB_22, iM_2.FALL_FLYING, iB_22.Pb()) > (double)f) {
                return id_case[69];
            }
            return rrff_3.id_class(iB_22, checkGroup);
        };
        if (predicate.test(iB_23 = ((AttackAura)this.id_break[id_byte[3]]).id_continue())) {
            return iB_23;
        }
        if (f == id_catch[0]) {
            ArrayList<iB_2> arrayList = new ArrayList<iB_2>();
            for (an_3 an_32 : ((gm_3)rrnD_2.id_import.id_class[id_byte[4]]).id_return().values()) {
                iB_2 iB_24;
                if (!(an_32 instanceof iB_2) || !predicate.test(iB_24 = (iB_2)an_32)) continue;
                arrayList.add(iB_24);
            }
            list = arrayList;
        } else {
            list = ((gm_3)rrnD_2.id_import.id_class[id_byte[5]]).id_class(iB_2.class, ((cb_3)rrnD_2.id_import.id_class[id_byte[6]]).rN().id_class(f * id_catch[1]), predicate);
        }
        list.sort((Comparator)this.id_break[id_byte[7]]);
        return list.isEmpty() ? null : (iB_2)list.get(id_case[0]);
    }

    public void id_class(AttackAura attackAura, q_1 q_12) {
        if (q_12.id_class() == attackAura.id_default() && this.id_catch()) {
            ((Aq_1)((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[70]]).id_break[id_byte[71]]).id_class(new rmD_2((cb_3)rrnD_2.id_import.id_class[id_byte[72]], rmU_2.START_SPRINTING));
            ((cb_3)rrnD_2.id_import.id_class[id_byte[73]]).c_(id_case[36]);
            this.id_class(id_case[37]);
        }
    }

    public long id_break() {
        return System.currentTimeMillis() - (Long)this.id_break[id_byte[104]];
    }

    public boolean id_throws() {
        if (((AttackAura)this.id_break[id_byte[68]]).id_import().id_class().booleanValue()) {
            return id_case[33];
        }
        if (((cb_3)rrnD_2.id_import.id_class[id_byte[69]]).id_break(rLD.id_private)) {
            return id_case[34];
        }
        return id_case[35];
    }

    private static /* synthetic */ void ntfClinit() {
        rrnD_2.id_implements();
        rrnD_2.id_native();
        rrnD_2.id_int();
        rrnD_2.id_final();
        rrnD_2.id_package();
        rrnD_2.id_finally();
        rrnD_2.id_volatile();
    }

    private static void id_finally() {
        id_protected = new byte[]{2, 2, 2, 3, 2, 8, -1, 3, 8, 2, 3, 4, 5, 6, 7, 2};
    }

    public boolean id_catch() {
        return (Boolean)this.id_break[id_byte[109]];
    }

    private void id_extends() {
        ((AttackAura)this.id_break[id_byte[100]]).id_const().id_class(((rhz_3)((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[101]]).id_implements[rrnD_2.id_byte[102]]).id_protected);
        Long l = System.currentTimeMillis();
        this.id_break[rrnD_2.id_byte[103]] = l;
    }

    public boolean id_case() {
        boolean bl = ((cb_3)rrnD_2.id_import.id_class[id_byte[47]]).BL();
        if (this.id_throws() && !((rqr_3)((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[48]]).id_break[rrnD_2.id_byte[49]]).id_private && bl) {
            return id_case[22];
        }
        float f = id_catch[5];
        boolean bl2 = ((cb_3)rrnD_2.id_import.id_class[id_byte[50]]).PZ() && !((cb_3)rrnD_2.id_import.id_class[id_byte[51]]).id_catch(f) ? id_case[23] : id_case[24];
        boolean bl3 = ((gm_3)rrnD_2.id_import.id_class[id_byte[52]]).id_break(((cb_3)rrnD_2.id_import.id_class[id_byte[53]]).rN().id_protected(id_private[3], id_private[4], id_private[5]));
        double d = Math.abs((double)((int)((cb_3)rrnD_2.id_import.id_class[id_byte[54]]).re()) - ((cb_3)rrnD_2.id_import.id_class[id_byte[55]]).re());
        boolean bl4 = (d == id_private[6] || d == id_private[7]) && !bl3 ? id_case[25] : id_case[26];
        boolean bl5 = ((cb_3)rrnD_2.id_import.id_class[id_byte[56]]).id_throws(iM_2.STANDING) && bl ? id_case[27] : id_case[28];
        boolean bl6 = !bl3 && bl ? id_case[29] : id_case[30];
        return !((cb_3)rrnD_2.id_import.id_class[id_byte[57]]).Sy() && !((rhx_3)((cb_3)rrnD_2.id_import.id_class[rrnD_2.id_byte[58]]).id_implements[rrnD_2.id_byte[59]]).id_break && !((cb_3)rrnD_2.id_import.id_class[id_byte[60]]).id_break(rLD.id_goto) && !((cb_3)rrnD_2.id_import.id_class[id_byte[61]]).id_break(rLD.id_package) && !((cb_3)rrnD_2.id_import.id_class[id_byte[62]]).id_break(rLD.id_instanceof) && !((cb_3)rrnD_2.id_import.id_class[id_byte[63]]).Pm() && !((cb_3)rrnD_2.id_import.id_class[id_byte[64]]).o_() && !((cb_3)rrnD_2.id_import.id_class[id_byte[65]]).Y() && !((cb_3)rrnD_2.id_import.id_class[id_byte[66]]).Pe() && !((cb_3)rrnD_2.id_import.id_class[id_byte[67]]).Py() && !bl2 && !bl4 && !bl5 && !bl6 ? id_case[31] : id_case[32];
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[77];
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[20] = true;
        blArray[23] = true;
        blArray[25] = true;
        blArray[27] = true;
        blArray[29] = true;
        blArray[31] = true;
        blArray[33] = true;
        blArray[34] = true;
        blArray[36] = true;
        blArray[39] = true;
        blArray[40] = true;
        blArray[46] = true;
        blArray[48] = true;
        blArray[52] = true;
        blArray[53] = true;
        blArray[55] = true;
        blArray[58] = true;
        blArray[60] = true;
        blArray[75] = true;
        blArray[76] = true;
        id_case = blArray;
    }

    private boolean id_new() {
        return ((cb_3)rrnD_2.id_import.id_class[id_byte[105]]).id_break(rLD.id_protected) && ((cb_3)rrnD_2.id_import.id_class[id_byte[106]]).id_byte(rLD.id_protected).id_byte() < id_protected[7] ? id_case[58] : id_case[59];
    }

    private static void id_package() {
        double[] dArray = new double[8];
        dArray[0] = -0.15233518685055708;
        dArray[1] = 0.43152384527073195;
        dArray[2] = 0.0548933470320776;
        dArray[4] = 0.1;
        dArray[6] = 0.125;
        dArray[7] = 0.1875;
        id_private = dArray;
    }

    public long id_protected() {
        return (Long)this.id_break[id_byte[108]];
    }

    private void id_private() {
        if (this.id_break == null) {
            this.id_break = new Object[8];
            this.id_break[2] = 0L;
            this.id_break[3] = 0L;
            this.id_break[4] = false;
            this.id_break[5] = 0;
            this.id_break[6] = 0;
            this.id_break[7] = 0;
        }
    }

    private static void id_final() {
        float[] fArray = new float[9];
        fArray[0] = Float.MAX_VALUE;
        fArray[1] = 2.0f;
        fArray[2] = 1.0f;
        fArray[5] = 0.8f;
        fArray[6] = 0.5f;
        fArray[7] = 500.0f;
        fArray[8] = 500.0f;
        id_catch = fArray;
    }

    private static void id_volatile() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f), 1};
        id_class = objectArray;
    }

    private static void id_native() {
        id_throws = new long[2];
    }
}

