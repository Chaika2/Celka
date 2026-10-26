package celestial;

public class rjP_2 {
   private static final float id_class = 127.0F;
   private static final float id_break = 0.007874016F;

   public static float id_byte(int var0) {
      return (float)((byte)(var0 >> 16 & 0xFF)) * 0.007874016F;
   }

   private static int id_class(float var0) {
      return (int)(rfU_2.id_class(var0, -1.0F, 1.0F) * 127.0F) & 0xFF;
   }

   public static float id_class(int var0) {
      return (float)((byte)(var0 & 0xFF)) * 0.007874016F;
   }

   static int id_class(rja_3 var0) {
      return id_class((float)var0.b_(), (float)var0.c_(), (float)var0.d_());
   }

   public static int id_class(float var0, float var1, float var2) {
      int var3 = id_class(var0);
      int var4 = id_class(var1);
      int var5 = id_class(var2);
      return var5 << 16 | var4 << 8 | var3;
   }

   public static int id_class(rje_3 var0) {
      return id_class(var0.id_class(), var0.id_break(), var0.id_byte());
   }

   public static float id_break(int var0) {
      return (float)((byte)(var0 >> 8 & 0xFF)) * 0.007874016F;
   }
}
