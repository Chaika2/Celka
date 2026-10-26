package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;

public class od_3 {
   private static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(var0 -> new rgn_3("commands.difficulty.failure", var0));

   public static void class_(CommandDispatcher<gy_3> var0) {
      LiteralArgumentBuilder var1 = gp_3.class_("difficulty");

      for (rRO var5 : rRO.values()) {
         var1.then(gp_3.class_(var5.byte_()).executes(var1x -> class_((gy_3)var1x.getSource(), var5)));
      }

      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)var1.requires(var0x -> var0x.class_(2))).executes(var0x -> {
         rRO var1x = ((gy_3)var0x.getSource()).final_().abstract_();
         ((gy_3)var0x.getSource()).class_(new rgn_3("commands.difficulty.query", var1x.break_()), false);
         return var1x.class_();
      }));
   }

   public static int class_(gy_3 var0, rRO var1) throws CommandSyntaxException {
      rnW_2 var2 = var0.super_();
      if (var2.rB().extends_() == var1) {
         throw class_.create(var1.byte_());
      } else {
         var2.class_(var1, true);
         var0.class_(new rgn_3("commands.difficulty.success", var1.break_()), true);
         return 0;
      }
   }
}
