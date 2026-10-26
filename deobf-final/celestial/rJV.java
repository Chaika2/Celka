package celestial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class rJV extends rJr_1 {
   private final rXu_1 class_;

   public rJV(int var1, rhz_3 var2) {
      this(var1, var2, new rXA(27));
   }

   public rJV(int var1, rhz_3 var2, rXu_1 var3) {
      super(rJP.this_, var1);
      class_(var3, 27);
      this.class_ = var3;
      var3.b_(var2.throws_);
      byte var4 = 3;
      byte var5 = 9;

      for (int var6 = 0; var6 < 3; var6++) {
         for (int var7 = 0; var7 < 9; var7++) {
            this.break_(new rJg_1(var3, var7 + var6 * 9, 8 + var7 * 18, 18 + var6 * 18));
         }
      }

      for (int var8 = 0; var8 < 3; var8++) {
         for (int var10 = 0; var10 < 9; var10++) {
            this.break_(new rJY(var2, var10 + var8 * 9 + 9, 8 + var10 * 18, 84 + var8 * 18));
         }
      }

      for (int var9 = 0; var9 < 9; var9++) {
         this.break_(new rJY(var2, var9, 8 + var9 * 18, 142));
      }
   }

   @Override
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         if (var2 < this.class_.else_()) {
            if (!this.class_(var5, this.class_.else_(), this.throws_.size(), true)) {
               return rdn_3.break_;
            }
         } else if (!this.class_(var5, 0, this.class_.else_(), false)) {
            return rdn_3.break_;
         }

         if (var5.class_()) {
            var4.break_(rdn_3.break_);
         } else {
            var4.byte_();
         }
      }

      return var3;
   }

   @Override
   public List<rJY> class_(@Nullable Predicate<rJY> var1) {
      ArrayList var2 = new ArrayList();

      for (rJY var4 : this.throws_) {
         if (var4.byte_ == this.class_ && (var1 == null || var1.test(var4))) {
            var2.add(var4);
         }
      }

      return var2;
   }

   @Override
   public boolean class_(rhd_3 var1) {
      return this.class_.byte_(var1);
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.class_.break_(var1);
   }
}
