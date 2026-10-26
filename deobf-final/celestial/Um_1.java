package celestial;

import java.util.function.Consumer;

public class Um_1 implements Consumer<Consumer<OT>> {
   public void class_(Consumer<OT> var1) {
      OT var2 = Ot_1.class_()
         .class_(
            xu_3.implements_,
            new rgn_3("advancements.story.root.title"),
            new rgn_3("advancements.story.root.description"),
            new rqO_2("textures/gui/advancements/backgrounds/stone.png"),
            Oe_1.TASK,
            false,
            false,
            false
         )
         .class_("crafting_table", Xb_1.class_(xu_3.PP))
         .class_(var1, "story/root");
      OT var3 = Ot_1.class_()
         .class_(var2)
         .class_(
            rdy_3.ON,
            new rgn_3("advancements.story.mine_stone.title"),
            new rgn_3("advancements.story.mine_stone.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("get_stone", Xb_1.class_(XX.class_().class_(rlc_3.b).break_()))
         .class_(var1, "story/mine_stone");
      OT var4 = Ot_1.class_()
         .class_(var3)
         .class_(
            rdy_3.Ov,
            new rgn_3("advancements.story.upgrade_tools.title"),
            new rgn_3("advancements.story.upgrade_tools.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("stone_pickaxe", Xb_1.class_(rdy_3.Ov))
         .class_(var1, "story/upgrade_tools");
      OT var5 = Ot_1.class_()
         .class_(var4)
         .class_(
            rdy_3.Ox,
            new rgn_3("advancements.story.smelt_iron.title"),
            new rgn_3("advancements.story.smelt_iron.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("iron", Xb_1.class_(rdy_3.Ox))
         .class_(var1, "story/smelt_iron");
      OT var6 = Ot_1.class_()
         .class_(var5)
         .class_(
            rdy_3.Oq,
            new rgn_3("advancements.story.iron_tools.title"),
            new rgn_3("advancements.story.iron_tools.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("iron_pickaxe", Xb_1.class_(rdy_3.Oq))
         .class_(var1, "story/iron_tools");
      OT var7 = Ot_1.class_()
         .class_(var6)
         .class_(
            rdy_3.OJ,
            new rgn_3("advancements.story.mine_diamond.title"),
            new rgn_3("advancements.story.mine_diamond.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("diamond", Xb_1.class_(rdy_3.OJ))
         .class_(var1, "story/mine_diamond");
      OT var8 = Ot_1.class_()
         .class_(var5)
         .class_(
            rdy_3.hY,
            new rgn_3("advancements.story.lava_bucket.title"),
            new rgn_3("advancements.story.lava_bucket.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("lava_bucket", Xb_1.class_(rdy_3.hY))
         .class_(var1, "story/lava_bucket");
      OT var9 = Ot_1.class_()
         .class_(var5)
         .class_(
            rdy_3.hx,
            new rgn_3("advancements.story.obtain_armor.title"),
            new rgn_3("advancements.story.obtain_armor.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_(hS_2.break_)
         .class_("iron_helmet", Xb_1.class_(rdy_3.hJ))
         .class_("iron_chestplate", Xb_1.class_(rdy_3.hx))
         .class_("iron_leggings", Xb_1.class_(rdy_3.hd))
         .class_("iron_boots", Xb_1.class_(rdy_3.hk))
         .class_(var1, "story/obtain_armor");
      Ot_1.class_()
         .class_(var7)
         .class_(
            rdy_3.dm,
            new rgn_3("advancements.story.enchant_item.title"),
            new rgn_3("advancements.story.enchant_item.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("enchanted_item", hq_3.break_())
         .class_(var1, "story/enchant_item");
      OT var10 = Ot_1.class_()
         .class_(var8)
         .class_(
            xu_3.rg,
            new rgn_3("advancements.story.form_obsidian.title"),
            new rgn_3("advancements.story.form_obsidian.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("obsidian", Xb_1.class_(xu_3.rg))
         .class_(var1, "story/form_obsidian");
      Ot_1.class_()
         .class_(var9)
         .class_(
            rdy_3.kN,
            new rgn_3("advancements.story.deflect_arrow.title"),
            new rgn_3("advancements.story.deflect_arrow.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("deflected_projectile", hR_2.class_(hA_2.class_().class_(hC_2.class_().class_(true)).class_(true)))
         .class_(var1, "story/deflect_arrow");
      Ot_1.class_()
         .class_(var7)
         .class_(
            rdy_3.hz,
            new rgn_3("advancements.story.shiny_gear.title"),
            new rgn_3("advancements.story.shiny_gear.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_(hS_2.break_)
         .class_("diamond_helmet", Xb_1.class_(rdy_3.hW))
         .class_("diamond_chestplate", Xb_1.class_(rdy_3.hz))
         .class_("diamond_leggings", Xb_1.class_(rdy_3.hQ))
         .class_("diamond_boots", Xb_1.class_(rdy_3.hN))
         .class_(var1, "story/shiny_gear");
      OT var11 = Ot_1.class_()
         .class_(var10)
         .class_(
            rdy_3.OG,
            new rgn_3("advancements.story.enter_the_nether.title"),
            new rgn_3("advancements.story.enter_the_nether.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("entered_nether", hW_2.class_(rYB.protected_))
         .class_(var1, "story/enter_the_nether");
      Ot_1.class_()
         .class_(var11)
         .class_(
            rdy_3.hy,
            new rgn_3("advancements.story.cure_zombie_villager.title"),
            new rgn_3("advancements.story.cure_zombie_villager.description"),
            (rqO_2)null,
            Oe_1.GOAL,
            true,
            true,
            false
         )
         .class_("cured_zombie", hF_2.break_())
         .class_(var1, "story/cure_zombie_villager");
      OT var12 = Ot_1.class_()
         .class_(var11)
         .class_(
            rdy_3.JT,
            new rgn_3("advancements.story.follow_ender_eye.title"),
            new rgn_3("advancements.story.follow_ender_eye.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("in_stronghold", XK.class_(XN.class_(rrrZ.extends_)))
         .class_(var1, "story/follow_ender_eye");
      Ot_1.class_()
         .class_(var12)
         .class_(
            xu_3.Sh,
            new rgn_3("advancements.story.enter_the_end.title"),
            new rgn_3("advancements.story.enter_the_end.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("entered_end", hW_2.class_(rYB.throws_))
         .class_(var1, "story/enter_the_end");
   }
}
