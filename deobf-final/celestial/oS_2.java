package celestial;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class oS_2 {
   private static int class_(gy_3 var0, Collection<? extends rnY_2<?>> var1) {
      if (var1.isEmpty()) {
         var0.class_(new rgn_3("commands.banlist.none"), false);
      } else {
         var0.class_(new rgn_3("commands.banlist.list", var1.size()), false);

         for (rnY_2 var3 : var1) {
            var0.class_(new rgn_3("commands.banlist.entry", var3.protected_(), var3.class_(), var3.byte_()), false);
         }
      }

      return var1.size();
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("banlist")
                     .requires(var0x -> var0x.class_(3)))
                  .executes(var0x -> {
                     rCr_1 var1 = ((gy_3)var0x.getSource()).super_().x();
                     return class_((gy_3)var0x.getSource(), Lists.newArrayList(Iterables.concat(var1.catch_().protected_(), var1.private_().protected_())));
                  }))
               .then(gp_3.class_("ips").executes(var0x -> class_((gy_3)var0x.getSource(), ((gy_3)var0x.getSource()).super_().x().private_().protected_()))))
            .then(gp_3.class_("players").executes(var0x -> class_((gy_3)var0x.getSource(), ((gy_3)var0x.getSource()).super_().x().catch_().protected_())))
      );
   }
}
