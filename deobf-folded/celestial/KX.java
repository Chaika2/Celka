package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class KX {
   private static int id_class(gy_3 var0, Collection<rhN_2> var1, rfH_2 var2, float var3) {
      rqM_2 var4 = var0.id_final().E();

      for (rhN_2 var6 : var1) {
         var6.id_class(var4, var2, var3, true, false);
      }

      String var7 = var4.id_class().toString();
      if (var1.size() == 1) {
         var0.id_class(new rgn_3("commands.spawnpoint.success.single", var2.b_(), var2.c_(), var2.d_(), var3, var7, ((rhN_2)var1.iterator().next()).L_()), true);
      } else {
         var0.id_class(new rgn_3("commands.spawnpoint.success.multiple", var2.b_(), var2.c_(), var2.d_(), var3, var7, var1.size()), true);
      }

      return var1.size();
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("spawnpoint").requires(var0x -> var0x.id_class(2)))
               .executes(
                  var0x -> id_class(
                        (gy_3)var0x.getSource(),
                        Collections.singleton(((gy_3)var0x.getSource()).id_new()),
                        new rfH_2(((gy_3)var0x.getSource()).id_volatile()),
                        0.0F
                     )
               ))
            .then(
               ((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected())
                     .executes(
                        var0x -> id_class((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), new rfH_2(((gy_3)var0x.getSource()).id_volatile()), 0.0F)
                     ))
                  .then(
                     ((RequiredArgumentBuilder)gp_3.id_class("pos", RM.id_class())
                           .executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), RM.id_break(var0x, "pos"), 0.0F)))
                        .then(
                           gp_3.id_class("angle", RS.id_class())
                              .executes(
                                 var0x -> id_class(
                                       (gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), RM.id_break(var0x, "pos"), RS.id_class(var0x, "angle")
                                    )
                              )
                        )
                  )
            )
      );
   }
}
