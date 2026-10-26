package celestial;

public class dZ_2 extends dQ_2 {
   private static final UT package_ = new Uy_1();

   public dZ_2(Jq_1 var1) {
      super(var1);
   }

   @Override
   protected UT class_(rdn_3 var1) {
      return package_;
   }

   @Override
   protected void class_(rrEm_1 var1, rfH_2 var2) {
      ek_3 var3 = new ek_3(var1, var2);
      rHC var4 = var3.case_();
      int var5 = var4.catch_();
      if (var5 < 0) {
         var1.byte_(1001, var2, 0);
      } else {
         rdn_3 var6 = var4.extends_(var5);
         if (!var6.class_()) {
            rpr_3 var7 = var1.byte_(var2).byte_(volatile_);
            rXu_1 var8 = rHt_1.class_(var1, var2.break_(var7));
            rdn_3 var9;
            if (var8 == null) {
               var9 = package_.dispense(var3, var6);
            } else {
               var9 = rHt_1.class_(var4, var8, var6.implements_().class_(1), var7.case_());
               if (var9.class_()) {
                  var9 = var6.implements_();
                  var9.catch_(1);
               } else {
                  var9 = var6.implements_();
               }
            }

            var4.break_(var5, var9);
         }
      }
   }

   @Override
   public ryO_2 class_(rRq_1 var1) {
      return new rHl_1();
   }
}
