package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ox_3 {
   private static int class_(gy_3 var0, rRl_1 var1) {
      int var2 = 0;
      rnW_2 var3 = var0.super_();
      var3.class_(var1);
      if (var3.c()) {
         for (rhN_2 var5 : var3.x().super_()) {
            if (var5.finally_.break_() != var1) {
               var5.class_(var1);
               var2++;
            }
         }
      }

      var0.class_(new rgn_3("commands.defaultgamemode.success", var1.byte_()), true);
      return var2;
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)gp_3.class_("defaultgamemode").requires(var0x -> var0x.class_(2));

      for (rRl_1 var5 : rRl_1.values()) {
         if (var5 != rRl_1.NOT_SET) {
            var1.then(gp_3.class_(var5.break_()).executes(var1x -> class_((gy_3)var1x.getSource(), var5)));
         }
      }

      var0.register(var1);
   }
}
