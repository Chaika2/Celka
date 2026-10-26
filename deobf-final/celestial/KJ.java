package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class KJ {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.spectate.self"));
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.spectate.not_spectator", var0));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("spectate").requires(var0x -> var0x.class_(2)))
               .executes(var0x -> class_((gy_3)var0x.getSource(), (an_3)null, ((gy_3)var0x.getSource()).new_())))
            .then(
               ((RequiredArgumentBuilder)gp_3.class_("target", RZ.class_())
                     .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.class_(var0x, "target"), ((gy_3)var0x.getSource()).new_())))
                  .then(
                     gp_3.class_("player", RZ.byte_())
                        .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.class_(var0x, "target"), RZ.throws_(var0x, "player")))
                  )
            )
      );
   }

   private static int class_(gy_3 var0, an_3 var1, rhN_2 var2) throws CommandSyntaxException {
      if (var2 == var1) {
         throw class_.create();
      } else if (var2.finally_.break_() != rRl_1.SPECTATOR) {
         throw break_.create(var2.L_());
      } else {
         var2.abstract_(var1);
         if (var1 != null) {
            var0.class_(new rgn_3("commands.spectate.success.started", var1.L_()), false);
         } else {
            var0.class_(new rgn_3("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
