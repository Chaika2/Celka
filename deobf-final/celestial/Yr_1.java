package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Yr_1 {
   public static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("argument.pos.missing.double"));
   public static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("argument.pos.missing.int"));
   private final boolean byte_;
   private final double protected_;

   public Yr_1(boolean var1, double var2) {
      this.byte_ = var1;
      this.protected_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof Yr_1 var2)) {
         return false;
      } else {
         return this.byte_ != var2.byte_ ? false : Double.compare(var2.protected_, this.protected_) == 0;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.byte_ ? 1 : 0;
      long var2 = Double.doubleToLongBits(this.protected_);
      return 31 * var1 + (int)(var2 ^ var2 >>> 32);
   }

   public boolean class_() {
      return this.byte_;
   }

   public static Yr_1 class_(StringReader var0, boolean var1) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '^') {
         throw Yw_1.break_.createWithContext(var0);
      } else if (!var0.canRead()) {
         throw class_.createWithContext(var0);
      } else {
         boolean var2 = break_(var0);
         int var3 = var0.getCursor();
         double var4 = var0.canRead() && var0.peek() != ' ' ? var0.readDouble() : 0.0;
         String var6 = var0.getString().substring(var3, var0.getCursor());
         if (var2 && var6.isEmpty()) {
            return new Yr_1(true, 0.0);
         } else {
            if (!var6.contains(".") && !var2 && var1) {
               var4 += 0.5;
            }

            return new Yr_1(var2, var4);
         }
      }
   }

   public double class_(double var1) {
      return this.byte_ ? this.protected_ + var1 : this.protected_;
   }

   public static Yr_1 class_(StringReader var0) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '^') {
         throw Yw_1.break_.createWithContext(var0);
      } else if (!var0.canRead()) {
         throw break_.createWithContext(var0);
      } else {
         boolean var1 = break_(var0);
         double var2;
         if (var0.canRead() && var0.peek() != ' ') {
            var2 = var1 ? var0.readDouble() : (double)var0.readInt();
         } else {
            var2 = 0.0;
         }

         return new Yr_1(var1, var2);
      }
   }

   public static boolean break_(StringReader var0) {
      boolean var1;
      if (var0.peek() == '~') {
         var1 = true;
         var0.skip();
      } else {
         var1 = false;
      }

      return var1;
   }
}
