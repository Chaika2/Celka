package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Map.Entry;

public class oT_2 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.locate.failed"));

   private static float class_(int var0, int var1, int var2, int var3) {
      int var4 = var2 - var0;
      int var5 = var3 - var1;
      return rfU_2.byte_((float)(var4 * var4 + var5 * var5));
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      LiteralArgumentBuilder var1 = (LiteralArgumentBuilder)gp_3.class_("locate").requires(var0x -> var0x.class_(2));

      for (Entry var3 : rrrZ.class_.entrySet()) {
         var1 = (LiteralArgumentBuilder)var1.then(
            gp_3.class_((String)var3.getKey()).executes(var1x -> class_((gy_3)var1x.getSource(), (rrrZ<?>)var3.getValue()))
         );
      }

      var0.register(var1);
   }

   public static int class_(gy_3 var0, String var1, rfH_2 var2, rfH_2 var3, String var4) {
      int var5 = rfU_2.protected_(class_(var2.b_(), var2.d_(), var3.b_(), var3.d_()));
      rVi_1 var6 = rgv_3.class_((rgP_2)(new rgn_3("chat.coordinates", var3.b_(), "~", var3.d_())))
         .class_(
            var1x -> var1x.class_(rgF_2.GREEN)
                  .class_(new rgl_3(rgH_2.SUGGEST_COMMAND, "/tp @s " + var3.b_() + " ~ " + var3.d_()))
                  .class_(new rgy_3(rgp_3.class_, new rgn_3("chat.coordinates.tooltip")))
         );
      var0.class_(new rgn_3(var4, var1, var6, var5), false);
      return var5;
   }

   private static int class_(gy_3 var0, rrrZ<?> var1) throws CommandSyntaxException {
      rfH_2 var2 = new rfH_2(var0.volatile_());
      rfH_2 var3 = var0.final_().class_(var1, var2, 100, false);
      if (var3 == null) {
         throw class_.create();
      } else {
         return class_(var0, var1.catch_(), var2, var3, "commands.locate.success");
      }
   }
}
