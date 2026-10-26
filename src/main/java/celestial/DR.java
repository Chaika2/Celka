/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.DA;
import celestial.Du_1;
import celestial.Ux_1;
import celestial.rVL;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rlM_2;
import celestial.rlO_2;
import celestial.rlc_3;
import celestial.rls_3;
import celestial.rqO_2;
import celestial.xd_3;
import java.nio.file.Path;
import java.util.function.Function;

public class DR
extends Ux_1<rdb_3> {
    private final Function<rlO_2<xd_3>, rlM_2> id_protected = du_1::id_break;

    public DR(DA dA, Du_1 du_1) {
        super(dA, rVL.id_for);
    }

    @Override
    public String id_class() {
        return "Item Tags";
    }

    @Override
    protected Path id_class(rqO_2 rqO_22) {
        return this.id_break.id_break().resolve("data/" + rqO_22.id_byte() + "/tags/items/" + rqO_22.id_break() + ".json");
    }

    protected void id_class(rlO_2<xd_3> rlO_22, rlO_2<rdb_3> rlO_23) {
        rlM_2 rlM_22 = this.id_break(rlO_23);
        rlM_2 rlM_23 = this.id_protected.apply(rlO_22);
        rlM_23.id_break().forEach(rlM_22::id_class);
    }

    @Override
    protected void id_break() {
        this.id_class(rls_3.id_break, rlc_3.id_break);
        this.id_class(rls_3.id_byte, rlc_3.id_byte);
        this.id_class(rls_3.id_protected, rlc_3.id_protected);
        this.id_class(rls_3.id_throws, rlc_3.id_throws);
        this.id_class(rls_3.id_case, rlc_3.id_case);
        this.id_class(rls_3.id_catch, rlc_3.id_catch);
        this.id_class(rls_3.id_private, rlc_3.id_private);
        this.id_class(rls_3.id_implements, rlc_3.id_implements);
        this.id_class(rls_3.id_finally, rlc_3.id_finally);
        this.id_class(rls_3.id_extends, rlc_3.id_extends);
        this.id_class(rls_3.id_volatile, rlc_3.id_native);
        this.id_class(rls_3.id_int, rlc_3.id_final);
        this.id_class(rls_3.id_new, rlc_3.id_package);
        this.id_class(rls_3.id_else, rlc_3.id_super);
        this.id_class(rls_3.id_this, rlc_3.id_continue);
        this.id_class(rls_3.id_synchronized, rlc_3.id_this);
        this.id_class(rls_3.id_return, rlc_3.id_else);
        this.id_class(rls_3.id_goto, rlc_3.id_return);
        this.id_class(rls_3.id_public, rlc_3.id_synchronized);
        this.id_class(rls_3.id_while, rlc_3.id_public);
        this.id_class(rls_3.id_try, rlc_3.id_goto);
        this.id_class(rls_3.id_continue, rlc_3.id_int);
        this.id_class(rls_3.id_super, rlc_3.id_new);
        this.id_class(rls_3.id_throw, rlc_3.id_try);
        this.id_class(rls_3.id_char, rlc_3.id_throw);
        this.id_class(rls_3.id_abstract, rlc_3.id_interface);
        this.id_class(rls_3.id_interface, rlc_3.id_instanceof);
        this.id_class(rls_3.id_long, rlc_3.id_char);
        this.id_class(rls_3.id_float, rlc_3.id_abstract);
        this.id_class(rls_3.id_void, rlc_3.id_long);
        this.id_class(rls_3.id_package, rlc_3.id_volatile);
        this.id_class(rls_3.id_static, rlc_3.id_float);
        this.id_class(rls_3.id_import, rlc_3.id_void);
        this.id_class(rls_3.id_short, rlc_3.id_static);
        this.id_class(rls_3.id_default, rlc_3.id_import);
        this.id_class(rls_3.id_const, rlc_3.id_short);
        this.id_class(rls_3.id_strictfp, rlc_3.id_default);
        this.id_class(rls_3.id_transient, rlc_3.id_boolean);
        this.id_class(rls_3.n, rlc_3.id_for);
        this.id_class(rlc_3.id_while).id_class((rdb_3)new rdb_3[]{rdy_3.dY, rdy_3.id_do, rdy_3.dK, rdy_3.dD, rdy_3.dU, rdy_3.de, rdy_3.da, rdy_3.di, rdy_3.kr, rdy_3.kP, rdy_3.kB, rdy_3.kS, rdy_3.ks, rdy_3.kE, rdy_3.kG, rdy_3.kb});
        this.id_class(rlc_3.id_double).id_class((rdb_3)new rdb_3[]{rdy_3.he, rdy_3.ku, rdy_3.km, rdy_3.kZ, rdy_3.kv, rdy_3.kF});
        this.id_class(rlc_3.id_switch).id_class((rdb_3)new rdb_3[]{rdy_3.Xz, rdy_3.Xu, rdy_3.XQ, rdy_3.Xm, rdy_3.Xc, rdy_3.XN});
        this.id_class(rls_3.O, rlc_3.r);
        this.id_class(rlc_3.B).id_class((rdb_3)new rdb_3[]{rdy_3.kH, rdy_3.ky, rdy_3.kp, rdy_3.kq, rdy_3.kT, rdy_3.kt, rdy_3.kw, rdy_3.kI, rdy_3.kf, rdy_3.kj, rdy_3.kV, rdy_3.kg});
        this.id_class(rlc_3.P).id_class((rdb_3)((Object)rlc_3.B)).id_class((rlO_2<rdb_3>)((Object)rdy_3.kR));
        this.id_class(rlc_3.S).id_class((rdb_3)new rdb_3[]{rdy_3.Oh, rdy_3.OX});
        this.id_class(rlc_3.s).id_class((rdb_3)new rdb_3[]{rdy_3.OO, rdy_3.kz, rdy_3.kW});
        this.id_class(rlc_3.E).id_class((rdb_3)new rdb_3[]{rdy_3.dr, rdy_3.xi});
        this.id_class(rlc_3.G).id_class((rdb_3)new rdb_3[]{rdy_3.Ok, rdy_3.dP, rdy_3.OJ, rdy_3.Od, rdy_3.Ox});
        this.id_class(rlc_3.id_const).id_class(rdy_3.Bu).id_class(rdy_3.Wz).id_class(rdy_3.Wc);
        this.id_class(rlc_3.id_strictfp).id_class((rdb_3)((Object)rlc_3.id_boolean)).id_class((rlO_2<rdb_3>)new rdb_3[]{rdy_3.rI, rdy_3.Wt, rdy_3.sJ, rdy_3.Od, rdy_3.Wk, rdy_3.Xk, rdy_3.dO, rdy_3.Jt, rdy_3.hy, rdy_3.hp, rdy_3.hc, rdy_3.hu, rdy_3.hm, rdy_3.hZ, rdy_3.dt, rdy_3.OA, rdy_3.OC, rdy_3.On, rdy_3.Ol, rdy_3.OH});
        this.id_class(rlc_3.id_transient).id_class((rdb_3)new rdb_3[]{rdy_3.id_double, rdy_3.G, rdy_3.m, rdy_3.d, rdy_3.id_for, rdy_3.E, rdy_3.u, rdy_3.x, rdy_3.id_synchronized, rdy_3.id_return, rdy_3.rK, rdy_3.rD, rdy_3.PD, rdy_3.PU, rdy_3.BJ, rdy_3.Bx, rdy_3.Bl, rdy_3.BH, rdy_3.Ss, rdy_3.SE, rdy_3.SC, rdy_3.Sl, rdy_3.sE, rdy_3.sG, rdy_3.Ma, rdy_3.Mi, rdy_3.hj, rdy_3.hV});
        this.id_class(rlc_3.b).id_class((rdb_3)new rdb_3[]{rdy_3.id_package, rdy_3.Wp});
        this.id_class(rlc_3.M).id_class((rdb_3)new rdb_3[]{rdy_3.id_package, rdy_3.Wp});
    }
}

