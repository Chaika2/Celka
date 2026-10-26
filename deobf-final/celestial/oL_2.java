package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.Collection;
import java.util.Collections;

public class oL_2 {
   private static int class_(CommandContext<gy_3> var0, Collection<rhN_2> var1, rRl_1 var2) {
      int var3 = 0;

      for (rhN_2 var5 : var1) {
         if (var5.finally_.break_() != var2) {
            var5.class_(var2);
            class_((gy_3)var0.getSource(), var5, var2);
            var3++;
         }
      }

      return var3;
   }

   private static void class_(gy_3 var0, rhN_2 var1, rRl_1 var2) {
      rgn_3 var3 = new rgn_3("gameMode." + var2.break_());
      if (var0.package_() == var1) {
         var0.class_(new rgn_3("commands.gamemode.success.self", var3), true);
      } else {
         if (var0.final_().B().break_(rRu_1.final_)) {
            var1.class_(new rgn_3("gameMode.changed", var3), rqR_2.break_);
         }

         var0.class_(new rgn_3("commands.gamemode.success.other", var1.L_(), var3), true);
      }
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)gp_3.class_("gamemode").requires(var0x -> var0x.class_(2));

      for (rRl_1 var5 : rRl_1.values()) {
         if (var5 != rRl_1.NOT_SET) {
            var1.then(
               ((LiteralArgumentBuilder)gp_3.class_(var5.break_())
                     .executes(var1x -> class_(var1x, Collections.singleton(((gy_3)var1x.getSource()).new_()), var5)))
                  .then(gp_3.class_("target", RZ.protected_()).executes(var1x -> class_(var1x, RZ.case_(var1x, "target"), var5)))
            );
         }
      }

      var0.register(var1);
   }
}
