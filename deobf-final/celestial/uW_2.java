package celestial;

public enum uW_2 implements uJ_2 {
   INSTANCE;

   private static final fN_2 WHITE_GLYPH = rqR_2.class_(new fN_2(fc_3.RGBA, 5, 8, false), var0 -> {
      for (int var1 = 0; var1 < 8; var1++) {
         for (int var2 = 0; var2 < 5; var2++) {
            if (var2 != 0 && var2 + 1 != 5 && var1 != 0 && var1 + 1 != 8) {
               boolean var4 = false;
            } else {
               boolean var3 = true;
            }

            var0.class_(var2, var1, -1);
         }
      }

      var0.catch_();
   });

   @Override
   public float byte_() {
      return 1.0F;
   }

   @Override
   public void class_(int var1, int var2) {
      WHITE_GLYPH.class_(0, var1, var2, false);
   }

   @Override
   public int class_() {
      return 5;
   }

   @Override
   public int break_() {
      return 8;
   }

   @Override
   public boolean protected_() {
      return true;
   }

   @Override
   public float getAdvance() {
      return 6.0F;
   }
}
