package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;

public class Kh_1 {
   private static int class_(gy_3 var0, rfH_2 var1, float var2) {
      var0.final_().class_(var1, var2);
      var0.class_(new rgn_3("commands.setworldspawn.success", var1.b_(), var1.c_(), var1.d_(), var2), true);
      return 1;
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("setworldspawn").requires(var0x -> var0x.class_(2)))
               .executes(var0x -> class_((gy_3)var0x.getSource(), new rfH_2(((gy_3)var0x.getSource()).volatile_()), 0.0F)))
            .then(
               ((RequiredArgumentBuilder)gp_3.class_("pos", RM.class_()).executes(var0x -> class_((gy_3)var0x.getSource(), RM.break_(var0x, "pos"), 0.0F)))
                  .then(
                     gp_3.class_("angle", RS.class_()).executes(var0x -> class_((gy_3)var0x.getSource(), RM.break_(var0x, "pos"), RS.class_(var0x, "angle")))
                  )
            )
      );
   }
}
