package celestial;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.Collection;

public class oS_2 {
   private static int id_class(gy_3 var0, Collection<? extends rnY_2<?>> var1) {
      if (var1.isEmpty()) {
         var0.id_class(new rgn_3("commands.banlist.none"), false);
      } else {
         var0.id_class(new rgn_3("commands.banlist.list", var1.size()), false);

         for (rnY_2 var3 : var1) {
            var0.id_class(new rgn_3("commands.banlist.entry", var3.id_protected(), var3.id_class(), var3.id_byte()), false);
         }
      }

      return var1.size();
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("banlist")
                     .requires(var0x -> var0x.id_class(3)))
                  .executes(var0x -> {
                     rCr_1 var1 = ((gy_3)var0x.getSource()).id_super().x();
                     return id_class(
                        (gy_3)var0x.getSource(), Lists.newArrayList(Iterables.concat(var1.id_catch().id_protected(), var1.id_private().id_protected()))
                     );
                  }))
               .then(
                  gp_3.id_class("ips")
                     .executes(var0x -> id_class((gy_3)var0x.getSource(), ((gy_3)var0x.getSource()).id_super().x().id_private().id_protected()))
               ))
            .then(
               gp_3.id_class("players")
                  .executes(var0x -> id_class((gy_3)var0x.getSource(), ((gy_3)var0x.getSource()).id_super().x().id_catch().id_protected()))
            )
      );
   }
}
