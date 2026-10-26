package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class oj_3 {
   private static rgP_2 id_class(CommandContext<gy_3> var0, String var1) {
      return new rgn_3("chat.type.emote", ((gy_3)var0.getSource()).id_extends(), var1);
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)gp_3.id_class("me")
            .then(
               gp_3.id_class("action", StringArgumentType.greedyString())
                  .executes(
                     var0x -> {
                        String var1 = StringArgumentType.getString(var0x, "action");
                        an_3 var2 = ((gy_3)var0x.getSource()).id_package();
                        rnW_2 var3 = ((gy_3)var0x.getSource()).id_super();
                        if (var2 != null) {
                           if (var2 instanceof rhN_2) {
                              rgV_2 var4 = ((rhN_2)var2).O();
                              if (var4 != null) {
                                 var4.id_class(var1)
                                    .thenAcceptAsync(var3x -> var3x.ifPresent(var3xx -> var3.x().id_class(id_class(var0x, var3xx), rVU.CHAT, var2.ro())), var3);
                                 return 1;
                              }
                           }

                           var3.x().id_class(id_class(var0x, var1), rVU.CHAT, var2.ro());
                        } else {
                           var3.x().id_class(id_class(var0x, var1), rVU.SYSTEM, rqR_2.id_break);
                        }

                        return 1;
                     }
                  )
            )
      );
   }
}
