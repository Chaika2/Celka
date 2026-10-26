package celestial;

public class rdo_3<T extends an_3 & ir_3> extends rdb_3 {
   private final aI_2<T> id_class;
   private final int id_break;

   public rdo_3(rdO_2 var1, aI_2<T> var2, int var3) {
      super(var1);
      this.id_class = var2;
      this.id_break = var3;
   }

   @Override
   public rym_3<rdn_3> id_class(rYB var1, rhd_3 var2, rpm_3 var3) {
      rdn_3 var4 = var2.id_protected(var3);
      if (var1.id_continue) {
         return rym_3.id_byte(var4);
      } else {
         an_3 var5 = var2.ra();
         if (var2.Pm() && var5 instanceof ir_3 && var5.BC() == this.id_class) {
            ir_3 var6 = (ir_3)var5;
            if (var6.id_protected()) {
               var4.id_class(this.id_break, var2, var1x -> var1x.id_byte(var3));
               if (var4.id_class()) {
                  rdn_3 var7 = new rdn_3(rdy_3.Xd);
                  var7.id_byte(var4.id_package());
                  return rym_3.id_class(var7);
               }

               return rym_3.id_class(var4);
            }
         }

         var2.id_class(rlB_2.id_byte.id_break(this));
         return rym_3.id_byte(var4);
      }
   }
}
