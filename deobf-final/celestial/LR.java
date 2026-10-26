package celestial;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class LR extends Lf_1<Lo_1> {
   final mI_2 class_;
   int throws_;

   public LR(mI_2 var1, QY var2) {
      super(var2, var1.package_ + 45, var1.int_, 43, var1.int_ - 32, 20);
      this.class_ = var1;
      Vu_1[] var3 = (Vu_1[])ArrayUtils.clone(((Qw_1)var2.class_[20]).f);
      Arrays.sort(var3);
      String var4 = null;

      for (Vu_1 var8 : var3) {
         String var9 = var8.throws_();
         if (!var9.equals(var4)) {
            var4 = var9;
            this.break_(new LY(this, new rgn_3(var9)));
         }

         rgn_3 var10 = new rgn_3(var8.catch_());
         int var11 = ((cm_3)var2.class_[15]).class_(var10);
         if (var11 > this.throws_) {
            this.throws_ = var11;
         }

         this.break_(new LK(this, var8, var10));
      }
   }

   @Override
   protected int protected_() {
      return super.protected_() + 15;
   }

   @Override
   public int F_() {
      return super.F_() + 32;
   }
}
