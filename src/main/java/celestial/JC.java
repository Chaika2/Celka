/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.serialization.MapCodec
 */
package celestial;

import celestial.JA;
import celestial.Jl_1;
import celestial.Jp_1;
import celestial.Jq_1;
import celestial.Jy_1;
import celestial.QP;
import celestial.QS;
import celestial.Qs_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.rCZ;
import celestial.rCn_1;
import celestial.rJZ;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rhf_3;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rlb_3;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.ryH_2;
import celestial.ryZ_2;
import celestial.rzP_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.zr_3;
import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public abstract class JC
extends rCn_1<xd_3, xc_3> {
    private final int id_break;
    private final boolean id_throws;
    private final boolean id_case;
    private final QP id_catch;
    private final QS id_private;
    private final float id_implements;
    private final boolean id_finally;
    private final boolean id_extends;
    private final Jy_1 id_native;
    private final Jy_1 id_volatile;
    private final Jy_1 id_final;
    private final Jy_1 id_package;
    private final Jy_1 id_int;
    protected Jl_1 id_class;

    public rjC_2 id_byte(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_break().id_class(this.id_int(), rRq_12, rfH_22);
    }

    public rjC_2 id_byte(rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_break().id_byte(this.id_int(), rRq_12, rfH_22, rjm_32);
    }

    public int id_byte(rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return this.id_break().id_break(this.id_int(), rRq_12, rfH_22, rpr_32);
    }

    public QP id_byte() {
        return this.id_catch;
    }

    public boolean id_int(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_package.test(this.id_int(), rRq_12, rfH_22);
    }

    protected abstract xc_3 id_int();

    protected JC(xd_3 xd_32, ImmutableMap<rCZ<?>, Comparable<?>> immutableMap, MapCodec<xc_3> mapCodec) {
        super(xd_32, immutableMap, mapCodec);
        Jq_1 jq_1 = xd_32.id_extends;
        this.id_break = jq_1.id_throws.applyAsInt(this.id_int());
        this.id_throws = xd_32.id_break(this.id_int());
        this.id_case = jq_1.id_package;
        this.id_catch = jq_1.id_class;
        this.id_private = jq_1.id_break.apply(this.id_int());
        this.id_implements = jq_1.id_catch;
        this.id_finally = jq_1.id_private;
        this.id_extends = jq_1.id_final;
        this.id_native = jq_1.id_new;
        this.id_volatile = jq_1.id_continue;
        this.id_final = jq_1.id_super;
        this.id_package = jq_1.id_this;
        this.id_int = jq_1.id_else;
    }

    public final void id_class(rRg_1 rRg_12, rfH_2 rfH_22, int n) {
        this.id_class(rRg_12, rfH_22, n, 512);
    }

    public final void id_class(rRg_1 rRg_12, rfH_2 rfH_22, int n, int n2) {
        this.id_break();
        rfw_3 rfw_32 = new rfw_3();
        for (rpr_3 rpr_32 : JA.id_class) {
            rfw_32.id_class((rja_3)rfH_22, rpr_32);
            xc_3 xc_32 = rRg_12.id_byte(rfw_32);
            xc_3 xc_33 = xc_32.id_class(rpr_32.id_case(), this.id_int(), rRg_12, (rfH_2)rfw_32, rfH_22);
            xd_3.id_class(xc_32, xc_33, rRg_12, rfw_32, n, n2);
        }
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        this.id_break().id_class(this.id_int(), rYB2, rfH_22, xc_32, bl);
    }

    public void id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        this.id_break().id_break(this.id_int(), rrEm_12, rfH_22, random);
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        this.id_break().id_class(this.id_int(), rYB2, rfH_22, an_32);
    }

    public void id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, rdn_3 rdn_32) {
        this.id_break().id_class(this.id_int(), rrEm_12, rfH_22, rdn_32);
    }

    public final boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, an_3 an_32, rpr_3 rpr_32) {
        return xd_3.id_class(this.id_break(rRq_12, rfH_22, rjm_3.id_class(an_32)), rpr_32);
    }

    public final boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, an_3 an_32) {
        return this.id_class(rRq_12, rfH_22, an_32, rpr_3.UP);
    }

    public rjC_2 id_class(rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_break().id_class(this.id_int(), rRq_12, rfH_22, rjm_32);
    }

    public rjU_2 id_class(rfH_2 rfH_22) {
        Jp_1 jp_1 = this.id_break().id_byte();
        if (jp_1 == Jp_1.NONE) {
            return rjU_2.id_class;
        }
        long l = rfU_2.id_byte(rfH_22.b_(), 0, rfH_22.d_());
        return new rjU_2(((double)((float)(l & 0xFL) / 15.0f) - 0.5) * 0.5, jp_1 == Jp_1.XYZ ? ((double)((float)(l >> 4 & 0xFL) / 15.0f) - 1.0) * 0.2 : 0.0, ((double)((float)(l >> 8 & 0xFL) / 15.0f) - 0.5) * 0.5);
    }

    public boolean id_class(rYB rYB2, rfH_2 rfH_22, int n, int n2) {
        return this.id_break().id_class(this.id_int(), rYB2, rfH_22, n, n2);
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        this.id_break().id_class(this.id_int(), rYB2, rfH_22, xd_32, rfH_23, bl);
    }

    @Override
    public boolean id_class(rlb_3<xd_3> rlb_32, Predicate<JC> predicate) {
        return this.id_break().id_class(rlb_32) && predicate.test(this);
    }

    @Override
    public boolean id_class(rlb_3<xd_3> rlb_32) {
        return this.id_break().id_class(rlb_32);
    }

    public boolean id_class(rRR rRR2, rfH_2 rfH_22) {
        return this.id_break().id_class(this.id_int(), rRR2, rfH_22);
    }

    public boolean id_class(rXs_1 rXs_12) {
        return this.id_break().id_class(this.id_int(), rXs_12);
    }

    public boolean id_class(xd_3 xd_32) {
        return this.id_break().id_break(xd_32);
    }

    public void id_class(rYB rYB2, xc_3 xc_32, rff_3 rff_32, rhf_3 rhf_32) {
        this.id_break().id_class(rYB2, xc_32, rff_32, rhf_32);
    }

    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32, ryH_2 ryH_22) {
        return this.id_class != null ? this.id_class.id_class(rpr_32, ryH_22) : ryH_22.id_class(this.id_int(), rRq_12, rfH_22, rpr_32);
    }

    public List<rdn_3> id_class(rzP_2 rzP_22) {
        return this.id_break().id_class(this.id_int(), rzP_22);
    }

    public ryZ_2 id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        return this.id_break().id_class(this.id_int(), rYB2, rff_32.id_class(), rhd_32, rpm_32, rff_32);
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32) {
        this.id_break().id_class(this.id_int(), rYB2, rfH_22, rhd_32);
    }

    public xc_3 id_class(rpr_3 rpr_32, xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return this.id_break().id_class(this.id_int(), rpr_32, xc_32, rRg_12, rfH_22, rfH_23);
    }

    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return this.id_break().id_class(this.id_int(), rRq_12, rfH_22, rLT2);
    }

    public boolean id_class(rxx_3 rxx_32) {
        return this.id_break().id_class(this.id_int(), rxx_32);
    }

    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_class != null ? this.id_class.id_catch : this.id_break().a_(this.id_int(), rRq_12, rfH_22);
    }

    public xc_3 id_class(rpa_3 rpa_32) {
        return this.id_break().id_class(this.id_int(), rpa_32);
    }

    public float id_class(rhd_3 rhd_32, rdn_3 rdn_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_break().id_class(this.id_int(), rhd_32, rdn_32, rRq_12, rfH_22);
    }

    public float id_class(rhd_3 rhd_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_break().id_class(this.id_int(), rhd_32, rRq_12, rfH_22);
    }

    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, aI_2<?> aI_22) {
        return this.id_break().id_extends.id_int.test(this.id_int(), rRq_12, rfH_22, aI_22);
    }

    public int id_class(rYB rYB2, rfH_2 rfH_22) {
        return this.id_break().id_break(this.id_int(), rYB2, rfH_22);
    }

    public boolean id_class(xc_3 xc_32, rpr_3 rpr_32) {
        return this.id_break().id_class(this.id_int(), xc_32, rpr_32);
    }

    public xc_3 id_class(rqd_3 rqd_32) {
        return this.id_break().id_class(this.id_int(), rqd_32);
    }

    public rjC_2 id_class(rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return this.id_class != null && this.id_class.id_implements != null ? this.id_class.id_implements[rpr_32.ordinal()] : rjw_3.id_class(this.id_byte(rRq_12, rfH_22), rpr_32);
    }

    public void id_class() {
        if (!this.id_break().id_super()) {
            this.id_class = new Jl_1(this.id_int());
        }
    }

    public void id_break(rRg_1 rRg_12, rfH_2 rfH_22, int n, int n2) {
        this.id_break().id_class(this.id_int(), rRg_12, rfH_22, n, n2);
    }

    public void id_break(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        this.id_break().id_break(this.id_int(), rYB2, rfH_22, xc_32, bl);
    }

    public rJZ id_break(rYB rYB2, rfH_2 rfH_22) {
        return this.id_break().id_class(this.id_int(), rYB2, rfH_22);
    }

    public void id_break(rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        this.id_break().id_class(this.id_int(), rrEm_12, rfH_22, random);
    }

    public long id_break(rfH_2 rfH_22) {
        return this.id_break().id_class(this.id_int(), rfH_22);
    }

    public int id_break(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_class != null ? this.id_class.id_private : this.id_break().id_protected(this.id_int(), rRq_12, rfH_22);
    }

    public int id_break(rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return this.id_break().id_class(this.id_int(), rRq_12, rfH_22, rpr_32);
    }

    public rjC_2 id_break(rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_break().id_break(this.id_int(), rRq_12, rfH_22, rjm_32);
    }

    public xd_3 id_break() {
        return (xd_3)this.id_byte;
    }

    public final void id_break(rRg_1 rRg_12, rfH_2 rfH_22, int n) {
        this.id_break(rRg_12, rfH_22, n, 512);
    }

    public boolean id_throws(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_int.test(this.id_int(), rRq_12, rfH_22);
    }

    public boolean id_throws() {
        return this.id_throws;
    }

    public rjC_2 id_finally(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_class(rRq_12, rfH_22, rjm_3.id_break());
    }

    public boolean id_finally() {
        return this.id_break().id_case(this.id_int());
    }

    public boolean id_catch() {
        return this.id_case;
    }

    public boolean id_catch(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_native.test(this.id_int(), rRq_12, rfH_22);
    }

    public Qs_1 id_extends() {
        return this.id_break().id_protected(this.id_int());
    }

    public rjC_2 id_extends(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_class != null ? this.id_class.id_break : this.id_break(rRq_12, rfH_22, rjm_3.id_break());
    }

    public int id_case() {
        return this.id_break;
    }

    public float id_case(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_break().id_throws(this.id_int(), rRq_12, rfH_22);
    }

    public boolean id_implements(rRq_1 rRq_12, rfH_2 rfH_22) {
        if (this.id_class != null) {
            return this.id_class.id_class;
        }
        xc_3 xc_32 = this.id_int();
        return xc_32.id_native() ? xd_3.id_class(xc_32.id_byte(rRq_12, rfH_22)) : false;
    }

    public boolean id_implements() {
        return this.id_break().id_byte(this.id_int());
    }

    public boolean id_new(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_class != null ? this.id_class.id_protected : xd_3.id_class(this.id_extends(rRq_12, rfH_22));
    }

    public boolean id_new() {
        return this.id_finally;
    }

    public zr_3 id_package() {
        return this.id_break().id_native(this.id_int());
    }

    public boolean id_package(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_final.test(this.id_int(), rRq_12, rfH_22);
    }

    public boolean id_protected() {
        return this.id_class == null || this.id_class.id_byte;
    }

    public boolean id_protected(rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return this.id_class(rRq_12, rfH_22, rpr_32, ryH_2.FULL);
    }

    public QS id_protected(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_private;
    }

    public xN_2 id_private() {
        return this.id_break().id_class(this.id_int());
    }

    public float id_private(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_implements;
    }

    public boolean id_final() {
        return this.id_break().a_(this.id_int());
    }

    public boolean id_final(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_volatile.test(this.id_int(), rRq_12, rfH_22);
    }

    public rXE id_volatile() {
        return this.id_break().id_throws(this.id_int());
    }

    public rjC_2 id_volatile(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_break().id_byte(this.id_int(), rRq_12, rfH_22);
    }

    public rjC_2 id_native(rRq_1 rRq_12, rfH_2 rfH_22) {
        return this.id_break().id_break(this.id_int(), rRq_12, rfH_22);
    }

    public boolean id_native() {
        return this.id_extends;
    }
}

