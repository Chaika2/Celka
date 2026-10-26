package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Yr_1 {
   public static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("argument.pos.missing.double"));
   public static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("argument.pos.missing.int"));
   private final boolean id_byte;
   private final double id_protected;

   public Yr_1(boolean var1, double var2) {
      this.id_byte = var1;
      this.id_protected = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof Yr_1 var2)) {
         return false;
      } else {
         return this.id_byte != var2.id_byte ? false : Double.compare(var2.id_protected, this.id_protected) == 0;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.id_byte ? 1 : 0;
      long var2 = Double.doubleToLongBits(this.id_protected);
      return 31 * var1 + (int)(var2 ^ var2 >>> 32);
   }

   public boolean id_class() {
      return this.id_byte;
   }

   public static Yr_1 id_class(StringReader var0, boolean var1) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '^') {
         throw Yw_1.id_break.createWithContext(var0);
      } else if (!var0.canRead()) {
         throw id_class.createWithContext(var0);
      } else {
         boolean var2 = id_break(var0);
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

   public double id_class(double var1) {
      return this.id_byte ? this.id_protected + var1 : this.id_protected;
   }

   public static Yr_1 id_class(StringReader var0) throws CommandSyntaxException {
      if (var0.canRead() && var0.peek() == '^') {
         throw Yw_1.id_break.createWithContext(var0);
      } else if (!var0.canRead()) {
         throw id_break.createWithContext(var0);
      } else {
         boolean var1 = id_break(var0);
         double var2;
         if (var0.canRead() && var0.peek() != ' ') {
            var2 = var1 ? var0.readDouble() : (double)var0.readInt();
         } else {
            var2 = 0.0;
         }

         return new Yr_1(var1, var2);
      }
   }

   public static boolean id_break(StringReader var0) {
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
