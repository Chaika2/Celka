package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class Rl_1 implements ArgumentType<rqO_2> {
   private static final Collection<String> break_ = Arrays.asList("minecraft:pig", "cow");
   public static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(var0 -> new rgn_3("entity.notFound", var0));

   public static Rl_1 class_() {
      return new Rl_1();
   }

   public rqO_2 class_(StringReader var1) throws CommandSyntaxException {
      return class_(rqO_2.class_(var1));
   }

   private static rqO_2 class_(rqO_2 var0) throws CommandSyntaxException {
      rVL.transient_.break_(var0).filter(aI_2::break_).orElseThrow(() -> class_.create(var0));
      return var0;
   }

   public static rqO_2 class_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return class_((rqO_2)var0.getArgument(var1, rqO_2.class));
   }

   public Collection<String> getExamples() {
      return break_;
   }
}
