package celestial;

public class dr_3 extends dH_2 {
   private final xc_3 id_volatile;

   public dr_3(xd_3 var1, Jq_1 var2) {
      super(var2);
      this.id_volatile = var1.id_continue();
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      return id_class(var4, var5) ? this.id_volatile : super.id_class(var1, var2, var3, var4, var5, var6);
   }

   private static boolean id_class(rRq_1 var0, rfH_2 var1) {
      boolean var2 = false;
      rfw_3 var3 = var1.id_new();

      for (rpr_3 var7 : rpr_3.values()) {
         xc_3 var8 = var0.id_byte(var3);
         if (var7 != rpr_3.DOWN || id_private(var8)) {
            var3.id_class(var1, var7);
            var8 = var0.id_byte(var3);
            if (id_private(var8) && !var8.id_protected(var0, var1, var7.id_case())) {
               var2 = true;
               break;
            }
         }
      }

      return var2;
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      xc_3 var4 = var2.id_byte(var3);
      return id_break(var2, var3, var4) ? this.id_volatile : super.id_class(var1);
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, xc_3 var4, rsB_2 var5) {
      if (id_break(var1, var2, var4)) {
         var1.id_class(var2, this.id_volatile, 3);
      }
   }

   private static boolean id_break(rRq_1 var0, rfH_2 var1, xc_3 var2) {
      return id_private(var2) || id_class(var0, var1);
   }

   @Override
   public int id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return var1.id_protected(var2, var3).d;
   }

   private static boolean id_private(xc_3 var0) {
      return var0.id_volatile().id_class(rlG_2.id_break);
   }
}
