package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.function.Supplier;

public class Yv_1 implements ArgumentType<YF> {
   public static final SuggestionProvider<gy_3> class_ = (var0, var1) -> {
      StringReader var2 = new StringReader(var1.getInput());
      var2.setCursor(var1.getStart());
      RC var3 = new RC(var2);

      try {
         var3.super_();
      } catch (CommandSyntaxException var5) {
      }

      return var3.class_(var1, var1x -> gR_2.break_(((gy_3)var0.getSource()).class_(), var1x));
   };
   private static final Collection<String> break_ = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("argument.scoreHolder.empty"));
   final boolean protected_;

   public static Collection<String> byte_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return class_(var0, var1, ((gy_3)var0.getSource()).super_().R()::byte_);
   }

   public Yv_1(boolean var1) {
      this.protected_ = var1;
   }

   public static String class_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return break_(var0, var1).iterator().next();
   }

   public static Yv_1 class_() {
      return new Yv_1(false);
   }

   public static Collection<String> class_(CommandContext<gy_3> var0, String var1, Supplier<Collection<String>> var2) throws CommandSyntaxException {
      Collection var3 = ((YF)var0.getArgument(var1, YF.class)).getNames((gy_3)var0.getSource(), var2);
      if (var3.isEmpty()) {
         throw RZ.protected_.create();
      } else {
         return var3;
      }
   }

   public YF class_(StringReader var1) throws CommandSyntaxException {
      if (var1.canRead() && var1.peek() == '@') {
         RC var5 = new RC(var1);
         Rn_1 var6 = var5.super_();
         if (!this.protected_ && var6.class_() > 1) {
            throw RZ.class_.create();
         } else {
            return new YL(var6);
         }
      } else {
         int var2 = var1.getCursor();

         while (var1.canRead() && var1.peek() != ' ') {
            var1.skip();
         }

         String var3 = var1.getString().substring(var2, var1.getCursor());
         if (var3.equals("*")) {
            return (var0, var1x) -> {
               Collection var2x = var1x.get();
               if (var2x.isEmpty()) {
                  throw byte_.create();
               } else {
                  return var2x;
               }
            };
         } else {
            Set var4 = Collections.singleton(var3);
            return (var1x, var2x) -> var4;
         }
      }
   }

   public static Collection<String> break_(CommandContext<gy_3> var0, String var1) throws CommandSyntaxException {
      return class_(var0, var1, Collections::emptyList);
   }

   public static Yv_1 break_() {
      return new Yv_1(true);
   }

   public Collection<String> getExamples() {
      return break_;
   }
}
