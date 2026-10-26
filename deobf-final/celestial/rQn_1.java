package celestial;

public class rQn_1 implements rQz_1 {
   final float class_;

   rQn_1(float var1) {
      this.class_ = var1;
   }

   public static rQQ class_(float var0) {
      return () -> new rQn_1(var0);
   }

   public boolean class_(rzr_3 var1) {
      return var1.class_().nextFloat() < this.class_;
   }

   @Override
   public rWi_1 break_() {
      return rQF.byte_;
   }
}
