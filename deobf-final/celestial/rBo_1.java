package celestial;

import java.util.List;
import java.util.stream.Collectors;

public class rBo_1 extends rBU {
   public rBo_1(aA_2 var1, double var2) {
      super(var1, var2, 240, false);
   }

   private rfH_2 class_(rjh_3 var1) {
      rrEm_1 var2 = (rrEm_1)((rYB)this.class_.throws_[7]);
      rga_3 var3 = var2.d();
      List var4 = var3.byte_(var0 -> true, var1.int_(), 8, rRr_1.IS_OCCUPIED).map(rgU_2::throws_).collect(Collectors.toList());
      return var4.isEmpty() ? null : (rfH_2)var4.get(var2.int_.nextInt(var4.size()));
   }

   private boolean class_(rsq_3 var1) {
      return var1.class_(((rYB)this.class_.throws_[7]).r());
   }

   private rjU_2 finally_() {
      return iX_2.break_(this.class_, 10, 7);
   }

   @Override
   protected rjU_2 catch_() {
      float var1 = ((rYB)this.class_.throws_[7]).int_.nextFloat();
      if (((rYB)this.class_.throws_[7]).int_.nextFloat() < 0.3F) {
         return this.finally_();
      } else {
         rjU_2 var2;
         if (var1 < 0.7F) {
            var2 = this.extends_();
            if (var2 == null) {
               var2 = this.native_();
            }
         } else {
            var2 = this.native_();
            if (var2 == null) {
               var2 = this.extends_();
            }
         }

         return var2 == null ? this.finally_() : var2;
      }
   }

   private rjU_2 extends_() {
      rrEm_1 var1 = (rrEm_1)((rYB)this.class_.throws_[7]);
      List var2 = var1.class_(aI_2.D, this.class_.rN().class_(32.0), this::class_);
      if (var2.isEmpty()) {
         return null;
      } else {
         rsq_3 var3 = (rsq_3)var2.get(((rYB)this.class_.throws_[7]).int_.nextInt(var2.size()));
         rjU_2 var4 = var3.Ps();
         return iX_2.class_(this.class_, 10, 7, var4);
      }
   }

   private rjh_3 volatile_() {
      rrEm_1 var1 = (rrEm_1)((rYB)this.class_.throws_[7]);
      List var2 = rjh_3.class_(rjh_3.class_(this.class_), 2).filter(var1x -> var1.break_(var1x) == 0).collect(Collectors.toList());
      return var2.isEmpty() ? null : (rjh_3)var2.get(var1.int_.nextInt(var2.size()));
   }

   private rjU_2 native_() {
      rjh_3 var1 = this.volatile_();
      if (var1 == null) {
         return null;
      } else {
         rfH_2 var2 = this.class_(var1);
         return var2 == null ? null : iX_2.class_(this.class_, 10, 7, rjU_2.protected_(var2));
      }
   }
}
