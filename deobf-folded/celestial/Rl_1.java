package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class Rl_1 implements ArgumentType<rqO_2> {
   private static final Collection<String> id_break = Arrays.asList("minecraft:pig", "cow");
   public static final DynamicCommandExceptionType id_class = new DynamicCommandExceptionType(var0 -> new rgn_3("entity.notFound", var0));

   public static Rl_1 id_class() {
      return new Rl_1();
   }

   public rqO_2 id_class(StringReader var1) throws CommandSyntaxException {
      return id_class(rqO_2.id_class(var1));
   }

   private static rqO_2 id_class(rqO_2 var0) throws CommandSyntaxException {
      rVL.id_transient.id_break(var0).filter(aI_2::id_break).orElseThrow(() -> id_class.create(var0));
      return var0;
   }

   public static rqO_2 id_class(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return id_class((rqO_2)var0.getArgument(var1, rqO_2.class));
   }

   public Collection<String> getExamples() {
      return id_break;
   }
}
