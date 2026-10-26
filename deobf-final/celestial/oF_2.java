package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;

public class oF_2 {
   public static final SuggestionProvider<gy_3> class_ = (var0, var1) -> {
      Oa_1 var2 = ((gy_3)var0.getSource()).super_().w();
      gR_2.class_(var2.case_(), var1, "#");
      return gR_2.class_(var2.throws_(), var1);
   };

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("function").requires(var0x -> var0x.class_(2)))
            .then(gp_3.class_("name", RH.class_()).suggests(class_).executes(var0x -> class_((gy_3)var0x.getSource(), RH.class_(var0x, "name"))))
      );
   }

   private static int class_(gy_3 var0, Collection<gt_3> var1) {
      int var2 = 0;

      for (gt_3 var4 : var1) {
         var2 += var0.super_().w().class_(var4, var0.finally_().byte_(2));
      }

      if (var1.size() == 1) {
         var0.class_(new rgn_3("commands.function.success.single", var2, ((gt_3)var1.iterator().next()).class_()), true);
      } else {
         var0.class_(new rgn_3("commands.function.success.multiple", var2, var1.size()), true);
      }

      return var2;
   }
}
