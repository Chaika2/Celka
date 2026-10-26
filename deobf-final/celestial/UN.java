package celestial;

import java.util.function.Consumer;

public class UN implements Consumer<Consumer<OT>> {
   public void class_(Consumer<OT> var1) {
      OT var2 = Ot_1.class_()
         .class_(
            xu_3.Sh,
            new rgn_3("advancements.end.root.title"),
            new rgn_3("advancements.end.root.description"),
            new rqO_2("textures/gui/advancements/backgrounds/end.png"),
            Oe_1.TASK,
            false,
            false,
            false
         )
         .class_("entered_end", hW_2.class_(rYB.throws_))
         .class_(var1, "end/root");
      OT var3 = Ot_1.class_()
         .class_(var2)
         .class_(
            xu_3.sQ,
            new rgn_3("advancements.end.kill_dragon.title"),
            new rgn_3("advancements.end.kill_dragon.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("killed_dragon", Xk_1.class_(hK_2.class_().class_(aI_2.this_)))
         .class_(var1, "end/kill_dragon");
      OT var4 = Ot_1.class_()
         .class_(var3)
         .class_(
            rdy_3.Jm,
            new rgn_3("advancements.end.enter_end_gateway.title"),
            new rgn_3("advancements.end.enter_end_gateway.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("entered_end_gateway", hw_3.class_(xu_3.bw))
         .class_(var1, "end/enter_end_gateway");
      Ot_1.class_()
         .class_(var3)
         .class_(
            rdy_3.kM,
            new rgn_3("advancements.end.respawn_dragon.title"),
            new rgn_3("advancements.end.respawn_dragon.description"),
            (rqO_2)null,
            Oe_1.GOAL,
            true,
            true,
            false
         )
         .class_("summoned_dragon", JO.class_(hK_2.class_().class_(aI_2.this_)))
         .class_(var1, "end/respawn_dragon");
      OT var5 = Ot_1.class_()
         .class_(var4)
         .class_(
            xu_3.bH,
            new rgn_3("advancements.end.find_end_city.title"),
            new rgn_3("advancements.end.find_end_city.description"),
            (rqO_2)null,
            Oe_1.TASK,
            true,
            true,
            false
         )
         .class_("in_city", XK.class_(XN.class_(rrrZ.package_)))
         .class_(var1, "end/find_end_city");
      Ot_1.class_()
         .class_(var3)
         .class_(
            rdy_3.kd,
            new rgn_3("advancements.end.dragon_breath.title"),
            new rgn_3("advancements.end.dragon_breath.description"),
            (rqO_2)null,
            Oe_1.GOAL,
            true,
            true,
            false
         )
         .class_("dragon_breath", Xb_1.class_(rdy_3.kd))
         .class_(var1, "end/dragon_breath");
      Ot_1.class_()
         .class_(var5)
         .class_(
            rdy_3.kA,
            new rgn_3("advancements.end.levitate.title"),
            new rgn_3("advancements.end.levitate.description"),
            (rqO_2)null,
            Oe_1.CHALLENGE,
            true,
            true,
            false
         )
         .class_(OR.class_(50))
         .class_("levitated", Xz_1.class_(hl_3.break_(Xm_1.class_(50.0F))))
         .class_(var1, "end/levitate");
      Ot_1.class_()
         .class_(var5)
         .class_(
            rdy_3.kc, new rgn_3("advancements.end.elytra.title"), new rgn_3("advancements.end.elytra.description"), (rqO_2)null, Oe_1.GOAL, true, true, false
         )
         .class_("elytra", Xb_1.class_(rdy_3.kc))
         .class_(var1, "end/elytra");
      Ot_1.class_()
         .class_(var3)
         .class_(
            xu_3.SX,
            new rgn_3("advancements.end.dragon_egg.title"),
            new rgn_3("advancements.end.dragon_egg.description"),
            (rqO_2)null,
            Oe_1.GOAL,
            true,
            true,
            false
         )
         .class_("dragon_egg", Xb_1.class_(xu_3.SX))
         .class_(var1, "end/dragon_egg");
   }
}
