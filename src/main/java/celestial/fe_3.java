/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ig_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.jB_2;
import celestial.jW_2;
import celestial.jz_3;
import celestial.lp_3;
import celestial.rCp_1;
import celestial.rHJ;
import celestial.rYB;
import celestial.rje_3;
import celestial.rpr_3;
import celestial.ryJ_2;
import celestial.ryW_2;
import celestial.ryh_3;
import celestial.xb_3;
import celestial.xc_3;
import celestial.xt_3;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fe_3
extends jW_2<rHJ> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1[] id_byte = new Iq_1[4];

    public fe_3(jz_3 jz_32) {
        super(jz_32);
        this.id_class = new Iq_1(64, 64, 0, 0);
        this.id_class.id_class(0.0f, 0.0f, 0.0f, 16.0f, 16.0f, 6.0f, 0.0f);
        this.id_break = new Iq_1(64, 64, 0, 22);
        this.id_break.id_class(0.0f, 0.0f, 0.0f, 16.0f, 16.0f, 6.0f, 0.0f);
        this.id_byte[0] = new Iq_1(64, 64, 50, 0);
        this.id_byte[1] = new Iq_1(64, 64, 50, 6);
        this.id_byte[2] = new Iq_1(64, 64, 50, 12);
        this.id_byte[3] = new Iq_1(64, 64, 50, 18);
        this.id_byte[0].id_class(0.0f, 6.0f, -16.0f, 3.0f, 3.0f, 3.0f);
        this.id_byte[1].id_class(0.0f, 6.0f, 0.0f, 3.0f, 3.0f, 3.0f);
        this.id_byte[2].id_class(-16.0f, 6.0f, -16.0f, 3.0f, 3.0f, 3.0f);
        this.id_byte[3].id_class(-16.0f, 6.0f, 0.0f, 3.0f, 3.0f, 3.0f);
        this.id_byte[0].id_case = 1.5707964f;
        this.id_byte[1].id_case = 1.5707964f;
        this.id_byte[2].id_case = 1.5707964f;
        this.id_byte[3].id_case = 1.5707964f;
        this.id_byte[0].id_private = 0.0f;
        this.id_byte[1].id_private = 1.5707964f;
        this.id_byte[2].id_private = 4.712389f;
        this.id_byte[3].id_private = (float)Math.PI;
    }

    private void id_class(Ml_1 ml_1, Hx_1 hx_1, boolean bl, rpr_3 rpr_32, Ig_1 ig_1, int n, int n2, boolean bl2) {
        this.id_class.id_finally = bl;
        this.id_break.id_finally = !bl;
        this.id_byte[0].id_finally = !bl;
        this.id_byte[1].id_finally = bl;
        this.id_byte[2].id_finally = !bl;
        this.id_byte[3].id_finally = bl;
        ml_1.id_class();
        ml_1.id_class(0.0, 0.5625, bl2 ? -1.0 : 0.0);
        ml_1.id_class(rje_3.id_break.id_byte(90.0f));
        ml_1.id_class(0.5, 0.5, 0.5);
        ml_1.id_class(rje_3.id_case.id_byte(180.0f + rpr_32.id_package()));
        ml_1.id_class(-0.5, -0.5, -0.5);
        Ok_1 ok_1 = ig_1.id_class(hx_1, HU::id_break);
        this.id_class.id_class(ml_1, ok_1, n, n2);
        this.id_break.id_class(ml_1, ok_1, n, n2);
        this.id_byte[0].id_class(ml_1, ok_1, n, n2);
        this.id_byte[1].id_class(ml_1, ok_1, n, n2);
        this.id_byte[2].id_class(ml_1, ok_1, n, n2);
        this.id_byte[3].id_class(ml_1, ok_1, n, n2);
        ml_1.id_break();
    }

    @Override
    public void id_class(rHJ rHJ2, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        Ig_1 ig_1 = lp_3.id_finally[rHJ2.id_class().id_break()];
        rYB rYB2 = rHJ2.id_while();
        if (rYB2 != null) {
            xc_3 xc_32 = rHJ2.id_abstract();
            ryJ_2<rHJ> ryJ_22 = ryh_3.id_class(ryW_2.id_public, xb_3::id_implements, xb_3::id_private, xt_3.id_final, xc_32, rYB2, rHJ2.id_char(), (rRg_12, rfH_22) -> false);
            int n3 = ((Int2IntFunction)ryJ_22.apply(new jB_2())).get(n);
            this.id_class(ml_1, hx_1, xc_32.id_byte(xb_3.id_volatile) == rCp_1.HEAD, xc_32.id_byte(xb_3.p), ig_1, n3, n2, false);
        } else {
            this.id_class(ml_1, hx_1, true, rpr_3.SOUTH, ig_1, n, n2, false);
            this.id_class(ml_1, hx_1, false, rpr_3.SOUTH, ig_1, n, n2, true);
        }
    }
}

