/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JX;
import celestial.OR;
import celestial.OT;
import celestial.Oe_1;
import celestial.Ot_1;
import celestial.XB;
import celestial.XF;
import celestial.XX;
import celestial.Xa_1;
import celestial.Xb_1;
import celestial.Xc_1;
import celestial.Xh_1;
import celestial.Xp_1;
import celestial.Xr_1;
import celestial.aI_2;
import celestial.eY_2;
import celestial.hJ_2;
import celestial.hK_2;
import celestial.hM_2;
import celestial.hS_2;
import celestial.hT_2;
import celestial.hY_2;
import celestial.hh_3;
import celestial.hm_3;
import celestial.rVL;
import celestial.rbf_3;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rls_3;
import celestial.rqO_2;
import celestial.xu_3;
import java.util.function.Consumer;

public class Uc_1
implements Consumer<Consumer<OT>> {
    private static final aI_2<?>[] id_class = new aI_2[]{aI_2.id_float, aI_2.id_package, aI_2.G, aI_2.Z, aI_2.id_native, aI_2.b, aI_2.x, aI_2.id_finally, aI_2.rB, aI_2.M, aI_2.c, aI_2.id_transient, aI_2.id_private, aI_2.h, aI_2.id_throw, aI_2.id_throws, aI_2.id_long, aI_2.w};
    private static final rdb_3[] id_break = new rdb_3[]{rdy_3.Xz, rdy_3.XN, rdy_3.Xc, rdy_3.XQ};
    private static final rdb_3[] id_byte = new rdb_3[]{rdy_3.XB, rdy_3.XS, rdy_3.Xr, rdy_3.XP};
    private static final rdb_3[] id_protected = new rdb_3[]{rdy_3.Ob, rdy_3.Oe, rdy_3.hS, rdy_3.hC, rdy_3.hl, rdy_3.hy, rdy_3.hp, rdy_3.Xz, rdy_3.XQ, rdy_3.XN, rdy_3.Xc, rdy_3.Xu, rdy_3.Xm, rdy_3.Jh, rdy_3.Jx, rdy_3.Jz, rdy_3.JQ, rdy_3.JN, rdy_3.Jc, rdy_3.Ju, rdy_3.JC, rdy_3.ds, rdy_3.dE, rdy_3.dG, rdy_3.db, rdy_3.dO, rdy_3.dN, rdy_3.dC, rdy_3.dl, rdy_3.dH, rdy_3.dg, rdy_3.dR, rdy_3.kO, rdy_3.kX, rdy_3.kx, rdy_3.Jd, rdy_3.ke, rdy_3.WQ, rdy_3.WF};

    private Ot_1 id_byte(Ot_1 ot_1) {
        for (rdb_3 rdb_32 : id_byte) {
            ot_1.id_class(rVL.id_for.id_break(rdb_32).id_break(), Xr_1.id_class(XX.id_class().id_class(rdb_32).id_break()));
        }
        return ot_1;
    }

    public void id_class(Consumer<OT> consumer) {
        OT oT = Ot_1.id_class().id_class(xu_3.Ey, (rgP_2)new rgn_3("advancements.husbandry.root.title"), (rgP_2)new rgn_3("advancements.husbandry.root.description"), new rqO_2("textures/gui/advancements/backgrounds/husbandry.png"), Oe_1.TASK, false, false, false).id_class("consumed_item", hm_3.id_break()).id_class(consumer, "husbandry/root");
        OT oT2 = Ot_1.id_class().id_class(oT).id_class(rdy_3.hB, (rgP_2)new rgn_3("advancements.husbandry.plant_seed.title"), (rgP_2)new rgn_3("advancements.husbandry.plant_seed.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class(hS_2.id_break).id_class("wheat", Xp_1.id_class(xu_3.PB)).id_class("pumpkin_stem", Xp_1.id_class(xu_3.Bo)).id_class("melon_stem", Xp_1.id_class(xu_3.BK)).id_class("beetroots", Xp_1.id_class(xu_3.bT)).id_class("nether_wart", Xp_1.id_class(xu_3.Ss)).id_class(consumer, "husbandry/plant_seed");
        OT oT3 = Ot_1.id_class().id_class(oT).id_class(rdy_3.hB, (rgP_2)new rgn_3("advancements.husbandry.breed_an_animal.title"), (rgP_2)new rgn_3("advancements.husbandry.breed_an_animal.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class(hS_2.id_break).id_class("bred", hJ_2.id_break()).id_class(consumer, "husbandry/breed_an_animal");
        this.id_class(Ot_1.id_class()).id_class(oT2).id_class(rdy_3.Ob, (rgP_2)new rgn_3("advancements.husbandry.balanced_diet.title"), (rgP_2)new rgn_3("advancements.husbandry.balanced_diet.description"), (rqO_2)null, Oe_1.CHALLENGE, true, true, false).id_class(OR.id_class(100)).id_class(consumer, "husbandry/balanced_diet");
        Ot_1.id_class().id_class(oT2).id_class(rdy_3.OK, (rgP_2)new rgn_3("advancements.husbandry.netherite_hoe.title"), (rgP_2)new rgn_3("advancements.husbandry.netherite_hoe.description"), (rqO_2)null, Oe_1.CHALLENGE, true, true, false).id_class(OR.id_class(100)).id_class("netherite_hoe", Xb_1.id_class(rdy_3.OK)).id_class(consumer, "husbandry/obtain_netherite_hoe");
        OT oT4 = Ot_1.id_class().id_class(oT).id_class(rdy_3.df, (rgP_2)new rgn_3("advancements.husbandry.tame_an_animal.title"), (rgP_2)new rgn_3("advancements.husbandry.tame_an_animal.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("tamed_animal", JX.id_break()).id_class(consumer, "husbandry/tame_an_animal");
        this.id_break(Ot_1.id_class()).id_class(oT3).id_class(rdy_3.dO, (rgP_2)new rgn_3("advancements.husbandry.breed_all_animals.title"), (rgP_2)new rgn_3("advancements.husbandry.breed_all_animals.description"), (rqO_2)null, Oe_1.CHALLENGE, true, true, false).id_class(OR.id_class(100)).id_class(consumer, "husbandry/bred_all_animals");
        OT oT5 = this.id_protected(Ot_1.id_class()).id_class(oT).id_class(hS_2.id_break).id_class(rdy_3.Xd, (rgP_2)new rgn_3("advancements.husbandry.fishy_business.title"), (rgP_2)new rgn_3("advancements.husbandry.fishy_business.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class(consumer, "husbandry/fishy_business");
        this.id_byte(Ot_1.id_class()).id_class(oT5).id_class(hS_2.id_break).id_class(rdy_3.Xr, (rgP_2)new rgn_3("advancements.husbandry.tactical_fishing.title"), (rgP_2)new rgn_3("advancements.husbandry.tactical_fishing.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class(consumer, "husbandry/tactical_fishing");
        this.id_throws(Ot_1.id_class()).id_class(oT4).id_class(rdy_3.Xz, (rgP_2)new rgn_3("advancements.husbandry.complete_catalogue.title"), (rgP_2)new rgn_3("advancements.husbandry.complete_catalogue.description"), (rqO_2)null, Oe_1.CHALLENGE, true, true, false).id_class(OR.id_class(50)).id_class(consumer, "husbandry/complete_catalogue");
        Ot_1.id_class().id_class(oT).id_class("safely_harvest_honey", Xa_1.id_class(Xc_1.id_class().id_class(hh_3.id_class().id_class(rls_3.k).id_break()).id_class(true), XX.id_class().id_class(rdy_3.Jn))).id_class(rdy_3.WF, (rgP_2)new rgn_3("advancements.husbandry.safely_harvest_honey.title"), (rgP_2)new rgn_3("advancements.husbandry.safely_harvest_honey.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class(consumer, "husbandry/safely_harvest_honey");
        Ot_1.id_class().id_class(oT).id_class("silk_touch_nest", hM_2.id_class(xu_3.JM, XX.id_class().id_class(new hT_2(eY_2.id_else, XF.id_break(1))), XF.id_class(3))).id_class(xu_3.JM, (rgP_2)new rgn_3("advancements.husbandry.silk_touch_nest.title"), (rgP_2)new rgn_3("advancements.husbandry.silk_touch_nest.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class(consumer, "husbandry/silk_touch_nest");
    }

    private Ot_1 id_class(Ot_1 ot_1) {
        for (rdb_3 rdb_32 : id_protected) {
            ot_1.id_class(rVL.id_for.id_break(rdb_32).id_break(), hm_3.id_class(rdb_32));
        }
        return ot_1;
    }

    @Override
    public /* synthetic */ void accept(Object object) {
        this.id_class((Consumer)object);
    }

    private Ot_1 id_break(Ot_1 ot_1) {
        for (aI_2<?> aI_22 : id_class) {
            ot_1.id_class(aI_2.id_class(aI_22).toString(), hJ_2.id_class(hK_2.id_class().id_class(aI_22)));
        }
        ot_1.id_class(aI_2.id_class(aI_2.o).toString(), hJ_2.id_class(hK_2.id_class().id_class(aI_2.o).id_break(), hK_2.id_class().id_class(aI_2.o).id_break(), hY_2.id_class));
        return ot_1;
    }

    private Ot_1 id_throws(Ot_1 ot_1) {
        rbf_3.id_super.forEach((n, rqO_22) -> ot_1.id_class(rqO_22.id_break(), JX.id_class(hK_2.id_class().id_class((rqO_2)rqO_22).id_break())));
        return ot_1;
    }

    private Ot_1 id_protected(Ot_1 ot_1) {
        for (rdb_3 rdb_32 : id_break) {
            ot_1.id_class(rVL.id_for.id_break(rdb_32).id_break(), XB.id_class(Xh_1.id_class, hY_2.id_class, XX.id_class().id_class(rdb_32).id_break()));
        }
        return ot_1;
    }
}

