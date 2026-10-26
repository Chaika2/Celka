package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class oA_2 {
   static <T extends rRC<T>> int id_class(gy_3 var0, rRA<T> var1) {
      rRC var2 = var0.id_super().D().id_class(var1);
      var0.id_class(new rgn_3("commands.gamerule.query", var1.id_class(), var2.toString()), false);
      return var2.id_byte();
   }

   static <T extends rRC<T>> int id_class(CommandContext<gy_3> var0, rRA<T> var1) {
      gy_3 var2 = (gy_3)var0.getSource();
      rRC var3 = var2.id_super().D().id_class(var1);
      var3.id_break(var0, "value");
      var2.id_class(new rgn_3("commands.gamerule.set", var1.id_class(), var3.toString()), true);
      return var3.id_byte();
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)gp_3.id_class("gamerule").requires(var0x -> var0x.id_class(2));
      rRu_1.id_class(new on_3(var1));
      var0.register(var1);
   }
}
