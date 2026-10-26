package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class oD_2 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.publish.failed"));
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.publish.alreadyPublished", var0));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("publish").requires(var0x -> var0x.class_(4)))
               .executes(var0x -> class_((gy_3)var0x.getSource(), rpu_3.class_())))
            .then(
               gp_3.class_("port", IntegerArgumentType.integer(0, 65535))
                  .executes(var0x -> class_((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "port")))
            )
      );
   }

   private static int class_(gy_3 var0, int var1) throws CommandSyntaxException {
      if (var0.super_().d()) {
         throw break_.create(var0.super_().short_());
      } else if (!var0.super_().class_(var0.super_().package_(), false, var1)) {
         throw class_.create();
      } else {
         var0.class_(new rgn_3("commands.publish.success", var1), true);
         return var1;
      }
   }
}
