package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class oD_2 {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.publish.failed"));
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.publish.alreadyPublished", var0));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("publish").requires(var0x -> var0x.id_class(4)))
               .executes(var0x -> id_class((gy_3)var0x.getSource(), rpu_3.id_class())))
            .then(
               gp_3.id_class("port", IntegerArgumentType.integer(0, 65535))
                  .executes(var0x -> id_class((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "port")))
            )
      );
   }

   private static int id_class(gy_3 var0, int var1) throws CommandSyntaxException {
      if (var0.id_super().d()) {
         throw id_break.create(var0.id_super().id_short());
      } else if (!var0.id_super().id_class(var0.id_super().id_package(), false, var1)) {
         throw id_class.create();
      } else {
         var0.id_class(new rgn_3("commands.publish.success", var1), true);
         return var1;
      }
   }
}
