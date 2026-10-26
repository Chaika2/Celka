package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtQ_2 extends rrtO_2 {
   private static String[] id_protected;
   private static float[] id_throws;
   public static Object[] id_byte;
   private static short[] id_case;
   private static boolean[] id_catch;

   public rrtQ_2(rVi_1 var1, rVi_1 var2, int var3) {
      super((rrtX_2)rrtX_2.staticFieldsdadd6b8236373470b3196397455fa876[0], var1, var2, var3);
   }

   public rrtQ_2(String var1, String var2, int var3) {
      this(new rVe_1(var1), new rVe_1(var2), var3);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new float[]{0.0F, 90.0F, 270.0F, 180.0F, 18.0F, 5.0F, 5.0F, 17.0F, 5.0F, 3.0F, 10.0F, 10.0F};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1731003816;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5603210987438430148L;
   }

   @Override
   public void id_class(Ml_1 var1, float var2, float var3, float var4, float var5) {
      super.id_class(var1, var2, var3, var4, var5);
      int var6 = this.id_case();
      int var7 = Math.min(var6, 225);
      int var8 = ColorHelper.id_class(0.0F, var7);
      int var9 = ColorHelper.id_class(90.0F, var7);
      int var10 = ColorHelper.id_class(270.0F, var7);
      int var11 = ColorHelper.id_class(180.0F, var7);
      rrfD_2.id_class(var1, var2, var3, var4, var5, var7, var8, var9, var10, var11, false);
      this.id_catch().id_class(var1, this.id_volatile(), (double)(var2 + 18.0F), (double)(var3 + 5.0F), rrZF.d_, var6);
      this.id_implements().id_class(var1, this.id_new(), (double)(var2 + 5.0F), (double)(var3 + 17.0F), rrZF.d_, var6);
      rrfD_2.id_class(var1, (rqO_2)id_byte[0], var2 + 5.0F, var3 + 3.0F, 10.0F, 10.0F, ColorHelper.id_break(rrZF.d_, var6));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-5, 94, 33, -62, 112, 71, -55, -27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_else() {
      id_case = new short[]{0, 225, 0};
   }

   private static void id_return() {
      id_protected = new String[]{new String("celestial/images/notification/success.png")};
   }

   private static void id_public() {
      id_catch = new boolean[]{false, false, true};
   }

   private static void id_synchronized() {
      Object[] var0 = new Object[]{new rqO_2("celestial/images/notification/success.png")};
      id_byte = var0;
   }
}
