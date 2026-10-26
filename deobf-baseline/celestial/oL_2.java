package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class oL_2 {
   private static int id_class(CommandContext<gy_3> var0, Collection<rhN_2> var1, rRl_1 var2) {
      int var3 = 0;

      for (rhN_2 var5 : var1) {
         if (var5.id_finally.id_break() != var2) {
            var5.id_class(var2);
            id_class((gy_3)var0.getSource(), var5, var2);
            var3++;
         }
      }

      return var3;
   }

   private static void id_class(gy_3 var0, rhN_2 var1, rRl_1 var2) {
      rgn_3 var3 = new rgn_3("gameMode." + var2.id_break());
      if (var0.id_package() == var1) {
         var0.id_class(new rgn_3("commands.gamemode.success.self", var3), true);
      } else {
         if (var0.id_final().B().id_break(rRu_1.id_final)) {
            var1.id_class(new rgn_3("gameMode.changed", var3), rqR_2.id_break);
         }

         var0.id_class(new rgn_3("commands.gamemode.success.other", var1.L_(), var3), true);
      }
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)gp_3.id_class("gamemode").requires(var0x -> var0x.id_class(2));

      for (rRl_1 var5 : rRl_1.values()) {
         if (var5 != rRl_1.NOT_SET) {
            var1.then(
               ((LiteralArgumentBuilder)gp_3.id_class(var5.id_break())
                     .executes(var1x -> id_class(var1x, Collections.singleton(((gy_3)var1x.getSource()).id_new()), var5)))
                  .then(gp_3.id_class("target", RZ.id_protected()).executes(var1x -> id_class(var1x, RZ.id_case(var1x, "target"), var5)))
            );
         }
      }

      var0.register(var1);
   }
}
