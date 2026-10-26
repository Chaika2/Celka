package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtJ_2 extends rrtO_2 {
   private static String[] id_protected;
   private static short[] id_throws;
   private static boolean[] id_case;
   private static float[] id_catch;
   public static Object[] id_byte;

   public rrtJ_2(String var1, String var2, int var3) {
      this(new rVe_1(var1), new rVe_1(var2), var3);
   }

   public rrtJ_2(rVi_1 var1, rVi_1 var2, int var3) {
      super((rrtX_2)rrtX_2.staticFieldsdadd6b8236373470b3196397455fa876[2], var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_case = new boolean[]{false, false, true};
   }

   @Override
   public void id_class(Ml_1 var1, float var2, float var3, float var4, float var5) {
      super.id_class(var1, var2, var3, var4, var5);
      int var6 = this.id_case();
      int var7 = Math.min(var6, 225);
      int var8 = ColorHelper.id_class(id_catch[0], var7);
      int var9 = ColorHelper.id_class(90.0F, var7);
      int var10 = ColorHelper.id_class(270.0F, var7);
      int var11 = ColorHelper.id_class(180.0F, var7);
      rrfD_2.id_class(var1, var2, var3, var4, var5, var7, var8, var9, var10, var11, id_case[0]);
      this.id_catch().id_class(var1, this.id_volatile(), (double)(var2 + 18.0F), (double)(var3 + 5.0F), rrZF.d_, var6);
      this.id_implements().id_class(var1, this.id_new(), (double)(var2 + 5.0F), (double)(var3 + 17.0F), rrZF.d_, var6);
      rrfD_2.id_class(var1, (rqO_2)id_byte[id_throws[2]], var2 + 5.0F, var3 + 3.0F, 10.0F, 10.0F, ColorHelper.id_break(rrZF.d_, var6));
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1030757732;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1501966522124803616L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{91, -14, 109, -19, -94, 90, 102, 36}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_else() {
      id_protected = new String[]{new String("celestial/images/notification/danger.png")};
   }

   private static void id_return() {
      Object[] var0 = new Object[]{new rqO_2(id_protected[0])};
      id_byte = var0;
   }

   private static void id_public() {
      id_throws = new short[]{2, 225, 0};
   }

   private static void id_synchronized() {
      id_catch = new float[]{0.0F, 90.0F, 270.0F, 180.0F, 18.0F, 5.0F, 5.0F, 17.0F, 5.0F, 3.0F, 10.0F, 10.0F};
   }
}
