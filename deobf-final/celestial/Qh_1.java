package celestial;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;

public class Qh_1 {
   private final Predicate<ryw_3>[][][] class_;
   private final int break_;
   private final int byte_;
   private final int protected_;

   public int byte_() {
      return this.protected_;
   }

   public Qh_1(Predicate<ryw_3>[][][] var1) {
      this.class_ = var1;
      this.break_ = var1.length;
      if (this.break_ > 0) {
         this.byte_ = var1[0].length;
         if (this.byte_ > 0) {
            this.protected_ = var1[0][0].length;
         } else {
            this.protected_ = 0;
         }
      } else {
         this.byte_ = 0;
         this.protected_ = 0;
      }
   }

   public QJ class_(rRR var1, rfH_2 var2) {
      LoadingCache var3 = class_(var1, false);
      int var4 = Math.max(Math.max(this.protected_, this.byte_), this.break_);

      for (rfH_2 var6 : rfH_2.class_(var2, var2.break_(var4 - 1, var4 - 1, var4 - 1))) {
         for (rpr_3 var10 : rpr_3.values()) {
            for (rpr_3 var14 : rpr_3.values()) {
               if (var14 != var10 && var14 != var10.case_()) {
                  QJ var15 = this.class_(var6, var10, var14, var3);
                  if (var15 != null) {
                     return var15;
                  }
               }
            }
         }
      }

      return null;
   }

   public static LoadingCache<rfH_2, ryw_3> class_(rRR var0, boolean var1) {
      return CacheBuilder.newBuilder().build(new QX(var0, var1));
   }

   protected static rfH_2 class_(rfH_2 var0, rpr_3 var1, rpr_3 var2, int var3, int var4, int var5) {
      if (var1 != var2 && var1 != var2.case_()) {
         rja_3 var6 = new rja_3(var1.implements_(), var1.finally_(), var1.extends_());
         rja_3 var7 = new rja_3(var2.implements_(), var2.finally_(), var2.extends_());
         rja_3 var8 = var6.throws_(var7);
         return var0.break_(
            var7.b_() * -var4 + var8.b_() * var3 + var6.b_() * var5,
            var7.c_() * -var4 + var8.c_() * var3 + var6.c_() * var5,
            var7.d_() * -var4 + var8.d_() * var3 + var6.d_() * var5
         );
      } else {
         throw new IllegalArgumentException("Invalid forwards & up combination");
      }
   }

   private QJ class_(rfH_2 var1, rpr_3 var2, rpr_3 var3, LoadingCache<rfH_2, ryw_3> var4) {
      for (int var5 = 0; var5 < this.protected_; var5++) {
         for (int var6 = 0; var6 < this.byte_; var6++) {
            for (int var7 = 0; var7 < this.break_; var7++) {
               if (!this.class_[var7][var6][var5].test((ryw_3)var4.getUnchecked(class_(var1, var2, var3, var5, var6, var7)))) {
                  return null;
               }
            }
         }
      }

      return new QJ(var1, var2, var3, var4, this.protected_, this.byte_, this.break_);
   }

   public int class_() {
      return this.break_;
   }

   public int break_() {
      return this.byte_;
   }
}
