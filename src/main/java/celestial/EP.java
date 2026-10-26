/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_const;
import celestial.C_static;
import celestial.C_strictfp;
import celestial.C_try;
import celestial.EB;
import celestial.EE;
import celestial.ES;
import celestial.Es_1;
import celestial.Ps_1;
import celestial.S;
import celestial.W;
import celestial.bw_3;
import celestial.k_1;
import celestial.rH_2;
import celestial.rU_2;
import celestial.rY_2;
import celestial.ra_3;
import celestial.re_3;
import celestial.rfH_2;
import celestial.rf_3;
import celestial.rg_3;
import celestial.rj_3;
import celestial.rja_3;
import celestial.rl_3;
import celestial.ro_3;
import celestial.rp_3;
import celestial.rpr_3;
import celestial.rq_3;
import celestial.v_1;
import celestial.x_1;
import celestial.xc_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EP
extends C_try {
    private static byte[] id_throws;
    private static short[] id_case;
    public Object[] id_break;
    private static String[] id_catch;
    private static boolean[] id_private;

    public EP(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[EP.id_private[0]] = id_catch[0];
        stringArray[EP.id_private[1]] = id_catch[1];
        stringArray[EP.id_throws[1]] = id_catch[2];
        super(c_case, stringArray);
        this.id_native();
        ro_3 ro_32 = ((C_case)this.id_class[id_case[0]]).id_double();
        this.id_break[EP.id_case[1]] = ro_32;
        Object var7_3 = null;
        this.id_break[EP.id_case[2]] = var7_3;
        Object var8_4 = null;
        this.id_break[EP.id_case[3]] = var8_4;
        Object var9_5 = null;
        this.id_break[EP.id_case[4]] = var9_5;
        c_case.s().id_class(new EB(this));
    }

    static {
        EP.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6FEDE2CD7E4F8A25L;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        this.id_native();
        Es_1 es_1 = Es_1.id_break(c_static.id_extends());
        if (es_1 == null) {
            throw new W(c_static.id_private(), id_catch[3]);
        }
        if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[5]]) || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[6]])) {
            if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[7]]) && (rU_2)this.id_break[id_case[8]] == null) {
                throw new k_1(id_catch[4]);
            }
            rU_2 rU_22 = b_.id_catch() != null ? rU_2.id_class(b_.id_catch().Bs()) : ((Ps_1)this.id_class[id_case[9]]).id_volatile();
            rU_2 rU_23 = c_static.id_final() ? (rU_2)c_static.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_case[10]], rU_22) : rU_22;
            c_static.id_class(id_private[2]);
            if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[11]])) {
                rU_2 rU_24 = rU_23;
                this.id_break[EP.id_case[12]] = rU_24;
                this.id_case(id_catch[5]);
            } else {
                ((ro_3)this.id_break[id_case[13]]).id_class((rU_2)this.id_break[id_case[14]], rU_23);
                Object var25_16 = null;
                this.id_break[EP.id_case[15]] = var25_16;
                this.id_case(id_catch[6]);
            }
        } else if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[16]])) {
            c_static.id_class(id_private[3]);
            Object var26_17 = null;
            this.id_break[EP.id_case[17]] = var26_17;
            Object[] objectArray = new Object[id_private[4]];
            objectArray[EP.id_private[5]] = ((ro_3)this.id_break[id_case[18]]).id_throws().length;
            this.id_case(String.format(id_catch[7], objectArray));
        } else if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[19]])) {
            c_static.id_class(id_private[6]);
            if ((rU_2)this.id_break[id_case[20]] != null) {
                Object var27_18 = null;
                this.id_break[EP.id_case[21]] = var27_18;
                this.id_case(id_catch[8]);
            } else {
                rY_2[] rY_2Array = ((ro_3)this.id_break[id_case[22]]).id_byte();
                if (rY_2Array.length < id_private[7]) {
                    throw new k_1(id_catch[9]);
                }
                rU_2 rU_25 = ((ro_3)this.id_break[id_case[23]]).id_class(rY_2Array[rY_2Array.length - id_private[8]]).id_byte();
                this.id_break[EP.id_case[24]] = rU_25;
                this.id_case(id_catch[10]);
            }
        } else if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[25]]) || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[26]]) || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[27]]) || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[28]]) || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[29]])) {
            rja_3 rja_32;
            rY_2 rY_22;
            int n;
            rY_2[] rY_2Array;
            re_3 re_32 = es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[30]]) ? new re_3(xu_3.id_class) : (re_3)c_static.id_break((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[id_case[31]]);
            ra_3 ra_32 = null;
            if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[32]])) {
                c_static.id_private(id_private[9]);
                rY_2Array = new ArrayList();
                rY_2Array.add(re_32);
                while (c_static.id_break(id_throws[2])) {
                    rY_2Array.add((re_3)c_static.id_break((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[id_case[33]]));
                }
                re_32 = (re_3)c_static.id_break((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[id_case[34]]);
                ra_32 = new ra_3(rY_2Array.toArray(new re_3[id_private[10]]));
            } else {
                c_static.id_class(id_private[11]);
            }
            rY_2Array = ((ro_3)this.id_break[id_case[35]]).id_byte();
            if (rY_2Array.length == 0) {
                throw new k_1(id_catch[11]);
            }
            rU_2 rU_26 = rY_2Array[id_private[12]].id_class();
            rH_2 rH_22 = new rH_2(id_private[13], id_private[14], id_private[15]);
            rY_2[] rY_2Array2 = rY_2Array;
            int n2 = rY_2Array2.length;
            for (n = id_private[16]; n < n2; ++n) {
                rY_22 = rY_2Array2[n];
                rja_32 = rY_22.id_class();
                rU_26 = new rU_2(Math.min((Integer)rU_26.id_break[id_case[36]], (Integer)((rU_2)rja_32).id_break[id_case[37]]), Math.min((Integer)rU_26.id_break[id_case[38]], (Integer)((rU_2)rja_32).id_break[id_case[39]]), Math.min((Integer)rU_26.id_break[id_case[40]], (Integer)((rU_2)rja_32).id_break[id_case[41]]));
            }
            rY_2Array2 = rY_2Array;
            n2 = rY_2Array2.length;
            for (n = id_private[17]; n < n2; ++n) {
                rY_22 = rY_2Array2[n];
                rja_32 = rY_22.id_throws();
                rU_2 rU_27 = rY_22.id_class();
                rl_3 rl_32 = new rp_3(rja_32.b_(), rja_32.c_(), rja_32.d_(), re_32);
                if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[42]])) {
                    rl_32 = new rg_3(rl_32);
                } else if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[43]])) {
                    rl_32 = new rj_3(rl_32);
                } else if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[44]])) {
                    rl_32 = new rf_3(rl_32, ra_32);
                }
                rH_22.id_class(rl_32, (Integer)rU_27.id_break[id_case[45]] - (Integer)rU_26.id_break[id_case[46]], (Integer)rU_27.id_break[id_case[47]] - (Integer)rU_26.id_break[id_case[48]], (Integer)rU_27.id_break[id_case[49]] - (Integer)rU_26.id_break[id_case[50]]);
            }
            ((C_case)this.id_class[id_case[51]]).r().id_class(id_catch[12], rH_22, (rja_3)rU_26);
            this.id_case(id_catch[13]);
        } else if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[52]])) {
            rja_3 rja_33;
            rY_2 rY_23;
            int n;
            rU_2 rU_28 = b_.id_catch() != null ? rU_2.id_class(b_.id_catch().Bs()) : ((Ps_1)this.id_class[id_case[53]]).id_volatile();
            rU_2 rU_29 = c_static.id_final() ? (rU_2)c_static.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_case[54]], rU_28) : rU_28;
            c_static.id_class(id_private[18]);
            rY_2[] rY_2Array = ((ro_3)this.id_break[id_case[55]]).id_byte();
            if (rY_2Array.length < id_private[19]) {
                throw new k_1(id_catch[14]);
            }
            bw_3 bw_32 = new bw_3((Ps_1)this.id_class[id_case[56]]);
            rU_2 rU_210 = rY_2Array[id_private[20]].id_class();
            rH_2 rH_23 = new rH_2(id_private[21], id_private[22], id_private[23]);
            rY_2[] rY_2Array3 = rY_2Array;
            int n3 = rY_2Array3.length;
            for (n = id_private[24]; n < n3; ++n) {
                rY_23 = rY_2Array3[n];
                rja_33 = rY_23.id_class();
                rU_210 = new rU_2(Math.min((Integer)rU_210.id_break[id_case[57]], (Integer)((rU_2)rja_33).id_break[id_case[58]]), Math.min((Integer)rU_210.id_break[id_case[59]], (Integer)((rU_2)rja_33).id_break[id_case[60]]), Math.min((Integer)rU_210.id_break[id_case[61]], (Integer)((rU_2)rja_33).id_break[id_case[62]]));
            }
            rY_2Array3 = rY_2Array;
            n3 = rY_2Array3.length;
            for (n = id_private[25]; n < n3; ++n) {
                rY_23 = rY_2Array3[n];
                rja_33 = rY_23.id_throws();
                rU_2 rU_211 = rY_23.id_class();
                xc_3[][][] xc_3Array = new xc_3[rja_33.b_()][rja_33.d_()][rja_33.c_()];
                for (int i = id_private[26]; i < rja_33.b_(); ++i) {
                    for (int j = id_private[27]; j < rja_33.c_(); ++j) {
                        for (int k = id_private[28]; k < rja_33.d_(); ++k) {
                            xc_3Array[i][k][j] = bw_32.id_class((Integer)rU_211.id_break[id_case[63]] + i, (Integer)rU_211.id_break[id_case[64]] + j, (Integer)rU_211.id_break[id_case[65]] + k);
                        }
                    }
                }
                ES eS = new ES(this, xc_3Array, rja_33);
                rH_23.id_class(eS, (Integer)rU_211.id_break[id_case[66]] - (Integer)rU_210.id_break[id_case[67]], (Integer)rU_211.id_break[id_case[68]] - (Integer)rU_210.id_break[id_case[69]], (Integer)rU_211.id_break[id_case[70]] - (Integer)rU_210.id_break[id_case[71]]);
            }
            rH_2 rH_24 = rH_23;
            this.id_break[EP.id_case[72]] = rH_24;
            rfH_2 rfH_22 = rU_210.id_byte(rU_29);
            this.id_break[EP.id_case[73]] = rfH_22;
            this.id_case(id_catch[15]);
        } else if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[74]])) {
            rU_2 rU_212 = b_.id_catch() != null ? rU_2.id_class(b_.id_catch().Bs()) : ((Ps_1)this.id_class[id_case[75]]).id_volatile();
            rU_2 rU_213 = c_static.id_final() ? (rU_2)c_static.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_case[76]], rU_212) : rU_212;
            c_static.id_class(id_private[29]);
            if ((rq_3)this.id_break[id_case[77]] == null) {
                throw new k_1(id_catch[16]);
            }
            ((C_case)this.id_class[id_case[78]]).r().id_class(id_catch[17], (rq_3)this.id_break[id_case[79]], (rja_3)rU_213.id_break((rja_3)this.id_break[id_case[80]]));
            this.id_case(id_catch[18]);
        } else if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[81]]) || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[82]]) || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[83]])) {
            c_static.id_protected(id_throws[3]);
            EE eE = EE.id_class(c_static.id_extends());
            if (eE == null) {
                throw new k_1(id_catch[19]);
            }
            rpr_3 rpr_32 = (rpr_3)c_static.id_break((C_strictfp)C_strictfp.staticFields1f0c66f23770348389d783dc475286cf[id_case[84]]);
            int n = c_static.id_catch(Integer.class);
            rY_2[] rY_2Array = ((ro_3)this.id_break[id_case[85]]).id_byte();
            if (rY_2Array.length < id_private[30]) {
                throw new k_1(id_catch[20]);
            }
            rY_2[] rY_2Array4 = rY_2Array = eE.id_class(rY_2Array);
            int n4 = rY_2Array4.length;
            for (int i = id_private[31]; i < n4; ++i) {
                rY_2 rY_24 = rY_2Array4[i];
                if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[86]])) {
                    ((ro_3)this.id_break[id_case[87]]).id_class(rY_24, rpr_32, n);
                    continue;
                }
                if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[88]])) {
                    ((ro_3)this.id_break[id_case[89]]).id_break(rY_24, rpr_32, n);
                    continue;
                }
                ((ro_3)this.id_break[id_case[90]]).id_byte(rY_24, rpr_32, n);
            }
            Object[] objectArray = new Object[id_private[32]];
            objectArray[EP.id_private[33]] = rY_2Array.length;
            this.id_case(String.format(id_catch[21], objectArray));
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3ACB2B48;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if (c_static.id_case()) {
            return new v_1().id_break(Es_1.id_class()).id_class(c_static.id_extends()).id_break().id_protected();
        }
        Es_1 es_1 = Es_1.id_break(c_static.id_extends());
        if (es_1 != null) {
            if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[91]]) || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[92]])) {
                if (c_static.id_catch(id_throws[4])) {
                    return c_static.id_class((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[id_case[93]]);
                }
            } else if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[94]]) || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[95]]) || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[96]]) || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[97]])) {
                if (c_static.id_case() || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[98]])) {
                    while (c_static.id_break(id_throws[5])) {
                        c_static.id_throws();
                    }
                    return c_static.id_class((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[id_case[99]]);
                }
            } else if (es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[100]]) || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[101]]) || es_1 == (Es_1)((Object)Es_1.staticFields5696f710d79436c0a6411ece0fff2016[id_case[102]])) {
                if (c_static.id_case()) {
                    return new v_1().id_break(EE.id_class()).id_class(c_static.id_extends()).id_break().id_protected();
                }
                EE eE = EE.id_class(c_static.id_extends());
                if (eE != null && c_static.id_case()) {
                    return c_static.id_class((C_strictfp)C_strictfp.staticFields1f0c66f23770348389d783dc475286cf[id_case[103]]);
                }
            }
        }
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-67, -120, 87, -120, 53, 6, -36, 10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[37];
        blArray[1] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[19] = true;
        blArray[30] = true;
        blArray[32] = true;
        blArray[35] = true;
        blArray[36] = true;
        id_private = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        EP.id_throws();
        EP.id_extends();
        EP.id_protected();
        EP.id_finally();
    }

    private static void id_finally() {
        id_throws = new byte[]{3, 2, 2, 3, 3, 2, 25, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 4};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_throws[6]];
        stringArray[EP.id_private[34]] = id_catch[23];
        stringArray[EP.id_private[35]] = id_catch[24];
        stringArray[EP.id_throws[7]] = id_catch[25];
        stringArray[EP.id_throws[8]] = id_catch[26];
        stringArray[EP.id_throws[9]] = id_catch[27];
        stringArray[EP.id_throws[10]] = id_catch[28];
        stringArray[EP.id_throws[11]] = id_catch[29];
        stringArray[EP.id_throws[12]] = id_catch[30];
        stringArray[EP.id_throws[13]] = id_catch[31];
        stringArray[EP.id_throws[14]] = id_catch[32];
        stringArray[EP.id_throws[15]] = id_catch[33];
        stringArray[EP.id_throws[16]] = id_catch[34];
        stringArray[EP.id_throws[17]] = id_catch[35];
        stringArray[EP.id_throws[18]] = id_catch[36];
        stringArray[EP.id_throws[19]] = id_catch[37];
        stringArray[EP.id_throws[20]] = id_catch[38];
        stringArray[EP.id_throws[21]] = id_catch[39];
        stringArray[EP.id_throws[22]] = id_catch[40];
        stringArray[EP.id_throws[23]] = id_catch[41];
        stringArray[EP.id_throws[24]] = id_catch[42];
        stringArray[EP.id_throws[25]] = id_catch[43];
        stringArray[EP.id_throws[26]] = id_catch[44];
        stringArray[EP.id_throws[27]] = id_catch[45];
        stringArray[EP.id_throws[28]] = id_catch[46];
        stringArray[EP.id_throws[29]] = id_catch[47];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_catch = new String[]{new String("sel"), new String("selection"), new String("s"), new String("\u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0435"), new String("\u0421\u043d\u0430\u0447\u0430\u043b\u0430 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 pos1, \u043f\u0440\u0435\u0436\u0434\u0435 \u0447\u0435\u043c \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c pos2"), new String("\u041f\u0435\u0440\u0432\u0430\u044f \u043f\u043e\u0437\u0438\u0446\u0438\u044f \u0431\u044b\u043b\u0430 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u0430, \u0442\u0435\u043f\u0435\u0440\u044c \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u0432\u0442\u043e\u0440\u0443\u044e"), new String("\u0412\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0435 \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u043e"), new String("\u0423\u0434\u0430\u043b\u0435\u043d\u043e %d \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0439"), new String("\u041e\u0442\u043c\u0435\u043d\u044f\u0435\u043c \u043f\u0435\u0440\u0432\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e"), new String("\u041d\u0435\u0447\u0435\u0433\u043e \u043e\u0442\u043c\u0435\u043d\u044f\u0442\u044c!"), new String("\u041e\u0442\u043c\u0435\u043d\u044f\u0435\u043c \u0432\u0442\u043e\u0440\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e"), new String("\u041d\u0435\u0442 \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0439!"), new String("Fill"), new String("\u041f\u0440\u043e\u0446\u0435\u0441\u0441 \u0437\u0430\u043f\u0443\u0449\u0435\u043d!"), new String("\u041d\u0435\u0442 \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0439!"), new String("Selection copied"), new String("\u0421\u043d\u0430\u0447\u0430\u043b\u0430 \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e \u0441\u043a\u043e\u043f\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0435"), new String("Fill"), new String("Building now"), new String("\u041d\u0435\u0434\u043e\u043f\u0443\u0441\u0442\u0438\u043c\u044b\u0439 \u0442\u0438\u043f \u043f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u0438\u044f"), new String("\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0439!"), new String("\u041f\u0440\u0435\u043e\u0431\u0440\u0430\u0437\u043e\u0432\u0430\u043d\u043d\u044b\u0435 %d \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0439"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u043f\u043e\u0434\u043e\u0431\u043d\u0430\u044f WorldEdit"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \"sel\" \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0432\u0430\u043c \u0443\u043f\u0440\u0430\u0432\u043b\u044f\u0442\u044c \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u044f\u043c\u0438 Baritone, \u0430\u043d\u0430\u043b\u043e\u0433\u0438\u0447\u043d\u043e WorldEdit."), new String(""), new String("\u0421 \u043f\u043e\u043c\u043e\u0449\u044c\u044e \u044d\u0442\u0438\u0445 \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0439 \u0432\u044b \u043c\u043e\u0436\u0435\u0442\u0435 \u043e\u0447\u0438\u0449\u0430\u0442\u044c \u043e\u0431\u043b\u0430\u0441\u0442\u0438, \u0437\u0430\u043f\u043e\u043b\u043d\u044f\u0442\u044c \u0438\u0445 \u0431\u043b\u043e\u043a\u0430\u043c\u0438 \u0438\u043b\u0438 \u0447\u0442\u043e-\u0442\u043e \u0435\u0449\u0435."), new String(""), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u044b expand/contract/shift \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u044e\u0442 \u0441\u0432\u043e\u0435\u0433\u043e \u0440\u043e\u0434\u0430 \u0441\u0435\u043b\u0435\u043a\u0442\u043e\u0440, \u0447\u0442\u043e\u0431\u044b \u0432\u044b\u0431\u0440\u0430\u0442\u044c, \u043d\u0430 \u043a\u0430\u043a\u0438\u0435 \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u044f \u043e\u0440\u0438\u0435\u043d\u0442\u0438\u0440\u043e\u0432\u0430\u0442\u044c\u0441\u044f. \u041f\u043e\u0434\u0434\u0435\u0440\u0436\u0438\u0432\u0430\u044e\u0442\u0441\u044f a/all, n/newest \u0438 o/oldest."), new String(""), new String("Usage:"), new String("> sel pos1/p1/1 - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u043f\u0435\u0440\u0432\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u043a \u0432\u0430\u0448\u0435\u043c\u0443 \u0442\u0435\u043a\u0443\u0449\u0435\u043c\u0443 \u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u044e."), new String("> sel pos1/p1/1 <x> <y> <z> - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u043f\u0435\u0440\u0432\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u0432 \u043b\u044e\u0431\u044b\u0435 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b."), new String("> sel pos2/p2/2 - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u0432\u0442\u043e\u0440\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u043a \u0432\u0430\u0448\u0435\u043c\u0443 \u0442\u0435\u043a\u0443\u0449\u0435\u043c\u0443 \u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u044e."), new String("> sel pos2/p2/2 <x> <y> <z> - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u0432\u0442\u043e\u0440\u0443\u044e \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u0432 \u043b\u044e\u0431\u044b\u0435 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b."), new String(""), new String("> sel clear/c - \u041e\u0447\u0438\u0441\u0442\u0438\u0442\u044c \u0432\u0441\u0435 \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u044f."), new String("> sel undo/u - \u041e\u0442\u043c\u0435\u043d\u0430 \u043f\u043e\u0441\u043b\u0435\u0434\u043d\u0435\u0433\u043e \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u044f (\u0443\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0430 \u043f\u043e\u0437\u0438\u0446\u0438\u0439, \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u0435 \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0439 \u0438 \u0442.\u0434.)"), new String("> sel set/fill/s/f [block] - \u041f\u043e\u043b\u043d\u043e\u0441\u0442\u044c\u044e \u0437\u0430\u043f\u043e\u043b\u043d\u0438\u0442\u0435 \u0432\u0441\u0435 \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u044f \u0431\u043b\u043e\u043a\u043e\u043c."), new String("> sel walls/w [block] - \u0417\u0430\u043f\u043e\u043b\u043d\u0438\u0442\u044c \u0441\u0442\u0435\u043d\u044b \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u044f \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u044b\u043c \u0431\u043b\u043e\u043a\u043e\u043c."), new String("> sel shell/shl [block] - \u0422\u043e \u0436\u0435, \u0447\u0442\u043e \u0438 \u0441\u0442\u0435\u043d\u044b, \u043d\u043e \u0437\u0430\u043f\u043e\u043b\u043d\u044f\u0435\u0442 \u0442\u0430\u043a\u0436\u0435 \u043f\u043e\u0442\u043e\u043b\u043e\u043a \u0438 \u043f\u043e\u043b."), new String("> sel cleararea/ca - \u041f\u043e\u043b\u043d\u043e\u0441\u0442\u044c\u044e \u043e\u0447\u0438\u0449\u0430\u0435\u0442 \u0442\u0435\u0440\u0440\u0438\u0442\u043e\u0440\u0438\u044e \u043e\u0442 \u0431\u043b\u043e\u043a\u043e\u0432."), new String("> sel replace/r <blocks...> <with> - \u0417\u0430\u043c\u0435\u043d\u044f\u0435\u0442 \u0431\u043b\u043e\u043a\u0438 \u0434\u0440\u0443\u0433\u0438\u043c \u0431\u043b\u043e\u043a\u043e\u043c."), new String("> sel copy/cp <x> <y> <z> - \u041a\u043e\u043f\u0438\u0440\u043e\u0432\u0430\u043d\u0438\u0435 \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u043d\u043e\u0439 \u043e\u0431\u043b\u0430\u0441\u0442\u0438 \u043e\u0442\u043d\u043e\u0441\u0438\u0442\u0435\u043b\u044c\u043d\u043e \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u043e\u0439 \u0438\u043b\u0438 \u0432\u0430\u0448\u0435\u0439 \u043f\u043e\u0437\u0438\u0446\u0438\u0438."), new String("> sel paste/p <x> <y> <z> - \u041f\u043e\u0441\u0442\u0440\u043e\u0439\u0442\u0435 \u0441\u043a\u043e\u043f\u0438\u0440\u043e\u0432\u0430\u043d\u043d\u0443\u044e \u043e\u0431\u043b\u0430\u0441\u0442\u044c \u043e\u0442\u043d\u043e\u0441\u0438\u0442\u0435\u043b\u044c\u043d\u043e \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u043e\u0439 \u0438\u043b\u0438 \u0432\u0430\u0448\u0435\u0439 \u043f\u043e\u0437\u0438\u0446\u0438\u0438."), new String(""), new String("> sel expand <target> <direction> <blocks> - \u0420\u0430\u0441\u0448\u0438\u0440\u0438\u0442\u044c \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0435."), new String("> sel contract <target> <direction> <blocks> - \u0421\u043e\u0435\u0434\u0435\u043d\u0438\u0442\u044c \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u044f."), new String("> sel shift <target> <direction> <blocks> - \u0421\u0434\u0432\u0438\u043d\u0443\u0442\u044c \u0432\u044b\u0434\u0435\u043b\u0435\u043d\u0438\u0435.")};
    }

    @Override
    public boolean id_case() {
        return id_private[36];
    }

    @Override
    public String id_implements() {
        return id_catch[22];
    }

    private static void id_protected() {
        short[] sArray = new short[104];
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[12] = 1;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 2;
        sArray[17] = 1;
        sArray[19] = 3;
        sArray[20] = 1;
        sArray[21] = 1;
        sArray[24] = 1;
        sArray[25] = 4;
        sArray[26] = 5;
        sArray[27] = 6;
        sArray[28] = 7;
        sArray[29] = 8;
        sArray[30] = 7;
        sArray[32] = 8;
        sArray[38] = 1;
        sArray[39] = 1;
        sArray[40] = 2;
        sArray[41] = 2;
        sArray[42] = 5;
        sArray[43] = 6;
        sArray[44] = 8;
        sArray[47] = 1;
        sArray[48] = 1;
        sArray[49] = 2;
        sArray[50] = 2;
        sArray[52] = 10;
        sArray[53] = 1;
        sArray[56] = 1;
        sArray[59] = 1;
        sArray[60] = 1;
        sArray[61] = 2;
        sArray[62] = 2;
        sArray[64] = 1;
        sArray[65] = 2;
        sArray[68] = 1;
        sArray[69] = 1;
        sArray[70] = 2;
        sArray[71] = 2;
        sArray[72] = 2;
        sArray[73] = 3;
        sArray[74] = 11;
        sArray[75] = 1;
        sArray[77] = 2;
        sArray[79] = 2;
        sArray[80] = 3;
        sArray[81] = 9;
        sArray[82] = 12;
        sArray[83] = 13;
        sArray[86] = 9;
        sArray[88] = 12;
        sArray[92] = 1;
        sArray[94] = 4;
        sArray[95] = 5;
        sArray[96] = 7;
        sArray[97] = 8;
        sArray[98] = 8;
        sArray[100] = 9;
        sArray[101] = 12;
        sArray[102] = 13;
        id_case = sArray;
    }

    private void id_native() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[30]];
        }
    }
}

