package celestial;

import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class rdR_2 extends rdb_3 {
   private static final Map<rqA_2, rdR_2> class_ = Maps.newHashMap();
   private final int break_;
   private final rqA_2 byte_;

   protected rdR_2(int var1, rqA_2 var2, rdO_2 var3) {
      super(var3);
      this.break_ = var1;
      this.byte_ = var2;
      class_.put(this.byte_, this);
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      xc_3 var4 = var2.byte_(var3);
      if (var4.class_(xu_3.Pj) && !var4.byte_(kz_3.volatile_)) {
         rdn_3 var5 = var1.volatile_();
         if (!var2.continue_) {
            ((kz_3)xu_3.Pj).class_(var2, var3, var4, var5);
            var2.class_((rhd_3)null, 1010, var3, rdb_3.class_(this));
            var5.catch_(1);
            rhd_3 var6 = var1.final_();
            if (var6 != null) {
               var6.break_(rlB_2.W);
            }
         }

         return ryZ_2.class_(var2.continue_);
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   public void class_(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      var3.add(this.private_().class_(rgF_2.GRAY));
   }

   public static rdR_2 class_(rqA_2 var0) {
      return class_.get(var0);
   }

   public int catch_() {
      return this.break_;
   }

   public rqA_2 return_() {
      return this.byte_;
   }

   public rVi_1 private_() {
      return new rgn_3(this.break_() + ".desc");
   }
}
