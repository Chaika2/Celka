package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.function.Function;

public class XL {
   public static final XL class_ = new XL((Float)null, (Float)null);
   public static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("argument.range.ints"));
   private final Float byte_;
   private final Float protected_;

   public XL(Float var1, Float var2) {
      this.byte_ = var1;
      this.protected_ = var2;
   }

   private static Float class_(Float var0, Function<Float, Float> var1) {
      return var0 == null ? null : (Float)var1.apply(var0);
   }

   public Float class_() {
      return this.byte_;
   }

   public static XL class_(StringReader var0, boolean var1, Function<Float, Float> var2) throws CommandSyntaxException {
      if (!var0.canRead()) {
         throw Xu_1.class_.createWithContext(var0);
      } else {
         int var3 = var0.getCursor();
         Float var4 = class_(class_(var0, var1), var2);
         Float var5;
         if (var0.canRead(2) && var0.peek() == '.' && var0.peek(1) == '.') {
            var0.skip();
            var0.skip();
            var5 = class_(class_(var0, var1), var2);
            if (var4 == null && var5 == null) {
               var0.setCursor(var3);
               throw Xu_1.class_.createWithContext(var0);
            }
         } else {
            if (!var1 && var0.canRead() && var0.peek() == '.') {
               var0.setCursor(var3);
               throw break_.createWithContext(var0);
            }

            var5 = var4;
         }

         if (var4 == null && var5 == null) {
            var0.setCursor(var3);
            throw Xu_1.class_.createWithContext(var0);
         } else {
            return new XL(var4, var5);
         }
      }
   }

   private static Float class_(StringReader var0, boolean var1) throws CommandSyntaxException {
      int var2 = var0.getCursor();

      while (var0.canRead() && break_(var0, var1)) {
         var0.skip();
      }

      String var3 = var0.getString().substring(var2, var0.getCursor());
      if (var3.isEmpty()) {
         return null;
      } else {
         try {
            return Float.parseFloat(var3);
         } catch (NumberFormatException var5) {
            if (var1) {
               throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidDouble().createWithContext(var0, var3);
            } else {
               throw CommandSyntaxException.BUILT_IN_EXCEPTIONS.readerInvalidInt().createWithContext(var0, var3);
            }
         }
      }
   }

   public Float break_() {
      return this.protected_;
   }

   private static boolean break_(StringReader var0, boolean var1) {
      char var2 = var0.peek();
      if ((var2 < '0' || var2 > '9') && var2 != '-') {
         return var1 && var2 == '.' ? !var0.canRead(2) || var0.peek(1) != '.' : false;
      } else {
         return true;
      }
   }
}
