/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.mA_2;
import celestial.mF_2;
import celestial.mL_2;
import celestial.mZ_2;
import celestial.mc_3;
import celestial.mf_3;
import celestial.mg_3;
import celestial.mm_3;
import celestial.mn_3;
import celestial.mu_3;
import celestial.mv_3;
import celestial.rKQ;
import celestial.rKT;
import celestial.rKW;
import celestial.rKd_1;
import celestial.rKk_1;
import celestial.rKz_1;
import celestial.rRJ;
import celestial.rVF;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rVv_1;
import celestial.rYG;
import celestial.rYl_1;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.ror_3;
import celestial.rrSp_1;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public abstract class mN_2 {
    public static final mN_2 id_class = new mc_3("default");
    private static final mN_2 id_throws = new mu_3("flat");
    private static final mN_2 id_case = new mm_3("large_biomes");
    public static final mN_2 id_break = new mZ_2("amplified");
    private static final mN_2 id_catch = new mv_3("single_biome_surface");
    private static final mN_2 id_private = new mF_2("single_biome_caves");
    private static final mN_2 id_implements = new mL_2("single_biome_floating_islands");
    private static final mN_2 id_finally = new mA_2("debug_all_block_states");
    protected static final List<mN_2> id_byte = Lists.newArrayList((Object[])new mN_2[]{id_class, id_throws, id_case, id_break, id_catch, id_private, id_implements, id_finally});
    protected static final Map<Optional<mN_2>, mn_3> id_protected = ImmutableMap.of(Optional.of(id_throws), (mo_32, rrSp_12) -> {
        rKd_1 rKd_12 = rrSp_12.id_throws();
        return new mg_3(mo_32, rKQ2 -> mo_32.id_case.id_class(new rrSp_1(rrSp_12.id_class(), rrSp_12.id_break(), rrSp_12.id_byte(), rrSp_1.id_class(mo_32.id_case.id_break().id_break(rVL.id_void), rrSp_12.id_protected(), (rKd_1)new rKz_1((rKQ)rKQ2)))), rKd_12 instanceof rKz_1 ? ((rKz_1)rKd_12).id_catch() : rKQ.id_class(mo_32.id_case.id_break().id_break(rVL.n)));
    }, Optional.of(id_catch), (mo_32, rrSp_12) -> new mf_3(mo_32, mo_32.id_case.id_break(), rYG2 -> mo_32.id_case.id_class(mN_2.id_class(mo_32.id_case.id_break(), rrSp_12, id_catch, rYG2)), mN_2.id_class(mo_32.id_case.id_break(), rrSp_12)), Optional.of(id_private), (mo_32, rrSp_12) -> new mf_3(mo_32, mo_32.id_case.id_break(), rYG2 -> mo_32.id_case.id_class(mN_2.id_class(mo_32.id_case.id_break(), rrSp_12, id_private, rYG2)), mN_2.id_class(mo_32.id_case.id_break(), rrSp_12)), Optional.of(id_implements), (mo_32, rrSp_12) -> new mf_3(mo_32, mo_32.id_case.id_break(), rYG2 -> mo_32.id_case.id_class(mN_2.id_class(mo_32.id_case.id_break(), rrSp_12, id_implements, rYG2)), mN_2.id_class(mo_32.id_case.id_break(), rrSp_12)));
    private final rgP_2 id_extends;

    public mN_2(String string) {
        this.id_extends = new rgn_3("generator." + string);
    }

    private static rYG id_class(rVm_1 rVm_12, rrSp_1 rrSp_12) {
        return rrSp_12.id_throws().id_protected().id_break().stream().findFirst().orElse(rVm_12.id_break(rVL.n).id_byte(rYl_1.id_break));
    }

    private static rrSp_1 id_class(rVm_1 rVm_12, rrSp_1 rrSp_12, mN_2 mN_22, rYG rYG2) {
        ror_3 ror_32 = new ror_3(rYG2);
        rVF<rRJ> rVF2 = rVm_12.id_break(rVL.id_void);
        rVF<rKW> rVF3 = rVm_12.id_break(rVL.u);
        Supplier<rKW> supplier = mN_22 == id_private ? () -> rVF3.id_byte(rKW.id_catch) : (mN_22 == id_implements ? () -> rVF3.id_byte(rKW.id_private) : () -> rVF3.id_byte(rKW.id_byte));
        return new rrSp_1(rrSp_12.id_class(), rrSp_12.id_break(), rrSp_12.id_byte(), rrSp_1.id_class(rVF2, rrSp_12.id_protected(), (rKd_1)new rKT(ror_32, rrSp_12.id_class(), supplier)));
    }

    public rgP_2 id_class() {
        return this.id_extends;
    }

    public rrSp_1 id_class(rVv_1 rVv_12, long l, boolean bl, boolean bl2) {
        rVF<rYG> rVF2 = rVv_12.id_break(rVL.n);
        rVF<rRJ> rVF3 = rVv_12.id_break(rVL.id_void);
        rVF<rKW> rVF4 = rVv_12.id_break(rVL.u);
        return new rrSp_1(l, bl, bl2, rrSp_1.id_class(rVF3, rRJ.id_class(rVF3, rVF2, rVF4, l), this.id_class(rVF2, rVF4, l)));
    }

    protected abstract rKd_1 id_class(rVL<rYG> var1, rVL<rKW> var2, long var3);

    public static Optional<mN_2> id_class(rrSp_1 rrSp_12) {
        rKd_1 rKd_12 = rrSp_12.id_throws();
        if (rKd_12 instanceof rKz_1) {
            return Optional.of(id_throws);
        }
        return rKd_12 instanceof rKk_1 ? Optional.of(id_finally) : Optional.empty();
    }
}

