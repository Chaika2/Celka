package celestial;

public class rxa_3 extends rdb_3 {
   private final aI_2<? extends rsS_2> id_class;

   public rxa_3(aI_2<? extends rsS_2> var1, rdO_2 var2) {
      super(var2);
      this.id_class = var1;
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      rfH_2 var2 = var1.id_class();
      rpr_3 var3 = var1.id_finally();
      rfH_2 var4 = var2.id_break(var3);
      rhd_3 var5 = var1.id_final();
      rdn_3 var6 = var1.id_volatile();
      if (var5 != null && !this.id_class(var5, var3, var6, var4)) {
         return ryZ_2.FAIL;
      } else {
         rYB var7 = var1.id_int();
         Object var8;
         if (this.id_class == aI_2.O) {
            var8 = new rsO_2(var7, var4, var3);
         } else {
            if (this.id_class != aI_2.id_default) {
               return ryZ_2.id_class(var7.id_continue);
            }

            var8 = new rsG_2(var7, var4, var3);
         }

         rcd_3 var9 = var6.id_package();
         if (var9 != null) {
            aI_2.id_class(var7, var5, (an_3)var8, var9);
         }

         if (((rsS_2)var8).id_throws()) {
            if (!var7.id_continue) {
               ((rsS_2)var8).id_private();
               var7.a_((an_3)var8);
            }

            var6.id_catch(1);
            return ryZ_2.id_class(var7.id_continue);
         } else {
            return ryZ_2.CONSUME;
         }
      }
   }

   protected boolean id_class(rhd_3 var1, rpr_3 var2, rdn_3 var3, rfH_2 var4) {
      return !var2.id_final().id_byte() && var1.id_class(var4, var2, var3);
   }
}
