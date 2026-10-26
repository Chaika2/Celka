package celestial;

public class dZ_2 extends dQ_2 {
   private static final UT id_package = new Uy_1();

   public dZ_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   protected UT id_class(rdn_3 var1) {
      return id_package;
   }

   @Override
   protected void id_class(rrEm_1 var1, rfH_2 var2) {
      ek_3 var3 = new ek_3(var1, var2);
      rHC var4 = var3.id_case();
      int var5 = var4.id_catch();
      if (var5 < 0) {
         var1.id_byte(1001, var2, 0);
      } else {
         rdn_3 var6 = var4.id_extends(var5);
         if (!var6.id_class()) {
            rpr_3 var7 = var1.id_byte(var2).id_byte(id_volatile);
            rXu_1 var8 = rHt_1.id_class(var1, var2.id_break(var7));
            rdn_3 var9;
            if (var8 == null) {
               var9 = id_package.dispense(var3, var6);
            } else {
               var9 = rHt_1.id_class(var4, var8, var6.id_implements().id_class(1), var7.id_case());
               if (var9.id_class()) {
                  var9 = var6.id_implements();
                  var9.id_catch(1);
               } else {
                  var9 = var6.id_implements();
               }
            }

            var4.id_break(var5, var9);
         }
      }
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      return new rHl_1();
   }
}
