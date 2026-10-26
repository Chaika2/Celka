package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class RS implements ArgumentType<Rs_1> {
   private static final Collection<String> id_break = Arrays.asList("0", "~", "~-5");
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("argument.angle.incomplete"));

   public Rs_1 id_class(StringReader var1) throws CommandSyntaxException {
      if (!var1.canRead()) {
         throw id_class.createWithContext(var1);
      } else {
         boolean var2 = Yr_1.id_break(var1);
         float var3 = var1.canRead() && var1.peek() != ' ' ? var1.readFloat() : 0.0F;
         return new Rs_1(var3, var2);
      }
   }

   public static RS id_class() {
      return new RS();
   }

   public static float id_class(CommandContext<gy_3> var0, String var1) {
      return ((Rs_1)var0.getArgument(var1, Rs_1.class)).id_class((gy_3)var0.getSource());
   }

   public Collection<String> getExamples() {
      return id_break;
   }
}
