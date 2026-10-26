package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class Ri_1 implements Rf_1 {
   private final Yr_1 class_;
   private final Yr_1 break_;
   private final Yr_1 byte_;

   @Override
   public boolean byte_() {
      return this.byte_.class_();
   }

   public Ri_1(Yr_1 var1, Yr_1 var2, Yr_1 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof Ri_1 var2)) {
         return false;
      } else if (!this.class_.equals(var2.class_)) {
         return false;
      } else {
         return !this.break_.equals(var2.break_) ? false : this.byte_.equals(var2.byte_);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.class_.hashCode();
      var1 = 31 * var1 + this.break_.hashCode();
      return 31 * var1 + this.byte_.hashCode();
   }

   public static Ri_1 class_(StringReader var0, boolean var1) throws CommandSyntaxException {
      int var2 = var0.getCursor();
      Yr_1 var3 = Yr_1.class_(var0, var1);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         Yr_1 var4 = Yr_1.class_(var0, false);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            Yr_1 var5 = Yr_1.class_(var0, var1);
            return new Ri_1(var3, var4, var5);
         } else {
            var0.setCursor(var2);
            throw Yw_1.class_.createWithContext(var0);
         }
      } else {
         var0.setCursor(var2);
         throw Yw_1.class_.createWithContext(var0);
      }
   }

   @Override
   public boolean class_() {
      return this.class_.class_();
   }

   @Override
   public rjU_2 class_(gy_3 var1) {
      rjU_2 var2 = var1.volatile_();
      return new rjU_2(this.class_.class_(var2.break_), this.break_.class_(var2.byte_), this.byte_.class_(var2.protected_));
   }

   public static Ri_1 class_(StringReader var0) throws CommandSyntaxException {
      int var1 = var0.getCursor();
      Yr_1 var2 = Yr_1.class_(var0);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         Yr_1 var3 = Yr_1.class_(var0);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            Yr_1 var4 = Yr_1.class_(var0);
            return new Ri_1(var2, var3, var4);
         } else {
            var0.setCursor(var1);
            throw Yw_1.class_.createWithContext(var0);
         }
      } else {
         var0.setCursor(var1);
         throw Yw_1.class_.createWithContext(var0);
      }
   }

   @Override
   public rjK_2 break_(gy_3 var1) {
      rjK_2 var2 = var1.continue_();
      return new rjK_2((float)this.class_.class_((double)var2.byte_), (float)this.break_.class_((double)var2.protected_));
   }

   @Override
   public boolean break_() {
      return this.break_.class_();
   }

   public static Ri_1 protected_() {
      return new Ri_1(new Yr_1(true, 0.0), new Yr_1(true, 0.0), new Yr_1(true, 0.0));
   }
}
