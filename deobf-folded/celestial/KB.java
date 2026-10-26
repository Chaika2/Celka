package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class KB {
   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("say").requires(var0x -> var0x.id_class(2)))
            .then(gp_3.id_class("message", YP.id_class()).executes(var0x -> {
               rgP_2 var1 = YP.id_class(var0x, "message");
               rgn_3 var2 = new rgn_3("chat.type.announcement", ((gy_3)var0x.getSource()).id_extends(), var1);
               an_3 var3 = ((gy_3)var0x.getSource()).id_package();
               if (var3 != null) {
                  ((gy_3)var0x.getSource()).id_super().x().id_class(var2, rVU.CHAT, var3.ro());
               } else {
                  ((gy_3)var0x.getSource()).id_super().x().id_class(var2, rVU.SYSTEM, rqR_2.id_break);
               }

               return 1;
            }))
      );
   }
}
