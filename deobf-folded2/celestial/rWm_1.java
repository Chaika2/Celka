package celestial;

public class rWm_1 extends rWN {
   public rWm_1(rqO_2 var1) {
      super(var1);
   }

   @Override
   public boolean id_class(int var1, int var2) {
      return var1 >= 2 && var2 >= 2;
   }

   public rdn_3 id_class(rXk_1 var1) {
      rdn_3 var2 = rdn_3.id_break;

      for (int var3 = 0; var3 < var1.id_else(); var3++) {
         rdn_3 var4 = var1.id_extends(var3);
         if (!var4.id_class() && var4.id_break().id_class(rlc_3.id_void)) {
            var2 = var4;
            break;
         }
      }

      rdn_3 var6 = new rdn_3(rdy_3.ke, 1);
      if (var2.id_break() instanceof rxJ_2 && ((rxJ_2)var2.id_break()).id_catch() instanceof dI_2) {
         dI_2 var7 = (dI_2)((rxJ_2)var2.id_break()).id_catch();
         rLR var5 = var7.id_break();
         rkJ_2.id_class(var6, var5, var7.id_implements());
      }

      return var6;
   }

   public boolean id_class(rXk_1 var1, rYB var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;

      for (int var7 = 0; var7 < var1.id_else(); var7++) {
         rdn_3 var8 = var1.id_extends(var7);
         if (!var8.id_class()) {
            if (var8.id_break() == xu_3.rq.id_case() && !var5) {
               var5 = true;
            } else if (var8.id_break() == xu_3.rT.id_case() && !var4) {
               var4 = true;
            } else if (var8.id_break().id_class(rlc_3.id_void) && !var3) {
               var3 = true;
            } else {
               if (var8.id_break() != rdy_3.OU || var6) {
                  return false;
               }

               var6 = true;
            }
         }
      }

      return var3 && var5 && var4 && var6;
   }

   @Override
   public rkf_3<?> W_() {
      return rkf_3.id_final;
   }
}
