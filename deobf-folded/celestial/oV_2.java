package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.UUID;
import java.util.function.Consumer;

public class oV_2 {
   private static int id_class(gy_3 var0, Collection<rhN_2> var1, rgP_2 var2) {
      UUID var3 = var0.id_package() == null ? rqR_2.id_break : var0.id_package().ro();
      Consumer var5;
      if (var0.id_package() instanceof rhN_2 var6) {
         var5 = var2x -> var6.id_class(new rgn_3("commands.message.display.outgoing", var2x, var2).id_class(new rgF_2[]{rgF_2.GRAY, rgF_2.ITALIC}), var6.ro());
      } else {
         var5 = var2x -> var0.id_class(new rgn_3("commands.message.display.outgoing", var2x, var2).id_class(new rgF_2[]{rgF_2.GRAY, rgF_2.ITALIC}), false);
      }

      for (rhN_2 var7 : var1) {
         var5.accept(var7.L_());
         var7.id_class(new rgn_3("commands.message.display.incoming", var0.id_extends(), var2).id_class(new rgF_2[]{rgF_2.GRAY, rgF_2.ITALIC}), var3);
      }

      return var1.size();
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      LiteralCommandNode var1 = var0.register(
         (LiteralArgumentBuilder)gp_3.id_class("msg")
            .then(
               gp_3.id_class("targets", RZ.id_protected())
                  .then(
                     gp_3.id_class("message", YP.id_class())
                        .executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), YP.id_class(var0x, "message")))
                  )
            )
      );
      var0.register((LiteralArgumentBuilder)gp_3.id_class("tell").redirect(var1));
      var0.register((LiteralArgumentBuilder)gp_3.id_class("w").redirect(var1));
   }
}
