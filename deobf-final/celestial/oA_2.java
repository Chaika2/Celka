package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class oA_2 {
   static <T extends rRC<T>> int class_(gy_3 var0, rRA<T> var1) {
      rRC var2 = var0.super_().D().class_(var1);
      var0.class_(new rgn_3("commands.gamerule.query", var1.class_(), var2.toString()), false);
      return var2.byte_();
   }

   static <T extends rRC<T>> int class_(CommandContext<gy_3> var0, rRA<T> var1) {
      gy_3 var2 = (gy_3)var0.getSource();
      rRC var3 = var2.super_().D().class_(var1);
      var3.break_(var0, "value");
      var2.class_(new rgn_3("commands.gamerule.set", var1.class_(), var3.toString()), true);
      return var3.byte_();
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)gp_3.class_("gamerule").requires(var0x -> var0x.class_(2));
      rRu_1.class_(new on_3(var1));
      var0.register(var1);
   }
}
