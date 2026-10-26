package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class KZ {
   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("tellraw").requires(var0x -> var0x.id_class(2)))
            .then(gp_3.id_class("targets", RZ.id_protected()).then(gp_3.id_class("message", RQ.id_class()).executes(var0x -> {
               int var1 = 0;

               for (rhN_2 var3 : RZ.id_case(var0x, "targets")) {
                  var3.id_class(rgv_3.id_class((gy_3)var0x.getSource(), RQ.id_class(var0x, "message"), var3, 0), rqR_2.id_break);
                  var1++;
               }

               return var1;
            })))
      );
   }
}
