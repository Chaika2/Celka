package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtd_3 extends rrtO_2 {
   private static float[] id_protected;
   public static Object[] id_byte;
   private static boolean[] id_throws;
   private static short[] id_case;
   private static String[] id_catch;

   public rrtd_3(String var1, String var2, int var3) {
      this(new rVe_1(var1), new rVe_1(var2), var3);
   }

   public rrtd_3(rVi_1 var1, rVi_1 var2, int var3) {
      super((rrtX_2)rrtX_2.staticFieldsdadd6b8236373470b3196397455fa876[2], var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new float[]{0.0F, 90.0F, 270.0F, 180.0F, 17.0F, 5.0F, 5.0F, 17.0F, 5.0F, 3.5F, 9.0F, 9.0F};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2306302966418597890L;
   }

   @Override
   public void id_class(Ml_1 var1, float var2, float var3, float var4, float var5) {
      super.id_class(var1, var2, var3, var4, var5);
      int var6 = this.id_case();
      int var7 = Math.min(var6, 225);
      int var8 = ColorHelper.id_class(id_protected[0], var7);
      int var9 = ColorHelper.id_class(90.0F, var7);
      int var10 = ColorHelper.id_class(270.0F, var7);
      int var11 = ColorHelper.id_class(180.0F, var7);
      rrfD_2.id_class(var1, var2, var3, var4, var5, var7, var8, var9, var10, var11, id_throws[0]);
      this.id_catch().id_class(var1, this.id_volatile(), (double)(var2 + 17.0F), (double)(var3 + 5.0F), rrZF.d_, var6);
      this.id_implements().id_class(var1, this.id_new(), (double)(var2 + 5.0F), (double)(var3 + 17.0F), rrZF.d_, var6);
      rrfD_2.id_class(var1, (rqO_2)id_byte[id_case[2]], var2 + 5.0F, var3 + 3.5F, 9.0F, 9.0F, ColorHelper.id_break(rrZF.d_, var6));
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1894173391;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{49, -88, -14, 21, -98, 110, 122, 40}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_else() {
      Object[] var0 = new Object[]{new rqO_2("minecraft", id_catch[0])};
      id_byte = var0;
   }

   private static void id_return() {
      id_throws = new boolean[]{false, false, true};
   }

   private static void id_public() {
      id_catch = new String[]{new String("celestial/images/notification/info.png")};
   }

   private static void id_synchronized() {
      id_case = new short[]{2, 225, 0};
   }
}
