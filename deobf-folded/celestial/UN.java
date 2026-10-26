package celestial;

import java.util.function.Consumer;

public class UN implements Consumer<Consumer<OT>> {
   public void id_class(Consumer<OT> var1) {
      OT var2 = Ot_1.id_class()
         .id_class(
            xu_3.Sh,
            new rgn_3("advancements.end.root.title"),
            new rgn_3("advancements.end.root.description"),
            new rqO_2("textures/gui/advancements/backgrounds/end.png"),
            Oe_1.TASK,
            false,
            false,
            false
         )
         .id_class("entered_end", hW_2.id_class(rYB.id_throws))
         .id_class(var1, "end/root");
      OT var3 = Ot_1.id_class()
         .id_class(var2)
         .id_class(
            xu_3.sQ,
            new rgn_3("advancements.end.kill_dragon.title"),
            new rgn_3("advancements.end.kill_dragon.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class("killed_dragon", Xk_1.id_class(hK_2.id_class().id_class(aI_2.id_this)))
         .id_class(var1, "end/kill_dragon");
      OT var4 = Ot_1.id_class()
         .id_class(var3)
         .id_class(
            rdy_3.Jm,
            new rgn_3("advancements.end.enter_end_gateway.title"),
            new rgn_3("advancements.end.enter_end_gateway.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class("entered_end_gateway", hw_3.id_class(xu_3.bw))
         .id_class(var1, "end/enter_end_gateway");
      Ot_1.id_class()
         .id_class(var3)
         .id_class(
            rdy_3.kM,
            new rgn_3("advancements.end.respawn_dragon.title"),
            new rgn_3("advancements.end.respawn_dragon.description"),
            (rqO_2)null,
            Oe_1.GOAL,
            true,
            true,
            false
         )
         .id_class("summoned_dragon", JO.id_class(hK_2.id_class().id_class(aI_2.id_this)))
         .id_class(var1, "end/respawn_dragon");
      OT var5 = Ot_1.id_class()
         .id_class(var4)
         .id_class(
            xu_3.bH,
            new rgn_3("advancements.end.find_end_city.title"),
            new rgn_3("advancements.end.find_end_city.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .id_class("in_city", XK.id_class(XN.id_class(rrrZ.id_package)))
         .id_class(var1, "end/find_end_city");
      Ot_1.id_class()
         .id_class(var3)
         .id_class(
            rdy_3.kd,
            new rgn_3("advancements.end.dragon_breath.title"),
            new rgn_3("advancements.end.dragon_breath.description"),
            (rqO_2)null,
            Oe_1.GOAL,
            true,
            true,
            false
         )
         .id_class("dragon_breath", Xb_1.id_class(rdy_3.kd))
         .id_class(var1, "end/dragon_breath");
      Ot_1.id_class()
         .id_class(var5)
         .id_class(
            rdy_3.kA,
            new rgn_3("advancements.end.levitate.title"),
            new rgn_3("advancements.end.levitate.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .id_class(OR.id_class(50))
         .id_class("levitated", Xz_1.id_class(hl_3.id_break(Xm_1.id_class(50.0F))))
         .id_class(var1, "end/levitate");
      Ot_1.id_class()
         .id_class(var5)
         .id_class(
            rdy_3.kc, new rgn_3("advancements.end.elytra.title"), new rgn_3("advancements.end.elytra.description"), (rqO_2)null, Oe_1.GOAL, true, true, false
         )
         .id_class("elytra", Xb_1.id_class(rdy_3.kc))
         .id_class(var1, "end/elytra");
      Ot_1.id_class()
         .id_class(var3)
         .id_class(
            xu_3.SX,
            new rgn_3("advancements.end.dragon_egg.title"),
            new rgn_3("advancements.end.dragon_egg.description"),
            (rqO_2)null,
            Oe_1.GOAL,
            true,
            true,
            false
         )
         .id_class("dragon_egg", Xb_1.id_class(xu_3.SX))
         .id_class(var1, "end/dragon_egg");
   }
}
