package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class ox_3 {
   private static int id_class(gy_3 var0, rRl_1 var1) {
      int var2 = 0;
      rnW_2 var3 = var0.id_super();
      var3.id_class(var1);
      if (var3.c()) {
         for (rhN_2 var5 : var3.x().id_super()) {
            if (var5.id_finally.id_break() != var1) {
               var5.id_class(var1);
               var2++;
            }
         }
      }

      var0.id_class(new rgn_3("commands.defaultgamemode.success", var1.id_byte()), true);
      return var2;
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)gp_3.id_class("defaultgamemode").requires(var0x -> var0x.id_class(2));

      for (rRl_1 var5 : rRl_1.values()) {
         if (var5 != rRl_1.NOT_SET) {
            var1.then(gp_3.id_class(var5.id_break()).executes(var1x -> id_class((gy_3)var1x.getSource(), var5)));
         }
      }

      var0.register(var1);
   }
}
