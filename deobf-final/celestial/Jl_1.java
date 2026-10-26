package celestial;

import java.util.Arrays;

final class Jl_1 {
   private static final rpr_3[] throws_ = rpr_3.values();
   private static final int case_ = ryH_2.values().length;
   protected final boolean class_;
   final boolean catch_;
   final int private_;
   final rjC_2[] implements_;
   protected final rjC_2 break_;
   protected final boolean byte_;
   private final boolean[] finally_;
   protected final boolean protected_;

   Jl_1(xc_3 var1) {
      xd_3 var2 = var1.break_();
      this.class_ = var1.implements_(rRx_1.INSTANCE, rfH_2.protected_);
      this.catch_ = var2.a_(var1, rRx_1.INSTANCE, rfH_2.protected_);
      this.private_ = var2.protected_(var1, rRx_1.INSTANCE, rfH_2.protected_);
      if (!var1.native_()) {
         this.implements_ = null;
      } else {
         this.implements_ = new rjC_2[throws_.length];
         rjC_2 var3 = var2.class_(var1, rRx_1.INSTANCE, rfH_2.protected_);

         for (rpr_3 var7 : throws_) {
            this.implements_[var7.ordinal()] = rjw_3.class_(var3, var7);
         }
      }

      this.break_ = var2.break_(var1, rRx_1.INSTANCE, rfH_2.protected_, rjm_3.break_());
      this.byte_ = Arrays.stream(rpB_2.values()).anyMatch(var1x -> this.break_.break_(var1x) < 0.0 || this.break_.byte_(var1x) > 1.0);
      this.finally_ = new boolean[throws_.length * case_];

      for (rpr_3 var14 : throws_) {
         for (ryH_2 var10 : ryH_2.values()) {
            this.finally_[break_(var14, var10)] = var10.class_(var1, rRx_1.INSTANCE, rfH_2.protected_, var14);
         }
      }

      this.protected_ = xd_3.class_(var1.extends_(rRx_1.INSTANCE, rfH_2.protected_));
   }

   public boolean class_(rpr_3 var1, ryH_2 var2) {
      return this.finally_[break_(var1, var2)];
   }

   private static int break_(rpr_3 var0, ryH_2 var1) {
      return var0.ordinal() * case_ + var1.ordinal();
   }
}
