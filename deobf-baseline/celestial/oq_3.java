package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class oq_3 {
   public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.locatebiome.invalid", var0));
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.locatebiome.notFound", var0));

   private static int id_class(gy_3 var0, rqO_2 var1) throws CommandSyntaxException {
      rYG var2 = var0.id_super().rS().id_break(rVL.n).id_break(var1).orElseThrow(() -> id_class.create(var1));
      rfH_2 var3 = new rfH_2(var0.id_volatile());
      rfH_2 var4 = var0.id_final().id_class(var2, var3, 6400, 8);
      String var5 = var1.toString();
      if (var4 == null) {
         throw id_break.create(var5);
      } else {
         return oT_2.id_class(var0, var5, var3, var4, "commands.locatebiome.success");
      }
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("locatebiome").requires(var0x -> var0x.id_class(2)))
            .then(
               gp_3.id_class("biome", Ym_1.id_class())
                  .suggests(Yl_1.id_protected)
                  .executes(var0x -> id_class((gy_3)var0x.getSource(), (rqO_2)var0x.getArgument("biome", rqO_2.class)))
            )
      );
   }
}
