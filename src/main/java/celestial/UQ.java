/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.JB;
import celestial.JO;
import celestial.JZ;
import celestial.Jr_1;
import celestial.Ju_1;
import celestial.Jx_1;
import celestial.OR;
import celestial.OT;
import celestial.Oe_1;
import celestial.Ot_1;
import celestial.XF;
import celestial.XK;
import celestial.XN;
import celestial.Xf_1;
import celestial.Xk_1;
import celestial.Xm_1;
import celestial.Xx_1;
import celestial.aI_2;
import celestial.hA_2;
import celestial.hC_2;
import celestial.hI_2;
import celestial.hK_2;
import celestial.hQ_2;
import celestial.hS_2;
import celestial.hl_3;
import celestial.ho_3;
import celestial.rVL;
import celestial.rYG;
import celestial.rYl_1;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rlE_2;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rrEr_1;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class UQ
implements Consumer<Consumer<OT>> {
    private static final List<rqM_2<rYG>> id_class = ImmutableList.of(rYl_1.id_throw, rYl_1.id_private, rYl_1.id_catch, rYl_1.id_byte, rYl_1.id_super, rYl_1.id_float, rYl_1.id_char, rYl_1.id_short, rYl_1.id_throws, rYl_1.id_while, rYl_1.id_volatile, rYl_1.id_this, (Object[])new rqM_2[]{rYl_1.id_final, rYl_1.id_default, rYl_1.id_static, rYl_1.id_break, rYl_1.id_native, rYl_1.id_long, rYl_1.id_try, rYl_1.id_return, rYl_1.id_public, rYl_1.id_int, rYl_1.id_protected, rYl_1.id_continue, rYl_1.id_synchronized, rYl_1.id_new, rYl_1.id_import, rYl_1.id_abstract, rYl_1.id_const, rYl_1.id_interface, rYl_1.id_case, rYl_1.id_instanceof, rYl_1.id_package, rYl_1.id_void, rYl_1.id_double, rYl_1.id_switch, rYl_1.r, rYl_1.B, rYl_1.S, rYl_1.s, rYl_1.A, rYl_1.n});
    private static final aI_2<?>[] id_break = new aI_2[]{aI_2.id_case, aI_2.id_implements, aI_2.id_volatile, aI_2.id_new, aI_2.id_continue, aI_2.id_this, aI_2.id_else, aI_2.id_synchronized, aI_2.id_return, aI_2.id_interface, aI_2.id_abstract, aI_2.id_long, aI_2.id_void, aI_2.id_double, aI_2.J, aI_2.d, aI_2.k, aI_2.W, aI_2.u, aI_2.v, aI_2.L, aI_2.A, aI_2.C, aI_2.q, aI_2.t, aI_2.K, aI_2.U, aI_2.a, aI_2.rr, aI_2.i, aI_2.rS, aI_2.rG, aI_2.rs, aI_2.rb};

    protected static Ot_1 id_class(Ot_1 ot_1, List<rqM_2<rYG>> list) {
        for (rqM_2<rYG> rqM_22 : list) {
            ot_1.id_class(rqM_22.id_class().toString(), XK.id_class(XN.id_class(rqM_22)));
        }
        return ot_1;
    }

    public void id_class(Consumer<OT> consumer) {
        OT oT = Ot_1.id_class().id_class(rdy_3.dM, (rgP_2)new rgn_3("advancements.adventure.root.title"), (rgP_2)new rgn_3("advancements.adventure.root.description"), new rqO_2("textures/gui/advancements/backgrounds/adventure.png"), Oe_1.TASK, false, false, false).id_class(hS_2.id_break).id_class("killed_something", Xk_1.id_break()).id_class("killed_by_something", Xk_1.id_protected()).id_class(consumer, "adventure/root");
        OT oT2 = Ot_1.id_class().id_class(oT).id_class(xu_3.R, (rgP_2)new rgn_3("advancements.adventure.sleep_in_bed.title"), (rgP_2)new rgn_3("advancements.adventure.sleep_in_bed.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("slept_in_bed", XK.id_break()).id_class(consumer, "adventure/sleep_in_bed");
        UQ.id_class(Ot_1.id_class(), id_class).id_class(oT2).id_class(rdy_3.hN, (rgP_2)new rgn_3("advancements.adventure.adventuring_time.title"), (rgP_2)new rgn_3("advancements.adventure.adventuring_time.description"), (rqO_2)null, Oe_1.CHALLENGE, true, true, false).id_class(OR.id_class(500)).id_class(consumer, "adventure/adventuring_time");
        OT oT3 = Ot_1.id_class().id_class(oT).id_class(rdy_3.dP, (rgP_2)new rgn_3("advancements.adventure.trade.title"), (rgP_2)new rgn_3("advancements.adventure.trade.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("traded", JZ.id_break()).id_class(consumer, "adventure/trade");
        OT oT4 = this.id_class(Ot_1.id_class()).id_class(oT).id_class(rdy_3.Oy, (rgP_2)new rgn_3("advancements.adventure.kill_a_mob.title"), (rgP_2)new rgn_3("advancements.adventure.kill_a_mob.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class(hS_2.id_break).id_class(consumer, "adventure/kill_a_mob");
        this.id_class(Ot_1.id_class()).id_class(oT4).id_class(rdy_3.Ow, (rgP_2)new rgn_3("advancements.adventure.kill_all_mobs.title"), (rgP_2)new rgn_3("advancements.adventure.kill_all_mobs.description"), (rqO_2)null, Oe_1.CHALLENGE, true, true, false).id_class(OR.id_class(100)).id_class(consumer, "adventure/kill_all_mobs");
        OT oT5 = Ot_1.id_class().id_class(oT4).id_class(rdy_3.OM, (rgP_2)new rgn_3("advancements.adventure.shoot_arrow.title"), (rgP_2)new rgn_3("advancements.adventure.shoot_arrow.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("shot_arrow", Xf_1.id_class(hA_2.id_class().id_class(hC_2.id_class().id_class(true).id_class(hK_2.id_class().id_class(rlE_2.id_throws))))).id_class(consumer, "adventure/shoot_arrow");
        OT oT6 = Ot_1.id_class().id_class(oT4).id_class(rdy_3.kY, (rgP_2)new rgn_3("advancements.adventure.throw_trident.title"), (rgP_2)new rgn_3("advancements.adventure.throw_trident.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("shot_trident", Xf_1.id_class(hA_2.id_class().id_class(hC_2.id_class().id_class(true).id_class(hK_2.id_class().id_class(aI_2.g))))).id_class(consumer, "adventure/throw_trident");
        Ot_1.id_class().id_class(oT6).id_class(rdy_3.kY, (rgP_2)new rgn_3("advancements.adventure.very_very_frightening.title"), (rgP_2)new rgn_3("advancements.adventure.very_very_frightening.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("struck_villager", hQ_2.id_class(hK_2.id_class().id_class(aI_2.D).id_break())).id_class(consumer, "adventure/very_very_frightening");
        Ot_1.id_class().id_class(oT3).id_class(xu_3.Br, (rgP_2)new rgn_3("advancements.adventure.summon_iron_golem.title"), (rgP_2)new rgn_3("advancements.adventure.summon_iron_golem.description"), (rqO_2)null, Oe_1.GOAL, true, true, false).id_class("summoned_golem", JO.id_class(hK_2.id_class().id_class(aI_2.id_import))).id_class(consumer, "adventure/summon_iron_golem");
        Ot_1.id_class().id_class(oT5).id_class(rdy_3.OO, (rgP_2)new rgn_3("advancements.adventure.sniper_duel.title"), (rgP_2)new rgn_3("advancements.adventure.sniper_duel.description"), (rqO_2)null, Oe_1.CHALLENGE, true, true, false).id_class(OR.id_class(50)).id_class("killed_skeleton", Xk_1.id_class(hK_2.id_class().id_class(aI_2.A).id_class(hl_3.id_class(Xm_1.id_class(50.0f))), hC_2.id_class().id_class(true))).id_class(consumer, "adventure/sniper_duel");
        Ot_1.id_class().id_class(oT4).id_class(rdy_3.kL, (rgP_2)new rgn_3("advancements.adventure.totem_of_undying.title"), (rgP_2)new rgn_3("advancements.adventure.totem_of_undying.description"), (rqO_2)null, Oe_1.GOAL, true, true, false).id_class("used_totem", Ju_1.id_class(rdy_3.kL)).id_class(consumer, "adventure/totem_of_undying");
        OT oT7 = Ot_1.id_class().id_class(oT).id_class(rdy_3.kU, (rgP_2)new rgn_3("advancements.adventure.ol_betsy.title"), (rgP_2)new rgn_3("advancements.adventure.ol_betsy.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("shot_crossbow", Jr_1.id_class(rdy_3.kU)).id_class(consumer, "adventure/ol_betsy");
        Ot_1.id_class().id_class(oT7).id_class(rdy_3.kU, (rgP_2)new rgn_3("advancements.adventure.whos_the_pillager_now.title"), (rgP_2)new rgn_3("advancements.adventure.whos_the_pillager_now.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("kill_pillager", Xx_1.id_class(hK_2.id_class().id_class(aI_2.W))).id_class(consumer, "adventure/whos_the_pillager_now");
        Ot_1.id_class().id_class(oT7).id_class(rdy_3.kU, (rgP_2)new rgn_3("advancements.adventure.two_birds_one_arrow.title"), (rgP_2)new rgn_3("advancements.adventure.two_birds_one_arrow.description"), (rqO_2)null, Oe_1.CHALLENGE, true, true, false).id_class(OR.id_class(65)).id_class("two_birds", Xx_1.id_class(hK_2.id_class().id_class(aI_2.J), hK_2.id_class().id_class(aI_2.J))).id_class(consumer, "adventure/two_birds_one_arrow");
        Ot_1.id_class().id_class(oT7).id_class(rdy_3.kU, (rgP_2)new rgn_3("advancements.adventure.arbalistic.title"), (rgP_2)new rgn_3("advancements.adventure.arbalistic.description"), (rqO_2)null, Oe_1.CHALLENGE, true, true, true).id_class(OR.id_class(85)).id_class("arbalistic", Xx_1.id_class(XF.id_class(5))).id_class(consumer, "adventure/arbalistic");
        OT oT8 = Ot_1.id_class().id_class(oT).id_class(rrEr_1.id_new(), (rgP_2)new rgn_3("advancements.adventure.voluntary_exile.title"), (rgP_2)new rgn_3("advancements.adventure.voluntary_exile.description"), (rqO_2)null, Oe_1.TASK, true, true, true).id_class("voluntary_exile", Xk_1.id_class(hK_2.id_class().id_class(rlE_2.id_byte).id_class(hI_2.id_break))).id_class(consumer, "adventure/voluntary_exile");
        Ot_1.id_class().id_class(oT8).id_class(rrEr_1.id_new(), (rgP_2)new rgn_3("advancements.adventure.hero_of_the_village.title"), (rgP_2)new rgn_3("advancements.adventure.hero_of_the_village.description"), (rqO_2)null, Oe_1.CHALLENGE, true, true, true).id_class(OR.id_class(100)).id_class("hero_of_the_village", XK.id_protected()).id_class(consumer, "adventure/hero_of_the_village");
        Ot_1.id_class().id_class(oT).id_class(xu_3.Jh.id_case(), (rgP_2)new rgn_3("advancements.adventure.honey_block_slide.title"), (rgP_2)new rgn_3("advancements.adventure.honey_block_slide.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("honey_block_slide", JB.id_class(xu_3.Jh)).id_class(consumer, "adventure/honey_block_slide");
        Ot_1.id_class().id_class(oT5).id_class(xu_3.Jb.id_case(), (rgP_2)new rgn_3("advancements.adventure.bullseye.title"), (rgP_2)new rgn_3("advancements.adventure.bullseye.description"), (rqO_2)null, Oe_1.CHALLENGE, true, true, false).id_class(OR.id_class(50)).id_class("bullseye", Jx_1.id_class(XF.id_class(15), ho_3.id_class(hK_2.id_class().id_class(hl_3.id_class(Xm_1.id_class(30.0f))).id_break()))).id_class(consumer, "adventure/bullseye");
    }

    private Ot_1 id_class(Ot_1 ot_1) {
        for (aI_2<?> aI_22 : id_break) {
            ot_1.id_class(rVL.id_transient.id_break(aI_22).toString(), Xk_1.id_class(hK_2.id_class().id_class(aI_22)));
        }
        return ot_1;
    }

    @Override
    public /* synthetic */ void accept(Object object) {
        this.id_class((Consumer)object);
    }
}

