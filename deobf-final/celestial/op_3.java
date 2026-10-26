package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class op_3 {
   private static int class_(gy_3 var0, Function<rhN_2, rgP_2> var1) {
      rCr_1 var2 = var0.super_().x();
      List var3 = var2.super_();
      rVi_1 var4 = rgv_3.break_(var3, var1);
      var0.class_(new rgn_3("commands.list.players", var3.size(), var2.package_(), var4), false);
      return var3.size();
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("list").executes(var0x -> class_((gy_3)var0x.getSource())))
            .then(gp_3.class_("uuids").executes(var0x -> break_((gy_3)var0x.getSource())))
      );
   }

   private static int class_(gy_3 var0) {
      return class_(var0, rhd_3::L_);
   }

   private static int break_(gy_3 var0) {
      return class_(var0, var0x -> new rgn_3("commands.list.nameAndId", var0x.g(), var0x.sv().getId()));
   }
}
