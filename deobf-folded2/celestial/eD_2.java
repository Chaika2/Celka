package celestial;

public class eD_2 extends ev_3 {
   public eD_2(eF_2 var1, rXQ... var2) {
      super(var1, eC_2.ARMOR_FEET, var2);
   }

   @Override
   public boolean id_class(ev_3 var1) {
      return super.id_class(var1) && var1 != eY_2.id_implements;
   }

   @Override
   public int id_class() {
      return 2;
   }

   public static void id_class(iB_2 var0, rYB var1, rfH_2 var2, int var3) {
      if (var0.BL()) {
         xc_3 var4 = xu_3.bj.id_continue();
         float var5 = (float)Math.min(16, 2 + var3);
         rfw_3 var6 = new rfw_3();

         for (rfH_2 var8 : rfH_2.id_class(var2.id_byte((double)(-var5), -1.0, (double)(-var5)), var2.id_byte((double)var5, -1.0, (double)var5))) {
            if (var8.id_class(var0.Ps(), (double)var5)) {
               var6.id_class(var8.b_(), var8.c_() + 1, var8.d_());
               xc_3 var9 = var1.id_byte(var6);
               if (var9.id_catch()) {
                  xc_3 var10 = var1.id_byte(var8);
                  if (var10.id_byte() == QP.id_finally
                     && var10.id_byte(dj_3.id_volatile) == 0
                     && var4.id_class((rRR)var1, var8)
                     && var1.id_class(var4, var8, rjm_3.id_break())) {
                     var1.id_break(var8, var4);
                     var1.id_finally().id_class(var8, xu_3.bj, rfU_2.id_class(var0.Sa(), 60, 120));
                  }
               }
            }
         }
      }
   }

   @Override
   public int id_class(int var1) {
      return var1 * 10;
   }

   @Override
   public int id_break(int var1) {
      return this.id_class(var1) + 15;
   }

   @Override
   public boolean id_break() {
      return true;
   }
}
