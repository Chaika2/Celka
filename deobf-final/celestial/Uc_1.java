package celestial;

import java.util.function.Consumer;

public class Uc_1 implements Consumer<Consumer<OT>> {
   private static final aI_2<?>[] class_ = new aI_2[]{
      aI_2.float_,
      aI_2.package_,
      aI_2.G,
      aI_2.Z,
      aI_2.native_,
      aI_2.b,
      aI_2.x,
      aI_2.finally_,
      aI_2.rB,
      aI_2.M,
      aI_2.c,
      aI_2.transient_,
      aI_2.private_,
      aI_2.h,
      aI_2.throw_,
      aI_2.throws_,
      aI_2.long_,
      aI_2.w
   };
   private static final rdb_3[] break_ = new rdb_3[]{rdy_3.Xz, rdy_3.XN, rdy_3.Xc, rdy_3.XQ};
   private static final rdb_3[] byte_ = new rdb_3[]{rdy_3.XB, rdy_3.XS, rdy_3.Xr, rdy_3.XP};
   private static final rdb_3[] protected_ = new rdb_3[]{
      rdy_3.Ob,
      rdy_3.Oe,
      rdy_3.hS,
      rdy_3.hC,
      rdy_3.hl,
      rdy_3.hy,
      rdy_3.hp,
      rdy_3.Xz,
      rdy_3.XQ,
      rdy_3.XN,
      rdy_3.Xc,
      rdy_3.Xu,
      rdy_3.Xm,
      rdy_3.Jh,
      rdy_3.Jx,
      rdy_3.Jz,
      rdy_3.JQ,
      rdy_3.JN,
      rdy_3.Jc,
      rdy_3.Ju,
      rdy_3.JC,
      rdy_3.ds,
      rdy_3.dE,
      rdy_3.dG,
      rdy_3.db,
      rdy_3.dO,
      rdy_3.dN,
      rdy_3.dC,
      rdy_3.dl,
      rdy_3.dH,
      rdy_3.dg,
      rdy_3.dR,
      rdy_3.kO,
      rdy_3.kX,
      rdy_3.kx,
      rdy_3.Jd,
      rdy_3.ke,
      rdy_3.WQ,
      rdy_3.WF
   };

   private Ot_1 byte_(Ot_1 var1) {
      for (rdb_3 var5 : byte_) {
         var1.class_(rVL.for_.break_(var5).break_(), Xr_1.class_(XX.class_().class_(var5).break_()));
      }

      return var1;
   }

   public void class_(Consumer<OT> var1) {
      OT var2 = Ot_1.class_()
         .class_(
            xu_3.Ey,
            new rgn_3("advancements.husbandry.root.title"),
            new rgn_3("advancements.husbandry.root.description"),
            new rqO_2("textures/gui/advancements/backgrounds/husbandry.png"),
            Oe_1.TASK,
            false,
            false,
            false
         )
         .class_("consumed_item", hm_3.break_())
         .class_(var1, "husbandry/root");
      OT var3 = Ot_1.class_()
         .class_(var2)
         .class_(
            rdy_3.hB,
            new rgn_3("advancements.husbandry.plant_seed.title"),
            new rgn_3("advancements.husbandry.plant_seed.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_(hS_2.break_)
         .class_("wheat", Xp_1.class_(xu_3.PB))
         .class_("pumpkin_stem", Xp_1.class_(xu_3.Bo))
         .class_("melon_stem", Xp_1.class_(xu_3.BK))
         .class_("beetroots", Xp_1.class_(xu_3.bT))
         .class_("nether_wart", Xp_1.class_(xu_3.Ss))
         .class_(var1, "husbandry/plant_seed");
      OT var4 = Ot_1.class_()
         .class_(var2)
         .class_(
            rdy_3.hB,
            new rgn_3("advancements.husbandry.breed_an_animal.title"),
            new rgn_3("advancements.husbandry.breed_an_animal.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_(hS_2.break_)
         .class_("bred", hJ_2.break_())
         .class_(var1, "husbandry/breed_an_animal");
      this.class_(Ot_1.class_())
         .class_(var3)
         .class_(
            rdy_3.Ob,
            new rgn_3("advancements.husbandry.balanced_diet.title"),
            new rgn_3("advancements.husbandry.balanced_diet.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(100))
         .class_(var1, "husbandry/balanced_diet");
      Ot_1.class_()
         .class_(var3)
         .class_(
            rdy_3.OK,
            new rgn_3("advancements.husbandry.netherite_hoe.title"),
            new rgn_3("advancements.husbandry.netherite_hoe.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(100))
         .class_("netherite_hoe", Xb_1.class_(rdy_3.OK))
         .class_(var1, "husbandry/obtain_netherite_hoe");
      OT var5 = Ot_1.class_()
         .class_(var2)
         .class_(
            rdy_3.df,
            new rgn_3("advancements.husbandry.tame_an_animal.title"),
            new rgn_3("advancements.husbandry.tame_an_animal.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("tamed_animal", JX.break_())
         .class_(var1, "husbandry/tame_an_animal");
      this.break_(Ot_1.class_())
         .class_(var4)
         .class_(
            rdy_3.dO,
            new rgn_3("advancements.husbandry.breed_all_animals.title"),
            new rgn_3("advancements.husbandry.breed_all_animals.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(100))
         .class_(var1, "husbandry/bred_all_animals");
      OT var6 = this.protected_(Ot_1.class_())
         .class_(var2)
         .class_(hS_2.break_)
         .class_(
            rdy_3.Xd,
            new rgn_3("advancements.husbandry.fishy_business.title"),
            new rgn_3("advancements.husbandry.fishy_business.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_(var1, "husbandry/fishy_business");
      this.byte_(Ot_1.class_())
         .class_(var6)
         .class_(hS_2.break_)
         .class_(
            rdy_3.Xr,
            new rgn_3("advancements.husbandry.tactical_fishing.title"),
            new rgn_3("advancements.husbandry.tactical_fishing.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_(var1, "husbandry/tactical_fishing");
      this.throws_(Ot_1.class_())
         .class_(var5)
         .class_(
            rdy_3.Xz,
            new rgn_3("advancements.husbandry.complete_catalogue.title"),
            new rgn_3("advancements.husbandry.complete_catalogue.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(50))
         .class_(var1, "husbandry/complete_catalogue");
      Ot_1.class_()
         .class_(var2)
         .class_("safely_harvest_honey", Xa_1.class_(Xc_1.class_().class_(hh_3.class_().class_(rls_3.k).break_()).class_(true), XX.class_().class_(rdy_3.Jn)))
         .class_(
            rdy_3.WF,
            new rgn_3("advancements.husbandry.safely_harvest_honey.title"),
            new rgn_3("advancements.husbandry.safely_harvest_honey.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_(var1, "husbandry/safely_harvest_honey");
      Ot_1.class_()
         .class_(var2)
         .class_("silk_touch_nest", hM_2.class_(xu_3.JM, XX.class_().class_(new hT_2(eY_2.else_, XF.break_(1))), XF.class_(3)))
         .class_(
            xu_3.JM,
            new rgn_3("advancements.husbandry.silk_touch_nest.title"),
            new rgn_3("advancements.husbandry.silk_touch_nest.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_(var1, "husbandry/silk_touch_nest");
   }

   private Ot_1 class_(Ot_1 var1) {
      for (rdb_3 var5 : protected_) {
         var1.class_(rVL.for_.break_(var5).break_(), hm_3.class_(var5));
      }

      return var1;
   }

   private Ot_1 break_(Ot_1 var1) {
      for (aI_2 var5 : class_) {
         var1.class_(aI_2.class_(var5).toString(), hJ_2.class_(hK_2.class_().class_(var5)));
      }

      var1.class_(aI_2.class_(aI_2.o).toString(), hJ_2.class_(hK_2.class_().class_(aI_2.o).break_(), hK_2.class_().class_(aI_2.o).break_(), hY_2.class_));
      return var1;
   }

   private Ot_1 throws_(Ot_1 var1) {
      rbf_3.super_.forEach((var1x, var2) -> var1.class_(var2.break_(), JX.class_(hK_2.class_().class_(var2).break_())));
      return var1;
   }

   private Ot_1 protected_(Ot_1 var1) {
      for (rdb_3 var5 : break_) {
         var1.class_(rVL.for_.break_(var5).break_(), XB.class_(Xh_1.class_, hY_2.class_, XX.class_().class_(var5).break_()));
      }

      return var1;
   }
}
