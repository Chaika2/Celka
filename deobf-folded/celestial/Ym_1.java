package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class Ym_1 implements ArgumentType<rqO_2> {
   private static final Collection<String> id_class = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType id_break = new DynamicCommandExceptionType(var0 -> new rgn_3("advancement.advancementNotFound", var0));
   private static final DynamicCommandExceptionType id_byte = new DynamicCommandExceptionType(var0 -> new rgn_3("recipe.notFound", var0));
   private static final DynamicCommandExceptionType id_protected = new DynamicCommandExceptionType(var0 -> new rgn_3("predicate.unknown", var0));
   private static final DynamicCommandExceptionType id_throws = new DynamicCommandExceptionType(var0 -> new rgn_3("attribute.unknown", var0));

   public static rQz_1 id_byte(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      rqO_2 var2 = (rqO_2)var0.getArgument(var1, rqO_2.class);
      rzZ_2 var3 = ((gy_3)var0.getSource()).id_super().K();
      rQz_1 var4 = var3.id_class(var2);
      if (var4 == null) {
         throw id_protected.create(var2);
      } else {
         return var4;
      }
   }

   public static OT id_class(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      rqO_2 var2 = (rqO_2)var0.getArgument(var1, rqO_2.class);
      OT var3 = ((gy_3)var0.getSource()).id_super().t().id_class(var2);
      if (var3 == null) {
         throw id_break.create(var2);
      } else {
         return var3;
      }
   }

   public rqO_2 id_class(StringReader var1) throws CommandSyntaxException {
      return rqO_2.id_class(var1);
   }

   public static Ym_1 id_class() {
      return new Ym_1();
   }

   public static rkw_3<?> id_break(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      rWB var2 = ((gy_3)var0.getSource()).id_super().V();
      rqO_2 var3 = (rqO_2)var0.getArgument(var1, rqO_2.class);
      return (rkw_3<?>)var2.id_class(var3).orElseThrow(() -> id_byte.create(var3));
   }

   public static rqO_2 id_throws(CommandContext<gy_3> var0, String var1) {
      return (rqO_2)var0.getArgument(var1, rqO_2.class);
   }

   public static iJ_2 id_protected(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      rqO_2 var2 = (rqO_2)var0.getArgument(var1, rqO_2.class);
      return rVL.O.id_break(var2).orElseThrow(() -> id_throws.create(var2));
   }

   public Collection<String> getExamples() {
      return id_class;
   }
}
