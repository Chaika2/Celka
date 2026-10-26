package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.regex.Matcher;

public class oY_2 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.pardonip.invalid"));
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.pardonip.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("pardon-ip").requires(var0x -> var0x.class_(3)))
            .then(
               gp_3.class_("target", StringArgumentType.word())
                  .suggests((var0x, var1) -> gR_2.class_(((gy_3)var0x.getSource()).super_().x().private_().class_(), var1))
                  .executes(var0x -> class_((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "target")))
            )
      );
   }

   private static int class_(gy_3 var0, String var1) throws CommandSyntaxException {
      Matcher var2 = oB_2.class_.matcher(var1);
      if (!var2.matches()) {
         throw class_.create();
      } else {
         rnU_2 var3 = var0.super_().x().private_();
         if (!var3.class_(var1)) {
            throw break_.create();
         } else {
            var3.byte_(var1);
            var0.class_(new rgn_3("commands.pardonip.success", var1), true);
            return 1;
         }
      }
   }
}
