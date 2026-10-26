package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class YE implements ArgumentType<YJ> {
   private static final Collection<String> byte_ = Arrays.asList("foo", "foo.bar", "foo[0]", "[0]", "[]", "{foo=bar}");
   public static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("arguments.nbtpath.node.invalid"));
   public static final DynamicCommandExceptionType break_ = new DynamicCommandExceptionType(var0 -> new rgn_3("arguments.nbtpath.nothing_found", var0));

   public static YE class_() {
      return new YE();
   }

   private static boolean class_(char var0) {
      return var0 != ' ' && var0 != '"' && var0 != '[' && var0 != ']' && var0 != '.' && var0 != '{' && var0 != '}';
   }

   static Predicate<rcZ_2> class_(rcd_3 var0) {
      return var1 -> rco_3.class_(var0, var1, true);
   }

   public static YJ class_(CommandContext<gy_3> var0, String var1) {
      return (YJ)var0.getArgument(var1, YJ.class);
   }

   public YJ class_(StringReader var1) throws CommandSyntaxException {
      ArrayList var2 = Lists.newArrayList();
      int var3 = var1.getCursor();
      Object2IntOpenHashMap var4 = new Object2IntOpenHashMap();
      boolean var5 = true;

      while (var1.canRead() && var1.peek() != ' ') {
         YO var6 = class_(var1, var5);
         var2.add(var6);
         var4.put(var6, var1.getCursor() - var3);
         var5 = false;
         if (var1.canRead()) {
            char var7 = var1.peek();
            if (var7 != ' ' && var7 != '[' && var7 != '{') {
               var1.expect('.');
            }
         }
      }

      return new YJ(var1.getString().substring(var3, var1.getCursor()), var2.toArray(new YO[0]), var4);
   }

   private static YO class_(StringReader var0, String var1) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '{') {
         rcd_3 var2 = new rcH_2(var0).case_();
         return new Yh_1(var1, var2);
      } else {
         return new Yx_1(var1);
      }
   }

   private static YO class_(StringReader var0, boolean var1) throws CommandSyntaxException {
      switch (var0.peek()) {
         case '"':
            String var2 = var0.readString();
            return class_(var0, var2);
         case '[':
            var0.skip();
            char var3 = var0.peek();
            if (var3 == '{') {
               rcd_3 var7 = new rcH_2(var0).case_();
               var0.expect(']');
               return new YX(var7);
            } else {
               if (var3 == ']') {
                  var0.skip();
                  return YM.class_;
               }

               int var6 = var0.readInt();
               var0.expect(']');
               return new YG(var6);
            }
         case '{':
            if (!var1) {
               throw class_.createWithContext(var0);
            }

            rcd_3 var4 = new rcH_2(var0).case_();
            return new Yb_1(var4);
         default:
            String var5 = break_(var0);
            return class_(var0, var5);
      }
   }

   private static String break_(StringReader var0) throws CommandSyntaxException {
      int var1 = var0.getCursor();

      while (var0.canRead() && class_(var0.peek())) {
         var0.skip();
      }

      if (var0.getCursor() == var1) {
         throw class_.createWithContext(var0);
      } else {
         return var0.getString().substring(var1, var0.getCursor());
      }
   }

   public Collection<String> getExamples() {
      return byte_;
   }
}
