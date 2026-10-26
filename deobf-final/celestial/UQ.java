package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class UQ implements Consumer<Consumer<OT>> {
   private static final List<rqM_2<rYG>> class_ = ImmutableList.of(
      rYl_1.throw_,
      rYl_1.private_,
      rYl_1.catch_,
      rYl_1.byte_,
      rYl_1.super_,
      rYl_1.float_,
      rYl_1.char_,
      rYl_1.short_,
      rYl_1.throws_,
      rYl_1.while_,
      rYl_1.volatile_,
      rYl_1.this_,
      new rqM_2[]{
         rYl_1.final_,
         rYl_1.default_,
         rYl_1.static_,
         rYl_1.break_,
         rYl_1.native_,
         rYl_1.long_,
         rYl_1.try_,
         rYl_1.return_,
         rYl_1.public_,
         rYl_1.int_,
         rYl_1.protected_,
         rYl_1.continue_,
         rYl_1.synchronized_,
         rYl_1.new_,
         rYl_1.import_,
         rYl_1.abstract_,
         rYl_1.const_,
         rYl_1.interface_,
         rYl_1.case_,
         rYl_1.instanceof_,
         rYl_1.package_,
         rYl_1.void_,
         rYl_1.double_,
         rYl_1.switch_,
         rYl_1.r,
         rYl_1.B,
         rYl_1.S,
         rYl_1.s,
         rYl_1.A,
         rYl_1.n
      }
   );
   private static final aI_2<?>[] break_ = new aI_2[]{
      aI_2.case_,
      aI_2.implements_,
      aI_2.volatile_,
      aI_2.new_,
      aI_2.continue_,
      aI_2.this_,
      aI_2.else_,
      aI_2.synchronized_,
      aI_2.return_,
      aI_2.interface_,
      aI_2.abstract_,
      aI_2.long_,
      aI_2.void_,
      aI_2.double_,
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

   protected static Ot_1 class_(Ot_1 var0, List<rqM_2<rYG>> var1) {
      for (rqM_2 var3 : var1) {
         var0.class_(var3.class_().toString(), XK.class_(XN.class_(var3)));
      }

      return var0;
   }

   public void class_(Consumer<OT> var1) {
      OT var2 = Ot_1.class_()
         .class_(
            rdy_3.dM,
            new rgn_3("advancements.adventure.root.title"),
            new rgn_3("advancements.adventure.root.description"),
            new rqO_2("textures/gui/advancements/backgrounds/adventure.png"),
            Oe_1.TASK,
            false,
            false,
            false
         )
         .class_(hS_2.break_)
         .class_("killed_something", Xk_1.break_())
         .class_("killed_by_something", Xk_1.protected_())
         .class_(var1, "adventure/root");
      OT var3 = Ot_1.class_()
         .class_(var2)
         .class_(
            xu_3.R,
            new rgn_3("advancements.adventure.sleep_in_bed.title"),
            new rgn_3("advancements.adventure.sleep_in_bed.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("slept_in_bed", XK.break_())
         .class_(var1, "adventure/sleep_in_bed");
      class_(Ot_1.class_(), class_)
         .class_(var3)
         .class_(
            rdy_3.hN,
            new rgn_3("advancements.adventure.adventuring_time.title"),
            new rgn_3("advancements.adventure.adventuring_time.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(500))
         .class_(var1, "adventure/adventuring_time");
      OT var4 = Ot_1.class_()
         .class_(var2)
         .class_(
            rdy_3.dP,
            new rgn_3("advancements.adventure.trade.title"),
            new rgn_3("advancements.adventure.trade.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("traded", JZ.break_())
         .class_(var1, "adventure/trade");
      OT var5 = this.class_(Ot_1.class_())
         .class_(var2)
         .class_(
            rdy_3.Oy,
            new rgn_3("advancements.adventure.kill_a_mob.title"),
            new rgn_3("advancements.adventure.kill_a_mob.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_(hS_2.break_)
         .class_(var1, "adventure/kill_a_mob");
      this.class_(Ot_1.class_())
         .class_(var5)
         .class_(
            rdy_3.Ow,
            new rgn_3("advancements.adventure.kill_all_mobs.title"),
            new rgn_3("advancements.adventure.kill_all_mobs.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(100))
         .class_(var1, "adventure/kill_all_mobs");
      OT var6 = Ot_1.class_()
         .class_(var5)
         .class_(
            rdy_3.OM,
            new rgn_3("advancements.adventure.shoot_arrow.title"),
            new rgn_3("advancements.adventure.shoot_arrow.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("shot_arrow", Xf_1.class_(hA_2.class_().class_(hC_2.class_().class_(true).class_(hK_2.class_().class_(rlE_2.throws_)))))
         .class_(var1, "adventure/shoot_arrow");
      OT var7 = Ot_1.class_()
         .class_(var5)
         .class_(
            rdy_3.kY,
            new rgn_3("advancements.adventure.throw_trident.title"),
            new rgn_3("advancements.adventure.throw_trident.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("shot_trident", Xf_1.class_(hA_2.class_().class_(hC_2.class_().class_(true).class_(hK_2.class_().class_(aI_2.g)))))
         .class_(var1, "adventure/throw_trident");
      Ot_1.class_()
         .class_(var7)
         .class_(
            rdy_3.kY,
            new rgn_3("advancements.adventure.very_very_frightening.title"),
            new rgn_3("advancements.adventure.very_very_frightening.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("struck_villager", hQ_2.class_(hK_2.class_().class_(aI_2.D).break_()))
         .class_(var1, "adventure/very_very_frightening");
      Ot_1.class_()
         .class_(var4)
         .class_(
            xu_3.Br,
            new rgn_3("advancements.adventure.summon_iron_golem.title"),
            new rgn_3("advancements.adventure.summon_iron_golem.description"),
            (rqO_2)null,
            Oe_1.GOAL,
            true,
            true,
            false
         )
         .class_("summoned_golem", JO.class_(hK_2.class_().class_(aI_2.import_)))
         .class_(var1, "adventure/summon_iron_golem");
      Ot_1.class_()
         .class_(var6)
         .class_(
            rdy_3.OO,
            new rgn_3("advancements.adventure.sniper_duel.title"),
            new rgn_3("advancements.adventure.sniper_duel.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(50))
         .class_("killed_skeleton", Xk_1.class_(hK_2.class_().class_(aI_2.A).class_(hl_3.class_(Xm_1.class_(50.0F))), hC_2.class_().class_(true)))
         .class_(var1, "adventure/sniper_duel");
      Ot_1.class_()
         .class_(var5)
         .class_(
            rdy_3.kL,
            new rgn_3("advancements.adventure.totem_of_undying.title"),
            new rgn_3("advancements.adventure.totem_of_undying.description"),
            (rqO_2)null,
            Oe_1.GOAL,
            true,
            true,
            false
         )
         .class_("used_totem", Ju_1.class_(rdy_3.kL))
         .class_(var1, "adventure/totem_of_undying");
      OT var8 = Ot_1.class_()
         .class_(var2)
         .class_(
            rdy_3.kU,
            new rgn_3("advancements.adventure.ol_betsy.title"),
            new rgn_3("advancements.adventure.ol_betsy.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("shot_crossbow", Jr_1.class_(rdy_3.kU))
         .class_(var1, "adventure/ol_betsy");
      Ot_1.class_()
         .class_(var8)
         .class_(
            rdy_3.kU,
            new rgn_3("advancements.adventure.whos_the_pillager_now.title"),
            new rgn_3("advancements.adventure.whos_the_pillager_now.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("kill_pillager", Xx_1.class_(hK_2.class_().class_(aI_2.W)))
         .class_(var1, "adventure/whos_the_pillager_now");
      Ot_1.class_()
         .class_(var8)
         .class_(
            rdy_3.kU,
            new rgn_3("advancements.adventure.two_birds_one_arrow.title"),
            new rgn_3("advancements.adventure.two_birds_one_arrow.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(65))
         .class_("two_birds", Xx_1.class_(hK_2.class_().class_(aI_2.J), hK_2.class_().class_(aI_2.J)))
         .class_(var1, "adventure/two_birds_one_arrow");
      Ot_1.class_()
         .class_(var8)
         .class_(
            rdy_3.kU,
            new rgn_3("advancements.adventure.arbalistic.title"),
            new rgn_3("advancements.adventure.arbalistic.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            true
         )
         .class_(OR.class_(85))
         .class_("arbalistic", Xx_1.class_(XF.class_(5)))
         .class_(var1, "adventure/arbalistic");
      OT var9 = Ot_1.class_()
         .class_(var2)
         .class_(
            rrEr_1.new_(),
            new rgn_3("advancements.adventure.voluntary_exile.title"),
            new rgn_3("advancements.adventure.voluntary_exile.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            true
         )
         .class_("voluntary_exile", Xk_1.class_(hK_2.class_().class_(rlE_2.byte_).class_(hI_2.break_)))
         .class_(var1, "adventure/voluntary_exile");
      Ot_1.class_()
         .class_(var9)
         .class_(
            rrEr_1.new_(),
            new rgn_3("advancements.adventure.hero_of_the_village.title"),
            new rgn_3("advancements.adventure.hero_of_the_village.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            true
         )
         .class_(OR.class_(100))
         .class_("hero_of_the_village", XK.protected_())
         .class_(var1, "adventure/hero_of_the_village");
      Ot_1.class_()
         .class_(var2)
         .class_(
            xu_3.Jh.case_(),
            new rgn_3("advancements.adventure.honey_block_slide.title"),
            new rgn_3("advancements.adventure.honey_block_slide.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("honey_block_slide", JB.class_(xu_3.Jh))
         .class_(var1, "adventure/honey_block_slide");
      Ot_1.class_()
         .class_(var6)
         .class_(
            xu_3.Jb.case_(),
            new rgn_3("advancements.adventure.bullseye.title"),
            new rgn_3("advancements.adventure.bullseye.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(50))
         .class_("bullseye", Jx_1.class_(XF.class_(15), ho_3.class_(hK_2.class_().class_(hl_3.class_(Xm_1.class_(30.0F))).break_())))
         .class_(var1, "adventure/bullseye");
   }

   private Ot_1 class_(Ot_1 var1) {
      for (aI_2 var5 : break_) {
         var1.class_(rVL.transient_.break_(var5).toString(), Xk_1.class_(hK_2.class_().class_(var5)));
      }

      return var1;
   }
}
