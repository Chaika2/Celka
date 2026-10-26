package celestial;

public enum uW_2 implements uJ_2 {
   INSTANCE;

   private static final fN_2 WHITE_GLYPH = rqR_2.id_class(new fN_2(fc_3.RGBA, 5, 8, false), var0 -> {
      for (int var1 = 0; var1 < 8; var1++) {
         for (int var2 = 0; var2 < 5; var2++) {
            if (var2 != 0 && var2 + 1 != 5 && var1 != 0 && var1 + 1 != 8) {
               boolean var4 = false;
            } else {
               boolean var3 = true;
            }

            var0.id_class(var2, var1, -1);
         }
      }

      var0.id_catch();
   });

   @Override
   public float id_byte() {
      return 1.0F;
   }

   @Override
   public void id_class(int var1, int var2) {
      WHITE_GLYPH.id_class(0, var1, var2, false);
   }

   @Override
   public int id_class() {
      return 5;
   }

   @Override
   public int id_break() {
      return 8;
   }

   @Override
   public boolean id_protected() {
      return true;
   }

   @Override
   public float getAdvance() {
      return 6.0F;
   }
}
