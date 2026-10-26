package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class KE {
   public static void id_class(CommandDispatcher<gy_3> var0, boolean var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("seed").requires(var1x -> !var1 || var1x.id_class(2)))
            .executes(
               var0x -> {
                  long var1x = ((gy_3)var0x.getSource()).id_final().id_break();
                  rVi_1 var3 = rgv_3.id_class(
                     (rgP_2)new rgN_2(String.valueOf(var1x))
                        .id_class(
                           var2 -> var2.id_class(rgF_2.GREEN)
                                 .id_class(new rgl_3(rgH_2.COPY_TO_CLIPBOARD, String.valueOf(var1x)))
                                 .id_class(new rgy_3(rgp_3.id_class, new rgn_3("chat.copy.click")))
                                 .id_class(String.valueOf(var1x))
                        )
                  );
                  ((gy_3)var0x.getSource()).id_class(new rgn_3("commands.seed.success", var3), false);
                  return (int)var1x;
               }
            )
      );
   }
}
