/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JO;
import celestial.OR;
import celestial.OT;
import celestial.Oe_1;
import celestial.Ot_1;
import celestial.XK;
import celestial.XN;
import celestial.Xb_1;
import celestial.Xk_1;
import celestial.Xm_1;
import celestial.Xz_1;
import celestial.aI_2;
import celestial.hK_2;
import celestial.hW_2;
import celestial.hl_3;
import celestial.hw_3;
import celestial.rYB;
import celestial.rdy_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rqO_2;
import celestial.rrrZ;
import celestial.xu_3;
import java.util.function.Consumer;

public class UN
implements Consumer<Consumer<OT>> {
    public void id_class(Consumer<OT> consumer) {
        OT oT = Ot_1.id_class().id_class(xu_3.Sh, (rgP_2)new rgn_3("advancements.end.root.title"), (rgP_2)new rgn_3("advancements.end.root.description"), new rqO_2("textures/gui/advancements/backgrounds/end.png"), Oe_1.TASK, false, false, false).id_class("entered_end", hW_2.id_class(rYB.id_throws)).id_class(consumer, "end/root");
        OT oT2 = Ot_1.id_class().id_class(oT).id_class(xu_3.sQ, (rgP_2)new rgn_3("advancements.end.kill_dragon.title"), (rgP_2)new rgn_3("advancements.end.kill_dragon.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("killed_dragon", Xk_1.id_class(hK_2.id_class().id_class(aI_2.id_this))).id_class(consumer, "end/kill_dragon");
        OT oT3 = Ot_1.id_class().id_class(oT2).id_class(rdy_3.Jm, (rgP_2)new rgn_3("advancements.end.enter_end_gateway.title"), (rgP_2)new rgn_3("advancements.end.enter_end_gateway.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("entered_end_gateway", hw_3.id_class(xu_3.bw)).id_class(consumer, "end/enter_end_gateway");
        Ot_1.id_class().id_class(oT2).id_class(rdy_3.kM, (rgP_2)new rgn_3("advancements.end.respawn_dragon.title"), (rgP_2)new rgn_3("advancements.end.respawn_dragon.description"), (rqO_2)null, Oe_1.GOAL, true, true, false).id_class("summoned_dragon", JO.id_class(hK_2.id_class().id_class(aI_2.id_this))).id_class(consumer, "end/respawn_dragon");
        OT oT4 = Ot_1.id_class().id_class(oT3).id_class(xu_3.bH, (rgP_2)new rgn_3("advancements.end.find_end_city.title"), (rgP_2)new rgn_3("advancements.end.find_end_city.description"), (rqO_2)null, Oe_1.TASK, true, true, false).id_class("in_city", XK.id_class(XN.id_class(rrrZ.id_package))).id_class(consumer, "end/find_end_city");
        Ot_1.id_class().id_class(oT2).id_class(rdy_3.kd, (rgP_2)new rgn_3("advancements.end.dragon_breath.title"), (rgP_2)new rgn_3("advancements.end.dragon_breath.description"), (rqO_2)null, Oe_1.GOAL, true, true, false).id_class("dragon_breath", Xb_1.id_class(rdy_3.kd)).id_class(consumer, "end/dragon_breath");
        Ot_1.id_class().id_class(oT4).id_class(rdy_3.kA, (rgP_2)new rgn_3("advancements.end.levitate.title"), (rgP_2)new rgn_3("advancements.end.levitate.description"), (rqO_2)null, Oe_1.CHALLENGE, true, true, false).id_class(OR.id_class(50)).id_class("levitated", Xz_1.id_class(hl_3.id_break(Xm_1.id_class(50.0f)))).id_class(consumer, "end/levitate");
        Ot_1.id_class().id_class(oT4).id_class(rdy_3.kc, (rgP_2)new rgn_3("advancements.end.elytra.title"), (rgP_2)new rgn_3("advancements.end.elytra.description"), (rqO_2)null, Oe_1.GOAL, true, true, false).id_class("elytra", Xb_1.id_class(rdy_3.kc)).id_class(consumer, "end/elytra");
        Ot_1.id_class().id_class(oT2).id_class(xu_3.SX, (rgP_2)new rgn_3("advancements.end.dragon_egg.title"), (rgP_2)new rgn_3("advancements.end.dragon_egg.description"), (rqO_2)null, Oe_1.GOAL, true, true, false).id_class("dragon_egg", Xb_1.id_class(xu_3.SX)).id_class(consumer, "end/dragon_egg");
    }

    @Override
    public /* synthetic */ void accept(Object object) {
        this.id_class((Consumer)object);
    }
}

