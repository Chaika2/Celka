package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class oq_3 {
   public static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.locatebiome.invalid", var0));
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.locatebiome.notFound", var0));

   private static int class_(gy_3 var0, rqO_2 var1) throws CommandSyntaxException {
      rYG var2 = var0.super_().rS().break_(rVL.n).break_(var1).orElseThrow(() -> class_.create(var1));
      rfH_2 var3 = new rfH_2(var0.volatile_());
      rfH_2 var4 = var0.final_().class_(var2, var3, 6400, 8);
      String var5 = var1.toString();
      if (var4 == null) {
         throw break_.create(var5);
      } else {
         return oT_2.class_(var0, var5, var3, var4, "commands.locatebiome.success");
      }
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("locatebiome").requires(var0x -> var0x.class_(2)))
            .then(
               gp_3.class_("biome", Ym_1.class_())
                  .suggests(Yl_1.protected_)
                  .executes(var0x -> class_((gy_3)var0x.getSource(), (rqO_2)var0x.getArgument("biome", rqO_2.class)))
            )
      );
   }
}
