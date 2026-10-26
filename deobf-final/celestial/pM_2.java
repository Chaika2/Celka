package celestial;

import com.google.common.collect.Lists;
import java.util.Collection;

public class pM_2 implements yD_2 {
   private final QY class_;
   private Collection<rfH_2> break_ = Lists.newArrayList();

   public pM_2(QY var1) {
      this.class_ = var1;
   }

   private static void class_(String var0, rfH_2 var1, int var2) {
      double var3 = (double)var1.b_() + 0.5;
      double var5 = (double)var1.c_() + 1.3;
      double var7 = (double)var1.d_() + 0.5;
      yK_2.class_(var0, var3, var5, var7, var2, 0.04F, true, 0.0F, true);
   }

   private static void class_(rfH_2 var0) {
      yK_2.class_(var0.byte_(-0.5, -0.5, -0.5), var0.byte_(1.5, 1.5, 1.5), 1.0F, 0.0F, 0.0F, 0.15F);
      int var1 = -65536;
      class_("Raid center", var0, -65536);
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      rfH_2 var9 = this.break_().byte_();

      for (rfH_2 var11 : this.break_) {
         if (var9.class_(var11, 160.0)) {
            class_(var11);
         }
      }
   }

   public void class_(Collection<rfH_2> var1) {
      this.break_ = var1;
   }

   private ly_3 break_() {
      return ((Hh_1)this.class_.class_[16]).finally_();
   }
}
