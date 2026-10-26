package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;

public class KW {
   public static void class_(CommandDispatcher<gy_3> var0) {
      RequiredArgumentBuilder var1 = (RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.class_("targets", RZ.protected_())
            .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), (rqL_2)null, (rqO_2)null)))
         .then(
            gp_3.class_("*")
               .then(
                  gp_3.class_("sound", Ym_1.class_())
                     .suggests(Yl_1.byte_)
                     .executes(var0x -> class_((gy_3)var0x.getSource(), RZ.case_(var0x, "targets"), (rqL_2)null, Ym_1.throws_(var0x, "sound")))
               )
         );

      for (rqL_2 var5 : rqL_2.values()) {
         var1.then(
            ((LiteralArgumentBuilder)gp_3.class_(var5.class_())
                  .executes(var1x -> class_((gy_3)var1x.getSource(), RZ.case_(var1x, "targets"), var5, (rqO_2)null)))
               .then(
                  gp_3.class_("sound", Ym_1.class_())
                     .suggests(Yl_1.byte_)
                     .executes(var1x -> class_((gy_3)var1x.getSource(), RZ.case_(var1x, "targets"), var5, Ym_1.throws_(var1x, "sound")))
               )
         );
      }

      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("stopsound").requires(var0x -> var0x.class_(2))).then(var1));
   }

   private static int class_(gy_3 var0, Collection<rhN_2> var1, rqL_2 var2, rqO_2 var3) {
      rFz_1 var4 = new rFz_1(var3, var2);

      for (rhN_2 var6 : var1) {
         var6.class_.class_(var4);
      }

      if (var2 != null) {
         if (var3 != null) {
            var0.class_(new rgn_3("commands.stopsound.success.source.sound", var3, var2.class_()), true);
         } else {
            var0.class_(new rgn_3("commands.stopsound.success.source.any", var2.class_()), true);
         }
      } else if (var3 != null) {
         var0.class_(new rgn_3("commands.stopsound.success.sourceless.sound", var3), true);
      } else {
         var0.class_(new rgn_3("commands.stopsound.success.sourceless.any"), true);
      }

      return var1.size();
   }
}
