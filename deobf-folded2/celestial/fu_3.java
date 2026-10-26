package celestial;

public enum fu_3 {
   RGBA(6408),
   RGB(6407),
   LUMINANCE_ALPHA(6410),
   LUMINANCE(6409),
   INTENSITY(32841);

   private final int glConstant;

   private fu_3(int var3) {
      this.glConstant = var3;
   }

   int id_class() {
      return this.glConstant;
   }
}
