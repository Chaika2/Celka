package celestial;

import java.util.Map;
import java.util.Map.Entry;

class rJW extends rJY {
   rJW(rJJ var1, rXu_1 var2, int var3, int var4, int var5, rpq_3 var6) {
      super(var2, var3, var4, var5);
      this.id_break = var1;
      this.id_class = var6;
   }

   private int id_class(rYB var1) {
      int var2 = 0;
      var2 += this.id_throws(this.id_break.id_break.id_extends(0));
      var2 += this.id_throws(this.id_break.id_break.id_extends(1));
      if (var2 > 0) {
         int var3 = (int)Math.ceil((double)var2 / 2.0);
         return var3 + var1.id_int.nextInt(var3);
      } else {
         return 0;
      }
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, rdn_3 var2) {
      this.id_class.id_class((var1x, var2x) -> {
         int var3 = this.id_class(var1x);

         while (var3 > 0) {
            int var4 = rsP_2.id_class(var3);
            var3 -= var4;
            var1x.a_(new rsP_2(var1x, (double)var2x.b_(), (double)var2x.c_() + 0.5, (double)var2x.d_() + 0.5, var4));
         }

         var1x.id_byte(1042, var2x, 0);
      });
      this.id_break.id_break.id_break(0, rdn_3.id_break);
      this.id_break.id_break.id_break(1, rdn_3.id_break);
      return var2;
   }

   @Override
   public boolean id_class(rdn_3 var1) {
      return false;
   }

   private int id_throws(rdn_3 var1) {
      int var2 = 0;
      Map var3 = eA_2.id_class(var1);

      for (Entry var5 : var3.entrySet()) {
         ev_3 var6 = (ev_3)var5.getKey();
         Integer var7 = (Integer)var5.getValue();
         if (!var6.id_byte()) {
            var2 += var6.id_class(var7);
         }
      }

      return var2;
   }
}
