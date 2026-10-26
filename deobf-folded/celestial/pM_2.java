package celestial;

import com.google.common.collect.Lists;
import java.util.Collection;

public class pM_2 implements yD_2 {
   private final QY id_class;
   private Collection<rfH_2> id_break = Lists.newArrayList();

   public pM_2(QY var1) {
      this.id_class = var1;
   }

   private static void id_class(String var0, rfH_2 var1, int var2) {
      double var3 = (double)var1.b_() + 0.5;
      double var5 = (double)var1.c_() + 1.3;
      double var7 = (double)var1.d_() + 0.5;
      yK_2.id_class(var0, var3, var5, var7, var2, 0.04F, true, 0.0F, true);
   }

   private static void id_class(rfH_2 var0) {
      yK_2.id_class(var0.id_byte(-0.5, -0.5, -0.5), var0.id_byte(1.5, 1.5, 1.5), 1.0F, 0.0F, 0.0F, 0.15F);
      int var1 = -65536;
      id_class("Raid center", var0, -65536);
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      rfH_2 var9 = this.id_break().id_byte();

      for (rfH_2 var11 : this.id_break) {
         if (var9.id_class(var11, 160.0)) {
            id_class(var11);
         }
      }
   }

   public void id_class(Collection<rfH_2> var1) {
      this.id_break = var1;
   }

   private ly_3 id_break() {
      return ((Hh_1)this.id_class.id_class[16]).id_finally();
   }
}
