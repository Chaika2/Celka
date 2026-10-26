package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class oy_3 {
   private static int class_(gy_3 var0, Collection<? extends an_3> var1) {
      for (an_3 var3 : var1) {
         var3.j();
      }

      if (var1.size() == 1) {
         var0.class_(new rgn_3("commands.kill.success.single", ((an_3)var1.iterator().next()).L_()), true);
      } else {
         var0.class_(new rgn_3("commands.kill.success.multiple", var1.size()), true);
      }

      return var1.size();
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("kill").requires(var0x -> var0x.class_(2)))
               .executes(var0x -> class_((gy_3)var0x.getSource(), ImmutableList.of(((gy_3)var0x.getSource()).int_()))))
            .then(gp_3.class_("targets", RZ.break_()).executes(var0x -> class_((gy_3)var0x.getSource(), RZ.break_(var0x, "targets"))))
      );
   }
}
