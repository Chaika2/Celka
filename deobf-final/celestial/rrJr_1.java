package celestial;

public class rrJr_1 extends FP {
   private static final String throws_ = "/reloadShaders";
   private static final String case_ = "/reloadChunks";

   public rrJr_1(FP var1) {
      super(vV_2.class_(var1));
   }

   private boolean class_(String var1) {
      if (var1 == null) {
         return false;
      } else {
         var1 = var1.trim();
         if (var1.equals("/reloadShaders")) {
            if (rrbb_3.rs()) {
               rrdZ.while_();
               rrdZ.byte_();
            }

            return true;
         } else if (var1.equals("/reloadChunks")) {
            ((yX_2)this.volatile_.class_[8]).throws_();
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public void break_(String var1) {
      if (this.class_(var1)) {
         ((cq_3)this.volatile_.class_[19]).throws_().class_(var1);
      } else {
         super.break_(var1);
      }
   }
}
