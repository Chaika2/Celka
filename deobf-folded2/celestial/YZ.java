package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class YZ implements ArgumentType<Rf_1> {
   private static final Collection<String> id_break = Arrays.asList("0 0", "~ ~", "~-5 ~5");
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("argument.rotation.incomplete"));

   public Rf_1 id_class(StringReader var1) throws CommandSyntaxException {
      int var2 = var1.getCursor();
      if (!var1.canRead()) {
         throw id_class.createWithContext(var1);
      } else {
         Yr_1 var3 = Yr_1.id_class(var1, false);
         if (var1.canRead() && var1.peek() == ' ') {
            var1.skip();
            Yr_1 var4 = Yr_1.id_class(var1, false);
            return new Ri_1(var4, var3, new Yr_1(true, 0.0));
         } else {
            var1.setCursor(var2);
            throw id_class.createWithContext(var1);
         }
      }
   }

   public static YZ id_class() {
      return new YZ();
   }

   public static Rf_1 id_class(CommandContext<gy_3> var0, String var1) {
      return (Rf_1)var0.getArgument(var1, Rf_1.class);
   }

   public Collection<String> getExamples() {
      return id_break;
   }
}
