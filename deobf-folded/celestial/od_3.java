package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class od_3 {
   private static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.difficulty.failure", var0));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      LiteralArgumentBuilder var1 = gp_3.id_class("difficulty");

      for (rRO var5 : rRO.values()) {
         var1.then(gp_3.id_class(var5.id_byte()).executes(var1x -> id_class((gy_3)var1x.getSource(), var5)));
      }

      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.requires(var0x -> var0x.id_class(2))).executes(var0x -> {
         rRO var1x = ((gy_3)var0x.getSource()).id_final().id_abstract();
         ((gy_3)var0x.getSource()).id_class(new rgn_3("commands.difficulty.query", var1x.id_break()), false);
         return var1x.id_class();
      }));
   }

   public static int id_class(gy_3 var0, rRO var1) throws CommandSyntaxException {
      rnW_2 var2 = var0.id_super();
      if (var2.rB().id_extends() == var1) {
         throw id_class.create(var1.id_byte());
      } else {
         var2.id_class(var1, true);
         var0.id_class(new rgn_3("commands.difficulty.success", var1.id_break()), true);
         return 0;
      }
   }
}
