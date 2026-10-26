package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class KE {
   public static void class_(CommandDispatcher<gy_3> var0, boolean var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("seed").requires(var1x -> !var1 || var1x.class_(2)))
            .executes(
               var0x -> {
                  long var1x = ((gy_3)var0x.getSource()).final_().break_();
                  rVi_1 var3 = rgv_3.class_(
                     (rgP_2)new rgN_2(String.valueOf(var1x))
                        .class_(
                           var2 -> var2.class_(rgF_2.GREEN)
                                 .class_(new rgl_3(rgH_2.COPY_TO_CLIPBOARD, String.valueOf(var1x)))
                                 .class_(new rgy_3(rgp_3.class_, new rgn_3("chat.copy.click")))
                                 .class_(String.valueOf(var1x))
                        )
                  );
                  ((gy_3)var0x.getSource()).class_(new rgn_3("commands.seed.success", var3), false);
                  return (int)var1x;
               }
            )
      );
   }
}
