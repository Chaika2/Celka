package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class rNq_1 extends rzO_2 {
   final List<rNt_1> break_;

   rNq_1(rQz_1[] var1, List<rNt_1> var2) {
      super(var1);
      this.break_ = ImmutableList.copyOf(var2);
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.implements_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      Random var3 = var2.class_();

      for (rNt_1 var5 : this.break_) {
         UUID var6 = var5.throws_;
         if (var6 == null) {
            var6 = UUID.randomUUID();
         }

         rXQ var7 = rqR_2.class_(var5.case_, var3);
         var1.class_(var5.break_, new ix_3(var6, var5.class_, (double)var5.protected_.break_(var3), var5.byte_), var7);
      }

      return var1;
   }
}
