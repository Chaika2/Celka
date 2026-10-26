package celestial;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

public class LR extends Lf_1<Lo_1> {
   final mI_2 id_class;
   int id_throws;

   public LR(mI_2 var1, QY var2) {
      super(var2, var1.id_package + 45, var1.id_int, 43, var1.id_int - 32, 20);
      this.id_class = var1;
      Vu_1[] var3 = (Vu_1[])ArrayUtils.clone(((Qw_1)var2.id_class[20]).f);
      Arrays.sort(var3);
      String var4 = null;

      for (Vu_1 var8 : var3) {
         String var9 = var8.id_throws();
         if (!var9.equals(var4)) {
            var4 = var9;
            this.id_break(new LY(this, new rgn_3(var9)));
         }

         rgn_3 var10 = new rgn_3(var8.id_catch());
         int var11 = ((cm_3)var2.id_class[15]).id_class(var10);
         if (var11 > this.id_throws) {
            this.id_throws = var11;
         }

         this.id_break(new LK(this, var8, var10));
      }
   }

   @Override
   protected int id_protected() {
      return super.id_protected() + 15;
   }

   @Override
   public int F_() {
      return super.F_() + 32;
   }
}
