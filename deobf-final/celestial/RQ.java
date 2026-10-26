package celestial;

import com.google.gson.JsonParseException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class RQ implements ArgumentType<rgP_2> {
   private static final Collection<String> break_ = Arrays.asList("\"hello world\"", "\"\"", "\"{\"text\":\"hello world\"}", "[\"\"]");
   public static final DynamicCommandExceptionType class_ = new DynamicCommandExceptionType(var0 -> new rgn_3("argument.component.invalid", var0));

   private RQ() {
   }

   public static rgP_2 class_(CommandContext<gy_3> var0, String var1) {
      return (rgP_2)var0.getArgument(var1, rgP_2.class);
   }

   public rgP_2 class_(StringReader var1) throws CommandSyntaxException {
      try {
         rVi_1 var2 = rgB_2.class_(var1);
         if (var2 == null) {
            throw class_.createWithContext(var1, "empty");
         } else {
            return var2;
         }
      } catch (JsonParseException var4) {
         String var3 = var4.getCause() != null ? var4.getCause().getMessage() : var4.getMessage();
         throw class_.createWithContext(var1, var3);
      }
   }

   public static RQ class_() {
      return new RQ();
   }

   public Collection<String> getExamples() {
      return break_;
   }
}
