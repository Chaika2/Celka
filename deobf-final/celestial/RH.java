package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Arrays;
import java.util.Collection;

public class RH implements ArgumentType<Rq_1> {
   private static final Collection<String> class_ = Arrays.asList("foo", "foo:bar", "#foo");
   private static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("arguments.function.tag.unknown", var0));
   private static final DynamicCommandExceptionType byte_ = new DynamicCommandExceptionType(var0 -> new rgn_3("arguments.function.unknown", var0));

   public static Collection<gt_3> class_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rq_1)var0.getArgument(var1, Rq_1.class)).class_(var0);
   }

   public static RH class_() {
      return new RH();
   }

   public Rq_1 class_(StringReader var1) throws CommandSyntaxException {
      if (var1.canRead() && var1.peek() == '#') {
         var1.skip();
         rqO_2 var3 = rqO_2.class_(var1);
         return new Ry_1(this, var3);
      } else {
         rqO_2 var2 = rqO_2.class_(var1);
         return new Rp_1(this, var2);
      }
   }

   static gt_3 class_(CommandContext<gy_3> var0, rqO_2 var1) throws CommandSyntaxException {
      return ((gy_3)var0.getSource()).super_().w().class_(var1).orElseThrow(() -> byte_.create(var1.toString()));
   }

   public static Pair<rqO_2, Either<gt_3, rlb_3<gt_3>>> break_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return ((Rq_1)var0.getArgument(var1, Rq_1.class)).break_(var0);
   }

   static rlb_3<gt_3> break_(CommandContext<gy_3> var0, rqO_2 var1) throws CommandSyntaxException {
      rlb_3 var2 = ((gy_3)var0.getSource()).super_().w().break_(var1);
      if (var2 == null) {
         throw break_.create(var1.toString());
      } else {
         return var2;
      }
   }

   public Collection<String> getExamples() {
      return class_;
   }
}
