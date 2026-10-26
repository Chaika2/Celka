/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.OT;
import celestial.Oe_1;
import celestial.Ot_1;
import celestial.XK;
import celestial.XN;
import celestial.XX;
import celestial.Xb_1;
import celestial.hA_2;
import celestial.hC_2;
import celestial.hF_2;
import celestial.hR_2;
import celestial.hS_2;
import celestial.hW_2;
import celestial.hq_3;
import celestial.rYB;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rlc_3;
import celestial.rqO_2;
import celestial.rrrZ;
import celestial.xu_3;
import java.util.function.Consumer;

public class Um_1
implements Consumer<Consumer<OT>> {
    public void id_class(Consumer<OT> consumer) {
        OT oT = Ot_1.id_class().id_class(xu_3.id_implements, (rgP_2)new rgn_3("advancements.story.root.title"), (rgP_2)new rgn_3("advancements.story.root.description"), new rqO_2("textures/gui/advancements/backgrounds/stone.png"), Oe_1.TASK, false, false, false).id_class("crafting_table", Xb_1.id_class(xu_3.PP)).id_class(consumer, "story/root");
        OT oT2 = Ot_1.id_class().id_class(oT).id_class(rdy_3.ON, (rgP_2)new rgn_3("advancements.story.mine_stone.title"), (rgP_2)new rgn_3("advancements.story.mine_stone.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("get_stone", Xb_1.id_class(XX.id_class().id_class(rlc_3.b).id_break())).id_class(consumer, "story/mine_stone");
        OT oT3 = Ot_1.id_class().id_class(oT2).id_class(rdy_3.Ov, (rgP_2)new rgn_3("advancements.story.upgrade_tools.title"), (rgP_2)new rgn_3("advancements.story.upgrade_tools.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("stone_pickaxe", Xb_1.id_class(rdy_3.Ov)).id_class(consumer, "story/upgrade_tools");
        OT oT4 = Ot_1.id_class().id_class(oT3).id_class(rdy_3.Ox, (rgP_2)new rgn_3("advancements.story.smelt_iron.title"), (rgP_2)new rgn_3("advancements.story.smelt_iron.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("iron", Xb_1.id_class(rdy_3.Ox)).id_class(consumer, "story/smelt_iron");
        OT oT5 = Ot_1.id_class().id_class(oT4).id_class(rdy_3.Oq, (rgP_2)new rgn_3("advancements.story.iron_tools.title"), (rgP_2)new rgn_3("advancements.story.iron_tools.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("iron_pickaxe", Xb_1.id_class(rdy_3.Oq)).id_class(consumer, "story/iron_tools");
        OT oT6 = Ot_1.id_class().id_class(oT5).id_class(rdy_3.OJ, (rgP_2)new rgn_3("advancements.story.mine_diamond.title"), (rgP_2)new rgn_3("advancements.story.mine_diamond.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("diamond", Xb_1.id_class(rdy_3.OJ)).id_class(consumer, "story/mine_diamond");
        OT oT7 = Ot_1.id_class().id_class(oT4).id_class(rdy_3.hY, (rgP_2)new rgn_3("advancements.story.lava_bucket.title"), (rgP_2)new rgn_3("advancements.story.lava_bucket.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("lava_bucket", Xb_1.id_class(rdy_3.hY)).id_class(consumer, "story/lava_bucket");
        OT oT8 = Ot_1.id_class().id_class(oT4).id_class(rdy_3.hx, (rgP_2)new rgn_3("advancements.story.obtain_armor.title"), (rgP_2)new rgn_3("advancements.story.obtain_armor.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class(hS_2.id_break).id_class("iron_helmet", Xb_1.id_class(rdy_3.hJ)).id_class("iron_chestplate", Xb_1.id_class(rdy_3.hx)).id_class("iron_leggings", Xb_1.id_class(rdy_3.hd)).id_class("iron_boots", Xb_1.id_class(rdy_3.hk)).id_class(consumer, "story/obtain_armor");
        Ot_1.id_class().id_class(oT6).id_class(rdy_3.dm, (rgP_2)new rgn_3("advancements.story.enchant_item.title"), (rgP_2)new rgn_3("advancements.story.enchant_item.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("enchanted_item", hq_3.id_break()).id_class(consumer, "story/enchant_item");
        OT oT9 = Ot_1.id_class().id_class(oT7).id_class(xu_3.rg, (rgP_2)new rgn_3("advancements.story.form_obsidian.title"), (rgP_2)new rgn_3("advancements.story.form_obsidian.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("obsidian", Xb_1.id_class(xu_3.rg)).id_class(consumer, "story/form_obsidian");
        Ot_1.id_class().id_class(oT8).id_class(rdy_3.kN, (rgP_2)new rgn_3("advancements.story.deflect_arrow.title"), (rgP_2)new rgn_3("advancements.story.deflect_arrow.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("deflected_projectile", hR_2.id_class(hA_2.id_class().id_class(hC_2.id_class().id_class(true)).id_class(true))).id_class(consumer, "story/deflect_arrow");
        Ot_1.id_class().id_class(oT6).id_class(rdy_3.hz, (rgP_2)new rgn_3("advancements.story.shiny_gear.title"), (rgP_2)new rgn_3("advancements.story.shiny_gear.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class(hS_2.id_break).id_class("diamond_helmet", Xb_1.id_class(rdy_3.hW)).id_class("diamond_chestplate", Xb_1.id_class(rdy_3.hz)).id_class("diamond_leggings", Xb_1.id_class(rdy_3.hQ)).id_class("diamond_boots", Xb_1.id_class(rdy_3.hN)).id_class(consumer, "story/shiny_gear");
        OT oT10 = Ot_1.id_class().id_class(oT9).id_class(rdy_3.OG, (rgP_2)new rgn_3("advancements.story.enter_the_nether.title"), (rgP_2)new rgn_3("advancements.story.enter_the_nether.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("entered_nether", hW_2.id_class(rYB.id_protected)).id_class(consumer, "story/enter_the_nether");
        Ot_1.id_class().id_class(oT10).id_class(rdy_3.hy, (rgP_2)new rgn_3("advancements.story.cure_zombie_villager.title"), (rgP_2)new rgn_3("advancements.story.cure_zombie_villager.description"), (rqO_2)null, Oe_1.GOAL, true, true, false).id_class("cured_zombie", hF_2.id_break()).id_class(consumer, "story/cure_zombie_villager");
        OT oT11 = Ot_1.id_class().id_class(oT10).id_class(rdy_3.JT, (rgP_2)new rgn_3("advancements.story.follow_ender_eye.title"), (rgP_2)new rgn_3("advancements.story.follow_ender_eye.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("in_stronghold", XK.id_class(XN.id_class(rrrZ.id_extends))).id_class(consumer, "story/follow_ender_eye");
        Ot_1.id_class().id_class(oT11).id_class(xu_3.Sh, (rgP_2)new rgn_3("advancements.story.enter_the_end.title"), (rgP_2)new rgn_3("advancements.story.enter_the_end.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("entered_end", hW_2.id_class(rYB.id_throws)).id_class(consumer, "story/enter_the_end");
    }

    @Override
    public /* synthetic */ void accept(Object object) {
        this.id_class((Consumer)object);
    }
}

