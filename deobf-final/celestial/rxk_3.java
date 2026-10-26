package celestial;

import java.util.List;
import java.util.function.Predicate;

public class rxk_3 extends rdb_3 {
   private static final Predicate<an_3> class_ = rpJ_2.catch_.and(an_3::rY);
   private final rSe_1 break_;

   public rxk_3(rSe_1 var1, rdO_2 var2) {
      super(var2);
      this.break_ = var1;
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      rff_3 var5 = class_(var1, var2, rjs_3.ANY);
      if (var5.byte_() == rjM_2.MISS) {
         return rym_3.byte_(var4);
      } else {
         rjU_2 var6 = var2.break_(1.0F);
         double var7 = 5.0;
         List var9 = var1.break_(var2, var2.rN().break_(var6.class_(5.0)).class_(1.0), class_);
         if (!var9.isEmpty()) {
            rjU_2 var10 = var2.new_(1.0F);

            for (an_3 var12 : var9) {
               rfl_3 var13 = var12.rN().class_((double)var12.f());
               if (var13.case_(var10)) {
                  return rym_3.byte_(var4);
               }
            }
         }

         if (var5.byte_() == rjM_2.BLOCK) {
            rSK var19 = new rSK(var1, var5.case_().break_, var5.case_().byte_, var5.case_().protected_);
            var19.class_(this.break_);
            Float var18 = (Float)var2.throws_[15];
            var19.throws_[15] = var18;
            if (!var1.a_(var19, var19.rN().class_(-0.1))) {
               return rym_3.protected_(var4);
            } else {
               if (!var1.continue_) {
                  var1.a_(var19);
                  if (!((rhx_3)var2.implements_[18]).protected_) {
                     var4.catch_(1);
                  }
               }

               var2.class_(rlB_2.byte_.break_(this));
               return rym_3.class_(var4, var1.import_());
            }
         } else {
            return rym_3.byte_(var4);
         }
      }
   }
}
