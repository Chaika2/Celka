/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.IC;
import celestial.Ig_1;
import celestial.Iq_1;
import celestial.JC;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.jW_2;
import celestial.jz_3;
import celestial.lp_3;
import celestial.rCn_1;
import celestial.rHE;
import celestial.rHb_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rje_3;
import celestial.rxL_2;
import celestial.xS_2;
import celestial.zt_3;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class fD_2
extends jW_2<rHb_1> {
    private final Iq_1 id_class = fD_2.id_class();
    private final Iq_1 id_break = new Iq_1(64, 64, 44, 0);
    private final Iq_1 id_byte;

    public fD_2(jz_3 jz_32) {
        super(jz_32);
        this.id_break.id_class(-1.0f, -30.0f, -1.0f, 2.0f, 42.0f, 2.0f, 0.0f);
        this.id_byte = new Iq_1(64, 64, 0, 42);
        this.id_byte.id_class(-10.0f, -32.0f, -1.0f, 20.0f, 2.0f, 2.0f, 0.0f);
    }

    public static void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, int n2, Iq_1 iq_1, Ig_1 ig_1, boolean bl, List<Pair<rHE, rxL_2>> list) {
        fD_2.id_class(ml_1, hx_1, n, n2, iq_1, ig_1, bl, list, false);
    }

    public static void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, int n2, Iq_1 iq_1, Ig_1 ig_1, boolean bl, List<Pair<rHE, rxL_2>> list, boolean bl2) {
        iq_1.id_class(ml_1, ig_1.id_class(hx_1, HU::id_break, bl2), n, n2);
        for (int i = 0; i < 17 && i < list.size(); ++i) {
            Pair<rHE, rxL_2> pair = list.get(i);
            float[] fArray = ((rxL_2)pair.getSecond()).id_protected();
            Ig_1 ig_12 = new Ig_1(bl ? lp_3.id_byte : lp_3.id_protected, ((rHE)((Object)pair.getFirst())).id_class(bl));
            iq_1.id_class(ml_1, ig_12.id_class(hx_1, HU::id_extends), n, n2, fArray[0], fArray[1], fArray[2], 1.0f);
        }
    }

    @Override
    public void id_class(rHb_1 rHb_12, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        List<Pair<rHE, rxL_2>> list = rHb_12.id_throws();
        if (list != null) {
            Object object;
            long l;
            float f2 = 0.6666667f;
            boolean bl = rHb_12.id_while() == null;
            ml_1.id_class();
            if (bl) {
                l = 0L;
                ml_1.id_class(0.5, 0.5, 0.5);
                this.id_break.id_finally = true;
            } else {
                l = rHb_12.id_while().r();
                object = rHb_12.id_abstract();
                if (((JC)object).id_break() instanceof xS_2) {
                    ml_1.id_class(0.5, 0.5, 0.5);
                    var13_12 = (float)(-((rCn_1)object).id_byte(xS_2.id_volatile).intValue() * 360) / 16.0f;
                    ml_1.id_class(rje_3.id_protected.id_byte(var13_12));
                    this.id_break.id_finally = true;
                } else {
                    ml_1.id_class(0.5, -0.1666666716337204, 0.5);
                    var13_12 = -((rCn_1)object).id_byte(zt_3.id_volatile).id_package();
                    ml_1.id_class(rje_3.id_protected.id_byte(var13_12));
                    ml_1.id_class(0.0, -0.3125, -0.4375);
                    this.id_break.id_finally = false;
                }
            }
            ml_1.id_class();
            ml_1.id_class(0.6666667f, -0.6666667f, -0.6666667f);
            object = IC.id_case.id_class(hx_1, HU::id_break);
            this.id_break.id_class(ml_1, (Ok_1)object, n, n2);
            this.id_byte.id_class(ml_1, (Ok_1)object, n, n2);
            rfH_2 rfH_22 = rHb_12.id_char();
            float f3 = ((float)Math.floorMod((long)(rfH_22.b_() * 7 + rfH_22.c_() * 9 + rfH_22.d_() * 13) + l, 100L) + f) / 100.0f;
            this.id_class.id_case = (-0.0125f + 0.01f * rfU_2.id_break((float)Math.PI * 2 * f3)) * (float)Math.PI;
            this.id_class.id_protected = -32.0f;
            fD_2.id_class(ml_1, hx_1, n, n2, this.id_class, IC.id_case, true, list);
            ml_1.id_break();
            ml_1.id_break();
        }
    }

    public static Iq_1 id_class() {
        Iq_1 iq_1 = new Iq_1(64, 64, 0, 0);
        iq_1.id_class(-10.0f, 0.0f, -2.0f, 20.0f, 40.0f, 1.0f, 0.0f);
        return iq_1;
    }
}

