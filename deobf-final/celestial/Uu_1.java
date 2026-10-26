package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class Uu_1 implements Consumer<Consumer<OT>> {
   private static final List<rqM_2<rYG>> class_ = ImmutableList.of(rYl_1.implements_, rYl_1.C, rYl_1.H, rYl_1.l, rYl_1.y);
   private static final ho_3 break_ = ho_3.class_(
      rQx_1.class_(rzB_2.THIS, hK_2.class_().class_(hf_3.class_().class_(XX.class_().class_(rdy_3.hc).break_()).break_())).class_().build(),
      rQx_1.class_(rzB_2.THIS, hK_2.class_().class_(hf_3.class_().break_(XX.class_().class_(rdy_3.hu).break_()).break_())).class_().build(),
      rQx_1.class_(rzB_2.THIS, hK_2.class_().class_(hf_3.class_().byte_(XX.class_().class_(rdy_3.hm).break_()).break_())).class_().build(),
      rQx_1.class_(rzB_2.THIS, hK_2.class_().class_(hf_3.class_().protected_(XX.class_().class_(rdy_3.hZ).break_()).break_())).class_().build()
   );

   public void class_(Consumer<OT> var1) {
      OT var2 = Ot_1.class_()
         .class_(
            xu_3.bR,
            new rgn_3("advancements.nether.root.title"),
            new rgn_3("advancements.nether.root.description"),
            new rqO_2("textures/gui/advancements/backgrounds/nether.png"),
            Oe_1.TASK,
            false,
            false,
            false
         )
         .class_("entered_nether", hW_2.class_(rYB.protected_))
         .class_(var1, "nether/root");
      OT var3 = Ot_1.class_()
         .class_(var2)
         .class_(
            rdy_3.xa,
            new rgn_3("advancements.nether.return_to_sender.title"),
            new rgn_3("advancements.nether.return_to_sender.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(50))
         .class_("killed_ghast", Xk_1.class_(hK_2.class_().class_(aI_2.interface_), hC_2.class_().class_(true).class_(hK_2.class_().class_(aI_2.const_))))
         .class_(var1, "nether/return_to_sender");
      OT var4 = Ot_1.class_()
         .class_(var2)
         .class_(
            xu_3.SP,
            new rgn_3("advancements.nether.find_fortress.title"),
            new rgn_3("advancements.nether.find_fortress.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("fortress", XK.class_(XN.class_(rrrZ.final_)))
         .class_(var1, "nether/find_fortress");
      Ot_1.class_()
         .class_(var2)
         .class_(
            rdy_3.dM,
            new rgn_3("advancements.nether.fast_travel.title"),
            new rgn_3("advancements.nether.fast_travel.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(100))
         .class_("travelled", XH.class_(hl_3.class_(Xm_1.class_(7000.0F))))
         .class_(var1, "nether/fast_travel");
      Ot_1.class_()
         .class_(var3)
         .class_(
            rdy_3.Jv,
            new rgn_3("advancements.nether.uneasy_alliance.title"),
            new rgn_3("advancements.nether.uneasy_alliance.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(100))
         .class_("killed_ghast", Xk_1.class_(hK_2.class_().class_(aI_2.interface_).class_(XN.break_(rYB.byte_))))
         .class_(var1, "nether/uneasy_alliance");
      OT var5 = Ot_1.class_()
         .class_(var4)
         .class_(
            xu_3.sh,
            new rgn_3("advancements.nether.get_wither_skull.title"),
            new rgn_3("advancements.nether.get_wither_skull.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("wither_skull", Xb_1.class_(xu_3.sh))
         .class_(var1, "nether/get_wither_skull");
      OT var6 = Ot_1.class_()
         .class_(var5)
         .class_(
            rdy_3.dQ,
            new rgn_3("advancements.nether.summon_wither.title"),
            new rgn_3("advancements.nether.summon_wither.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("summoned", JO.class_(hK_2.class_().class_(aI_2.i)))
         .class_(var1, "nether/summon_wither");
      OT var7 = Ot_1.class_()
         .class_(var4)
         .class_(
            rdy_3.JZ,
            new rgn_3("advancements.nether.obtain_blaze_rod.title"),
            new rgn_3("advancements.nether.obtain_blaze_rod.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("blaze_rod", Xb_1.class_(rdy_3.JZ))
         .class_(var1, "nether/obtain_blaze_rod");
      OT var8 = Ot_1.class_()
         .class_(var6)
         .class_(
            xu_3.Sv,
            new rgn_3("advancements.nether.create_beacon.title"),
            new rgn_3("advancements.nether.create_beacon.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("beacon", hc_3.class_(XF.break_(1)))
         .class_(var1, "nether/create_beacon");
      Ot_1.class_()
         .class_(var8)
         .class_(
            xu_3.Sv,
            new rgn_3("advancements.nether.create_full_beacon.title"),
            new rgn_3("advancements.nether.create_full_beacon.description"),
            (rqO_2)null,
            Oe_1.GOAL,
            true,
            true,
            false
         )
         .class_("beacon", hc_3.class_(XF.class_(4)))
         .class_(var1, "nether/create_full_beacon");
      OT var9 = Ot_1.class_()
         .class_(var7)
         .class_(
            rdy_3.JA,
            new rgn_3("advancements.nether.brew_potion.title"),
            new rgn_3("advancements.nether.brew_potion.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("potion", hd_3.break_())
         .class_(var1, "nether/brew_potion");
      OT var10 = Ot_1.class_()
         .class_(var9)
         .class_(
            rdy_3.hi,
            new rgn_3("advancements.nether.all_potions.title"),
            new rgn_3("advancements.nether.all_potions.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(100))
         .class_(
            "all_effects",
            hy_3.class_(
               XA.class_()
                  .class_(rLD.class_)
                  .class_(rLD.break_)
                  .class_(rLD.throws_)
                  .class_(rLD.private_)
                  .class_(rLD.finally_)
                  .class_(rLD.native_)
                  .class_(rLD.volatile_)
                  .class_(rLD.final_)
                  .class_(rLD.int_)
                  .class_(rLD.continue_)
                  .class_(rLD.super_)
                  .class_(rLD.instanceof_)
                  .class_(rLD.extends_)
            )
         )
         .class_(var1, "nether/all_potions");
      Ot_1.class_()
         .class_(var10)
         .class_(
            rdy_3.hg,
            new rgn_3("advancements.nether.all_effects.title"),
            new rgn_3("advancements.nether.all_effects.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            true
         )
         .class_(OR.class_(1000))
         .class_(
            "all_effects",
            hy_3.class_(
               XA.class_()
                  .class_(rLD.class_)
                  .class_(rLD.break_)
                  .class_(rLD.throws_)
                  .class_(rLD.private_)
                  .class_(rLD.finally_)
                  .class_(rLD.native_)
                  .class_(rLD.volatile_)
                  .class_(rLD.final_)
                  .class_(rLD.int_)
                  .class_(rLD.continue_)
                  .class_(rLD.super_)
                  .class_(rLD.this_)
                  .class_(rLD.byte_)
                  .class_(rLD.protected_)
                  .class_(rLD.goto_)
                  .class_(rLD.public_)
                  .class_(rLD.synchronized_)
                  .class_(rLD.new_)
                  .class_(rLD.implements_)
                  .class_(rLD.extends_)
                  .class_(rLD.instanceof_)
                  .class_(rLD.throw_)
                  .class_(rLD.interface_)
                  .class_(rLD.package_)
                  .class_(rLD.char_)
                  .class_(rLD.abstract_)
            )
         )
         .class_(var1, "nether/all_effects");
      OT var11 = Ot_1.class_()
         .class_(var2)
         .class_(
            rdy_3.Wl,
            new rgn_3("advancements.nether.obtain_ancient_debris.title"),
            new rgn_3("advancements.nether.obtain_ancient_debris.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("ancient_debris", Xb_1.class_(rdy_3.Wl))
         .class_(var1, "nether/obtain_ancient_debris");
      Ot_1.class_()
         .class_(var11)
         .class_(
            rdy_3.hF,
            new rgn_3("advancements.nether.netherite_armor.title"),
            new rgn_3("advancements.nether.netherite_armor.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(100))
         .class_("netherite_armor", Xb_1.class_(rdy_3.hv, rdy_3.hF, rdy_3.hL, rdy_3.hA))
         .class_(var1, "nether/netherite_armor");
      Ot_1.class_()
         .class_(var11)
         .class_(
            rdy_3.Wn,
            new rgn_3("advancements.nether.use_lodestone.title"),
            new rgn_3("advancements.nether.use_lodestone.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("use_lodestone", Xa_1.class_(Xc_1.class_().class_(hh_3.class_().class_(xu_3.Jc).break_()), XX.class_().class_(rdy_3.Xx)))
         .class_(var1, "nether/use_lodestone");
      OT var12 = Ot_1.class_()
         .class_(var2)
         .class_(
            rdy_3.Wy,
            new rgn_3("advancements.nether.obtain_crying_obsidian.title"),
            new rgn_3("advancements.nether.obtain_crying_obsidian.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("crying_obsidian", Xb_1.class_(rdy_3.Wy))
         .class_(var1, "nether/obtain_crying_obsidian");
      Ot_1.class_()
         .class_(var12)
         .class_(
            rdy_3.Wo,
            new rgn_3("advancements.nether.charge_respawn_anchor.title"),
            new rgn_3("advancements.nether.charge_respawn_anchor.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_(
            "charge_respawn_anchor",
            Xa_1.class_(
               Xc_1.class_().class_(hh_3.class_().class_(xu_3.Jk).class_(Js_1.class_().class_(Wv_1.volatile_, 4).break_()).break_()),
               XX.class_().class_(xu_3.Pa)
            )
         )
         .class_(var1, "nether/charge_respawn_anchor");
      OT var13 = Ot_1.class_()
         .class_(var2)
         .class_(
            rdy_3.dz,
            new rgn_3("advancements.nether.ride_strider.title"),
            new rgn_3("advancements.nether.ride_strider.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_(
            "used_warped_fungus_on_a_stick",
            XO.class_(ho_3.class_(hK_2.class_().class_(hK_2.class_().class_(aI_2.w).break_()).break_()), XX.class_().class_(rdy_3.dz).break_(), XF.throws_)
         )
         .class_(var1, "nether/ride_strider");
      UQ.class_(Ot_1.class_(), class_)
         .class_(var13)
         .class_(
            rdy_3.hA,
            new rgn_3("advancements.nether.explore_nether.title"),
            new rgn_3("advancements.nether.explore_nether.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(500))
         .class_(var1, "nether/explore_nether");
      OT var14 = Ot_1.class_()
         .class_(var2)
         .class_(
            rdy_3.WV,
            new rgn_3("advancements.nether.find_bastion.title"),
            new rgn_3("advancements.nether.find_bastion.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("bastion", XK.class_(XN.class_(rrrZ.super_)))
         .class_(var1, "nether/find_bastion");
      Ot_1.class_()
         .class_(var14)
         .class_(
            xu_3.re,
            new rgn_3("advancements.nether.loot_bastion.title"),
            new rgn_3("advancements.nether.loot_bastion.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_(hS_2.break_)
         .class_("loot_bastion_other", Xw_1.class_(new rqO_2("minecraft:chests/bastion_other")))
         .class_("loot_bastion_treasure", Xw_1.class_(new rqO_2("minecraft:chests/bastion_treasure")))
         .class_("loot_bastion_hoglin_stable", Xw_1.class_(new rqO_2("minecraft:chests/bastion_hoglin_stable")))
         .class_("loot_bastion_bridge", Xw_1.class_(new rqO_2("minecraft:chests/bastion_bridge")))
         .class_(var1, "nether/loot_bastion");
      Ot_1.class_()
         .class_(var2)
         .class_(hS_2.break_)
         .class_(
            rdy_3.Od,
            new rgn_3("advancements.nether.distract_piglin.title"),
            new rgn_3("advancements.nether.distract_piglin.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_(
            "distract_piglin",
            Jk_1.class_(
               break_, XX.class_().class_(rlc_3.strictfp_), ho_3.class_(hK_2.class_().class_(aI_2.d).class_(hV_2.class_().break_(false).break_()).break_())
            )
         )
         .class_(
            "distract_piglin_directly",
            XT.class_(break_, XX.class_().class_(rbW_2.class_), ho_3.class_(hK_2.class_().class_(aI_2.d).class_(hV_2.class_().break_(false).break_()).break_()))
         )
         .class_(var1, "nether/distract_piglin");
   }
}
