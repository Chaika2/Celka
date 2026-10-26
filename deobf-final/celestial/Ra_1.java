package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;

public class Ra_1 implements Rf_1 {
   private final double class_;
   private final double break_;
   private final double byte_;

   @Override
   public boolean byte_() {
      return true;
   }

   public Ra_1(double var1, double var3, double var5) {
      this.class_ = var1;
      this.break_ = var3;
      this.byte_ = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Ra_1 var2) ? false : this.class_ == var2.class_ && this.break_ == var2.break_ && this.byte_ == var2.byte_;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.class_, this.break_, this.byte_);
   }

   public static Ra_1 class_(StringReader var0) throws CommandSyntaxException {
      int var1 = var0.getCursor();
      double var2 = class_(var0, var1);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         double var4 = class_(var0, var1);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            double var6 = class_(var0, var1);
            return new Ra_1(var2, var4, var6);
         } else {
            var0.setCursor(var1);
            throw Yw_1.class_.createWithContext(var0);
         }
      } else {
         var0.setCursor(var1);
         throw Yw_1.class_.createWithContext(var0);
      }
   }

   private static double class_(StringReader var0, int var1) throws CommandSyntaxException {
      if (!var0.canRead()) {
         throw Yr_1.class_.createWithContext(var0);
      } else if (var0.peek() != '^') {
         var0.setCursor(var1);
         throw Yw_1.break_.createWithContext(var0);
      } else {
         var0.skip();
         return var0.canRead() && var0.peek() != ' ' ? var0.readDouble() : 0.0;
      }
   }

   @Override
   public boolean class_() {
      return true;
   }

   @Override
   public rjU_2 class_(gy_3 var1) {
      rjK_2 var2 = var1.continue_();
      rjU_2 var3 = var1.this_().class_(var1);
      float var4 = rfU_2.break_((var2.protected_ + 90.0F) * (float) (Math.PI / 180.0));
      float var5 = rfU_2.class_((var2.protected_ + 90.0F) * (float) (Math.PI / 180.0));
      float var6 = rfU_2.break_(-var2.byte_ * (float) (Math.PI / 180.0));
      float var7 = rfU_2.class_(-var2.byte_ * (float) (Math.PI / 180.0));
      float var8 = rfU_2.break_((-var2.byte_ + 90.0F) * (float) (Math.PI / 180.0));
      float var9 = rfU_2.class_((-var2.byte_ + 90.0F) * (float) (Math.PI / 180.0));
      rjU_2 var10 = new rjU_2((double)(var4 * var6), (double)var7, (double)(var5 * var6));
      rjU_2 var11 = new rjU_2((double)(var4 * var8), (double)var9, (double)(var5 * var8));
      rjU_2 var12 = var10.byte_(var11).class_(-1.0);
      double var13 = var10.break_ * this.byte_ + var11.break_ * this.break_ + var12.break_ * this.class_;
      double var15 = var10.byte_ * this.byte_ + var11.byte_ * this.break_ + var12.byte_ * this.class_;
      double var17 = var10.protected_ * this.byte_ + var11.protected_ * this.break_ + var12.protected_ * this.class_;
      return new rjU_2(var3.break_ + var13, var3.byte_ + var15, var3.protected_ + var17);
   }

   @Override
   public boolean break_() {
      return true;
   }

   @Override
   public rjK_2 break_(gy_3 var1) {
      return rjK_2.class_;
   }
}
