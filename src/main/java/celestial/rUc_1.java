/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rpa_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrPG;
import celestial.rrPN;
import celestial.rrPd_1;
import celestial.rrPl_1;
import celestial.rrPt_1;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUc_1
extends rUO<rUt_1> {
    private static final rqO_2 id_class = new rqO_2("fossil/spine_1");
    private static final rqO_2 b = new rqO_2("fossil/spine_2");
    private static final rqO_2 M = new rqO_2("fossil/spine_3");
    private static final rqO_2 O = new rqO_2("fossil/spine_4");
    private static final rqO_2 h = new rqO_2("fossil/spine_1_coal");
    private static final rqO_2 X = new rqO_2("fossil/spine_2_coal");
    private static final rqO_2 J = new rqO_2("fossil/spine_3_coal");
    private static final rqO_2 x = new rqO_2("fossil/spine_4_coal");
    private static final rqO_2 d = new rqO_2("fossil/skull_1");
    private static final rqO_2 k = new rqO_2("fossil/skull_2");
    private static final rqO_2 W = new rqO_2("fossil/skull_3");
    private static final rqO_2 z = new rqO_2("fossil/skull_4");
    private static final rqO_2 Q = new rqO_2("fossil/skull_1_coal");
    private static final rqO_2 N = new rqO_2("fossil/skull_2_coal");
    private static final rqO_2 c = new rqO_2("fossil/skull_3_coal");
    private static final rqO_2 u = new rqO_2("fossil/skull_4_coal");
    private static final rqO_2[] m = new rqO_2[]{id_class, b, M, O, d, k, W, z};
    private static final rqO_2[] Z = new rqO_2[]{h, X, J, x, Q, N, c, u};

    public rUc_1(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        int n;
        rqd_3 rqd_32 = rqd_3.id_class(random);
        int n2 = random.nextInt(m.length);
        rrPt_1 rrPt_12 = rRI2.id_byte().id_const().rP();
        rrPl_1 rrPl_12 = rrPt_12.id_class(m[n2]);
        rrPl_1 rrPl_13 = rrPt_12.id_class(Z[n2]);
        rfj_3 rfj_32 = new rfj_3(rfH_22);
        rfi_3 rfi_32 = new rfi_3(rfj_32.id_break(), 0, rfj_32.id_byte(), rfj_32.id_protected(), 256, rfj_32.id_throws());
        rrPN rrPN2 = new rrPN().id_class(rqd_32).id_class(rfi_32).id_class(random).id_class(rrPG.id_protected);
        rfH_2 rfH_23 = rrPl_12.id_class(rqd_32);
        int n3 = random.nextInt(16 - rfH_23.b_());
        int n4 = random.nextInt(16 - rfH_23.d_());
        int n5 = 256;
        for (n = 0; n < rfH_23.b_(); ++n) {
            for (int i = 0; i < rfH_23.d_(); ++i) {
                n5 = Math.min(n5, rRI2.id_class(rKv_1.OCEAN_FLOOR_WG, rfH_22.b_() + n + n3, rfH_22.d_() + i + n4));
            }
        }
        n = Math.max(n5 - 15 - random.nextInt(10), 10);
        rfH_2 rfH_24 = rrPl_12.id_class(rfH_22.id_break(n3, n, n4), rpa_3.NONE, rqd_32);
        rrPd_1 rrPd_12 = new rrPd_1(0.9f);
        rrPN2.id_break().id_class(rrPd_12);
        rrPl_12.id_class(rRI2, rfH_24, rfH_24, rrPN2, random, 4);
        rrPN2.id_break(rrPd_12);
        rrPd_1 rrPd_13 = new rrPd_1(0.1f);
        rrPN2.id_break().id_class(rrPd_13);
        rrPl_13.id_class(rRI2, rfH_24, rfH_24, rrPN2, random, 4);
        return true;
    }
}

