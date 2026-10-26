package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class KP {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.save.alreadyOn"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("save-on").requires(var0x -> var0x.id_class(4))).executes(var0x -> {
         gy_3 var1 = (gy_3)var0x.getSource();
         boolean var2 = false;

         for (rrEm_1 var4 : var1.id_super().id_float()) {
            if (var4 != null && var4.id_synchronized) {
               var4.id_synchronized = false;
               var2 = true;
            }
         }

         if (!var2) {
            throw id_class.create();
         } else {
            var1.id_class(new rgn_3("commands.save.enabled"), true);
            return 1;
         }
      }));
   }
}
