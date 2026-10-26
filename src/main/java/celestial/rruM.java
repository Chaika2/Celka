/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.an_3;
import celestial.cG_2;
import celestial.fZ_2;
import celestial.qE_2;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rhQ_2;
import celestial.rjV_2;
import celestial.rje_3;
import celestial.rrbb_3;
import celestial.rrca_3;
import celestial.rrci_3;
import celestial.rruB;
import celestial.rruE;
import celestial.rruG;
import celestial.rruO;
import celestial.rruP;
import celestial.rruS;
import celestial.rrub_1;
import celestial.rrur_1;
import celestial.rrus_1;
import celestial.wh_3;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruM
extends Tf_1<cG_2, wh_3<cG_2>> {
    private static short[] id_byte;
    private static float[] id_protected;
    private static byte[] id_throws;
    public Object[] id_class;
    private static double[] id_case;
    private static long[] id_catch;
    public static Object[] id_break;
    private static boolean[] id_private;

    private static void id_byte(Ok_1 ok_1, rjV_2 rjV_22, rjV_2 rjV_23, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2) {
        float f7;
        if (f < f4) {
            f7 = f;
            f = f4;
            f4 = f7;
        }
        if (f2 < f5) {
            f7 = f2;
            f2 = f5;
            f5 = f7;
        }
        f7 = id_protected[229];
        float f8 = id_protected[230];
        float f9 = id_protected[231];
        float f10 = id_protected[232];
        float f11 = f10 - f9;
        float f12 = f11 / (float)((Integer)id_break[id_byte[54]]).intValue();
        f10 = f9 + f12 * (float)(n + id_private[16]);
        ok_1.id_class(rjV_23, f, f5, f3).id_class(id_protected[233], id_protected[234], id_protected[235], id_protected[236]).id_class(id_protected[237], f10).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[238], id_protected[239], id_protected[240]).id_class();
        ok_1.id_class(rjV_23, f4, f5, f3).id_class(id_protected[241], id_protected[242], id_protected[243], id_protected[244]).id_class(id_protected[245], f10).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[246], id_protected[247], id_protected[248]).id_class();
        ok_1.id_class(rjV_22, f4, f2, f6).id_class(id_protected[249], id_protected[250], id_protected[251], id_protected[252]).id_class(id_protected[253], f9 += f12 * (float)n).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[254], id_protected[255], id_protected[256]).id_class();
        ok_1.id_class(rjV_22, f, f2, f6).id_class(id_protected[257], id_protected[258], id_protected[259], id_protected[260]).id_class(id_protected[261], f9).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[262], id_protected[263], id_protected[264]).id_class();
    }

    private void id_byte(Ml_1 ml_1, cG_2 cG_22, float f, int n) {
        rruO rruO2 = cG_22.id_throws();
        ml_1.id_class();
        rdn_3 rdn_32 = cG_22.id_class(rXQ.CHEST);
        double d = !rdn_32.id_class() ? id_case[0] : id_case[1];
        ml_1.id_class(id_case[2], id_case[3], d);
        rruG rruG2 = rruO2.id_protected().get(id_private[6]);
        float f2 = rruO2.id_protected().get(n).id_class(f) - rruG2.id_class(f);
        if (f2 > id_protected[32]) {
            f2 = id_protected[33];
        }
        float f3 = rruG2.id_protected(f) - (float)n - rruO2.id_protected().get(n).id_protected(f);
        float f4 = rruG2.id_byte(f) - rruO2.id_protected().get(n).id_byte(f);
        float f5 = id_protected[34];
        float f6 = this.id_class(f, n, rruO2);
        float f7 = id_protected[35];
        if (cG_22.x()) {
            f7 += id_protected[36];
            ml_1.id_class(id_case[4], id_case[5], id_case[6]);
        }
        float f8 = this.id_class(n, cG_22.W());
        ml_1.id_class(rje_3.id_break.id_byte(id_protected[37] + f7 + f8));
        ml_1.id_class(rje_3.id_case.id_byte(id_protected[38]));
        ml_1.id_class(rje_3.id_protected.id_byte(id_protected[39]));
        ml_1.id_class((double)(-f4 / (float)((Integer)id_break[id_byte[19]]).intValue()), (double)(f3 / (float)((Integer)id_break[id_byte[20]]).intValue()), (double)(f2 / (float)((Integer)id_break[id_byte[21]]).intValue()));
        ml_1.id_class(id_case[7], id_case[8], id_case[9]);
        ml_1.id_class(id_case[10], (double)((float)n * id_protected[40] / (float)((Integer)id_break[id_byte[22]]).intValue()), id_case[11]);
        ml_1.id_class(rje_3.id_break.id_byte(-f6));
        ml_1.id_class(id_case[12], (double)((float)(-n) * id_protected[41] / (float)((Integer)id_break[id_byte[23]]).intValue()), id_case[13]);
        ml_1.id_class(id_case[14], id_case[15], id_case[16]);
    }

    public rruM(qE_2<cG_2, wh_3<cG_2>> qE_22) {
        super(qE_22);
        Iq_1[] iq_1Array;
        this.id_case();
        this.id_class[rruM.id_byte[1]] = iq_1Array = new Iq_1[((Integer)id_break[id_byte[0]]).intValue()];
        Integer n = id_throws[0];
        rruM.id_break[rruM.id_byte[2]] = n;
        this.id_throws();
    }

    static {
        rruM.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{38, -19, -77, 113, -102, 118, 71, -51}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_class(Ml_1 ml_1, cG_2 cG_22, float f, int n) {
        ml_1.id_class();
        ml_1.id_class(id_case[18], id_case[19], id_case[20]);
        double d = rfU_2.id_protected((double)f, (Double)cG_22.id_implements[id_byte[27]], (Double)cG_22.id_implements[id_byte[28]]) - rfU_2.id_protected((double)f, (Double)cG_22.id_throws[id_byte[29]], cG_22.rx());
        double d2 = rfU_2.id_protected((double)f, (Double)cG_22.id_implements[id_byte[30]], (Double)cG_22.id_implements[id_byte[31]]) - rfU_2.id_protected((double)f, (Double)cG_22.id_throws[id_byte[32]], cG_22.re());
        double d3 = rfU_2.id_protected((double)f, (Double)cG_22.id_implements[id_byte[33]], (Double)cG_22.id_implements[id_byte[34]]) - rfU_2.id_protected((double)f, (Double)cG_22.id_throws[id_byte[35]], cG_22.BO());
        float f2 = ((Float)cG_22.id_private[id_byte[36]]).floatValue() + ((Float)cG_22.id_private[id_byte[37]]).floatValue() - ((Float)cG_22.id_private[id_byte[38]]).floatValue();
        double d4 = rfU_2.id_class(f2 * id_protected[42]);
        double d5 = -rfU_2.id_break(f2 * id_protected[43]);
        float f3 = (float)d2 * id_protected[44];
        f3 = rfU_2.id_class(f3, id_protected[45], id_protected[46]);
        float f4 = (float)(d * d4 + d3 * d5) * rruM.id_class(id_protected[47] / (float)((Integer)id_break[id_byte[39]]).intValue() * (float)n) * id_protected[48];
        f4 = rfU_2.id_class(f4, id_protected[49], id_protected[50] * rruM.id_class(id_protected[51] / (float)((Integer)id_break[id_byte[40]]).intValue() * (float)n));
        float f5 = (float)(d * d5 - d3 * d4) * id_protected[52];
        f5 = rfU_2.id_class(f5, id_protected[53], id_protected[54]);
        float f6 = rfU_2.id_catch(f, ((Float)cG_22.id_implements[id_byte[41]]).floatValue(), ((Float)cG_22.id_implements[id_byte[42]]).floatValue());
        f3 += rfU_2.id_class(rfU_2.id_catch(f, ((Float)cG_22.id_throws[id_byte[43]]).floatValue(), ((Float)cG_22.id_throws[id_byte[44]]).floatValue()) * id_protected[55]) * id_protected[56] * f6;
        if (cG_22.x()) {
            f3 += id_protected[57];
            ml_1.id_class(id_case[21], id_case[22], id_case[23]);
        }
        float f7 = this.id_class(n, cG_22.W());
        ml_1.id_class(rje_3.id_break.id_byte(id_protected[58] + f4 / id_protected[59] + f3 + f7));
        ml_1.id_class(rje_3.id_case.id_byte(f5 / id_protected[60]));
        ml_1.id_class(rje_3.id_protected.id_byte(id_protected[61] - f5 / id_protected[62]));
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, cG_2 cG_22, float f, float f2, float f3, float f4, float f5, float f6) {
        rdn_3 rdn_32;
        if (cG_22.id_super() && !cG_22.Pp() && cG_22.id_class(rhQ_2.CAPE) && cG_22.id_case() != null && (rdn_32 = cG_22.id_class(rXQ.CHEST)).id_break() != rdy_3.kc) {
            ml_1.id_class();
            ml_1.id_class(id_case[27], id_case[28], id_case[29]);
            double d = rfU_2.id_protected((double)f3, (Double)cG_22.id_implements[id_byte[58]], (Double)cG_22.id_implements[id_byte[59]]) - rfU_2.id_protected((double)f3, (Double)cG_22.id_throws[id_byte[60]], cG_22.rx());
            double d2 = rfU_2.id_protected((double)f3, (Double)cG_22.id_implements[id_byte[61]], (Double)cG_22.id_implements[id_byte[62]]) - rfU_2.id_protected((double)f3, (Double)cG_22.id_throws[id_byte[63]], cG_22.re());
            double d3 = rfU_2.id_protected((double)f3, (Double)cG_22.id_implements[id_byte[64]], (Double)cG_22.id_implements[id_byte[65]]) - rfU_2.id_protected((double)f3, (Double)cG_22.id_throws[id_byte[66]], cG_22.BO());
            float f7 = ((Float)cG_22.id_private[id_byte[67]]).floatValue() + (((Float)cG_22.id_private[id_byte[68]]).floatValue() - ((Float)cG_22.id_private[id_byte[69]]).floatValue());
            double d4 = rfU_2.id_class(f7 * id_protected[265]);
            double d5 = -rfU_2.id_break(f7 * id_protected[266]);
            float f8 = (float)d2 * id_protected[267];
            f8 = rfU_2.id_class(f8, id_protected[268], id_protected[269]);
            float f9 = (float)(d * d4 + d3 * d5) * id_protected[270];
            f9 = rfU_2.id_class(f9, id_protected[271], id_protected[272]);
            float f10 = (float)(d * d5 - d3 * d4) * id_protected[273];
            f10 = rfU_2.id_class(f10, id_protected[274], id_protected[275]);
            if (f9 < id_protected[276]) {
                f9 = id_protected[277];
            }
            if (f9 > id_protected[278]) {
                f9 = id_protected[279];
            }
            if (f8 < id_protected[280]) {
                f8 = id_protected[281];
            }
            float f11 = rfU_2.id_catch(f3, ((Float)cG_22.id_implements[id_byte[70]]).floatValue(), ((Float)cG_22.id_implements[id_byte[71]]).floatValue());
            f8 += rfU_2.id_class(rfU_2.id_catch(f3, ((Float)cG_22.id_throws[id_byte[72]]).floatValue(), ((Float)cG_22.id_throws[id_byte[73]]).floatValue()) * id_protected[282]) * id_protected[283] * f11;
            if (cG_22.x()) {
                f8 += id_protected[284];
            }
            float f12 = rrbb_3.rV() * id_protected[285];
            f12 = rrbb_3.id_class(f12, id_protected[286], id_protected[287]);
            Float f13 = Float.valueOf(rfU_2.id_catch(f12, ((Float)cG_22.id_class[id_byte[74]]).floatValue(), id_protected[288] + f9 / id_protected[289] + f8));
            cG_22.id_class[rruM.id_byte[75]] = f13;
            Float f14 = Float.valueOf(rfU_2.id_catch(f12, ((Float)cG_22.id_class[id_byte[76]]).floatValue(), f10 / id_protected[290]));
            cG_22.id_class[rruM.id_byte[77]] = f14;
            Float f15 = Float.valueOf(rfU_2.id_catch(f12, ((Float)cG_22.id_class[id_byte[78]]).floatValue(), id_protected[291] - f10 / id_protected[292]));
            cG_22.id_class[rruM.id_byte[79]] = f15;
            ml_1.id_class(rje_3.id_break.id_byte(((Float)cG_22.id_class[id_byte[80]]).floatValue()));
            ml_1.id_class(rje_3.id_case.id_byte(((Float)cG_22.id_class[id_byte[81]]).floatValue()));
            ml_1.id_class(rje_3.id_protected.id_byte(((Float)cG_22.id_class[id_byte[82]]).floatValue()));
            Ok_1 ok_1 = hx_1.getBuffer(HU.id_break(cG_22.id_case()));
            ((wh_3)this.id_byte()).id_break(ml_1, ok_1, n, fZ_2.id_class);
            ml_1.id_break();
        }
    }

    @Override
    public /* synthetic */ void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, an_3 an_32, float f, float f2, float f3, float f4, float f5, float f6) {
        this.id_break(ml_1, hx_1, n, (cG_2)an_32, f, f2, f3, f4, f5, f6);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA9FACC4B58FC0A52L;
    }

    private static float id_class(float f) {
        return rfU_2.id_class((float)((double)f * id_case[25] / id_case[26]));
    }

    private rrci_3 id_class(cG_2 cG_22, Hx_1 hx_1) {
        if (!cG_22.id_super() || !cG_22.id_class(rhQ_2.CAPE) || cG_22.id_case() == null) {
            return null;
        }
        Ok_1 ok_1 = hx_1.getBuffer(HU.id_byte(cG_22.id_case()));
        ((rruB)rruM.id_break[rruM.id_byte[55]]).id_class[rruM.id_byte[56]] = ok_1;
        return (rruB)id_break[id_byte[57]];
    }

    private static void id_class(cG_2 cG_22, Ok_1 ok_1, rjV_2 rjV_22, rjV_2 rjV_23, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2) {
        float f7;
        if (f < f4) {
            f7 = f;
            f = f4;
            f4 = f7;
        }
        if (f2 < f5) {
            f7 = f2;
            f2 = f5;
            f5 = f7;
            rjV_2 rjV_24 = rjV_22;
            rjV_22 = rjV_23;
            rjV_23 = rjV_24;
        }
        f7 = id_protected[65];
        float f8 = id_protected[66];
        float f9 = id_protected[67];
        float f10 = id_protected[68];
        float f11 = f10 - f9;
        float f12 = f11 / (float)((Integer)id_break[id_byte[49]]).intValue();
        f10 = f9 + f12 * (float)(n + id_private[11]);
        byte by = id_throws[5];
        ok_1.id_class(rjV_23, f, f5, f3).id_class(by).id_class(id_protected[69], f9 += f12 * (float)n).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[70], id_protected[71], id_protected[72]).id_class();
        ok_1.id_class(rjV_23, f4, f5, f3).id_class(by).id_class(id_protected[73], f9).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[74], id_protected[75], id_protected[76]).id_class();
        ok_1.id_class(rjV_22, f4, f2, f6).id_class(by).id_class(id_protected[77], f10).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[78], id_protected[79], id_protected[80]).id_class();
        ok_1.id_class(rjV_22, f, f2, f6).id_class(by).id_class(id_protected[81], f10).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[82], id_protected[83], id_protected[84]).id_class();
    }

    private static void id_class(Ok_1 ok_1, rjV_2 rjV_22, rjV_2 rjV_23, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2) {
        float f7;
        if (f < f4) {
            f7 = f;
            f = f4;
            f4 = f7;
        }
        if (f2 < f5) {
            f7 = f2;
            f2 = f5;
            f5 = f7;
        }
        f7 = id_protected[121];
        float f8 = id_protected[122];
        float f9 = id_protected[123];
        float f10 = id_protected[124];
        float f11 = f10 - f9;
        float f12 = f11 / (float)((Integer)id_break[id_byte[51]]).intValue();
        f10 = f9 + f12 * (float)(n + id_private[13]);
        ok_1.id_class(rjV_22, f4, f2, f3).id_class(id_protected[125], id_protected[126], id_protected[127], id_protected[128]).id_class(id_protected[129], f10).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[130], id_protected[131], id_protected[132]).id_class();
        ok_1.id_class(rjV_22, f4, f2, f6).id_class(id_protected[133], id_protected[134], id_protected[135], id_protected[136]).id_class(id_protected[137], f10).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[138], id_protected[139], id_protected[140]).id_class();
        ok_1.id_class(rjV_23, f4, f5, f6).id_class(id_protected[141], id_protected[142], id_protected[143], id_protected[144]).id_class(id_protected[145], f9 += f12 * (float)n).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[146], id_protected[147], id_protected[148]).id_class();
        ok_1.id_class(rjV_23, f4, f5, f3).id_class(id_protected[149], id_protected[150], id_protected[151], id_protected[152]).id_class(id_protected[153], f9).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[154], id_protected[155], id_protected[156]).id_class();
    }

    private float id_class(float f, int n, rruO rruO2) {
        if (n == (Integer)id_break[id_byte[24]] - id_private[7]) {
            return this.id_class(f, n - id_private[8], rruO2);
        }
        return (float)this.id_class(rruO2.id_protected().get(n).id_break(f), rruO2.id_protected().get(n + id_private[9]).id_break(f));
    }

    private static void id_class() {
        id_throws = new byte[]{16, 64, 32, 9, 3, -1, 2};
    }

    private double id_class(rrub_1 rrub_12, rrub_1 rrub_13) {
        rrub_1 rrub_14 = rrub_13.id_break(rrub_12);
        return Math.toDegrees(Math.atan2(((Float)rrub_14.id_class[id_byte[25]]).floatValue(), ((Float)rrub_14.id_class[id_byte[26]]).floatValue())) + id_case[17];
    }

    private void id_class(Ml_1 ml_1, Hx_1 hx_1, rrci_3 rrci_32, cG_2 cG_22, float f, int n) {
        Ok_1 ok_1 = rrci_32.id_class(hx_1, cG_22);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        rjV_2 rjV_22 = null;
        float f2 = id_protected[5] / (float)((Integer)id_break[id_byte[13]]).intValue();
        for (int i = id_private[3]; i < (Integer)id_break[id_byte[14]]; ++i) {
            this.id_break(ml_1, cG_22, f, i);
            rjV_2 rjV_23 = ml_1.id_byte().id_class();
            if (rjV_22 == null) {
                rjV_22 = rjV_23;
            }
            if (i == 0) {
                rruM.id_byte(ok_1, rjV_23, rjV_22, id_protected[6], id_protected[7], id_protected[8], id_protected[9], id_protected[10], id_protected[11], i, n);
            }
            float f3 = (float)(i + id_private[4]) * f2;
            if (i == (Integer)id_break[id_byte[15]] - id_private[5]) {
                rruM.id_protected(ok_1, rjV_23, rjV_23, id_protected[12], f3, id_protected[13], id_protected[14], f3, id_protected[15], i, n);
            }
            float f4 = (float)i * f2;
            rruM.id_class(ok_1, rjV_23, rjV_22, id_protected[16], f3, id_protected[17], id_protected[18], f4, id_protected[19], i, n);
            rruM.id_throws(ok_1, rjV_23, rjV_22, id_protected[20], f3, id_protected[21], id_protected[22], f4, id_protected[23], i, n);
            rruM.id_class(cG_22, ok_1, rjV_23, rjV_22, id_protected[24], f3, id_protected[25], id_protected[26], f4, id_protected[27], i, n);
            rruM.id_break(ok_1, rjV_22, rjV_23, id_protected[28], f3, id_protected[29], id_protected[30], f4, id_protected[31], i, n);
            rjV_22 = rjV_23.id_case();
            ml_1.id_break();
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBAC568D1;
    }

    private float id_class(int n, boolean bl) {
        long l = System.currentTimeMillis() / (long)(bl ? id_throws[3] : id_throws[4]) % id_catch[0];
        float f = (float)(n + id_private[10]) / (float)((Integer)id_break[id_byte[45]]).intValue();
        if ((rrus_1)((Object)((rruE)rruS.id_class[rruM.id_byte[46]]).id_class[id_byte[47]]) == (rrus_1)((Object)rrus_1.staticFields671469053d923ac8912036fe43a40b51[id_byte[48]])) {
            return (float)(Math.sin(Math.toRadians(f * id_protected[63] - (float)l)) * id_case[24]);
        }
        return id_protected[64];
    }

    public void id_break(Ml_1 ml_1, Hx_1 hx_1, int n, cG_2 cG_22, float f, float f2, float f3, float f4, float f5, float f6) {
        this.id_case();
        rrci_3 rrci_32 = this.id_class(cG_22, hx_1);
        if (rrci_32 == null) {
            return;
        }
        rdn_3 rdn_32 = cG_22.id_class(rXQ.CHEST);
        if (rdn_32.id_break() == rdy_3.kc) {
            return;
        }
        if (this.id_byte() instanceof rruP && !((rruP)this.id_byte()).id_protected().id_finally) {
            return;
        }
        if (cG_22.id_catch()) {
            cG_22.id_class(cG_22, (int)((Integer)id_break[id_byte[7]]));
            if ((rrur_1)((Object)((rruE)rruS.id_class[rruM.id_byte[8]]).id_class[id_byte[9]]) == (rrur_1)((Object)rrur_1.staticFields11cf60dc087237409ab550ffa4a0389b[id_byte[10]]) && rrci_32.id_class()) {
                this.id_class(ml_1, hx_1, rrci_32, cG_22, f3, n);
            } else {
                Iq_1[] iq_1Array = (Iq_1[])this.id_class[id_byte[11]];
                for (int i = id_private[2]; i < (Integer)id_break[id_byte[12]]; ++i) {
                    Iq_1 iq_1 = iq_1Array[i];
                    this.id_break(ml_1, cG_22, f3, i);
                    rrci_32.id_class(cG_22, i, iq_1, ml_1, hx_1, n, fZ_2.id_class);
                    ml_1.id_break();
                }
            }
        } else {
            this.id_class(ml_1, hx_1, n, cG_22, f, f2, f3, f4, f5, f6);
        }
    }

    private static void id_break(Ok_1 ok_1, rjV_2 rjV_22, rjV_2 rjV_23, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2) {
        float f7;
        if (f < f4) {
            f7 = f;
            f = f4;
            f4 = f7;
        }
        if (f2 < f5) {
            f7 = f2;
            f2 = f5;
            f5 = f7;
            rjV_2 rjV_24 = rjV_22;
            rjV_22 = rjV_23;
            rjV_23 = rjV_24;
        }
        f7 = id_protected[85];
        float f8 = id_protected[86];
        float f9 = id_protected[87];
        float f10 = id_protected[88];
        float f11 = f10 - f9;
        float f12 = f11 / (float)((Integer)id_break[id_byte[50]]).intValue();
        f10 = f9 + f12 * (float)(n + id_private[12]);
        ok_1.id_class(rjV_23, f, f2, f3).id_class(id_protected[89], id_protected[90], id_protected[91], id_protected[92]).id_class(id_protected[93], f10).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[94], id_protected[95], id_protected[96]).id_class();
        ok_1.id_class(rjV_23, f4, f2, f3).id_class(id_protected[97], id_protected[98], id_protected[99], id_protected[100]).id_class(id_protected[101], f10).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[102], id_protected[103], id_protected[104]).id_class();
        ok_1.id_class(rjV_22, f4, f5, f6).id_class(id_protected[105], id_protected[106], id_protected[107], id_protected[108]).id_class(id_protected[109], f9 += f12 * (float)n).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[110], id_protected[111], id_protected[112]).id_class();
        ok_1.id_class(rjV_22, f, f5, f6).id_class(id_protected[113], id_protected[114], id_protected[115], id_protected[116]).id_class(id_protected[117], f9).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[118], id_protected[119], id_protected[120]).id_class();
    }

    private void id_break(Ml_1 ml_1, cG_2 cG_22, float f, int n) {
        if ((rrca_3)((Object)((rruE)rruS.id_class[rruM.id_byte[16]]).id_class[id_byte[17]]) != (rrca_3)((Object)rrca_3.staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[id_byte[18]])) {
            this.id_byte(ml_1, cG_22, f, n);
            return;
        }
        this.id_class(ml_1, cG_22, f, n);
    }

    private static void id_break() {
        short[] sArray = new short[83];
        sArray[9] = 2;
        sArray[10] = 1;
        sArray[17] = 3;
        sArray[26] = 1;
        sArray[27] = 10;
        sArray[28] = 13;
        sArray[29] = 8;
        sArray[30] = 11;
        sArray[31] = 14;
        sArray[32] = 9;
        sArray[33] = 12;
        sArray[34] = 15;
        sArray[35] = 10;
        sArray[36] = 24;
        sArray[37] = 23;
        sArray[38] = 24;
        sArray[41] = 7;
        sArray[42] = 8;
        sArray[43] = 28;
        sArray[44] = 29;
        sArray[47] = 1;
        sArray[48] = 1;
        sArray[55] = 1;
        sArray[57] = 1;
        sArray[58] = 10;
        sArray[59] = 13;
        sArray[60] = 8;
        sArray[61] = 11;
        sArray[62] = 14;
        sArray[63] = 9;
        sArray[64] = 12;
        sArray[65] = 15;
        sArray[66] = 10;
        sArray[67] = 24;
        sArray[68] = 23;
        sArray[69] = 24;
        sArray[70] = 7;
        sArray[71] = 8;
        sArray[72] = 28;
        sArray[73] = 29;
        sArray[74] = 11;
        sArray[75] = 11;
        sArray[76] = 13;
        sArray[77] = 13;
        sArray[78] = 12;
        sArray[79] = 12;
        sArray[80] = 11;
        sArray[81] = 13;
        sArray[82] = 12;
        id_byte = sArray;
    }

    private static void id_throws(Ok_1 ok_1, rjV_2 rjV_22, rjV_2 rjV_23, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2) {
        float f7;
        if (f < f4) {
            f7 = f;
            f = f4;
            f4 = f7;
        }
        if (f2 < f5) {
            f7 = f2;
            f2 = f5;
            f5 = f7;
        }
        f7 = id_protected[157];
        float f8 = id_protected[158];
        float f9 = id_protected[159];
        float f10 = id_protected[160];
        float f11 = f10 - f9;
        float f12 = f11 / (float)((Integer)id_break[id_byte[52]]).intValue();
        f10 = f9 + f12 * (float)(n + id_private[14]);
        ok_1.id_class(rjV_22, f4, f2, f6).id_class(id_protected[161], id_protected[162], id_protected[163], id_protected[164]).id_class(id_protected[165], f10).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[166], id_protected[167], id_protected[168]).id_class();
        ok_1.id_class(rjV_22, f4, f2, f3).id_class(id_protected[169], id_protected[170], id_protected[171], id_protected[172]).id_class(id_protected[173], f10).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[174], id_protected[175], id_protected[176]).id_class();
        ok_1.id_class(rjV_23, f4, f5, f3).id_class(id_protected[177], id_protected[178], id_protected[179], id_protected[180]).id_class(id_protected[181], f9 += f12 * (float)n).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[182], id_protected[183], id_protected[184]).id_class();
        ok_1.id_class(rjV_23, f4, f5, f6).id_class(id_protected[185], id_protected[186], id_protected[187], id_protected[188]).id_class(id_protected[189], f9).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[190], id_protected[191], id_protected[192]).id_class();
    }

    private void id_throws() {
        Iq_1[] iq_1Array;
        this.id_case();
        this.id_class[rruM.id_byte[4]] = iq_1Array = new Iq_1[((Integer)id_break[id_byte[3]]).intValue()];
        for (int i = id_private[0]; i < (Integer)id_break[id_byte[5]]; ++i) {
            Iq_1 iq_1 = new Iq_1(id_throws[1], id_throws[2], id_private[1], i);
            ((Iq_1[])this.id_class[rruM.id_byte[6]])[i] = iq_1.id_class(id_protected[0], i, id_protected[1], id_protected[2], id_protected[3], id_protected[4]);
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rruM.id_private();
        rruM.id_protected();
        rruM.id_break();
        rruM.id_finally();
        rruM.id_implements();
        rruM.id_class();
        rruM.id_catch();
    }

    private static void id_finally() {
        float[] fArray = new float[293];
        fArray[0] = -5.0f;
        fArray[1] = -1.0f;
        fArray[2] = 10.0f;
        fArray[3] = 1.0f;
        fArray[4] = 1.0f;
        fArray[5] = 0.96f;
        fArray[6] = 0.3f;
        fArray[9] = -0.3f;
        fArray[11] = -0.06f;
        fArray[12] = 0.3f;
        fArray[14] = -0.3f;
        fArray[15] = -0.06f;
        fArray[16] = -0.3f;
        fArray[18] = -0.3f;
        fArray[19] = -0.06f;
        fArray[20] = 0.3f;
        fArray[22] = 0.3f;
        fArray[23] = -0.06f;
        fArray[24] = 0.3f;
        fArray[25] = -0.06f;
        fArray[26] = -0.3f;
        fArray[27] = -0.06f;
        fArray[28] = 0.3f;
        fArray[30] = -0.3f;
        fArray[36] = 25.0f;
        fArray[37] = 6.0f;
        fArray[39] = 180.0f;
        fArray[40] = 1.0f;
        fArray[41] = 1.0f;
        fArray[42] = (float)Math.PI / 180;
        fArray[43] = (float)Math.PI / 180;
        fArray[44] = 10.0f;
        fArray[45] = -6.0f;
        fArray[46] = 32.0f;
        fArray[47] = 1.0f;
        fArray[48] = 100.0f;
        fArray[50] = 150.0f;
        fArray[51] = 1.0f;
        fArray[52] = 100.0f;
        fArray[53] = -20.0f;
        fArray[54] = 20.0f;
        fArray[55] = 6.0f;
        fArray[56] = 32.0f;
        fArray[57] = 25.0f;
        fArray[58] = 6.0f;
        fArray[59] = 2.0f;
        fArray[60] = 2.0f;
        fArray[61] = 180.0f;
        fArray[62] = 2.0f;
        fArray[63] = 360.0f;
        fArray[65] = 0.015625f;
        fArray[66] = 0.171875f;
        fArray[67] = 0.03125f;
        fArray[68] = 0.53125f;
        fArray[69] = 0.171875f;
        fArray[70] = 1.0f;
        fArray[73] = 0.015625f;
        fArray[74] = 1.0f;
        fArray[77] = 0.015625f;
        fArray[78] = 1.0f;
        fArray[81] = 0.171875f;
        fArray[82] = 1.0f;
        fArray[83] = 1.0f;
        fArray[84] = 1.0f;
        fArray[85] = 0.1875f;
        fArray[86] = 0.34375f;
        fArray[87] = 0.03125f;
        fArray[88] = 0.53125f;
        fArray[89] = 1.0f;
        fArray[90] = 1.0f;
        fArray[91] = 1.0f;
        fArray[92] = 1.0f;
        fArray[93] = 0.1875f;
        fArray[94] = 1.0f;
        fArray[97] = 1.0f;
        fArray[98] = 1.0f;
        fArray[99] = 1.0f;
        fArray[100] = 1.0f;
        fArray[101] = 0.34375f;
        fArray[102] = 1.0f;
        fArray[105] = 1.0f;
        fArray[106] = 1.0f;
        fArray[107] = 1.0f;
        fArray[108] = 1.0f;
        fArray[109] = 0.34375f;
        fArray[110] = 1.0f;
        fArray[113] = 1.0f;
        fArray[114] = 1.0f;
        fArray[115] = 1.0f;
        fArray[116] = 1.0f;
        fArray[117] = 0.1875f;
        fArray[118] = 1.0f;
        fArray[119] = 1.0f;
        fArray[120] = 1.0f;
        fArray[122] = 0.015625f;
        fArray[123] = 0.03125f;
        fArray[124] = 0.53125f;
        fArray[125] = 1.0f;
        fArray[126] = 1.0f;
        fArray[127] = 1.0f;
        fArray[128] = 1.0f;
        fArray[130] = 1.0f;
        fArray[133] = 1.0f;
        fArray[134] = 1.0f;
        fArray[135] = 1.0f;
        fArray[136] = 1.0f;
        fArray[137] = 0.015625f;
        fArray[138] = 1.0f;
        fArray[141] = 1.0f;
        fArray[142] = 1.0f;
        fArray[143] = 1.0f;
        fArray[144] = 1.0f;
        fArray[145] = 0.015625f;
        fArray[146] = 1.0f;
        fArray[149] = 1.0f;
        fArray[150] = 1.0f;
        fArray[151] = 1.0f;
        fArray[152] = 1.0f;
        fArray[154] = 1.0f;
        fArray[155] = 1.0f;
        fArray[156] = 1.0f;
        fArray[157] = 0.171875f;
        fArray[158] = 0.1875f;
        fArray[159] = 0.03125f;
        fArray[160] = 0.53125f;
        fArray[161] = 1.0f;
        fArray[162] = 1.0f;
        fArray[163] = 1.0f;
        fArray[164] = 1.0f;
        fArray[165] = 0.171875f;
        fArray[166] = 1.0f;
        fArray[169] = 1.0f;
        fArray[170] = 1.0f;
        fArray[171] = 1.0f;
        fArray[172] = 1.0f;
        fArray[173] = 0.1875f;
        fArray[174] = 1.0f;
        fArray[177] = 1.0f;
        fArray[178] = 1.0f;
        fArray[179] = 1.0f;
        fArray[180] = 1.0f;
        fArray[181] = 0.1875f;
        fArray[182] = 1.0f;
        fArray[185] = 1.0f;
        fArray[186] = 1.0f;
        fArray[187] = 1.0f;
        fArray[188] = 1.0f;
        fArray[189] = 0.171875f;
        fArray[190] = 1.0f;
        fArray[191] = 1.0f;
        fArray[192] = 1.0f;
        fArray[193] = 0.171875f;
        fArray[194] = 0.328125f;
        fArray[196] = 0.03125f;
        fArray[197] = 1.0f;
        fArray[198] = 1.0f;
        fArray[199] = 1.0f;
        fArray[200] = 1.0f;
        fArray[201] = 0.328125f;
        fArray[202] = 1.0f;
        fArray[205] = 1.0f;
        fArray[206] = 1.0f;
        fArray[207] = 1.0f;
        fArray[208] = 1.0f;
        fArray[209] = 0.171875f;
        fArray[210] = 1.0f;
        fArray[213] = 1.0f;
        fArray[214] = 1.0f;
        fArray[215] = 1.0f;
        fArray[216] = 1.0f;
        fArray[217] = 0.171875f;
        fArray[218] = 1.0f;
        fArray[221] = 1.0f;
        fArray[222] = 1.0f;
        fArray[223] = 1.0f;
        fArray[224] = 1.0f;
        fArray[225] = 0.328125f;
        fArray[226] = 1.0f;
        fArray[227] = 1.0f;
        fArray[228] = 1.0f;
        fArray[229] = 0.015625f;
        fArray[230] = 0.171875f;
        fArray[232] = 0.03125f;
        fArray[233] = 1.0f;
        fArray[234] = 1.0f;
        fArray[235] = 1.0f;
        fArray[236] = 1.0f;
        fArray[237] = 0.171875f;
        fArray[239] = 1.0f;
        fArray[241] = 1.0f;
        fArray[242] = 1.0f;
        fArray[243] = 1.0f;
        fArray[244] = 1.0f;
        fArray[245] = 0.015625f;
        fArray[247] = 1.0f;
        fArray[249] = 1.0f;
        fArray[250] = 1.0f;
        fArray[251] = 1.0f;
        fArray[252] = 1.0f;
        fArray[253] = 0.015625f;
        fArray[255] = 1.0f;
        fArray[257] = 1.0f;
        fArray[258] = 1.0f;
        fArray[259] = 1.0f;
        fArray[260] = 1.0f;
        fArray[261] = 0.171875f;
        fArray[262] = 1.0f;
        fArray[263] = 1.0f;
        fArray[264] = 1.0f;
        fArray[265] = (float)Math.PI / 180;
        fArray[266] = (float)Math.PI / 180;
        fArray[267] = 10.0f;
        fArray[268] = -6.0f;
        fArray[269] = 32.0f;
        fArray[270] = 100.0f;
        fArray[272] = 150.0f;
        fArray[273] = 100.0f;
        fArray[274] = -20.0f;
        fArray[275] = 20.0f;
        fArray[278] = 165.0f;
        fArray[279] = 165.0f;
        fArray[280] = -5.0f;
        fArray[281] = -5.0f;
        fArray[282] = 6.0f;
        fArray[283] = 32.0f;
        fArray[284] = 25.0f;
        fArray[285] = 20.0f;
        fArray[286] = 0.02f;
        fArray[287] = 1.0f;
        fArray[288] = 6.0f;
        fArray[289] = 2.0f;
        fArray[290] = 2.0f;
        fArray[291] = 180.0f;
        fArray[292] = 2.0f;
        id_protected = fArray;
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{0, new rruB()};
        id_break = objectArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_private[18]];
        }
    }

    private static void id_implements() {
        double[] dArray = new double[30];
        dArray[0] = 0.15;
        dArray[1] = 0.125;
        dArray[5] = 0.15f;
        dArray[8] = 0.03;
        dArray[9] = -0.03;
        dArray[15] = -0.03;
        dArray[16] = 0.03;
        dArray[17] = 180.0;
        dArray[20] = 0.125;
        dArray[22] = 0.15f;
        dArray[24] = 3.0;
        dArray[25] = Math.PI;
        dArray[26] = 2.0;
        dArray[29] = 0.125;
        id_case = dArray;
    }

    private static void id_protected(Ok_1 ok_1, rjV_2 rjV_22, rjV_2 rjV_23, float f, float f2, float f3, float f4, float f5, float f6, int n, int n2) {
        float f7;
        if (f < f4) {
            f7 = f;
            f = f4;
            f4 = f7;
        }
        if (f2 < f5) {
            f7 = f2;
            f2 = f5;
            f5 = f7;
        }
        f7 = id_protected[193];
        float f8 = id_protected[194];
        float f9 = id_protected[195];
        float f10 = id_protected[196];
        float f11 = f10 - f9;
        float f12 = f11 / (float)((Integer)id_break[id_byte[53]]).intValue();
        f10 = f9 + f12 * (float)(n + id_private[15]);
        ok_1.id_class(rjV_23, f, f5, f6).id_class(id_protected[197], id_protected[198], id_protected[199], id_protected[200]).id_class(id_protected[201], f9 += f12 * (float)n).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[202], id_protected[203], id_protected[204]).id_class();
        ok_1.id_class(rjV_23, f4, f5, f6).id_class(id_protected[205], id_protected[206], id_protected[207], id_protected[208]).id_class(id_protected[209], f9).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[210], id_protected[211], id_protected[212]).id_class();
        ok_1.id_class(rjV_22, f4, f2, f3).id_class(id_protected[213], id_protected[214], id_protected[215], id_protected[216]).id_class(id_protected[217], f10).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[218], id_protected[219], id_protected[220]).id_class();
        ok_1.id_class(rjV_22, f, f2, f3).id_class(id_protected[221], id_protected[222], id_protected[223], id_protected[224]).id_class(id_protected[225], f10).id_byte(fZ_2.id_class).id_break(n2).id_class(id_protected[226], id_protected[227], id_protected[228]).id_class();
    }

    private static void id_protected() {
        id_catch = new long[]{360L};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[21];
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        id_private = blArray;
    }
}

