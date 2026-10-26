package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class KO {
   private static int id_class(gy_3 var0, int var1) {
      var0.id_super().id_protected(var1);
      var0.id_class(new rgn_3("commands.setidletimeout.success", var1), true);
      return var1;
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("setidletimeout").requires(var0x -> var0x.id_class(3)))
            .then(
               gp_3.id_class("minutes", IntegerArgumentType.integer(0))
                  .executes(var0x -> id_class((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "minutes")))
            )
      );
   }
}
