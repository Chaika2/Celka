/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicates
 */
package celestial;

import celestial.Jq_1;
import celestial.Qd_1;
import celestial.Qh_1;
import celestial.Qx_1;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.ryw_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.base.Predicates;
import java.util.function.Predicate;

public class dA_2
extends xd_3 {
    public static final rCc_1 id_volatile = kE_2.p;
    public static final rCN id_final = rCT.id_private;
    protected static final rjC_2 id_package = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
    protected static final rjC_2 id_int = xd_3.id_class(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
    protected static final rjC_2 id_new = rjw_3.id_class(id_package, id_int);
    private static Qh_1 id_continue;

    public dA_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH)).id_class(id_final, false));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)((xc_3)this.id_continue().id_class(id_volatile, rxx_32.id_case().id_case())).id_class(id_final, false);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return xc_32.id_byte(id_final) != false ? id_new : id_package;
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        return true;
    }

    public static Qh_1 id_break() {
        if (id_continue == null) {
            id_continue = Qx_1.id_class().id_class("?vvv?", ">???<", ">???<", ">???<", "?^^^?").id_class('?', ryw_3.id_class(Qd_1.id_class)).id_class('^', ryw_3.id_class(Qd_1.id_class(xu_3.SO).id_class(id_final, (Predicate<Object>)Predicates.equalTo((Object)true)).id_class(id_volatile, (Predicate<Object>)Predicates.equalTo((Object)rpr_3.SOUTH)))).id_class('>', ryw_3.id_class(Qd_1.id_class(xu_3.SO).id_class(id_final, (Predicate<Object>)Predicates.equalTo((Object)true)).id_class(id_volatile, (Predicate<Object>)Predicates.equalTo((Object)rpr_3.WEST)))).id_class('v', ryw_3.id_class(Qd_1.id_class(xu_3.SO).id_class(id_final, (Predicate<Object>)Predicates.equalTo((Object)true)).id_class(id_volatile, (Predicate<Object>)Predicates.equalTo((Object)rpr_3.NORTH)))).id_class('<', ryw_3.id_class(Qd_1.id_class(xu_3.SO).id_class(id_final, (Predicate<Object>)Predicates.equalTo((Object)true)).id_class(id_volatile, (Predicate<Object>)Predicates.equalTo((Object)rpr_3.EAST)))).id_break();
        }
        return id_continue;
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return xc_32.id_byte(id_final) != false ? 15 : 0;
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }
}

