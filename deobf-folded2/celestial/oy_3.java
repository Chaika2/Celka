package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class oy_3 {
   private static int id_class(gy_3 var0, Collection<? extends an_3> var1) {
      for (an_3 var3 : var1) {
         var3.j();
      }

      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.kill.success.single", ((an_3)var1.iterator().next()).L_()), true);
      } else {
         var0.id_class(new rgn_3("commands.kill.success.multiple", var1.size()), true);
      }

      return var1.size();
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("kill").requires(var0x -> var0x.id_class(2)))
               .executes(var0x -> id_class((gy_3)var0x.getSource(), ImmutableList.of(((gy_3)var0x.getSource()).id_int()))))
            .then(gp_3.id_class("targets", RZ.id_break()).executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_break(var0x, "targets"))))
      );
   }
}
