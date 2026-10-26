package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class YP implements ArgumentType<YB> {
   private static final Collection<String> id_class = Arrays.asList("Hello world!", "foo", "@e", "Hello @p :)");

   public YB id_class(StringReader var1) throws CommandSyntaxException {
      return YB.id_class(var1, true);
   }

   public static YP id_class() {
      return new YP();
   }

   public static rgP_2 id_class(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((YB)var0.getArgument(var1, YB.class)).id_class((gy_3)var0.getSource(), ((gy_3)var0.getSource()).id_class(2));
   }

   public Collection<String> getExamples() {
      return id_class;
   }
}
