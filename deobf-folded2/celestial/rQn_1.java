package celestial;

public class rQn_1 implements rQz_1 {
   final float id_class;

   rQn_1(float var1) {
      this.id_class = var1;
   }

   public static rQQ id_class(float var0) {
      return () -> new rQn_1(var0);
   }

   public boolean id_class(rzr_3 var1) {
      return var1.id_class().nextFloat() < this.id_class;
   }

   @Override
   public rWi_1 id_break() {
      return rQF.id_byte;
   }
}
