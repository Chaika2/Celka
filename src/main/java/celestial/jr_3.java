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
import celestial.JI;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.jB_2;
import celestial.jW_2;
import celestial.jz_3;
import celestial.lp_3;
import celestial.rCt_1;
import celestial.rHw_1;
import celestial.rYB;
import celestial.rje_3;
import celestial.rpr_3;
import celestial.ryJ_2;
import celestial.ryO_2;
import celestial.ryX_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xt_3;
import celestial.xu_3;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.Calendar;

public class jr_3<T extends ryO_2>
extends jW_2<T> {
    private final Iq_1 id_class;
    private final Iq_1 id_break;
    private final Iq_1 id_byte;
    private final Iq_1 id_protected;
    private final Iq_1 id_throws;
    private final Iq_1 id_case;
    private final Iq_1 id_private;
    private final Iq_1 id_implements;
    private final Iq_1 id_finally;
    private boolean id_extends;

    public jr_3(jz_3 jz_32) {
        super(jz_32);
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
            this.id_extends = true;
        }
        this.id_break = new Iq_1(64, 64, 0, 19);
        this.id_break.id_class(1.0f, 0.0f, 1.0f, 14.0f, 10.0f, 14.0f, 0.0f);
        this.id_class = new Iq_1(64, 64, 0, 0);
        this.id_class.id_class(1.0f, 0.0f, 0.0f, 14.0f, 5.0f, 14.0f, 0.0f);
        this.id_class.id_protected = 9.0f;
        this.id_class.id_throws = 1.0f;
        this.id_byte = new Iq_1(64, 64, 0, 0);
        this.id_byte.id_class(7.0f, -1.0f, 15.0f, 2.0f, 4.0f, 1.0f, 0.0f);
        this.id_byte.id_protected = 8.0f;
        this.id_throws = new Iq_1(64, 64, 0, 19);
        this.id_throws.id_class(1.0f, 0.0f, 1.0f, 15.0f, 10.0f, 14.0f, 0.0f);
        this.id_protected = new Iq_1(64, 64, 0, 0);
        this.id_protected.id_class(1.0f, 0.0f, 0.0f, 15.0f, 5.0f, 14.0f, 0.0f);
        this.id_protected.id_protected = 9.0f;
        this.id_protected.id_throws = 1.0f;
        this.id_case = new Iq_1(64, 64, 0, 0);
        this.id_case.id_class(15.0f, -1.0f, 15.0f, 1.0f, 4.0f, 1.0f, 0.0f);
        this.id_case.id_protected = 8.0f;
        this.id_implements = new Iq_1(64, 64, 0, 19);
        this.id_implements.id_class(0.0f, 0.0f, 1.0f, 15.0f, 10.0f, 14.0f, 0.0f);
        this.id_private = new Iq_1(64, 64, 0, 0);
        this.id_private.id_class(0.0f, 0.0f, 0.0f, 15.0f, 5.0f, 14.0f, 0.0f);
        this.id_private.id_protected = 9.0f;
        this.id_private.id_throws = 1.0f;
        this.id_finally = new Iq_1(64, 64, 0, 0);
        this.id_finally.id_class(0.0f, -1.0f, 15.0f, 1.0f, 4.0f, 1.0f, 0.0f);
        this.id_finally.id_protected = 8.0f;
    }

    @Override
    public void id_class(T t, float f, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        rYB rYB2 = ((ryO_2)t).id_while();
        boolean bl = rYB2 != null;
        xc_3 xc_32 = bl ? ((ryO_2)t).id_abstract() : (xc_3)xu_3.re.id_continue().id_class(xt_3.id_final, rpr_3.SOUTH);
        rCt_1 rCt_12 = xc_32.id_break(xt_3.id_package) ? xc_32.id_byte(xt_3.id_package) : rCt_1.SINGLE;
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof JI) {
            JI jI = (JI)xd_32;
            boolean bl2 = rCt_12 != rCt_1.SINGLE;
            ml_1.id_class();
            float f2 = xc_32.id_byte(xt_3.id_final).id_package();
            ml_1.id_class(0.5, 0.5, 0.5);
            ml_1.id_class(rje_3.id_protected.id_byte(-f2));
            ml_1.id_class(-0.5, -0.5, -0.5);
            ryJ_2<Object> ryJ_22 = bl ? jI.id_class(xc_32, rYB2, ((ryO_2)t).id_char(), true) : ryX_2::id_break;
            float f3 = ryJ_22.apply(xt_3.id_class((rHw_1)t)).get(f);
            f3 = 1.0f - f3;
            f3 = 1.0f - f3 * f3 * f3;
            int n3 = ((Int2IntFunction)ryJ_22.apply(new jB_2())).applyAsInt(n);
            Ig_1 ig_1 = lp_3.id_class(t, rCt_12, this.id_extends);
            Ok_1 ok_1 = ig_1.id_class(hx_1, HU::id_byte);
            if (bl2) {
                if (rCt_12 == rCt_1.LEFT) {
                    this.id_class(ml_1, ok_1, this.id_private, this.id_finally, this.id_implements, f3, n3, n2);
                } else {
                    this.id_class(ml_1, ok_1, this.id_protected, this.id_case, this.id_throws, f3, n3, n2);
                }
            } else {
                this.id_class(ml_1, ok_1, this.id_class, this.id_byte, this.id_break, f3, n3, n2);
            }
            ml_1.id_break();
        }
    }

    private void id_class(Ml_1 ml_1, Ok_1 ok_1, Iq_1 iq_1, Iq_1 iq_12, Iq_1 iq_13, float f, int n, int n2) {
        iq_12.id_case = iq_1.id_case = -(f * 1.5707964f);
        iq_1.id_class(ml_1, ok_1, n, n2);
        iq_12.id_class(ml_1, ok_1, n, n2);
        iq_13.id_class(ml_1, ok_1, n, n2);
    }
}

