package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;

public class oH_2 {
   private static int id_class(gy_3 var0, Collection<rhN_2> var1, rgP_2 var2) {
      for (rhN_2 var4 : var1) {
         var4.id_class.id_class(var2);
         var0.id_class(new rgn_3("commands.kick.success", var4.L_(), var2), true);
      }

      return var1.size();
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("kick").requires(var0x -> var0x.id_class(3)))
            .then(
               ((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected())
                     .executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), new rgn_3("multiplayer.disconnect.kicked"))))
                  .then(
                     gp_3.id_class("reason", YP.id_class())
                        .executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), YP.id_class(var0x, "reason")))
                  )
            )
      );
   }
}
