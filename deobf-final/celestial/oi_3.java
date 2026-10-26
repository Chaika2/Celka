package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class oi_3 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.save.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("save-all").requires(var0x -> var0x.class_(4)))
               .executes(var0x -> class_((gy_3)var0x.getSource(), false)))
            .then(gp_3.class_("flush").executes(var0x -> class_((gy_3)var0x.getSource(), true)))
      );
   }

   private static int class_(gy_3 var0, boolean var1) throws CommandSyntaxException {
      var0.class_(new rgn_3("commands.save.saving"), false);
      rnW_2 var2 = var0.super_();
      var2.x().implements_();
      boolean var3 = var2.class_(true, var1, true);
      if (!var3) {
         throw class_.create();
      } else {
         var0.class_(new rgn_3("commands.save.success"), true);
         return 1;
      }
   }
}
