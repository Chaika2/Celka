package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class Ys_1 implements ArgumentType<rcd_3> {
   private static final Collection<String> id_class = Arrays.asList("{}", "{foo=bar}");

   private Ys_1() {
   }

   public rcd_3 id_class(StringReader var1) throws CommandSyntaxException {
      return new rcH_2(var1).id_case();
   }

   public static Ys_1 id_class() {
      return new Ys_1();
   }

   public static <S> rcd_3 id_class(CommandContext<S> var0, String var1) {
      return (rcd_3)var0.getArgument(var1, rcd_3.class);
   }

   public Collection<String> getExamples() {
      return id_class;
   }
}
