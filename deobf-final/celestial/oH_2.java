package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;

public class oH_2 {
   private static int class_(gy_3 var0, Collection<rhN_2> var1, rgP_2 var2) {
      for (rhN_2 var4 : var1) {
         var4.class_.class_(var2);
         var0.class_(new rgn_3("commands.kick.success", var4.L_(), var2), true);
      }

      return var1.size();
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("kick").requires(var0x -> var0x.class_(3)))
            .then(
               ((RequiredArgumentBuilder)gp_3.class_("targets", RZ.protected_())
                     .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), new rgn_3("multiplayer.disconnect.kicked"))))
                  .then(
                     gp_3.class_("reason", YP.class_())
                        .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), YP.class_(var0x, "reason")))
                  )
            )
      );
   }
}
