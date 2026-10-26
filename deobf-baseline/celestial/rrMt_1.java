package celestial;

public enum rrMt_1 {
   CLEAR,
   RAIN,
   THUNDER;

   public static rrMt_1 id_class(rYB var0, float var1) {
      float var2 = var0.id_case(var1);
      if (var2 > 0.5F) {
         return THUNDER;
      } else {
         float var3 = var0.id_private(var1);
         return var3 > 0.5F ? RAIN : CLEAR;
      }
   }
}
