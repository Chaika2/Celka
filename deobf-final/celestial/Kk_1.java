package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class Kk_1 {
   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("stop").requires(var0x -> var0x.class_(4))).executes(var0x -> {
         ((gy_3)var0x.getSource()).class_(new rgn_3("commands.stop.stopping"), true);
         ((gy_3)var0x.getSource()).super_().class_(false);
         return 1;
      }));
   }
}
