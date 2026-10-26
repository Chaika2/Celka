package celestial;

public class WL extends xd_3 {
   public static final rCu_1<rpB_2> new_ = rCT.abstract_;

   public WL(Jq_1 var1) {
      super(var1);
      this.extends_(this.continue_().class_(new_, rpB_2.Y));
   }

   @Override
   public xc_3 class_(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case COUNTERCLOCKWISE_90:
         case CLOCKWISE_90:
            switch ((rpB_2)var1.byte_(new_)) {
               case X:
                  return var1.class_(new_, rpB_2.Z);
               case Z:
                  return var1.class_(new_, rpB_2.X);
               default:
                  return var1;
            }
         default:
            return var1;
      }
   }

   @Override
   public xc_3 class_(rxx_3 var1) {
      return this.continue_().class_(new_, var1.finally_().final_());
   }

   @Override
   protected void class_(rCL<xd_3, xc_3> var1) {
      var1.class_(new_);
   }
}
