package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;

public class Ra_1 implements Rf_1 {
   private final double id_class;
   private final double id_break;
   private final double id_byte;

   @Override
   public boolean id_byte() {
      return true;
   }

   public Ra_1(double var1, double var3, double var5) {
      this.id_class = var1;
      this.id_break = var3;
      this.id_byte = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Ra_1 var2) ? false : this.id_class == var2.id_class && this.id_break == var2.id_break && this.id_byte == var2.id_byte;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id_class, this.id_break, this.id_byte);
   }

   public static Ra_1 id_class(StringReader var0) throws CommandSyntaxException {
      int var1 = var0.getCursor();
      double var2 = id_class(var0, var1);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         double var4 = id_class(var0, var1);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            double var6 = id_class(var0, var1);
            return new Ra_1(var2, var4, var6);
         } else {
            var0.setCursor(var1);
            throw Yw_1.id_class.createWithContext(var0);
         }
      } else {
         var0.setCursor(var1);
         throw Yw_1.id_class.createWithContext(var0);
      }
   }

   private static double id_class(StringReader var0, int var1) throws CommandSyntaxException {
      if (!var0.canRead()) {
         throw Yr_1.id_class.createWithContext(var0);
      } else if (var0.peek() != '^') {
         var0.setCursor(var1);
         throw Yw_1.id_break.createWithContext(var0);
      } else {
         var0.skip();
         return var0.canRead() && var0.peek() != ' ' ? var0.readDouble() : 0.0;
      }
   }

   @Override
   public boolean id_class() {
      return true;
   }

   @Override
   public rjU_2 id_class(gy_3 var1) {
      rjK_2 var2 = var1.id_continue();
      rjU_2 var3 = var1.id_this().id_class(var1);
      float var4 = rfU_2.id_break((var2.id_protected + 90.0F) * (float) (Math.PI / 180.0));
      float var5 = rfU_2.id_class((var2.id_protected + 90.0F) * (float) (Math.PI / 180.0));
      float var6 = rfU_2.id_break(-var2.id_byte * (float) (Math.PI / 180.0));
      float var7 = rfU_2.id_class(-var2.id_byte * (float) (Math.PI / 180.0));
      float var8 = rfU_2.id_break((-var2.id_byte + 90.0F) * (float) (Math.PI / 180.0));
      float var9 = rfU_2.id_class((-var2.id_byte + 90.0F) * (float) (Math.PI / 180.0));
      rjU_2 var10 = new rjU_2((double)(var4 * var6), (double)var7, (double)(var5 * var6));
      rjU_2 var11 = new rjU_2((double)(var4 * var8), (double)var9, (double)(var5 * var8));
      rjU_2 var12 = var10.id_byte(var11).id_class(-1.0);
      double var13 = var10.id_break * this.id_byte + var11.id_break * this.id_break + var12.id_break * this.id_class;
      double var15 = var10.id_byte * this.id_byte + var11.id_byte * this.id_break + var12.id_byte * this.id_class;
      double var17 = var10.id_protected * this.id_byte + var11.id_protected * this.id_break + var12.id_protected * this.id_class;
      return new rjU_2(var3.id_break + var13, var3.id_byte + var15, var3.id_protected + var17);
   }

   @Override
   public boolean id_break() {
      return true;
   }

   @Override
   public rjK_2 id_break(gy_3 var1) {
      return rjK_2.id_class;
   }
}
