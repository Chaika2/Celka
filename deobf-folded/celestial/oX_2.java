package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class oX_2 {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.deop.failed"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("deop").requires(var0x -> var0x.id_class(3)))
            .then(
               gp_3.id_class("targets", RT.id_class())
                  .suggests((var0x, var1) -> gR_2.id_class(((gy_3)var0x.getSource()).id_super().x().id_volatile(), var1))
                  .executes(var0x -> id_class((gy_3)var0x.getSource(), RT.id_class(var0x, "targets")))
            )
      );
   }

   private static int id_class(gy_3 var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      rCr_1 var2 = var0.id_super().x();
      int var3 = 0;

      for (GameProfile var5 : var1) {
         if (var2.id_case(var5)) {
            var2.id_break(var5);
            var3++;
            var0.id_class(new rgn_3("commands.deop.success", ((GameProfile)var1.iterator().next()).getName()), true);
         }
      }

      if (var3 == 0) {
         throw id_class.create();
      } else {
         var0.id_super().id_class(var0);
         return var3;
      }
   }
}
