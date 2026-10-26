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
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.ban.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("ban").requires(var0x -> var0x.class_(3)))
            .then(
               ((RequiredArgumentBuilder)gp_3.class_("targets", RT.class_())
                     .executes(var0x -> class_((gy_3)var0x.getSource(), RT.class_(var0x, "targets"), (rgP_2)null)))
                  .then(
                     gp_3.class_("reason", YP.class_())
                        .executes(var0x -> class_((gy_3)var0x.getSource(), RT.class_(var0x, "targets"), YP.class_(var0x, "reason")))
                  )
            )
      );
   }

   private static int class_(gy_3 var0, Collection<GameProfile> var1, rgP_2 var2) throws CommandSyntaxException {
      rno_3 var3 = var0.super_().x().catch_();
      int var4 = 0;

      for (GameProfile var6 : var1) {
         if (!var3.class_(var6)) {
            rCJ var7 = new rCJ(var6, (Date)null, var0.native_(), (Date)null, var2 == null ? null : var2.getString());
            var3.class_(var7);
            var4++;
            var0.class_(new rgn_3("commands.ban.success", rgv_3.class_(var6), var7.byte_()), true);
            rhN_2 var8 = var0.super_().x().class_(var6.getId());
            if (var8 != null) {
               var8.class_.class_(new rgn_3("multiplayer.disconnect.banned"));
            }
         }
      }

      if (var4 == 0) {
         throw class_.create();
      } else {
         return var4;
      }
   }
}
