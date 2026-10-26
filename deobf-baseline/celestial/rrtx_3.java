package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtx_3 extends rrtO_2 {
   private static short[] id_protected;
   private static float[] id_throws;
   private static boolean[] id_case;
   private static String[] id_catch;
   public static Object[] id_byte;

   public rrtx_3(String var1, String var2, int var3) {
      this(new rVe_1(var1), new rVe_1(var2), var3);
   }

   public rrtx_3(rVi_1 var1, rVi_1 var2, int var3) {
      super((rrtX_2)rrtX_2.staticFieldsdadd6b8236373470b3196397455fa876[id_protected[0]], var1, var2, var3);
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_throws = new float[]{0.0F, 90.0F, 270.0F, 180.0F, 18.0F, 5.0F, 5.0F, 17.0F, 5.0F, 3.0F, 10.0F, 10.0F};
   }

   @Override
   public void id_class(Ml_1 var1, float var2, float var3, float var4, float var5) {
      super.id_class(var1, var2, var3, var4, var5);
      int var6 = this.id_case();
      int var7 = Math.min(var6, id_protected[1]);
      int var8 = ColorHelper.id_class(id_throws[0], var7);
      int var9 = ColorHelper.id_class(id_throws[1], var7);
      int var10 = ColorHelper.id_class(id_throws[2], var7);
      int var11 = ColorHelper.id_class(id_throws[3], var7);
      rrfD_2.id_class(var1, var2, var3, var4, var5, var7, var8, var9, var10, var11, id_case[0]);
      int var12 = ColorHelper.id_break(rrZF.d_, var6);
      this.id_catch().id_class(var1, this.id_volatile(), (double)(var2 + id_throws[4]), (double)(var3 + id_throws[5]), var12, id_protected[2]);
      this.id_implements().id_class(var1, this.id_new(), (double)(var2 + id_throws[6]), (double)(var3 + id_throws[7]), var12, id_protected[3]);
      rrfD_2.id_class(var1, (rqO_2)id_byte[id_protected[4]], var2 + id_throws[8], var3 + id_throws[9], id_throws[10], id_throws[11], var12);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9042093261736123516L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -709455492;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-36, -43, 44, -119, -43, -41, 86, 14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_else() {
      id_protected = new short[]{1, 225, 255, 255, 0};
   }

   private static void id_return() {
      Object[] var0 = new Object[]{new rqO_2("minecraft", id_catch[0])};
      id_byte = var0;
   }

   private static void id_public() {
      id_case = new boolean[]{false, false, true};
   }

   private static void id_synchronized() {
      id_catch = new String[]{new String("celestial/images/notification/error.png")};
   }
}
