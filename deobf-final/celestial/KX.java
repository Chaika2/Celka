package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;
import java.util.Collections;

public class KX {
   private static int class_(gy_3 var0, Collection<rhN_2> var1, rfH_2 var2, float var3) {
      rqM_2 var4 = var0.final_().E();

      for (rhN_2 var6 : var1) {
         var6.class_(var4, var2, var3, true, false);
      }

      String var7 = var4.class_().toString();
      if (var1.size() == 1) {
         var0.class_(new rgn_3("commands.spawnpoint.success.single", var2.b_(), var2.c_(), var2.d_(), var3, var7, ((rhN_2)var1.iterator().next()).L_()), true);
      } else {
         var0.class_(new rgn_3("commands.spawnpoint.success.multiple", var2.b_(), var2.c_(), var2.d_(), var3, var7, var1.size()), true);
      }

      return var1.size();
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("spawnpoint").requires(var0x -> var0x.class_(2)))
               .executes(
                  var0x -> class_(
                        (gy_3)var0x.getSource(),
                        Collections.singleton(((gy_3)var0x.getSource()).new_()),
                        new rfH_2(((gy_3)var0x.getSource()).volatile_()),
                        0.0F
                     )
               ))
            .then(
               ((RequiredArgumentBuilder)gp_3.class_("targets", RZ.protected_())
                     .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), new rfH_2(((gy_3)var0x.getSource()).volatile_()), 0.0F)))
                  .then(
                     ((RequiredArgumentBuilder)gp_3.class_("pos", RM.class_())
                           .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), RM.break_(var0x, "pos"), 0.0F)))
                        .then(
                           gp_3.class_("angle", RS.class_())
                              .executes(
                                 var0x -> class_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), RM.break_(var0x, "pos"), RS.class_(var0x, "angle"))
                              )
                        )
                  )
            )
      );
   }
}
