/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.C_break;
import celestial.Oo_1;
import celestial.PX;
import celestial.QY;
import celestial.Rm_1;
import celestial.aA_2;
import celestial.aI_2;
import celestial.aL_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.ay_3;
import celestial.cb_3;
import celestial.eA_2;
import celestial.eD_2;
import celestial.eY_2;
import celestial.iF_2;
import celestial.iG_2;
import celestial.iJ_2;
import celestial.iM_2;
import celestial.iN_2;
import celestial.iQ_2;
import celestial.iS_2;
import celestial.iW_2;
import celestial.iZ_2;
import celestial.ic_3;
import celestial.id_3;
import celestial.ik_3;
import celestial.ix_3;
import celestial.iz_3;
import celestial.kB_2;
import celestial.kc_3;
import celestial.rAB;
import celestial.rFh_1;
import celestial.rLD;
import celestial.rLK;
import celestial.rLQ;
import celestial.rLR;
import celestial.rLX;
import celestial.rLY;
import celestial.rLk_1;
import celestial.rMm_1;
import celestial.rOH;
import celestial.rOQ;
import celestial.rRR;
import celestial.rRT;
import celestial.rRu_1;
import celestial.rSN;
import celestial.rXE;
import celestial.rXQ;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rZe_1;
import celestial.rZj_1;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcf_3;
import celestial.rcy_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhm_3;
import celestial.rhx_3;
import celestial.rjB_2;
import celestial.rjM_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rjs_3;
import celestial.rkc_3;
import celestial.rlB_2;
import celestial.rlG_2;
import celestial.rlb_3;
import celestial.rls_3;
import celestial.rmE_2;
import celestial.rnB_2;
import celestial.rpB_2;
import celestial.rpJ_2;
import celestial.rpX_2;
import celestial.rpZ_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqO_2;
import celestial.rqT_2;
import celestial.rqn_3;
import celestial.rqs_3;
import celestial.rrAS;
import celestial.rrAs_1;
import celestial.rrEN;
import celestial.rrEm_1;
import celestial.rrLC;
import celestial.rrLI;
import celestial.rrLd_1;
import celestial.rrLo_1;
import celestial.rrQX;
import celestial.rrTR;
import celestial.rrTj_1;
import celestial.rrnJ_2;
import celestial.rsE_2;
import celestial.rsP_2;
import celestial.ruS_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rvO_2;
import celestial.rvQ_2;
import celestial.rxH_2;
import celestial.rxK_2;
import celestial.rxS_2;
import celestial.ryR_2;
import celestial.rye_3;
import celestial.ryg_3;
import celestial.rzL_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzz_3;
import celestial.t_1;
import celestial.xb_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zr_3;
import celestial.zv_3;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.Logger;

public abstract class iB_2
extends an_3 {
    public static Object[] id_catch;
    public Object[] id_private;
    private static String[] id_class;
    private static boolean[] id_break;
    private static double[] id_protected;
    private static float[] id_implements;
    private static byte[] id_finally;
    private static long[] id_extends;
    private static short[] id_native;

    private boolean id_char() {
        this.id_private();
        int n = this.SH();
        rxK_2 rxK_22 = ((rdn_3)this.id_private[id_native[624]]).id_break().id_this();
        boolean bl = rxK_22 != null && rxK_22.id_throws() ? id_break[213] : id_break[214];
        return (bl |= n <= ((rdn_3)this.id_private[id_native[625]]).id_extends() - id_finally[75] ? id_break[215] : id_break[216]) && n % id_finally[76] == 0 ? id_break[217] : id_break[218];
    }

    public boolean id_byte(rXQ rXQ2) {
        return !this.id_class(rXQ2).id_class() ? id_break[139] : id_break[140];
    }

    public rqA_2 id_byte(rdn_3 rdn_32) {
        return rdn_32.id_float();
    }

    public void id_byte(rlb_3<rXs_1> rlb_32) {
        this.id_byte(this.rv().id_break(id_protected[56], id_protected[57], id_protected[58]));
    }

    public int id_byte(rhd_3 rhd_32) {
        return id_break[34];
    }

    public void id_byte(rpm_3 rpm_32) {
        this.id_break(rpm_32 == rpm_3.MAIN_HAND ? rXQ.MAINHAND : rXQ.OFFHAND);
    }

    public void id_byte(rLY rLY2) {
        this.id_private();
        if (this.id_throws(rLY2)) {
            rLY rLY3 = ((Map)this.id_private[id_native[199]]).put(rLY2.id_class(), rLY2);
            if (rLY3 == null) {
                this.id_protected(rLY2);
            } else {
                this.id_class(rLY2, id_break[63]);
            }
        }
    }

    public rLY id_byte(rLR rLR2) {
        this.id_private();
        return (rLY)((Map)this.id_private[id_native[196]]).get(rLR2);
    }

    private float id_byte(float f) {
        this.id_private();
        return (Boolean)this.id_throws[id_native[400]] != false ? this.sB() * (id_implements[139] / (f * f * f)) : ((Float)this.id_private[id_native[401]]).floatValue();
    }

    public rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.So;
    }

    private void id_byte(rXQ rXQ2, rdn_3 rdn_32) {
        this.id_private();
        ((rqs_3)this.id_private[id_native[479]]).set(rXQ2.id_break(), rdn_32);
    }

    public rqA_2 id_byte(int n) {
        return n > id_finally[41] ? rqn_3.SI : rqn_3.SK;
    }

    public void id_byte(rye_3 rye_32, float f) {
    }

    @Override
    public void id_byte(an_3 an_32) {
        if (!this.Sc()) {
            super.id_byte(an_32);
        }
    }

    public void id_byte(int n, boolean bl) {
        int n2 = ((Byte)((rmE_2)this.id_throws[id_native[632]]).id_class((rut_3)id_catch[id_native[633]])).byteValue();
        n2 = bl ? (n2 |= n) : (n2 &= n ^ id_finally[77]);
        ((rmE_2)this.id_throws[id_native[634]]).id_break((rut_3)id_catch[id_native[635]], (byte)n2);
    }

    private boolean id_byte(rfH_2 rfH_22, xc_3 xc_32) {
        if (xc_32.id_byte(zv_3.id_volatile).booleanValue()) {
            xc_3 xc_33 = ((rYB)this.id_throws[id_native[286]]).id_byte(rfH_22.id_break());
            return xc_33.id_class(xu_3.PJ) && xc_33.id_byte(kc_3.id_volatile) == xc_32.id_byte(zv_3.p) ? id_break[110] : id_break[111];
        }
        return id_break[112];
    }

    public ic_3 id_byte(iJ_2 iJ_22) {
        return this.BT().id_class(iJ_22);
    }

    @Override
    public void id_int(boolean bl) {
        this.id_private();
        super.id_int(bl);
        if (bl) {
            Optional optional;
            this.id_private[iB_2.id_native[281]] = optional = Optional.empty();
        }
    }

    public void id_int(int n) {
        ((rmE_2)this.id_throws[id_native[304]]).id_break((rut_3)id_catch[id_native[305]], n);
    }

    private static void id_int() {
        id_finally = new byte[]{2, 4, 20, -20, 8, 100, 5, 20, 20, 4, 9, 10, 9, 10, 99, 8, 7, 99, 99, 99, 10, 15, 5, 16, 8, 20, 10, 100, 100, 29, 33, 36, 37, 44, 2, 100, 35, 5, 5, 3, 3, 4, 10, 5, 25, 6, 2, -1, 3, 33, 36, 37, 44, 20, 10, 10, 10, 7, 20, 30, 20, 30, 20, 6, 6, 55, 7, 20, 7, 4, 4, 4, 4, 2, 5, 7, 4, -1, 2, 2, 16, 7, 46, 3, 47, 48, 49, 50, 52, 51, 47, 3, 2, 3, 4, 5, 6, 7, 8, 9, 10, 80, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 55, 57, 58, 59, 60, 62, 63, 64, 68, 69, 70, 71, 73, 74, 75, 76, 77, 78, 79, 11};
    }

    private Map<rXQ, rdn_3> id_long() {
        EnumMap enumMap = null;
        rXQ[] rXQArray = rXQ.values();
        int n = rXQArray.length;
        block4: for (int i = id_break[159]; i < n; ++i) {
            rdn_3 rdn_32;
            rXQ rXQ2 = rXQArray[i];
            switch (((int[])iS_2.id_class[id_native[475]])[rXQ2.id_class().ordinal()]) {
                case 1: {
                    rdn_32 = this.id_protected(rXQ2);
                    break;
                }
                case 2: {
                    rdn_32 = this.id_case(rXQ2);
                    break;
                }
                default: {
                    continue block4;
                }
            }
            rdn_3 rdn_33 = this.id_class(rXQ2);
            if (rdn_3.id_break(rdn_33, rdn_32)) continue;
            if (enumMap == null) {
                enumMap = Maps.newEnumMap(rXQ.class);
            }
            enumMap.put(rXQ2, rdn_33);
            if (!rdn_32.id_class()) {
                this.BT().id_class(rdn_32.id_class(rXQ2));
            }
            if (rdn_33.id_class()) continue;
            this.BT().id_break(rdn_33.id_class(rXQ2));
        }
        return enumMap;
    }

    private static void id_float() {
        id_class = new String[]{new String("memories"), new String("Soul speed boost"), new String("Health"), new String("HurtTime"), new String("HurtByTimestamp"), new String("DeathTime"), new String("AbsorptionAmount"), new String("Attributes"), new String("ActiveEffects"), new String("FallFlying"), new String("AbsorptionAmount"), new String("Attributes"), new String("Attributes"), new String("ActiveEffects"), new String("ActiveEffects"), new String("Health"), new String("Health"), new String("HurtTime"), new String("DeathTime"), new String("HurtByTimestamp"), new String("Team"), new String("Team"), new String("Unable to add mob to team \"{}\" (that team probably doesn't exist)"), new String("FallFlying"), new String("SleepingX"), new String("SleepingY"), new String("SleepingZ"), new String("SleepingX"), new String("SleepingY"), new String("SleepingZ"), new String("Brain"), new String("Brain"), new String("Brain"), new String("SleepingX"), new String("SleepingY"), new String("SleepingZ"), new String("662A6B8D-DA3E-4C1C-8813-96EA6097278D"), new String("87f46a96-686f-4796-b035-22e16ee9e038"), new String("Sprinting speed boost")};
    }

    public iB_2(aI_2<? extends iB_2> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
        iZ_2<?> iZ_22;
        Optional optional;
        rqs_3<rdn_3> rqs_32;
        rqs_3<rdn_3> rqs_33;
        this.id_private();
        ryR_2 ryR_22 = new ryR_2(this);
        this.id_private[iB_2.id_native[0]] = ryR_22;
        HashMap hashMap = Maps.newHashMap();
        this.id_private[iB_2.id_native[1]] = hashMap;
        this.id_private[iB_2.id_native[2]] = rqs_33 = rqs_3.id_class(id_finally[0], rdn_3.id_break);
        this.id_private[iB_2.id_native[3]] = rqs_32 = rqs_3.id_class(id_finally[1], rdn_3.id_break);
        Integer n = id_finally[2];
        this.id_private[iB_2.id_native[4]] = n;
        Float f = Float.valueOf(id_implements[0]);
        this.id_private[iB_2.id_native[5]] = f;
        Boolean bl = id_break[0];
        this.id_private[iB_2.id_native[6]] = bl;
        rdn_3 rdn_32 = rdn_3.id_break;
        this.id_private[iB_2.id_native[7]] = rdn_32;
        this.id_private[iB_2.id_native[8]] = optional = Optional.empty();
        ik_3 ik_32 = new ik_3(iN_2.id_class(aI_22));
        this.id_private[iB_2.id_native[9]] = ik_32;
        this.id_public(this.SK());
        Boolean bl2 = id_break[1];
        this.id_throws[iB_2.id_native[10]] = bl2;
        Float f2 = Float.valueOf((float)((Math.random() + id_protected[0]) * id_protected[1]));
        this.id_private[iB_2.id_native[11]] = f2;
        this.PX();
        Float f3 = Float.valueOf((float)Math.random() * id_implements[1]);
        this.id_private[iB_2.id_native[12]] = f3;
        Float f4 = Float.valueOf((float)(Math.random() * id_protected[2]));
        this.id_throws[iB_2.id_native[13]] = f4;
        Float f5 = Float.valueOf(((Float)this.id_throws[id_native[14]]).floatValue());
        this.id_private[iB_2.id_native[15]] = f5;
        Float f6 = Float.valueOf(((Float)this.id_throws[id_native[16]]).floatValue());
        this.id_private[iB_2.id_native[17]] = f6;
        Float f7 = Float.valueOf(id_implements[2]);
        this.id_throws[iB_2.id_native[18]] = f7;
        rcf_3 rcf_32 = rcf_3.id_class;
        this.id_private[iB_2.id_native[19]] = iZ_22 = this.id_class(new Dynamic((DynamicOps)rcf_32, (Object)((rcZ_2)rcf_32.createMap((Map)ImmutableMap.of((Object)rcf_32.id_class(id_class[0]), (Object)((rcZ_2)rcf_32.emptyMap()))))));
    }

    static {
        iB_2.ntfClinit();
    }

    @Override
    public void id_this() {
        this.id_private();
        super.id_this();
        this.id_final();
        this.id_void();
        Boolean bl = id_break[151];
        this.id_private[iB_2.id_native[404]] = bl;
        Iterable<rdn_3> iterable = this.PV();
        for (rdn_3 rdn_32 : iterable) {
            if (rdn_32.id_class()) continue;
            Boolean bl2 = id_break[152];
            this.id_private[iB_2.id_native[405]] = bl2;
        }
        if (!((rYB)this.id_throws[iB_2.id_native[406]]).id_continue) {
            int n;
            int n2 = this.BY();
            if (n2 > 0) {
                if ((Integer)this.id_private[id_native[407]] <= 0) {
                    Integer n3 = id_finally[58] * (id_finally[59] - n2);
                    this.id_private[iB_2.id_native[408]] = n3;
                }
                iB_2 iB_22 = this;
                Integer n4 = (Integer)iB_22.id_private[id_native[409]] - id_break[153];
                iB_22.id_private[iB_2.id_native[410]] = n4;
                if ((Integer)this.id_private[id_native[411]] <= 0) {
                    this.id_int(n2 - id_break[154]);
                }
            }
            if ((n = this.SM()) > 0) {
                if ((Integer)this.id_private[id_native[412]] <= 0) {
                    Integer n5 = id_finally[60] * (id_finally[61] - n);
                    this.id_private[iB_2.id_native[413]] = n5;
                }
                iB_2 iB_23 = this;
                Integer n6 = (Integer)iB_23.id_private[id_native[414]] - id_break[155];
                iB_23.id_private[iB_2.id_native[415]] = n6;
                if ((Integer)this.id_private[id_native[416]] <= 0) {
                    this.id_package(n - id_break[156]);
                }
            }
            this.id_else();
            if ((Integer)this.id_throws[id_native[417]] % id_finally[62] == 0) {
                this.SW().id_throws();
            }
            if (!((Boolean)this.id_throws[id_native[418]]).booleanValue()) {
                boolean bl3 = this.id_break(rLD.id_public);
                if (this.id_finally(id_finally[63]) != bl3) {
                    this.id_break(id_finally[64], bl3);
                }
            }
            if (this.Sc() && !this.id_goto()) {
                this.SQ();
            }
        }
        this.id_default();
        double d = this.rx() - (Double)this.id_throws[id_native[419]];
        double d2 = this.BO() - (Double)this.id_throws[id_native[420]];
        float f = (float)(d * d + d2 * d2);
        float f2 = ((Float)this.id_private[id_native[421]]).floatValue();
        float f3 = id_implements[140];
        Float f4 = Float.valueOf(((Float)this.id_private[id_native[422]]).floatValue());
        this.id_private[iB_2.id_native[423]] = f4;
        float f5 = id_implements[141];
        float f6 = this.id_switch().id_throws();
        if (f > id_implements[142]) {
            f5 = id_implements[143];
            f3 = (float)Math.sqrt(f) * id_implements[144];
            float f7 = (float)rfU_2.id_protected(d2, d) * id_implements[145] - id_implements[146];
            float f8 = rfU_2.id_throws(rfU_2.id_catch(f6) - f7);
            f2 = id_implements[147] < f8 && f8 < id_implements[148] ? f7 - id_implements[149] : f7;
        }
        if (((Float)this.id_private[id_native[424]]).floatValue() > id_implements[150]) {
            f2 = f6;
        }
        if (!((Boolean)this.id_throws[id_native[425]]).booleanValue()) {
            f5 = id_implements[151];
        }
        iB_2 iB_24 = this;
        Float f9 = Float.valueOf(((Float)iB_24.id_private[id_native[426]]).floatValue() + (f5 - ((Float)this.id_private[id_native[427]]).floatValue()) * id_implements[152]);
        iB_24.id_private[iB_2.id_native[428]] = f9;
        f3 = this.id_break(f2, f3, f6);
        while (((Float)this.id_throws[id_native[429]]).floatValue() - ((Float)this.id_throws[id_native[430]]).floatValue() < id_implements[153]) {
            iB_2 iB_25 = this;
            Float f10 = Float.valueOf(((Float)iB_25.id_throws[id_native[431]]).floatValue() - id_implements[154]);
            iB_25.id_throws[iB_2.id_native[432]] = f10;
        }
        while (((Float)this.id_throws[id_native[433]]).floatValue() - ((Float)this.id_throws[id_native[434]]).floatValue() >= id_implements[155]) {
            iB_2 iB_26 = this;
            Float f11 = Float.valueOf(((Float)iB_26.id_throws[id_native[435]]).floatValue() + id_implements[156]);
            iB_26.id_throws[iB_2.id_native[436]] = f11;
        }
        while (((Float)this.id_private[id_native[437]]).floatValue() - ((Float)this.id_private[id_native[438]]).floatValue() < id_implements[157]) {
            iB_2 iB_27 = this;
            Float f12 = Float.valueOf(((Float)iB_27.id_private[id_native[439]]).floatValue() - id_implements[158]);
            iB_27.id_private[iB_2.id_native[440]] = f12;
        }
        while (((Float)this.id_private[id_native[441]]).floatValue() - ((Float)this.id_private[id_native[442]]).floatValue() >= id_implements[159]) {
            iB_2 iB_28 = this;
            Float f13 = Float.valueOf(((Float)iB_28.id_private[id_native[443]]).floatValue() + id_implements[160]);
            iB_28.id_private[iB_2.id_native[444]] = f13;
        }
        while (((Float)this.id_throws[id_native[445]]).floatValue() - ((Float)this.id_throws[id_native[446]]).floatValue() < id_implements[161]) {
            iB_2 iB_29 = this;
            Float f14 = Float.valueOf(((Float)iB_29.id_throws[id_native[447]]).floatValue() - id_implements[162]);
            iB_29.id_throws[iB_2.id_native[448]] = f14;
        }
        while (((Float)this.id_throws[id_native[449]]).floatValue() - ((Float)this.id_throws[id_native[450]]).floatValue() >= id_implements[163]) {
            iB_2 iB_210 = this;
            Float f15 = Float.valueOf(((Float)iB_210.id_throws[id_native[451]]).floatValue() + id_implements[164]);
            iB_210.id_throws[iB_2.id_native[452]] = f15;
        }
        while (((Float)this.id_private[id_native[453]]).floatValue() - ((Float)this.id_private[id_native[454]]).floatValue() < id_implements[165]) {
            iB_2 iB_211 = this;
            Float f16 = Float.valueOf(((Float)iB_211.id_private[id_native[455]]).floatValue() - id_implements[166]);
            iB_211.id_private[iB_2.id_native[456]] = f16;
        }
        while (((Float)this.id_private[id_native[457]]).floatValue() - ((Float)this.id_private[id_native[458]]).floatValue() >= id_implements[167]) {
            iB_2 iB_212 = this;
            Float f17 = Float.valueOf(((Float)iB_212.id_private[id_native[459]]).floatValue() + id_implements[168]);
            iB_212.id_private[iB_2.id_native[460]] = f17;
        }
        while (((Float)this.id_private[id_native[461]]).floatValue() - ((Float)this.id_private[id_native[462]]).floatValue() < id_implements[169]) {
            iB_2 iB_213 = this;
            Float f18 = Float.valueOf(((Float)iB_213.id_private[id_native[463]]).floatValue() - id_implements[170]);
            iB_213.id_private[iB_2.id_native[464]] = f18;
        }
        while (((Float)this.id_private[id_native[465]]).floatValue() - ((Float)this.id_private[id_native[466]]).floatValue() >= id_implements[171]) {
            iB_2 iB_214 = this;
            Float f19 = Float.valueOf(((Float)iB_214.id_private[id_native[467]]).floatValue() + id_implements[172]);
            iB_214.id_private[iB_2.id_native[468]] = f19;
        }
        iB_2 iB_215 = this;
        Float f20 = Float.valueOf(((Float)iB_215.id_private[id_native[469]]).floatValue() + f3);
        iB_215.id_private[iB_2.id_native[470]] = f20;
        if (this.Sy()) {
            iB_2 iB_216 = this;
            Integer n = (Integer)iB_216.id_private[id_native[471]] + id_break[157];
            iB_216.id_private[iB_2.id_native[472]] = n;
        } else {
            Integer n = id_break[158];
            this.id_private[iB_2.id_native[473]] = n;
        }
        if (this.Sc()) {
            Float f21 = Float.valueOf(id_implements[173]);
            this.id_throws[iB_2.id_native[474]] = f21;
        }
    }

    public float id_this(float f) {
        this.id_private();
        return rfU_2.id_catch(f, ((Integer)this.id_private[id_native[683]]).intValue(), ((Integer)this.id_private[id_native[684]]).intValue());
    }

    public Map<rLR, rLY> sb() {
        this.id_private();
        return (Map)this.id_private[id_native[194]];
    }

    @Override
    public float f() {
        return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_native[727]]).id_finally().id_class(rrnJ_2.id_class(this, super.f())).id_break();
    }

    public float id_interface() {
        return this.id_break(rLD.id_protected) ? (float)(id_finally[45] + (id_break[120] + this.id_byte(rLD.id_protected).id_byte()) * id_finally[46]) : id_implements[75];
    }

    @Override
    public abstract void id_class(rXQ var1, rdn_3 var2);

    @Override
    public void id_class(double d, boolean bl, xc_3 xc_32, rfH_2 rfH_22) {
        if (!this.rT()) {
            this.rd();
        }
        if (!((rYB)this.id_throws[iB_2.id_native[35]]).id_continue && bl && ((Float)this.id_throws[id_native[36]]).floatValue() > id_implements[5]) {
            this.SI();
            this.Ba();
        }
        if (!((rYB)this.id_throws[iB_2.id_native[37]]).id_continue && ((Float)this.id_throws[id_native[38]]).floatValue() > id_implements[6] && bl) {
            float f = rfU_2.id_case(((Float)this.id_throws[id_native[39]]).floatValue() - id_implements[7]);
            if (!xc_32.id_catch()) {
                double d2 = Math.min((double)(id_implements[8] + f / id_implements[9]), id_protected[3]);
                int n = (int)(id_protected[4] * d2);
                ((rrEm_1)((rYB)this.id_throws[id_native[40]])).id_class(new rLX(rLQ.id_protected, xc_32), this.rx(), this.re(), this.BO(), n, id_protected[5], id_protected[6], id_protected[7], id_protected[8]);
            }
        }
        super.id_class(d, bl, xc_32, rfH_22);
    }

    public boolean id_class(aI_2<?> aI_22) {
        return id_break[2];
    }

    public void id_class(rye_3 rye_32, int n, boolean bl) {
    }

    private void id_class(rdn_3 rdn_32, rYB rYB2, iB_2 iB_22) {
        rdb_3 rdb_32 = rdn_32.id_break();
        if (rdb_32.id_super()) {
            for (Pair<rLY, Float> pair : rdb_32.id_this().id_case()) {
                if (rYB2.id_continue || pair.getFirst() == null || !(rYB2.id_int.nextFloat() < ((Float)pair.getSecond()).floatValue())) continue;
                iB_22.id_break(new rLY((rLY)pair.getFirst()));
            }
        }
    }

    public void id_class(iB_2 iB_22, boolean bl) {
        this.id_private();
        Float f = Float.valueOf(((Float)iB_22.id_private[id_native[386]]).floatValue());
        iB_22.id_private[iB_2.id_native[387]] = f;
        double d = iB_22.rx() - (Double)iB_22.id_throws[id_native[388]];
        double d2 = bl ? iB_22.re() - (Double)iB_22.id_throws[id_native[389]] : id_protected[103];
        double d3 = iB_22.BO() - (Double)iB_22.id_throws[id_native[390]];
        float f2 = rfU_2.id_class(d * d + d2 * d2 + d3 * d3) * id_implements[134];
        if (f2 > id_implements[135]) {
            f2 = id_implements[136];
        }
        iB_2 iB_23 = iB_22;
        Float f3 = Float.valueOf(((Float)iB_23.id_private[id_native[391]]).floatValue() + (f2 - ((Float)iB_22.id_private[id_native[392]]).floatValue()) * id_implements[137]);
        iB_23.id_private[iB_2.id_native[393]] = f3;
        iB_2 iB_24 = iB_22;
        Float f4 = Float.valueOf(((Float)iB_24.id_private[id_native[394]]).floatValue() + ((Float)iB_22.id_private[id_native[395]]).floatValue());
        iB_24.id_private[iB_2.id_native[396]] = f4;
    }

    private void id_class(rfH_2 rfH_22) {
        this.id_new((double)rfH_22.b_() + id_protected[141], (double)rfH_22.c_() + id_protected[142], (double)rfH_22.d_() + id_protected[143]);
    }

    private void id_class(Map<rXQ, rdn_3> map) {
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)map.size());
        map.forEach((rXQ2, rdn_32) -> {
            rdn_3 rdn_33 = rdn_32.id_implements();
            arrayList.add(Pair.of((Object)rXQ2, (Object)rdn_33));
            switch (((int[])iS_2.id_class[id_native[737]])[rXQ2.id_class().ordinal()]) {
                case 1: {
                    this.id_break((rXQ)((Object)rXQ2), rdn_33);
                    break;
                }
                case 2: {
                    this.id_byte((rXQ)((Object)rXQ2), rdn_33);
                }
            }
        });
        ((rrEm_1)((rYB)this.id_throws[id_native[477]])).id_else().id_break(this, new rvO_2(this.V(), arrayList));
    }

    private void id_class(an_3 an_32) {
        rjU_2 rjU_22 = (Boolean)an_32.id_throws[id_native[361]] == false && !((rYB)this.id_throws[id_native[362]]).id_byte(an_32.Bs()).id_break().id_class(rls_3.Q) ? an_32.a_(this) : new rjU_2(an_32.rx(), an_32.re() + (double)an_32.Bm(), an_32.BO());
        this.id_case(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3AD3A76448CC7CEL;
    }

    public void id_class(rsE_2 rsE_22) {
        rhd_3 rhd_32;
        rhd_3 rhd_33 = rhd_32 = rsE_22.id_case() != null ? ((rYB)this.id_throws[id_native[582]]).id_class(rsE_22.id_case()) : null;
        if (rhd_32 instanceof rhN_2) {
            Oo_1.id_strictfp.id_class((rhN_2)rhd_32, rsE_22.id_protected(), this);
        }
    }

    public void id_class(an_3 an_32, int n) {
        if (!((Boolean)an_32.id_throws[id_native[583]]).booleanValue() && !((rYB)this.id_throws[iB_2.id_native[584]]).id_continue && (an_32 instanceof rsE_2 || an_32 instanceof rhm_3 || an_32 instanceof rsP_2)) {
            ((rrEm_1)((rYB)this.id_throws[id_native[585]])).id_else().id_break(an_32, new rZe_1(an_32.V(), this.V(), n));
        }
    }

    public static boolean id_class(Collection<rLY> collection) {
        for (rLY rLY2 : collection) {
            if (rLY2.id_protected()) continue;
            return id_break[48];
        }
        return id_break[49];
    }

    public void id_class(rye_3 rye_32, float f) {
        if (!this.id_class(rye_32)) {
            f = this.id_protected(rye_32, f);
            f = this.id_throws(rye_32, f);
            float f2 = Math.max(f - this.Sd(), id_implements[70]);
            this.id_return(this.Sd() - (f - f2));
            float f3 = f - f2;
            if (f3 > id_implements[71] && f3 < id_implements[72] && rye_32.id_extends() instanceof rhN_2) {
                ((rhN_2)rye_32.id_extends()).id_class(rlB_2.id_long, Math.round(f3 * id_implements[73]));
            }
            if (f2 != id_implements[74]) {
                float f4 = this.Ss();
                this.id_public(f4 - f2);
                this.SW().id_class(rye_32, f4, f2);
                this.id_return(this.Sd() - f2);
            }
        }
    }

    public boolean id_class(Predicate<rdb_3> predicate) {
        return predicate.test(this.ss().id_break()) || predicate.test(this.Sn().id_break()) ? id_break[137] : id_break[138];
    }

    public abstract rdn_3 id_class(rXQ var1);

    public rdn_3 id_class(rYB rYB2, rdn_3 rdn_32) {
        if (rdn_32.id_long()) {
            rYB2.id_class(null, this.rx(), this.re(), this.BO(), this.id_protected(rdn_32), rqL_2.NEUTRAL, id_implements[218], id_implements[219] + (rYB2.id_int.nextFloat() - rYB2.id_int.nextFloat()) * id_implements[220]);
            this.id_class(rdn_32, rYB2, this);
            if (!(this instanceof rhd_3) || !((rhx_3)((rhd_3)this).id_implements[iB_2.id_native[716]]).id_protected) {
                rdn_32.id_catch(id_break[250]);
            }
        }
        return rdn_32;
    }

    @Override
    public boolean id_class(float f, float f2) {
        boolean bl = super.id_class(f, f2);
        int n = this.id_implements(f, f2);
        if (n > 0) {
            this.id_class(this.id_byte(n), id_implements[55], id_implements[56]);
            this.sM();
            this.id_break(rye_3.id_extends, (float)n);
            return id_break[117];
        }
        return bl;
    }

    @Override
    public void id_class(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.id_private();
        Double d4 = d;
        this.id_private[iB_2.id_native[573]] = d4;
        Double d5 = d2;
        this.id_private[iB_2.id_native[574]] = d5;
        Double d6 = d3;
        this.id_private[iB_2.id_native[575]] = d6;
        Double d7 = f;
        this.id_private[iB_2.id_native[576]] = d7;
        Double d8 = f2;
        this.id_private[iB_2.id_native[577]] = d8;
        Integer n2 = n;
        this.id_private[iB_2.id_native[578]] = n2;
    }

    @Override
    public void id_class(Rm_1 rm_1, rjU_2 rjU_22) {
        this.id_private();
        super.id_class(rm_1, rjU_22);
        Float f = Float.valueOf(((Float)this.id_private[id_native[657]]).floatValue());
        this.id_private[iB_2.id_native[658]] = f;
        Float f2 = Float.valueOf(((Float)this.id_private[id_native[659]]).floatValue());
        this.id_private[iB_2.id_native[660]] = f2;
        Float f3 = Float.valueOf(((Float)this.id_private[id_native[661]]).floatValue());
        this.id_private[iB_2.id_native[662]] = f3;
    }

    public rLY id_class(rLR rLR2) {
        this.id_private();
        return (rLY)((Map)this.id_private[id_native[200]]).remove(rLR2);
    }

    public boolean id_class(rXs_1 rXs_12) {
        return id_break[145];
    }

    public boolean id_class(rrTR rrTR2) {
        float f;
        rjU_2 rjU_22 = new rjU_2(this.rx(), this.rH(), this.BO());
        rjU_2 rjU_23 = rrTR2.rr();
        double d = rjU_23.id_break;
        double d2 = rjU_23.id_byte;
        if (rrTR2 instanceof an_3) {
            an_3 an_32 = (an_3)rrTR2;
            f = an_32.Bx();
        } else {
            f = id_implements[192];
        }
        rjU_2 rjU_24 = new rjU_2(d, d2 + (double)f, rjU_23.id_protected);
        return ((rYB)this.id_throws[id_native[587]]).id_class(new rjB_2(rjU_22, rjU_24, rjS_2.COLLIDER, rjs_3.NONE, this)).id_byte() == rjM_2.MISS ? id_break[198] : id_break[199];
    }

    public boolean id_class(rdb_3 rdb_32) {
        return this.id_class((rdb_3 rdb_33) -> rdb_33 == rdb_32 ? id_break[252] : id_break[253]);
    }

    public void id_class(rLY rLY2) {
        this.id_private();
        Boolean bl = id_break[70];
        this.id_private[iB_2.id_native[205]] = bl;
        if (!((rYB)this.id_throws[iB_2.id_native[206]]).id_continue) {
            rLY2.id_class().id_class(this, this.BT(), rLY2.id_byte());
        }
        rrLo_1.id_class(this, rLY2);
    }

    @Override
    public rjU_2 id_class(rpB_2 rpB_22, rqT_2 rqT_22) {
        return iB_2.id_implements(super.id_class(rpB_22, rqT_22));
    }

    public void id_class(rpm_3 rpm_32, rdn_3 rdn_32) {
        if (rpm_32 == rpm_3.MAIN_HAND) {
            this.id_class(rXQ.MAINHAND, rdn_32);
        } else {
            if (rpm_32 != rpm_3.OFF_HAND) {
                throw new IllegalArgumentException("Invalid hand " + rpm_32);
            }
            this.id_class(rXQ.OFFHAND, rdn_32);
        }
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        this.id_private();
        super.id_class(rut_32);
        if (((rut_3)id_catch[id_native[641]]).equals(rut_32)) {
            if (((rYB)this.id_throws[iB_2.id_native[642]]).id_continue) {
                this.Bg().ifPresent(this::id_class);
            }
        } else if (((rut_3)id_catch[id_native[643]]).equals(rut_32) && ((rYB)this.id_throws[iB_2.id_native[644]]).id_continue) {
            if (this.id_return() && ((rdn_3)this.id_private[id_native[645]]).id_class()) {
                rdn_3 rdn_32 = this.id_protected(this.P());
                this.id_private[iB_2.id_native[646]] = rdn_32;
                if (!((rdn_3)this.id_private[id_native[647]]).id_class()) {
                    Integer n = (int)((Integer)this.id_private[id_native[648]]);
                    this.id_private[iB_2.id_native[649]] = n;
                    Integer n2 = ((rdn_3)this.id_private[id_native[650]]).id_extends();
                    this.id_private[iB_2.id_native[651]] = n2;
                }
            } else if (!this.id_return() && !((rdn_3)this.id_private[id_native[652]]).id_class()) {
                rdn_3 rdn_33 = rdn_3.id_break;
                this.id_private[iB_2.id_native[653]] = rdn_33;
                Integer n = (int)((Integer)this.id_private[id_native[654]]);
                this.id_private[iB_2.id_native[655]] = n;
                Integer n3 = id_break[223];
                this.id_private[iB_2.id_native[656]] = n3;
            }
        }
    }

    public rzP_2 id_class(boolean bl, rye_3 rye_32) {
        this.id_private();
        rzP_2 rzP_22 = new rzP_2((rrEm_1)((rYB)this.id_throws[id_native[274]])).id_class((Random)this.id_throws[id_native[275]]).id_class(rzQ_2.id_class, this).id_class(rzQ_2.id_case, this.Ps()).id_class(rzQ_2.id_byte, rye_32).id_break(rzQ_2.id_protected, rye_32.id_extends()).id_break(rzQ_2.id_throws, rye_32.id_finally());
        if (bl && (rhd_3)this.id_private[id_native[276]] != null) {
            rzP_22 = rzP_22.id_class(rzQ_2.id_break, (rhd_3)this.id_private[id_native[277]]).id_class(((rhd_3)this.id_private[id_native[278]]).sY());
        }
        return rzP_22;
    }

    public double id_class(iJ_2 iJ_22) {
        return this.BT().id_byte(iJ_22);
    }

    public void id_class(rye_3 rye_32, boolean bl) {
        rqO_2 rqO_22 = this.By();
        rzL_2 rzL_22 = ((rYB)this.id_throws[id_native[273]]).id_const().o().id_class(rqO_22);
        rzP_2 rzP_22 = this.id_class(bl, rye_32);
        rzL_22.id_break(rzP_22.id_class(rzz_3.id_case), this::a_);
    }

    @Override
    public float id_class(iM_2 iM_22, ap_3 ap_32) {
        return iM_22 == iM_2.SLEEPING ? id_implements[217] : this.id_break(iM_22, ap_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        DataResult<rcZ_2> dataResult;
        this.id_private();
        rcd_32.id_class(id_class[2], this.Ss());
        rcd_32.id_class(id_class[3], (short)((Integer)this.id_private[id_native[130]]).intValue());
        rcd_32.id_break(id_class[4], (Integer)this.id_private[id_native[131]]);
        rcd_32.id_class(id_class[5], (short)((Integer)this.id_private[id_native[132]]).intValue());
        rcd_32.id_class(id_class[6], this.Sd());
        rcd_32.id_class(id_class[7], this.BT().id_byte());
        if (!((Map)this.id_private[id_native[133]]).isEmpty()) {
            dataResult = new DataResult<rcZ_2>();
            for (rLY rLY2 : ((Map)this.id_private[id_native[134]]).values()) {
                dataResult.add(rLY2.id_class(new rcd_3()));
            }
            rcd_32.id_class(id_class[8], (rcZ_2)dataResult);
        }
        rcd_32.id_class(id_class[9], this.Sy());
        this.Bg().ifPresent(rfH_22 -> {
            rcd_32.id_break(id_class[33], rfH_22.b_());
            rcd_32.id_break(id_class[34], rfH_22.c_());
            rcd_32.id_break(id_class[35], rfH_22.d_());
        });
        dataResult = ((iZ_2)this.id_private[id_native[135]]).id_class(rcf_3.id_class);
        dataResult.resultOrPartial(arg_0 -> ((Logger)((Logger)id_case[id_native[136]])).error(arg_0)).ifPresent(rcZ_22 -> rcd_32.id_class(id_class[32], (rcZ_2)rcZ_22));
    }

    public void id_class(rpm_3 rpm_32, boolean bl) {
        this.id_private();
        if (!((Boolean)this.id_private[id_native[310]]).booleanValue() || (float)((Integer)this.id_private[id_native[311]]).intValue() >= this.id_interface() / id_implements[76] || (Integer)this.id_private[id_native[312]] < 0) {
            Integer n = id_finally[47];
            this.id_private[iB_2.id_native[313]] = n;
            Boolean bl2 = id_break[122];
            this.id_private[iB_2.id_native[314]] = bl2;
            rpm_3 rpm_33 = rpm_32;
            this.id_private[iB_2.id_native[315]] = rpm_33;
            if ((rYB)this.id_throws[id_native[316]] instanceof rrEm_1) {
                rZj_1 rZj_12 = new rZj_1(this, rpm_32 == rpm_3.MAIN_HAND ? id_break[123] : id_finally[48]);
                rrEN rrEN2 = ((rrEm_1)((rYB)this.id_throws[id_native[317]])).id_else();
                if (bl) {
                    rrEN2.id_class(this, rZj_12);
                } else {
                    rrEN2.id_break(this, rZj_12);
                }
            }
        }
    }

    public iZ_2<?> id_class(Dynamic<?> dynamic) {
        return this.SV().id_class(dynamic);
    }

    public void id_class(rpm_3 rpm_32) {
        this.id_class(rpm_32, id_break[121]);
    }

    @Override
    public void id_class(byte by) {
        this.id_private();
        switch (by) {
            case 2: 
            case 33: 
            case 36: 
            case 37: 
            case 44: {
                rye_3 rye_32;
                rqA_2 rqA_22;
                boolean bl = by == id_finally[49] ? id_break[124] : id_break[125];
                boolean bl2 = by == id_finally[50] ? id_break[126] : id_break[127];
                boolean bl3 = by == id_finally[51] ? id_break[128] : id_break[129];
                boolean bl4 = by == id_finally[52] ? id_break[130] : id_break[131];
                Float f = Float.valueOf(id_implements[77]);
                this.id_private[iB_2.id_native[318]] = f;
                Integer n = id_finally[53];
                this.id_throws[iB_2.id_native[319]] = n;
                Integer n2 = id_finally[54];
                this.id_private[iB_2.id_native[320]] = n2;
                Integer n3 = (int)((Integer)this.id_private[id_native[321]]);
                this.id_private[iB_2.id_native[322]] = n3;
                Float f2 = Float.valueOf(id_implements[78]);
                this.id_private[iB_2.id_native[323]] = f2;
                if (bl) {
                    this.id_class(rqn_3.dG, this.Si(), (((Random)this.id_throws[id_native[324]]).nextFloat() - ((Random)this.id_throws[id_native[325]]).nextFloat()) * id_implements[79] + id_implements[80]);
                }
                if ((rqA_22 = this.id_byte(rye_32 = bl3 ? rye_3.id_byte : (bl2 ? rye_3.id_private : (bl4 ? rye_3.id_else : rye_3.id_final)))) != null) {
                    this.id_class(rqA_22, this.Si(), (((Random)this.id_throws[id_native[326]]).nextFloat() - ((Random)this.id_throws[id_native[327]]).nextFloat()) * id_implements[81] + id_implements[82]);
                }
                this.id_break(rye_3.id_final, id_implements[83]);
                break;
            }
            case 3: {
                rqA_2 rqA_23 = this.Bt();
                if (rqA_23 != null) {
                    this.id_class(rqA_23, this.Si(), (((Random)this.id_throws[id_native[328]]).nextFloat() - ((Random)this.id_throws[id_native[329]]).nextFloat()) * id_implements[84] + id_implements[85]);
                }
                if (this instanceof rhd_3) break;
                this.id_public(id_implements[86]);
                this.id_break(rye_3.id_final);
                break;
            }
            default: {
                super.id_class(by);
                break;
            }
            case 29: {
                this.id_class(rqn_3.Jr, id_implements[87], id_implements[88] + ((rYB)this.id_throws[iB_2.id_native[330]]).id_int.nextFloat() * id_implements[89]);
                break;
            }
            case 30: {
                this.id_class(rqn_3.JP, id_implements[90], id_implements[91] + ((rYB)this.id_throws[iB_2.id_native[331]]).id_int.nextFloat() * id_implements[92]);
                break;
            }
            case 46: {
                short s = id_native[332];
                for (int i = id_break[132]; i < id_native[333]; ++i) {
                    double d = (double)i / id_protected[47];
                    float f = (((Random)this.id_throws[id_native[334]]).nextFloat() - id_implements[93]) * id_implements[94];
                    float f3 = (((Random)this.id_throws[id_native[335]]).nextFloat() - id_implements[95]) * id_implements[96];
                    float f4 = (((Random)this.id_throws[id_native[336]]).nextFloat() - id_implements[97]) * id_implements[98];
                    double d2 = rfU_2.id_protected(d, (Double)this.id_throws[id_native[337]], this.rx()) + (((Random)this.id_throws[id_native[338]]).nextDouble() - id_protected[48]) * (double)this.PN() * id_protected[49];
                    double d3 = rfU_2.id_protected(d, (Double)this.id_throws[id_native[339]], this.re()) + ((Random)this.id_throws[id_native[340]]).nextDouble() * (double)this.Bm();
                    double d4 = rfU_2.id_protected(d, (Double)this.id_throws[id_native[341]], this.BO()) + (((Random)this.id_throws[id_native[342]]).nextDouble() - id_protected[50]) * (double)this.PN() * id_protected[51];
                    ((rYB)this.id_throws[id_native[343]]).id_class(rLQ.id_transient, d2, d3, d4, (double)f, (double)f3, f4);
                }
                break;
            }
            case 47: {
                this.id_catch(this.id_class(rXQ.MAINHAND));
                break;
            }
            case 48: {
                this.id_catch(this.id_class(rXQ.OFFHAND));
                break;
            }
            case 49: {
                this.id_catch(this.id_class(rXQ.HEAD));
                break;
            }
            case 50: {
                this.id_catch(this.id_class(rXQ.CHEST));
                break;
            }
            case 51: {
                this.id_catch(this.id_class(rXQ.LEGS));
                break;
            }
            case 52: {
                this.id_catch(this.id_class(rXQ.FEET));
                break;
            }
            case 54: {
                kB_2.id_break(this);
                break;
            }
            case 55: {
                this.id_implements();
            }
        }
    }

    public void id_class(float f, double d, double d2) {
        if (!((f = (float)((double)f * (id_protected[40] - this.id_class(iQ_2.id_byte)))) <= id_implements[53])) {
            Boolean bl = id_break[105];
            this.id_throws[iB_2.id_native[279]] = bl;
            rjU_2 rjU_22 = this.rv();
            rjU_2 rjU_23 = new rjU_2(d, id_protected[41], d2).id_protected().id_class((double)f);
            this.id_catch(rjU_22.id_break / id_protected[42] - rjU_23.id_break, (Boolean)this.id_throws[id_native[280]] != false ? Math.min(id_protected[43], rjU_22.id_byte / id_protected[44] + (double)f) : rjU_22.id_byte, rjU_22.id_protected / id_protected[45] - rjU_23.id_protected);
        }
    }

    public void id_class(rfl_3 rfl_32, rfl_3 rfl_33) {
        this.id_private();
        rfl_3 rfl_34 = rfl_32.id_break(rfl_33);
        List<an_3> list = ((rYB)this.id_throws[id_native[558]]).id_class((an_3)this, rfl_34);
        if (!list.isEmpty()) {
            for (int i = id_break[189]; i < list.size(); ++i) {
                an_3 an_32 = list.get(i);
                if (!(an_32 instanceof iB_2)) continue;
                this.id_case((iB_2)an_32);
                Integer n = id_break[190];
                this.id_private[iB_2.id_native[559]] = n;
                this.id_byte(this.rv().id_class(id_protected[126]));
                break;
            }
        } else if (((Boolean)this.id_throws[id_native[560]]).booleanValue()) {
            Integer n = id_break[191];
            this.id_private[iB_2.id_native[561]] = n;
        }
        if (!((rYB)this.id_throws[iB_2.id_native[562]]).id_continue && (Integer)this.id_private[id_native[563]] <= 0) {
            this.id_byte(id_finally[70], id_break[192]);
        }
    }

    @Override
    public void id_class(float f, int n) {
        this.id_private();
        Double d = f;
        this.id_private[iB_2.id_native[579]] = d;
        Integer n2 = n;
        this.id_private[iB_2.id_native[580]] = n2;
    }

    public void id_class(iB_2 iB_22) {
        if (!((rYB)this.id_throws[iB_2.id_native[258]]).id_continue) {
            boolean bl = id_break[100];
            if (iB_22 instanceof rSN) {
                rrTj_1 rrTj_12;
                if (((rYB)this.id_throws[id_native[259]]).B().id_break(rRu_1.id_break)) {
                    rrTj_12 = this.Bs();
                    xc_3 xc_32 = xu_3.ry.id_continue();
                    if (((rYB)this.id_throws[id_native[260]]).id_byte((rfH_2)rrTj_12).id_catch() && xc_32.id_class((rRR)((rYB)this.id_throws[id_native[261]]), (rfH_2)rrTj_12)) {
                        ((rYB)this.id_throws[id_native[262]]).id_class((rfH_2)rrTj_12, xc_32, (int)id_finally[40]);
                        bl = id_break[101];
                    }
                }
                if (!bl) {
                    rrTj_12 = new rsE_2((rYB)this.id_throws[id_native[263]], this.rx(), this.re(), this.BO(), new rdn_3(rdy_3.rF));
                    ((rYB)this.id_throws[id_native[264]]).a_((an_3)rrTj_12);
                }
            }
        }
    }

    public boolean id_class(double d, double d2, double d3, boolean bl) {
        double d4 = this.rx();
        double d5 = this.re();
        double d6 = this.BO();
        double d7 = d2;
        boolean bl2 = id_break[236];
        rYB rYB2 = (rYB)this.id_throws[id_native[703]];
        rfH_2 rfH_22 = new rfH_2(d, d2, d3);
        if (rYB2.id_int(rfH_22)) {
            boolean bl3 = id_break[237];
            while (!bl3 && rfH_22.c_() > 0) {
                rfH_2 rfH_23 = rfH_22.id_break();
                xc_3 xc_32 = rYB2.id_byte(rfH_23);
                if (xc_32.id_byte().id_byte()) {
                    bl3 = id_break[238];
                    continue;
                }
                d7 -= id_protected[139];
                rfH_22 = rfH_23;
            }
            if (bl3) {
                this.id_case(d, d7, d3);
                if (rYB2.id_throws(this) && !rYB2.id_protected(this.rN())) {
                    bl2 = id_break[239];
                }
            }
        }
        if (!bl2) {
            this.id_case(d4, d5, d6);
            return id_break[240];
        }
        if (bl) {
            rYB2.id_class((an_3)this, id_finally[82]);
        }
        if (this instanceof aA_2) {
            ((aA_2)this).id_public().id_final();
        }
        return id_break[241];
    }

    public void id_class(rdn_3 rdn_32, int n) {
        if (!rdn_32.id_class() && this.id_return()) {
            if (rdn_32.id_native() == rkc_3.DRINK) {
                this.id_class(this.id_byte(rdn_32), id_implements[202], ((rYB)this.id_throws[iB_2.id_native[663]]).id_int.nextFloat() * id_implements[203] + id_implements[204]);
            }
            if (rdn_32.id_native() == rkc_3.EAT) {
                this.id_break(rdn_32, n);
                this.id_class(this.id_protected(rdn_32), id_implements[205] + id_implements[206] * (float)((Random)this.id_throws[id_native[664]]).nextInt(id_finally[79]), (((Random)this.id_throws[id_native[665]]).nextFloat() - ((Random)this.id_throws[id_native[666]]).nextFloat()) * id_implements[207] + id_implements[208]);
            }
        }
    }

    public boolean id_class(iB_2 iB_22, ay_3 ay_32) {
        return ay_32.id_class(this, iB_22);
    }

    public void id_class(rfH_2 rfH_22, boolean bl) {
    }

    public void id_class(rLY rLY2, boolean bl) {
        this.id_private();
        Boolean bl2 = id_break[69];
        this.id_private[iB_2.id_native[203]] = bl2;
        if (bl && !((rYB)this.id_throws[iB_2.id_native[204]]).id_continue) {
            rLR rLR2 = rLY2.id_class();
            rLR2.id_class(this, this.BT(), rLY2.id_byte());
            rLR2.id_break(this, this.BT(), rLY2.id_byte());
        }
        rrLI.id_break(this, rLY2, bl);
    }

    public rjU_2 id_class(double d, boolean bl, rjU_2 rjU_22) {
        if (!this.rw() && !this.PF()) {
            double d2 = bl && Math.abs(rjU_22.id_byte - id_protected[105]) >= id_protected[106] && Math.abs(rjU_22.id_byte - d / id_protected[107]) < id_protected[108] ? id_protected[109] : rjU_22.id_byte - d / id_protected[110];
            return new rjU_2(rjU_22.id_break, d2, rjU_22.id_protected);
        }
        return rjU_22;
    }

    public void id_default() {
        this.id_private();
        if ((Integer)this.id_private[id_native[489]] > 0) {
            iB_2 iB_22 = this;
            Integer n = (Integer)iB_22.id_private[id_native[490]] - id_break[162];
            iB_22.id_private[iB_2.id_native[491]] = n;
        }
        if (this.id_return()) {
            iB_2 iB_23 = this;
            Integer n = (Integer)iB_23.id_private[id_native[492]] + id_break[163];
            iB_23.id_private[iB_2.id_native[493]] = n;
        } else {
            Integer n = id_break[164];
            this.id_private[iB_2.id_native[494]] = n;
        }
        if (this.BL()) {
            Integer n = id_break[165];
            this.id_private[iB_2.id_native[495]] = n;
            iB_2 iB_24 = this;
            Integer n2 = (Integer)iB_24.id_private[id_native[496]] + id_break[166];
            iB_24.id_private[iB_2.id_native[497]] = n2;
        } else {
            Integer n = id_break[167];
            this.id_private[iB_2.id_native[498]] = n;
            iB_2 iB_25 = this;
            Integer n3 = (Integer)iB_25.id_private[id_native[499]] + id_break[168];
            iB_25.id_private[iB_2.id_native[500]] = n3;
        }
        if (this.Po()) {
            Integer n = id_break[169];
            this.id_private[iB_2.id_native[501]] = n;
            this.id_byte(this.rx(), this.re(), this.BO());
        }
        if ((Integer)this.id_private[id_native[502]] > 0) {
            double d = this.rx() + ((Double)this.id_private[id_native[503]] - this.rx()) / (double)((Integer)this.id_private[id_native[504]]).intValue();
            double d2 = this.re() + ((Double)this.id_private[id_native[505]] - this.re()) / (double)((Integer)this.id_private[id_native[506]]).intValue();
            double d3 = this.BO() + ((Double)this.id_private[id_native[507]] - this.BO()) / (double)((Integer)this.id_private[id_native[508]]).intValue();
            double d4 = rfU_2.id_case((Double)this.id_private[id_native[509]] - (double)((Float)this.id_throws[id_native[510]]).floatValue());
            Float f = Float.valueOf((float)((double)((Float)this.id_throws[id_native[511]]).floatValue() + d4 / (double)((Integer)this.id_private[id_native[512]]).intValue()));
            this.id_throws[iB_2.id_native[513]] = f;
            Float f2 = Float.valueOf((float)((double)((Float)this.id_throws[id_native[514]]).floatValue() + ((Double)this.id_private[id_native[515]] - (double)((Float)this.id_throws[id_native[516]]).floatValue()) / (double)((Integer)this.id_private[id_native[517]]).intValue()));
            this.id_throws[iB_2.id_native[518]] = f2;
            iB_2 iB_26 = this;
            Integer n = (Integer)iB_26.id_private[id_native[519]] - id_break[170];
            iB_26.id_private[iB_2.id_native[520]] = n;
            this.id_new(d, d2, d3);
            this.id_case(((Float)this.id_throws[id_native[521]]).floatValue(), ((Float)this.id_throws[id_native[522]]).floatValue());
        } else if (!this.id_try()) {
            this.id_byte(this.rv().id_class(id_protected[118]));
        }
        if ((Integer)this.id_private[id_native[523]] > 0) {
            Float f = Float.valueOf((float)((double)((Float)this.id_private[id_native[524]]).floatValue() + rfU_2.id_case((Double)this.id_private[id_native[525]] - (double)((Float)this.id_private[id_native[526]]).floatValue()) / (double)((Integer)this.id_private[id_native[527]]).intValue()));
            this.id_private[iB_2.id_native[528]] = f;
            iB_2 iB_27 = this;
            Integer n = (Integer)iB_27.id_private[id_native[529]] - id_break[171];
            iB_27.id_private[iB_2.id_native[530]] = n;
        }
        rjU_2 rjU_22 = this.rv();
        double d = rjU_22.id_break;
        double d5 = rjU_22.id_byte;
        double d6 = rjU_22.id_protected;
        if (Math.abs(rjU_22.id_break) < id_protected[119]) {
            d = id_protected[120];
        }
        if (Math.abs(rjU_22.id_byte) < id_protected[121]) {
            d5 = id_protected[122];
        }
        if (Math.abs(rjU_22.id_protected) < id_protected[123]) {
            d6 = id_protected[124];
        }
        this.id_catch(d, d5, d6);
        if (this.BK()) {
            Boolean bl = id_break[172];
            this.id_private[iB_2.id_native[531]] = bl;
            Float f = Float.valueOf(id_implements[184]);
            this.id_private[iB_2.id_native[532]] = f;
            Float f3 = Float.valueOf(id_implements[185]);
            this.id_private[iB_2.id_native[533]] = f3;
        } else if (this.id_try()) {
            this.Q();
        }
        if (((Boolean)this.id_private[id_native[534]]).booleanValue() && this.sr()) {
            double d7 = this.ry() ? this.id_break(rlG_2.id_byte) : this.id_break(rlG_2.id_break);
            boolean bl = this.rT() && d7 > id_protected[125] ? id_break[173] : id_break[174];
            double d8 = this.rI();
            if (!bl || ((Boolean)this.id_throws[id_native[535]]).booleanValue() && !(d7 > d8)) {
                if (!this.ry() || ((Boolean)this.id_throws[id_native[536]]).booleanValue() && !(d7 > d8)) {
                    if ((((Boolean)this.id_throws[id_native[537]]).booleanValue() || bl && d7 <= d8) && (Integer)this.id_private[id_native[538]] == 0) {
                        this.id_continue(id_break[175]);
                    }
                } else {
                    this.id_byte(rlG_2.id_byte);
                }
            } else {
                this.id_byte(rlG_2.id_break);
            }
        } else {
            Integer n = id_break[176];
            this.id_private[iB_2.id_native[539]] = n;
        }
        iB_2 iB_28 = this;
        Float f = Float.valueOf(((Float)iB_28.id_private[id_native[540]]).floatValue() * id_implements[186]);
        iB_28.id_private[iB_2.id_native[541]] = f;
        iB_2 iB_29 = this;
        Float f4 = Float.valueOf(((Float)iB_29.id_private[id_native[542]]).floatValue() * id_implements[187]);
        iB_29.id_private[iB_2.id_native[543]] = f4;
        this.id_super();
        rfl_3 rfl_32 = this.rN();
        this.id_private(new rjU_2(((Float)this.id_private[id_native[544]]).floatValue(), ((Float)this.id_private[id_native[545]]).floatValue(), ((Float)this.id_private[id_native[546]]).floatValue()));
        if ((Integer)this.id_private[id_native[547]] > 0) {
            iB_2 iB_210 = this;
            Integer n = (Integer)iB_210.id_private[id_native[548]] - id_break[177];
            iB_210.id_private[iB_2.id_native[549]] = n;
            this.id_class(rfl_32, this.rN());
        }
        this.SS();
        if (!((rYB)this.id_throws[iB_2.id_native[550]]).id_continue && this.BU() && this.Pk()) {
            this.id_break(rye_3.id_private, id_implements[188]);
        }
    }

    @Override
    public float t() {
        this.id_private();
        return ((Float)this.id_private[id_native[598]]).floatValue();
    }

    @Override
    public void j() {
        this.id_break(rye_3.id_volatile, id_implements[3]);
    }

    public rdn_3 ss() {
        return this.id_class(rXQ.MAINHAND);
    }

    @Override
    public void rf() {
        Boolean bl = ((Random)this.id_throws[id_native[596]]).nextDouble() >= this.id_class(iQ_2.id_byte) ? id_break[206] : id_break[207];
        this.id_throws[iB_2.id_native[597]] = bl;
    }

    private void id_void() {
        this.id_private();
        Float f = Float.valueOf(((Float)this.id_private[id_native[626]]).floatValue());
        this.id_private[iB_2.id_native[627]] = f;
        if (this.rP()) {
            Float f2 = Float.valueOf(Math.min(id_implements[198], ((Float)this.id_private[id_native[628]]).floatValue() + id_implements[199]));
            this.id_private[iB_2.id_native[629]] = f2;
        } else {
            Float f3 = Float.valueOf(Math.max(id_implements[200], ((Float)this.id_private[id_native[630]]).floatValue() - id_implements[201]));
            this.id_private[iB_2.id_native[631]] = f3;
        }
    }

    public void sh() {
    }

    public float id_break(float f, float f2, float f3) {
        boolean bl;
        this.id_private();
        float f4 = rfU_2.id_catch(f - ((Float)this.id_private[id_native[482]]).floatValue());
        iB_2 iB_22 = this;
        Float f5 = Float.valueOf(((Float)iB_22.id_private[id_native[483]]).floatValue() + f4 * id_implements[174]);
        iB_22.id_private[iB_2.id_native[484]] = f5;
        float f6 = rfU_2.id_catch(f3 - ((Float)this.id_private[id_native[485]]).floatValue());
        boolean bl2 = bl = f6 < id_implements[175] || f6 >= id_implements[176] ? id_break[160] : id_break[161];
        if (f6 < id_implements[177]) {
            f6 = id_implements[178];
        }
        if (f6 >= id_implements[179]) {
            f6 = id_implements[180];
        }
        Float f7 = Float.valueOf(f3 - f6);
        this.id_private[iB_2.id_native[486]] = f7;
        if (f6 * f6 > id_implements[181]) {
            iB_2 iB_23 = this;
            Float f8 = Float.valueOf(((Float)iB_23.id_private[id_native[487]]).floatValue() + f6 * id_implements[182]);
            iB_23.id_private[iB_2.id_native[488]] = f8;
        }
        if (bl) {
            f2 *= id_implements[183];
        }
        return f2;
    }

    public void id_break(rXQ rXQ2) {
        ((rYB)this.id_throws[id_native[718]]).id_class((an_3)this, iB_2.id_throws(rXQ2));
    }

    private void id_break(rXQ rXQ2, rdn_3 rdn_32) {
        this.id_private();
        ((rqs_3)this.id_private[id_native[481]]).set(rXQ2.id_break(), rdn_32);
    }

    public void id_break(rye_3 rye_32) {
        this.id_private();
        if (!((Boolean)this.id_throws[id_native[250]]).booleanValue() && !((Boolean)this.id_private[id_native[251]]).booleanValue()) {
            an_3 an_32 = rye_32.id_extends();
            iB_2 iB_22 = this.Sh();
            if ((Integer)this.id_private[id_native[252]] >= 0 && iB_22 != null) {
                iB_22.id_class(this, (int)((Integer)this.id_private[id_native[253]]), rye_32);
            }
            if (this.Sc()) {
                this.SQ();
            }
            Boolean bl = id_break[99];
            this.id_private[iB_2.id_native[254]] = bl;
            this.SW().id_throws();
            if ((rYB)this.id_throws[id_native[255]] instanceof rrEm_1) {
                if (an_32 != null) {
                    an_32.id_class((rrEm_1)((rYB)this.id_throws[id_native[256]]), this);
                }
                this.id_protected(rye_32);
                this.id_class(iB_22);
            }
            ((rYB)this.id_throws[id_native[257]]).id_class((an_3)this, id_finally[39]);
            this.id_class(iM_2.DYING);
        }
    }

    public void id_break(rhd_3 rhd_32) {
        this.id_private();
        rhd_3 rhd_33 = rhd_32;
        this.id_private[iB_2.id_native[116]] = rhd_33;
        Integer n = (int)((Integer)this.id_throws[id_native[117]]);
        this.id_private[iB_2.id_native[118]] = n;
    }

    private void id_break(rdn_3 rdn_32, int n) {
        for (int i = id_break[224]; i < n; ++i) {
            rjU_2 rjU_22 = new rjU_2(((double)((Random)this.id_throws[id_native[667]]).nextFloat() - id_protected[128]) * id_protected[129], Math.random() * id_protected[130] + id_protected[131], id_protected[132]);
            rjU_22 = rjU_22.id_class(-((Float)this.id_throws[id_native[668]]).floatValue() * id_implements[209]);
            rjU_22 = rjU_22.id_break(-((Float)this.id_throws[id_native[669]]).floatValue() * id_implements[210]);
            double d = (double)(-((Random)this.id_throws[id_native[670]]).nextFloat()) * id_protected[133] - id_protected[134];
            rjU_2 rjU_23 = new rjU_2(((double)((Random)this.id_throws[id_native[671]]).nextFloat() - id_protected[135]) * id_protected[136], d, id_protected[137]);
            rjU_23 = rjU_23.id_class(-((Float)this.id_throws[id_native[672]]).floatValue() * id_implements[211]);
            rjU_23 = rjU_23.id_break(-((Float)this.id_throws[id_native[673]]).floatValue() * id_implements[212]);
            rjU_23 = rjU_23.id_break(this.rx(), this.rH(), this.BO());
            ((rYB)this.id_throws[id_native[674]]).id_class(new rLk_1(rLQ.id_void, rdn_32), rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected, rjU_22.id_break, rjU_22.id_byte + id_protected[138], rjU_22.id_protected);
        }
    }

    public float id_break(iM_2 iM_22, ap_3 ap_32) {
        return super.id_class(iM_22, ap_32);
    }

    public rjU_2 id_break(rjU_2 rjU_22, float f) {
        this.id_private();
        this.id_class(this.id_byte(f), rjU_22);
        this.id_byte(this.id_finally(this.rv()));
        this.id_class(iG_2.SELF, this.rv());
        rjU_2 rjU_23 = this.rv();
        if ((((Boolean)this.id_throws[id_native[397]]).booleanValue() || ((Boolean)this.id_private[id_native[398]]).booleanValue()) && this.o_()) {
            rjU_23 = new rjU_2(rjU_23.id_break, id_protected[104], rjU_23.id_protected);
        }
        return rjU_23;
    }

    public boolean id_break(rLY rLY2) {
        this.id_private();
        if (!this.id_throws(rLY2)) {
            return id_break[55];
        }
        rLY rLY3 = (rLY)((Map)this.id_private[id_native[197]]).get(rLY2.id_class());
        if (rLY3 == null) {
            ((Map)this.id_private[id_native[198]]).put(rLY2.id_class(), rLY2);
            this.id_protected(rLY2);
            return id_break[56];
        }
        if (rLY3.id_break(rLY2)) {
            this.id_class(rLY3, id_break[57]);
            return id_break[58];
        }
        return id_break[59];
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        boolean bl;
        Object object;
        this.id_private();
        if (this.id_class(rye_32)) {
            return id_break[73];
        }
        if (((rYB)this.id_throws[iB_2.id_native[211]]).id_continue) {
            return id_break[74];
        }
        if (this.Sl()) {
            return id_break[75];
        }
        if (rye_32.id_int() && this.id_break(rLD.id_native)) {
            return id_break[76];
        }
        if (this.Sc() && !((rYB)this.id_throws[iB_2.id_native[212]]).id_continue) {
            this.SQ();
        }
        Integer n = id_break[77];
        this.id_private[iB_2.id_native[213]] = n;
        float f2 = f;
        if (!(rye_32 != rye_3.id_new && rye_32 != rye_3.id_continue || this.id_class(rXQ.HEAD).id_class())) {
            this.id_class(rXQ.HEAD).id_class((int)(f * id_implements[32] + ((Random)this.id_throws[id_native[214]]).nextFloat() * f * id_implements[33]), this, (T iB_22) -> iB_22.id_break(rXQ.HEAD));
            f *= id_implements[34];
        }
        boolean bl2 = id_break[78];
        float f3 = id_implements[35];
        if (f > id_implements[36] && this.id_case(rye_32)) {
            an_3 an_32;
            this.id_else(f);
            f3 = f;
            f = id_implements[37];
            if (!rye_32.id_break() && (an_32 = rye_32.id_finally()) instanceof iB_2) {
                this.id_protected((iB_2)an_32);
            }
            bl2 = id_break[79];
        }
        Float f4 = Float.valueOf(id_implements[38]);
        this.id_private[iB_2.id_native[215]] = f4;
        boolean bl3 = id_break[80];
        if ((float)((Integer)this.id_throws[id_native[216]]).intValue() > id_implements[39]) {
            if (f <= ((Float)this.id_private[id_native[217]]).floatValue()) {
                return id_break[81];
            }
            this.id_class(rye_32, f - ((Float)this.id_private[id_native[218]]).floatValue());
            Float f5 = Float.valueOf(f);
            this.id_private[iB_2.id_native[219]] = f5;
            bl3 = id_break[82];
        } else {
            Float f6 = Float.valueOf(f);
            this.id_private[iB_2.id_native[220]] = f6;
            Integer n2 = id_finally[25];
            this.id_throws[iB_2.id_native[221]] = n2;
            this.id_class(rye_32, f);
            Integer n3 = id_finally[26];
            this.id_private[iB_2.id_native[222]] = n3;
            Integer n4 = (int)((Integer)this.id_private[id_native[223]]);
            this.id_private[iB_2.id_native[224]] = n4;
        }
        Float f7 = Float.valueOf(id_implements[40]);
        this.id_private[iB_2.id_native[225]] = f7;
        an_3 an_33 = rye_32.id_extends();
        if (an_33 != null) {
            if (an_33 instanceof iB_2) {
                this.id_break((iB_2)an_33);
            }
            if (an_33 instanceof rhd_3) {
                Integer n5 = id_finally[27];
                this.id_private[iB_2.id_native[226]] = n5;
                rhd_3 rhd_32 = (rhd_3)an_33;
                this.id_private[iB_2.id_native[227]] = rhd_32;
            } else if (an_33 instanceof rOH && ((rOQ)(object = (rOH)an_33)).sZ()) {
                Integer n6 = id_finally[28];
                this.id_private[iB_2.id_native[228]] = n6;
                iB_2 iB_23 = ((rOQ)object).sF();
                if (iB_23 != null && iB_23.BC() == aI_2.rM) {
                    rhd_3 rhd_33 = (rhd_3)iB_23;
                    this.id_private[iB_2.id_native[229]] = rhd_33;
                } else {
                    Object var28_26 = null;
                    this.id_private[iB_2.id_native[230]] = var28_26;
                }
            }
        }
        if (bl3) {
            if (bl2) {
                ((rYB)this.id_throws[id_native[231]]).id_class((an_3)this, id_finally[29]);
            } else if (rye_32 instanceof rpX_2 && ((rpX_2)rye_32).id_goto()) {
                ((rYB)this.id_throws[id_native[232]]).id_class((an_3)this, id_finally[30]);
            } else {
                byte by = rye_32 == rye_3.id_private ? id_finally[31] : (rye_32.id_int() ? id_finally[32] : (rye_32 == rye_3.id_else ? id_finally[33] : id_finally[34]));
                ((rYB)this.id_throws[id_native[233]]).id_class((an_3)this, by);
            }
            if (rye_32 != rye_3.id_private && (!bl2 || f > id_implements[41])) {
                this.rf();
            }
            if (an_33 != null) {
                double d = an_33.rx() - this.rx();
                double d2 = an_33.BO() - this.BO();
                while (d * d + d2 * d2 < id_protected[33]) {
                    d = (Math.random() - Math.random()) * id_protected[34];
                    d2 = (Math.random() - Math.random()) * id_protected[35];
                }
                Float f8 = Float.valueOf((float)(rfU_2.id_protected(d2, d) * id_protected[36] - (double)((Float)this.id_throws[id_native[234]]).floatValue()));
                this.id_private[iB_2.id_native[235]] = f8;
                this.id_class(id_implements[42], d, d2);
            } else {
                Float f9 = Float.valueOf((int)(Math.random() * id_protected[37]) * id_native[236]);
                this.id_private[iB_2.id_native[237]] = f9;
            }
        }
        if (this.Sl()) {
            if (!this.id_catch(rye_32)) {
                object = this.Bt();
                if (bl3 && object != null) {
                    this.id_class((rqA_2)object, this.Si(), this.SN());
                }
                this.id_break(rye_32);
            }
        } else if (bl3) {
            this.id_throws(rye_32);
        }
        boolean bl4 = bl = !bl2 || f > id_implements[43] ? id_break[83] : id_break[84];
        if (bl) {
            rye_3 rye_33 = rye_32;
            this.id_private[iB_2.id_native[238]] = rye_33;
            Long l = ((rYB)this.id_throws[id_native[239]]).r();
            this.id_private[iB_2.id_native[240]] = l;
        }
        if (this instanceof rhN_2) {
            Oo_1.id_private.id_class((rhN_2)this, rye_32, f2, f, bl2);
            if (f3 > id_implements[44] && f3 < id_implements[45]) {
                ((rhN_2)this).id_class(rlB_2.id_static, Math.round(f3 * id_implements[46]));
            }
        }
        if (an_33 instanceof rhN_2) {
            Oo_1.id_catch.id_class((rhN_2)an_33, this, rye_32, f2, f, bl2);
        }
        return bl;
    }

    public double id_break(iJ_2 iJ_22) {
        return this.BT().id_protected(iJ_22);
    }

    public void id_break(rpm_3 rpm_32) {
        this.id_private();
        rdn_3 rdn_32 = this.id_protected(rpm_32);
        if (!rdn_32.id_class() && !this.id_return()) {
            rdn_3 rdn_33 = rdn_32;
            this.id_private[iB_2.id_native[636]] = rdn_33;
            Integer n = (int)((Integer)this.id_private[id_native[637]]);
            this.id_private[iB_2.id_native[638]] = n;
            Integer n2 = rdn_32.id_extends();
            this.id_private[iB_2.id_native[639]] = n2;
            if (!((rYB)this.id_throws[iB_2.id_native[640]]).id_continue) {
                this.id_byte(id_break[219], id_break[220]);
                this.id_byte(id_finally[78], rpm_32 == rpm_3.OFF_HAND ? id_break[221] : id_break[222]);
            }
        }
    }

    private void id_break(Map<rXQ, rdn_3> map) {
        rdn_3 rdn_32 = map.get((Object)rXQ.MAINHAND);
        rdn_3 rdn_33 = map.get((Object)rXQ.OFFHAND);
        if (rdn_32 != null && rdn_33 != null && rdn_3.id_break(rdn_32, this.id_protected(rXQ.OFFHAND)) && rdn_3.id_break(rdn_33, this.id_protected(rXQ.MAINHAND))) {
            ((rrEm_1)((rYB)this.id_throws[id_native[476]])).id_else().id_break(this, new rvQ_2(this, id_finally[65]));
            map.remove((Object)rXQ.MAINHAND);
            map.remove((Object)rXQ.OFFHAND);
            this.id_break(rXQ.MAINHAND, rdn_32.id_implements());
            this.id_break(rXQ.OFFHAND, rdn_33.id_implements());
        }
    }

    public boolean id_break(xc_3 xc_32) {
        return !xc_32.id_catch() || this.Sy() ? id_break[20] : id_break[21];
    }

    public void id_break(rdn_3 rdn_32) {
        if (!rdn_32.id_class()) {
            rqA_2 rqA_22 = rqn_3.id_default;
            rdb_3 rdb_32 = rdn_32.id_break();
            if (rdb_32 instanceof rxS_2) {
                rqA_22 = ((rxS_2)rdb_32).id_throws().id_break();
            } else if (rdb_32 == rdy_3.kc) {
                rqA_22 = rqn_3.id_short;
            }
            this.id_class(rqA_22, id_implements[25], id_implements[26]);
        }
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        Object object;
        this.id_private();
        this.id_return(rcd_32.id_finally(id_class[10]));
        if (rcd_32.id_byte(id_class[11], id_finally[10]) && (rYB)this.id_throws[id_native[137]] != null && !((rYB)this.id_throws[iB_2.id_native[138]]).id_continue) {
            this.BT().id_class(rcd_32.id_protected(id_class[12], id_finally[11]));
        }
        if (rcd_32.id_byte(id_class[13], id_finally[12])) {
            object = rcd_32.id_protected(id_class[14], id_finally[13]);
            for (int i = id_break[36]; i < ((rcy_3)object).size(); ++i) {
                rcd_3 rcd_33 = ((rcy_3)object).id_class(i);
                rLY rLY2 = rLY.id_break(rcd_33);
                if (rLY2 == null) continue;
                ((Map)this.id_private[id_native[139]]).put(rLY2.id_class(), rLY2);
            }
        }
        if (rcd_32.id_byte(id_class[15], id_finally[14])) {
            this.id_public(rcd_32.id_finally(id_class[16]));
        }
        Integer n = rcd_32.id_catch(id_class[17]);
        this.id_private[iB_2.id_native[140]] = n;
        Integer n2 = rcd_32.id_catch(id_class[18]);
        this.id_private[iB_2.id_native[141]] = n2;
        Integer n3 = rcd_32.id_private(id_class[19]);
        this.id_private[iB_2.id_native[142]] = n3;
        if (rcd_32.id_byte(id_class[20], id_finally[15])) {
            boolean bl;
            object = rcd_32.id_native(id_class[21]);
            rnB_2 rnB_22 = ((rYB)this.id_throws[id_native[143]]).id_package().id_throws((String)object);
            boolean bl2 = bl = rnB_22 != null && ((rYB)this.id_throws[id_native[144]]).id_package().id_class(this.rz(), rnB_22) ? id_break[37] : id_break[38];
            if (!bl) {
                ((Logger)id_case[id_native[145]]).warn(id_class[22], object);
            }
        }
        if (rcd_32.id_new(id_class[23])) {
            this.id_break(id_finally[16], id_break[39]);
        }
        if (rcd_32.id_byte(id_class[24], id_finally[17]) && rcd_32.id_byte(id_class[25], id_finally[18]) && rcd_32.id_byte(id_class[26], id_finally[19])) {
            object = new rfH_2(rcd_32.id_private(id_class[27]), rcd_32.id_private(id_class[28]), rcd_32.id_private(id_class[29]));
            this.id_catch((rfH_2)object);
            ((rmE_2)this.id_throws[id_native[146]]).id_break((rut_3)id_case[id_native[147]], iM_2.SLEEPING);
            if (!((Boolean)this.id_throws[id_native[148]]).booleanValue()) {
                this.id_class((rfH_2)object);
            }
        }
        if (rcd_32.id_byte(id_class[30], id_finally[20])) {
            iZ_2<?> iZ_22;
            this.id_private[iB_2.id_native[149]] = iZ_22 = this.id_class(new Dynamic((DynamicOps)rcf_3.id_class, (Object)rcd_32.id_byte(id_class[31])));
        }
    }

    public boolean id_break(rLR rLR2) {
        this.id_private();
        return ((Map)this.id_private[id_native[195]]).containsKey(rLR2);
    }

    public void id_break(iB_2 iB_22) {
        this.id_private();
        iB_2 iB_23 = iB_22;
        this.id_private[iB_2.id_native[119]] = iB_23;
        Integer n = (int)((Integer)this.id_throws[id_native[120]]);
        this.id_private[iB_2.id_native[121]] = n;
    }

    public void id_throws(iB_2 iB_22) {
        iB_22.id_class(id_implements[47], iB_22.rx() - this.rx(), iB_22.BO() - this.BO());
    }

    public void id_throws(rfH_2 rfH_22) {
        int n = eA_2.id_class(eY_2.id_finally, this);
        if (n > 0) {
            eD_2.id_class(this, (rYB)this.id_throws[id_native[104]], rfH_22, n);
        }
        if (this.id_break(this.Pl())) {
            this.SI();
        }
        this.Ba();
    }

    public void id_throws(rye_3 rye_32) {
        rqA_2 rqA_22 = this.id_byte(rye_32);
        if (rqA_22 != null) {
            this.id_class(rqA_22, this.Si(), this.SN());
        }
    }

    private static byte id_throws(rXQ rXQ2) {
        switch (((int[])iS_2.id_class[id_native[717]])[rXQ2.ordinal()]) {
            case 1: {
                return id_finally[84];
            }
            case 2: {
                return id_finally[85];
            }
            case 3: {
                return id_finally[86];
            }
            case 4: {
                return id_finally[87];
            }
            case 5: {
                return id_finally[88];
            }
            case 6: {
                return id_finally[89];
            }
        }
        return id_finally[90];
    }

    public float id_throws(rye_3 rye_32, float f) {
        int n;
        int n2;
        float f2;
        float f3;
        float f4;
        if (rye_32.id_implements()) {
            return f;
        }
        if (this.id_break(rLD.id_extends) && rye_32 != rye_3.id_volatile && (f4 = (f3 = f) - (f = Math.max((f2 = f * (float)(n2 = id_finally[44] - (n = (this.id_byte(rLD.id_extends).id_byte() + id_break[119]) * id_finally[43]))) / id_implements[62], id_implements[63]))) > id_implements[64] && f4 < id_implements[65]) {
            if (this instanceof rhN_2) {
                ((rhN_2)this).id_class(rlB_2.id_short, Math.round(f4 * id_implements[66]));
            } else if (rye_32.id_extends() instanceof rhN_2) {
                ((rhN_2)rye_32.id_extends()).id_class(rlB_2.id_float, Math.round(f4 * id_implements[67]));
            }
        }
        if (f <= id_implements[68]) {
            return id_implements[69];
        }
        n = eA_2.id_class(this.PV(), rye_32);
        if (n > 0) {
            f = ryg_3.id_class(f, n);
        }
        return f;
    }

    @Override
    public float id_throws(float f) {
        this.id_private();
        return f == id_implements[193] ? ((Float)this.id_private[id_native[588]]).floatValue() : rfU_2.id_catch(f, ((Float)this.id_private[id_native[589]]).floatValue(), ((Float)this.id_private[id_native[590]]).floatValue());
    }

    public boolean id_throws(rLY rLY2) {
        if (this.sG() == aL_2.id_break) {
            rLR rLR2 = rLY2.id_class();
            return rLR2 != rLD.id_finally && rLR2 != rLD.id_super ? id_break[60] : id_break[61];
        }
        return id_break[62];
    }

    public boolean id_throws(rdn_3 rdn_32) {
        return id_break[244];
    }

    private static /* synthetic */ void ntfClinit() {
        iB_2.id_static();
        iB_2.id_float();
        iB_2.id_public();
        iB_2.id_continue();
        iB_2.id_package();
        iB_2.id_new();
        iB_2.id_int();
        iB_2.id_instanceof();
    }

    public void Sm() {
        this.id_byte(this.rv().id_break(id_protected[53], id_protected[54], id_protected[55]));
    }

    public boolean Sc() {
        return this.Bg().isPresent();
    }

    public void Sk() {
        Object object;
        this.id_private();
        Iterator iterator = ((Map)this.id_private[id_native[150]]).keySet().iterator();
        try {
            while (iterator.hasNext()) {
                rLR rLR2 = (rLR)iterator.next();
                object = (rLY)((Map)this.id_private[id_native[151]]).get(rLR2);
                if (!((rLY)object).id_class(this, () -> this.id_case((rLY)object))) {
                    if (((rYB)this.id_throws[iB_2.id_native[152]]).id_continue) continue;
                    iterator.remove();
                    this.id_class((rLY)object);
                    continue;
                }
                if (((rLY)object).id_break() % id_native[153] != 0) continue;
                this.id_class((rLY)object, id_break[40]);
            }
        }
        catch (ConcurrentModificationException concurrentModificationException) {
            // empty catch block
        }
        if (((Boolean)this.id_private[id_native[154]]).booleanValue()) {
            if (!((rYB)this.id_throws[iB_2.id_native[155]]).id_continue) {
                this.SA();
            }
            Boolean bl = id_break[41];
            this.id_private[iB_2.id_native[156]] = bl;
        }
        Integer n = (int)((Integer)this.id_private[id_native[157]]);
        this.id_private[iB_2.id_native[158]] = n;
        Integer n2 = (int)((Integer)((rmE_2)this.id_throws[id_native[159]]).id_class((rut_3)id_catch[id_native[160]]));
        this.id_private[iB_2.id_native[161]] = n2;
        boolean bl = (Boolean)((rmE_2)this.id_throws[id_native[162]]).id_class((rut_3)id_catch[id_native[163]]);
        if ((Integer)this.id_private[id_native[164]] > 0) {
            boolean bl2 = this.Pp() ? (((Random)this.id_throws[id_native[165]]).nextInt(id_finally[21]) == 0 ? id_break[42] : id_break[43]) : ((Random)this.id_throws[id_native[166]]).nextBoolean();
            if (bl) {
                bl2 &= ((Random)this.id_throws[id_native[167]]).nextInt(id_finally[22]) == 0 ? id_break[44] : id_break[45];
            }
            if (bl2 && (Integer)this.id_private[id_native[168]] > 0) {
                double d = (double)((Integer)this.id_private[id_native[169]] >> id_finally[23] & id_native[170]) / id_protected[24];
                double d2 = (double)((Integer)this.id_private[id_native[171]] >> id_finally[24] & id_native[172]) / id_protected[25];
                double d3 = (double)((Integer)this.id_private[id_native[173]] & id_native[174]) / id_protected[26];
                ((rYB)this.id_throws[id_native[175]]).id_class(bl ? rLQ.id_class : rLQ.id_else, this.id_break(id_protected[27]), this.Ph(), this.id_protected(id_protected[28]), d, d2, d3);
            }
        } else if (((rYB)this.id_throws[iB_2.id_native[176]]).id_continue && this != (cb_3)QY.id_instanceof().id_class[id_native[177]] && !((Map)this.id_private[id_native[178]]).isEmpty() && (Integer)this.id_private[id_native[179]] > 0) {
            object = ((Map)this.id_private[id_native[180]]).values().iterator();
            while (object.hasNext()) {
                rLY rLY2 = (rLY)object.next();
                this.id_class(rLY2);
                object.remove();
            }
        }
    }

    public Collection<rLY> So() {
        this.id_private();
        return ((Map)this.id_private[id_native[193]]).values();
    }

    public rpm_3 P() {
        return ((Byte)((rmE_2)this.id_throws[id_native[606]]).id_class((rut_3)id_catch[id_native[607]]) & id_finally[73]) > 0 ? rpm_3.OFF_HAND : rpm_3.MAIN_HAND;
    }

    public int BD() {
        this.id_private();
        return (Integer)this.id_private[id_native[702]];
    }

    private rjU_2 id_finally(rjU_2 rjU_22) {
        if (this.o_()) {
            Float f = Float.valueOf(id_implements[138]);
            this.id_throws[iB_2.id_native[399]] = f;
            double d = rfU_2.id_class(rjU_22.id_break, id_protected[111], id_protected[112]);
            double d2 = rfU_2.id_class(rjU_22.id_protected, id_protected[113], id_protected[114]);
            double d3 = Math.max(rjU_22.id_byte, id_protected[115]);
            if (d3 < id_protected[116] && !this.sS().id_class(xu_3.hU) && this.id_transient() && this instanceof rhd_3) {
                d3 = id_protected[117];
            }
            rjU_22 = new rjU_2(d, d3, d2);
        }
        return rjU_22;
    }

    public static String id_finally(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{93, 77, -82, -81, 24, 125, -59, -5}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_catch(rfH_2 rfH_22) {
        ((rmE_2)this.id_throws[id_native[707]]).id_break((rut_3)id_catch[id_native[708]], Optional.of(rfH_22));
    }

    private void id_catch(rdn_3 rdn_32) {
        if (!rdn_32.id_class()) {
            if (!this.BF()) {
                ((rYB)this.id_throws[id_native[248]]).id_class(this.rx(), this.re(), this.BO(), rqn_3.Eg, this.Pr(), id_implements[50], id_implements[51] + ((rYB)this.id_throws[iB_2.id_native[249]]).id_int.nextFloat() * id_implements[52], id_break[98]);
            }
            this.id_break(rdn_32, id_finally[38]);
        }
    }

    private boolean id_catch(rye_3 rye_32) {
        if (rye_32.id_private()) {
            return id_break[85];
        }
        rdn_3 rdn_32 = null;
        Object object = rpm_3.values();
        int n = ((rpm_3[])object).length;
        for (int i = id_break[86]; i < n; ++i) {
            rpm_3 rpm_32 = object[i];
            rdn_3 rdn_33 = this.id_protected(rpm_32);
            if (rdn_33.id_break() != rdy_3.kL) continue;
            rdn_32 = rdn_33.id_implements();
            rdn_33.id_catch(id_break[87]);
            break;
        }
        if (rdn_32 != null) {
            iB_2 iB_22 = this;
            if (iB_22 instanceof rhN_2) {
                object = (rhN_2)iB_22;
                ((rhd_3)object).id_class(rlB_2.id_byte.id_break(rdy_3.kL));
                Oo_1.id_instanceof.id_class((rhN_2)object, rdn_32);
            }
            this.id_public(id_implements[48]);
            this.SY();
            this.id_break(new rLY(rLD.id_finally, id_native[241], id_break[88]));
            this.id_break(new rLY(rLD.id_synchronized, id_finally[35], id_break[89]));
            this.id_break(new rLY(rLD.id_native, id_native[242], id_break[90]));
            ((rYB)this.id_throws[id_native[243]]).id_class((an_3)this, id_finally[36]);
        }
        return rdn_32 != null ? id_break[91] : id_break[92];
    }

    public rfl_3 id_catch(iM_2 iM_22) {
        ap_3 ap_32 = this.a_(iM_22);
        return new rfl_3(-ap_32.id_class / id_implements[213], id_protected[140], -ap_32.id_class / id_implements[214], ap_32.id_class / id_implements[215], ap_32.id_break, ap_32.id_class / id_implements[216]);
    }

    public boolean id_catch(iB_2 iB_22) {
        return id_break[47];
    }

    public boolean id_extends(int n) {
        this.id_private();
        if (this.id_return() && !((rdn_3)this.id_private[id_native[697]]).id_class()) {
            rdb_3 rdb_32 = ((rdn_3)this.id_private[id_native[698]]).id_break();
            if (rdb_32.id_byte((rdn_3)this.id_private[id_native[699]]) != rkc_3.BLOCK) {
                return id_break[230];
            }
            return rdb_32.id_break((rdn_3)this.id_private[id_native[700]]) - (Integer)this.id_private[id_native[701]] >= n ? id_break[231] : id_break[232];
        }
        return id_break[233];
    }

    private boolean id_goto() {
        return this.Bg().map(rfH_22 -> ((rYB)this.id_throws[id_native[736]]).id_byte((rfH_2)rfH_22).id_break() instanceof xb_3).orElse(id_break[247]);
    }

    public float id_goto(float f) {
        this.id_private();
        float f2 = ((Float)this.id_private[id_native[591]]).floatValue() - ((Float)this.id_private[id_native[592]]).floatValue();
        if (f2 < id_implements[194]) {
            f2 += id_implements[195];
        }
        return ((Float)this.id_private[id_native[593]]).floatValue() + f2 * f;
    }

    public double id_goto(an_3 an_32) {
        double d = id_protected[29];
        if (this.Pw()) {
            d *= id_protected[30];
        }
        if (this.Pp()) {
            float f = this.Bp();
            if (f < id_implements[27]) {
                f = id_implements[28];
            }
            d *= id_protected[31] * (double)f;
        }
        if (an_32 != null) {
            rdn_3 rdn_32 = this.id_class(rXQ.HEAD);
            rdb_3 rdb_32 = rdn_32.id_break();
            aI_2<?> aI_22 = an_32.BC();
            if (aI_22 == aI_2.A && rdb_32 == rdy_3.dh || aI_22 == aI_2.rs && rdb_32 == rdy_3.dx || aI_22 == aI_2.id_volatile && rdb_32 == rdy_3.dd) {
                d *= id_protected[32];
            }
        }
        return d;
    }

    public rdn_3 id_case(rdn_3 rdn_32) {
        return rdn_3.id_break;
    }

    private boolean id_case(rye_3 rye_32) {
        rrTR rrTR2;
        an_3 an_32 = rye_32.id_finally();
        boolean bl = id_break[93];
        if (an_32 instanceof rhm_3 && ((rhm_3)(rrTR2 = (rhm_3)an_32)).id_package() > 0) {
            bl = id_break[94];
        }
        if (!rye_32.id_case() && this.id_extends(id_finally[37]) && !bl && (rrTR2 = rye_32.id_return()) != null) {
            rjU_2 rjU_22 = this.id_break(id_implements[49]);
            rjU_2 rjU_23 = ((rjU_2)rrTR2).id_class(this.Ps()).id_protected();
            rjU_23 = new rjU_2(rjU_23.id_break, id_protected[38], rjU_23.id_protected);
            return rjU_23.id_break(rjU_22) < id_protected[39] ? id_break[95] : id_break[96];
        }
        return id_break[97];
    }

    public void id_case(rfH_2 rfH_22) {
        xc_3 xc_32;
        if (this.Pm()) {
            this.BH();
        }
        if ((xc_32 = ((rYB)this.id_throws[id_native[711]]).id_byte(rfH_22)).id_break() instanceof xb_3) {
            ((rYB)this.id_throws[id_native[712]]).id_class(rfH_22, (xc_3)xc_32.id_class(xb_3.id_final, id_break[245]), (int)id_finally[83]);
        }
        this.id_class(iM_2.SLEEPING);
        this.id_class(rfH_22);
        this.id_catch(rfH_22);
        this.id_byte(rjU_2.id_class);
        Boolean bl = id_break[246];
        this.id_throws[iB_2.id_native[713]] = bl;
    }

    private rdn_3 id_case(rXQ rXQ2) {
        this.id_private();
        return (rdn_3)((rqs_3)this.id_private[id_native[478]]).get(rXQ2.id_break());
    }

    private /* synthetic */ void id_case(rLY rLY2) {
        this.id_class(rLY2, id_break[254]);
    }

    public void id_case(iB_2 iB_22) {
    }

    private static void id_continue() {
        short[] sArray = new short[738];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[2] = 3;
        sArray[3] = 4;
        sArray[4] = 20;
        sArray[5] = 29;
        sArray[6] = 53;
        sArray[7] = 61;
        sArray[8] = 66;
        sArray[10] = 2;
        sArray[11] = 22;
        sArray[12] = 21;
        sArray[13] = 15;
        sArray[14] = 15;
        sArray[15] = 25;
        sArray[16] = 16;
        sArray[17] = 26;
        sArray[18] = 37;
        sArray[19] = 72;
        sArray[20] = 72;
        sArray[21] = 49;
        sArray[22] = 3;
        sArray[23] = 49;
        sArray[24] = 5;
        sArray[25] = 49;
        sArray[26] = 6;
        sArray[27] = 49;
        sArray[28] = 7;
        sArray[29] = 49;
        sArray[30] = 8;
        sArray[31] = 49;
        sArray[32] = 4;
        sArray[33] = 49;
        sArray[34] = 9;
        sArray[35] = 7;
        sArray[36] = 31;
        sArray[37] = 7;
        sArray[38] = 31;
        sArray[39] = 31;
        sArray[40] = 7;
        sArray[41] = 71;
        sArray[42] = 70;
        sArray[43] = 15;
        sArray[44] = 14;
        sArray[45] = 48;
        sArray[46] = 7;
        sArray[47] = 7;
        sArray[48] = 7;
        sArray[49] = 7;
        sArray[50] = 7;
        sArray[51] = 18;
        sArray[52] = 7;
        sArray[53] = 40;
        sArray[54] = 40;
        sArray[55] = 40;
        sArray[56] = 40;
        sArray[57] = 40;
        sArray[58] = 40;
        sArray[59] = 7;
        sArray[60] = 7;
        sArray[61] = 7;
        sArray[62] = 65;
        sArray[63] = 65;
        sArray[64] = 10;
        sArray[65] = 10;
        sArray[66] = 10;
        sArray[67] = 47;
        sArray[68] = 47;
        sArray[69] = 47;
        sArray[70] = 31;
        sArray[71] = 31;
        sArray[72] = 31;
        sArray[73] = 30;
        sArray[74] = 56;
        sArray[75] = 56;
        sArray[76] = 56;
        sArray[77] = 54;
        sArray[78] = 54;
        sArray[79] = 41;
        sArray[80] = 55;
        sArray[81] = 36;
        sArray[82] = 37;
        sArray[83] = 23;
        sArray[84] = 24;
        sArray[85] = 25;
        sArray[86] = 27;
        sArray[87] = 15;
        sArray[88] = 17;
        sArray[89] = 16;
        sArray[90] = 18;
        sArray[91] = 26;
        sArray[92] = 28;
        sArray[93] = 41;
        sArray[94] = 7;
        sArray[95] = 40;
        sArray[96] = 40;
        sArray[97] = 40;
        sArray[98] = 40;
        sArray[99] = 40;
        sArray[100] = 7;
        sArray[101] = 1;
        sArray[102] = 1;
        sArray[103] = 1;
        sArray[104] = 7;
        sArray[105] = 13;
        sArray[106] = 13;
        sArray[107] = 13;
        sArray[108] = 40;
        sArray[109] = 40;
        sArray[110] = 40;
        sArray[111] = 7;
        sArray[112] = 40;
        sArray[113] = 40;
        sArray[114] = 54;
        sArray[115] = 55;
        sArray[116] = 30;
        sArray[117] = 41;
        sArray[118] = 31;
        sArray[119] = 54;
        sArray[120] = 41;
        sArray[121] = 55;
        sArray[122] = 56;
        sArray[123] = 57;
        sArray[124] = 56;
        sArray[125] = 56;
        sArray[126] = 41;
        sArray[127] = 57;
        sArray[128] = 33;
        sArray[129] = 33;
        sArray[130] = 10;
        sArray[131] = 55;
        sArray[132] = 13;
        sArray[133] = 2;
        sArray[134] = 2;
        sArray[135] = 72;
        sArray[137] = 7;
        sArray[138] = 7;
        sArray[139] = 2;
        sArray[140] = 10;
        sArray[141] = 13;
        sArray[142] = 55;
        sArray[143] = 7;
        sArray[144] = 7;
        sArray[146] = 49;
        sArray[147] = 11;
        sArray[148] = 48;
        sArray[149] = 72;
        sArray[150] = 2;
        sArray[151] = 2;
        sArray[152] = 7;
        sArray[153] = 600;
        sArray[154] = 53;
        sArray[155] = 7;
        sArray[156] = 53;
        sArray[157] = 79;
        sArray[158] = 78;
        sArray[159] = 49;
        sArray[160] = 5;
        sArray[161] = 79;
        sArray[162] = 49;
        sArray[163] = 6;
        sArray[164] = 79;
        sArray[165] = 40;
        sArray[166] = 40;
        sArray[167] = 40;
        sArray[168] = 79;
        sArray[169] = 79;
        sArray[170] = 255;
        sArray[171] = 79;
        sArray[172] = 255;
        sArray[173] = 79;
        sArray[174] = 255;
        sArray[175] = 7;
        sArray[176] = 7;
        sArray[177] = 57;
        sArray[178] = 2;
        sArray[179] = 78;
        sArray[180] = 2;
        sArray[181] = 2;
        sArray[182] = 2;
        sArray[183] = 49;
        sArray[184] = 6;
        sArray[185] = 49;
        sArray[186] = 5;
        sArray[187] = 49;
        sArray[188] = 6;
        sArray[189] = 49;
        sArray[190] = 5;
        sArray[191] = 7;
        sArray[192] = 2;
        sArray[193] = 2;
        sArray[194] = 2;
        sArray[195] = 2;
        sArray[196] = 2;
        sArray[197] = 2;
        sArray[198] = 2;
        sArray[199] = 2;
        sArray[200] = 2;
        sArray[201] = 53;
        sArray[202] = 7;
        sArray[203] = 53;
        sArray[204] = 7;
        sArray[205] = 53;
        sArray[206] = 7;
        sArray[207] = 49;
        sArray[208] = 4;
        sArray[209] = 49;
        sArray[210] = 4;
        sArray[211] = 7;
        sArray[212] = 7;
        sArray[213] = 33;
        sArray[214] = 40;
        sArray[215] = 18;
        sArray[216] = 47;
        sArray[217] = 40;
        sArray[218] = 40;
        sArray[219] = 40;
        sArray[220] = 40;
        sArray[221] = 47;
        sArray[222] = 11;
        sArray[223] = 11;
        sArray[224] = 10;
        sArray[225] = 12;
        sArray[226] = 31;
        sArray[227] = 30;
        sArray[228] = 31;
        sArray[229] = 30;
        sArray[230] = 30;
        sArray[231] = 7;
        sArray[232] = 7;
        sArray[233] = 7;
        sArray[234] = 15;
        sArray[235] = 12;
        sArray[236] = 180;
        sArray[237] = 12;
        sArray[238] = 67;
        sArray[239] = 7;
        sArray[240] = 68;
        sArray[241] = 900;
        sArray[242] = 800;
        sArray[243] = 7;
        sArray[244] = 7;
        sArray[245] = 68;
        sArray[246] = 67;
        sArray[247] = 67;
        sArray[248] = 7;
        sArray[249] = 7;
        sArray[250] = 27;
        sArray[251] = 32;
        sArray[252] = 39;
        sArray[253] = 39;
        sArray[254] = 32;
        sArray[255] = 7;
        sArray[256] = 7;
        sArray[257] = 7;
        sArray[258] = 7;
        sArray[259] = 7;
        sArray[260] = 7;
        sArray[261] = 7;
        sArray[262] = 7;
        sArray[263] = 7;
        sArray[264] = 7;
        sArray[265] = 31;
        sArray[266] = 7;
        sArray[267] = 7;
        sArray[268] = 31;
        sArray[269] = 7;
        sArray[270] = 30;
        sArray[271] = 7;
        sArray[272] = 7;
        sArray[273] = 7;
        sArray[274] = 7;
        sArray[275] = 40;
        sArray[276] = 30;
        sArray[277] = 30;
        sArray[278] = 30;
        sArray[279] = 57;
        sArray[280] = 20;
        sArray[281] = 66;
        sArray[282] = 66;
        sArray[283] = 66;
        sArray[284] = 66;
        sArray[285] = 7;
        sArray[286] = 7;
        sArray[287] = 27;
        sArray[288] = 27;
        sArray[289] = 13;
        sArray[290] = 7;
        sArray[291] = 11;
        sArray[292] = 11;
        sArray[293] = 10;
        sArray[294] = 12;
        sArray[295] = 1;
        sArray[296] = 1;
        sArray[297] = 1;
        sArray[298] = 30;
        sArray[299] = 30;
        sArray[300] = 54;
        sArray[301] = 54;
        sArray[302] = 49;
        sArray[303] = 7;
        sArray[304] = 49;
        sArray[305] = 7;
        sArray[306] = 49;
        sArray[307] = 8;
        sArray[308] = 49;
        sArray[309] = 8;
        sArray[310] = 5;
        sArray[311] = 7;
        sArray[312] = 7;
        sArray[313] = 7;
        sArray[314] = 5;
        sArray[315] = 6;
        sArray[316] = 7;
        sArray[317] = 7;
        sArray[318] = 18;
        sArray[319] = 47;
        sArray[320] = 11;
        sArray[321] = 11;
        sArray[322] = 10;
        sArray[323] = 12;
        sArray[324] = 40;
        sArray[325] = 40;
        sArray[326] = 40;
        sArray[327] = 40;
        sArray[328] = 40;
        sArray[329] = 40;
        sArray[330] = 7;
        sArray[331] = 7;
        sArray[332] = 128;
        sArray[333] = 128;
        sArray[334] = 40;
        sArray[335] = 40;
        sArray[336] = 40;
        sArray[337] = 8;
        sArray[338] = 40;
        sArray[339] = 9;
        sArray[340] = 40;
        sArray[341] = 10;
        sArray[342] = 40;
        sArray[343] = 7;
        sArray[344] = 5;
        sArray[345] = 7;
        sArray[346] = 7;
        sArray[347] = 7;
        sArray[348] = 7;
        sArray[349] = 5;
        sArray[350] = 7;
        sArray[351] = 7;
        sArray[352] = 15;
        sArray[355] = 2;
        sArray[356] = 2;
        sArray[357] = 40;
        sArray[358] = 40;
        sArray[359] = 40;
        sArray[360] = 40;
        sArray[361] = 27;
        sArray[362] = 7;
        sArray[364] = 57;
        sArray[365] = 57;
        sArray[366] = 59;
        sArray[367] = 31;
        sArray[368] = 7;
        sArray[369] = 57;
        sArray[371] = 20;
        sArray[372] = 23;
        sArray[373] = 23;
        sArray[374] = 23;
        sArray[375] = 31;
        sArray[376] = 23;
        sArray[377] = 7;
        sArray[378] = 20;
        sArray[379] = 7;
        sArray[380] = 7;
        sArray[381] = 20;
        sArray[383] = 31;
        sArray[384] = 7;
        sArray[385] = 7;
        sArray[386] = 18;
        sArray[387] = 17;
        sArray[388] = 8;
        sArray[389] = 9;
        sArray[390] = 10;
        sArray[391] = 18;
        sArray[392] = 18;
        sArray[393] = 18;
        sArray[394] = 19;
        sArray[395] = 18;
        sArray[396] = 19;
        sArray[397] = 23;
        sArray[398] = 41;
        sArray[399] = 31;
        sArray[400] = 20;
        sArray[401] = 29;
        sArray[402] = 58;
        sArray[403] = 58;
        sArray[404] = 75;
        sArray[405] = 75;
        sArray[406] = 7;
        sArray[407] = 8;
        sArray[408] = 8;
        sArray[409] = 8;
        sArray[410] = 8;
        sArray[411] = 8;
        sArray[412] = 9;
        sArray[413] = 9;
        sArray[414] = 9;
        sArray[415] = 9;
        sArray[416] = 9;
        sArray[417] = 41;
        sArray[418] = 65;
        sArray[419] = 8;
        sArray[420] = 10;
        sArray[421] = 23;
        sArray[422] = 35;
        sArray[423] = 34;
        sArray[424] = 15;
        sArray[425] = 20;
        sArray[426] = 35;
        sArray[427] = 35;
        sArray[428] = 35;
        sArray[429] = 15;
        sArray[430] = 17;
        sArray[431] = 17;
        sArray[432] = 17;
        sArray[433] = 15;
        sArray[434] = 17;
        sArray[435] = 17;
        sArray[436] = 17;
        sArray[437] = 23;
        sArray[438] = 24;
        sArray[439] = 24;
        sArray[440] = 24;
        sArray[441] = 23;
        sArray[442] = 24;
        sArray[443] = 24;
        sArray[444] = 24;
        sArray[445] = 16;
        sArray[446] = 18;
        sArray[447] = 18;
        sArray[448] = 18;
        sArray[449] = 16;
        sArray[450] = 18;
        sArray[451] = 18;
        sArray[452] = 18;
        sArray[453] = 26;
        sArray[454] = 28;
        sArray[455] = 28;
        sArray[456] = 28;
        sArray[457] = 26;
        sArray[458] = 28;
        sArray[459] = 28;
        sArray[460] = 28;
        sArray[461] = 25;
        sArray[462] = 27;
        sArray[463] = 27;
        sArray[464] = 27;
        sArray[465] = 25;
        sArray[466] = 27;
        sArray[467] = 27;
        sArray[468] = 27;
        sArray[469] = 36;
        sArray[470] = 36;
        sArray[471] = 64;
        sArray[472] = 64;
        sArray[473] = 64;
        sArray[474] = 16;
        sArray[476] = 7;
        sArray[477] = 7;
        sArray[478] = 4;
        sArray[479] = 4;
        sArray[480] = 3;
        sArray[481] = 3;
        sArray[482] = 23;
        sArray[483] = 23;
        sArray[484] = 23;
        sArray[485] = 23;
        sArray[486] = 23;
        sArray[487] = 23;
        sArray[488] = 23;
        sArray[489] = 59;
        sArray[490] = 59;
        sArray[491] = 59;
        sArray[492] = 73;
        sArray[493] = 73;
        sArray[494] = 73;
        sArray[495] = 77;
        sArray[496] = 76;
        sArray[497] = 76;
        sArray[498] = 76;
        sArray[499] = 77;
        sArray[500] = 77;
        sArray[501] = 45;
        sArray[502] = 45;
        sArray[503] = 46;
        sArray[504] = 45;
        sArray[505] = 47;
        sArray[506] = 45;
        sArray[507] = 48;
        sArray[508] = 45;
        sArray[509] = 49;
        sArray[510] = 15;
        sArray[511] = 15;
        sArray[512] = 45;
        sArray[513] = 15;
        sArray[514] = 16;
        sArray[515] = 50;
        sArray[516] = 16;
        sArray[517] = 45;
        sArray[518] = 16;
        sArray[519] = 45;
        sArray[520] = 45;
        sArray[521] = 15;
        sArray[522] = 16;
        sArray[523] = 52;
        sArray[524] = 25;
        sArray[525] = 51;
        sArray[526] = 25;
        sArray[527] = 52;
        sArray[528] = 25;
        sArray[529] = 52;
        sArray[530] = 52;
        sArray[531] = 41;
        sArray[532] = 42;
        sArray[533] = 44;
        sArray[534] = 41;
        sArray[535] = 20;
        sArray[536] = 20;
        sArray[537] = 20;
        sArray[538] = 59;
        sArray[539] = 59;
        sArray[540] = 42;
        sArray[541] = 42;
        sArray[542] = 44;
        sArray[543] = 44;
        sArray[544] = 42;
        sArray[545] = 43;
        sArray[546] = 44;
        sArray[547] = 69;
        sArray[548] = 69;
        sArray[549] = 69;
        sArray[550] = 7;
        sArray[551] = 20;
        sArray[552] = 7;
        sArray[553] = 64;
        sArray[554] = 7;
        sArray[555] = 7;
        sArray[556] = 7;
        sArray[557] = 40;
        sArray[558] = 7;
        sArray[559] = 69;
        sArray[560] = 23;
        sArray[561] = 69;
        sArray[562] = 7;
        sArray[563] = 69;
        sArray[564] = 69;
        sArray[565] = 7;
        sArray[566] = 49;
        sArray[567] = 3;
        sArray[568] = 7;
        sArray[569] = 35;
        sArray[570] = 34;
        sArray[571] = 35;
        sArray[572] = 31;
        sArray[573] = 46;
        sArray[574] = 47;
        sArray[575] = 48;
        sArray[576] = 49;
        sArray[577] = 50;
        sArray[578] = 45;
        sArray[579] = 51;
        sArray[580] = 52;
        sArray[581] = 41;
        sArray[582] = 7;
        sArray[583] = 27;
        sArray[584] = 7;
        sArray[585] = 7;
        sArray[586] = 7;
        sArray[587] = 7;
        sArray[588] = 25;
        sArray[589] = 27;
        sArray[590] = 25;
        sArray[591] = 15;
        sArray[592] = 14;
        sArray[593] = 14;
        sArray[594] = 7;
        sArray[595] = 27;
        sArray[596] = 40;
        sArray[597] = 25;
        sArray[598] = 25;
        sArray[599] = 25;
        sArray[600] = 23;
        sArray[601] = 60;
        sArray[602] = 60;
        sArray[603] = 53;
        sArray[604] = 49;
        sArray[605] = 3;
        sArray[606] = 49;
        sArray[607] = 3;
        sArray[608] = 61;
        sArray[609] = 61;
        sArray[610] = 61;
        sArray[611] = 63;
        sArray[612] = 62;
        sArray[613] = 63;
        sArray[614] = 61;
        sArray[615] = 61;
        sArray[616] = 7;
        sArray[617] = 61;
        sArray[618] = 63;
        sArray[619] = 62;
        sArray[620] = 63;
        sArray[621] = 63;
        sArray[622] = 7;
        sArray[623] = 61;
        sArray[624] = 61;
        sArray[625] = 61;
        sArray[626] = 70;
        sArray[627] = 71;
        sArray[628] = 70;
        sArray[629] = 70;
        sArray[630] = 70;
        sArray[631] = 70;
        sArray[632] = 49;
        sArray[633] = 3;
        sArray[634] = 49;
        sArray[635] = 3;
        sArray[636] = 61;
        sArray[637] = 63;
        sArray[638] = 62;
        sArray[639] = 63;
        sArray[640] = 7;
        sArray[641] = 9;
        sArray[642] = 7;
        sArray[643] = 3;
        sArray[644] = 7;
        sArray[645] = 61;
        sArray[646] = 61;
        sArray[647] = 61;
        sArray[648] = 63;
        sArray[649] = 62;
        sArray[650] = 61;
        sArray[651] = 63;
        sArray[652] = 61;
        sArray[653] = 61;
        sArray[654] = 63;
        sArray[655] = 62;
        sArray[656] = 63;
        sArray[657] = 25;
        sArray[658] = 27;
        sArray[659] = 25;
        sArray[660] = 23;
        sArray[661] = 23;
        sArray[662] = 24;
        sArray[663] = 7;
        sArray[664] = 40;
        sArray[665] = 40;
        sArray[666] = 40;
        sArray[667] = 40;
        sArray[668] = 16;
        sArray[669] = 15;
        sArray[670] = 40;
        sArray[671] = 40;
        sArray[672] = 16;
        sArray[673] = 15;
        sArray[674] = 7;
        sArray[675] = 61;
        sArray[676] = 61;
        sArray[677] = 61;
        sArray[678] = 61;
        sArray[679] = 7;
        sArray[680] = 61;
        sArray[681] = 61;
        sArray[682] = 63;
        sArray[683] = 62;
        sArray[684] = 63;
        sArray[685] = 61;
        sArray[686] = 73;
        sArray[687] = 61;
        sArray[688] = 61;
        sArray[689] = 7;
        sArray[690] = 61;
        sArray[691] = 7;
        sArray[692] = 61;
        sArray[693] = 63;
        sArray[694] = 62;
        sArray[695] = 63;
        sArray[696] = 73;
        sArray[697] = 61;
        sArray[698] = 61;
        sArray[699] = 61;
        sArray[700] = 61;
        sArray[701] = 63;
        sArray[702] = 64;
        sArray[703] = 7;
        sArray[704] = 10;
        sArray[705] = 49;
        sArray[706] = 9;
        sArray[707] = 49;
        sArray[708] = 9;
        sArray[709] = 49;
        sArray[710] = 9;
        sArray[711] = 7;
        sArray[712] = 7;
        sArray[713] = 57;
        sArray[714] = 7;
        sArray[715] = 7;
        sArray[716] = 18;
        sArray[717] = 1;
        sArray[718] = 7;
        sArray[719] = 57;
        sArray[720] = 57;
        sArray[721] = 51;
        sArray[722] = 15;
        sArray[723] = 57;
        sArray[724] = 57;
        sArray[725] = 51;
        sArray[726] = 16;
        sArray[728] = 76;
        sArray[729] = 77;
        sArray[730] = 7;
        sArray[731] = 7;
        sArray[732] = 7;
        sArray[733] = 15;
        sArray[734] = 15;
        sArray[735] = 16;
        sArray[736] = 7;
        id_native = sArray;
    }

    private static int id_continue(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC4AF2187;
    }

    public void id_continue(boolean bl) {
        int n;
        float f;
        float f2;
        this.id_private();
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_native[363]]).id_class(this);
        if (bl && this == (cb_3)QY.id_instanceof().id_class[id_native[364]]) {
            rrAS rrAS2 = rrAS.id_class(this.sO(), id_finally[55], id_implements[107]);
            if (rrAS2.id_byte()) {
                return;
            }
            f2 = rrAS2.id_protected();
            f = rrAS2.id_class();
            n = rrAS2.id_break();
        } else {
            f2 = this.sO();
            f = id_implements[108];
            n = id_finally[56];
        }
        float f3 = this.ST();
        if (this.id_break(rLD.id_private)) {
            f3 += id_implements[109] * (float)(this.id_byte(rLD.id_private).id_byte() + id_break[143]);
        }
        rjU_2 rjU_22 = this.rv();
        this.id_catch(rjU_22.id_break, f3, rjU_22.id_protected);
        if (this.PF()) {
            float f4 = f2 * id_implements[110];
            this.id_byte(this.rv().id_break(-rfU_2.id_class(f4) * f, id_protected[52], rfU_2.id_break(f4) * f));
        }
        Boolean bl2 = id_break[144];
        this.id_throws[iB_2.id_native[365]] = bl2;
        Integer n2 = n;
        this.id_private[iB_2.id_native[366]] = n2;
    }

    private void id_else() {
        Map<rXQ, rdn_3> map = this.id_long();
        if (map != null) {
            this.id_break(map);
            if (!map.isEmpty()) {
                this.id_class(map);
            }
        }
    }

    public void id_else(float f) {
    }

    @Override
    public void id_implements(float f) {
        this.id_private();
        Float f2 = Float.valueOf(f);
        this.id_private[iB_2.id_native[599]] = f2;
    }

    public int id_implements(float f, float f2) {
        rLY rLY2 = this.id_byte(rLD.id_private);
        float f3 = rLY2 == null ? id_implements[57] : (float)(rLY2.id_byte() + id_break[118]);
        return rfU_2.id_case((f - id_implements[58] - f3) * f2);
    }

    public static rjU_2 id_implements(rjU_2 rjU_22) {
        return new rjU_2(rjU_22.id_break, rjU_22.id_byte, id_protected[127]);
    }

    private void id_implements() {
        rdn_3 rdn_32 = this.id_class(rXQ.OFFHAND);
        this.id_class(rXQ.OFFHAND, this.id_class(rXQ.MAINHAND));
        this.id_class(rXQ.MAINHAND, rdn_32);
    }

    private static void id_instanceof() {
        Object[] objectArray;
        objectArray = new Object[]{UUID.fromString(id_class[36]), UUID.fromString(id_class[37]), new ix_3((UUID)objectArray[0], id_class[38], (double)0.3f, Enum.valueOf(id_3.class, "MULTIPLY_TOTAL")), rmE_2.id_class(iB_2.class, ruw_3.id_class), rmE_2.id_class(iB_2.class, ruw_3.id_byte), rmE_2.id_class(iB_2.class, ruw_3.id_break), rmE_2.id_class(iB_2.class, ruw_3.id_implements), rmE_2.id_class(iB_2.class, ruw_3.id_break), rmE_2.id_class(iB_2.class, ruw_3.id_break), rmE_2.id_class(iB_2.class, ruw_3.id_volatile), ap_3.id_byte(-1.0842022E-19f, -1.0842022E-19f)};
        id_catch = objectArray;
    }

    public void id_instanceof(an_3 an_32) {
        an_32.id_byte(this);
    }

    public int id_new(int n) {
        return Math.min(n + id_finally[9], this.ri());
    }

    private static void id_new() {
        double[] dArray = new double[159];
        dArray[0] = 1.0;
        dArray[1] = 0.01f;
        dArray[2] = 6.2831854820251465;
        dArray[3] = 2.5;
        dArray[4] = 150.0;
        dArray[8] = 0.15f;
        dArray[13] = 0.5;
        dArray[14] = 0.1;
        dArray[15] = 0.5;
        dArray[16] = -0.2;
        dArray[17] = 0.1;
        dArray[18] = -0.2;
        dArray[19] = 0.02;
        dArray[20] = 0.02;
        dArray[21] = 0.02;
        dArray[22] = 1.0;
        dArray[23] = 1.0;
        dArray[24] = 255.0;
        dArray[25] = 255.0;
        dArray[26] = 255.0;
        dArray[27] = 0.5;
        dArray[28] = 0.5;
        dArray[29] = 1.0;
        dArray[30] = 0.8;
        dArray[31] = 0.7;
        dArray[32] = 0.5;
        dArray[33] = 1.0E-4;
        dArray[34] = 0.01;
        dArray[35] = 0.01;
        dArray[36] = 57.2957763671875;
        dArray[37] = 2.0;
        dArray[40] = 1.0;
        dArray[42] = 2.0;
        dArray[43] = 0.4;
        dArray[44] = 2.0;
        dArray[45] = 2.0;
        dArray[46] = 0.2f;
        dArray[47] = 127.0;
        dArray[48] = 0.5;
        dArray[49] = 2.0;
        dArray[50] = 0.5;
        dArray[51] = 2.0;
        dArray[54] = -0.04f;
        dArray[57] = 0.04f;
        dArray[59] = 0.08;
        dArray[61] = 0.01;
        dArray[62] = 0.2;
        dArray[63] = 0.8f;
        dArray[64] = 0.6f;
        dArray[65] = 0.3f;
        dArray[66] = 0.5;
        dArray[67] = 0.8f;
        dArray[68] = 0.5;
        dArray[69] = 0.5;
        dArray[71] = 4.0;
        dArray[73] = 0.6f;
        dArray[74] = 0.3f;
        dArray[75] = -0.5;
        dArray[76] = 1.0;
        dArray[77] = 0.4;
        dArray[79] = -1.0;
        dArray[80] = 0.75;
        dArray[84] = -0.1;
        dArray[86] = 0.04;
        dArray[87] = 3.2;
        dArray[89] = 0.1;
        dArray[91] = 0.1;
        dArray[92] = 0.99f;
        dArray[93] = 0.98f;
        dArray[94] = 0.99f;
        dArray[95] = 10.0;
        dArray[96] = 3.0;
        dArray[97] = 0.05;
        dArray[98] = 0.2;
        dArray[100] = -0.1;
        dArray[102] = 0.98f;
        dArray[104] = 0.2;
        dArray[105] = 0.005;
        dArray[106] = 0.003;
        dArray[107] = 16.0;
        dArray[108] = 0.003;
        dArray[109] = -0.003;
        dArray[110] = 16.0;
        dArray[111] = -0.15f;
        dArray[112] = 0.15f;
        dArray[113] = -0.15f;
        dArray[114] = 0.15f;
        dArray[115] = -0.15f;
        dArray[118] = 0.98;
        dArray[119] = 0.003;
        dArray[121] = 0.003;
        dArray[123] = 0.003;
        dArray[126] = -0.2;
        dArray[128] = 0.5;
        dArray[129] = 0.1;
        dArray[130] = 0.1;
        dArray[131] = 0.1;
        dArray[133] = 0.6;
        dArray[134] = 0.3;
        dArray[135] = 0.5;
        dArray[136] = 0.3;
        dArray[137] = 0.6;
        dArray[138] = 0.05;
        dArray[139] = 1.0;
        dArray[141] = 0.5;
        dArray[142] = 0.6875;
        dArray[143] = 0.5;
        dArray[144] = 0.5;
        dArray[145] = 0.5;
        dArray[146] = 0.5;
        dArray[147] = 57.2957763671875;
        dArray[148] = 90.0;
        dArray[149] = 0.5;
        dArray[150] = 0.1;
        dArray[151] = 0.5;
        dArray[152] = 0.3f;
        id_protected = dArray;
    }

    public void id_package(int n) {
        ((rmE_2)this.id_throws[id_native[308]]).id_break((rut_3)id_catch[id_native[309]], n);
    }

    private static void id_package() {
        float[] fArray = new float[252];
        fArray[0] = 0.02f;
        fArray[1] = 12398.0f;
        fArray[2] = 0.6f;
        fArray[3] = Float.MAX_VALUE;
        fArray[4] = 1.0f;
        fArray[6] = 3.0f;
        fArray[7] = 3.0f;
        fArray[8] = 0.2f;
        fArray[9] = 15.0f;
        fArray[10] = 1.0f;
        fArray[11] = 2.0f;
        fArray[12] = 0.4f;
        fArray[13] = 0.9f;
        fArray[14] = 0.6f;
        fArray[16] = 0.6f;
        fArray[17] = 0.4f;
        fArray[18] = 1.0f;
        fArray[19] = 0.03f;
        fArray[20] = 1.0f;
        fArray[21] = 0.35f;
        fArray[22] = 0.04f;
        fArray[23] = 0.5f;
        fArray[24] = 1.0f;
        fArray[25] = 1.0f;
        fArray[26] = 1.0f;
        fArray[27] = 0.1f;
        fArray[28] = 0.1f;
        fArray[32] = 4.0f;
        fArray[33] = 2.0f;
        fArray[34] = 0.75f;
        fArray[38] = 1.5f;
        fArray[39] = 10.0f;
        fArray[42] = 0.4f;
        fArray[45] = 3.4028235E37f;
        fArray[46] = 10.0f;
        fArray[47] = 0.5f;
        fArray[48] = 1.0f;
        fArray[49] = 1.0f;
        fArray[50] = 0.8f;
        fArray[51] = 0.8f;
        fArray[52] = 0.4f;
        fArray[55] = 1.0f;
        fArray[56] = 1.0f;
        fArray[58] = 3.0f;
        fArray[59] = 0.5f;
        fArray[60] = 0.75f;
        fArray[62] = 25.0f;
        fArray[65] = 3.4028235E37f;
        fArray[66] = 10.0f;
        fArray[67] = 10.0f;
        fArray[72] = 3.4028235E37f;
        fArray[73] = 10.0f;
        fArray[75] = 6.0f;
        fArray[76] = 2.0f;
        fArray[77] = 1.5f;
        fArray[79] = 0.2f;
        fArray[80] = 1.0f;
        fArray[81] = 0.2f;
        fArray[82] = 1.0f;
        fArray[84] = 0.2f;
        fArray[85] = 1.0f;
        fArray[87] = 1.0f;
        fArray[88] = 0.8f;
        fArray[89] = 0.4f;
        fArray[90] = 0.8f;
        fArray[91] = 0.8f;
        fArray[92] = 0.4f;
        fArray[93] = 0.5f;
        fArray[94] = 0.2f;
        fArray[95] = 0.5f;
        fArray[96] = 0.2f;
        fArray[97] = 0.5f;
        fArray[98] = 0.2f;
        fArray[99] = 4.0f;
        fArray[101] = 1.0f;
        fArray[102] = 0.2f;
        fArray[103] = 1.5f;
        fArray[104] = 0.2f;
        fArray[105] = 1.0f;
        fArray[106] = 0.42f;
        fArray[107] = 0.2f;
        fArray[108] = 0.2f;
        fArray[109] = 0.1f;
        fArray[110] = (float)Math.PI / 180;
        fArray[111] = 0.8f;
        fArray[113] = 0.9f;
        fArray[114] = 0.54600006f;
        fArray[115] = 0.02f;
        fArray[116] = 0.02f;
        fArray[117] = 3.0f;
        fArray[118] = 3.0f;
        fArray[119] = 0.5f;
        fArray[121] = 3.0f;
        fArray[122] = 3.0f;
        fArray[123] = 0.96f;
        fArray[124] = 0.02f;
        fArray[125] = 1.0f;
        fArray[126] = (float)Math.PI / 180;
        fArray[129] = 1.0f;
        fArray[130] = 1.0f;
        fArray[131] = 0.91f;
        fArray[132] = 0.91f;
        fArray[134] = 4.0f;
        fArray[135] = 1.0f;
        fArray[136] = 1.0f;
        fArray[137] = 0.4f;
        fArray[139] = 0.21600002f;
        fArray[142] = 0.0025000002f;
        fArray[143] = 1.0f;
        fArray[144] = 3.0f;
        fArray[145] = 57.295776f;
        fArray[146] = 90.0f;
        fArray[147] = 95.0f;
        fArray[148] = 265.0f;
        fArray[149] = 180.0f;
        fArray[152] = 0.3f;
        fArray[153] = -180.0f;
        fArray[154] = 360.0f;
        fArray[155] = 180.0f;
        fArray[156] = 360.0f;
        fArray[157] = -180.0f;
        fArray[158] = 360.0f;
        fArray[159] = 180.0f;
        fArray[160] = 360.0f;
        fArray[161] = -180.0f;
        fArray[162] = 360.0f;
        fArray[163] = 180.0f;
        fArray[164] = 360.0f;
        fArray[165] = -180.0f;
        fArray[166] = 360.0f;
        fArray[167] = 180.0f;
        fArray[168] = 360.0f;
        fArray[169] = -180.0f;
        fArray[170] = 360.0f;
        fArray[171] = 180.0f;
        fArray[172] = 360.0f;
        fArray[174] = 0.3f;
        fArray[175] = -90.0f;
        fArray[176] = 90.0f;
        fArray[177] = -75.0f;
        fArray[178] = -75.0f;
        fArray[179] = 75.0f;
        fArray[180] = 75.0f;
        fArray[181] = 2500.0f;
        fArray[182] = 0.2f;
        fArray[183] = -1.0f;
        fArray[186] = 0.98f;
        fArray[187] = 0.98f;
        fArray[188] = 1.0f;
        fArray[189] = 6.0f;
        fArray[193] = 1.0f;
        fArray[195] = 1.0f;
        fArray[198] = 1.0f;
        fArray[199] = 0.09f;
        fArray[201] = 0.09f;
        fArray[202] = 0.5f;
        fArray[203] = 0.1f;
        fArray[204] = 0.9f;
        fArray[205] = 0.5f;
        fArray[206] = 0.5f;
        fArray[207] = 0.2f;
        fArray[208] = 1.0f;
        fArray[209] = (float)Math.PI / 180;
        fArray[210] = (float)Math.PI / 180;
        fArray[211] = (float)Math.PI / 180;
        fArray[212] = (float)Math.PI / 180;
        fArray[213] = 2.0f;
        fArray[214] = 2.0f;
        fArray[215] = 2.0f;
        fArray[216] = 2.0f;
        fArray[217] = 0.2f;
        fArray[218] = 1.0f;
        fArray[219] = 1.0f;
        fArray[220] = 0.4f;
        fArray[222] = 0.2f;
        fArray[223] = 0.2f;
        id_implements = fArray;
    }

    public boolean id_return() {
        return ((Byte)((rmE_2)this.id_throws[id_native[604]]).id_class((rut_3)id_catch[id_native[605]]) & id_break[209]) > 0 ? id_break[210] : id_break[211];
    }

    public void id_return(float f) {
        this.id_private();
        if (f < id_implements[196]) {
            f = id_implements[197];
        }
        Float f2 = Float.valueOf(f);
        this.id_private[iB_2.id_native[602]] = f2;
    }

    public void id_super(float f) {
        this.id_private();
        Float f2 = Float.valueOf(f);
        this.id_private[iB_2.id_native[403]] = f2;
    }

    public void id_super(boolean bl) {
        this.id_private();
        Boolean bl2 = bl;
        this.id_private[iB_2.id_native[581]] = bl2;
    }

    private void id_super() {
        this.id_private();
        boolean bl = this.id_finally(id_finally[66]);
        if (bl && !((Boolean)this.id_throws[id_native[551]]).booleanValue() && !this.Pm() && !this.id_break(rLD.id_goto)) {
            rdn_3 rdn_32 = this.id_class(rXQ.CHEST);
            if (rdn_32.id_break() == rdy_3.kc && rxH_2.id_protected(rdn_32)) {
                bl = id_break[179];
                if (!((rYB)this.id_throws[iB_2.id_native[552]]).id_continue && ((Integer)this.id_private[id_native[553]] + id_break[180]) % id_finally[67] == 0) {
                    rdn_32.id_class(id_break[181], this, (T iB_22) -> iB_22.id_break(rXQ.CHEST));
                }
            } else {
                bl = id_break[182];
            }
        } else {
            bl = id_break[183];
        }
        if (!((rYB)this.id_throws[iB_2.id_native[554]]).id_continue) {
            this.id_break(id_finally[68], bl);
        }
    }

    public PX id_switch() {
        return this.rO();
    }

    public void id_throw() {
        this.id_private();
        if (!((rYB)this.id_throws[iB_2.id_native[691]]).id_continue) {
            this.id_byte(id_break[226], id_break[227]);
        }
        rdn_3 rdn_32 = rdn_3.id_break;
        this.id_private[iB_2.id_native[692]] = rdn_32;
        Integer n = (int)((Integer)this.id_private[id_native[693]]);
        this.id_private[iB_2.id_native[694]] = n;
        Integer n2 = id_break[228];
        this.id_private[iB_2.id_native[695]] = n2;
        Integer n3 = id_break[229];
        this.id_private[iB_2.id_native[696]] = n3;
    }

    public void id_try(an_3 an_32) {
        this.id_private();
        if (an_32 instanceof iB_2) {
            iB_2 iB_22 = (iB_2)an_32;
            this.id_private[iB_2.id_native[124]] = iB_22;
        } else {
            Object var7_3 = null;
            this.id_private[iB_2.id_native[125]] = var7_3;
        }
        Integer n = (int)((Integer)this.id_throws[id_native[126]]);
        this.id_private[iB_2.id_native[127]] = n;
    }

    public boolean id_try() {
        return !((rYB)this.id_throws[iB_2.id_native[594]]).id_continue ? id_break[200] : id_break[201];
    }

    public boolean id_while() {
        return (Integer)this.id_throws[id_native[93]] % id_finally[6] == 0 && this.rv().id_break != id_protected[11] && this.rv().id_protected != id_protected[12] && !this.id_native() && eA_2.id_finally(this) && this.Be() ? id_break[18] : id_break[19];
    }

    public boolean id_while(an_3 an_32) {
        rjU_2 rjU_22;
        rjU_2 rjU_23 = new rjU_2(this.rx(), this.rH(), this.BO());
        return ((rYB)this.id_throws[id_native[586]]).id_class(new rjB_2(rjU_23, rjU_22 = new rjU_2(an_32.rx(), an_32.rH(), an_32.BO()), rjS_2.COLLIDER, rjs_3.NONE, this)).id_byte() == rjM_2.MISS ? id_break[196] : id_break[197];
    }

    private static void id_static() {
        boolean[] blArray = new boolean[288];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[20] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[26] = true;
        blArray[28] = true;
        blArray[30] = true;
        blArray[32] = true;
        blArray[33] = true;
        blArray[37] = true;
        blArray[39] = true;
        blArray[42] = true;
        blArray[44] = true;
        blArray[47] = true;
        blArray[49] = true;
        blArray[54] = true;
        blArray[56] = true;
        blArray[57] = true;
        blArray[58] = true;
        blArray[60] = true;
        blArray[62] = true;
        blArray[63] = true;
        blArray[64] = true;
        blArray[66] = true;
        blArray[68] = true;
        blArray[69] = true;
        blArray[70] = true;
        blArray[71] = true;
        blArray[79] = true;
        blArray[80] = true;
        blArray[83] = true;
        blArray[87] = true;
        blArray[88] = true;
        blArray[89] = true;
        blArray[91] = true;
        blArray[94] = true;
        blArray[95] = true;
        blArray[99] = true;
        blArray[101] = true;
        blArray[103] = true;
        blArray[105] = true;
        blArray[107] = true;
        blArray[108] = true;
        blArray[110] = true;
        blArray[113] = true;
        blArray[115] = true;
        blArray[117] = true;
        blArray[118] = true;
        blArray[119] = true;
        blArray[120] = true;
        blArray[122] = true;
        blArray[124] = true;
        blArray[126] = true;
        blArray[128] = true;
        blArray[130] = true;
        blArray[133] = true;
        blArray[137] = true;
        blArray[139] = true;
        blArray[143] = true;
        blArray[144] = true;
        blArray[146] = true;
        blArray[149] = true;
        blArray[152] = true;
        blArray[153] = true;
        blArray[154] = true;
        blArray[155] = true;
        blArray[156] = true;
        blArray[157] = true;
        blArray[160] = true;
        blArray[162] = true;
        blArray[163] = true;
        blArray[166] = true;
        blArray[168] = true;
        blArray[170] = true;
        blArray[171] = true;
        blArray[173] = true;
        blArray[175] = true;
        blArray[177] = true;
        blArray[179] = true;
        blArray[180] = true;
        blArray[181] = true;
        blArray[184] = true;
        blArray[187] = true;
        blArray[193] = true;
        blArray[194] = true;
        blArray[196] = true;
        blArray[198] = true;
        blArray[200] = true;
        blArray[202] = true;
        blArray[204] = true;
        blArray[206] = true;
        blArray[208] = true;
        blArray[209] = true;
        blArray[210] = true;
        blArray[212] = true;
        blArray[213] = true;
        blArray[215] = true;
        blArray[217] = true;
        blArray[219] = true;
        blArray[220] = true;
        blArray[221] = true;
        blArray[226] = true;
        blArray[231] = true;
        blArray[234] = true;
        blArray[238] = true;
        blArray[239] = true;
        blArray[241] = true;
        blArray[242] = true;
        blArray[243] = true;
        blArray[245] = true;
        blArray[246] = true;
        blArray[248] = true;
        blArray[250] = true;
        blArray[252] = true;
        blArray[254] = true;
        blArray[256] = true;
        id_break = blArray;
    }

    public void id_public(float f) {
        ((rmE_2)this.id_throws[id_native[209]]).id_break((rut_3)id_catch[id_native[210]], Float.valueOf(rfU_2.id_class(f, id_implements[30], this.SK())));
    }

    private static void id_public() {
        long[] lArray = new long[2];
        lArray[0] = 40L;
        id_extends = lArray;
    }

    public boolean id_public(an_3 an_32) {
        this.id_try(an_32);
        return id_break[150];
    }

    private rdn_3 id_protected(rXQ rXQ2) {
        this.id_private();
        return (rdn_3)((rqs_3)this.id_private[id_native[480]]).get(rXQ2.id_break());
    }

    public void id_protected(float f) {
        float f2 = this.Ss();
        if (f2 > id_implements[29]) {
            this.id_public(f2 + f);
        }
    }

    public boolean id_protected(rLR rLR2) {
        rLY rLY2 = this.id_class(rLR2);
        if (rLY2 != null) {
            this.id_class(rLY2);
            return id_break[66];
        }
        return id_break[67];
    }

    public void id_protected(rLY rLY2) {
        this.id_private();
        Boolean bl = id_break[68];
        this.id_private[iB_2.id_native[201]] = bl;
        if (!((rYB)this.id_throws[iB_2.id_native[202]]).id_continue) {
            rLY2.id_class().id_break(this, this.BT(), rLY2.id_byte());
        }
        rrLC.id_break(this, rLY2);
    }

    public void id_protected(iB_2 iB_22) {
        iB_22.id_throws(this);
    }

    public float id_protected(rye_3 rye_32, float f) {
        if (!rye_32.id_case()) {
            this.id_byte(rye_32, f);
            f = ryg_3.id_class(f, this.Bq(), (float)this.id_class(iQ_2.id_finally));
        }
        return f;
    }

    public void id_protected(rye_3 rye_32) {
        boolean bl;
        this.id_private();
        an_3 an_32 = rye_32.id_extends();
        int n = an_32 instanceof rhd_3 ? eA_2.id_catch((iB_2)an_32) : id_break[102];
        boolean bl2 = bl = (Integer)this.id_private[id_native[265]] > 0 ? id_break[103] : id_break[104];
        if (this.SX() && ((rYB)this.id_throws[id_native[266]]).B().id_break(rRu_1.id_throws)) {
            this.id_class(rye_32, bl);
            this.id_class(rye_32, n, bl);
        }
        this.Sx();
        this.Sf();
    }

    public rdn_3 id_protected(rpm_3 rpm_32) {
        if (rpm_32 == rpm_3.MAIN_HAND) {
            return this.id_class(rXQ.MAINHAND);
        }
        if (rpm_32 == rpm_3.OFF_HAND) {
            return this.id_class(rXQ.OFFHAND);
        }
        throw new IllegalArgumentException("Invalid hand " + rpm_32);
    }

    public rqA_2 id_protected(rdn_3 rdn_32) {
        return rdn_32.id_void();
    }

    private void id_private() {
        if (this.id_private == null) {
            Object[] objectArray = this.id_private = new Object[id_finally[101]];
            objectArray[iB_2.id_finally[102]] = id_break[258];
            objectArray[iB_2.id_finally[103]] = id_break[259];
            objectArray[iB_2.id_finally[104]] = id_break[260];
            objectArray[iB_2.id_finally[105]] = id_break[261];
            objectArray[iB_2.id_finally[106]] = id_break[262];
            objectArray[iB_2.id_finally[107]] = id_break[263];
            objectArray[iB_2.id_finally[108]] = Float.valueOf(id_implements[224]);
            objectArray[iB_2.id_finally[109]] = id_break[264];
            objectArray[iB_2.id_finally[110]] = Float.valueOf(id_implements[225]);
            objectArray[iB_2.id_finally[111]] = Float.valueOf(id_implements[226]);
            objectArray[iB_2.id_finally[112]] = id_break[265];
            objectArray[iB_2.id_finally[113]] = Float.valueOf(id_implements[227]);
            objectArray[iB_2.id_finally[114]] = Float.valueOf(id_implements[228]);
            objectArray[iB_2.id_finally[115]] = Float.valueOf(id_implements[229]);
            objectArray[iB_2.id_finally[116]] = (int)id_finally[117];
            objectArray[iB_2.id_finally[118]] = Float.valueOf(id_implements[230]);
            objectArray[iB_2.id_finally[119]] = Float.valueOf(id_implements[231]);
            objectArray[iB_2.id_finally[120]] = Float.valueOf(id_implements[232]);
            objectArray[iB_2.id_finally[121]] = Float.valueOf(id_implements[233]);
            objectArray[iB_2.id_finally[122]] = Float.valueOf(id_implements[234]);
            objectArray[iB_2.id_finally[123]] = Float.valueOf(id_implements[235]);
            objectArray[iB_2.id_finally[124]] = Float.valueOf(id_implements[236]);
            objectArray[iB_2.id_finally[125]] = Float.valueOf(id_implements[237]);
            objectArray[iB_2.id_finally[126]] = Float.valueOf(id_implements[238]);
            objectArray[iB_2.id_finally[127]] = id_break[266];
            objectArray[iB_2.id_finally[128]] = id_break[267];
            objectArray[iB_2.id_finally[129]] = id_break[268];
            objectArray[iB_2.id_finally[130]] = Float.valueOf(id_implements[239]);
            objectArray[iB_2.id_finally[131]] = Float.valueOf(id_implements[240]);
            objectArray[iB_2.id_finally[132]] = Float.valueOf(id_implements[241]);
            objectArray[iB_2.id_finally[133]] = Float.valueOf(id_implements[242]);
            objectArray[iB_2.id_finally[134]] = Float.valueOf(id_implements[243]);
            objectArray[iB_2.id_finally[135]] = id_break[269];
            objectArray[iB_2.id_finally[136]] = Float.valueOf(id_implements[244]);
            objectArray[iB_2.id_finally[137]] = id_break[270];
            objectArray[iB_2.id_finally[138]] = Float.valueOf(id_implements[245]);
            objectArray[iB_2.id_finally[139]] = Float.valueOf(id_implements[246]);
            objectArray[iB_2.id_finally[140]] = Float.valueOf(id_implements[247]);
            objectArray[iB_2.id_finally[141]] = id_break[271];
            objectArray[iB_2.id_finally[142]] = id_protected[153];
            objectArray[iB_2.id_finally[143]] = id_protected[154];
            objectArray[iB_2.id_finally[144]] = id_protected[155];
            objectArray[iB_2.id_finally[145]] = id_protected[156];
            objectArray[iB_2.id_finally[146]] = id_protected[157];
            objectArray[iB_2.id_finally[147]] = id_protected[158];
            objectArray[iB_2.id_finally[148]] = id_break[272];
            objectArray[iB_2.id_finally[149]] = id_break[273];
            objectArray[iB_2.id_finally[150]] = id_break[274];
            objectArray[iB_2.id_finally[151]] = id_break[275];
            objectArray[iB_2.id_finally[152]] = Float.valueOf(id_implements[248]);
            objectArray[iB_2.id_finally[153]] = id_break[276];
            objectArray[iB_2.id_finally[154]] = Float.valueOf(id_implements[249]);
            objectArray[iB_2.id_finally[155]] = id_break[277];
            objectArray[iB_2.id_finally[156]] = id_break[278];
            objectArray[iB_2.id_finally[157]] = id_break[279];
            objectArray[iB_2.id_finally[158]] = id_extends[1];
            objectArray[iB_2.id_finally[159]] = id_break[280];
            objectArray[iB_2.id_finally[160]] = Float.valueOf(id_implements[250]);
            objectArray[iB_2.id_finally[161]] = Float.valueOf(id_implements[251]);
            objectArray[iB_2.id_finally[162]] = id_break[281];
            objectArray[iB_2.id_finally[163]] = id_break[282];
            objectArray[iB_2.id_finally[164]] = id_break[283];
            objectArray[iB_2.id_finally[165]] = id_break[284];
            objectArray[iB_2.id_finally[166]] = id_break[285];
            objectArray[iB_2.id_finally[167]] = id_break[286];
            objectArray[iB_2.id_finally[168]] = id_break[287];
        }
    }

    public void id_private(rjU_2 rjU_22) {
        if (this.id_try() || this.Po()) {
            boolean bl;
            double d = id_protected[59];
            boolean bl2 = bl = this.rv().id_byte <= id_protected[60] ? id_break[146] : id_break[147];
            if (bl && this.id_break(rLD.id_instanceof)) {
                d = id_protected[61];
                Float f = Float.valueOf(id_implements[112]);
                this.id_throws[iB_2.id_native[367]] = f;
            }
            rXE rXE2 = ((rYB)this.id_throws[id_native[368]]).id_break(this.Bs());
            if (this.rT() && this.sr() && !this.id_class(rXE2.id_class())) {
                double d2 = this.re();
                int n = eA_2.id_throws(this);
                float f = id_implements[113];
                float f2 = id_implements[114];
                float f3 = id_implements[115];
                if (this == (cb_3)QY.id_instanceof().id_class[id_native[369]]) {
                    rrLd_1 rrLd_12 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_native[370]]).id_finally().id_class(rrLd_1.id_class(id_implements[116], n));
                    f3 = rrLd_12.id_break();
                    n = rrLd_12.id_class();
                }
                float f4 = this.PF() ? f : this.Bf();
                float f5 = f3;
                float f6 = n;
                if (f6 > id_implements[117]) {
                    f6 = id_implements[118];
                }
                if (!((Boolean)this.id_throws[id_native[371]]).booleanValue()) {
                    f6 *= id_implements[119];
                }
                if (f6 > id_implements[120]) {
                    f4 += (f2 - f4) * f6 / id_implements[121];
                    f5 += (this.sB() - f5) * f6 / id_implements[122];
                }
                if (this.id_break(rLD.id_interface)) {
                    f4 = id_implements[123];
                }
                this.id_class(f5, rjU_22);
                this.id_class(iG_2.SELF, this.rv());
                rjU_2 rjU_23 = this.rv();
                if (((Boolean)this.id_throws[id_native[372]]).booleanValue() && this.o_()) {
                    rjU_23 = new rjU_2(rjU_23.id_break, id_protected[62], rjU_23.id_protected);
                }
                this.id_byte(rjU_23.id_throws(f4, id_protected[63], f4));
                rjU_2 rjU_24 = this.id_class(d, bl, this.rv());
                this.id_byte(rjU_24);
                if (((Boolean)this.id_throws[id_native[373]]).booleanValue() && this.id_finally(rjU_24.id_break, rjU_24.id_byte + id_protected[64] - this.re() + d2, rjU_24.id_protected)) {
                    this.id_catch(rjU_24.id_break, id_protected[65], rjU_24.id_protected);
                }
            } else if (this.ry() && this.sr() && !this.id_class(rXE2.id_class())) {
                rjU_2 rjU_25;
                double d3 = this.re();
                this.id_class(id_implements[124], rjU_22);
                this.id_class(iG_2.SELF, this.rv());
                if (this.id_break(rlG_2.id_byte) <= this.rI()) {
                    this.id_byte(this.rv().id_throws(id_protected[66], id_protected[67], id_protected[68]));
                    rjU_25 = this.id_class(d, bl, this.rv());
                    this.id_byte(rjU_25);
                } else {
                    this.id_byte(this.rv().id_class(id_protected[69]));
                }
                if (!this.rw()) {
                    this.id_byte(this.rv().id_break(id_protected[70], -d / id_protected[71], id_protected[72]));
                }
                rjU_25 = this.rv();
                if (((Boolean)this.id_throws[id_native[374]]).booleanValue() && this.id_finally(rjU_25.id_break, rjU_25.id_byte + id_protected[73] - this.re() + d3, rjU_25.id_protected)) {
                    this.id_catch(rjU_25.id_break, id_protected[74], rjU_25.id_protected);
                }
            } else if (this.Sy()) {
                double d4;
                float f;
                double d5;
                rjU_2 rjU_26 = this.rv();
                if (rjU_26.id_byte > id_protected[75]) {
                    Float f7 = Float.valueOf(id_implements[125]);
                    this.id_throws[iB_2.id_native[375]] = f7;
                }
                rjU_2 rjU_27 = this.m();
                float f8 = this.Bo() * id_implements[126];
                double d6 = Math.sqrt(rjU_27.id_break * rjU_27.id_break + rjU_27.id_protected * rjU_27.id_protected);
                double d7 = Math.sqrt(iB_2.id_case(rjU_26));
                double d8 = rjU_27.id_case();
                float f9 = rfU_2.id_break(f8);
                f9 = (float)((double)f9 * (double)f9 * Math.min(id_protected[76], d8 / id_protected[77]));
                rjU_26 = this.rv().id_break(id_protected[78], d * (id_protected[79] + (double)f9 * id_protected[80]), id_protected[81]);
                if (rjU_26.id_byte < id_protected[82] && d6 > id_protected[83]) {
                    d5 = rjU_26.id_byte * id_protected[84] * (double)f9;
                    rjU_26 = rjU_26.id_break(rjU_27.id_break * d5 / d6, d5, rjU_27.id_protected * d5 / d6);
                }
                if (f8 < id_implements[127] && d6 > id_protected[85]) {
                    d5 = d7 * (double)(-rfU_2.id_class(f8)) * id_protected[86];
                    rjU_26 = rjU_26.id_break(-rjU_27.id_break * d5 / d6, d5 * id_protected[87], -rjU_27.id_protected * d5 / d6);
                }
                if (d6 > id_protected[88]) {
                    rjU_26 = rjU_26.id_break((rjU_27.id_break / d6 * d7 - rjU_26.id_break) * id_protected[89], id_protected[90], (rjU_27.id_protected / d6 * d7 - rjU_26.id_protected) * id_protected[91]);
                }
                this.id_byte(rjU_26.id_throws(id_protected[92], id_protected[93], id_protected[94]));
                this.id_class(iG_2.SELF, this.rv());
                if (((Boolean)this.id_throws[id_native[376]]).booleanValue() && !((rYB)this.id_throws[iB_2.id_native[377]]).id_continue && (f = (float)((d4 = d7 - (d5 = Math.sqrt(iB_2.id_case(this.rv())))) * id_protected[95] - id_protected[96])) > id_implements[128]) {
                    this.id_class(this.id_byte((int)f), id_implements[129], id_implements[130]);
                    this.id_break(rye_3.id_native, f);
                }
                if (((Boolean)this.id_throws[id_native[378]]).booleanValue() && !((rYB)this.id_throws[iB_2.id_native[379]]).id_continue) {
                    this.id_break(id_finally[57], id_break[148]);
                }
            } else {
                rfH_2 rfH_22 = this.PI();
                float f = ((rYB)this.id_throws[id_native[380]]).id_byte(rfH_22).id_break().id_final();
                float f10 = (Boolean)this.id_throws[id_native[381]] != false ? f * id_implements[131] : id_implements[132];
                rjU_2 rjU_28 = this.id_break(rjU_22, f);
                double d9 = rjU_28.id_byte;
                if (this.id_break(rLD.id_goto)) {
                    double d10 = id_protected[97];
                    if (this instanceof cb_3) {
                        d10 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_native[382]]).id_finally().id_class(rrAs_1.id_class(this.id_byte(rLD.id_goto), d10)).id_break();
                    }
                    d9 += (d10 * (double)(this.id_byte(rLD.id_goto).id_byte() + id_break[149]) - rjU_28.id_byte) * id_protected[98];
                    Float f11 = Float.valueOf(id_implements[133]);
                    this.id_throws[iB_2.id_native[383]] = f11;
                } else if (((rYB)this.id_throws[iB_2.id_native[384]]).id_continue && !((rYB)this.id_throws[id_native[385]]).id_int(rfH_22)) {
                    d9 = this.re() > id_protected[99] ? id_protected[100] : id_protected[101];
                } else if (!this.rw()) {
                    d9 -= d;
                }
                this.id_catch(rjU_28.id_break * (double)f10, d9 * id_protected[102], rjU_28.id_protected * (double)f10);
            }
        }
        this.id_class(this, this instanceof rMm_1);
    }

    private void id_final() {
        this.id_private();
        if (this.id_return()) {
            rpm_3 rpm_32 = this.P();
            rdn_3 rdn_32 = this.id_protected(rpm_32);
            if (((rdn_3)this.id_private[id_native[608]]).id_class() || rdn_3.id_protected(rdn_32, (rdn_3)this.id_private[id_native[609]])) {
                if (((rdn_3)this.id_private[id_native[610]]).id_class()) {
                    Integer n = (int)((Integer)this.id_private[id_native[611]]);
                    this.id_private[iB_2.id_native[612]] = n;
                    Integer n2 = rdn_32.id_extends();
                    this.id_private[iB_2.id_native[613]] = n2;
                }
                rdn_3 rdn_33 = rdn_32;
                this.id_private[iB_2.id_native[614]] = rdn_33;
                ((rdn_3)this.id_private[id_native[615]]).id_break((rYB)this.id_throws[id_native[616]], this, this.SH());
                if (this.id_char()) {
                    this.id_class((rdn_3)this.id_private[id_native[617]], (int)id_finally[74]);
                }
                Integer n = (int)((Integer)this.id_private[id_native[618]]);
                this.id_private[iB_2.id_native[619]] = n;
                iB_2 iB_22 = this;
                int n3 = (Integer)iB_22.id_private[id_native[620]] - id_break[212];
                Integer n4 = n3;
                iB_22.id_private[iB_2.id_native[621]] = n4;
                if (n3 == 0 && !((rYB)this.id_throws[iB_2.id_native[622]]).id_continue && !((rdn_3)this.id_private[id_native[623]]).id_volatile()) {
                    this.sP();
                }
            } else {
                this.id_throw();
            }
        }
    }

    public int id_final(int n) {
        int n2 = eA_2.id_protected(this);
        return n2 > 0 && ((Random)this.id_throws[id_native[112]]).nextInt(n2 + id_break[32]) > 0 ? n : n - id_break[33];
    }

    public boolean id_transient() {
        return this.h();
    }

    public void id_volatile(int n) {
        this.id_private();
        Integer n2 = n;
        this.id_private[iB_2.id_native[564]] = n2;
        if (!((rYB)this.id_throws[iB_2.id_native[565]]).id_continue) {
            this.id_byte(id_finally[71], id_break[193]);
        }
    }

    public float id_synchronized(float f) {
        this.id_private();
        return rfU_2.id_catch(f, ((Float)this.id_private[id_native[41]]).floatValue(), ((Float)this.id_private[id_native[42]]).floatValue());
    }

    @Override
    public void id_native(float f) {
        this.id_private();
        Float f2 = Float.valueOf(f);
        this.id_private[iB_2.id_native[600]] = f2;
    }

    public void id_native(int n) {
        this.id_private();
        Integer n2 = n;
        this.id_private[iB_2.id_native[129]] = n2;
    }

    public boolean sr() {
        return id_break[24];
    }

    @Override
    public void A() {
        this.id_private();
        super.A();
        Float f = Float.valueOf(((Float)this.id_private[id_native[569]]).floatValue());
        this.id_private[iB_2.id_native[570]] = f;
        Float f2 = Float.valueOf(id_implements[190]);
        this.id_private[iB_2.id_native[571]] = f2;
        Float f3 = Float.valueOf(id_implements[191]);
        this.id_throws[iB_2.id_native[572]] = f3;
    }

    public int SH() {
        this.id_private();
        return (Integer)this.id_private[id_native[682]];
    }

    public void Q() {
    }

    @Override
    public float rq() {
        return this.Be() && eA_2.id_class(eY_2.id_native, this) > 0 ? id_implements[18] : super.rq();
    }

    public boolean SG() {
        return id_break[35];
    }

    @Override
    public void Pn() {
        boolean bl;
        this.id_private();
        Float f = Float.valueOf(((Float)this.id_private[id_native[43]]).floatValue());
        this.id_private[iB_2.id_native[44]] = f;
        if (((Boolean)this.id_throws[id_native[45]]).booleanValue()) {
            this.Bg().ifPresent(this::id_class);
        }
        if (this.id_while()) {
            this.Sv();
        }
        super.Pn();
        boolean bl2 = this instanceof rhd_3;
        if (this.BM()) {
            double d;
            double d2;
            if (this.Bz()) {
                this.id_break(rye_3.id_case, id_implements[10]);
            } else if (bl2 && !((rYB)this.id_throws[id_native[46]]).id_instanceof().id_class(this.rN()) && (d2 = ((rYB)this.id_throws[id_native[47]]).id_instanceof().id_class(this) + ((rYB)this.id_throws[id_native[48]]).id_instanceof().id_final()) < id_protected[9] && (d = ((rYB)this.id_throws[id_native[49]]).id_instanceof().id_package()) > id_protected[10]) {
                this.id_break(rye_3.id_case, (float)Math.max(id_break[10], rfU_2.id_byte(-d2 * d)));
            }
        }
        if (this.q() || ((rYB)this.id_throws[iB_2.id_native[50]]).id_continue) {
            this.rE();
        }
        boolean bl3 = bl = bl2 && ((rhx_3)((rhd_3)this).id_implements[iB_2.id_native[51]]).id_class ? id_break[11] : id_break[12];
        if (this.BM()) {
            rrTj_1 rrTj_12;
            if (((an_3)this).id_class(rlG_2.id_break) && !((rYB)this.id_throws[id_native[52]]).id_byte(new rfH_2(this.rx(), this.rH(), this.BO())).id_class(xu_3.hM)) {
                if (!(this.SO() || rLK.id_byte(this) || bl)) {
                    this.id_throws(this.id_final(this.PA()));
                    if (this.PA() == id_finally[3]) {
                        this.id_throws(id_break[13]);
                        rrTj_12 = this.rv();
                        for (int i = id_break[14]; i < id_finally[4]; ++i) {
                            double d = ((Random)this.id_throws[id_native[53]]).nextDouble() - ((Random)this.id_throws[id_native[54]]).nextDouble();
                            double d3 = ((Random)this.id_throws[id_native[55]]).nextDouble() - ((Random)this.id_throws[id_native[56]]).nextDouble();
                            double d4 = ((Random)this.id_throws[id_native[57]]).nextDouble() - ((Random)this.id_throws[id_native[58]]).nextDouble();
                            ((rYB)this.id_throws[id_native[59]]).id_class(rLQ.id_throws, this.rx() + d, this.re() + d3, this.BO() + d4, ((rjU_2)rrTj_12).id_break, ((rjU_2)rrTj_12).id_byte, ((rjU_2)rrTj_12).id_protected);
                        }
                        this.id_break(rye_3.id_private, id_implements[11]);
                    }
                }
                if (!((rYB)this.id_throws[iB_2.id_native[60]]).id_continue && this.Pm() && this.ra() != null && !this.ra().PH()) {
                    this.BH();
                }
            } else if (this.PA() < this.ri()) {
                this.id_throws(this.id_new(this.PA()));
            }
            if (!((rYB)this.id_throws[iB_2.id_native[61]]).id_continue && !Objects.equal((Object)((rfH_2)this.id_private[id_native[62]]), (Object)(rrTj_12 = this.Bs()))) {
                rfH_2 rfH_22 = rrTj_12;
                this.id_private[iB_2.id_native[63]] = rfH_22;
                this.id_throws((rfH_2)rrTj_12);
            }
        }
        if (this.BM() && this.Pk()) {
            this.rE();
        }
        if ((Integer)this.id_private[id_native[64]] > 0) {
            iB_2 iB_22 = this;
            Integer n = (Integer)iB_22.id_private[id_native[65]] - id_break[15];
            iB_22.id_private[iB_2.id_native[66]] = n;
        }
        if ((Integer)this.id_throws[id_native[67]] > 0 && !(this instanceof rhN_2)) {
            iB_2 iB_23 = this;
            Integer n = (Integer)iB_23.id_throws[id_native[68]] - id_break[16];
            iB_23.id_throws[iB_2.id_native[69]] = n;
        }
        if (this.Sl()) {
            this.St();
        }
        if ((Integer)this.id_private[id_native[70]] > 0) {
            iB_2 iB_24 = this;
            Integer n = (Integer)iB_24.id_private[id_native[71]] - id_break[17];
            iB_24.id_private[iB_2.id_native[72]] = n;
        } else {
            Object var20_15 = null;
            this.id_private[iB_2.id_native[73]] = var20_15;
        }
        if ((iB_2)this.id_private[id_native[74]] != null && !((iB_2)this.id_private[id_native[75]]).BM()) {
            Object var21_16 = null;
            this.id_private[iB_2.id_native[76]] = var21_16;
        }
        if ((iB_2)this.id_private[id_native[77]] != null) {
            if (!((iB_2)this.id_private[id_native[78]]).BM()) {
                this.id_break((iB_2)null);
            } else if ((Integer)this.id_throws[id_native[79]] - (Integer)this.id_private[id_native[80]] > id_finally[5]) {
                this.id_break((iB_2)null);
            }
        }
        this.Sk();
        Float f2 = Float.valueOf(((Float)this.id_private[id_native[81]]).floatValue());
        this.id_private[iB_2.id_native[82]] = f2;
        Float f3 = Float.valueOf(((Float)this.id_private[id_native[83]]).floatValue());
        this.id_private[iB_2.id_native[84]] = f3;
        Float f4 = Float.valueOf(((Float)this.id_private[id_native[85]]).floatValue());
        this.id_private[iB_2.id_native[86]] = f4;
        Float f5 = Float.valueOf(((Float)this.id_throws[id_native[87]]).floatValue());
        this.id_throws[iB_2.id_native[88]] = f5;
        Float f6 = Float.valueOf(((Float)this.id_throws[id_native[89]]).floatValue());
        this.id_throws[iB_2.id_native[90]] = f6;
        Float f7 = Float.valueOf(((Float)this.id_private[id_native[91]]).floatValue());
        this.id_private[iB_2.id_native[92]] = f7;
    }

    @Override
    public boolean PH() {
        return id_break[25];
    }

    @Override
    public boolean rJ() {
        return this.D();
    }

    @Override
    public boolean rG() {
        return this.BM() && !this.id_native() && !this.o_() ? id_break[204] : id_break[205];
    }

    @Override
    public rfl_3 PE() {
        if (this.id_class(rXQ.HEAD).id_break() == rdy_3.dk) {
            return this.rN().id_byte(id_protected[144], id_protected[145], id_protected[146]);
        }
        return super.PE();
    }

    @Override
    public boolean rP() {
        return super.rP() || !this.Sy() && this.Pb() == iM_2.FALL_FLYING ? id_break[234] : id_break[235];
    }

    @Override
    public void rF() {
        this.id_private();
        Integer n = id_finally[42];
        this.id_private[iB_2.id_native[291]] = n;
        Integer n2 = (int)((Integer)this.id_private[id_native[292]]);
        this.id_private[iB_2.id_native[293]] = n2;
        Float f = Float.valueOf(id_implements[61]);
        this.id_private[iB_2.id_native[294]] = f;
    }

    @Override
    public boolean rY() {
        return (Boolean)this.id_throws[id_native[595]] == false ? id_break[202] : id_break[203];
    }

    @Override
    public void PQ() {
        this.id_break(rye_3.id_volatile, id_implements[99]);
    }

    @Override
    public boolean Pu() {
        this.id_private();
        return (Boolean)this.id_throws[id_native[288]] == false && (Integer)this.id_private[id_native[289]] == 0 ? id_break[115] : id_break[116];
    }

    public int Bj() {
        this.id_private();
        return (Integer)this.id_private[id_native[729]];
    }

    @Override
    public abstract Iterable<rdn_3> PV();

    public boolean BR() {
        return this.sG() == aL_2.id_break ? id_break[64] : id_break[65];
    }

    public ImmutableList<iM_2> BV() {
        return ImmutableList.of((Object)((Object)iM_2.STANDING));
    }

    public int BY() {
        return (Integer)((rmE_2)this.id_throws[id_native[302]]).id_class((rut_3)id_catch[id_native[303]]);
    }

    public boolean BK() {
        return this.Sl();
    }

    public rpr_3 Bi() {
        rfH_2 rfH_22 = this.Bg().orElse(null);
        return rfH_22 != null ? xb_3.id_class((rYB)this.id_throws[id_native[715]], rfH_22) : null;
    }

    public iB_2 Sr() {
        this.id_private();
        return (iB_2)this.id_private[id_native[114]];
    }

    public float Bp() {
        Iterable<rdn_3> iterable = this.PV();
        int n = id_break[141];
        int n2 = id_break[142];
        for (rdn_3 rdn_32 : iterable) {
            if (!rdn_32.id_class()) {
                ++n2;
            }
            ++n;
        }
        return n > 0 ? (float)n2 / (float)n : id_implements[100];
    }

    public void Bw() {
        ((rmE_2)this.id_throws[id_native[187]]).id_break((rut_3)id_catch[id_native[188]], id_break[50]);
        ((rmE_2)this.id_throws[id_native[189]]).id_break((rut_3)id_catch[id_native[190]], id_break[51]);
    }

    @Override
    public boolean BM() {
        return (Boolean)this.id_throws[id_native[287]] == false && this.Ss() > id_implements[54] ? id_break[113] : id_break[114];
    }

    public Optional<rfH_2> Bg() {
        return (Optional)((rmE_2)this.id_throws[id_native[705]]).id_class((rut_3)id_catch[id_native[706]]);
    }

    public boolean Be() {
        return ((rYB)this.id_throws[id_native[100]]).id_byte(this.PI()).id_class(rls_3.Z);
    }

    public void Ba() {
        int n;
        if (!this.Pl().id_catch() && (n = eA_2.id_class(eY_2.id_native, this)) > 0 && this.Be()) {
            ic_3 ic_32 = this.id_byte(iQ_2.id_protected);
            if (ic_32 == null) {
                return;
            }
            ic_32.id_break(new ix_3((UUID)id_catch[id_native[103]], id_class[1], (double)(id_implements[19] * (id_implements[20] + (float)n * id_implements[21])), id_3.ADDITION));
            if (this.Sa().nextFloat() < id_implements[22]) {
                rdn_3 rdn_32 = this.id_class(rXQ.FEET);
                rdn_32.id_class(id_break[22], this, (T iB_22) -> iB_22.id_break(rXQ.FEET));
            }
        }
    }

    public Optional<rfH_2> SP() {
        this.id_private();
        return (Optional)this.id_private[id_native[282]];
    }

    public float Ss() {
        return ((Float)((rmE_2)this.id_throws[id_native[207]]).id_class((rut_3)id_catch[id_native[208]])).floatValue();
    }

    @Override
    public void BH() {
        an_3 an_32 = this.ra();
        super.BH();
        if (an_32 != null && an_32 != this.ra() && !((rYB)this.id_throws[iB_2.id_native[568]]).id_continue) {
            this.id_class(an_32);
        }
    }

    public rqA_2 Bt() {
        return rqn_3.Sj;
    }

    public int BI() {
        this.id_private();
        return (Integer)this.id_private[id_native[128]];
    }

    public float Bf() {
        return id_implements[111];
    }

    public boolean BU() {
        return id_break[178];
    }

    @Override
    public boolean Bz() {
        return !this.Sc() && super.Bz() ? id_break[248] : id_break[249];
    }

    public float Bo() {
        t_1 t_12;
        QY qY = QY.id_instanceof();
        if (this == (cb_3)qY.id_class[id_native[723]] && (t_12 = (t_1)((cb_3)qY.id_class[iB_2.id_native[724]]).id_break[id_native[725]]) != null) {
            return t_12.id_class().id_protected();
        }
        return ((Float)this.id_throws[id_native[726]]).floatValue();
    }

    public rqO_2 By() {
        return this.BC().id_finally();
    }

    public ik_3 BT() {
        this.id_private();
        return (ik_3)this.id_private[id_native[353]];
    }

    public int Bq() {
        return rfU_2.id_byte(this.id_class(iQ_2.id_implements));
    }

    public void SB() {
        ((rmE_2)this.id_throws[id_native[709]]).id_break((rut_3)id_catch[id_native[710]], Optional.empty());
    }

    public void SS() {
        List<an_3> list = ((rYB)this.id_throws[id_native[555]]).id_break((an_3)this, this.rN(), rpJ_2.id_class(this));
        if (!list.isEmpty()) {
            int n;
            int n2 = ((rYB)this.id_throws[id_native[556]]).B().id_byte(rRu_1.id_super);
            if (n2 > 0 && list.size() > n2 - id_break[184] && ((Random)this.id_throws[id_native[557]]).nextInt(id_finally[69]) == 0) {
                n = id_break[185];
                for (int i = id_break[186]; i < list.size(); ++i) {
                    if (list.get(i).Pm()) continue;
                    ++n;
                }
                if (n > n2 - id_break[187]) {
                    this.id_break(rye_3.id_catch, id_implements[189]);
                }
            }
            for (n = id_break[188]; n < list.size(); ++n) {
                an_3 an_32 = list.get(n);
                this.id_instanceof(an_32);
            }
        }
    }

    public void Sf() {
        this.id_private();
        if (!((rYB)this.id_throws[iB_2.id_native[267]]).id_continue && (this.SG() || (Integer)this.id_private[id_native[268]] > 0 && this.Sp() && ((rYB)this.id_throws[id_native[269]]).B().id_break(rRu_1.id_throws))) {
            int n;
            for (int i = this.id_byte((rhd_3)this.id_private[id_native[270]]); i > 0; i -= n) {
                n = rsP_2.id_class(i);
                ((rYB)this.id_throws[id_native[271]]).a_(new rsP_2((rYB)this.id_throws[id_native[272]], this.rx(), this.re(), this.BO(), n));
            }
        }
    }

    public boolean Sy() {
        return this.id_finally(id_finally[81]);
    }

    public void Sj() {
    }

    public float sB() {
        this.id_private();
        return ((Float)this.id_private[id_native[402]]).floatValue();
    }

    public void sE() {
        this.id_private();
        Boolean bl = id_break[208];
        this.id_private[iB_2.id_native[603]] = bl;
    }

    public rdn_3 sX() {
        this.id_private();
        return (rdn_3)this.id_private[id_native[681]];
    }

    public boolean Sp() {
        return !this.n_() ? id_break[28] : id_break[29];
    }

    public float SN() {
        return this.n_() ? (((Random)this.id_throws[id_native[357]]).nextFloat() - ((Random)this.id_throws[id_native[358]]).nextFloat()) * id_implements[102] + id_implements[103] : (((Random)this.id_throws[id_native[359]]).nextFloat() - ((Random)this.id_throws[id_native[360]]).nextFloat()) * id_implements[104] + id_implements[105];
    }

    public float sO() {
        t_1 t_12;
        QY qY = QY.id_instanceof();
        if (this == (cb_3)qY.id_class[id_native[719]] && (t_12 = (t_1)((cb_3)qY.id_class[iB_2.id_native[720]]).id_break[id_native[721]]) != null) {
            return t_12.id_class().id_throws();
        }
        return ((Float)this.id_throws[id_native[722]]).floatValue();
    }

    public void SC() {
        this.id_private();
        if (!((rdn_3)this.id_private[id_native[687]]).id_class()) {
            ((rdn_3)this.id_private[id_native[688]]).id_class((rYB)this.id_throws[id_native[689]], this, this.SH());
            if (((rdn_3)this.id_private[id_native[690]]).id_volatile()) {
                this.id_final();
            }
        }
        this.id_throw();
    }

    public float ST() {
        return id_implements[106] * this.rl();
    }

    public Random Sa() {
        return (Random)this.id_throws[id_native[113]];
    }

    public void sM() {
        int n;
        int n2;
        int n3;
        xc_3 xc_32;
        if (!this.BF() && !(xc_32 = ((rYB)this.id_throws[id_native[290]]).id_byte(new rfH_2(n3 = rfU_2.id_byte(this.rx()), n2 = rfU_2.id_byte(this.re() - id_protected[46]), n = rfU_2.id_byte(this.BO())))).id_catch()) {
            zr_3 zr_32 = xc_32.id_package();
            this.id_class(zr_32.id_catch(), zr_32.id_class() * id_implements[59], zr_32.id_break() * id_implements[60]);
        }
    }

    public boolean SL() {
        return id_break[242];
    }

    public iZ_2<?> SF() {
        this.id_private();
        return (iZ_2)this.id_private[id_native[20]];
    }

    public aL_2 sG() {
        return aL_2.id_class;
    }

    public float SR() {
        return this.n_() ? id_implements[23] : id_implements[24];
    }

    public iB_2 Sh() {
        this.id_private();
        if (((ryR_2)this.id_private[id_native[296]]).id_byte() != null) {
            return ((ryR_2)this.id_private[id_native[297]]).id_byte();
        }
        if ((rhd_3)this.id_private[id_native[298]] != null) {
            return (rhd_3)this.id_private[id_native[299]];
        }
        return (iB_2)this.id_private[id_native[300]] != null ? (iB_2)this.id_private[id_native[301]] : null;
    }

    public int SE() {
        this.id_private();
        return (Integer)this.id_private[id_native[123]];
    }

    public boolean SX() {
        return !this.n_() ? id_break[30] : id_break[31];
    }

    public void Sx() {
    }

    public rye_3 SJ() {
        this.id_private();
        if (((rYB)this.id_throws[id_native[244]]).r() - (Long)this.id_private[id_native[245]] > id_extends[0]) {
            Object var5_1 = null;
            this.id_private[iB_2.id_native[246]] = var5_1;
        }
        return (rye_3)this.id_private[id_native[247]];
    }

    public void St() {
        this.id_private();
        iB_2 iB_22 = this;
        Integer n = (Integer)iB_22.id_private[id_native[105]] + id_break[26];
        iB_22.id_private[iB_2.id_native[106]] = n;
        if ((Integer)this.id_private[id_native[107]] == id_finally[7]) {
            this.PD();
            for (int i = id_break[27]; i < id_finally[8]; ++i) {
                double d = ((Random)this.id_throws[id_native[108]]).nextGaussian() * id_protected[19];
                double d2 = ((Random)this.id_throws[id_native[109]]).nextGaussian() * id_protected[20];
                double d3 = ((Random)this.id_throws[id_native[110]]).nextGaussian() * id_protected[21];
                ((rYB)this.id_throws[id_native[111]]).id_class(rLQ.id_boolean, this.id_break(id_protected[22]), this.Ph(), this.id_protected(id_protected[23]), d, d2, d3);
            }
        }
    }

    public abstract rpZ_2 Su();

    public void SI() {
        ic_3 ic_32 = this.id_byte(iQ_2.id_protected);
        if (ic_32 != null && ic_32.id_class((UUID)id_catch[id_native[101]]) != null) {
            ic_32.id_break((UUID)id_catch[id_native[102]]);
        }
    }

    public float SK() {
        return (float)this.id_class(iQ_2.id_class);
    }

    public rdn_3 Sn() {
        return this.id_class(rXQ.OFFHAND);
    }

    public boolean Sz() {
        return ((Byte)((rmE_2)this.id_throws[id_native[566]]).id_class((rut_3)id_catch[id_native[567]]) & id_finally[72]) != 0 ? id_break[194] : id_break[195];
    }

    public int SU() {
        this.id_private();
        return this.id_return() ? ((rdn_3)this.id_private[id_native[685]]).id_extends() - this.SH() : id_break[225];
    }

    public ryR_2 SW() {
        this.id_private();
        return (ryR_2)this.id_private[id_native[295]];
    }

    public int SM() {
        return (Integer)((rmE_2)this.id_throws[id_native[306]]).id_class((rut_3)id_catch[id_native[307]]);
    }

    public int Sw() {
        this.id_private();
        return (Integer)this.id_private[id_native[686]];
    }

    public boolean Sq() {
        return id_break[243];
    }

    public boolean SY() {
        this.id_private();
        if (((rYB)this.id_throws[iB_2.id_native[191]]).id_continue) {
            return id_break[52];
        }
        Iterator iterator = ((Map)this.id_private[id_native[192]]).values().iterator();
        boolean bl = id_break[53];
        while (iterator.hasNext()) {
            this.id_class((rLY)iterator.next());
            iterator.remove();
            bl = id_break[54];
        }
        return bl;
    }

    public void SA() {
        this.id_private();
        if (((Map)this.id_private[id_native[181]]).isEmpty()) {
            this.Bw();
            this.id_package(id_break[46]);
        } else {
            Collection<rLY> collection = ((Map)this.id_private[id_native[182]]).values();
            ((rmE_2)this.id_throws[id_native[183]]).id_break((rut_3)id_catch[id_native[184]], iB_2.id_class(collection));
            ((rmE_2)this.id_throws[id_native[185]]).id_break((rut_3)id_catch[id_native[186]], rAB.id_class(collection));
            this.id_package(this.id_break(rLD.id_final));
        }
    }

    public float Sd() {
        this.id_private();
        return ((Float)this.id_private[id_native[601]]).floatValue();
    }

    public iB_2 SZ() {
        this.id_private();
        return (iB_2)this.id_private[id_native[122]];
    }

    public void Sg() {
        this.id_private();
        float f = this.id_interface();
        if (((Boolean)this.id_private[id_native[344]]).booleanValue()) {
            iB_2 iB_22 = this;
            Integer n = (Integer)iB_22.id_private[id_native[345]] + id_break[133];
            iB_22.id_private[iB_2.id_native[346]] = n;
            if ((float)((Integer)this.id_private[id_native[347]]).intValue() >= f) {
                Integer n2 = id_break[134];
                this.id_private[iB_2.id_native[348]] = n2;
                Boolean bl = id_break[135];
                this.id_private[iB_2.id_native[349]] = bl;
            }
        } else {
            Integer n = id_break[136];
            this.id_private[iB_2.id_native[350]] = n;
        }
        Float f2 = Float.valueOf((float)((Integer)this.id_private[id_native[351]]).intValue() / f);
        this.id_private[iB_2.id_native[352]] = f2;
    }

    public static iz_3 SD() {
        return iW_2.id_class().id_class(iQ_2.id_class).id_class(iQ_2.id_byte).id_class(iQ_2.id_protected).id_class(iQ_2.id_implements).id_class(iQ_2.id_finally);
    }

    public int Se() {
        this.id_private();
        return (Integer)this.id_private[id_native[728]];
    }

    public boolean SO() {
        return this.sG() == aL_2.id_break ? id_break[8] : id_break[9];
    }

    public void SQ() {
        this.Bg().filter(((rYB)this.id_throws[id_native[714]])::id_int).ifPresent(rfH_22 -> {
            xc_3 xc_32 = ((rYB)this.id_throws[id_native[730]]).id_byte((rfH_2)rfH_22);
            if (xc_32.id_break() instanceof xb_3) {
                ((rYB)this.id_throws[id_native[731]]).id_class((rfH_2)rfH_22, (xc_3)xc_32.id_class(xb_3.id_final, id_break[251]), (int)id_finally[91]);
                rjU_2 rjU_22 = xb_3.id_class(this.BC(), (rRT)((rYB)this.id_throws[id_native[732]]), rfH_22, ((Float)this.id_throws[id_native[733]]).floatValue()).orElseGet(() -> {
                    rfH_2 rfH_23 = rfH_22.id_final();
                    return new rjU_2((double)rfH_23.b_() + id_protected[149], (double)rfH_23.c_() + id_protected[150], (double)rfH_23.d_() + id_protected[151]);
                });
                rjU_2 rjU_23 = rjU_2.id_protected(rfH_22).id_protected(rjU_22).id_protected();
                float f = (float)rfU_2.id_case(rfU_2.id_protected(rjU_23.id_protected, rjU_23.id_break) * id_protected[147] - id_protected[148]);
                this.id_new(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
                Float f2 = Float.valueOf(f);
                this.id_throws[iB_2.id_native[734]] = f2;
                Float f3 = Float.valueOf(id_implements[221]);
                this.id_throws[iB_2.id_native[735]] = f3;
            }
        });
        rjU_2 rjU_22 = this.Ps();
        this.id_class(iM_2.STANDING);
        this.id_new(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
        this.SB();
    }

    public iF_2<?> SV() {
        return iZ_2.id_class(ImmutableList.of(), ImmutableList.of());
    }

    public xc_3 sS() {
        return ((rYB)this.id_throws[id_native[285]]).id_byte(this.Bs());
    }

    public float Si() {
        return id_implements[101];
    }

    public void sP() {
        this.id_private();
        rpm_3 rpm_32 = this.P();
        if (!((rdn_3)this.id_private[id_native[675]]).equals(this.id_protected(rpm_32))) {
            this.SC();
        } else if (!((rdn_3)this.id_private[id_native[676]]).id_class() && this.id_return()) {
            this.id_class((rdn_3)this.id_private[id_native[677]], (int)id_finally[80]);
            rdn_3 rdn_32 = ((rdn_3)this.id_private[id_native[678]]).id_class((rYB)this.id_throws[id_native[679]], this);
            if (rdn_32 != (rdn_3)this.id_private[id_native[680]]) {
                this.id_class(rpm_32, rdn_32);
            }
            this.id_throw();
        }
    }

    public int Sb() {
        this.id_private();
        return (Integer)this.id_private[id_native[115]];
    }

    public boolean Sl() {
        return this.Ss() <= id_implements[31] ? id_break[71] : id_break[72];
    }

    public void Sv() {
        rjU_2 rjU_22 = this.rv();
        ((rYB)this.id_throws[id_native[94]]).id_class(rLQ.id_throw, this.rx() + (((Random)this.id_throws[id_native[95]]).nextDouble() - id_protected[13]) * (double)this.PN(), this.re() + id_protected[14], this.BO() + (((Random)this.id_throws[id_native[96]]).nextDouble() - id_protected[15]) * (double)this.PN(), rjU_22.id_break * id_protected[16], id_protected[17], rjU_22.id_protected * id_protected[18]);
        float f = ((Random)this.id_throws[id_native[97]]).nextFloat() * id_implements[12] + ((Random)this.id_throws[id_native[98]]).nextFloat() > id_implements[13] ? id_implements[14] : id_implements[15];
        this.id_class(rqn_3.xE, f, id_implements[16] + ((Random)this.id_throws[id_native[99]]).nextFloat() * id_implements[17]);
    }

    @Override
    public ap_3 a_(iM_2 iM_22) {
        return iM_22 == iM_2.SLEEPING ? (ap_3)id_catch[id_native[704]] : super.a_(iM_22).id_class(this.SR());
    }

    @Override
    public void m_() {
        ((rmE_2)this.id_throws[id_native[21]]).id_class((rut_3)id_catch[id_native[22]], id_break[3]);
        ((rmE_2)this.id_throws[id_native[23]]).id_class((rut_3)id_catch[id_native[24]], id_break[4]);
        ((rmE_2)this.id_throws[id_native[25]]).id_class((rut_3)id_catch[id_native[26]], id_break[5]);
        ((rmE_2)this.id_throws[id_native[27]]).id_class((rut_3)id_catch[id_native[28]], id_break[6]);
        ((rmE_2)this.id_throws[id_native[29]]).id_class((rut_3)id_catch[id_native[30]], id_break[7]);
        ((rmE_2)this.id_throws[id_native[31]]).id_class((rut_3)id_catch[id_native[32]], Float.valueOf(id_implements[4]));
        ((rmE_2)this.id_throws[id_native[33]]).id_class((rut_3)id_catch[id_native[34]], Optional.empty());
    }

    @Override
    public ruS_2<?> p_() {
        return new rFh_1(this);
    }

    public boolean n_() {
        return id_break[23];
    }

    public float u_() {
        return this.Ss();
    }

    public boolean o_() {
        this.id_private();
        if (this.id_native()) {
            return id_break[106];
        }
        rfH_2 rfH_22 = this.Bs();
        xc_3 xc_32 = this.sS();
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32.id_class(rls_3.F)) {
            Optional<rfH_2> optional;
            this.id_private[iB_2.id_native[283]] = optional = Optional.of(rfH_22);
            return id_break[107];
        }
        if (xd_32 instanceof zv_3 && this.id_byte(rfH_22, xc_32)) {
            Optional<rfH_2> optional;
            this.id_private[iB_2.id_native[284]] = optional = Optional.of(rfH_22);
            return id_break[108];
        }
        return id_break[109];
    }

    @Override
    public void c_(boolean bl) {
        super.c_(bl);
        ic_3 ic_32 = this.id_byte(iQ_2.id_protected);
        if (ic_32.id_class((UUID)id_catch[id_native[354]]) != null) {
            ic_32.id_protected((ix_3)id_catch[id_native[355]]);
        }
        if (bl) {
            ic_32.id_break((ix_3)id_catch[id_native[356]]);
        }
    }
}

