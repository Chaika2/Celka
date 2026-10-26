package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class Kh_1 {
   private static int id_class(gy_3 var0, rfH_2 var1, float var2) {
      var0.id_final().id_class(var1, var2);
      var0.id_class(new rgn_3("commands.setworldspawn.success", var1.b_(), var1.c_(), var1.d_(), var2), true);
      return 1;
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("setworldspawn").requires(var0x -> var0x.id_class(2)))
               .executes(var0x -> id_class((gy_3)var0x.getSource(), new rfH_2(((gy_3)var0x.getSource()).id_volatile()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)gp_3.id_class("pos", RM.id_class())
                     .executes(var0x -> id_class((gy_3)var0x.getSource(), RM.id_break(var0x, "pos"), 0.0F)))
                  .then(
                     gp_3.id_class("angle", RS.id_class())
                        .executes(var0x -> id_class((gy_3)var0x.getSource(), RM.id_break(var0x, "pos"), RS.id_class(var0x, "angle")))
                  )
            )
      );
   }
}
