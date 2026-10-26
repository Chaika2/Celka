package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class KB {
   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("say").requires(var0x -> var0x.class_(2)))
            .then(gp_3.class_("message", YP.class_()).executes(var0x -> {
               rgP_2 var1 = YP.class_(var0x, "message");
               rgn_3 var2 = new rgn_3("chat.type.announcement", ((gy_3)var0x.getSource()).extends_(), var1);
               an_3 var3 = ((gy_3)var0x.getSource()).package_();
               if (var3 != null) {
                  ((gy_3)var0x.getSource()).super_().x().class_(var2, rVU.CHAT, var3.ro());
               } else {
                  ((gy_3)var0x.getSource()).super_().x().class_(var2, rVU.SYSTEM, rqR_2.break_);
               }

               return 1;
            }))
      );
   }
}
