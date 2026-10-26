package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;

public class Yy_1 implements ArgumentType<EnumSet<rpB_2>> {
   private static final Collection<String> class_ = Arrays.asList("xyz", "x");
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("arguments.swizzle.invalid"));

   public EnumSet<rpB_2> class_(StringReader var1) throws CommandSyntaxException {
      EnumSet var2 = EnumSet.noneOf(rpB_2.class);

      while (var1.canRead() && var1.peek() != ' ') {
         char var3 = var1.read();

         rpB_2 var4 = switch (var3) {
            case 'x' -> rpB_2.X;
            case 'y' -> rpB_2.Y;
            case 'z' -> rpB_2.Z;
            default -> throw break_.create();
         };
         if (var2.contains(var4)) {
            throw break_.create();
         }

         var2.add(var4);
      }

      return var2;
   }

   public static Yy_1 class_() {
      return new Yy_1();
   }

   public static EnumSet<rpB_2> class_(CommandContext<gy_3> var0, String var1) {
      return (EnumSet<rpB_2>)var0.getArgument(var1, EnumSet.class);
   }

   public Collection<String> getExamples() {
      return class_;
   }
}
