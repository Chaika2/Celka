package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class UQ implements Consumer<Consumer<OT>> {
   private static final List<rqM_2<rYG>> id_class = ImmutableList.of(
      rYl_1.id_throw,
      rYl_1.id_private,
      rYl_1.id_catch,
      rYl_1.id_byte,
      rYl_1.id_super,
      rYl_1.id_float,
      rYl_1.id_char,
      rYl_1.id_short,
      rYl_1.id_throws,
      rYl_1.id_while,
      rYl_1.id_volatile,
      rYl_1.id_this,
      new rqM_2[]{
         rYl_1.id_final,
         rYl_1.id_default,
         rYl_1.id_static,
         rYl_1.id_break,
         rYl_1.id_native,
         rYl_1.id_long,
         rYl_1.id_try,
         rYl_1.id_return,
         rYl_1.id_public,
         rYl_1.id_int,
         rYl_1.id_protected,
         rYl_1.id_continue,
         rYl_1.id_synchronized,
         rYl_1.id_new,
         rYl_1.id_import,
         rYl_1.id_abstract,
         rYl_1.id_const,
         rYl_1.id_interface,
         rYl_1.id_case,
         rYl_1.id_instanceof,
         rYl_1.id_package,
         rYl_1.id_void,
         rYl_1.id_double,
         rYl_1.id_switch,
         rYl_1.r,
         rYl_1.B,
         rYl_1.S,
         rYl_1.s,
         rYl_1.A,
         rYl_1.n
      }
   );
   private static final aI_2<?>[] id_break = new aI_2[]{
      aI_2.id_case,
      aI_2.id_implements,
      aI_2.id_volatile,
      aI_2.id_new,
      aI_2.id_continue,
      aI_2.id_this,
      aI_2.id_else,
      aI_2.id_synchronized,
      aI_2.id_return,
      aI_2.id_interface,
      aI_2.id_abstract,
      aI_2.id_long,
      aI_2.id_void,
      aI_2.id_double,
      aI_2.J,
      aI_2.d,
      aI_2.k,
      aI_2.W,
      aI_2.u,
      aI_2.v,
      aI_2.L,
      aI_2.A,
      aI_2.C,
      aI_2.q,
      aI_2.t,
      aI_2.K,
      aI_2.U,
      aI_2.a,
      aI_2.rr,
      aI_2.i,
      aI_2.rS,
      aI_2.rG,
      aI_2.rs,
      aI_2.rb
   };

   protected static Ot_1 id_class(Ot_1 var0, List<rqM_2<rYG>> var1) {
      for (rqM_2 var3 : var1) {
         var0.id_class(var3.id_class().toString(), XK.id_class(XN.id_class(var3)));
      }

      return var0;
   }

   public void id_class(Consumer<OT> var1) {
      OT var2 = Ot_1.id_class()
         .id_class(
            rdy_3.dM,
            new rgn_3("advancements.adventure.root.title"),
            new rgn_3("advancements.adventure.root.description"),
            new rqO_2("textures/gui/advancements/backgrounds/adventure.png"),
            Oe_1.TASK,
            false,
            false,
            false
         )
         .id_class(hS_2.id_break)
         .id_class("killed_something", Xk_1.id_break())
         .id_class("killed_by_something", Xk_1.id_protected())
         .id_class(var1, "adventure/root");
      OT var3 = Ot_1.id_class()
         .id_class(var2)
         .id_class(
            xu_3.R,
            new rgn_3("advancements.adventure.sleep_in_bed.title"),
            new rgn_3("advancements.adventure.sleep_in_bed.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class("slept_in_bed", XK.id_break())
         .id_class(var1, "adventure/sleep_in_bed");
      id_class(Ot_1.id_class(), id_class)
         .id_class(var3)
         .id_class(
            rdy_3.hN,
            new rgn_3("advancements.adventure.adventuring_time.title"),
            new rgn_3("advancements.adventure.adventuring_time.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .id_class(OR.id_class(500))
         .id_class(var1, "adventure/adventuring_time");
      OT var4 = Ot_1.id_class()
         .id_class(var2)
         .id_class(
            rdy_3.dP,
            new rgn_3("advancements.adventure.trade.title"),
            new rgn_3("advancements.adventure.trade.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class("traded", JZ.id_break())
         .id_class(var1, "adventure/trade");
      OT var5 = this.id_class(Ot_1.id_class())
         .id_class(var2)
         .id_class(
            rdy_3.Oy,
            new rgn_3("advancements.adventure.kill_a_mob.title"),
            new rgn_3("advancements.adventure.kill_a_mob.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class(hS_2.id_break)
         .id_class(var1, "adventure/kill_a_mob");
      this.id_class(Ot_1.id_class())
         .id_class(var5)
         .id_class(
            rdy_3.Ow,
            new rgn_3("advancements.adventure.kill_all_mobs.title"),
            new rgn_3("advancements.adventure.kill_all_mobs.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .id_class(OR.id_class(100))
         .id_class(var1, "adventure/kill_all_mobs");
      OT var6 = Ot_1.id_class()
         .id_class(var5)
         .id_class(
            rdy_3.OM,
            new rgn_3("advancements.adventure.shoot_arrow.title"),
            new rgn_3("advancements.adventure.shoot_arrow.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class("shot_arrow", Xf_1.id_class(hA_2.id_class().id_class(hC_2.id_class().id_class(true).id_class(hK_2.id_class().id_class(rlE_2.id_throws)))))
         .id_class(var1, "adventure/shoot_arrow");
      OT var7 = Ot_1.id_class()
         .id_class(var5)
         .id_class(
            rdy_3.kY,
            new rgn_3("advancements.adventure.throw_trident.title"),
            new rgn_3("advancements.adventure.throw_trident.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class("shot_trident", Xf_1.id_class(hA_2.id_class().id_class(hC_2.id_class().id_class(true).id_class(hK_2.id_class().id_class(aI_2.g)))))
         .id_class(var1, "adventure/throw_trident");
      Ot_1.id_class()
         .id_class(var7)
         .id_class(
            rdy_3.kY,
            new rgn_3("advancements.adventure.very_very_frightening.title"),
            new rgn_3("advancements.adventure.very_very_frightening.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class("struck_villager", hQ_2.id_class(hK_2.id_class().id_class(aI_2.D).id_break()))
         .id_class(var1, "adventure/very_very_frightening");
      Ot_1.id_class()
         .id_class(var4)
         .id_class(
            xu_3.Br,
            new rgn_3("advancements.adventure.summon_iron_golem.title"),
            new rgn_3("advancements.adventure.summon_iron_golem.description"),
            (rqO_2)null,
            Oe_1.GOAL,
            true,
            true,
            false
         )
         .id_class("summoned_golem", JO.id_class(hK_2.id_class().id_class(aI_2.id_import)))
         .id_class(var1, "adventure/summon_iron_golem");
      Ot_1.id_class()
         .id_class(var6)
         .id_class(
            rdy_3.OO,
            new rgn_3("advancements.adventure.sniper_duel.title"),
            new rgn_3("advancements.adventure.sniper_duel.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .id_class(OR.id_class(50))
         .id_class(
            "killed_skeleton", Xk_1.id_class(hK_2.id_class().id_class(aI_2.A).id_class(hl_3.id_class(Xm_1.id_class(50.0F))), hC_2.id_class().id_class(true))
         )
         .id_class(var1, "adventure/sniper_duel");
      Ot_1.id_class()
         .id_class(var5)
         .id_class(
            rdy_3.kL,
            new rgn_3("advancements.adventure.totem_of_undying.title"),
            new rgn_3("advancements.adventure.totem_of_undying.description"),
            (rqO_2)null,
            Oe_1.GOAL,
            true,
            true,
            false
         )
         .id_class("used_totem", Ju_1.id_class(rdy_3.kL))
         .id_class(var1, "adventure/totem_of_undying");
      OT var8 = Ot_1.id_class()
         .id_class(var2)
         .id_class(
            rdy_3.kU,
            new rgn_3("advancements.adventure.ol_betsy.title"),
            new rgn_3("advancements.adventure.ol_betsy.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class("shot_crossbow", Jr_1.id_class(rdy_3.kU))
         .id_class(var1, "adventure/ol_betsy");
      Ot_1.id_class()
         .id_class(var8)
         .id_class(
            rdy_3.kU,
            new rgn_3("advancements.adventure.whos_the_pillager_now.title"),
            new rgn_3("advancements.adventure.whos_the_pillager_now.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class("kill_pillager", Xx_1.id_class(hK_2.id_class().id_class(aI_2.W)))
         .id_class(var1, "adventure/whos_the_pillager_now");
      Ot_1.id_class()
         .id_class(var8)
         .id_class(
            rdy_3.kU,
            new rgn_3("advancements.adventure.two_birds_one_arrow.title"),
            new rgn_3("advancements.adventure.two_birds_one_arrow.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .id_class(OR.id_class(65))
         .id_class("two_birds", Xx_1.id_class(hK_2.id_class().id_class(aI_2.J), hK_2.id_class().id_class(aI_2.J)))
         .id_class(var1, "adventure/two_birds_one_arrow");
      Ot_1.id_class()
         .id_class(var8)
         .id_class(
            rdy_3.kU,
            new rgn_3("advancements.adventure.arbalistic.title"),
            new rgn_3("advancements.adventure.arbalistic.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            true
         )
         .id_class(OR.id_class(85))
         .id_class("arbalistic", Xx_1.id_class(XF.id_class(5)))
         .id_class(var1, "adventure/arbalistic");
      OT var9 = Ot_1.id_class()
         .id_class(var2)
         .id_class(
            rrEr_1.id_new(),
            new rgn_3("advancements.adventure.voluntary_exile.title"),
            new rgn_3("advancements.adventure.voluntary_exile.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            true
         )
         .id_class("voluntary_exile", Xk_1.id_class(hK_2.id_class().id_class(rlE_2.id_byte).id_class(hI_2.id_break)))
         .id_class(var1, "adventure/voluntary_exile");
      Ot_1.id_class()
         .id_class(var9)
         .id_class(
            rrEr_1.id_new(),
            new rgn_3("advancements.adventure.hero_of_the_village.title"),
            new rgn_3("advancements.adventure.hero_of_the_village.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            true
         )
         .id_class(OR.id_class(100))
         .id_class("hero_of_the_village", XK.id_protected())
         .id_class(var1, "adventure/hero_of_the_village");
      Ot_1.id_class()
         .id_class(var2)
         .id_class(
            xu_3.Jh.id_case(),
            new rgn_3("advancements.adventure.honey_block_slide.title"),
            new rgn_3("advancements.adventure.honey_block_slide.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class("honey_block_slide", JB.id_class(xu_3.Jh))
         .id_class(var1, "adventure/honey_block_slide");
      Ot_1.id_class()
         .id_class(var6)
         .id_class(
            xu_3.Jb.id_case(),
            new rgn_3("advancements.adventure.bullseye.title"),
            new rgn_3("advancements.adventure.bullseye.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .id_class(OR.id_class(50))
         .id_class("bullseye", Jx_1.id_class(XF.id_class(15), ho_3.id_class(hK_2.id_class().id_class(hl_3.id_class(Xm_1.id_class(30.0F))).id_break())))
         .id_class(var1, "adventure/bullseye");
   }

   private Ot_1 id_class(Ot_1 var1) {
      for (aI_2 var5 : id_break) {
         var1.id_class(rVL.id_transient.id_break(var5).toString(), Xk_1.id_class(hK_2.id_class().id_class(var5)));
      }

      return var1;
   }
}
