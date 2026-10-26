package celestial;

import java.util.Optional;

public class Le_1 extends Lf_1<La_1> {
   public Le_1(QY var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.this_ = false;
   }

   public void class_(QF[] var1) {
      for (byte var2 = 0; var2 < var1.length; var2 += 2) {
         this.class_(var1[var2], var2 < var1.length - 1 ? var1[var2 + 1] : null);
      }
   }

   public void class_(QF var1, QF var2) {
      this.break_(La_1.class_((Qw_1)this.native_.class_[20], this.final_, var1, var2));
   }

   public int class_(QF var1) {
      return this.break_(La_1.class_((Qw_1)this.native_.class_[20], this.final_, var1));
   }

   public LZ break_(QF var1) {
      for (La_1 var3 : this.x_()) {
         for (LZ var5 : var3.class_) {
            if (var5 instanceof Lp_1 && ((Lp_1)var5).private_() == var1) {
               return var5;
            }
         }
      }

      return null;
   }

   public Optional<LZ> throws_(double var1, double var3) {
      for (La_1 var6 : this.x_()) {
         for (LZ var8 : var6.class_) {
            if (var8.break_(var1, var3)) {
               return Optional.of(var8);
            }
         }
      }

      return Optional.empty();
   }

   @Override
   protected int protected_() {
      return super.protected_() + 32;
   }

   @Override
   public int F_() {
      return 400;
   }
}
