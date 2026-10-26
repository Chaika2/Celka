package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class og_3 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.op.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("op").requires(var0x -> var0x.class_(3)))
            .then(gp_3.class_("targets", RT.class_()).suggests((var0x, var1) -> {
               rCr_1 var2 = ((gy_3)var0x.getSource()).super_().x();
               return gR_2.break_(var2.super_().stream().filter(var1x -> !var2.case_(var1x.sv())).map(var0xx -> var0xx.sv().getName()), var1);
            }).executes(var0x -> class_((gy_3)var0x.getSource(), RT.class_(var0x, "targets"))))
      );
   }

   private static int class_(gy_3 var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      rCr_1 var2 = var0.super_().x();
      int var3 = 0;

      for (GameProfile var5 : var1) {
         if (!var2.case_(var5)) {
            var2.class_(var5);
            var3++;
            var0.class_(new rgn_3("commands.op.success", ((GameProfile)var1.iterator().next()).getName()), true);
         }
      }

      if (var3 == 0) {
         throw class_.create();
      } else {
         return var3;
      }
   }
}
