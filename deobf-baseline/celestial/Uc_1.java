package celestial;

import java.util.function.Consumer;

public class Uc_1 implements Consumer<Consumer<OT>> {
   private static final aI_2<?>[] id_class = new aI_2[]{
      aI_2.id_float,
      aI_2.id_package,
      aI_2.G,
      aI_2.Z,
      aI_2.id_native,
      aI_2.b,
      aI_2.x,
      aI_2.id_finally,
      aI_2.rB,
      aI_2.M,
      aI_2.c,
      aI_2.id_transient,
      aI_2.id_private,
      aI_2.h,
      aI_2.id_throw,
      aI_2.id_throws,
      aI_2.id_long,
      aI_2.w
   };
   private static final rdb_3[] id_break = new rdb_3[]{rdy_3.Xz, rdy_3.XN, rdy_3.Xc, rdy_3.XQ};
   private static final rdb_3[] id_byte = new rdb_3[]{rdy_3.XB, rdy_3.XS, rdy_3.Xr, rdy_3.XP};
   private static final rdb_3[] id_protected = new rdb_3[]{
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

   private Ot_1 id_byte(Ot_1 var1) {
      for (rdb_3 var5 : id_byte) {
         var1.id_class(rVL.id_for.id_break(var5).id_break(), Xr_1.id_class(XX.id_class().id_class(var5).id_break()));
      }

      return var1;
   }

   public void id_class(Consumer<OT> var1) {
      OT var2 = Ot_1.id_class()
         .id_class(
            xu_3.Ey,
            new rgn_3("advancements.husbandry.root.title"),
            new rgn_3("advancements.husbandry.root.description"),
            new rqO_2("textures/gui/advancements/backgrounds/husbandry.png"),
            Oe_1.TASK,
            false,
            false,
            false
         )
         .id_class("consumed_item", hm_3.id_break())
         .id_class(var1, "husbandry/root");
      OT var3 = Ot_1.id_class()
         .id_class(var2)
         .id_class(
            rdy_3.hB,
            new rgn_3("advancements.husbandry.plant_seed.title"),
            new rgn_3("advancements.husbandry.plant_seed.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class(hS_2.id_break)
         .id_class("wheat", Xp_1.id_class(xu_3.PB))
         .id_class("pumpkin_stem", Xp_1.id_class(xu_3.Bo))
         .id_class("melon_stem", Xp_1.id_class(xu_3.BK))
         .id_class("beetroots", Xp_1.id_class(xu_3.bT))
         .id_class("nether_wart", Xp_1.id_class(xu_3.Ss))
         .id_class(var1, "husbandry/plant_seed");
      OT var4 = Ot_1.id_class()
         .id_class(var2)
         .id_class(
            rdy_3.hB,
            new rgn_3("advancements.husbandry.breed_an_animal.title"),
            new rgn_3("advancements.husbandry.breed_an_animal.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class(hS_2.id_break)
         .id_class("bred", hJ_2.id_break())
         .id_class(var1, "husbandry/breed_an_animal");
      this.id_class(Ot_1.id_class())
         .id_class(var3)
         .id_class(
            rdy_3.Ob,
            new rgn_3("advancements.husbandry.balanced_diet.title"),
            new rgn_3("advancements.husbandry.balanced_diet.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .id_class(OR.id_class(100))
         .id_class(var1, "husbandry/balanced_diet");
      Ot_1.id_class()
         .id_class(var3)
         .id_class(
            rdy_3.OK,
            new rgn_3("advancements.husbandry.netherite_hoe.title"),
            new rgn_3("advancements.husbandry.netherite_hoe.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .id_class(OR.id_class(100))
         .id_class("netherite_hoe", Xb_1.id_class(rdy_3.OK))
         .id_class(var1, "husbandry/obtain_netherite_hoe");
      OT var5 = Ot_1.id_class()
         .id_class(var2)
         .id_class(
            rdy_3.df,
            new rgn_3("advancements.husbandry.tame_an_animal.title"),
            new rgn_3("advancements.husbandry.tame_an_animal.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class("tamed_animal", JX.id_break())
         .id_class(var1, "husbandry/tame_an_animal");
      this.id_break(Ot_1.id_class())
         .id_class(var4)
         .id_class(
            rdy_3.dO,
            new rgn_3("advancements.husbandry.breed_all_animals.title"),
            new rgn_3("advancements.husbandry.breed_all_animals.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .id_class(OR.id_class(100))
         .id_class(var1, "husbandry/bred_all_animals");
      OT var6 = this.id_protected(Ot_1.id_class())
         .id_class(var2)
         .id_class(hS_2.id_break)
         .id_class(
            rdy_3.Xd,
            new rgn_3("advancements.husbandry.fishy_business.title"),
            new rgn_3("advancements.husbandry.fishy_business.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class(var1, "husbandry/fishy_business");
      this.id_byte(Ot_1.id_class())
         .id_class(var6)
         .id_class(hS_2.id_break)
         .id_class(
            rdy_3.Xr,
            new rgn_3("advancements.husbandry.tactical_fishing.title"),
            new rgn_3("advancements.husbandry.tactical_fishing.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class(var1, "husbandry/tactical_fishing");
      this.id_throws(Ot_1.id_class())
         .id_class(var5)
         .id_class(
            rdy_3.Xz,
            new rgn_3("advancements.husbandry.complete_catalogue.title"),
            new rgn_3("advancements.husbandry.complete_catalogue.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .id_class(OR.id_class(50))
         .id_class(var1, "husbandry/complete_catalogue");
      Ot_1.id_class()
         .id_class(var2)
         .id_class(
            "safely_harvest_honey",
            Xa_1.id_class(Xc_1.id_class().id_class(hh_3.id_class().id_class(rls_3.k).id_break()).id_class(true), XX.id_class().id_class(rdy_3.Jn))
         )
         .id_class(
            rdy_3.WF,
            new rgn_3("advancements.husbandry.safely_harvest_honey.title"),
            new rgn_3("advancements.husbandry.safely_harvest_honey.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class(var1, "husbandry/safely_harvest_honey");
      Ot_1.id_class()
         .id_class(var2)
         .id_class("silk_touch_nest", hM_2.id_class(xu_3.JM, XX.id_class().id_class(new hT_2(eY_2.id_else, XF.id_break(1))), XF.id_class(3)))
         .id_class(
            xu_3.JM,
            new rgn_3("advancements.husbandry.silk_touch_nest.title"),
            new rgn_3("advancements.husbandry.silk_touch_nest.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class(var1, "husbandry/silk_touch_nest");
   }

   private Ot_1 id_class(Ot_1 var1) {
      for (rdb_3 var5 : id_protected) {
         var1.id_class(rVL.id_for.id_break(var5).id_break(), hm_3.id_class(var5));
      }

      return var1;
   }

   private Ot_1 id_break(Ot_1 var1) {
      for (aI_2 var5 : id_class) {
         var1.id_class(aI_2.id_class(var5).toString(), hJ_2.id_class(hK_2.id_class().id_class(var5)));
      }

      var1.id_class(
         aI_2.id_class(aI_2.o).toString(),
         hJ_2.id_class(hK_2.id_class().id_class(aI_2.o).id_break(), hK_2.id_class().id_class(aI_2.o).id_break(), hY_2.id_class)
      );
      return var1;
   }

   private Ot_1 id_throws(Ot_1 var1) {
      rbf_3.id_super.forEach((var1x, var2) -> var1.id_class(var2.id_break(), JX.id_class(hK_2.id_class().id_class(var2).id_break())));
      return var1;
   }

   private Ot_1 id_protected(Ot_1 var1) {
      for (rdb_3 var5 : id_break) {
         var1.id_class(rVL.id_for.id_break(var5).id_break(), XB.id_class(Xh_1.id_class, hY_2.id_class, XX.id_class().id_class(var5).id_break()));
      }

      return var1;
   }
}
