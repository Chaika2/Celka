package celestial;

public class rrJr_1 extends FP {
   private static final String id_throws = "/reloadShaders";
   private static final String id_case = "/reloadChunks";

   public rrJr_1(FP var1) {
      super(vV_2.id_class(var1));
   }

   private boolean id_class(String var1) {
      if (var1 == null) {
         return false;
      } else {
         var1 = var1.trim();
         if (var1.equals("/reloadShaders")) {
            if (rrbb_3.rs()) {
               rrdZ.id_while();
               rrdZ.id_byte();
            }

            return true;
         } else if (var1.equals("/reloadChunks")) {
            ((yX_2)this.id_volatile.id_class[8]).id_throws();
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public void id_break(String var1) {
      if (this.id_class(var1)) {
         ((cq_3)this.id_volatile.id_class[19]).id_throws().id_class(var1);
      } else {
         super.id_break(var1);
      }
   }
}
