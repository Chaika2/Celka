package celestial;

import java.util.Optional;

public class Le_1 extends Lf_1<La_1> {
   public Le_1(QY var1, int var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.id_this = false;
   }

   public void id_class(QF[] var1) {
      for (byte var2 = 0; var2 < var1.length; var2 += 2) {
         this.id_class(var1[var2], var2 < var1.length - 1 ? var1[var2 + 1] : null);
      }
   }

   public void id_class(QF var1, QF var2) {
      this.id_break(La_1.id_class((Qw_1)this.id_native.id_class[20], this.id_final, var1, var2));
   }

   public int id_class(QF var1) {
      return this.id_break(La_1.id_class((Qw_1)this.id_native.id_class[20], this.id_final, var1));
   }

   public LZ id_break(QF var1) {
      for (La_1 var3 : this.x_()) {
         for (LZ var5 : var3.id_class) {
            if (var5 instanceof Lp_1 && ((Lp_1)var5).id_private() == var1) {
               return var5;
            }
         }
      }

      return null;
   }

   public Optional<LZ> id_throws(double var1, double var3) {
      for (La_1 var6 : this.x_()) {
         for (LZ var8 : var6.id_class) {
            if (var8.id_break(var1, var3)) {
               return Optional.of(var8);
            }
         }
      }

      return Optional.empty();
   }

   @Override
   protected int id_protected() {
      return super.id_protected() + 32;
   }

   @Override
   public int F_() {
      return 400;
   }
}
