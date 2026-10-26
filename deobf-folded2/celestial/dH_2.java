package celestial;

import java.util.Random;

public class dH_2 extends xd_3 {
   public dH_2(Jq_1 var1) {
      super(var1);
   }

   protected void id_class(rsB_2 var1) {
   }

   public void id_class(rYB var1, rfH_2 var2, rsB_2 var3) {
   }

   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, xc_3 var4, rsB_2 var5) {
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, Random var4) {
      if (var4.nextInt(16) == 0) {
         rfH_2 var5 = var3.id_break();
         if (id_implements(var2.id_byte(var5))) {
            double var6 = (double)var3.b_() + var4.nextDouble();
            double var8 = (double)var3.c_() - 0.05;
            double var10 = (double)var3.d_() + var4.nextDouble();
            var2.id_class(new rLX(rLQ.id_public, var1), var6, var8, var10, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      var4.id_finally().id_class(var5, this, this.id_break());
      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xc_3 var4, boolean var5) {
      var2.id_finally().id_class(var3, this, this.id_break());
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (id_implements(var2.id_byte(var3.id_break())) && var3.c_() >= 0) {
         rsB_2 var5 = new rsB_2(var2, (double)var3.b_() + 0.5, (double)var3.c_(), (double)var3.d_() + 0.5, var2.id_byte(var3));
         this.id_class(var5);
         var2.a_(var5);
      }
   }

   protected int id_break() {
      return 2;
   }

   public int id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return -16777216;
   }

   public static boolean id_implements(xc_3 var0) {
      QP var1 = var0.id_byte();
      return var0.id_catch() || var0.id_class(rls_3.N) || var1.id_class() || var1.id_throws();
   }
}
