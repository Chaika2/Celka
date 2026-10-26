package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.UUID;
import java.util.function.Consumer;

public class oV_2 {
   private static int class_(gy_3 var0, Collection<rhN_2> var1, rgP_2 var2) {
      UUID var3 = var0.package_() == null ? rqR_2.break_ : var0.package_().ro();
      Consumer var5;
      if (var0.package_() instanceof rhN_2 var6) {
         var5 = var2x -> var6.class_(new rgn_3("commands.message.display.outgoing", var2x, var2).class_(new rgF_2[]{rgF_2.GRAY, rgF_2.ITALIC}), var6.ro());
      } else {
         var5 = var2x -> var0.class_(new rgn_3("commands.message.display.outgoing", var2x, var2).class_(new rgF_2[]{rgF_2.GRAY, rgF_2.ITALIC}), false);
      }

      for (rhN_2 var7 : var1) {
         var5.accept(var7.L_());
         var7.class_(new rgn_3("commands.message.display.incoming", var0.extends_(), var2).class_(new rgF_2[]{rgF_2.GRAY, rgF_2.ITALIC}), var3);
      }

      return var1.size();
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      LiteralCommandNode var1 = var0.register(
         (LiteralArgumentBuilder)gp_3.class_("msg")
            .then(
               gp_3.class_("targets", RZ.protected_())
                  .then(
                     gp_3.class_("message", YP.class_())
                        .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), YP.class_(var0x, "message")))
                  )
            )
      );
      var0.register((LiteralArgumentBuilder)gp_3.class_("tell").redirect(var1));
      var0.register((LiteralArgumentBuilder)gp_3.class_("w").redirect(var1));
   }
}
