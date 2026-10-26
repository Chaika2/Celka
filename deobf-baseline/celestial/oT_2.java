package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Map.Entry;

public class oT_2 {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.locate.failed"));

   private static float id_class(int var0, int var1, int var2, int var3) {
      int var4 = var2 - var0;
      int var5 = var3 - var1;
      return rfU_2.id_byte((float)(var4 * var4 + var5 * var5));
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)gp_3.id_class("locate").requires(var0x -> var0x.id_class(2));

      for (Entry var3 : rrrZ.id_class.entrySet()) {
         var1 = (LiteralArgumentBuilder)var1.then(
            gp_3.id_class((String)var3.getKey()).executes(var1x -> id_class((gy_3)var1x.getSource(), (rrrZ<?>)var3.getValue()))
         );
      }

      var0.register(var1);
   }

   public static int id_class(gy_3 var0, String var1, rfH_2 var2, rfH_2 var3, String var4) {
      int var5 = rfU_2.id_protected(id_class(var2.b_(), var2.d_(), var3.b_(), var3.d_()));
      rVi_1 var6 = rgv_3.id_class((rgP_2)(new rgn_3("chat.coordinates", var3.b_(), "~", var3.d_())))
         .id_class(
            var1x -> var1x.id_class(rgF_2.GREEN)
                  .id_class(new rgl_3(rgH_2.SUGGEST_COMMAND, "/tp @s " + var3.b_() + " ~ " + var3.d_()))
                  .id_class(new rgy_3(rgp_3.id_class, new rgn_3("chat.coordinates.tooltip")))
         );
      var0.id_class(new rgn_3(var4, var1, var6, var5), false);
      return var5;
   }

   private static int id_class(gy_3 var0, rrrZ<?> var1) throws CommandSyntaxException {
      rfH_2 var2 = new rfH_2(var0.id_volatile());
      rfH_2 var3 = var0.id_final().id_class(var1, var2, 100, false);
      if (var3 == null) {
         throw id_class.create();
      } else {
         return id_class(var0, var1.id_catch(), var2, var3, "commands.locate.success");
      }
   }
}
