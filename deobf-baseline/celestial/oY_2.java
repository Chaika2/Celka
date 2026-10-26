package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.regex.Matcher;

public class oY_2 {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.pardonip.invalid"));
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.pardonip.failed"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("pardon-ip").requires(var0x -> var0x.id_class(3)))
            .then(
               gp_3.id_class("target", StringArgumentType.word())
                  .suggests((var0x, var1) -> gR_2.id_class(((gy_3)var0x.getSource()).id_super().x().id_private().id_class(), var1))
                  .executes(var0x -> id_class((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "target")))
            )
      );
   }

   private static int id_class(gy_3 var0, String var1) throws CommandSyntaxException {
      Matcher var2 = oB_2.id_class.matcher(var1);
      if (!var2.matches()) {
         throw id_class.create();
      } else {
         rnU_2 var3 = var0.id_super().x().id_private();
         if (!var3.id_class(var1)) {
            throw id_break.create();
         } else {
            var3.id_byte(var1);
            var0.id_class(new rgn_3("commands.pardonip.success", var1), true);
            return 1;
         }
      }
   }
}
