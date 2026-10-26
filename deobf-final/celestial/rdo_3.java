package celestial;

public class rdo_3<T extends an_3 & ir_3> extends rdb_3 {
   private final aI_2<T> class_;
   private final int break_;

   public rdo_3(rdO_2 var1, aI_2<T> var2, int var3) {
      super(var1);
      this.class_ = var2;
      this.break_ = var3;
   }

   @Override
   public rym_3<rdn_3> class_(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.protected_(var3);
      if (var1.continue_) {
         return rym_3.byte_(var4);
      } else {
         an_3 var5 = var2.ra();
         if (var2.Pm() && var5 instanceof ir_3 && var5.BC() == this.class_) {
            ir_3 var6 = (ir_3)var5;
            if (var6.protected_()) {
               var4.class_(this.break_, var2, var1x -> var1x.byte_(var3));
               if (var4.class_()) {
                  rdn_3 var7 = new rdn_3(rdy_3.Xd);
                  var7.byte_(var4.package_());
                  return rym_3.class_(var7);
               }

               return rym_3.class_(var4);
            }
         }

         var2.class_(rlB_2.byte_.break_(this));
         return rym_3.byte_(var4);
      }
   }
}
