package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Kr_1 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.save.alreadyOff"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("save-off").requires(var0x -> var0x.class_(4))).executes(var0x -> {
         gy_3 var1 = (gy_3)var0x.getSource();
         boolean var2 = false;

         for (rrEm_1 var4 : var1.super_().float_()) {
            if (var4 != null && !var4.synchronized_) {
               var4.synchronized_ = true;
               var2 = true;
            }
         }

         if (!var2) {
            throw class_.create();
         } else {
            var1.class_(new rgn_3("commands.save.disabled"), true);
            return 1;
         }
      }));
   }
}
