package celestial;

public class WL extends xd_3 {
   public static final rCu_1<rpB_2> id_new = rCT.id_abstract;

   public WL(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_continue().id_class(id_new, rpB_2.Y));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case COUNTERCLOCKWISE_90:
         case CLOCKWISE_90:
            switch ((rpB_2)var1.id_byte(id_new)) {
               case X:
                  return var1.id_class(id_new, rpB_2.Z);
               case Z:
                  return var1.id_class(id_new, rpB_2.X);
               default:
                  return var1;
            }
         default:
            return var1;
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_continue().id_class(id_new, var1.id_finally().id_final());
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_new);
   }
}
