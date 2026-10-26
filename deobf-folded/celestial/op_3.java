package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.List;
import java.util.function.Function;

public class op_3 {
   private static int id_class(gy_3 var0, Function<rhN_2, rgP_2> var1) {
      rCr_1 var2 = var0.id_super().x();
      List var3 = var2.id_super();
      rVi_1 var4 = rgv_3.id_break(var3, var1);
      var0.id_class(new rgn_3("commands.list.players", var3.size(), var2.id_package(), var4), false);
      return var3.size();
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("list").executes(var0x -> id_class((gy_3)var0x.getSource())))
            .then(gp_3.id_class("uuids").executes(var0x -> id_break((gy_3)var0x.getSource())))
      );
   }

   private static int id_class(gy_3 var0) {
      return id_class(var0, rhd_3::L_);
   }

   private static int id_break(gy_3 var0) {
      return id_class(var0, var0x -> new rgn_3("commands.list.nameAndId", var0x.g(), var0x.sv().getId()));
   }
}
