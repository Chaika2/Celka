package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class Yd_1 implements ArgumentType<rcZ_2> {
   private static final Collection<String> class_ = Arrays.asList("0", "0b", "0l", "0.0", "\"foo\"", "{foo=bar}", "[0]");

   private Yd_1() {
   }

   public rcZ_2 class_(StringReader var1) throws CommandSyntaxException {
      return new rcH_2(var1).protected_();
   }

   public static Yd_1 class_() {
      return new Yd_1();
   }

   public static <S> rcZ_2 class_(CommandContext<S> var0, String var1) {
      return (rcZ_2)var0.getArgument(var1, rcZ_2.class);
   }

   public Collection<String> getExamples() {
      return class_;
   }
}
