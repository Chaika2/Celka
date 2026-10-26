package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class KJ {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.spectate.self"));
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.spectate.not_spectator", var0));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("spectate").requires(var0x -> var0x.id_class(2)))
               .executes(var0x -> id_class((gy_3)var0x.getSource(), (an_3)null, ((gy_3)var0x.getSource()).id_new())))
            .then(
               ((RequiredArgumentBuilder)gp_3.id_class("target", RZ.id_class())
                     .executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_class(var0x, "target"), ((gy_3)var0x.getSource()).id_new())))
                  .then(
                     gp_3.id_class("player", RZ.id_byte())
                        .executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_class(var0x, "target"), RZ.id_throws(var0x, "player")))
                  )
            )
      );
   }

   private static int id_class(gy_3 var0, an_3 var1, rhN_2 var2) throws CommandSyntaxException {
      if (var2 == var1) {
         throw id_class.create();
      } else if (var2.id_finally.id_break() != rRl_1.SPECTATOR) {
         throw id_break.create(var2.L_());
      } else {
         var2.id_abstract(var1);
         if (var1 != null) {
            var0.id_class(new rgn_3("commands.spectate.success.started", var1.L_()), false);
         } else {
            var0.id_class(new rgn_3("commands.spectate.success.stopped"), false);
         }

         return 1;
      }
   }
}
