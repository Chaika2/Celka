package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class oR_2 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.pardon.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("pardon").requires(var0x -> var0x.class_(3)))
            .then(
               gp_3.class_("targets", RT.class_())
                  .suggests((var0x, var1) -> gR_2.class_(((gy_3)var0x.getSource()).super_().x().catch_().class_(), var1))
                  .executes(var0x -> class_((gy_3)var0x.getSource(), RT.class_(var0x, "targets")))
            )
      );
   }

   private static int class_(gy_3 var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      rno_3 var2 = var0.super_().x().catch_();
      int var3 = 0;

      for (GameProfile var5 : var1) {
         if (var2.class_(var5)) {
            var2.byte_(var5);
            var3++;
            var0.class_(new rgn_3("commands.pardon.success", rgv_3.class_(var5)), true);
         }
      }

      if (var3 == 0) {
         throw class_.create();
      } else {
         return var3;
      }
   }
}
