/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Wt_1;
import celestial.rCL;
import celestial.rCN;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Map;

public class kM_2
extends xd_3 {
    public static final rCN id_volatile = Wt_1.id_volatile;
    public static final rCN id_final = Wt_1.id_final;
    public static final rCN id_package = Wt_1.id_package;
    public static final rCN id_int = Wt_1.id_int;
    public static final rCN id_new = Wt_1.id_new;
    public static final rCN id_continue = Wt_1.id_continue;
    private static final Map<rpr_3, rCN> id_super = Wt_1.id_super;

    public kM_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, true)).id_class(id_final, true)).id_class(id_package, true)).id_class(id_int, true)).id_class(id_new, true)).id_class(id_continue, true));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_super.get(rqd_32.id_class(rpr_3.NORTH)), xc_32.id_byte(id_volatile))).id_class(id_super.get(rqd_32.id_class(rpr_3.SOUTH)), xc_32.id_byte(id_package))).id_class(id_super.get(rqd_32.id_class(rpr_3.EAST)), xc_32.id_byte(id_final))).id_class(id_super.get(rqd_32.id_class(rpr_3.WEST)), xc_32.id_byte(id_int))).id_class(id_super.get(rqd_32.id_class(rpr_3.UP)), xc_32.id_byte(id_new))).id_class(id_super.get(rqd_32.id_class(rpr_3.DOWN)), xc_32.id_byte(id_continue));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_new, id_continue, id_volatile, id_final, id_package, id_int);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return (xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)xc_32.id_class(id_super.get(rpa_32.id_break(rpr_3.NORTH)), xc_32.id_byte(id_volatile))).id_class(id_super.get(rpa_32.id_break(rpr_3.SOUTH)), xc_32.id_byte(id_package))).id_class(id_super.get(rpa_32.id_break(rpr_3.EAST)), xc_32.id_byte(id_final))).id_class(id_super.get(rpa_32.id_break(rpr_3.WEST)), xc_32.id_byte(id_int))).id_class(id_super.get(rpa_32.id_break(rpr_3.UP)), xc_32.id_byte(id_new))).id_class(id_super.get(rpa_32.id_break(rpr_3.DOWN)), xc_32.id_byte(id_continue));
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        return (xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_continue().id_class(id_continue, this != rYB2.id_byte(rfH_22.id_break()).id_break())).id_class(id_new, this != rYB2.id_byte(rfH_22.id_final()).id_break())).id_class(id_volatile, this != rYB2.id_byte(rfH_22.id_private()).id_break())).id_class(id_final, this != rYB2.id_byte(rfH_22.id_extends()).id_break())).id_class(id_package, this != rYB2.id_byte(rfH_22.id_protected()).id_break())).id_class(id_int, this != rYB2.id_byte(rfH_22.id_byte()).id_break());
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return xc_33.id_class(this) ? (xc_3)xc_32.id_class(id_super.get(rpr_32), false) : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }
}

