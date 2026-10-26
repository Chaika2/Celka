package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class KP {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.save.alreadyOn"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("save-on").requires(var0x -> var0x.class_(4))).executes(var0x -> {
         gy_3 var1 = (gy_3)var0x.getSource();
         boolean var2 = false;

         for (rrEm_1 var4 : var1.super_().float_()) {
            if (var4 != null && var4.synchronized_) {
               var4.synchronized_ = false;
               var2 = true;
            }
         }

         if (!var2) {
            throw class_.create();
         } else {
            var1.class_(new rgn_3("commands.save.enabled"), true);
            return 1;
         }
      }));
   }
}
