/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.Wg_1;
import celestial.rRR;
import celestial.rfH_2;
import celestial.rqR_2;
import celestial.rrPA;
import celestial.rrPN;
import celestial.rrPp_1;
import celestial.rrPx_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zG_2;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import java.util.Map;

public class rrPE
extends rrPA {
    public static final Codec<rrPE> id_class;
    public static final rrPE id_break;
    private final Map<xd_3, xd_3> id_byte = rqR_2.id_class(Maps.newHashMap(), hashMap -> {
        hashMap.put(xu_3.id_volatile, xu_3.Ju);
        hashMap.put(xu_3.rV, xu_3.Ju);
        hashMap.put(xu_3.id_break, xu_3.JF);
        hashMap.put(xu_3.BL, xu_3.JL);
        hashMap.put(xu_3.BA, xu_3.JL);
        hashMap.put(xu_3.Pd, xu_3.Jm);
        hashMap.put(xu_3.hx, xu_3.Jm);
        hashMap.put(xu_3.hk, xu_3.Jp);
        hashMap.put(xu_3.Ba, xu_3.Jl);
        hashMap.put(xu_3.hX, xu_3.Jl);
        hashMap.put(xu_3.bP, xu_3.Jv);
        hashMap.put(xu_3.hA, xu_3.Jv);
        hashMap.put(xu_3.Ge, xu_3.Jq);
        hashMap.put(xu_3.GU, xu_3.Jq);
        hashMap.put(xu_3.bS, xu_3.JC);
        hashMap.put(xu_3.hF, xu_3.JC);
        hashMap.put(xu_3.hV, xu_3.JH);
        hashMap.put(xu_3.hf, xu_3.JH);
        hashMap.put(xu_3.SF, xu_3.JZ);
        hashMap.put(xu_3.SL, xu_3.JZ);
        hashMap.put(xu_3.BC, xu_3.Jn);
        hashMap.put(xu_3.Bn, xu_3.JA);
        hashMap.put(xu_3.Bf, xu_3.Bj);
    });

    private rrPE() {
    }

    static {
        id_break = new rrPE();
        id_class = Codec.unit(() -> id_break);
    }

    @Override
    public rrPp_1 id_class(rRR rRR2, rfH_2 rfH_22, rfH_2 rfH_23, rrPp_1 rrPp_12, rrPp_1 rrPp_13, rrPN rrPN2) {
        xd_3 xd_32 = this.id_byte.get(rrPp_13.id_break.id_break());
        if (xd_32 == null) {
            return rrPp_13;
        }
        xc_3 xc_32 = rrPp_13.id_break;
        xc_3 xc_33 = xd_32.id_continue();
        if (xc_32.id_break(zG_2.id_volatile)) {
            xc_33 = (xc_3)xc_33.id_class(zG_2.id_volatile, xc_32.id_byte(zG_2.id_volatile));
        }
        if (xc_32.id_break(zG_2.id_final)) {
            xc_33 = (xc_3)xc_33.id_class(zG_2.id_final, xc_32.id_byte(zG_2.id_final));
        }
        if (xc_32.id_break(Wg_1.id_volatile)) {
            xc_33 = (xc_3)xc_33.id_class(Wg_1.id_volatile, xc_32.id_byte(Wg_1.id_volatile));
        }
        return new rrPp_1(rrPp_13.id_class, xc_33, rrPp_13.id_byte);
    }

    @Override
    protected rrPx_1<?> id_class() {
        return rrPx_1.id_private;
    }
}

