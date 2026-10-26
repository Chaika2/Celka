package celestial;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class rXe_1 extends rJr_1 {
   private final rXu_1 class_;
   private final List<rJY> break_ = new ArrayList<>();
   private final int byte_;

   public static rXe_1 byte_(int var0, rhz_3 var1) {
      return new rXe_1(rJP.byte_, var0, var1, 3);
   }

   public rXe_1(rJP<?> var1, int var2, rhz_3 var3, rXu_1 var4, int var5) {
      super(var1, var2);
      class_(var4, var5 * 9);
      this.class_ = var4;
      this.byte_ = var5;
      var4.b_(var3.throws_);
      int var6 = (this.byte_ - 4) * 18;

      for (int var7 = 0; var7 < this.byte_; var7++) {
         for (int var8 = 0; var8 < 9; var8++) {
            this.break_(new rJY(var4, var8 + var7 * 9, 8 + var8 * 18, 18 + var7 * 18));
         }
      }

      for (int var9 = 0; var9 < 3; var9++) {
         for (int var11 = 0; var11 < 9; var11++) {
            this.break_(new rJY(var3, var11 + var9 * 9 + 9, 8 + var11 * 18, 103 + var9 * 18 + var6));
         }
      }

      for (int var10 = 0; var10 < 9; var10++) {
         this.break_(new rJY(var3, var10, 8 + var10 * 18, 161 + var6));
      }
   }

   private rXe_1(rJP<?> var1, int var2, rhz_3 var3, int var4) {
      this(var1, var2, var3, new rXA(9 * var4), var4);
   }

   public static rXe_1 class_(int var0, rhz_3 var1, rXu_1 var2) {
      return new rXe_1(rJP.byte_, var0, var1, var2, 3);
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
   public rdn_3 class_(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.break_;
      rJY var4 = this.throws_.get(var2);
      if (var4 != null && var4.break_()) {
         rdn_3 var5 = var4.class_();
         var3 = var5.implements_();
         if (var2 < this.byte_ * 9) {
            if (!this.class_(var5, this.byte_ * 9, this.throws_.size(), true)) {
               return rdn_3.break_;
            }
         } else if (!this.class_(var5, 0, this.byte_ * 9, false)) {
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

   public rXu_1 class_() {
      return this.class_;
   }

   public static rXe_1 class_(int var0, rhz_3 var1) {
      return new rXe_1(rJP.class_, var0, var1, 1);
   }

   public static rXe_1 break_(int var0, rhz_3 var1) {
      return new rXe_1(rJP.break_, var0, var1, 2);
   }

   public static rXe_1 break_(int var0, rhz_3 var1, rXu_1 var2) {
      return new rXe_1(rJP.case_, var0, var1, var2, 6);
   }

   public int break_() {
      return this.byte_;
   }

   @Override
   public void break_(rhd_3 var1) {
      super.break_(var1);
      this.class_.break_(var1);
   }

   public static rXe_1 throws_(int var0, rhz_3 var1) {
      return new rXe_1(rJP.throws_, var0, var1, 5);
   }

   public static rXe_1 case_(int var0, rhz_3 var1) {
      return new rXe_1(rJP.case_, var0, var1, 6);
   }

   public static rXe_1 protected_(int var0, rhz_3 var1) {
      return new rXe_1(rJP.protected_, var0, var1, 4);
   }
}
