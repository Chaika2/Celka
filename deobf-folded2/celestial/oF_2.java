package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;

public class oF_2 {
   public static final SuggestionProvider<gy_3> id_class = (var0, var1) -> {
      Oa_1 var2 = ((gy_3)var0.getSource()).id_super().w();
      gR_2.id_class(var2.id_case(), var1, "#");
      return gR_2.id_class(var2.id_throws(), var1);
   };

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("function").requires(var0x -> var0x.id_class(2)))
            .then(gp_3.id_class("name", RH.id_class()).suggests(id_class).executes(var0x -> id_class((gy_3)var0x.getSource(), RH.id_class(var0x, "name"))))
      );
   }

   private static int id_class(gy_3 var0, Collection<gt_3> var1) {
      int var2 = 0;

      for (gt_3 var4 : var1) {
         var2 += var0.id_super().w().id_class(var4, var0.id_finally().id_byte(2));
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.function.success.single", var2, ((gt_3)var1.iterator().next()).id_class()), true);
      } else {
         var0.id_class(new rgn_3("commands.function.success.multiple", var2, var1.size()), true);
      }

      return var2;
   }
}
