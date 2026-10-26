package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class oe_3 {
   private static final Logger id_class = LogManager.getLogger();

   public static void id_class(Collection<String> var0, gy_3 var1) {
      var1.id_super().id_class(var0).exceptionally(var1x -> {
         id_class.warn("Failed to execute reload", var1x);
         var1.id_class(new rgn_3("commands.reload.failure"));
         return null;
      });
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("reload").requires(var0x -> var0x.id_class(2))).executes(var0x -> {
         gy_3 var1 = (gy_3)var0x.getSource();
         rnW_2 var2 = var1.id_super();
         rAt_1 var3 = var2.I();
         rrGP var4 = var2.rB();
         Collection var5 = var3.id_protected();
         Collection var6 = id_class(var3, var4, var5);
         var1.id_class(new rgn_3("commands.reload.success"), true);
         id_class(var6, var1);
         return 0;
      }));
   }

   private static Collection<String> id_class(rAt_1 var0, rrGP var1, Collection<String> var2) {
      var0.id_class();
      ArrayList var3 = Lists.newArrayList(var2);
      List var4 = var1.id_public().id_break();

      for (String var6 : var0.id_break()) {
         if (!var4.contains(var6) && !var3.contains(var6)) {
            var3.add(var6);
         }
      }

      return var3;
   }
}
