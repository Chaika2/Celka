package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class Kk_1 {
   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("stop").requires(var0x -> var0x.id_class(4))).executes(var0x -> {
         ((gy_3)var0x.getSource()).id_class(new rgn_3("commands.stop.stopping"), true);
         ((gy_3)var0x.getSource()).id_super().id_class(false);
         return 1;
      }));
   }
}
