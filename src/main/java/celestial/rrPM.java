/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rCj_1;
import celestial.rRR;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrPA;
import celestial.rrPN;
import celestial.rrPp_1;
import celestial.rrPx_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zG_2;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPM
extends rrPA {
    public static final Codec<rrPM> id_class = Codec.FLOAT.fieldOf("mossiness").xmap(rrPM::new, rrPM2 -> Float.valueOf(rrPM2.id_break)).codec();
    private final float id_break;

    private xc_3 id_byte(Random random) {
        return random.nextFloat() < this.id_break ? xu_3.hf.id_continue() : null;
    }

    public rrPM(float f) {
        this.id_break = f;
    }

    private static xc_3 id_class(Random random, xd_3 xd_32) {
        return (xc_3)((xc_3)xd_32.id_continue().id_class(zG_2.id_volatile, rpb_3.HORIZONTAL.id_class(random))).id_class(zG_2.id_final, rCj_1.values()[random.nextInt(rCj_1.values().length)]);
    }

    private xc_3 id_class(Random random, xc_3[] xc_3Array, xc_3[] xc_3Array2) {
        return random.nextFloat() < this.id_break ? rrPM.id_class(random, xc_3Array2) : rrPM.id_class(random, xc_3Array);
    }

    private static xc_3 id_class(Random random, xc_3[] xc_3Array) {
        return xc_3Array[random.nextInt(xc_3Array.length)];
    }

    @Override
    protected rrPx_1<?> id_class() {
        return rrPx_1.id_catch;
    }

    @Override
    public rrPp_1 id_class(rRR rRR2, rfH_2 rfH_22, rfH_2 rfH_23, rrPp_1 rrPp_12, rrPp_1 rrPp_13, rrPN rrPN2) {
        Random random = rrPN2.id_break(rrPp_13.id_class);
        xc_3 xc_32 = rrPp_13.id_break;
        rfH_2 rfH_24 = rrPp_13.id_class;
        xc_3 xc_33 = null;
        if (!(xc_32.id_class(xu_3.BL) || xc_32.id_class(xu_3.id_break) || xc_32.id_class(xu_3.BC))) {
            if (xc_32.id_class(rls_3.id_interface)) {
                xc_33 = this.id_class(random, rrPp_13.id_break);
            } else if (xc_32.id_class(rls_3.id_char)) {
                xc_33 = this.id_break(random);
            } else if (xc_32.id_class(rls_3.id_abstract)) {
                xc_33 = this.id_byte(random);
            } else if (xc_32.id_class(xu_3.rg)) {
                xc_33 = this.id_protected(random);
            }
        } else {
            xc_33 = this.id_class(random);
        }
        return xc_33 != null ? new rrPp_1(rfH_24, xc_33, rrPp_13.id_byte) : rrPp_13;
    }

    private xc_3 id_class(Random random) {
        if (random.nextFloat() >= 0.5f) {
            return null;
        }
        xc_3[] xc_3Array = new xc_3[]{xu_3.Bn.id_continue(), rrPM.id_class(random, xu_3.Ba)};
        xc_3[] xc_3Array2 = new xc_3[]{xu_3.BA.id_continue(), rrPM.id_class(random, xu_3.hX)};
        return this.id_class(random, xc_3Array, xc_3Array2);
    }

    private xc_3 id_class(Random random, xc_3 xc_32) {
        rpr_3 rpr_32 = xc_32.id_byte(zG_2.id_volatile);
        rCj_1 rCj_12 = xc_32.id_byte(zG_2.id_final);
        if (random.nextFloat() >= 0.5f) {
            return null;
        }
        xc_3[] xc_3Array = new xc_3[]{xu_3.GU.id_continue(), xu_3.bS.id_continue()};
        xc_3[] xc_3Array2 = new xc_3[]{(xc_3)((xc_3)xu_3.hX.id_continue().id_class(zG_2.id_volatile, rpr_32)).id_class(zG_2.id_final, rCj_12), xu_3.hF.id_continue()};
        return this.id_class(random, xc_3Array, xc_3Array2);
    }

    private xc_3 id_break(Random random) {
        return random.nextFloat() < this.id_break ? xu_3.hF.id_continue() : null;
    }

    private xc_3 id_protected(Random random) {
        return random.nextFloat() < 0.15f ? xu_3.Jd.id_continue() : null;
    }
}

