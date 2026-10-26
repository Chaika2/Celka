package celestial;

public class rjP_2 {
   private static final float class_ = 127.0F;
   private static final float break_ = 0.007874016F;

   public static float byte_(int var0) {
      return (float)((byte)(var0 >> 16 & 0xFF)) * 0.007874016F;
   }

   private static int class_(float var0) {
      return (int)(rfU_2.class_(var0, -1.0F, 1.0F) * 127.0F) & 0xFF;
   }

   public static float class_(int var0) {
      return (float)((byte)(var0 & 0xFF)) * 0.007874016F;
   }

   static int class_(rja_3 var0) {
      return class_((float)var0.b_(), (float)var0.c_(), (float)var0.d_());
   }

   public static int class_(float var0, float var1, float var2) {
      int var3 = class_(var0);
      int var4 = class_(var1);
      int var5 = class_(var2);
      return var5 << 16 | var4 << 8 | var3;
   }

   public static int class_(rje_3 var0) {
      return class_(var0.class_(), var0.break_(), var0.byte_());
   }

   public static float break_(int var0) {
      return (float)((byte)(var0 >> 8 & 0xFF)) * 0.007874016F;
   }
}
