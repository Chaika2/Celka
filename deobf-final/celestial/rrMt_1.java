package celestial;

public enum rrMt_1 {
   CLEAR,
   RAIN,
   THUNDER;

   public static rrMt_1 class_(rYB var0, float var1) {
      float var2 = var0.case_(var1);
      if (var2 > 0.5F) {
         return THUNDER;
      } else {
         float var3 = var0.private_(var1);
         return var3 > 0.5F ? RAIN : CLEAR;
      }
   }
}
