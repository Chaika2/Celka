/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2DoubleMap
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.C_break;
import celestial.Hh_1;
import celestial.KU;
import celestial.KY;
import celestial.Ko_1;
import celestial.Oo_1;
import celestial.PX;
import celestial.QP;
import celestial.QY;
import celestial.Qs_1;
import celestial.Rm_1;
import celestial.WB;
import celestial.WP;
import celestial.aC_2;
import celestial.aI_2;
import celestial.aM_2;
import celestial.al_3;
import celestial.ao_3;
import celestial.ap_3;
import celestial.cM_2;
import celestial.cb_3;
import celestial.dq_3;
import celestial.eA_2;
import celestial.eX_2;
import celestial.gV_2;
import celestial.gy_3;
import celestial.iB_2;
import celestial.iG_2;
import celestial.iM_2;
import celestial.kB_2;
import celestial.module.combat.Popka;
import celestial.rCT;
import celestial.rKv_1;
import celestial.rLQ;
import celestial.rLX;
import celestial.rRJ;
import celestial.rRR;
import celestial.rRW;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rSK;
import celestial.rSg_1;
import celestial.rVi_1;
import celestial.rXE;
import celestial.rXQ;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rcu_3;
import celestial.rcy_3;
import celestial.rcz_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfj_3;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rgl_3;
import celestial.rgp_3;
import celestial.rgq_3;
import celestial.rgy_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rjB_2;
import celestial.rjC_2;
import celestial.rjG_2;
import celestial.rjK_2;
import celestial.rjN_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rjm_3;
import celestial.rjs_3;
import celestial.rjw_3;
import celestial.rlG_2;
import celestial.rlb_3;
import celestial.rls_3;
import celestial.rmE_2;
import celestial.rnB_2;
import celestial.rnM_2;
import celestial.rnO_2;
import celestial.rnW_2;
import celestial.roE_2;
import celestial.rpA_2;
import celestial.rpB_2;
import celestial.rpG_2;
import celestial.rpL_2;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqA_2;
import celestial.rqJ_2;
import celestial.rqL_2;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rqT_2;
import celestial.rqd_3;
import celestial.rqn_3;
import celestial.rqp_3;
import celestial.rrEl_1;
import celestial.rrEm_1;
import celestial.rrLW;
import celestial.rrLj_1;
import celestial.rrLz_1;
import celestial.rrQX;
import celestial.rrTR;
import celestial.rrTj_1;
import celestial.rsE_2;
import celestial.ruS_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zr_3;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class an_3
implements ao_3,
gV_2,
rpA_2,
rrTR {
    private static String[] id_class;
    private static short[] id_break;
    public Object[] id_throws;
    private static float[] id_protected;
    private static int[] id_catch;
    private static byte[] id_private;
    private static boolean[] id_implements;
    private static double[] id_finally;
    public static Object[] id_case;
    private static long[] id_extends;

    public float id_byte(iM_2 iM_22) {
        return this.id_class(iM_22, this.a_(iM_22));
    }

    public boolean id_byte(rhN_2 rhN_22) {
        return id_implements[227];
    }

    public rjU_2 id_byte(float f, float f2) {
        float f3 = f * id_protected[54];
        float f4 = -f2 * id_protected[55];
        float f5 = rfU_2.id_break(f4);
        float f6 = rfU_2.id_class(f4);
        float f7 = rfU_2.id_break(f3);
        float f8 = rfU_2.id_class(f3);
        return new rjU_2(f6 * f7, -f8, f5 * f7);
    }

    public boolean id_byte(rcd_3 rcd_32) {
        return !this.Pm() && this.id_protected(rcd_32) ? id_implements[117] : id_implements[118];
    }

    public void id_byte(rjU_2 rjU_22) {
        rjU_2 rjU_23 = rjU_22;
        this.id_throws[an_3.id_break[543]] = rjU_23;
    }

    public double id_byte(rfH_2 rfH_22) {
        return rfH_22.id_class(this.rx(), this.re(), this.BO(), id_implements[106]);
    }

    public double id_byte(double d) {
        return ((rjU_2)this.id_throws[an_3.id_break[548]]).id_byte + (double)this.Bm() * d;
    }

    public void id_byte(an_3 an_32) {
        double d;
        double d2;
        double d3;
        if (((rYB)this.id_throws[an_3.id_break[297]]).id_continue) {
            return;
        }
        if (!this.id_return(an_32) && !((Boolean)an_32.id_throws[id_break[298]]).booleanValue() && !((Boolean)this.id_throws[id_break[299]]).booleanValue() && (d3 = rfU_2.id_class(d2 = an_32.rx() - this.rx(), d = an_32.BO() - this.BO())) >= id_finally[140]) {
            d3 = rfU_2.id_class(d3);
            d2 /= d3;
            d /= d3;
            double d4 = id_finally[141] / d3;
            if (d4 > id_finally[142]) {
                d4 = id_finally[143];
            }
            d2 *= d4;
            d *= d4;
            d2 *= id_finally[144];
            d *= id_finally[145];
            d2 *= (double)(id_protected[48] - ((Float)this.id_throws[id_break[300]]).floatValue());
            d *= (double)(id_protected[49] - ((Float)this.id_throws[id_break[301]]).floatValue());
            if (!this.BP()) {
                this.id_implements(-d2, id_finally[146], -d);
            }
            if (!an_32.BP()) {
                an_32.id_implements(d2, id_finally[147], d);
            }
        }
    }

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA241D433;
    }

    public void id_byte(double d, double d2, double d3) {
        this.id_catch(new rjU_2(d, d2, d3));
    }

    public void id_int(double d, double d2, double d3) {
        this.id_native(d, d2, d3);
        this.PX();
    }

    public void id_int(boolean bl) {
        Boolean bl2 = bl;
        this.id_throws[an_3.id_break[112]] = bl2;
    }

    private boolean id_int() {
        rfH_2 rfH_22 = this.Bs();
        return ((rYB)this.id_throws[id_break[217]]).id_while(rfH_22) || ((rYB)this.id_throws[id_break[218]]).id_while(new rfH_2((double)rfH_22.b_(), this.rN().id_throws, (double)rfH_22.d_())) ? id_implements[73] : id_implements[74];
    }

    public rpr_3 id_int(float f) {
        return rpr_3.id_class(f);
    }

    public double id_int(an_3 an_32) {
        return this.id_break(an_32.Ps());
    }

    private static void id_long() {
        short[] sArray = new short[576];
        sArray[0] = 1;
        sArray[1] = 1;
        sArray[2] = 3;
        sArray[3] = 13;
        sArray[4] = 14;
        sArray[5] = 3;
        sArray[6] = 19;
        sArray[7] = 26;
        sArray[8] = 32;
        sArray[9] = 33;
        sArray[10] = 40;
        sArray[11] = 42;
        sArray[12] = 44;
        sArray[13] = 48;
        sArray[14] = 40;
        sArray[15] = 63;
        sArray[16] = 63;
        sArray[17] = 64;
        sArray[18] = 66;
        sArray[19] = 68;
        sArray[21] = 7;
        sArray[22] = 70;
        sArray[23] = 11;
        sArray[24] = 12;
        sArray[25] = 55;
        sArray[26] = 49;
        sArray[27] = 49;
        sArray[28] = 5;
        sArray[29] = 49;
        sArray[30] = 6;
        sArray[31] = 49;
        sArray[32] = 8;
        sArray[33] = 49;
        sArray[34] = 7;
        sArray[35] = 49;
        sArray[36] = 9;
        sArray[37] = 49;
        sArray[38] = 10;
        sArray[39] = 49;
        sArray[40] = 11;
        sArray[41] = 70;
        sArray[42] = 71;
        sArray[43] = 74;
        sArray[44] = 7;
        sArray[45] = 55;
        sArray[46] = 55;
        sArray[48] = 1;
        sArray[49] = 1;
        sArray[50] = 66;
        sArray[51] = 66;
        sArray[52] = 1024;
        sArray[53] = 66;
        sArray[54] = 66;
        sArray[55] = 49;
        sArray[56] = 1;
        sArray[57] = 1;
        sArray[58] = 1;
        sArray[59] = 7;
        sArray[60] = 7;
        sArray[61] = 16;
        sArray[62] = 27;
        sArray[63] = 49;
        sArray[64] = 11;
        sArray[65] = 49;
        sArray[66] = 11;
        sArray[67] = 11;
        sArray[68] = 11;
        sArray[69] = 11;
        sArray[70] = 11;
        sArray[71] = 11;
        sArray[72] = 11;
        sArray[73] = 15;
        sArray[74] = 16;
        sArray[75] = 70;
        sArray[76] = 11;
        sArray[77] = 11;
        sArray[78] = 11;
        sArray[79] = 7;
        sArray[80] = 27;
        sArray[81] = 4;
        sArray[82] = 4;
        sArray[83] = 4;
        sArray[84] = 14;
        sArray[85] = 13;
        sArray[86] = 29;
        sArray[87] = 28;
        sArray[88] = 16;
        sArray[89] = 18;
        sArray[90] = 15;
        sArray[91] = 17;
        sArray[92] = 7;
        sArray[93] = 42;
        sArray[94] = 42;
        sArray[95] = 42;
        sArray[96] = 42;
        sArray[97] = 42;
        sArray[98] = 31;
        sArray[99] = 31;
        sArray[100] = 7;
        sArray[101] = 42;
        sArray[102] = 48;
        sArray[103] = 58;
        sArray[104] = 58;
        sArray[105] = 58;
        sArray[106] = 58;
        sArray[107] = 42;
        sArray[108] = 42;
        sArray[109] = 42;
        sArray[110] = 7;
        sArray[111] = 7;
        sArray[112] = 20;
        sArray[113] = 20;
        sArray[114] = 38;
        sArray[115] = 75;
        sArray[116] = 77;
        sArray[117] = 76;
        sArray[118] = 26;
        sArray[119] = 26;
        sArray[120] = 26;
        sArray[121] = 57;
        sArray[122] = 57;
        sArray[123] = 21;
        sArray[124] = 22;
        sArray[126] = 23;
        sArray[127] = 24;
        sArray[128] = 24;
        sArray[129] = 20;
        sArray[130] = 21;
        sArray[131] = 22;
        sArray[132] = 57;
        sArray[134] = 7;
        sArray[135] = 20;
        sArray[136] = 7;
        sArray[137] = 20;
        sArray[138] = 7;
        sArray[139] = 29;
        sArray[140] = 29;
        sArray[141] = 30;
        sArray[142] = 30;
        sArray[143] = 30;
        sArray[144] = 32;
        sArray[145] = 32;
        sArray[146] = 30;
        sArray[147] = 33;
        sArray[148] = 30;
        sArray[149] = 33;
        sArray[150] = 7;
        sArray[151] = 42;
        sArray[152] = 40;
        sArray[153] = 40;
        sArray[154] = 7;
        sArray[155] = 7;
        sArray[156] = 7;
        sArray[157] = 20;
        sArray[158] = 37;
        sArray[159] = 37;
        sArray[160] = 7;
        sArray[161] = 37;
        sArray[162] = 7;
        sArray[163] = 37;
        sArray[164] = 7;
        sArray[165] = 7;
        sArray[166] = 11;
        sArray[167] = 11;
        sArray[168] = 11;
        sArray[169] = 7;
        sArray[170] = 7;
        sArray[171] = 7;
        sArray[172] = 7;
        sArray[173] = 7;
        sArray[174] = 7;
        sArray[175] = 11;
        sArray[176] = 11;
        sArray[177] = 7;
        sArray[178] = 69;
        sArray[179] = 68;
        sArray[180] = 69;
        sArray[182] = 7;
        sArray[183] = 7;
        sArray[184] = 7;
        sArray[185] = 20;
        sArray[186] = 37;
        sArray[187] = 37;
        sArray[188] = 7;
        sArray[189] = 37;
        sArray[190] = 7;
        sArray[191] = 37;
        sArray[192] = 7;
        sArray[193] = 7;
        sArray[194] = 30;
        sArray[195] = 7;
        sArray[196] = 7;
        sArray[197] = 7;
        sArray[198] = 7;
        sArray[199] = 40;
        sArray[200] = 40;
        sArray[201] = 7;
        sArray[202] = 49;
        sArray[203] = 9;
        sArray[204] = 49;
        sArray[205] = 9;
        sArray[206] = 49;
        sArray[207] = 10;
        sArray[208] = 49;
        sArray[209] = 10;
        sArray[210] = 31;
        sArray[211] = 7;
        sArray[212] = 31;
        sArray[213] = 31;
        sArray[214] = 31;
        sArray[215] = 31;
        sArray[216] = 43;
        sArray[217] = 7;
        sArray[218] = 7;
        sArray[219] = 7;
        sArray[220] = 45;
        sArray[221] = 44;
        sArray[222] = 7;
        sArray[223] = 43;
        sArray[224] = 43;
        sArray[225] = 48;
        sArray[226] = 31;
        sArray[227] = 43;
        sArray[228] = 43;
        sArray[229] = 45;
        sArray[230] = 46;
        sArray[231] = 7;
        sArray[232] = 7;
        sArray[233] = 46;
        sArray[234] = 7;
        sArray[235] = 40;
        sArray[236] = 40;
        sArray[237] = 40;
        sArray[238] = 40;
        sArray[239] = 70;
        sArray[240] = 40;
        sArray[241] = 70;
        sArray[242] = 40;
        sArray[243] = 70;
        sArray[244] = 7;
        sArray[245] = 40;
        sArray[246] = 70;
        sArray[247] = 40;
        sArray[248] = 70;
        sArray[249] = 40;
        sArray[250] = 70;
        sArray[251] = 7;
        sArray[252] = 7;
        sArray[253] = 7;
        sArray[254] = 7;
        sArray[255] = 40;
        sArray[256] = 70;
        sArray[257] = 40;
        sArray[258] = 70;
        sArray[259] = 46;
        sArray[260] = 46;
        sArray[261] = 46;
        sArray[262] = 48;
        sArray[263] = 44;
        sArray[265] = 15;
        sArray[266] = 72;
        sArray[267] = 15;
        sArray[268] = 7;
        sArray[269] = 7;
        sArray[270] = 7;
        sArray[271] = 15;
        sArray[272] = 15;
        sArray[273] = 15;
        sArray[274] = 16;
        sArray[275] = 16;
        sArray[276] = 16;
        sArray[277] = 15;
        sArray[278] = 17;
        sArray[279] = 16;
        sArray[280] = 18;
        sArray[281] = 8;
        sArray[282] = 9;
        sArray[283] = 10;
        sArray[284] = 15;
        sArray[285] = 16;
        sArray[286] = 15;
        sArray[287] = 16;
        sArray[288] = 8;
        sArray[289] = 9;
        sArray[290] = 10;
        sArray[291] = 34;
        sArray[292] = 35;
        sArray[293] = 36;
        sArray[294] = 9;
        sArray[295] = 10;
        sArray[296] = 11;
        sArray[297] = 7;
        sArray[298] = 38;
        sArray[299] = 38;
        sArray[300] = 39;
        sArray[301] = 39;
        sArray[302] = 57;
        sArray[303] = 25;
        sArray[304] = 16;
        sArray[305] = 18;
        sArray[306] = 16;
        sArray[307] = 17;
        sArray[308] = 18;
        sArray[309] = 15;
        sArray[310] = 17;
        sArray[311] = 15;
        sArray[312] = 8;
        sArray[313] = 9;
        sArray[314] = 10;
        sArray[315] = 71;
        sArray[316] = 8;
        sArray[317] = 9;
        sArray[318] = 10;
        sArray[319] = 8;
        sArray[320] = 9;
        sArray[321] = 10;
        sArray[322] = 7;
        sArray[323] = 7;
        sArray[324] = 7;
        sArray[325] = 4;
        sArray[326] = 27;
        sArray[327] = 5;
        sArray[328] = 5;
        sArray[329] = 5;
        sArray[330] = 15;
        sArray[331] = 16;
        sArray[332] = 31;
        sArray[333] = 42;
        sArray[334] = 20;
        sArray[335] = 62;
        sArray[336] = 58;
        sArray[337] = 65;
        sArray[338] = 65;
        sArray[339] = 66;
        sArray[340] = 66;
        sArray[341] = 15;
        sArray[342] = 16;
        sArray[343] = 15;
        sArray[344] = 17;
        sArray[345] = 16;
        sArray[346] = 18;
        sArray[347] = 15;
        sArray[348] = 15;
        sArray[349] = 31;
        sArray[350] = 42;
        sArray[351] = 20;
        sArray[352] = 62;
        sArray[353] = 58;
        sArray[354] = 63;
        sArray[355] = 63;
        sArray[356] = 64;
        sArray[357] = 15;
        sArray[358] = 16;
        sArray[359] = 15;
        sArray[360] = 16;
        sArray[362] = 66;
        sArray[363] = 1024;
        sArray[364] = 66;
        sArray[365] = 7;
        sArray[366] = 7;
        sArray[367] = 7;
        sArray[368] = 27;
        sArray[369] = 27;
        sArray[370] = 7;
        sArray[371] = 38;
        sArray[372] = 70;
        sArray[373] = 7;
        sArray[374] = 70;
        sArray[375] = 5;
        sArray[376] = 5;
        sArray[377] = 5;
        sArray[378] = 5;
        sArray[379] = 5;
        sArray[380] = 4;
        sArray[381] = 7;
        sArray[382] = 7;
        sArray[383] = 7;
        sArray[384] = 3;
        sArray[385] = 3;
        sArray[386] = 5;
        sArray[387] = 5;
        sArray[388] = 5;
        sArray[389] = 7;
        sArray[390] = 3;
        sArray[391] = 3;
        sArray[392] = 3;
        sArray[393] = 4;
        sArray[394] = 16;
        sArray[395] = 15;
        sArray[396] = 16;
        sArray[397] = 15;
        sArray[398] = 7;
        sArray[399] = 61;
        sArray[400] = 61;
        sArray[401] = 59;
        sArray[402] = 7;
        sArray[403] = 59;
        sArray[404] = 7;
        sArray[405] = 60;
        sArray[406] = 60;
        sArray[407] = 60;
        sArray[408] = 59;
        sArray[409] = 60;
        sArray[410] = 60;
        sArray[411] = 60;
        sArray[412] = 60;
        sArray[413] = 60;
        sArray[414] = 300;
        sArray[415] = 2;
        sArray[416] = 2;
        sArray[417] = 7;
        sArray[418] = 7;
        sArray[419] = 42;
        sArray[420] = 65;
        sArray[421] = 7;
        sArray[422] = 65;
        sArray[423] = 7;
        sArray[424] = 75;
        sArray[425] = 77;
        sArray[426] = 76;
        sArray[427] = 49;
        sArray[428] = 5;
        sArray[429] = 49;
        sArray[430] = 5;
        sArray[431] = 49;
        sArray[432] = 5;
        sArray[433] = 49;
        sArray[434] = 5;
        sArray[435] = 300;
        sArray[436] = 49;
        sArray[437] = 6;
        sArray[438] = 49;
        sArray[439] = 6;
        sArray[440] = 42;
        sArray[441] = 42;
        sArray[442] = 31;
        sArray[443] = 7;
        sArray[444] = 7;
        sArray[445] = 7;
        sArray[446] = 40;
        sArray[447] = 26;
        sArray[449] = 1;
        sArray[450] = 7;
        sArray[451] = 7;
        sArray[452] = 62;
        sArray[453] = 62;
        sArray[454] = 62;
        sArray[455] = 15;
        sArray[456] = 16;
        sArray[457] = 58;
        sArray[458] = 58;
        sArray[459] = 61;
        sArray[460] = 61;
        sArray[461] = 7;
        sArray[462] = 27;
        sArray[463] = 16;
        sArray[464] = 7;
        sArray[465] = 27;
        sArray[466] = 7;
        sArray[467] = 7;
        sArray[468] = 7;
        sArray[469] = 15;
        sArray[470] = 16;
        sArray[471] = 1;
        sArray[472] = 63;
        sArray[473] = 63;
        sArray[474] = 64;
        sArray[475] = 63;
        sArray[476] = 64;
        sArray[477] = 64;
        sArray[478] = 4;
        sArray[479] = 4;
        sArray[480] = 49;
        sArray[481] = 7;
        sArray[482] = 49;
        sArray[483] = 7;
        sArray[484] = 49;
        sArray[485] = 7;
        sArray[486] = 49;
        sArray[487] = 8;
        sArray[488] = 49;
        sArray[489] = 8;
        sArray[490] = 7;
        sArray[491] = 7;
        sArray[492] = 7;
        sArray[493] = 7;
        sArray[494] = 15;
        sArray[495] = 16;
        sArray[496] = 11;
        sArray[497] = 70;
        sArray[498] = 70;
        sArray[499] = 71;
        sArray[500] = 48;
        sArray[501] = 7;
        sArray[502] = 15;
        sArray[503] = 19;
        sArray[504] = 19;
        sArray[505] = 71;
        sArray[506] = 7;
        sArray[507] = 7;
        sArray[508] = 15;
        sArray[510] = 15;
        sArray[511] = 1;
        sArray[512] = 67;
        sArray[513] = 67;
        sArray[514] = 54;
        sArray[515] = 54;
        sArray[516] = 3;
        sArray[517] = 3;
        sArray[518] = 3;
        sArray[519] = 7;
        sArray[520] = 5;
        sArray[521] = 7;
        sArray[522] = 7;
        sArray[523] = 7;
        sArray[524] = 7;
        sArray[525] = 7;
        sArray[526] = 7;
        sArray[527] = 7;
        sArray[528] = 7;
        sArray[529] = 44;
        sArray[530] = 44;
        sArray[531] = 70;
        sArray[532] = 70;
        sArray[533] = 70;
        sArray[535] = 11;
        sArray[536] = 8;
        sArray[537] = 9;
        sArray[538] = 10;
        sArray[539] = 12;
        sArray[540] = 14;
        sArray[541] = 13;
        sArray[542] = 13;
        sArray[543] = 14;
        sArray[544] = 11;
        sArray[545] = 11;
        sArray[546] = 40;
        sArray[547] = 11;
        sArray[548] = 11;
        sArray[549] = 40;
        sArray[550] = 11;
        sArray[551] = 71;
        sArray[552] = 11;
        sArray[553] = 11;
        sArray[554] = 40;
        sArray[555] = 11;
        sArray[556] = 11;
        sArray[557] = 11;
        sArray[558] = 11;
        sArray[559] = 12;
        sArray[560] = 12;
        sArray[561] = 12;
        sArray[562] = 12;
        sArray[563] = 54;
        sArray[564] = 71;
        sArray[565] = 75;
        sArray[566] = 76;
        sArray[567] = 11;
        sArray[568] = 15;
        sArray[569] = 16;
        sArray[570] = 73;
        sArray[571] = 73;
        sArray[572] = 74;
        sArray[573] = 57;
        sArray[574] = 16;
        sArray[575] = 77;
        id_break = sArray;
    }

    public an_3(aI_2<?> aI_22, rYB rYB2) {
        aI_2<?> aI_23;
        this.id_abstract();
        Integer n = ((AtomicInteger)id_case[id_break[0]]).incrementAndGet();
        this.id_throws[an_3.id_break[1]] = n;
        ArrayList arrayList = Lists.newArrayList();
        this.id_throws[an_3.id_break[2]] = arrayList;
        rjU_2 rjU_22 = rjU_2.id_class;
        this.id_throws[an_3.id_break[3]] = rjU_22;
        rjU_2 rjU_23 = rjU_2.id_class;
        this.id_throws[an_3.id_break[4]] = rjU_23;
        rfl_3 rfl_32 = (rfl_3)id_case[id_break[5]];
        this.id_throws[an_3.id_break[6]] = rfl_32;
        rjU_2 rjU_24 = rjU_2.id_class;
        this.id_throws[an_3.id_break[7]] = rjU_24;
        Float f = Float.valueOf(id_protected[0]);
        this.id_throws[an_3.id_break[8]] = f;
        Float f2 = Float.valueOf(id_protected[1]);
        this.id_throws[an_3.id_break[9]] = f2;
        Random random = new Random();
        this.id_throws[an_3.id_break[10]] = random;
        Integer n2 = -this.rV();
        this.id_throws[an_3.id_break[11]] = n2;
        Object2DoubleArrayMap object2DoubleArrayMap = new Object2DoubleArrayMap((int)id_private[0]);
        this.id_throws[an_3.id_break[12]] = object2DoubleArrayMap;
        Boolean bl = id_implements[0];
        this.id_throws[an_3.id_break[13]] = bl;
        UUID uUID = rfU_2.id_class((Random)this.id_throws[id_break[14]]);
        this.id_throws[an_3.id_break[15]] = uUID;
        String string = ((UUID)this.id_throws[id_break[16]]).toString();
        this.id_throws[an_3.id_break[17]] = string;
        HashSet hashSet = Sets.newHashSet();
        this.id_throws[an_3.id_break[18]] = hashSet;
        double[] dArray = new double[id_private[1]];
        dArray[an_3.id_implements[1]] = id_finally[0];
        dArray[an_3.id_implements[2]] = id_finally[1];
        dArray[an_3.id_private[2]] = id_finally[2];
        double[] dArray2 = dArray;
        this.id_throws[an_3.id_break[19]] = dArray2;
        this.id_throws[an_3.id_break[20]] = aI_23 = aI_22;
        rYB rYB3 = rYB2;
        this.id_throws[an_3.id_break[21]] = rYB3;
        ap_3 ap_32 = aI_22.id_volatile();
        this.id_throws[an_3.id_break[22]] = ap_32;
        rjU_2 rjU_25 = rjU_2.id_class;
        this.id_throws[an_3.id_break[23]] = rjU_25;
        rfH_2 rfH_22 = rfH_2.id_protected;
        this.id_throws[an_3.id_break[24]] = rfH_22;
        rjU_2 rjU_26 = rjU_2.id_class;
        this.id_throws[an_3.id_break[25]] = rjU_26;
        this.id_new(id_finally[3], id_finally[4], id_finally[5]);
        rmE_2 rmE_22 = new rmE_2(this);
        this.id_throws[an_3.id_break[26]] = rmE_22;
        ((rmE_2)this.id_throws[id_break[27]]).id_class((rut_3)id_case[id_break[28]], id_implements[3]);
        ((rmE_2)this.id_throws[id_break[29]]).id_class((rut_3)id_case[id_break[30]], this.ri());
        ((rmE_2)this.id_throws[id_break[31]]).id_class((rut_3)id_case[id_break[32]], id_implements[4]);
        ((rmE_2)this.id_throws[id_break[33]]).id_class((rut_3)id_case[id_break[34]], Optional.empty());
        ((rmE_2)this.id_throws[id_break[35]]).id_class((rut_3)id_case[id_break[36]], id_implements[5]);
        ((rmE_2)this.id_throws[id_break[37]]).id_class((rut_3)id_case[id_break[38]], id_implements[6]);
        ((rmE_2)this.id_throws[id_break[39]]).id_class((rut_3)id_case[id_break[40]], iM_2.STANDING);
        this.m_();
        Float f3 = Float.valueOf(this.id_class(iM_2.STANDING, (ap_3)this.id_throws[id_break[41]]));
        this.id_throws[an_3.id_break[42]] = f3;
        String string2 = this.PT().id_byte();
        this.id_throws[an_3.id_break[43]] = string2;
    }

    static {
        an_3.ntfClinit();
    }

    public boolean equals(Object object) {
        if (object instanceof an_3) {
            return ((Integer)((an_3)object).id_throws[id_break[56]]).intValue() == ((Integer)this.id_throws[id_break[57]]).intValue() ? id_implements[10] : id_implements[11];
        }
        return id_implements[12];
    }

    public String toString() {
        Object[] objectArray = new Object[id_private[39]];
        objectArray[an_3.id_implements[205]] = this.getClass().getSimpleName();
        objectArray[an_3.id_implements[206]] = this.g().getString();
        objectArray[an_3.id_private[40]] = (int)((Integer)this.id_throws[id_break[449]]);
        objectArray[an_3.id_private[41]] = (rYB)this.id_throws[id_break[450]] == null ? id_class[52] : ((rYB)this.id_throws[id_break[451]]).toString();
        objectArray[an_3.id_private[42]] = this.rx();
        objectArray[an_3.id_private[43]] = this.re();
        objectArray[an_3.id_private[44]] = this.BO();
        return String.format(Locale.ROOT, id_class[51], objectArray);
    }

    public int hashCode() {
        return (Integer)this.id_throws[id_break[58]];
    }

    public boolean B() {
        return this.PF() && !this.rT() && !this.id_native() && !this.x() && !this.ry() && this.BM() ? id_implements[97] : id_implements[98];
    }

    @Override
    public boolean C() {
        return ((rYB)this.id_throws[id_break[524]]).B().id_break(rRu_1.id_final);
    }

    public boolean D() {
        return (Boolean)((rmE_2)this.id_throws[id_break[488]]).id_class((rut_3)id_case[id_break[489]]);
    }

    public boolean I() {
        return id_implements[216];
    }

    public int V() {
        return (Integer)this.id_throws[id_break[48]];
    }

    public boolean id_this(an_3 an_32) {
        return this.id_class(an_32, id_implements[147]);
    }

    public void id_this() {
        if (!((rYB)this.id_throws[an_3.id_break[79]]).id_continue) {
            this.id_break(id_private[3], this.w());
        }
        this.Pn();
    }

    public rYB e() {
        return (rYB)this.id_throws[id_break[506]];
    }

    public String i() {
        return (String)this.id_throws[id_break[477]];
    }

    public boolean x() {
        return this.Pb() == iM_2.CROUCHING ? id_implements[178] : id_implements[179];
    }

    public boolean h() {
        return this.id_finally(id_implements[177]);
    }

    public float f() {
        return id_protected[61];
    }

    @Override
    public boolean l() {
        return id_implements[253];
    }

    public void a() {
        if (this.rZ()) {
            an_3 an_32 = this;
            Integer n = (Integer)an_32.id_throws[id_break[105]] - id_implements[24];
            an_32.id_throws[an_3.id_break[106]] = n;
        }
    }

    public abstract void id_class(rcd_3 var1);

    public void id_class(an_3 an_32, int n, rye_3 rye_32) {
        if (an_32 instanceof rhN_2) {
            Oo_1.id_byte.id_class((rhN_2)an_32, this, rye_32);
        }
    }

    public void id_class(rrEm_1 rrEm_12, rSg_1 rSg_12) {
        this.id_protected((Integer)this.id_throws[id_break[440]] + id_implements[197]);
        if ((Integer)this.id_throws[id_break[441]] == 0) {
            this.id_case(id_private[34]);
        }
        this.id_break(rye_3.id_break, id_protected[62]);
    }

    public boolean id_class(rlb_3<rXs_1> rlb_32, double d) {
        int n;
        rfl_3 rfl_32 = this.rN().id_break(id_finally[189]);
        int n2 = rfU_2.id_byte(rfl_32.id_class);
        int n3 = rfU_2.id_throws(rfl_32.id_protected);
        int n4 = rfU_2.id_byte(rfl_32.id_break);
        int n5 = rfU_2.id_throws(rfl_32.id_throws);
        int n6 = rfU_2.id_byte(rfl_32.id_byte);
        if (!((rYB)this.id_throws[id_break[525]]).id_class(n2, n4, n6, n3, n5, n = rfU_2.id_throws(rfl_32.id_case))) {
            return id_implements[255];
        }
        double d2 = id_finally[190];
        boolean bl = this.u();
        boolean bl2 = id_implements[256];
        rjU_2 rjU_22 = rjU_2.id_class;
        int n7 = id_implements[257];
        rfw_3 rfw_32 = new rfw_3();
        for (int i = n2; i < n3; ++i) {
            for (int j = n4; j < n5; ++j) {
                for (int k = n6; k < n; ++k) {
                    double d3;
                    rfw_32.id_class(i, j, k);
                    rXE rXE2 = ((rYB)this.id_throws[id_break[526]]).id_break(rfw_32);
                    if (!rXE2.id_class(rlb_32) || !((d3 = (double)((float)j + rXE2.id_class((rRq_1)((rYB)this.id_throws[id_break[527]]), (rfH_2)rfw_32))) >= rfl_32.id_break)) continue;
                    bl2 = id_implements[258];
                    d2 = Math.max(d3 - rfl_32.id_break, d2);
                    if (!bl) continue;
                    rjU_2 rjU_23 = rXE2.id_byte((rYB)this.id_throws[id_break[528]], rfw_32);
                    if (d2 < id_finally[191]) {
                        rjU_23 = rjU_23.id_class(d2);
                    }
                    rjU_22 = rjU_22.id_throws(rjU_23);
                    ++n7;
                }
            }
        }
        if (rjU_22.id_case() > id_finally[192]) {
            if (n7 > 0) {
                rjU_22 = rjU_22.id_class(id_finally[193] / (double)n7);
            }
            if (!(this instanceof rhd_3)) {
                rjU_22 = rjU_22.id_protected();
            }
            rjU_2 rjU_24 = this.rv();
            rjU_22 = rjU_22.id_class(d);
            if (Math.abs(rjU_24.id_break) < id_finally[194] && Math.abs(rjU_24.id_protected) < id_finally[195] && rjU_22.id_case() < id_finally[196]) {
                rjU_22 = rjU_22.id_protected().id_class(id_finally[197]);
            }
            this.id_byte(this.rv().id_throws(rjU_22));
        }
        ((Object2DoubleMap)this.id_throws[id_break[529]]).put(rlb_32, d2);
        return bl2;
    }

    public void id_class(xd_3 xd_32) {
        Boolean bl = id_implements[190];
        this.id_throws[an_3.id_break[424]] = bl;
        xd_3 xd_33 = xd_32;
        this.id_throws[an_3.id_break[425]] = xd_33;
    }

    public void id_class(float f, int n) {
        this.id_implements(f);
    }

    public boolean id_class(int n, rdn_3 rdn_32) {
        return id_implements[228];
    }

    public an_3 id_class(rrEm_1 rrEm_12) {
        if ((rYB)this.id_throws[id_break[461]] instanceof rrEm_1 && !((Boolean)this.id_throws[id_break[462]]).booleanValue()) {
            this.K();
            WP wP = this.id_break(rrEm_12);
            if (wP == null) {
                return null;
            }
            Object obj = this.BC().id_class(rrEm_12);
            if (obj != null) {
                ((an_3)obj).id_throws(this);
                ((an_3)obj).id_class(wP.id_class.id_break, wP.id_class.id_byte, wP.id_class.id_protected, wP.id_byte, ((Float)((an_3)obj).id_throws[id_break[463]]).floatValue());
                ((an_3)obj).id_byte(wP.id_break);
                rrEm_12.id_catch((an_3)obj);
                if (rrEm_12.E() == rYB.id_throws) {
                    rrEm_1.id_class(rrEm_12);
                }
            }
            this.Pi();
            ((rrEm_1)((rYB)this.id_throws[id_break[464]])).id_volatile();
            rrEm_12.id_volatile();
            return obj;
        }
        return null;
    }

    public boolean id_class(QP qP) {
        if (this.ra() instanceof rSK) {
            return id_implements[92];
        }
        double d = this.re() + (double)this.Bx();
        rfH_2 rfH_22 = new rfH_2(this.rx(), d, this.BO());
        xc_3 xc_32 = ((rYB)this.id_throws[id_break[234]]).id_byte(rfH_22);
        return xc_32.id_byte() == qP ? id_implements[93] : id_implements[94];
    }

    private double id_class(rpB_2 rpB_22, double d) {
        int n = rpB_22.ordinal();
        double d2 = rfU_2.id_class(d + ((double[])this.id_throws[68])[n], -0.51, 0.51);
        d = d2 - ((double[])this.id_throws[68])[n];
        ((double[])this.id_throws[68])[n] = d2;
        return d;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1A83D92959703155L;
    }

    public rgP_2 id_class(rnO_2 ... rnO_2Array) {
        return rnB_2.id_class(this.BG(), this.g(), rnO_2Array).id_class(rgc_32 -> rgc_32.id_class(this.rM()).id_class(this.rz()));
    }

    public static rjU_2 id_class(rjU_2 rjU_22, rfl_3 rfl_32, rRR rRR2, rjm_3 rjm_32, rqJ_2<rjC_2> rqJ_22, boolean bl, boolean bl2) {
        boolean bl3;
        double d = rjU_22.id_break;
        double d2 = rjU_22.id_byte;
        double d3 = rjU_22.id_protected;
        if (d2 != id_finally[75]) {
            if (!bl) {
                d2 = rjw_3.id_class(rpB_2.Y, rfl_32, rRR2, d2, rjm_32, rqJ_22.id_class());
            }
            if (d2 != id_finally[76]) {
                rfl_32 = rfl_32.id_protected(id_finally[77], d2, id_finally[78]);
            }
        }
        boolean bl4 = bl3 = Math.abs(d) < Math.abs(d3) ? id_implements[65] : id_implements[66];
        if (bl3 && d3 != id_finally[79]) {
            if (!bl2) {
                d3 = rjw_3.id_class(rpB_2.Z, rfl_32, rRR2, d3, rjm_32, rqJ_22.id_class());
            }
            if (d3 != id_finally[80]) {
                rfl_32 = rfl_32.id_protected(id_finally[81], id_finally[82], d3);
            }
        }
        if (d != id_finally[83]) {
            if (!bl2) {
                d = rjw_3.id_class(rpB_2.X, rfl_32, rRR2, d, rjm_32, rqJ_22.id_class());
            }
            if (!bl3 && d != id_finally[84]) {
                rfl_32 = rfl_32.id_protected(d, id_finally[85], id_finally[86]);
            }
        }
        if (!bl3 && d3 != id_finally[87] && !bl2) {
            d3 = rjw_3.id_class(rpB_2.Z, rfl_32, rRR2, d3, rjm_32, rqJ_22.id_class());
        }
        return new rjU_2(d, d2, d3);
    }

    public boolean id_class(an_3 an_32, boolean bl) {
        an_3 an_33 = an_32;
        while ((an_3)an_33.id_throws[id_break[375]] != null) {
            if ((an_3)an_33.id_throws[id_break[376]] == this) {
                return id_implements[148];
            }
            an_33 = (an_3)an_33.id_throws[id_break[377]];
        }
        if (bl || this.id_new(an_32) && an_32.id_case(this)) {
            if (this.Pm()) {
                this.BH();
            }
            this.id_class(iM_2.STANDING);
            an_3 an_34 = an_32;
            this.id_throws[an_3.id_break[378]] = an_34;
            ((an_3)this.id_throws[id_break[379]]).id_extends(this);
            return id_implements[149];
        }
        return id_implements[150];
    }

    public void id_class(byte by) {
        if (by == id_private[25]) {
            kB_2.id_class(this);
        }
    }

    public float id_class(rRW rRW2, rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rXE rXE2, float f) {
        return f;
    }

    public void id_class(rYB rYB2) {
        rYB rYB3 = rYB2;
        this.id_throws[an_3.id_break[270]] = rYB3;
    }

    public void id_class(float f, rjU_2 rjU_22) {
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_break[264]]).id_class(this);
        rjU_2 rjU_23 = an_3.id_class(rjU_22, f, ((Float)this.id_throws[id_break[265]]).floatValue());
        this.id_byte(this.rv().id_throws(rjU_23));
        Float f2 = Float.valueOf(((Float)this.id_throws[id_break[266]]).floatValue());
        this.id_throws[an_3.id_break[267]] = f2;
    }

    public boolean id_class(rlb_3<rXs_1> rlb_32) {
        return (rlb_3)this.id_throws[id_break[259]] == rlb_32 ? id_implements[99] : id_implements[100];
    }

    public boolean id_class(rfH_2 rfH_22, xc_3 xc_32) {
        rjC_2 rjC_22 = xc_32.id_break((rRq_1)((rYB)this.id_throws[id_break[44]]), rfH_22, rjm_3.id_class(this));
        rjC_2 rjC_23 = rjC_22.id_class(rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_());
        return rjw_3.id_byte(rjC_23, rjw_3.id_class(this.rN()), rjN_2.id_implements);
    }

    public void id_class(rqA_2 rqA_22, float f, float f2) {
        if (!this.BF()) {
            ((rYB)this.id_throws[id_break[201]]).id_class(null, this.rx(), this.re(), this.BO(), rqA_22, this.Pr(), f, f2);
        }
    }

    private void id_class(boolean bl, Set<an_3> set) {
        for (an_3 an_32 : this.Bh()) {
            if (!bl || rhN_2.class.isAssignableFrom(an_32.getClass())) {
                set.add(an_32);
            }
            an_32.id_class(bl, set);
        }
    }

    public void id_class(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.id_new(d, d2, d3);
        this.id_case(f, f2);
    }

    public rcy_3 id_class(float ... fArray) {
        rcy_3 rcy_32 = new rcy_3();
        float[] fArray2 = fArray;
        int n = fArray2.length;
        for (int i = id_implements[136]; i < n; ++i) {
            float f = fArray2[i];
            rcy_32.add(rcu_3.id_class(f));
        }
        return rcy_32;
    }

    public rsE_2 id_class(rpL_2 rpL_22) {
        return this.id_class(rpL_22, id_implements[137]);
    }

    private void id_class(an_3 an_32, al_3 al_32) {
        if (this.id_synchronized(an_32)) {
            double d = this.re() + this.PS() + an_32.Pv();
            al_32.accept(an_32, this.rx(), d, this.BO());
        }
    }

    public ryZ_2 id_class(rhd_3 rhd_32, rjU_2 rjU_22, rpm_3 rpm_32) {
        return ryZ_2.PASS;
    }

    public boolean id_class(an_3 an_32, double d) {
        double d2 = ((rjU_2)an_32.id_throws[an_3.id_break[67]]).id_break - ((rjU_2)this.id_throws[an_3.id_break[68]]).id_break;
        double d3 = ((rjU_2)an_32.id_throws[an_3.id_break[69]]).id_byte - ((rjU_2)this.id_throws[an_3.id_break[70]]).id_byte;
        double d4 = ((rjU_2)an_32.id_throws[an_3.id_break[71]]).id_protected - ((rjU_2)this.id_throws[an_3.id_break[72]]).id_protected;
        return d2 * d2 + d3 * d3 + d4 * d4 < d * d ? id_implements[14] : id_implements[15];
    }

    public ryZ_2 id_class(rhd_3 rhd_32, rpm_3 rpm_32) {
        return ryZ_2.PASS;
    }

    public void id_class(double d, double d2, double d3, float f) {
        this.id_byte(new rjU_2(d, d2, d3).id_throws(f, f, f));
    }

    public boolean id_class(float f, float f2) {
        if (this.BP()) {
            for (an_3 an_32 : this.Bh()) {
                an_32.id_class(f, f2);
            }
        }
        return id_implements[70];
    }

    public rjG_2 id_class(double d, float f, boolean bl) {
        rjU_2 rjU_22 = this.id_new(f);
        rjU_2 rjU_23 = this.id_break(f);
        rjU_2 rjU_24 = rjU_22.id_break(rjU_23.id_break * d, rjU_23.id_byte * d, rjU_23.id_protected * d);
        return ((rYB)this.id_throws[id_break[324]]).id_class(new rjB_2(rjU_22, rjU_24, rjS_2.OUTLINE, bl ? rjs_3.ANY : rjs_3.NONE, this));
    }

    public void id_class(Ko_1 ko_1) {
        ko_1.id_class(id_class[54], () -> aI_2.id_class(this.BC()) + " (" + this.getClass().getCanonicalName() + ")");
        ko_1.id_class(id_class[55], (int)((Integer)this.id_throws[id_break[471]]));
        ko_1.id_class(id_class[56], () -> this.g().getString());
        Object[] objectArray = new Object[id_private[46]];
        objectArray[an_3.id_implements[219]] = this.rx();
        objectArray[an_3.id_implements[220]] = this.re();
        objectArray[an_3.id_private[47]] = this.BO();
        ko_1.id_class(id_class[57], String.format(Locale.ROOT, id_class[58], objectArray));
        ko_1.id_class(id_class[59], Ko_1.id_class(rfU_2.id_byte(this.rx()), rfU_2.id_byte(this.re()), rfU_2.id_byte(this.BO())));
        rjU_2 rjU_22 = this.rv();
        if (rjU_22 != null) {
            Object[] objectArray2 = new Object[id_private[48]];
            objectArray2[an_3.id_implements[221]] = rjU_22.id_break;
            objectArray2[an_3.id_implements[222]] = rjU_22.id_byte;
            objectArray2[an_3.id_private[49]] = rjU_22.id_protected;
            ko_1.id_class(id_class[60], String.format(Locale.ROOT, id_class[61], objectArray2));
        }
        ko_1.id_class(id_class[62], () -> this.Bh().toString());
        ko_1.id_class(id_class[63], () -> this.ra().toString());
    }

    public rsE_2 id_class(rdn_3 rdn_32, float f) {
        if (rdn_32.id_class()) {
            return null;
        }
        if (((rYB)this.id_throws[an_3.id_break[365]]).id_continue) {
            return null;
        }
        rsE_2 rsE_22 = new rsE_2((rYB)this.id_throws[id_break[366]], this.rx(), this.re() + (double)f, this.BO(), rdn_32);
        rsE_22.id_private();
        ((rYB)this.id_throws[id_break[367]]).a_(rsE_22);
        return rsE_22;
    }

    public float id_class(eX_2 eX_22) {
        return this.id_break(eX_22.id_class(), eX_22.id_break(), eX_22.id_byte());
    }

    public rjU_2 id_class(float f) {
        return this.id_finally(f).id_break(id_finally[205], (double)((Float)this.id_throws[id_break[564]]).floatValue() * id_finally[206], id_finally[207]);
    }

    public double id_class(double d, double d2, double d3) {
        double d4 = this.rx() - d;
        double d5 = this.re() - d2;
        double d6 = this.BO() - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public rcy_3 id_class(double ... dArray) {
        rcy_3 rcy_32 = new rcy_3();
        double[] dArray2 = dArray;
        int n = dArray2.length;
        for (int i = id_implements[135]; i < n; ++i) {
            double d = dArray2[i];
            rcy_32.add(rcz_3.id_class(d));
        }
        return rcy_32;
    }

    public void id_class(xc_3 xc_32) {
    }

    public static rjU_2 id_class(an_3 an_32, rjU_2 rjU_22, rfl_3 rfl_32, rYB rYB2, rjm_3 rjm_32, rqJ_2<rjC_2> rqJ_22, boolean bl, boolean bl2) {
        boolean bl3;
        boolean bl4 = rjU_22.id_break == id_finally[50] ? id_implements[49] : id_implements[50];
        boolean bl5 = rjU_22.id_byte == id_finally[51] ? id_implements[51] : id_implements[52];
        boolean bl6 = bl3 = rjU_22.id_protected == id_finally[52] ? id_implements[53] : id_implements[54];
        if (!(bl4 && bl5 || bl4 && bl3 || bl5 && bl3)) {
            rqJ_2<rjC_2> rqJ_23 = new rqJ_2<rjC_2>(Stream.concat(rqJ_22.id_class(), rYB2.id_byte(an_32, rfl_32.id_break(rjU_22))));
            return an_3.id_class(rjU_22, rfl_32, rqJ_23, bl, bl2);
        }
        return an_3.id_class(rjU_22, rfl_32, rYB2, rjm_32, rqJ_22, bl, bl2);
    }

    public void id_class(rhN_2 rhN_22) {
    }

    public rjU_2 id_class(float f, float f2, float f3) {
        return this.id_byte(this.id_private(f2, f3), this.id_throws(f, f3));
    }

    public boolean id_class(rRW rRW2, rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, float f) {
        return id_implements[217];
    }

    public void id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
    }

    public void id_class(xc_3 xc_32, rjU_2 rjU_22) {
        rjU_2 rjU_23 = rjU_22;
        this.id_throws[an_3.id_break[447]] = rjU_23;
    }

    public void id_class(iM_2 iM_22) {
        ((rmE_2)this.id_throws[id_break[63]]).id_break((rut_3)id_case[id_break[64]], iM_22);
    }

    public static rjU_2 id_class(double d, double d2, float f) {
        double d3 = (d + d2 + id_finally[186]) / id_finally[187];
        float f2 = -rfU_2.id_class(f * id_protected[74]);
        float f3 = rfU_2.id_break(f * id_protected[75]);
        float f4 = Math.max(Math.abs(f2), Math.abs(f3));
        return new rjU_2((double)f2 * d3 / (double)f4, id_finally[188], (double)f3 * d3 / (double)f4);
    }

    public void id_class(rXQ rXQ2, rdn_3 rdn_32) {
    }

    public boolean id_class(rye_3 rye_32) {
        return (Boolean)this.id_throws[id_break[452]] != false && rye_32 != rye_3.id_volatile && !rye_32.id_synchronized() ? id_implements[207] : id_implements[208];
    }

    public rsE_2 id_class(rpL_2 rpL_22, int n) {
        return this.id_class(new rdn_3(rpL_22), (float)n);
    }

    public void id_class(double d, double d2, double d3, float f, float f2, boolean bl) {
        this.id_package(d, d2, d3);
        Float f3 = Float.valueOf(f);
        this.id_throws[an_3.id_break[271]] = f3;
        if (bl) {
            an_3 an_32 = this;
            Float f4 = Float.valueOf(((Float)an_32.id_throws[id_break[272]]).floatValue() % id_protected[41]);
            an_32.id_throws[an_3.id_break[273]] = f4;
        }
        Float f5 = Float.valueOf(rfU_2.id_class(f2, id_protected[42], id_protected[43]));
        this.id_throws[an_3.id_break[274]] = f5;
        if (bl) {
            an_3 an_33 = this;
            Float f6 = Float.valueOf(((Float)an_33.id_throws[id_break[275]]).floatValue() % id_protected[44]);
            an_33.id_throws[an_3.id_break[276]] = f6;
        }
        Float f7 = Float.valueOf(((Float)this.id_throws[id_break[277]]).floatValue());
        this.id_throws[an_3.id_break[278]] = f7;
        Float f8 = Float.valueOf(((Float)this.id_throws[id_break[279]]).floatValue());
        this.id_throws[an_3.id_break[280]] = f8;
    }

    public rjU_2 id_class(rjU_2 rjU_22, float f) {
        if (f == id_protected[58]) {
            return new rjU_2(rjU_22.id_break, rjU_22.id_byte + (double)((Float)this.id_throws[id_break[315]]).floatValue(), rjU_22.id_byte);
        }
        double d = rfU_2.id_protected((double)f, (Double)this.id_throws[id_break[316]], this.rx());
        double d2 = rfU_2.id_protected((double)f, (Double)this.id_throws[id_break[317]], this.re()) + (double)this.Bx();
        double d3 = rfU_2.id_protected((double)f, (Double)this.id_throws[id_break[318]], this.BO());
        return new rjU_2(d, d2, d3);
    }

    public boolean id_class(rnM_2 rnM_22) {
        return this.BG() != null && this.BG().id_class(rnM_22) ? id_implements[188] : id_implements[189];
    }

    public rjG_2 id_class(rjU_2 rjU_22, double d, float f, boolean bl, Predicate<xc_3> predicate) {
        rjU_2 rjU_23 = this.id_new(f);
        rjU_2 rjU_24 = rjU_23.id_break(rjU_22.id_break * d, rjU_22.id_byte * d, rjU_22.id_protected * d);
        rjB_2 rjB_22 = new rjB_2(rjU_23, rjU_24, rjS_2.OUTLINE, bl ? rjs_3.ANY : rjs_3.NONE, this);
        rjB_22.id_class(predicate);
        return ((rYB)this.id_throws[id_break[322]]).id_break(rjB_22);
    }

    public void id_class(rut_3<?> rut_32) {
        if (((rut_3)id_case[id_break[496]]).equals(rut_32)) {
            this.q_();
        }
    }

    public void id_class(rfl_3 rfl_32) {
        rfl_3 rfl_33 = rfl_32;
        this.id_throws[an_3.id_break[504]] = rfl_33;
    }

    public void id_class(Rm_1 rm_1, rjU_2 rjU_22) {
        rjU_2 rjU_23 = rm_1.id_class(this);
        double d = rjU_22.id_break - rjU_23.id_break;
        double d2 = rjU_22.id_byte - rjU_23.id_byte;
        double d3 = rjU_22.id_protected - rjU_23.id_protected;
        double d4 = rfU_2.id_class(d * d + d3 * d3);
        Float f = Float.valueOf(rfU_2.id_catch((float)(-(rfU_2.id_protected(d2, d4) * 57.2957763671875))));
        this.id_throws[16] = f;
        Float f2 = Float.valueOf(rfU_2.id_catch((float)(rfU_2.id_protected(d3, d) * 57.2957763671875) - 90.0f));
        this.id_throws[15] = f2;
        this.id_implements(((Float)this.id_throws[15]).floatValue());
        Float f3 = Float.valueOf(((Float)this.id_throws[16]).floatValue());
        this.id_throws[18] = f3;
        Float f4 = Float.valueOf(((Float)this.id_throws[15]).floatValue());
        this.id_throws[17] = f4;
    }

    public boolean id_class(Class<? extends an_3> clazz) {
        for (an_3 an_32 : this.Bh()) {
            if (!clazz.isAssignableFrom(an_32.getClass())) continue;
            return id_implements[235];
        }
        return id_implements[236];
    }

    public static rjU_2 id_class(rjU_2 rjU_22, rfl_3 rfl_32, rqJ_2<rjC_2> rqJ_22, boolean bl, boolean bl2) {
        boolean bl3;
        double d = rjU_22.id_break;
        double d2 = rjU_22.id_byte;
        double d3 = rjU_22.id_protected;
        if (d2 != id_finally[53]) {
            if (!bl) {
                d2 = rjw_3.id_class(rpB_2.Y, rfl_32, rqJ_22.id_class(), d2);
            }
            if (d2 != id_finally[54]) {
                rfl_32 = rfl_32.id_protected(id_finally[55], d2, id_finally[56]);
            }
        }
        boolean bl4 = bl3 = Math.abs(d) < Math.abs(d3) ? id_implements[55] : id_implements[56];
        if (bl3 && d3 != id_finally[57]) {
            if (!bl2) {
                d3 = rjw_3.id_class(rpB_2.Z, rfl_32, rqJ_22.id_class(), d3);
            }
            if (d3 != id_finally[58]) {
                rfl_32 = rfl_32.id_protected(id_finally[59], id_finally[60], d3);
            }
        }
        if (d != id_finally[61]) {
            if (!bl2) {
                d = rjw_3.id_class(rpB_2.X, rfl_32, rqJ_22.id_class(), d);
            }
            if (!bl3 && d != id_finally[62]) {
                rfl_32 = rfl_32.id_protected(d, id_finally[63], id_finally[64]);
            }
        }
        if (!bl3 && d3 != id_finally[65] && !bl2) {
            d3 = rjw_3.id_class(rpB_2.Z, rfl_32, rqJ_22.id_class(), d3);
        }
        return new rjU_2(d, d2, d3);
    }

    public rjU_2 id_class(rjU_2 rjU_22, iG_2 iG_22) {
        return rjU_22;
    }

    public boolean id_class(double d) {
        double d2 = this.rN().id_class();
        if (Double.isNaN(d2)) {
            d2 = id_finally[148];
        }
        return d < (d2 = d2 * id_finally[149] * (Double)id_case[id_break[325]]) * d2 ? id_implements[113] : id_implements[114];
    }

    private static rjU_2 id_class(rjU_2 rjU_22, float f, float f2) {
        double d = rjU_22.id_catch();
        if (d < id_finally[121]) {
            return rjU_2.id_class;
        }
        rjU_2 rjU_23 = (d > id_finally[122] ? rjU_22.id_protected() : rjU_22).id_class((double)f);
        float f3 = rfU_2.id_class(f2 * id_protected[38]);
        float f4 = rfU_2.id_break(f2 * id_protected[39]);
        return new rjU_2(rjU_23.id_break * (double)f4 - rjU_23.id_protected * (double)f3, rjU_23.id_byte, rjU_23.id_protected * (double)f4 + rjU_23.id_break * (double)f3);
    }

    public float id_class(rqd_3 rqd_32) {
        float f = rfU_2.id_catch(((Float)this.id_throws[id_break[508]]).floatValue());
        switch (((int[])aC_2.id_class[id_break[509]])[rqd_32.ordinal()]) {
            case 1: {
                return f + id_protected[70];
            }
            case 2: {
                return f + id_protected[71];
            }
            case 3: {
                return f + id_protected[72];
            }
        }
        return f;
    }

    public void id_class(double d, double d2, double d3, float f, float f2) {
        this.id_native(d, d2, d3);
        Float f3 = Float.valueOf(f);
        this.id_throws[an_3.id_break[286]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_throws[an_3.id_break[287]] = f4;
        this.PX();
    }

    public void id_class(iB_2 iB_22, an_3 an_32) {
        if (an_32 instanceof iB_2) {
            eA_2.id_class((iB_2)an_32, (an_3)iB_22);
        }
        eA_2.id_break(iB_22, an_32);
    }

    private rjU_2 id_class(rjU_2 rjU_22, boolean bl, boolean bl2) {
        boolean bl3;
        Object object;
        rfl_3 rfl_32 = this.rN();
        rjm_3 rjm_32 = rjm_3.id_class(this);
        boolean bl4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[181]]).id_private().y().id_new();
        Stream<Object> stream = ((rYB)this.id_throws[id_break[182]]).id_class(this, rfl_32.id_break(rjU_22), (an_3 an_32) -> true);
        if (!bl4 && !rjw_3.id_byte((rjC_2)(object = ((rYB)this.id_throws[id_break[183]]).id_instanceof().id_byte()), rjw_3.id_class(rfl_32.id_break(id_finally[66])), rjN_2.id_implements)) {
            stream = Stream.concat(stream, Stream.of(object));
        }
        object = new rqJ_2<rjC_2>(stream);
        rjU_2 rjU_23 = rjU_22.id_catch() == id_finally[67] ? rjU_22 : an_3.id_class(this, rjU_22, rfl_32, (rYB)this.id_throws[id_break[184]], rjm_32, (rqJ_2<rjC_2>)object, bl, bl2);
        boolean bl5 = rjU_22.id_break != rjU_23.id_break ? id_implements[57] : id_implements[58];
        boolean bl6 = rjU_22.id_byte != rjU_23.id_byte ? id_implements[59] : id_implements[60];
        boolean bl7 = rjU_22.id_protected != rjU_23.id_protected ? id_implements[61] : id_implements[62];
        boolean bl8 = bl3 = (Boolean)this.id_throws[id_break[185]] != false || bl6 && rjU_22.id_byte < id_finally[68] ? id_implements[63] : id_implements[64];
        if (((Float)this.id_throws[id_break[186]]).floatValue() > id_protected[16] && bl3 && (bl5 || bl7)) {
            rjU_2 rjU_24;
            rjU_2 rjU_25 = new rjU_2(rjU_22.id_break, ((Float)this.id_throws[id_break[187]]).floatValue(), rjU_22.id_protected);
            rjU_2 rjU_26 = an_3.id_class(this, rjU_25, rfl_32, (rYB)this.id_throws[id_break[188]], rjm_32, (rqJ_2<rjC_2>)object, bl, bl2);
            rjU_2 rjU_27 = new rjU_2(id_finally[69], ((Float)this.id_throws[id_break[189]]).floatValue(), id_finally[70]);
            rjU_2 rjU_28 = an_3.id_class(this, rjU_27, rfl_32.id_break(rjU_22.id_break, id_finally[71], rjU_22.id_protected), (rYB)this.id_throws[id_break[190]], rjm_32, (rqJ_2<rjC_2>)object, bl, bl2);
            if (rjU_28.id_byte < (double)((Float)this.id_throws[id_break[191]]).floatValue() && an_3.id_case(rjU_24 = an_3.id_class(this, new rjU_2(rjU_22.id_break, id_finally[72], rjU_22.id_protected), rfl_32.id_protected(rjU_28), (rYB)this.id_throws[id_break[192]], rjm_32, (rqJ_2<rjC_2>)object, bl, bl2).id_throws(rjU_28)) > an_3.id_case(rjU_26)) {
                rjU_26 = rjU_24;
            }
            if (an_3.id_case(rjU_26) > an_3.id_case(rjU_23)) {
                rjU_24 = new rjU_2(id_finally[73], -rjU_26.id_byte + rjU_22.id_byte, id_finally[74]);
                return rjU_26.id_throws(an_3.id_class(this, rjU_24, rfl_32.id_protected(rjU_26), (rYB)this.id_throws[id_break[193]], rjm_32, (rqJ_2<rjC_2>)object, bl, bl2));
            }
        }
        return rjU_23;
    }

    private static rgP_2 id_class(rgP_2 rgP_22) {
        rVi_1 rVi_12 = rgP_22.id_throws().id_class(rgP_22.id_class().id_class((rgl_3)null));
        for (rgP_2 rgP_23 : rgP_22.id_protected()) {
            rVi_12.id_class(an_3.id_class(rgP_23));
        }
        return rVi_12;
    }

    public float id_class(iM_2 iM_22, ap_3 ap_32) {
        return ap_32.id_break * id_protected[68];
    }

    public void id_class(iG_2 iG_22, rjU_2 rjU_22) {
        rfl_3 rfl_32 = this.rN();
        double d = this.rx();
        double d2 = this.BO();
        if (((Boolean)this.id_throws[id_break[114]]).booleanValue()) {
            this.id_class(this.rN().id_protected(rjU_22));
            this.PC();
        } else {
            boolean bl;
            Object object;
            QY qY = QY.id_instanceof();
            if (iG_22 == iG_2.PISTON && (rjU_22 = this.id_protected(rjU_22)).equals(rjU_2.id_class)) {
                return;
            }
            Boolean bl2 = id_implements[29];
            this.id_throws[an_3.id_break[115]] = bl2;
            Object var33_8 = null;
            this.id_throws[an_3.id_break[116]] = var33_8;
            Boolean bl3 = id_implements[30];
            this.id_throws[an_3.id_break[117]] = bl3;
            if (((rjU_2)this.id_throws[id_break[118]]).id_catch() > id_finally[10]) {
                rjU_22 = rjU_22.id_finally((rjU_2)this.id_throws[id_break[119]]);
                rjU_2 rjU_23 = rjU_2.id_class;
                this.id_throws[an_3.id_break[120]] = rjU_23;
                this.id_byte(rjU_2.id_class);
            }
            rjU_22 = this.id_class(rjU_22, iG_22);
            boolean bl4 = id_implements[31];
            boolean bl5 = id_implements[32];
            if (this == (cb_3)qY.id_class[id_break[121]]) {
                object = rrLz_1.id_class(rjU_22, this.Ps(), rfl_32, bl4, bl5, this.id_break(rjU_22, bl4, bl5));
                bl4 = ((rrLz_1)object).id_class();
                bl5 = ((rrLz_1)object).id_class();
                rjU_22 = ((rrLz_1)object).id_catch();
            }
            if (((rjU_2)(object = this.id_class(rjU_22, bl4, bl5))).id_catch() > id_finally[11]) {
                this.id_class(this.rN().id_protected((rjU_2)object));
                this.PC();
            }
            boolean bl6 = !rfU_2.id_break(rjU_22.id_break, ((rjU_2)object).id_break) || !rfU_2.id_break(rjU_22.id_protected, ((rjU_2)object).id_protected) ? id_implements[33] : id_implements[34];
            boolean bl7 = bl = rjU_22.id_byte != ((rjU_2)object).id_byte ? id_implements[35] : id_implements[36];
            if (this == (cb_3)qY.id_class[id_break[122]] && (bl6 != (Boolean)this.id_throws[id_break[123]] || bl != (Boolean)this.id_throws[id_break[124]])) {
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[125]]).id_finally().id_class(rrLj_1.id_class(bl6, bl));
            }
            Boolean bl8 = bl6;
            this.id_throws[an_3.id_break[126]] = bl8;
            Boolean bl9 = bl;
            this.id_throws[an_3.id_break[127]] = bl9;
            Boolean bl10 = (Boolean)this.id_throws[id_break[128]] != false && rjU_22.id_byte < id_finally[12] ? id_implements[37] : id_implements[38];
            this.id_throws[an_3.id_break[129]] = bl10;
            Boolean bl11 = bl6;
            this.id_throws[an_3.id_break[130]] = bl11;
            Boolean bl12 = bl;
            this.id_throws[an_3.id_break[131]] = bl12;
            if (this == (cb_3)qY.id_class[id_break[132]]) {
                double d3 = this.rx() - d;
                double d4 = this.BO() - d2;
                ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[133]]).id_finally().id_class(rrLW.id_class(rfU_2.id_class(d3 * d3 + d4 * d4)));
            }
            rfH_2 rfH_22 = this.BS();
            xc_3 xc_33 = ((rYB)this.id_throws[id_break[134]]).id_byte(rfH_22);
            this.id_class(((rjU_2)object).id_byte, (Boolean)this.id_throws[id_break[135]], xc_33, rfH_22);
            rjU_2 rjU_24 = this.rv();
            if (rjU_22.id_break != ((rjU_2)object).id_break) {
                this.id_catch(id_finally[13], rjU_24.id_byte, rjU_24.id_protected);
            }
            if (rjU_22.id_protected != ((rjU_2)object).id_protected) {
                this.id_catch(rjU_24.id_break, rjU_24.id_byte, id_finally[14]);
            }
            xd_3 xd_32 = xc_33.id_break();
            if (rjU_22.id_byte != ((rjU_2)object).id_byte) {
                xd_32.id_class((rYB)this.id_throws[id_break[136]], this);
            }
            if (((Boolean)this.id_throws[id_break[137]]).booleanValue() && !this.Pc()) {
                xd_32.id_class((rYB)this.id_throws[id_break[138]], rfH_22, this);
            }
            if (this.PK() && !this.Pm()) {
                double d5 = ((rjU_2)object).id_break;
                double d6 = ((rjU_2)object).id_byte;
                double d7 = ((rjU_2)object).id_protected;
                if (!xd_32.id_class(rls_3.F)) {
                    d6 = id_finally[15];
                }
                Float f = Float.valueOf((float)((double)((Float)this.id_throws[id_break[139]]).floatValue() + (double)rfU_2.id_class(an_3.id_case((rjU_2)object)) * id_finally[16]));
                this.id_throws[an_3.id_break[140]] = f;
                Float f2 = Float.valueOf((float)((double)((Float)this.id_throws[id_break[141]]).floatValue() + (double)rfU_2.id_class(d5 * d5 + d6 * d6 + d7 * d7) * id_finally[17]));
                this.id_throws[an_3.id_break[142]] = f2;
                if (((Float)this.id_throws[id_break[143]]).floatValue() > ((Float)this.id_throws[id_break[144]]).floatValue() && !xc_33.id_catch()) {
                    Float f3 = Float.valueOf(this.rQ());
                    this.id_throws[an_3.id_break[145]] = f3;
                    if (this.rT()) {
                        an_3 an_32 = this.BP() && this.rU() != null ? this.rU() : this;
                        float f4 = an_32 == this ? id_protected[8] : id_protected[9];
                        rjU_2 rjU_25 = an_32.rv();
                        float f5 = rfU_2.id_class(rjU_25.id_break * rjU_25.id_break * id_finally[18] + rjU_25.id_byte * rjU_25.id_byte + rjU_25.id_protected * rjU_25.id_protected * id_finally[19]) * f4;
                        if (f5 > id_protected[10]) {
                            f5 = id_protected[11];
                        }
                        this.id_private(f5);
                    } else {
                        this.id_break(rfH_22, xc_33);
                    }
                } else if (((Float)this.id_throws[id_break[146]]).floatValue() > ((Float)this.id_throws[id_break[147]]).floatValue() && this.PJ() && xc_33.id_catch()) {
                    Float f6 = Float.valueOf(this.id_final(((Float)this.id_throws[id_break[148]]).floatValue()));
                    this.id_throws[an_3.id_break[149]] = f6;
                }
            }
            try {
                this.Px();
            }
            catch (Throwable throwable) {
                KY kY = KY.id_class(throwable, id_class[0]);
                Ko_1 ko_1 = kY.id_class(id_class[1]);
                this.id_class(ko_1);
                throw new KU(kY);
            }
            float f = this.rq();
            this.id_byte(this.rv().id_throws(f, id_finally[20], f));
            if (((rYB)this.id_throws[id_break[150]]).id_byte(this.rN().id_break(id_finally[21])).noneMatch(xc_32 -> xc_32.id_class(rls_3.N) || xc_32.id_class(xu_3.id_instanceof)) && (Integer)this.id_throws[id_break[151]] <= 0) {
                this.id_protected(-this.rV());
            }
            if (this.Pk() && this.Pz()) {
                this.id_class(rqn_3.SY, id_protected[12], id_protected[13] + (((Random)this.id_throws[id_break[152]]).nextFloat() - ((Random)this.id_throws[id_break[153]]).nextFloat()) * id_protected[14]);
                this.id_protected(-this.rV());
            }
        }
    }

    @Override
    public void id_class(rgP_2 rgP_22, UUID uUID) {
    }

    public float id_class(rpa_3 rpa_32) {
        float f = rfU_2.id_catch(((Float)this.id_throws[id_break[510]]).floatValue());
        switch (((int[])aC_2.id_class[id_break[511]])[rpa_32.ordinal()]) {
            case 1: {
                return -f;
            }
            case 2: {
                return id_protected[73] - f;
            }
        }
        return f;
    }

    public void id_class(rfH_2 rfH_22, float f, float f2) {
        this.id_class((double)rfH_22.b_() + id_finally[128], (double)rfH_22.c_(), (double)rfH_22.d_() + id_finally[129], f, f2);
    }

    public void id_class(double d, boolean bl, xc_3 xc_32, rfH_2 rfH_22) {
        if (bl) {
            if (((Float)this.id_throws[id_break[210]]).floatValue() > id_protected[21]) {
                xc_32.id_break().id_class((rYB)this.id_throws[id_break[211]], rfH_22, this, ((Float)this.id_throws[id_break[212]]).floatValue());
            }
            Float f = Float.valueOf(id_protected[22]);
            this.id_throws[an_3.id_break[213]] = f;
        } else if (d < id_finally[96]) {
            Float f = Float.valueOf((float)((double)((Float)this.id_throws[id_break[214]]).floatValue() - d));
            this.id_throws[an_3.id_break[215]] = f;
        }
    }

    public Optional<rqT_2> id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, boolean bl) {
        return rrEm_12.M().id_class(rfH_22, bl);
    }

    protected rjU_2 id_class(rpB_2 rpB_22, rqT_2 rqT_22) {
        return WB.id_class(rqT_22, rpB_22, this.Ps(), this.a_(this.Pb()));
    }

    public rjG_2 id_class(rjU_2 rjU_22, rjU_2 rjU_23, double d, boolean bl) {
        rjU_2 rjU_24 = rjU_22.id_break(rjU_23.id_break * d, rjU_23.id_byte * d, rjU_23.id_protected * d);
        return ((rYB)this.id_throws[id_break[323]]).id_break(new rjB_2(rjU_22, rjU_24, rjS_2.OUTLINE, bl ? rjs_3.ANY : rjs_3.NONE, this));
    }

    public void rd() {
        if (this.ra() instanceof rSK) {
            Boolean bl = id_implements[89];
            this.id_throws[an_3.id_break[223]] = bl;
        } else if (this.id_class(rlG_2.id_break, id_finally[99])) {
            if (!((Boolean)this.id_throws[id_break[224]]).booleanValue() && !((Boolean)this.id_throws[id_break[225]]).booleanValue()) {
                this.U();
            }
            Float f = Float.valueOf(id_protected[23]);
            this.id_throws[an_3.id_break[226]] = f;
            Boolean bl = id_implements[90];
            this.id_throws[an_3.id_break[227]] = bl;
            this.rE();
        } else {
            Boolean bl = id_implements[91];
            this.id_throws[an_3.id_break[228]] = bl;
        }
    }

    public rjU_2 m() {
        return this.id_byte(((Float)this.id_throws[id_break[394]]).floatValue(), ((Float)this.id_throws[id_break[395]]).floatValue());
    }

    public boolean o() {
        return id_implements[230];
    }

    public void p() {
        if (this.Py()) {
            this.id_native(this.PF() && this.rT() && !this.Pm() ? id_implements[83] : id_implements[84]);
        } else {
            this.id_native(this.PF() && this.W() && !this.Pm() ? id_implements[85] : id_implements[86]);
        }
    }

    public void rb() {
        if (!this.q()) {
            this.id_case(id_private[6]);
            this.id_break(rye_3.id_protected, id_protected[7]);
        }
    }

    public float t() {
        return id_protected[66];
    }

    @Override
    public rgP_2 g() {
        rgP_2 rgP_22 = this.rD();
        return rgP_22 != null ? an_3.id_class(rgP_22) : this.PT();
    }

    public void j() {
        this.PD();
    }

    public boolean q() {
        return this.BC().id_byte();
    }

    public void U() {
        double d;
        double d2;
        an_3 an_32 = this.BP() && this.rU() != null ? this.rU() : this;
        float f = an_32 == this ? id_protected[24] : id_protected[25];
        rjU_2 rjU_22 = an_32.rv();
        float f2 = rfU_2.id_class(rjU_22.id_break * rjU_22.id_break * id_finally[101] + rjU_22.id_byte * rjU_22.id_byte + rjU_22.id_protected * rjU_22.id_protected * id_finally[102]) * f;
        if (f2 > id_protected[26]) {
            f2 = id_protected[27];
        }
        if ((double)f2 < id_finally[103]) {
            this.id_class(this.BJ(), f2, id_protected[28] + (((Random)this.id_throws[id_break[235]]).nextFloat() - ((Random)this.id_throws[id_break[236]]).nextFloat()) * id_protected[29]);
        } else {
            this.id_class(this.Bv(), f2, id_protected[30] + (((Random)this.id_throws[id_break[237]]).nextFloat() - ((Random)this.id_throws[id_break[238]]).nextFloat()) * id_protected[31]);
        }
        float f3 = rfU_2.id_byte(this.re());
        int n = id_implements[95];
        while ((float)n < id_protected[32] + ((ap_3)this.id_throws[an_3.id_break[239]]).id_class * id_protected[33]) {
            d2 = (((Random)this.id_throws[id_break[240]]).nextDouble() * id_finally[104] - id_finally[105]) * (double)((ap_3)this.id_throws[an_3.id_break[241]]).id_class;
            d = (((Random)this.id_throws[id_break[242]]).nextDouble() * id_finally[106] - id_finally[107]) * (double)((ap_3)this.id_throws[an_3.id_break[243]]).id_class;
            ((rYB)this.id_throws[id_break[244]]).id_class(rLQ.id_throws, this.rx() + d2, (double)(f3 + id_protected[34]), this.BO() + d, rjU_22.id_break, rjU_22.id_byte - ((Random)this.id_throws[id_break[245]]).nextDouble() * id_finally[108], rjU_22.id_protected);
            ++n;
        }
        n = id_implements[96];
        while ((float)n < id_protected[35] + ((ap_3)this.id_throws[an_3.id_break[246]]).id_class * id_protected[36]) {
            d2 = (((Random)this.id_throws[id_break[247]]).nextDouble() * id_finally[109] - id_finally[110]) * (double)((ap_3)this.id_throws[an_3.id_break[248]]).id_class;
            d = (((Random)this.id_throws[id_break[249]]).nextDouble() * id_finally[111] - id_finally[112]) * (double)((ap_3)this.id_throws[an_3.id_break[250]]).id_class;
            ((rYB)this.id_throws[id_break[251]]).id_class(rLQ.E, this.rx() + d2, (double)(f3 + id_protected[37]), this.BO() + d, rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
            ++n;
        }
    }

    public void rf() {
        Boolean bl = id_implements[108];
        this.id_throws[an_3.id_break[303]] = bl;
    }

    public boolean w() {
        return id_implements[184];
    }

    public rjU_2 rv() {
        return (rjU_2)this.id_throws[id_break[540]];
    }

    public boolean u() {
        return id_implements[225];
    }

    public boolean rn() {
        boolean bl = (Boolean)this.id_throws[id_break[512]];
        Boolean bl2 = id_implements[231];
        this.id_throws[an_3.id_break[513]] = bl2;
        return bl;
    }

    public Set<String> y() {
        return (Set)this.id_throws[id_break[50]];
    }

    public rjU_2 rh() {
        return rjU_2.id_class(this.id_import());
    }

    public double id_break(rjU_2 rjU_22) {
        double d = this.rx() - rjU_22.id_break;
        double d2 = this.re() - rjU_22.id_byte;
        double d3 = this.BO() - rjU_22.id_protected;
        return d * d + d2 * d2 + d3 * d3;
    }

    public WP id_break(rrEm_1 rrEm_12) {
        boolean bl;
        boolean bl2 = ((rYB)this.id_throws[id_break[466]]).E() == rYB.id_throws && rrEm_12.E() == rYB.id_byte ? id_implements[210] : id_implements[211];
        boolean bl3 = bl = rrEm_12.E() == rYB.id_throws ? id_implements[212] : id_implements[213];
        if (!bl2 && !bl) {
            boolean bl4;
            boolean bl5 = bl4 = rrEm_12.E() == rYB.id_protected ? id_implements[214] : id_implements[215];
            if (((rYB)this.id_throws[id_break[467]]).E() != rYB.id_protected && !bl4) {
                return null;
            }
            roE_2 roE_22 = rrEm_12.id_instanceof();
            double d = Math.max(id_finally[173], roE_22.id_throws() + id_finally[174]);
            double d2 = Math.max(id_finally[175], roE_22.id_case() + id_finally[176]);
            double d3 = Math.min(id_finally[177], roE_22.id_catch() - id_finally[178]);
            double d4 = Math.min(id_finally[179], roE_22.id_private() - id_finally[180]);
            double d5 = rRJ.id_class(((rYB)this.id_throws[id_break[468]]).id_default(), rrEm_12.id_default());
            rfH_2 rfH_22 = new rfH_2(rfU_2.id_class(this.rx() * d5, d, d3), this.re(), rfU_2.id_class(this.BO() * d5, d2, d4));
            return this.id_class(rrEm_12, rfH_22, bl4).map(rqT_22 -> {
                rjU_2 rjU_22;
                rpB_2 rpB_22;
                xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte((rfH_2)this.id_throws[61]);
                if (xc_32.id_break(rCT.id_char)) {
                    rpB_22 = xc_32.id_byte(rCT.id_char);
                    rqT_2 rqT_23 = rqp_3.id_class((rfH_2)this.id_throws[61], rpB_22, 21, rpB_2.Y, 21, rfH_22 -> ((rYB)this.id_throws[7]).id_byte((rfH_2)rfH_22) == xc_32);
                    rjU_22 = this.id_class(rpB_22, rqT_23);
                } else {
                    rpB_22 = rpB_2.X;
                    rjU_22 = new rjU_2(0.5, 0.0, 0.0);
                }
                return WB.id_class(rrEm_12, rqT_22, rpB_22, rjU_22, this.a_(this.Pb()), this.rv(), ((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
            }).orElse(null);
        }
        rfH_2 rfH_23 = bl ? rrEm_1.id_this : rrEm_12.id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rrEm_12.X());
        return new WP(new rjU_2((double)rfH_23.b_() + id_finally[181], rfH_23.c_(), (double)rfH_23.d_() + id_finally[182]), this.rv(), ((Float)this.id_throws[id_break[469]]).floatValue(), ((Float)this.id_throws[id_break[470]]).floatValue());
    }

    public rjG_2 id_break(double d, float f, boolean bl) {
        return this.id_class(this.id_break(f), d, f, bl, (xc_3 xc_32) -> {
            Popka popka = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().q();
            return popka == null || !popka.aJ_();
        });
    }

    public void id_break(rhN_2 rhN_22) {
    }

    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return id_implements[109];
        }
        this.rf();
        return id_implements[110];
    }

    public float id_break(double d, double d2, double d3) {
        float f = (float)(this.rx() - d);
        float f2 = (float)(this.re() - d2);
        float f3 = (float)(this.BO() - d3);
        return rfU_2.id_byte(f * f + f2 * f2 + f3 * f3);
    }

    public void id_break(rgP_2 rgP_22) {
        ((rmE_2)this.id_throws[id_break[480]]).id_break((rut_3)id_case[id_break[481]], Optional.ofNullable(rgP_22));
    }

    public double id_break(rlb_3<rXs_1> rlb_32) {
        return ((Object2DoubleMap)this.id_throws[id_break[530]]).getDouble(rlb_32);
    }

    private boolean id_break(rfl_3 rfl_32) {
        return ((rYB)this.id_throws[id_break[110]]).a_(this, rfl_32) && !((rYB)this.id_throws[id_break[111]]).id_protected(rfl_32) ? id_implements[27] : id_implements[28];
    }

    public void id_break(rfH_2 rfH_22, xc_3 xc_32) {
        if (!xc_32.id_byte().id_class()) {
            xc_3 xc_33 = ((rYB)this.id_throws[id_break[198]]).id_byte(rfH_22.id_final());
            zr_3 zr_32 = xc_33.id_class(xu_3.Pq) ? xc_33.id_package() : xc_32.id_package();
            this.id_class(zr_32.id_protected(), zr_32.id_class() * id_protected[17], zr_32.id_break());
        }
    }

    public void id_break(double d, double d2, double d3, float f, float f2) {
        this.id_class(d, d2, d3, f, f2, id_implements[105]);
    }

    private boolean id_break(rjU_2 rjU_22, boolean bl, boolean bl2) {
        boolean bl3;
        rfl_3 rfl_32 = this.rN();
        rjm_3 rjm_32 = rjm_3.id_class(this);
        rjC_2 rjC_22 = ((rYB)this.id_throws[id_break[154]]).id_instanceof().id_byte();
        Stream<Object> stream = rjw_3.id_byte(rjC_22, rjw_3.id_class(rfl_32.id_break(id_finally[22])), rjN_2.id_implements) ? Stream.empty() : Stream.of(rjC_22);
        Stream<rjC_2> stream2 = ((rYB)this.id_throws[id_break[155]]).id_class(this, rfl_32.id_break(rjU_22), (an_3 an_32) -> true);
        rqJ_2<rjC_2> rqJ_22 = new rqJ_2<rjC_2>(Stream.concat(stream2, stream));
        rjU_2 rjU_23 = rjU_22.id_catch() == id_finally[23] ? rjU_22 : an_3.id_class(this, rjU_22, rfl_32, (rYB)this.id_throws[id_break[156]], rjm_32, rqJ_22, bl, bl2);
        boolean bl4 = rjU_22.id_break != rjU_23.id_break ? id_implements[39] : id_implements[40];
        boolean bl5 = rjU_22.id_byte != rjU_23.id_byte ? id_implements[41] : id_implements[42];
        boolean bl6 = rjU_22.id_protected != rjU_23.id_protected ? id_implements[43] : id_implements[44];
        boolean bl7 = bl3 = (Boolean)this.id_throws[id_break[157]] != false || bl5 && rjU_22.id_byte < id_finally[24] ? id_implements[45] : id_implements[46];
        if (((Float)this.id_throws[id_break[158]]).floatValue() > id_protected[15] && bl3 && (bl4 || bl6)) {
            rjU_2 rjU_24;
            rjU_2 rjU_25 = an_3.id_class(this, new rjU_2(rjU_22.id_break, ((Float)this.id_throws[id_break[159]]).floatValue(), rjU_22.id_protected), rfl_32, (rYB)this.id_throws[id_break[160]], rjm_32, rqJ_22, bl, bl2);
            rjU_2 rjU_26 = an_3.id_class(this, new rjU_2(id_finally[25], ((Float)this.id_throws[id_break[161]]).floatValue(), id_finally[26]), rfl_32.id_break(rjU_22.id_break, id_finally[27], rjU_22.id_protected), (rYB)this.id_throws[id_break[162]], rjm_32, rqJ_22, bl, bl2);
            if (rjU_26.id_byte < (double)((Float)this.id_throws[id_break[163]]).floatValue() && an_3.id_case(rjU_24 = an_3.id_class(this, new rjU_2(rjU_22.id_break, id_finally[28], rjU_22.id_protected), rfl_32.id_protected(rjU_26), (rYB)this.id_throws[id_break[164]], rjm_32, rqJ_22, bl, bl2).id_throws(rjU_26)) > an_3.id_case(rjU_25)) {
                rjU_25 = rjU_24;
            }
            if (an_3.id_case(rjU_25) > an_3.id_case(rjU_23)) {
                rjU_25.id_throws(an_3.id_class(this, new rjU_2(id_finally[29], -rjU_25.id_byte + rjU_22.id_byte, id_finally[30]), rfl_32.id_protected(rjU_25), (rYB)this.id_throws[id_break[165]], rjm_32, rqJ_22, bl, bl2));
            }
        }
        return rjU_22.id_byte != rjU_23.id_byte && rjU_22.id_byte < id_finally[31] ? id_implements[47] : id_implements[48];
    }

    public rjU_2 id_break(float f) {
        return this.id_byte(this.id_case(f), this.id_throws(f));
    }

    public void id_break(int n, boolean bl) {
        byte by = (Byte)((rmE_2)this.id_throws[id_break[429]]).id_class((rut_3)id_case[id_break[430]]);
        if (bl) {
            ((rmE_2)this.id_throws[id_break[431]]).id_break((rut_3)id_case[id_break[432]], (byte)(by | id_implements[195] << n));
        } else {
            ((rmE_2)this.id_throws[id_break[433]]).id_break((rut_3)id_case[id_break[434]], (byte)(by & (id_implements[196] << n ^ id_private[33])));
        }
    }

    public double id_break(rfH_2 rfH_22) {
        double d = (double)rfH_22.b_() + id_finally[131];
        double d2 = (double)rfH_22.c_() + id_finally[132];
        double d3 = (double)rfH_22.d_() + id_finally[133];
        double d4 = rfU_2.id_class(this.re() + (double)this.id_byte(this.Pb()) - d2, id_finally[134], id_finally[135]);
        double d5 = rfU_2.id_class(this.rx() - d, id_finally[136], id_finally[137]);
        double d6 = rfU_2.id_class(this.BO() - d3, id_finally[138], id_finally[139]);
        return this.id_new(id_protected[47]).id_byte(d + d5, d2 + d4, d3 + d6);
    }

    public double id_break(double d) {
        return this.id_catch((id_finally[201] * ((Random)this.id_throws[id_break[546]]).nextDouble() - id_finally[202]) * d);
    }

    public abstract void id_break(rcd_3 var1);

    public void id_throws(double d, double d2, double d3) {
        if ((rYB)this.id_throws[id_break[490]] instanceof rrEm_1) {
            rfj_3 rfj_32 = new rfj_3(new rfH_2(d, d2, d3));
            ((rrEm_1)((rYB)this.id_throws[id_break[491]])).id_else().id_class(rrEl_1.id_catch, rfj_32, id_implements[226], this.V());
            ((rYB)this.id_throws[id_break[492]]).id_throws(rfj_32.id_break, rfj_32.id_byte);
            this.id_case(d, d2, d3);
        }
    }

    public float id_throws(float f, float f2) {
        return f2 == id_protected[51] ? f : rfU_2.id_catch(f2, ((Float)this.id_throws[id_break[307]]).floatValue(), f);
    }

    public float id_throws(float f) {
        return f == id_protected[53] ? ((Float)this.id_throws[id_break[309]]).floatValue() : rfU_2.id_catch(f, ((Float)this.id_throws[id_break[310]]).floatValue(), ((Float)this.id_throws[id_break[311]]).floatValue());
    }

    public void id_throws(an_3 an_32) {
        rcd_3 rcd_32 = an_32.id_case(new rcd_3());
        rcd_32.id_continue(id_class[53]);
        this.id_throws(rcd_32);
        Integer n = (int)((Integer)an_32.id_throws[id_break[457]]);
        this.id_throws[an_3.id_break[458]] = n;
        rfH_2 rfH_22 = (rfH_2)an_32.id_throws[id_break[459]];
        this.id_throws[an_3.id_break[460]] = rfH_22;
    }

    public void id_throws(rcd_3 rcd_32) {
        block11: {
            try {
                rcy_3 rcy_32 = rcd_32.id_protected(id_class[25], id_private[15]);
                rcy_3 rcy_33 = rcd_32.id_protected(id_class[26], id_private[16]);
                rcy_3 rcy_34 = rcd_32.id_protected(id_class[27], id_private[17]);
                double d = rcy_33.id_catch(id_implements[127]);
                double d2 = rcy_33.id_catch(id_implements[128]);
                double d3 = rcy_33.id_catch(id_private[18]);
                this.id_catch(Math.abs(d) > id_finally[150] ? id_finally[151] : d, Math.abs(d2) > id_finally[152] ? id_finally[153] : d2, Math.abs(d3) > id_finally[154] ? id_finally[155] : d3);
                this.id_native(rcy_32.id_catch(id_implements[129]), rcy_32.id_catch(id_implements[130]), rcy_32.id_catch(id_private[19]));
                Float f = Float.valueOf(rcy_34.id_private(id_implements[131]));
                this.id_throws[an_3.id_break[341]] = f;
                Float f2 = Float.valueOf(rcy_34.id_private(id_implements[132]));
                this.id_throws[an_3.id_break[342]] = f2;
                Float f3 = Float.valueOf(((Float)this.id_throws[id_break[343]]).floatValue());
                this.id_throws[an_3.id_break[344]] = f3;
                Float f4 = Float.valueOf(((Float)this.id_throws[id_break[345]]).floatValue());
                this.id_throws[an_3.id_break[346]] = f4;
                this.id_implements(((Float)this.id_throws[id_break[347]]).floatValue());
                this.id_native(((Float)this.id_throws[id_break[348]]).floatValue());
                Float f5 = Float.valueOf(rcd_32.id_finally(id_class[28]));
                this.id_throws[an_3.id_break[349]] = f5;
                Integer n = rcd_32.id_catch(id_class[29]);
                this.id_throws[an_3.id_break[350]] = n;
                this.id_throws(rcd_32.id_catch(id_class[30]));
                Boolean bl = rcd_32.id_new(id_class[31]);
                this.id_throws[an_3.id_break[351]] = bl;
                Boolean bl2 = rcd_32.id_new(id_class[32]);
                this.id_throws[an_3.id_break[352]] = bl2;
                Integer n2 = rcd_32.id_private(id_class[33]);
                this.id_throws[an_3.id_break[353]] = n2;
                if (rcd_32.id_break(id_class[34])) {
                    UUID uUID = rcd_32.id_class(id_class[35]);
                    this.id_throws[an_3.id_break[354]] = uUID;
                    String string = ((UUID)this.id_throws[id_break[355]]).toString();
                    this.id_throws[an_3.id_break[356]] = string;
                }
                if (Double.isFinite(this.rx()) && Double.isFinite(this.re()) && Double.isFinite(this.BO())) {
                    if (Double.isFinite(((Float)this.id_throws[id_break[357]]).floatValue()) && Double.isFinite(((Float)this.id_throws[id_break[358]]).floatValue())) {
                        Object object;
                        this.PX();
                        this.id_case(((Float)this.id_throws[id_break[359]]).floatValue(), ((Float)this.id_throws[id_break[360]]).floatValue());
                        if (rcd_32.id_byte(id_class[36], id_private[20])) {
                            object = rcd_32.id_native(id_class[37]);
                            try {
                                this.id_break(rgB_2.id_class((String)object));
                            }
                            catch (Exception exception) {
                                ((Logger)id_case[id_break[361]]).warn(id_class[38], object, (Object)exception);
                            }
                        }
                        this.id_final(rcd_32.id_new(id_class[39]));
                        this.id_extends(rcd_32.id_new(id_class[40]));
                        this.id_finally(rcd_32.id_new(id_class[41]));
                        this.id_implements(rcd_32.id_new(id_class[42]));
                        if (rcd_32.id_byte(id_class[43], id_private[21])) {
                            ((Set)this.id_throws[id_break[362]]).clear();
                            object = rcd_32.id_protected(id_class[44], id_private[22]);
                            int n3 = Math.min(((rcy_3)object).size(), id_break[363]);
                            for (int i = id_implements[133]; i < n3; ++i) {
                                ((Set)this.id_throws[id_break[364]]).add(((rcy_3)object).id_implements(i));
                            }
                        }
                        this.id_break(rcd_32);
                        if (this.BZ()) {
                            this.PX();
                        }
                        break block11;
                    }
                    throw new IllegalStateException(id_class[45]);
                }
                throw new IllegalStateException(id_class[46]);
            }
            catch (Throwable throwable) {
                KY kY = KY.id_class(throwable, id_class[47]);
                Ko_1 ko_1 = kY.id_class(id_class[48]);
                this.id_class(ko_1);
                throw new KU(kY);
            }
        }
    }

    public void id_throws(rjU_2 rjU_22) {
        rjU_2 rjU_23 = rjU_22;
        this.id_throws[an_3.id_break[542]] = rjU_23;
    }

    public double id_throws(double d) {
        return ((rjU_2)this.id_throws[an_3.id_break[553]]).id_protected + (double)this.PN() * d;
    }

    public void id_throws(int n) {
        ((rmE_2)this.id_throws[id_break[438]]).id_break((rut_3)id_case[id_break[439]], n);
    }

    public boolean id_throws(iM_2 iM_22) {
        return !((rYB)this.id_throws[id_break[383]]).a_(this, this.id_case(iM_22).id_break(id_finally[161])) ? id_implements[155] : id_implements[156];
    }

    private static /* synthetic */ void ntfClinit() {
        an_3.id_implements();
        an_3.id_throw();
        an_3.id_continue();
        an_3.id_long();
        an_3.id_while();
        an_3.id_final();
        an_3.id_instanceof();
        an_3.id_package();
        an_3.id_goto();
    }

    public boolean rt() {
        return id_implements[203];
    }

    public xd_3 Pd() {
        return (xd_3)this.id_throws[id_break[575]];
    }

    public rjU_2 Ps() {
        return (rjU_2)this.id_throws[id_break[535]];
    }

    public boolean Pe() {
        return (Boolean)this.id_throws[id_break[566]];
    }

    public boolean Pc() {
        return this.h();
    }

    public boolean Po() {
        an_3 an_32 = this.rU();
        if (an_32 instanceof rhd_3) {
            return ((rhd_3)an_32).id_char();
        }
        return !((rYB)this.id_throws[an_3.id_break[519]]).id_continue ? id_implements[247] : id_implements[248];
    }

    public void Pi() {
        Boolean bl = id_implements[209];
        this.id_throws[an_3.id_break[465]] = bl;
    }

    public boolean Pf() {
        return this.rT() || this.id_int() ? id_implements[75] : id_implements[76];
    }

    public boolean W() {
        return (Boolean)this.id_throws[id_break[220]] != false && this.rT() ? id_implements[81] : id_implements[82];
    }

    @Override
    public boolean H() {
        return id_implements[254];
    }

    public boolean R() {
        return this instanceof iB_2;
    }

    public void PD() {
        Boolean bl = id_implements[13];
        this.id_throws[an_3.id_break[62]] = bl;
    }

    public boolean BE() {
        boolean bl = (Boolean)this.id_throws[id_break[514]];
        Boolean bl2 = id_implements[232];
        this.id_throws[an_3.id_break[515]] = bl2;
        return bl;
    }

    public void id_finally(boolean bl) {
        ((rmE_2)this.id_throws[id_break[208]]).id_break((rut_3)id_case[id_break[209]], bl);
    }

    public boolean id_finally(int n) {
        return ((Byte)((rmE_2)this.id_throws[id_break[427]]).id_class((rut_3)id_case[id_break[428]]) & id_implements[192] << n) != 0 ? id_implements[193] : id_implements[194];
    }

    public boolean id_finally(double d, double d2, double d3) {
        return this.id_break(this.rN().id_protected(d, d2, d3));
    }

    public rjU_2 id_finally(float f) {
        double d = rfU_2.id_protected((double)f, (Double)this.id_throws[id_break[319]], this.rx());
        double d2 = rfU_2.id_protected((double)f, (Double)this.id_throws[id_break[320]], this.re());
        double d3 = rfU_2.id_protected((double)f, (Double)this.id_throws[id_break[321]], this.BO());
        return new rjU_2(d, d2, d3);
    }

    public boolean id_finally(an_3 an_32) {
        return id_implements[204];
    }

    public void id_catch(boolean bl) {
        Boolean bl2 = bl;
        this.id_throws[an_3.id_break[454]] = bl2;
    }

    public void id_catch(rjU_2 rjU_22) {
        rjU_2 rjU_23 = rjU_22;
        this.id_throws[an_3.id_break[45]] = rjU_23;
    }

    public boolean id_catch(int n) {
        return this.id_synchronized() >= n ? id_implements[251] : id_implements[252];
    }

    public static String id_catch(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{33, 101, -116, -110, -29, 108, 109, -67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_catch(double d, double d2, double d3) {
        this.id_byte(new rjU_2(d, d2, d3));
    }

    public double id_catch(double d) {
        return ((rjU_2)this.id_throws[an_3.id_break[545]]).id_break + (double)this.PN() * d;
    }

    public rjU_2 id_catch(float f, float f2) {
        return this.id_byte(f - id_protected[56], f2);
    }

    public void id_catch(an_3 an_32) {
        this.id_class(an_32, an_3::id_new);
    }

    public float id_extends(float f) {
        return id_protected[76];
    }

    public void id_extends(boolean bl) {
        ((rmE_2)this.id_throws[id_break[204]]).id_break((rut_3)id_case[id_break[205]], bl);
    }

    public void id_extends(double d, double d2, double d3) {
        this.id_catch(d, d2, d3);
    }

    public String id_extends() {
        return (String)this.id_throws[id_break[572]];
    }

    public void id_extends(an_3 an_32) {
        if (an_32.ra() != this) {
            throw new IllegalStateException(id_class[49]);
        }
        if (!((rYB)this.id_throws[an_3.id_break[389]]).id_continue && an_32 instanceof rhd_3 && !(this.rU() instanceof rhd_3)) {
            ((List)this.id_throws[id_break[390]]).add(id_implements[158], an_32);
        } else {
            ((List)this.id_throws[id_break[391]]).add(an_32);
        }
    }

    private static void id_goto() {
        Object[] objectArray = new Object[]{LogManager.getLogger(), new AtomicInteger(), Collections.emptyList(), new rfl_3(0.0, 0.0, 0.0, 0.0, 0.0, 0.0), 1.0, rmE_2.id_class(an_3.class, ruw_3.id_class), rmE_2.id_class(an_3.class, ruw_3.id_break), rmE_2.id_class(an_3.class, ruw_3.id_case), rmE_2.id_class(an_3.class, ruw_3.id_implements), rmE_2.id_class(an_3.class, ruw_3.id_implements), rmE_2.id_class(an_3.class, ruw_3.id_implements), rmE_2.id_class(an_3.class, ruw_3.id_super)};
        id_case = objectArray;
    }

    public void K() {
        if (this.BP()) {
            this.Bn();
        }
        if (this.Pm()) {
            this.BH();
        }
    }

    public void id_case(int n) {
        int n2 = n * id_private[7];
        if (this instanceof iB_2) {
            n2 = aM_2.id_class((iB_2)this, n2);
        }
        if ((Integer)this.id_throws[id_break[107]] < n2) {
            this.id_protected(n2);
        }
    }

    public void id_case(float f, float f2) {
        Float f3 = Float.valueOf(f % id_protected[3]);
        this.id_throws[an_3.id_break[73]] = f3;
        Float f4 = Float.valueOf(f2 % id_protected[4]);
        this.id_throws[an_3.id_break[74]] = f4;
    }

    public static void id_case(double d) {
        Double d2 = d;
        an_3.id_case[an_3.id_break[479]] = d2;
    }

    public rfl_3 id_case(iM_2 iM_22) {
        ap_3 ap_32 = this.a_(iM_22);
        float f = ap_32.id_class / id_protected[67];
        rjU_2 rjU_22 = new rjU_2(this.rx() - (double)f, this.re(), this.BO() - (double)f);
        rjU_2 rjU_23 = new rjU_2(this.rx() + (double)f, this.re() + (double)ap_32.id_break, this.BO() + (double)f);
        return new rfl_3(rjU_22, rjU_23);
    }

    public boolean id_case(an_3 an_32) {
        return this.Bh().size() < id_implements[159] ? id_implements[160] : id_implements[161];
    }

    public rcd_3 id_case(rcd_3 rcd_32) {
        try {
            rcy_3 rcy_32;
            if ((an_3)this.id_throws[id_break[327]] != null) {
                double[] dArray = new double[id_private[8]];
                dArray[an_3.id_implements[119]] = ((an_3)this.id_throws[id_break[328]]).rx();
                dArray[an_3.id_implements[120]] = this.re();
                dArray[an_3.id_private[9]] = ((an_3)this.id_throws[id_break[329]]).BO();
                rcd_32.id_class(id_class[5], this.id_class(dArray));
            } else {
                double[] dArray = new double[id_private[10]];
                dArray[an_3.id_implements[121]] = this.rx();
                dArray[an_3.id_implements[122]] = this.re();
                dArray[an_3.id_private[11]] = this.BO();
                rcd_32.id_class(id_class[6], this.id_class(dArray));
            }
            rjU_2 rjU_22 = this.rv();
            double[] dArray = new double[id_private[12]];
            dArray[an_3.id_implements[123]] = rjU_22.id_break;
            dArray[an_3.id_implements[124]] = rjU_22.id_byte;
            dArray[an_3.id_private[13]] = rjU_22.id_protected;
            rcd_32.id_class(id_class[7], this.id_class(dArray));
            float[] fArray = new float[id_private[14]];
            fArray[an_3.id_implements[125]] = ((Float)this.id_throws[id_break[330]]).floatValue();
            fArray[an_3.id_implements[126]] = ((Float)this.id_throws[id_break[331]]).floatValue();
            rcd_32.id_class(id_class[8], this.id_class(fArray));
            rcd_32.id_class(id_class[9], ((Float)this.id_throws[id_break[332]]).floatValue());
            rcd_32.id_class(id_class[10], (short)((Integer)this.id_throws[id_break[333]]).intValue());
            rcd_32.id_class(id_class[11], (short)this.PA());
            rcd_32.id_class(id_class[12], (Boolean)this.id_throws[id_break[334]]);
            rcd_32.id_class(id_class[13], (Boolean)this.id_throws[id_break[335]]);
            rcd_32.id_break(id_class[14], (Integer)this.id_throws[id_break[336]]);
            rcd_32.id_class(id_class[15], this.ro());
            rgP_2 rgP_22 = this.rD();
            if (rgP_22 != null) {
                rcd_32.id_class(id_class[16], rgB_2.id_class(rgP_22));
            }
            if (this.D()) {
                rcd_32.id_class(id_class[17], this.D());
            }
            if (this.BF()) {
                rcd_32.id_class(id_class[18], this.BF());
            }
            if (this.rw()) {
                rcd_32.id_class(id_class[19], this.rw());
            }
            if (((Boolean)this.id_throws[id_break[337]]).booleanValue()) {
                rcd_32.id_class(id_class[20], (Boolean)this.id_throws[id_break[338]]);
            }
            if (!((Set)this.id_throws[id_break[339]]).isEmpty()) {
                rcy_32 = new rcy_3();
                for (String object : (Set)this.id_throws[id_break[340]]) {
                    rcy_32.add(rca_3.id_class(object));
                }
                rcd_32.id_class(id_class[21], rcy_32);
            }
            this.id_class(rcd_32);
            if (this.BP()) {
                rcy_32 = new rcy_3();
                for (an_3 an_32 : this.Bh()) {
                    rcd_3 rcd_33;
                    if (!an_32.id_protected(rcd_33 = new rcd_3())) continue;
                    rcy_32.add(rcd_33);
                }
                if (!rcy_32.isEmpty()) {
                    rcd_32.id_class(id_class[22], rcy_32);
                }
            }
            return rcd_32;
        }
        catch (Throwable throwable) {
            KY kY = KY.id_class(throwable, id_class[23]);
            Ko_1 ko_1 = kY.id_class(id_class[24]);
            this.id_class(ko_1);
            throw new KU(kY);
        }
    }

    public void id_case(double d, double d2, double d3) {
        rYB rYB2 = (rYB)this.id_throws[id_break[493]];
        if (rYB2 instanceof rrEm_1) {
            rrEm_1 rrEm_12 = (rrEm_1)rYB2;
            this.id_class(d, d2, d3, ((Float)this.id_throws[id_break[494]]).floatValue(), ((Float)this.id_throws[id_break[495]]).floatValue());
            this.Bu().forEach(an_32 -> {
                rrEm_12.id_byte((an_3)an_32);
                Boolean bl = true;
                an_32.id_throws[67] = bl;
                for (an_3 an_33 : (List)an_32.id_throws[3]) {
                    an_32.id_class(an_33, an_3::id_private);
                }
            });
        }
    }

    public static double id_case(rjU_2 rjU_22) {
        return rjU_22.id_break * rjU_22.id_break + rjU_22.id_protected * rjU_22.id_protected;
    }

    public float id_case(float f) {
        return f == id_protected[50] ? ((Float)this.id_throws[id_break[304]]).floatValue() : rfU_2.id_catch(f, ((Float)this.id_throws[id_break[305]]).floatValue(), ((Float)this.id_throws[id_break[306]]).floatValue());
    }

    public void id_const() {
        if ((an_3)this.id_throws[id_break[386]] != null) {
            an_3 an_32 = (an_3)this.id_throws[id_break[387]];
            Object var6_2 = null;
            this.id_throws[an_3.id_break[388]] = var6_2;
            an_32.id_package(this);
        }
    }

    public rjU_2 id_continue(float f) {
        return this.id_catch(this.id_case(f), this.id_throws(f));
    }

    private static void id_continue() {
        id_extends = new long[1];
    }

    public boolean id_continue(an_3 an_32) {
        return this == an_32 ? id_implements[201] : id_implements[202];
    }

    public boolean id_else(an_3 an_32) {
        for (an_3 an_33 : this.Bh()) {
            if (an_33.equals(an_32)) {
                return id_implements[244];
            }
            if (!an_33.id_else(an_32)) continue;
            return id_implements[245];
        }
        return id_implements[246];
    }

    public void id_implements(double d, double d2, double d3) {
        this.id_byte(this.rv().id_break(d, d2, d3));
        Boolean bl = id_implements[107];
        this.id_throws[an_3.id_break[302]] = bl;
    }

    public void id_implements(int n) {
        Integer n2 = n;
        this.id_throws[an_3.id_break[49]] = n2;
    }

    public boolean id_implements(String string) {
        return ((Set)this.id_throws[id_break[51]]).size() < id_break[52] && ((Set)this.id_throws[id_break[53]]).add(string) ? id_implements[8] : id_implements[9];
    }

    public void id_implements(boolean bl) {
        Boolean bl2 = bl;
        this.id_throws[an_3.id_break[420]] = bl2;
        if (!((rYB)this.id_throws[an_3.id_break[421]]).id_continue) {
            this.id_break(id_private[30], (Boolean)this.id_throws[id_break[422]]);
        }
    }

    public float id_implements(an_3 an_32) {
        float f = (float)(this.rx() - an_32.rx());
        float f2 = (float)(this.re() - an_32.re());
        float f3 = (float)(this.BO() - an_32.BO());
        return rfU_2.id_byte(f * f + f2 * f2 + f3 * f3);
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[297];
        blArray[0] = true;
        blArray[2] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[19] = true;
        blArray[22] = true;
        blArray[24] = true;
        blArray[27] = true;
        blArray[33] = true;
        blArray[35] = true;
        blArray[37] = true;
        blArray[39] = true;
        blArray[41] = true;
        blArray[43] = true;
        blArray[45] = true;
        blArray[47] = true;
        blArray[49] = true;
        blArray[51] = true;
        blArray[53] = true;
        blArray[55] = true;
        blArray[57] = true;
        blArray[59] = true;
        blArray[61] = true;
        blArray[63] = true;
        blArray[65] = true;
        blArray[67] = true;
        blArray[69] = true;
        blArray[71] = true;
        blArray[73] = true;
        blArray[75] = true;
        blArray[77] = true;
        blArray[79] = true;
        blArray[81] = true;
        blArray[83] = true;
        blArray[85] = true;
        blArray[87] = true;
        blArray[90] = true;
        blArray[93] = true;
        blArray[97] = true;
        blArray[99] = true;
        blArray[101] = true;
        blArray[103] = true;
        blArray[105] = true;
        blArray[107] = true;
        blArray[108] = true;
        blArray[113] = true;
        blArray[115] = true;
        blArray[117] = true;
        blArray[120] = true;
        blArray[122] = true;
        blArray[124] = true;
        blArray[126] = true;
        blArray[128] = true;
        blArray[130] = true;
        blArray[132] = true;
        blArray[134] = true;
        blArray[138] = true;
        blArray[140] = true;
        blArray[144] = true;
        blArray[149] = true;
        blArray[151] = true;
        blArray[153] = true;
        blArray[155] = true;
        blArray[157] = true;
        blArray[159] = true;
        blArray[160] = true;
        blArray[162] = true;
        blArray[163] = true;
        blArray[166] = true;
        blArray[169] = true;
        blArray[171] = true;
        blArray[173] = true;
        blArray[175] = true;
        blArray[176] = true;
        blArray[177] = true;
        blArray[178] = true;
        blArray[180] = true;
        blArray[182] = true;
        blArray[186] = true;
        blArray[188] = true;
        blArray[190] = true;
        blArray[191] = true;
        blArray[192] = true;
        blArray[193] = true;
        blArray[195] = true;
        blArray[196] = true;
        blArray[197] = true;
        blArray[199] = true;
        blArray[201] = true;
        blArray[203] = true;
        blArray[206] = true;
        blArray[207] = true;
        blArray[209] = true;
        blArray[210] = true;
        blArray[212] = true;
        blArray[214] = true;
        blArray[216] = true;
        blArray[217] = true;
        blArray[220] = true;
        blArray[222] = true;
        blArray[223] = true;
        blArray[225] = true;
        blArray[227] = true;
        blArray[233] = true;
        blArray[235] = true;
        blArray[238] = true;
        blArray[239] = true;
        blArray[240] = true;
        blArray[242] = true;
        blArray[244] = true;
        blArray[245] = true;
        blArray[247] = true;
        blArray[249] = true;
        blArray[251] = true;
        blArray[253] = true;
        blArray[254] = true;
        blArray[258] = true;
        blArray[259] = true;
        blArray[261] = true;
        blArray[262] = true;
        id_implements = blArray;
    }

    public void id_implements(float f) {
    }

    public rjK_2 id_import() {
        return new rjK_2(((Float)this.id_throws[id_break[396]]).floatValue(), ((Float)this.id_throws[id_break[397]]).floatValue());
    }

    private static void id_instanceof() {
        id_private = new byte[]{2, 3, 2, 6, 4, 20, 15, 20, 3, 2, 3, 2, 3, 2, 2, 6, 6, 5, 2, 2, 8, 9, 8, 60, 4, 53, 3, 3, 4, 4, 6, 5, 5, -1, 8, 5, 2, 3, 4, 7, 2, 3, 4, 5, 6, 3, 3, 2, 3, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 78, 2, 4, 6, 8, 9, 10, 15, 16, 17, 18, 20, 21, 22, 23, 24, 25, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 41, 42, 43, 45, 47, 48, 50, 51, 52, 53, 54, 56, 57, 58, 59, 60, 62, 65, 67, 69, 71, 72, 73, 75, 76, 12, 4};
    }

    public void id_new(boolean bl) {
        rjU_2 rjU_22 = this.rv();
        double d = bl ? Math.max(id_finally[166], rjU_22.id_byte - id_finally[167]) : Math.min(id_finally[168], rjU_22.id_byte + id_finally[169]);
        this.id_catch(rjU_22.id_break, d, rjU_22.id_protected);
        Float f = Float.valueOf(id_protected[63]);
        this.id_throws[an_3.id_break[442]] = f;
    }

    public rjU_2 id_new(float f) {
        if (f == id_protected[57]) {
            return new rjU_2(this.rx(), this.rH(), this.BO());
        }
        double d = rfU_2.id_protected((double)f, (Double)this.id_throws[id_break[312]], this.rx());
        double d2 = rfU_2.id_protected((double)f, (Double)this.id_throws[id_break[313]], this.re()) + (double)this.Bx();
        double d3 = rfU_2.id_protected((double)f, (Double)this.id_throws[id_break[314]], this.BO());
        return new rjU_2(d, d2, d3);
    }

    public boolean id_new(an_3 an_32) {
        return !this.h() && (Integer)this.id_throws[id_break[380]] <= 0 ? id_implements[151] : id_implements[152];
    }

    private boolean id_new() {
        return ((rYB)this.id_throws[id_break[219]]).id_byte(this.Bs()).id_class(xu_3.hM);
    }

    public void id_new(double d, double d2, double d3) {
        this.id_volatile(d, d2, d3);
        this.id_class(((ap_3)this.id_throws[id_break[75]]).id_class(d, d2, d3));
    }

    public void id_package(double d, double d2, double d3) {
        double d4 = rfU_2.id_class(d, id_finally[124], id_finally[125]);
        double d5 = rfU_2.id_class(d3, id_finally[126], id_finally[127]);
        Double d6 = d4;
        this.id_throws[an_3.id_break[281]] = d6;
        Double d7 = d2;
        this.id_throws[an_3.id_break[282]] = d7;
        Double d8 = d5;
        this.id_throws[an_3.id_break[283]] = d8;
        this.id_new(d4, d2, d5);
    }

    private static void id_package() {
        id_catch = new int[]{0xFFFFFF};
    }

    public void id_package(boolean bl) {
        this.id_break(id_private[32], bl);
    }

    public void id_package(an_3 an_32) {
        if (an_32.ra() == this) {
            throw new IllegalStateException(id_class[50]);
        }
        ((List)this.id_throws[id_break[392]]).remove(an_32);
        Integer n = id_private[23];
        an_32.id_throws[an_3.id_break[393]] = n;
    }

    public float id_package(float f) {
        QY qY = QY.id_instanceof();
        if (this == (cb_3)qY.id_class[id_break[573]]) {
            return ((Hh_1)qY.id_class[id_break[574]]).id_finally().id_class(f);
        }
        return this.Bm();
    }

    public boolean id_return(an_3 an_32) {
        return this.PO() == an_32.PO() ? id_implements[242] : id_implements[243];
    }

    private void id_super() {
        rrTj_1 rrTj_12;
        Boolean bl = this.id_class(rlG_2.id_break);
        this.id_throws[an_3.id_break[229]] = bl;
        Object var15_2 = null;
        this.id_throws[an_3.id_break[230]] = var15_2;
        double d = this.rH() - id_finally[100];
        an_3 an_32 = this.ra();
        if (an_32 instanceof rSK && !((rSK)(rrTj_12 = (rSK)an_32)).W() && ((an_3)rrTj_12).rN().id_throws >= d && ((an_3)rrTj_12).rN().id_break <= d) {
            return;
        }
        rrTj_12 = new rfH_2(this.rx(), d, this.BO());
        rXE rXE2 = ((rYB)this.id_throws[id_break[231]]).id_break((rfH_2)rrTj_12);
        for (rlb_3 rlb_32 : rlG_2.id_class()) {
            if (!rXE2.id_class(rlb_32)) continue;
            double d2 = (float)((rja_3)((Object)rrTj_12)).c_() + rXE2.id_class((rRq_1)((rYB)this.id_throws[id_break[232]]), (rfH_2)rrTj_12);
            if (d2 > d) {
                rlb_3 rlb_33 = rlb_32;
                this.id_throws[an_3.id_break[233]] = rlb_33;
            }
            return;
        }
    }

    public boolean id_super(an_3 an_32) {
        return an_32.PU() && !this.id_return(an_32) ? id_implements[144] : id_implements[145];
    }

    private static void id_throw() {
        id_class = new String[]{new String("Checking entity block collision"), new String("Entity being checked for collision"), new String("Colliding entity with block"), new String("Block being collided with"), new String("id"), new String("Pos"), new String("Pos"), new String("Motion"), new String("Rotation"), new String("FallDistance"), new String("Fire"), new String("Air"), new String("OnGround"), new String("Invulnerable"), new String("PortalCooldown"), new String("UUID"), new String("CustomName"), new String("CustomNameVisible"), new String("Silent"), new String("NoGravity"), new String("Glowing"), new String("Tags"), new String("Passengers"), new String("Saving entity NBT"), new String("Entity being saved"), new String("Pos"), new String("Motion"), new String("Rotation"), new String("FallDistance"), new String("Fire"), new String("Air"), new String("OnGround"), new String("Invulnerable"), new String("PortalCooldown"), new String("UUID"), new String("UUID"), new String("CustomName"), new String("CustomName"), new String("Failed to parse entity custom name {}"), new String("CustomNameVisible"), new String("Silent"), new String("NoGravity"), new String("Glowing"), new String("Tags"), new String("Tags"), new String("Entity has invalid rotation"), new String("Entity has invalid position"), new String("Loading entity NBT"), new String("Entity being loaded"), new String("Use x.startRiding(y), not y.addPassenger(x)"), new String("Use x.stopRiding(y), not y.removePassenger(x)"), new String("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]"), new String("~NULL~"), new String("Dimension"), new String("Entity Type"), new String("Entity ID"), new String("Entity Name"), new String("Entity's Exact location"), new String("%.2f, %.2f, %.2f"), new String("Entity's Block location"), new String("Entity's Momentum"), new String("%.2f, %.2f, %.2f"), new String("Entity's Passengers"), new String("Entity's Vehicle")};
    }

    private static void id_while() {
        float[] fArray = new float[91];
        fArray[0] = 1.0f;
        fArray[1] = 1.0f;
        fArray[3] = 360.0f;
        fArray[4] = 360.0f;
        fArray[5] = 1.0f;
        fArray[6] = 0.5f;
        fArray[7] = 4.0f;
        fArray[8] = 0.35f;
        fArray[9] = 0.4f;
        fArray[10] = 1.0f;
        fArray[11] = 1.0f;
        fArray[12] = 0.7f;
        fArray[13] = 1.6f;
        fArray[14] = 0.4f;
        fArray[17] = 0.15f;
        fArray[18] = 1.0f;
        fArray[19] = 0.4f;
        fArray[24] = 0.2f;
        fArray[25] = 0.9f;
        fArray[26] = 1.0f;
        fArray[27] = 1.0f;
        fArray[28] = 1.0f;
        fArray[29] = 0.4f;
        fArray[30] = 1.0f;
        fArray[31] = 0.4f;
        fArray[32] = 1.0f;
        fArray[33] = 20.0f;
        fArray[34] = 1.0f;
        fArray[35] = 1.0f;
        fArray[36] = 20.0f;
        fArray[37] = 1.0f;
        fArray[38] = (float)Math.PI / 180;
        fArray[39] = (float)Math.PI / 180;
        fArray[41] = 360.0f;
        fArray[42] = -90.0f;
        fArray[43] = 90.0f;
        fArray[44] = 360.0f;
        fArray[45] = 2.0f;
        fArray[46] = 1.0f;
        fArray[47] = 1.0f;
        fArray[48] = 1.0f;
        fArray[49] = 1.0f;
        fArray[50] = 1.0f;
        fArray[51] = 1.0f;
        fArray[52] = 1.0f;
        fArray[53] = 1.0f;
        fArray[54] = (float)Math.PI / 180;
        fArray[55] = (float)Math.PI / 180;
        fArray[56] = 90.0f;
        fArray[57] = 1.0f;
        fArray[58] = 1.0f;
        fArray[60] = 0.8f;
        fArray[62] = 5.0f;
        fArray[64] = 0.2f;
        fArray[65] = 0.1f;
        fArray[67] = 2.0f;
        fArray[68] = 0.85f;
        fArray[69] = 0.4f;
        fArray[70] = 180.0f;
        fArray[71] = 270.0f;
        fArray[72] = 90.0f;
        fArray[73] = 180.0f;
        fArray[74] = (float)Math.PI / 180;
        fArray[75] = (float)Math.PI / 180;
        id_protected = fArray;
    }

    public Iterable<rdn_3> rs() {
        return (List)id_case[id_break[415]];
    }

    public rjU_2 id_protected(rjU_2 rjU_22) {
        if (rjU_22.id_catch() <= id_finally[36]) {
            return rjU_22;
        }
        long l = ((rYB)this.id_throws[id_break[177]]).r();
        if (l != (Long)this.id_throws[id_break[178]]) {
            Arrays.fill((double[])this.id_throws[id_break[179]], id_finally[37]);
            Long l2 = l;
            this.id_throws[an_3.id_break[180]] = l2;
        }
        if (rjU_22.id_break != id_finally[38]) {
            double d = this.id_class(rpB_2.X, rjU_22.id_break);
            return Math.abs(d) <= id_finally[39] ? rjU_2.id_class : new rjU_2(d, id_finally[40], id_finally[41]);
        }
        if (rjU_22.id_byte != id_finally[42]) {
            double d = this.id_class(rpB_2.Y, rjU_22.id_byte);
            return Math.abs(d) <= id_finally[43] ? rjU_2.id_class : new rjU_2(id_finally[44], d, id_finally[45]);
        }
        if (rjU_22.id_protected != id_finally[46]) {
            double d = this.id_class(rpB_2.Z, rjU_22.id_protected);
            return Math.abs(d) <= id_finally[47] ? rjU_2.id_class : new rjU_2(id_finally[48], id_finally[49], d);
        }
        return rjU_2.id_class;
    }

    public boolean id_protected(iM_2 iM_22) {
        return ((rYB)this.id_throws[id_break[381]]).a_(this, this.id_case(iM_22).id_break(id_finally[159]));
    }

    public double id_protected(an_3 an_32) {
        double d;
        double d2;
        double d3;
        if (an_32 instanceof cM_2) {
            cM_2 cM_22 = (cM_2)an_32;
            double d4 = an_32.rx();
            double d5 = an_32.re();
            double d6 = an_32.BO();
            double d7 = (Double)cM_22.id_break[id_break[294]];
            double d8 = (Double)cM_22.id_break[id_break[295]];
            double d9 = (Double)cM_22.id_break[id_break[296]];
            rjU_2 rjU_22 = this.Ps();
            double d10 = rjU_22.id_byte(d4, d5, d6);
            double d11 = rjU_22.id_byte(d7, d8, d9);
            if (d11 < d10) {
                d3 = d7;
                d2 = d8;
                d = d9;
            } else {
                d3 = d4;
                d2 = d5;
                d = d6;
            }
        } else {
            d3 = an_32.rx();
            d2 = an_32.re();
            d = an_32.BO();
        }
        double d12 = an_32.PN() / id_protected[45];
        double d13 = rfU_2.id_class(this.re() + (double)this.id_byte(this.Pb()) - d2, id_finally[130], (double)an_32.Bm());
        double d14 = rfU_2.id_class(this.rx() - d3, -d12, d12);
        double d15 = rfU_2.id_class(this.BO() - d, -d12, d12);
        return this.id_new(id_protected[46]).id_byte(d3 + d14, d2 + d13, d + d15);
    }

    public boolean id_protected(rcd_3 rcd_32) {
        String string = this.rW();
        if (!((Boolean)this.id_throws[id_break[326]]).booleanValue() && string != null) {
            rcd_32.id_class(id_class[4], string);
            this.id_case(rcd_32);
            return id_implements[115];
        }
        return id_implements[116];
    }

    public void id_protected(int n) {
        Integer n2 = n;
        this.id_throws[an_3.id_break[108]] = n2;
    }

    public void id_protected(rfH_2 rfH_22) {
        if (this.rZ()) {
            this.rc();
        } else {
            if (!((rYB)this.id_throws[an_3.id_break[398]]).id_continue && !rfH_22.equals((rfH_2)this.id_throws[id_break[399]])) {
                rfH_2 rfH_23 = rfH_22.id_int();
                this.id_throws[an_3.id_break[400]] = rfH_23;
            }
            Boolean bl = id_implements[162];
            this.id_throws[an_3.id_break[401]] = bl;
        }
    }

    public rjU_2 id_protected(float f, float f2) {
        return this.id_catch(f2, f);
    }

    public void id_protected(double d, double d2, double d3) {
        if (((rYB)this.id_throws[an_3.id_break[443]]).id_continue) {
            return;
        }
        rfH_2 rfH_22 = new rfH_2(d, d2, d3);
        rjU_2 rjU_22 = new rjU_2(d - (double)rfH_22.b_(), d2 - (double)rfH_22.c_(), d3 - (double)rfH_22.d_());
        rfw_3 rfw_32 = new rfw_3();
        rpr_3 rpr_32 = rpr_3.UP;
        double d4 = id_finally[170];
        rpr_3[] rpr_3Array = new rpr_3[id_private[35]];
        rpr_3Array[an_3.id_implements[198]] = rpr_3.NORTH;
        rpr_3Array[an_3.id_implements[199]] = rpr_3.SOUTH;
        rpr_3Array[an_3.id_private[36]] = rpr_3.WEST;
        rpr_3Array[an_3.id_private[37]] = rpr_3.EAST;
        rpr_3Array[an_3.id_private[38]] = rpr_3.UP;
        rpr_3[] rpr_3Array2 = rpr_3Array;
        int n = rpr_3Array2.length;
        for (int i = id_implements[200]; i < n; ++i) {
            double d5;
            rpr_3 rpr_33 = rpr_3Array2[i];
            rfw_32.id_class((rja_3)rfH_22, rpr_33);
            if (((rYB)this.id_throws[id_break[444]]).id_byte(rfw_32).id_new((rYB)this.id_throws[id_break[445]], rfw_32)) continue;
            double d6 = rjU_22.id_class(rpr_33.id_final());
            double d7 = d5 = rpr_33.id_throws() == rpG_2.POSITIVE ? id_finally[171] - d6 : d6;
            if (!(d5 < d4)) continue;
            d4 = d5;
            rpr_32 = rpr_33;
        }
        float f = ((Random)this.id_throws[id_break[446]]).nextFloat() * id_protected[64] + id_protected[65];
        float f2 = rpr_32.id_throws().id_class();
        rjU_2 rjU_23 = this.rv().id_class(id_finally[172]);
        if (rpr_32.id_final() == rpB_2.X) {
            this.id_catch(f2 * f, rjU_23.id_byte, rjU_23.id_protected);
        } else if (rpr_32.id_final() == rpB_2.Y) {
            this.id_catch(rjU_23.id_break, f2 * f, rjU_23.id_protected);
        } else if (rpr_32.id_final() == rpB_2.Z) {
            this.id_catch(rjU_23.id_break, rjU_23.id_byte, f2 * f);
        }
    }

    public double id_protected(double d) {
        return this.id_throws((id_finally[203] * ((Random)this.id_throws[id_break[554]]).nextDouble() - id_finally[204]) * d);
    }

    public void id_private(boolean bl) {
        rjU_2 rjU_22 = this.rv();
        double d = bl ? Math.max(id_finally[162], rjU_22.id_byte - id_finally[163]) : Math.min(id_finally[164], rjU_22.id_byte + id_finally[165]);
        this.id_catch(rjU_22.id_break, d, rjU_22.id_protected);
    }

    public float id_private(float f, float f2) {
        return f2 == id_protected[52] ? f : rfU_2.id_catch(f2, ((Float)this.id_throws[id_break[308]]).floatValue(), f);
    }

    public boolean id_private(String string) {
        return ((Set)this.id_throws[id_break[54]]).remove(string);
    }

    public void id_private(float f) {
        this.id_class(this.BB(), f, id_protected[18] + (((Random)this.id_throws[id_break[199]]).nextFloat() - ((Random)this.id_throws[id_break[200]]).nextFloat()) * id_protected[19]);
    }

    public void id_private(int n) {
        Integer n2 = n;
        this.id_throws[an_3.id_break[571]] = n2;
    }

    public void id_private(double d, double d2, double d3) {
        this.id_class(d, d2, d3, ((Float)this.id_throws[id_break[284]]).floatValue(), ((Float)this.id_throws[id_break[285]]).floatValue());
    }

    public float id_private(an_3 an_32) {
        float f = (float)(this.rx() - an_32.rx());
        float f2 = (float)(this.BO() - an_32.BO());
        return rfU_2.id_byte(f * f + f2 * f2);
    }

    private void id_abstract() {
        if (this.id_throws == null) {
            Object[] objectArray = this.id_throws = new Object[id_private[60]];
            objectArray[an_3.id_implements[262]] = id_implements[263];
            objectArray[an_3.id_private[61]] = id_implements[264];
            objectArray[an_3.id_private[62]] = id_implements[265];
            objectArray[an_3.id_private[63]] = id_implements[266];
            objectArray[an_3.id_private[64]] = id_finally[215];
            objectArray[an_3.id_private[65]] = id_finally[216];
            objectArray[an_3.id_private[66]] = id_finally[217];
            objectArray[an_3.id_private[67]] = Float.valueOf(id_protected[77]);
            objectArray[an_3.id_private[68]] = Float.valueOf(id_protected[78]);
            objectArray[an_3.id_private[69]] = Float.valueOf(id_protected[79]);
            objectArray[an_3.id_private[70]] = Float.valueOf(id_protected[80]);
            objectArray[an_3.id_private[71]] = id_implements[267];
            objectArray[an_3.id_private[72]] = id_implements[268];
            objectArray[an_3.id_private[73]] = id_implements[269];
            objectArray[an_3.id_private[74]] = id_implements[270];
            objectArray[an_3.id_private[75]] = id_implements[271];
            objectArray[an_3.id_private[76]] = id_implements[272];
            objectArray[an_3.id_private[77]] = id_implements[273];
            objectArray[an_3.id_private[78]] = Float.valueOf(id_protected[81]);
            objectArray[an_3.id_private[79]] = Float.valueOf(id_protected[82]);
            objectArray[an_3.id_private[80]] = Float.valueOf(id_protected[83]);
            objectArray[an_3.id_private[81]] = Float.valueOf(id_protected[84]);
            objectArray[an_3.id_private[82]] = Float.valueOf(id_protected[85]);
            objectArray[an_3.id_private[83]] = Float.valueOf(id_protected[86]);
            objectArray[an_3.id_private[84]] = id_finally[218];
            objectArray[an_3.id_private[85]] = id_finally[219];
            objectArray[an_3.id_private[86]] = id_finally[220];
            objectArray[an_3.id_private[87]] = Float.valueOf(id_protected[87]);
            objectArray[an_3.id_private[88]] = id_implements[274];
            objectArray[an_3.id_private[89]] = Float.valueOf(id_protected[88]);
            objectArray[an_3.id_private[90]] = id_implements[275];
            objectArray[an_3.id_private[91]] = id_implements[276];
            objectArray[an_3.id_private[92]] = id_implements[277];
            objectArray[an_3.id_private[93]] = id_implements[278];
            objectArray[an_3.id_private[94]] = id_implements[279];
            objectArray[an_3.id_private[95]] = id_implements[280];
            objectArray[an_3.id_private[96]] = id_implements[281];
            objectArray[an_3.id_private[97]] = id_implements[282];
            objectArray[an_3.id_private[98]] = id_implements[283];
            objectArray[an_3.id_private[99]] = id_implements[284];
            objectArray[an_3.id_private[100]] = id_implements[285];
            objectArray[an_3.id_private[101]] = id_implements[286];
            objectArray[an_3.id_private[102]] = id_implements[287];
            objectArray[an_3.id_private[103]] = id_implements[288];
            objectArray[an_3.id_private[104]] = id_implements[289];
            objectArray[an_3.id_private[105]] = id_implements[290];
            objectArray[an_3.id_private[106]] = id_implements[291];
            objectArray[an_3.id_private[107]] = id_implements[292];
            objectArray[an_3.id_private[108]] = id_implements[293];
            objectArray[an_3.id_private[109]] = id_extends[0];
            objectArray[an_3.id_private[110]] = Float.valueOf(id_protected[89]);
            objectArray[an_3.id_private[111]] = Float.valueOf(id_protected[90]);
            objectArray[an_3.id_private[112]] = id_implements[294];
            objectArray[an_3.id_private[113]] = id_implements[295];
            objectArray[an_3.id_private[114]] = id_implements[296];
        }
    }

    private static void id_final() {
        double[] dArray = new double[222];
        dArray[7] = 256.0;
        dArray[8] = 1.0;
        dArray[9] = -64.0;
        dArray[10] = 1.0E-7;
        dArray[11] = 1.0E-7;
        dArray[16] = 0.6;
        dArray[17] = 0.6;
        dArray[18] = 0.2f;
        dArray[19] = 0.2f;
        dArray[20] = 1.0;
        dArray[21] = 0.001;
        dArray[22] = 1.0E-7;
        dArray[32] = 0.2f;
        dArray[33] = 1.0;
        dArray[34] = 1.0;
        dArray[35] = 0.5000001;
        dArray[36] = 1.0E-7;
        dArray[39] = 1.0E-5f;
        dArray[43] = 1.0E-5f;
        dArray[47] = 1.0E-5f;
        dArray[66] = 1.0E-7;
        dArray[88] = 2.0;
        dArray[89] = 2.0;
        dArray[90] = 0.001;
        dArray[91] = 0.001;
        dArray[92] = 0.001;
        dArray[93] = 0.001;
        dArray[94] = 0.001;
        dArray[95] = 0.001;
        dArray[97] = 0.007;
        dArray[98] = 0.0023333333333333335;
        dArray[99] = 0.014;
        dArray[100] = 0.1111111119389534;
        dArray[101] = 0.2f;
        dArray[102] = 0.2f;
        dArray[103] = 0.25;
        dArray[104] = 2.0;
        dArray[105] = 1.0;
        dArray[106] = 2.0;
        dArray[107] = 1.0;
        dArray[108] = 0.2f;
        dArray[109] = 2.0;
        dArray[110] = 1.0;
        dArray[111] = 2.0;
        dArray[112] = 1.0;
        dArray[113] = 0.2f;
        dArray[114] = 0.5;
        dArray[115] = 0.1;
        dArray[116] = 0.5;
        dArray[117] = -4.0;
        dArray[118] = 1.5;
        dArray[119] = -4.0;
        dArray[121] = 1.0E-7;
        dArray[122] = 1.0;
        dArray[124] = -3.0E7;
        dArray[125] = 3.0E7;
        dArray[126] = -3.0E7;
        dArray[127] = 3.0E7;
        dArray[128] = 0.5;
        dArray[129] = 0.5;
        dArray[131] = 0.5;
        dArray[132] = 0.5;
        dArray[133] = 0.5;
        dArray[135] = 1.0;
        dArray[136] = -0.5;
        dArray[137] = 0.5;
        dArray[138] = -0.5;
        dArray[139] = 0.5;
        dArray[140] = 0.01f;
        dArray[141] = 1.0;
        dArray[142] = 1.0;
        dArray[143] = 1.0;
        dArray[144] = 0.05f;
        dArray[145] = 0.05f;
        dArray[148] = 1.0;
        dArray[149] = 64.0;
        dArray[150] = 10.0;
        dArray[152] = 10.0;
        dArray[154] = 10.0;
        dArray[156] = 0.1f;
        dArray[158] = 0.75;
        dArray[159] = 1.0E-7;
        dArray[160] = 1.0E-7;
        dArray[161] = 1.0E-7;
        dArray[162] = -0.9;
        dArray[163] = 0.03;
        dArray[164] = 1.8;
        dArray[165] = 0.1;
        dArray[166] = -0.3;
        dArray[167] = 0.03;
        dArray[168] = 0.7;
        dArray[169] = 0.06;
        dArray[170] = Double.MAX_VALUE;
        dArray[171] = 1.0;
        dArray[172] = 0.75;
        dArray[173] = -2.9999872E7;
        dArray[174] = 16.0;
        dArray[175] = -2.9999872E7;
        dArray[176] = 16.0;
        dArray[177] = 2.9999872E7;
        dArray[178] = 16.0;
        dArray[179] = 2.9999872E7;
        dArray[180] = 16.0;
        dArray[181] = 0.5;
        dArray[182] = 0.5;
        dArray[183] = 2.0;
        dArray[186] = 1.0E-5f;
        dArray[187] = 2.0;
        dArray[189] = 0.001;
        dArray[191] = 0.4;
        dArray[193] = 1.0;
        dArray[194] = 0.003;
        dArray[195] = 0.003;
        dArray[196] = 0.0045000000000000005;
        dArray[197] = 0.0045000000000000005;
        dArray[198] = 0.4;
        dArray[200] = 0.4;
        dArray[201] = 2.0;
        dArray[202] = 1.0;
        dArray[203] = 2.0;
        dArray[204] = 1.0;
        dArray[206] = 0.7;
        dArray[214] = 1.0;
        id_finally = dArray;
    }

    public boolean id_final(double d, double d2, double d3) {
        double d4 = this.rx() - d;
        double d5 = this.re() - d2;
        double d6 = this.BO() - d3;
        double d7 = d4 * d4 + d5 * d5 + d6 * d6;
        return this.id_class(d7);
    }

    public void id_final(boolean bl) {
        ((rmE_2)this.id_throws[id_break[486]]).id_break((rut_3)id_case[id_break[487]], bl);
    }

    public float id_final(float f) {
        return id_protected[20];
    }

    public boolean id_final(an_3 an_32) {
        return this.id_class(an_32.BG());
    }

    public void id_volatile(boolean bl) {
        this.id_break(id_implements[176], bl);
    }

    public void id_volatile(an_3 an_32) {
    }

    public rjU_2 id_volatile(float f) {
        return this.id_new(f);
    }

    public void id_volatile(double d, double d2, double d3) {
        if (((rjU_2)this.id_throws[an_3.id_break[555]]).id_break != d || ((rjU_2)this.id_throws[an_3.id_break[556]]).id_byte != d2 || ((rjU_2)this.id_throws[an_3.id_break[557]]).id_protected != d3) {
            rjU_2 rjU_22 = new rjU_2(d, d2, d3);
            this.id_throws[an_3.id_break[558]] = rjU_22;
            int n = rfU_2.id_byte(d);
            int n2 = rfU_2.id_byte(d2);
            int n3 = rfU_2.id_byte(d3);
            if (n != ((rfH_2)this.id_throws[id_break[559]]).b_() || n2 != ((rfH_2)this.id_throws[id_break[560]]).c_() || n3 != ((rfH_2)this.id_throws[id_break[561]]).d_()) {
                rfH_2 rfH_22 = new rfH_2(n, n2, n3);
                this.id_throws[an_3.id_break[562]] = rfH_22;
            }
            Boolean bl = id_implements[259];
            this.id_throws[an_3.id_break[563]] = bl;
        }
    }

    public boolean id_synchronized(an_3 an_32) {
        for (an_3 an_33 : this.Bh()) {
            if (!an_33.equals(an_32)) continue;
            return id_implements[233];
        }
        return id_implements[234];
    }

    public int id_synchronized() {
        return id_implements[250];
    }

    public void id_native(boolean bl) {
        this.id_break(id_private[29], bl);
    }

    public void id_native(an_3 an_32) {
        this.id_class(an_32.rx(), an_32.re(), an_32.BO(), ((Float)an_32.id_throws[id_break[455]]).floatValue(), ((Float)an_32.id_throws[id_break[456]]).floatValue());
    }

    public void id_native(double d, double d2, double d3) {
        this.id_volatile(d, d2, d3);
        Double d4 = d;
        this.id_throws[an_3.id_break[288]] = d4;
        Double d5 = d2;
        this.id_throws[an_3.id_break[289]] = d5;
        Double d6 = d3;
        this.id_throws[an_3.id_break[290]] = d6;
        Double d7 = d;
        this.id_throws[an_3.id_break[291]] = d7;
        Double d8 = d2;
        this.id_throws[an_3.id_break[292]] = d8;
        Double d9 = d3;
        this.id_throws[an_3.id_break[293]] = d9;
    }

    public void id_native(float f) {
    }

    public boolean id_native() {
        return id_implements[7];
    }

    public rfH_2 PI() {
        return new rfH_2(((rjU_2)this.id_throws[an_3.id_break[175]]).id_break, this.rN().id_break - id_finally[35], ((rjU_2)this.id_throws[an_3.id_break[176]]).id_protected);
    }

    public int rp() {
        return id_private[45];
    }

    public float rl() {
        float f = ((rYB)this.id_throws[id_break[171]]).id_byte(this.Bs()).id_break().id_int();
        float f2 = ((rYB)this.id_throws[id_break[172]]).id_byte(this.PI()).id_break().id_int();
        return (double)f == id_finally[33] ? f2 : f;
    }

    public void A() {
        this.id_byte(rjU_2.id_class);
        this.id_this();
        if (this.Pm()) {
            this.ra().id_catch(this);
        }
    }

    public boolean rw() {
        return (Boolean)((rmE_2)this.id_throws[id_break[206]]).id_class((rut_3)id_case[id_break[207]]);
    }

    public boolean rg() {
        return (Boolean)this.id_throws[id_break[453]];
    }

    public int ru() {
        return (Integer)this.id_throws[id_break[109]];
    }

    public boolean T() {
        return this.Pz() && !this.id_native() ? id_implements[223] : id_implements[224];
    }

    public UUID ro() {
        return (UUID)this.id_throws[id_break[475]];
    }

    public double re() {
        return ((rjU_2)this.id_throws[an_3.id_break[547]]).id_byte;
    }

    public aI_2<?> BC() {
        return (aI_2)this.id_throws[id_break[47]];
    }

    @Override
    public rjU_2 rr() {
        return (rjU_2)this.id_throws[id_break[567]];
    }

    public rjU_2 rm() {
        return (rjU_2)this.id_throws[id_break[46]];
    }

    public float rq() {
        xd_3 xd_32 = ((rYB)this.id_throws[id_break[173]]).id_byte(this.Bs()).id_break();
        float f = xd_32.id_package();
        if (xd_32 != xu_3.id_try && xd_32 != xu_3.hM) {
            return (double)f == id_finally[34] ? ((rYB)this.id_throws[id_break[174]]).id_byte(this.PI()).id_break().id_package() : f;
        }
        return f;
    }

    public void rc() {
        Integer n = this.rj();
        this.id_throws[an_3.id_break[103]] = n;
    }

    public int ri() {
        return id_break[435];
    }

    public boolean PM() {
        ((Object2DoubleMap)this.id_throws[id_break[221]]).clear();
        this.rd();
        double d = ((rYB)this.id_throws[id_break[222]]).id_default().id_protected() ? id_finally[97] : id_finally[98];
        boolean bl = this.id_class(rlG_2.id_byte, d);
        return this.rT() || bl ? id_implements[87] : id_implements[88];
    }

    public an_3 ra() {
        return (an_3)this.id_throws[id_break[520]];
    }

    public boolean PZ() {
        return this.rT() || this.ry() ? id_implements[71] : id_implements[72];
    }

    public boolean Pm() {
        return this.ra() != null ? id_implements[171] : id_implements[172];
    }

    public boolean ry() {
        return (Boolean)this.id_throws[id_break[262]] == false && ((Object2DoubleMap)this.id_throws[id_break[263]]).getDouble(rlG_2.id_byte) > id_finally[120] ? id_implements[103] : id_implements[104];
    }

    public gy_3 PL() {
        return new gy_3(this, this.Ps(), this.id_import(), (rYB)this.id_throws[id_break[521]] instanceof rrEm_1 ? (rrEm_1)((rYB)this.id_throws[id_break[522]]) : null, this.id_synchronized(), this.g().getString(), this.L_(), ((rYB)this.id_throws[id_break[523]]).id_const(), this);
    }

    public boolean PJ() {
        return id_implements[68];
    }

    public PX rO() {
        return new PX(((Float)this.id_throws[id_break[568]]).floatValue(), ((Float)this.id_throws[id_break[569]]).floatValue());
    }

    public float rQ() {
        return (int)((Float)this.id_throws[id_break[194]]).floatValue() + id_implements[67];
    }

    public iM_2 Pb() {
        return (iM_2)((Object)((rmE_2)this.id_throws[id_break[65]]).id_class((rut_3)id_case[id_break[66]]));
    }

    public boolean Pk() {
        return this.rT() || this.id_int() || this.id_new() ? id_implements[77] : id_implements[78];
    }

    public void Pn() {
        if (this.Pm() && ((Boolean)this.ra().id_throws[id_break[80]]).booleanValue()) {
            this.BH();
        }
        if ((Integer)this.id_throws[id_break[81]] > 0) {
            an_3 an_32 = this;
            Integer n = (Integer)an_32.id_throws[id_break[82]] - id_implements[16];
            an_32.id_throws[an_3.id_break[83]] = n;
        }
        rjU_2 rjU_22 = (rjU_2)this.id_throws[id_break[84]];
        this.id_throws[an_3.id_break[85]] = rjU_22;
        Float f = Float.valueOf(((Float)this.id_throws[id_break[86]]).floatValue());
        this.id_throws[an_3.id_break[87]] = f;
        Float f2 = Float.valueOf(((Float)this.id_throws[id_break[88]]).floatValue());
        this.id_throws[an_3.id_break[89]] = f2;
        Float f3 = Float.valueOf(((Float)this.id_throws[id_break[90]]).floatValue());
        this.id_throws[an_3.id_break[91]] = f3;
        this.PB();
        if (this.B()) {
            this.Bb();
        }
        this.PM();
        this.id_super();
        this.p();
        if (((rYB)this.id_throws[an_3.id_break[92]]).id_continue) {
            this.rE();
        } else if ((Integer)this.id_throws[id_break[93]] > 0) {
            if (this.q()) {
                this.id_protected((Integer)this.id_throws[id_break[94]] - id_private[4]);
                if ((Integer)this.id_throws[id_break[95]] < 0) {
                    this.rE();
                }
            } else {
                if ((Integer)this.id_throws[id_break[96]] % id_private[5] == 0 && !this.ry()) {
                    this.id_break(rye_3.id_byte, id_protected[5]);
                }
                this.id_protected((Integer)this.id_throws[id_break[97]] - id_implements[17]);
            }
        }
        if (this.ry()) {
            this.rb();
            an_3 an_33 = this;
            Float f4 = Float.valueOf(((Float)an_33.id_throws[id_break[98]]).floatValue() * id_protected[6]);
            an_33.id_throws[an_3.id_break[99]] = f4;
        }
        if (this.re() < id_finally[9]) {
            this.PQ();
        }
        if (!((rYB)this.id_throws[an_3.id_break[100]]).id_continue) {
            this.id_break(id_implements[18], (Integer)this.id_throws[id_break[101]] > 0 ? id_implements[19] : id_implements[20]);
        }
        Boolean bl = id_implements[21];
        this.id_throws[an_3.id_break[102]] = bl;
    }

    public void PC() {
        rfl_3 rfl_32 = this.rN();
        this.id_volatile((rfl_32.id_class + rfl_32.id_protected) / id_finally[88], rfl_32.id_break, (rfl_32.id_byte + rfl_32.id_case) / id_finally[89]);
    }

    public xc_3 Pl() {
        return ((rYB)this.id_throws[id_break[252]]).id_byte(this.BS());
    }

    public int PA() {
        return (Integer)((rmE_2)this.id_throws[id_break[436]]).id_class((rut_3)id_case[id_break[437]]);
    }

    public boolean Pz() {
        boolean bl = (rYB)this.id_throws[id_break[417]] != null && ((rYB)this.id_throws[an_3.id_break[418]]).id_continue ? id_implements[166] : id_implements[167];
        return !this.q() && ((Integer)this.id_throws[id_break[419]] > 0 || bl && this.id_finally(id_implements[168])) ? id_implements[169] : id_implements[170];
    }

    public boolean PH() {
        return id_implements[175];
    }

    public boolean rJ() {
        return this.D();
    }

    public void rA() {
    }

    public boolean Py() {
        return this.id_finally(id_private[28]);
    }

    public boolean Pp() {
        return this.id_finally(id_private[31]);
    }

    public boolean Pq() {
        HashSet hashSet = Sets.newHashSet();
        this.id_class(id_implements[238], hashSet);
        return hashSet.size() == id_implements[239] ? id_implements[240] : id_implements[241];
    }

    public rgy_3 rM() {
        return new rgy_3(rgp_3.id_byte, new rgq_3(this.BC(), this.ro(), this.g()));
    }

    public rnW_2 rC() {
        return ((rYB)this.id_throws[id_break[507]]).id_const();
    }

    public boolean rB() {
        return id_implements[218];
    }

    public boolean rG() {
        return id_implements[112];
    }

    public void rL() {
        Boolean bl = id_implements[191];
        this.id_throws[an_3.id_break[426]] = bl;
    }

    public Collection<an_3> PP() {
        HashSet hashSet = Sets.newHashSet();
        for (an_3 an_32 : this.Bh()) {
            hashSet.add(an_32);
            an_32.id_class(id_implements[237], hashSet);
        }
        return hashSet;
    }

    public void PB() {
        rYB rYB2 = (rYB)this.id_throws[id_break[402]];
        if (rYB2 instanceof rrEm_1) {
            rrEm_1 rrEm_12 = (rrEm_1)rYB2;
            int n = this.rR();
            if (((Boolean)this.id_throws[id_break[403]]).booleanValue()) {
                rqM_2<rYB> rqM_22;
                rnW_2 rnW_22 = rrEm_12.id_const();
                rrEm_1 rrEm_13 = rnW_22.id_class(rqM_22 = ((rYB)this.id_throws[id_break[404]]).E() == rYB.id_protected ? rYB.id_byte : rYB.id_protected);
                if (rrEm_13 != null && rnW_22.id_interface() && !this.Pm()) {
                    an_3 an_32 = this;
                    int n2 = (Integer)an_32.id_throws[id_break[405]];
                    Integer n3 = n2 + id_implements[163];
                    an_32.id_throws[an_3.id_break[406]] = n3;
                    if (n2 >= n) {
                        Integer n4 = n;
                        this.id_throws[an_3.id_break[407]] = n4;
                        this.rc();
                        this.id_class(rrEm_13);
                    }
                }
                Boolean bl = id_implements[164];
                this.id_throws[an_3.id_break[408]] = bl;
            } else {
                if ((Integer)this.id_throws[id_break[409]] > 0) {
                    an_3 an_33 = this;
                    Integer n5 = (Integer)an_33.id_throws[id_break[410]] - id_private[24];
                    an_33.id_throws[an_3.id_break[411]] = n5;
                }
                if ((Integer)this.id_throws[id_break[412]] < 0) {
                    Integer n6 = id_implements[165];
                    this.id_throws[an_3.id_break[413]] = n6;
                }
            }
            this.a();
        }
    }

    public double Ph() {
        return this.id_byte(((Random)this.id_throws[id_break[549]]).nextDouble());
    }

    public double Pv() {
        return id_finally[157];
    }

    public boolean rk() {
        return this.h();
    }

    public boolean PF() {
        return this.id_finally(id_private[26]);
    }

    public an_3 rU() {
        return null;
    }

    public rjU_2 Pt() {
        return new rjU_2((Double)this.id_throws[id_break[536]], (Double)this.id_throws[id_break[537]], (Double)this.id_throws[id_break[538]]);
    }

    public float rX() {
        rfw_3 rfw_32 = new rfw_3(this.rx(), id_finally[123], this.BO());
        if (((rYB)this.id_throws[id_break[268]]).id_int(rfw_32)) {
            rfw_32.b_(rfU_2.id_byte(this.rH()));
            return ((rYB)this.id_throws[id_break[269]]).id_native(rfw_32);
        }
        return id_protected[40];
    }

    public double rH() {
        return ((rjU_2)this.id_throws[an_3.id_break[550]]).id_byte + (double)((Float)this.id_throws[id_break[551]]).floatValue();
    }

    public boolean rZ() {
        return (Integer)this.id_throws[id_break[104]] > 0 ? id_implements[22] : id_implements[23];
    }

    public int rj() {
        return id_break[414];
    }

    @Override
    public rgP_2 rD() {
        return ((Optional)((rmE_2)this.id_throws[id_break[482]]).id_class((rut_3)id_case[id_break[483]])).orElse(null);
    }

    public double PS() {
        return (double)((ap_3)this.id_throws[an_3.id_break[374]]).id_break * id_finally[158];
    }

    public rfl_3 PE() {
        return this.rN();
    }

    public int rV() {
        return id_implements[249];
    }

    public void rE() {
        this.id_protected(id_implements[26]);
    }

    public boolean rP() {
        return this.Pb() == iM_2.SWIMMING ? id_implements[180] : id_implements[181];
    }

    public String rz() {
        return (String)this.id_throws[id_break[476]];
    }

    public String rW() {
        aI_2<?> aI_22 = this.BC();
        rqO_2 rqO_22 = aI_2.id_class(aI_22);
        return aI_22.id_class() && rqO_22 != null ? rqO_22.toString() : null;
    }

    public double rI() {
        return (double)this.Bx() < id_finally[198] ? id_finally[199] : id_finally[200];
    }

    public int rR() {
        return id_implements[25];
    }

    public String PG() {
        return "X: " + (int)this.rx() + " Y: " + (int)this.re() + " Z: " + (int)this.BO();
    }

    public an_3 PO() {
        an_3 an_32 = this;
        while (an_32.Pm()) {
            an_32 = an_32.ra();
        }
        return an_32;
    }

    public rqL_2 Pr() {
        return rqL_2.NEUTRAL;
    }

    public void PX() {
        this.id_new(((rjU_2)this.id_throws[an_3.id_break[76]]).id_break, ((rjU_2)this.id_throws[an_3.id_break[77]]).id_byte, ((rjU_2)this.id_throws[an_3.id_break[78]]).id_protected);
    }

    public rfl_3 rN() {
        return (rfl_3)this.id_throws[id_break[503]];
    }

    public void rF() {
    }

    public void Px() {
        rfl_3 rfl_32 = this.rN();
        rfH_2 rfH_22 = new rfH_2(rfl_32.id_class + id_finally[90], rfl_32.id_break + id_finally[91], rfl_32.id_byte + id_finally[92]);
        rfH_2 rfH_23 = new rfH_2(rfl_32.id_protected - id_finally[93], rfl_32.id_throws - id_finally[94], rfl_32.id_case - id_finally[95]);
        rfw_3 rfw_32 = new rfw_3();
        if (((rYB)this.id_throws[id_break[195]]).id_class(rfH_22, rfH_23)) {
            for (int i = rfH_22.b_(); i <= rfH_23.b_(); ++i) {
                for (int j = rfH_22.c_(); j <= rfH_23.c_(); ++j) {
                    for (int k = rfH_22.d_(); k <= rfH_23.d_(); ++k) {
                        rfw_32.id_class(i, j, k);
                        xc_3 xc_32 = ((rYB)this.id_throws[id_break[196]]).id_byte(rfw_32);
                        try {
                            xc_32.id_class((rYB)this.id_throws[id_break[197]], (rfH_2)rfw_32, this);
                            this.id_class(xc_32);
                            continue;
                        }
                        catch (Throwable throwable) {
                            KY kY = KY.id_class(throwable, id_class[2]);
                            Ko_1 ko_1 = kY.id_class(id_class[3]);
                            Ko_1.id_class(ko_1, rfw_32, xc_32);
                            throw new KU(kY);
                        }
                    }
                }
            }
        }
    }

    public boolean rY() {
        return id_implements[111];
    }

    public boolean PW() {
        return this.rP() && !this.rT() ? id_implements[182] : id_implements[183];
    }

    public double rx() {
        return ((rjU_2)this.id_throws[an_3.id_break[544]]).id_break;
    }

    public void PQ() {
        this.PD();
    }

    public boolean Pu() {
        return (Boolean)this.id_throws[id_break[369]] == false ? id_implements[140] : id_implements[141];
    }

    public boolean rT() {
        return (Boolean)this.id_throws[id_break[216]];
    }

    public float PN() {
        return ((ap_3)this.id_throws[an_3.id_break[531]]).id_class;
    }

    public rpr_3 rS() {
        return this.Pg();
    }

    public int rK() {
        rnM_2 rnM_22 = this.BG();
        return rnM_22 != null && rnM_22.id_volatile().id_protected() != null ? rnM_22.id_volatile().id_protected() : id_catch[0];
    }

    public int BN() {
        return (Integer)this.id_throws[id_break[570]];
    }

    public Iterable<rdn_3> PV() {
        return (List)id_case[id_break[416]];
    }

    public boolean PU() {
        return id_implements[146];
    }

    public boolean PK() {
        return id_implements[69];
    }

    public boolean PR() {
        return this.h();
    }

    public boolean BP() {
        return !this.Bh().isEmpty() ? id_implements[173] : id_implements[174];
    }

    public void Bn() {
        for (int i = ((List)this.id_throws[id_break[384]]).size() - id_implements[157]; i >= 0; --i) {
            ((an_3)((List)this.id_throws[id_break[385]]).get(i)).BH();
        }
    }

    public rqA_2 BB() {
        return rqn_3.SU;
    }

    public rmE_2 BQ() {
        return (rmE_2)this.id_throws[id_break[55]];
    }

    public boolean BZ() {
        return id_implements[134];
    }

    public boolean BF() {
        return (Boolean)((rmE_2)this.id_throws[id_break[202]]).id_class((rut_3)id_case[id_break[203]]);
    }

    public double BO() {
        return ((rjU_2)this.id_throws[an_3.id_break[552]]).id_protected;
    }

    public boolean Pa() {
        return this.rT() || this.id_new() ? id_implements[79] : id_implements[80];
    }

    public boolean BM() {
        return (Boolean)this.id_throws[id_break[368]] == false ? id_implements[138] : id_implements[139];
    }

    public List<an_3> Bh() {
        return ((List)this.id_throws[id_break[516]]).isEmpty() ? Collections.emptyList() : Lists.newArrayList((Iterable)((List)this.id_throws[id_break[517]]));
    }

    public rqA_2 BJ() {
        return rqn_3.SD;
    }

    @Override
    public boolean Bk() {
        return ((Optional)((rmE_2)this.id_throws[id_break[484]]).id_class((rut_3)id_case[id_break[485]])).isPresent();
    }

    public rfH_2 Bs() {
        return (rfH_2)this.id_throws[id_break[539]];
    }

    public void Bb() {
        int n;
        int n2;
        int n3 = rfU_2.id_byte(this.rx());
        rfH_2 rfH_22 = new rfH_2(n3, n2 = rfU_2.id_byte(this.re() - id_finally[113]), n = rfU_2.id_byte(this.BO()));
        xc_3 xc_32 = ((rYB)this.id_throws[id_break[253]]).id_byte(rfH_22);
        if (xc_32.id_private() != xN_2.INVISIBLE) {
            rjU_2 rjU_22 = this.rv();
            ((rYB)this.id_throws[id_break[254]]).id_class(new rLX(rLQ.id_protected, xc_32), this.rx() + (((Random)this.id_throws[id_break[255]]).nextDouble() - id_finally[114]) * (double)((ap_3)this.id_throws[an_3.id_break[256]]).id_class, this.re() + id_finally[115], this.BO() + (((Random)this.id_throws[id_break[257]]).nextDouble() - id_finally[116]) * (double)((ap_3)this.id_throws[an_3.id_break[258]]).id_class, rjU_22.id_break * id_finally[117], id_finally[118], rjU_22.id_protected * id_finally[119]);
        }
    }

    public rpr_3 Pg() {
        return rpr_3.id_class(((Float)this.id_throws[id_break[502]]).floatValue());
    }

    public float Bm() {
        return ((ap_3)this.id_throws[an_3.id_break[532]]).id_break;
    }

    public boolean Bl() {
        return id_implements[229];
    }

    public void BH() {
        this.id_const();
    }

    public static double Br() {
        return (Double)id_case[id_break[478]];
    }

    public rjU_2 BA() {
        return new rjU_2(id_finally[185], this.Bx(), this.PN() * id_protected[69]);
    }

    public Stream<an_3> Bu() {
        return Stream.concat(Stream.of(this), ((List)this.id_throws[id_break[518]]).stream().flatMap(an_3::Bu));
    }

    public rjU_2 BX() {
        return (rjU_2)this.id_throws[id_break[541]];
    }

    public rfH_2 BS() {
        rfH_2 rfH_22;
        xc_3 xc_32;
        xd_3 xd_32;
        int n;
        int n2;
        int n3 = rfU_2.id_byte(((rjU_2)this.id_throws[an_3.id_break[166]]).id_break);
        rfH_2 rfH_23 = new rfH_2(n3, n2 = rfU_2.id_byte(((rjU_2)this.id_throws[an_3.id_break[167]]).id_byte - id_finally[32]), n = rfU_2.id_byte(((rjU_2)this.id_throws[an_3.id_break[168]]).id_protected));
        if (((rYB)this.id_throws[id_break[169]]).id_byte(rfH_23).id_catch() && ((xd_32 = (xc_32 = ((rYB)this.id_throws[id_break[170]]).id_byte(rfH_22 = rfH_23.id_break())).id_break()).id_class(rls_3.id_default) || xd_32.id_class(rls_3.id_abstract) || xd_32 instanceof dq_3)) {
            return rfH_22;
        }
        return rfH_23;
    }

    public boolean Pj() {
        return (rlb_3)this.id_throws[id_break[260]] == rlG_2.id_break || (rlb_3)this.id_throws[id_break[261]] == rlG_2.id_byte ? id_implements[101] : id_implements[102];
    }

    public rnM_2 BG() {
        return ((rYB)this.id_throws[id_break[423]]).id_package().id_private(this.i());
    }

    public boolean BL() {
        return (Boolean)this.id_throws[id_break[113]];
    }

    public boolean Bz() {
        if (((rYB)this.id_throws[an_3.id_break[370]]).id_continue) {
            return id_implements[142];
        }
        if (((Boolean)this.id_throws[id_break[371]]).booleanValue()) {
            return id_implements[143];
        }
        float f = ((ap_3)this.id_throws[an_3.id_break[372]]).id_class * id_protected[60];
        rfl_3 rfl_32 = rfl_3.id_catch(f, id_finally[156], f).id_protected(this.rx(), this.rH(), this.BO());
        return ((rYB)this.id_throws[id_break[373]]).id_break(this, rfl_32, (xc_32, rfH_22) -> xc_32.id_final((rYB)this.id_throws[7], (rfH_2)rfH_22)).findAny().isPresent();
    }

    public void Bc() {
        if ((rYB)this.id_throws[id_break[59]] != null) {
            for (double d = this.re(); d > id_finally[6] && d < id_finally[7]; d += id_finally[8]) {
                this.id_new(this.rx(), d, this.BO());
                if (((rYB)this.id_throws[id_break[60]]).id_throws(this)) break;
            }
            this.id_byte(rjU_2.id_class);
            Float f = Float.valueOf(id_protected[2]);
            this.id_throws[an_3.id_break[61]] = f;
        }
    }

    public boolean BW() {
        return !((rYB)this.id_throws[id_break[382]]).a_(this, this.rN().id_break(id_finally[160])) ? id_implements[153] : id_implements[154];
    }

    public Iterable<rdn_3> PY() {
        return Iterables.concat(this.rs(), this.PV());
    }

    public float Bd() {
        return ((ap_3)this.id_throws[an_3.id_break[533]]).id_protected;
    }

    public float Bx() {
        return ((Float)this.id_throws[id_break[505]]).floatValue();
    }

    public rqA_2 Bv() {
        return rqn_3.SD;
    }

    public boolean Pw() {
        return this.h();
    }

    public ap_3 a_(iM_2 iM_22) {
        return ((aI_2)this.id_throws[id_break[534]]).id_volatile();
    }

    public void a_(rjU_2 rjU_22) {
        this.id_private(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    public boolean a_(rhd_3 rhd_32) {
        if (rhd_32.id_native()) {
            return id_implements[185];
        }
        rnM_2 rnM_22 = this.BG();
        return (rnM_22 == null || rhd_32 == null || rhd_32.BG() != rnM_22 || !rnM_22.id_private()) && this.Pp() ? id_implements[186] : id_implements[187];
    }

    public void a_(UUID uUID) {
        UUID uUID2 = uUID;
        this.id_throws[an_3.id_break[472]] = uUID2;
        String string = ((UUID)this.id_throws[id_break[473]]).toString();
        this.id_throws[an_3.id_break[474]] = string;
    }

    public rsE_2 a_(rdn_3 rdn_32) {
        return this.id_class(rdn_32, id_protected[59]);
    }

    public rjU_2 a_(iB_2 iB_22) {
        return new rjU_2(this.rx(), this.rN().id_throws, this.BO());
    }

    @Override
    public rgP_2 L_() {
        return rnB_2.id_class(this.BG(), this.g(), rnO_2.values()).id_class(rgc_32 -> rgc_32.id_class(this.rM()).id_class(this.rz()));
    }

    public abstract void m_();

    public void q_() {
        ap_3 ap_32;
        ap_3 ap_33 = (ap_3)this.id_throws[id_break[497]];
        iM_2 iM_22 = this.Pb();
        ap_3 ap_34 = ap_32 = this.a_(iM_22);
        this.id_throws[an_3.id_break[498]] = ap_34;
        Float f = Float.valueOf(this.id_class(iM_22, ap_32));
        this.id_throws[an_3.id_break[499]] = f;
        if (ap_32.id_class < ap_33.id_class) {
            double d = (double)ap_32.id_class / id_finally[183];
            this.id_class(new rfl_3(this.rx() - d, this.re(), this.BO() - d, this.rx() + d, this.re() + (double)ap_32.id_break, this.BO() + d));
        } else {
            rfl_3 rfl_32 = this.rN();
            this.id_class(new rfl_3(rfl_32.id_class, rfl_32.id_break, rfl_32.id_byte, rfl_32.id_class + (double)ap_32.id_class, rfl_32.id_break + (double)ap_32.id_break, rfl_32.id_byte + (double)ap_32.id_class));
            if (ap_32.id_class > ap_33.id_class && !((Boolean)this.id_throws[id_break[500]]).booleanValue() && !((rYB)this.id_throws[an_3.id_break[501]]).id_continue) {
                float f2 = ap_33.id_class - ap_32.id_class;
                this.id_class(iG_2.SELF, new rjU_2(f2, id_finally[184], f2));
            }
        }
    }

    public abstract ruS_2<?> p_();

    public Qs_1 r_() {
        return Qs_1.NORMAL;
    }

    public boolean Y() {
        return (Boolean)this.id_throws[id_break[565]];
    }

    public void c_(rhd_3 rhd_32) {
    }

    public void c_(boolean bl) {
        this.id_break(id_private[27], bl);
    }

    public rgP_2 PT() {
        return ((aI_2)this.id_throws[id_break[448]]).id_implements();
    }
}

