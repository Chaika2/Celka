package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class KZ {
   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("tellraw").requires(var0x -> var0x.class_(2)))
            .then(gp_3.class_("targets", RZ.protected_()).then(gp_3.class_("message", RQ.class_()).executes(var0x -> {
               int var1 = 0;

               for (rhN_2 var3 : RZ.case_(var0x, "targets")) {
                  var3.class_(rgv_3.class_((gy_3)var0x.getSource(), RQ.class_(var0x, "message"), var3, 0), rqR_2.break_);
                  var1++;
               }

               return var1;
            })))
      );
   }
}
