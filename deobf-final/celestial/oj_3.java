package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;

public class oj_3 {
   private static rgP_2 class_(CommandContext<gy_3> var0, String var1) {
      return new rgn_3("chat.type.emote", ((gy_3)var0.getSource()).extends_(), var1);
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register((LiteralArgumentBuilder)gp_3.class_("me").then(gp_3.class_("action", StringArgumentType.greedyString()).executes(var0x -> {
         String var1 = StringArgumentType.getString(var0x, "action");
         an_3 var2 = ((gy_3)var0x.getSource()).package_();
         rnW_2 var3 = ((gy_3)var0x.getSource()).super_();
         if (var2 != null) {
            if (var2 instanceof rhN_2) {
               rgV_2 var4 = ((rhN_2)var2).O();
               if (var4 != null) {
                  var4.class_(var1).thenAcceptAsync(var3x -> var3x.ifPresent(var3xx -> var3.x().class_(class_(var0x, var3xx), rVU.CHAT, var2.ro())), var3);
                  return 1;
               }
            }

            var3.x().class_(class_(var0x, var1), rVU.CHAT, var2.ro());
         } else {
            var3.x().class_(class_(var0x, var1), rVU.SYSTEM, rqR_2.break_);
         }

         return 1;
      })));
   }
}
