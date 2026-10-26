package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class oi_3 {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.save.failed"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("save-all").requires(var0x -> var0x.id_class(4)))
               .executes(var0x -> id_class((gy_3)var0x.getSource(), false)))
            .then(gp_3.id_class("flush").executes(var0x -> id_class((gy_3)var0x.getSource(), true)))
      );
   }

   private static int id_class(gy_3 var0, boolean var1) throws CommandSyntaxException {
      var0.id_class(new rgn_3("commands.save.saving"), false);
      rnW_2 var2 = var0.id_super();
      var2.x().id_implements();
      boolean var3 = var2.id_class(true, var1, true);
      if (!var3) {
         throw id_class.create();
      } else {
         var0.id_class(new rgn_3("commands.save.success"), true);
         return 1;
      }
   }
}
