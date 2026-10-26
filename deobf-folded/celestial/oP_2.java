package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;
import java.util.Date;

public class oP_2 {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.ban.failed"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("ban").requires(var0x -> var0x.id_class(3)))
            .then(
               ((RequiredArgumentBuilder)gp_3.id_class("targets", RT.id_class())
                     .executes(var0x -> id_class((gy_3)var0x.getSource(), RT.id_class(var0x, "targets"), (rgP_2)null)))
                  .then(
                     gp_3.id_class("reason", YP.id_class())
                        .executes(var0x -> id_class((gy_3)var0x.getSource(), RT.id_class(var0x, "targets"), YP.id_class(var0x, "reason")))
                  )
            )
      );
   }

   private static int id_class(gy_3 var0, Collection<GameProfile> var1, rgP_2 var2) throws CommandSyntaxException {
      rno_3 var3 = var0.id_super().x().id_catch();
      int var4 = 0;

      for (GameProfile var6 : var1) {
         if (!var3.id_class(var6)) {
            rCJ var7 = new rCJ(var6, (Date)null, var0.id_native(), (Date)null, var2 == null ? null : var2.getString());
            var3.id_class(var7);
            var4++;
            var0.id_class(new rgn_3("commands.ban.success", rgv_3.id_class(var6), var7.id_byte()), true);
            rhN_2 var8 = var0.id_super().x().id_class(var6.getId());
            if (var8 != null) {
               var8.id_class.id_class(new rgn_3("multiplayer.disconnect.banned"));
            }
         }
      }

      if (var4 == 0) {
         throw id_class.create();
      } else {
         return var4;
      }
   }
}
