package celestial;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Map;

public class ol_3 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.help.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("help").executes(var1 -> {
         Map var2 = var0.getSmartUsage(var0.getRoot(), (gy_3)var1.getSource());

         for (String var4 : var2.values()) {
            ((gy_3)var1.getSource()).class_(new rgN_2("/" + var4), false);
         }

         return var2.size();
      })).then(gp_3.class_("command", StringArgumentType.greedyString()).executes(var1 -> {
         ParseResults var2 = var0.parse(StringArgumentType.getString(var1, "command"), (gy_3)var1.getSource());
         if (var2.getContext().getNodes().isEmpty()) {
            throw class_.create();
         } else {
            Map var3 = var0.getSmartUsage(((ParsedCommandNode)Iterables.getLast(var2.getContext().getNodes())).getNode(), (gy_3)var1.getSource());

            for (String var5 : var3.values()) {
               ((gy_3)var1.getSource()).class_(new rgN_2("/" + var2.getReader().getString() + " " + var5), false);
            }

            return var3.size();
         }
      })));
   }
}
