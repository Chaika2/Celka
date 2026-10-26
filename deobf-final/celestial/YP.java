package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class YP implements ArgumentType<YB> {
   private static final Collection<String> class_ = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");

   public YB class_(StringReader var1) throws CommandSyntaxException {
      return YB.class_(var1, true);
   }

   public static YP class_() {
      return new YP();
   }

   public static rgP_2 class_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((YB)var0.getArgument(var1, YB.class)).class_((gy_3)var0.getSource(), ((gy_3)var0.getSource()).class_(2));
   }

   public Collection<String> getExamples() {
      return class_;
   }
}
