package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.Collection;

public class KW {
   public static void id_class(CommandDispatcher<gy_3> var0) {
      RequiredArgumentBuilder var1 = (RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("targets", RZ.id_protected())
            .executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), (rqL_2)null, (rqO_2)null)))
         .then(
            gp_3.id_class("*")
               .then(
                  gp_3.id_class("sound", Ym_1.id_class())
                     .suggests(Yl_1.id_byte)
                     .executes(var0x -> id_class((gy_3)var0x.getSource(), RZ.id_case(var0x, "targets"), (rqL_2)null, Ym_1.id_throws(var0x, "sound")))
               )
         );

      for (rqL_2 var5 : rqL_2.values()) {
         var1.then(
            ((LiteralArgumentBuilder)gp_3.id_class(var5.id_class())
                  .executes(var1x -> id_class((gy_3)var1x.getSource(), RZ.id_case(var1x, "targets"), var5, (rqO_2)null)))
               .then(
                  gp_3.id_class("sound", Ym_1.id_class())
                     .suggests(Yl_1.id_byte)
                     .executes(var1x -> id_class((gy_3)var1x.getSource(), RZ.id_case(var1x, "targets"), var5, Ym_1.id_throws(var1x, "sound")))
               )
         );
      }

      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("stopsound").requires(var0x -> var0x.id_class(2))).then(var1));
   }

   private static int id_class(gy_3 var0, Collection<rhN_2> var1, rqL_2 var2, rqO_2 var3) {
      rFz_1 var4 = new rFz_1(var3, var2);

      for (rhN_2 var6 : var1) {
         var6.id_class.id_class(var4);
      }

      if (var2 != null) {
         if (var3 != null) {
            var0.id_class(new rgn_3("commands.stopsound.success.source.sound", var3, var2.id_class()), true);
         } else {
            var0.id_class(new rgn_3("commands.stopsound.success.source.any", var2.id_class()), true);
         }
      } else if (var3 != null) {
         var0.id_class(new rgn_3("commands.stopsound.success.sourceless.sound", var3), true);
      } else {
         var0.id_class(new rgn_3("commands.stopsound.success.sourceless.any"), true);
      }

      return var1.size();
   }
}
