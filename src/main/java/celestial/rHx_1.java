/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.dt_3;
import celestial.iB_2;
import celestial.rHd_1;
import celestial.rHf_1;
import celestial.rHk_1;
import celestial.rbF_2;
import celestial.rcd_3;
import celestial.rco_3;
import celestial.rcy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rja_3;
import celestial.rlE_2;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrTj_1;
import celestial.ruP_2;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xO_2;
import celestial.xc_3;
import celestial.xn_3;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class rHx_1
extends ryO_2
implements rHf_1 {
    private final List<rHd_1> id_class = Lists.newArrayList();
    private rfH_2 id_break = null;

    public rHx_1() {
        super(ryW_2.id_long);
    }

    private boolean id_class(xc_3 xc_32, rHd_1 rHd_12, List<an_3> list, rHk_1 rHk_12) {
        boolean bl;
        if ((this.id_extends.id_boolean() || this.id_extends.s()) && rHk_12 != rHk_1.EMERGENCY) {
            return false;
        }
        rfH_2 rfH_22 = this.id_char();
        rcd_3 rcd_32 = rHd_12.id_class;
        rcd_32.id_continue("Passengers");
        rcd_32.id_continue("Leash");
        rcd_32.id_continue("UUID");
        rpr_3 rpr_32 = xc_32.id_byte(xO_2.id_volatile);
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        boolean bl2 = bl = !this.id_extends.id_byte(rfH_23).id_extends(this.id_extends, rfH_23).id_break();
        if (bl && rHk_12 != rHk_1.EMERGENCY) {
            return false;
        }
        an_3 an_33 = aI_2.id_class(rcd_32, this.id_extends, an_32 -> an_32);
        if (an_33 != null) {
            if (!an_33.BC().id_class(rlE_2.id_protected)) {
                return false;
            }
            if (an_33 instanceof rbF_2) {
                rbF_2 rbF_22 = (rbF_2)an_33;
                if (this.id_final() && !rbF_22.n() && this.id_extends.id_int.nextFloat() < 0.9f) {
                    rbF_22.id_implements(this.id_break);
                }
                if (rHk_12 == rHk_1.HONEY_DELIVERED) {
                    int n;
                    rbF_22.sZ();
                    if (xc_32.id_break().id_class(rls_3.k) && (n = rHx_1.id_class(xc_32)) < 5) {
                        int n2;
                        int n3 = n2 = this.id_extends.id_int.nextInt(100) == 0 ? 2 : 1;
                        if (n + n2 > 5) {
                            --n2;
                        }
                        this.id_extends.id_break(this.id_char(), (xc_3)xc_32.id_class(xO_2.id_final, n + n2));
                    }
                }
                this.id_class(rHd_12.id_break, rbF_22);
                if (list != null) {
                    list.add(rbF_22);
                }
                float f = an_33.PN();
                double d = bl ? 0.0 : 0.55 + (double)(f / 2.0f);
                double d2 = (double)rfH_22.b_() + 0.5 + d * (double)rpr_32.id_implements();
                double d3 = (double)rfH_22.c_() + 0.5 - (double)(an_33.Bm() / 2.0f);
                double d4 = (double)rfH_22.d_() + 0.5 + d * (double)rpr_32.id_extends();
                an_33.id_class(d2, d3, d4, ((Float)an_33.id_throws[15]).floatValue(), ((Float)an_33.id_throws[16]).floatValue());
            }
            this.id_extends.id_class((rhd_3)null, rfH_22, rqn_3.I, rqL_2.BLOCKS, 1.0f, 1.0f);
            return this.id_extends.a_(an_33);
        }
        return false;
    }

    public void id_class(an_3 an_32, boolean bl, int n) {
        if (this.id_class.size() < 3) {
            an_32.BH();
            an_32.Bn();
            rcd_3 rcd_32 = new rcd_3();
            an_32.id_byte(rcd_32);
            this.id_class.add(new rHd_1(rcd_32, n, bl ? 2400 : 600));
            if (this.id_extends != null) {
                rrTj_1 rrTj_12;
                if (an_32 instanceof rbF_2 && ((rbF_2)(rrTj_12 = (rbF_2)an_32)).n() && (!this.id_final() || this.id_extends.id_int.nextBoolean())) {
                    this.id_break = ((rbF_2)rrTj_12).L();
                }
                rrTj_12 = this.id_char();
                this.id_extends.id_class((rhd_3)null, (double)((rja_3)((Object)rrTj_12)).b_(), (double)((rja_3)((Object)rrTj_12)).c_(), (double)((rja_3)((Object)rrTj_12)).d_(), rqn_3.w, rqL_2.BLOCKS, 1.0f, 1.0f);
            }
            an_32.PD();
        }
    }

    public static int id_class(xc_3 xc_32) {
        return xc_32.id_byte(xO_2.id_final);
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Bees", this.id_volatile());
        if (this.id_final()) {
            rcd_32.id_class("FlowerPos", rco_3.id_class(this.id_break));
        }
        return rcd_32;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_class.clear();
        rcy_3 rcy_32 = rcd_32.id_protected("Bees", 10);
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcd_3 rcd_33 = rcy_32.id_class(i);
            rHd_1 rHd_12 = new rHd_1(rcd_33.id_int("EntityData"), rcd_33.id_private("TicksInHive"), rcd_33.id_private("MinOccupationTicks"));
            this.id_class.add(rHd_12);
        }
        this.id_break = null;
        if (rcd_32.id_throws("FlowerPos")) {
            this.id_break = rco_3.id_break(rcd_32.id_int("FlowerPos"));
        }
    }

    private void id_class(int n, rbF_2 rbF_22) {
        int n2 = rbF_22.O_();
        if (n2 < 0) {
            rbF_22.e_(Math.min(0, n2 + n));
        } else if (n2 > 0) {
            rbF_22.e_(Math.max(0, n2 - n));
        }
        rbF_22.id_this(Math.max(0, rbF_22.sW() - n));
        rbF_22.sJ();
    }

    private List<an_3> id_class(xc_3 xc_32, rHk_1 rHk_12) {
        ArrayList arrayList = Lists.newArrayList();
        this.id_class.removeIf(rHd_12 -> this.id_class(xc_32, (rHd_1)rHd_12, arrayList, rHk_12));
        return arrayList;
    }

    public void id_class(an_3 an_32, boolean bl) {
        this.id_class(an_32, bl, 0);
    }

    public boolean id_class() {
        if (this.id_extends == null) {
            return false;
        }
        for (rfH_2 rfH_22 : rfH_2.id_class(this.id_native.id_break(-1, -1, -1), this.id_native.id_break(1, 1, 1))) {
            if (!(this.id_extends.id_byte(rfH_22).id_break() instanceof dt_3)) continue;
            return true;
        }
        return false;
    }

    public void id_class(rhd_3 rhd_32, xc_3 xc_32, rHk_1 rHk_12) {
        List<an_3> list = this.id_class(xc_32, rHk_12);
        if (rhd_32 != null) {
            for (an_3 an_32 : list) {
                if (!(an_32 instanceof rbF_2)) continue;
                rbF_2 rbF_22 = (rbF_2)an_32;
                if (!(rhd_32.Ps().id_implements(an_32.Ps()) <= 16.0)) continue;
                if (!this.id_extends()) {
                    rbF_22.id_byte((iB_2)rhd_32);
                    continue;
                }
                rbF_22.id_else(400);
            }
        }
    }

    @Override
    public void id_break() {
        if (this.id_class()) {
            this.id_class(null, this.id_extends.id_byte(this.id_char()), rHk_1.EMERGENCY);
        }
        super.id_break();
    }

    @Override
    public void id_throws() {
        if (!this.id_extends.id_continue) {
            this.id_package();
            rfH_2 rfH_22 = this.id_char();
            if (this.id_class.size() > 0 && this.id_extends.id_long().nextDouble() < 0.005) {
                double d = (double)rfH_22.b_() + 0.5;
                double d2 = rfH_22.c_();
                double d3 = (double)rfH_22.d_() + 0.5;
                this.id_extends.id_class((rhd_3)null, d, d2, d3, rqn_3.j, rqL_2.BLOCKS, 1.0f, 1.0f);
            }
            this.id_native();
        }
    }

    public int id_finally() {
        return this.id_class.size();
    }

    public boolean id_catch() {
        return this.id_class.isEmpty();
    }

    public boolean id_extends() {
        return xn_3.id_class(this.id_extends, this.id_char());
    }

    private void id_package() {
        Iterator<rHd_1> iterator = this.id_class.iterator();
        xc_3 xc_32 = this.id_abstract();
        while (iterator.hasNext()) {
            rHd_1 rHd_12 = iterator.next();
            if (rHd_12.id_break > rHd_12.id_byte) {
                rHk_1 rHk_12;
                rHk_1 rHk_13 = rHk_12 = rHd_12.id_class.id_new("HasNectar") ? rHk_1.HONEY_DELIVERED : rHk_1.BEE_RELEASED;
                if (this.id_class(xc_32, rHd_12, (List<an_3>)null, rHk_12)) {
                    iterator.remove();
                }
            }
            ++rHd_12.id_break;
        }
    }

    public boolean id_private() {
        return this.id_class.size() == 3;
    }

    private boolean id_final() {
        return this.id_break != null;
    }

    public rcy_3 id_volatile() {
        rcy_3 rcy_32 = new rcy_3();
        for (rHd_1 rHd_12 : this.id_class) {
            rHd_12.id_class.id_continue("UUID");
            rcd_3 rcd_32 = new rcd_3();
            rcd_32.id_class("EntityData", rHd_12.id_class);
            rcd_32.id_break("TicksInHive", rHd_12.id_break);
            rcd_32.id_break("MinOccupationTicks", rHd_12.id_byte);
            rcy_32.add(rcd_32);
        }
        return rcy_32;
    }

    protected void id_native() {
        ruP_2.id_class(this);
    }
}

