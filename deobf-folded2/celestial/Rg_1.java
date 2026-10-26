package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Arrays;
import java.util.Collection;

public class Rg_1 implements Rj_1<XF> {
   private static final Collection<String> id_class = Arrays.asList("0..5", "0", "-5", "-100..", "..100");

   public XF id_class(StringReader var1) throws CommandSyntaxException {
      return XF.id_class(var1);
   }

   public static XF id_class(CommandContext<gy_3> var0, String var1) {
      return (XF)var0.getArgument(var1, XF.class);
   }

   public Collection<String> getExamples() {
      return id_class;
   }
}
