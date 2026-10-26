package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class KO {
   private static int class_(gy_3 var0, int var1) {
      var0.super_().protected_(var1);
      var0.class_(new rgn_3("commands.setidletimeout.success", var1), true);
      return var1;
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("setidletimeout").requires(var0x -> var0x.class_(3)))
            .then(
               gp_3.class_("minutes", IntegerArgumentType.integer(0))
                  .executes(var0x -> class_((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "minutes")))
            )
      );
   }
}
