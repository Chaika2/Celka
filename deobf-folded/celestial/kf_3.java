package celestial;

import java.util.Random;

public class kf_3 extends xF_2 {
   public static final rCm_1 id_volatile = rCT.J;
   private static final rjC_2[] id_final = new rjC_2[]{
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      xd_3.id_class(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   protected kf_3(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, Integer.valueOf(0)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile);
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      int var5 = var1.id_byte(id_volatile);
      if (var5 < 3 && var4.nextInt(10) == 0) {
         var1 = var1.id_class(id_volatile, Integer.valueOf(var5 + 1));
         var2.id_class(var3, var1, 2);
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return id_final[var1.id_byte(id_volatile)];
   }

   @Override
   public rdn_3 id_class(rRq_1 var1, rfH_2 var2, xc_3 var3) {
      return new rdn_3(rdy_3.JL);
   }

   @Override
   protected boolean id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_class(xu_3.PY);
   }

   @Override
   public boolean a_(xc_3 var1) {
      return var1.id_byte(id_volatile) < 3;
   }
}
