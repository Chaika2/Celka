package celestial;

public enum rrBz_1 implements rrBA {
   INSTANCE;

   @Override
   public int class_(rKC var1, int var2, int var3) {
      rKy_1 var4 = var1.class_();
      double var5 = var4.class_((double)var2 / 8.0, (double)var3 / 8.0, 0.0, 0.0, 0.0);
      if (var5 > 0.4) {
         return 44;
      } else if (var5 > 0.2) {
         return 45;
      } else if (var5 < -0.4) {
         return 10;
      } else {
         return var5 < -0.2 ? 46 : 0;
      }
   }
}
