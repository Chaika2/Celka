package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.Arrays;
import java.util.Collection;

public class Ym_1 implements ArgumentType<rqO_2> {
   private static final Collection<String> class_ = Arrays.asList("foo", "foo:bar", "012");
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("advancement.advancementNotFound", var0));
   private static final DynamicCommandExceptionType byte_ = new DynamicCommandExceptionType(var0 -> new rgn_3("recipe.notFound", var0));
   private static final DynamicCommandExceptionType protected_ = new DynamicCommandExceptionType(var0 -> new rgn_3("predicate.unknown", var0));
   private static final DynamicCommandExceptionType throws_ = new DynamicCommandExceptionType(var0 -> new rgn_3("attribute.unknown", var0));

   public static rQz_1 byte_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      rqO_2 var2 = (rqO_2)var0.getArgument(var1, rqO_2.class);
      rzZ_2 var3 = ((gy_3)var0.getSource()).super_().K();
      rQz_1 var4 = var3.class_(var2);
      if (var4 == null) {
         throw protected_.create(var2);
      } else {
         return var4;
      }
   }

   public static OT class_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      rqO_2 var2 = (rqO_2)var0.getArgument(var1, rqO_2.class);
      OT var3 = ((gy_3)var0.getSource()).super_().t().class_(var2);
      if (var3 == null) {
         throw break_.create(var2);
      } else {
         return var3;
      }
   }

   public rqO_2 class_(StringReader var1) throws CommandSyntaxException {
      return rqO_2.class_(var1);
   }

   public static Ym_1 class_() {
      return new Ym_1();
   }

   public static rkw_3<?> break_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      rWB var2 = ((gy_3)var0.getSource()).super_().V();
      rqO_2 var3 = (rqO_2)var0.getArgument(var1, rqO_2.class);
      return (rkw_3<?>)var2.class_(var3).orElseThrow(() -> byte_.create(var3));
   }

   public static rqO_2 throws_(CommandContext<gy_3> var0, String var1) {
      return (rqO_2)var0.getArgument(var1, rqO_2.class);
   }

   public static iJ_2 protected_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      rqO_2 var2 = (rqO_2)var0.getArgument(var1, rqO_2.class);
      return rVL.O.break_(var2).orElseThrow(() -> throws_.create(var2));
   }

   public Collection<String> getExamples() {
      return class_;
   }
}
