package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class Ri_1 implements Rf_1 {
   private final Yr_1 id_class;
   private final Yr_1 id_break;
   private final Yr_1 id_byte;

   @Override
   public boolean id_byte() {
      return this.id_byte.id_class();
   }

   public Ri_1(Yr_1 var1, Yr_1 var2, Yr_1 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof Ri_1 var2)) {
         return false;
      } else if (!this.id_class.equals(var2.id_class)) {
         return false;
      } else {
         return !this.id_break.equals(var2.id_break) ? false : this.id_byte.equals(var2.id_byte);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.id_class.hashCode();
      var1 = 31 * var1 + this.id_break.hashCode();
      return 31 * var1 + this.id_byte.hashCode();
   }

   public static Ri_1 id_class(StringReader var0, boolean var1) throws CommandSyntaxException {
      int var2 = var0.getCursor();
      Yr_1 var3 = Yr_1.id_class(var0, var1);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         Yr_1 var4 = Yr_1.id_class(var0, false);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            Yr_1 var5 = Yr_1.id_class(var0, var1);
            return new Ri_1(var3, var4, var5);
         } else {
            var0.setCursor(var2);
            throw Yw_1.id_class.createWithContext(var0);
         }
      } else {
         var0.setCursor(var2);
         throw Yw_1.id_class.createWithContext(var0);
      }
   }

   @Override
   public boolean id_class() {
      return this.id_class.id_class();
   }

   @Override
   public rjU_2 id_class(gy_3 var1) {
      rjU_2 var2 = var1.id_volatile();
      return new rjU_2(this.id_class.id_class(var2.id_break), this.id_break.id_class(var2.id_byte), this.id_byte.id_class(var2.id_protected));
   }

   public static Ri_1 id_class(StringReader var0) throws CommandSyntaxException {
      int var1 = var0.getCursor();
      Yr_1 var2 = Yr_1.id_class(var0);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         Yr_1 var3 = Yr_1.id_class(var0);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            Yr_1 var4 = Yr_1.id_class(var0);
            return new Ri_1(var2, var3, var4);
         } else {
            var0.setCursor(var1);
            throw Yw_1.id_class.createWithContext(var0);
         }
      } else {
         var0.setCursor(var1);
         throw Yw_1.id_class.createWithContext(var0);
      }
   }

   @Override
   public rjK_2 id_break(gy_3 var1) {
      rjK_2 var2 = var1.id_continue();
      return new rjK_2((float)this.id_class.id_class((double)var2.id_byte), (float)this.id_break.id_class((double)var2.id_protected));
   }

   @Override
   public boolean id_break() {
      return this.id_break.id_class();
   }

   public static Ri_1 id_protected() {
      return new Ri_1(new Yr_1(true, 0.0), new Yr_1(true, 0.0), new Yr_1(true, 0.0));
   }
}
