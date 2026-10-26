package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtC_2 extends rrtm_3 {
   private static boolean[] id_protected;
   private static byte[] id_throws;
   private static short[] id_native;
   public Object[] id_byte;
   private static float[] id_volatile;

   public rrtC_2(rrtN_2 var1, GroupSetting var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.id_return();
      this.id_byte[id_native[0]] = var1;
      this.id_byte[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3813375382009093668L;
   }

   private void id_class(Ml_1 var1, rrZO var2, String var3, float var4, float var5, float var6, float var7, int var8) {
      float var9 = var2.id_break(var3);
      float var10 = var9 / 2.0F;
      rrtF_2.id_class(var1, var4, var5 + 1.5F, var6, 0.5F, ColorHelper.id_break((Integer)rrZI.id_break[4], 0.7F), var8);
      rrtF_2.id_class(var1, var4 + var6 / 2.0F - var10 - 5.0F, var5 - 0.5F, var9 + 10.0F, (float)var2.id_class(), rrZF.n_, var8);
      rrtF_2.id_class(var1, this, var2, var3, var4 + var6 / 2.0F - var10, var5, 15, var8, id_protected[0]);
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      this.id_return();
      super.id_class(var1, var2, var3, var4);
      rrZO var5 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_native[2]]).id_throws();
      String var6 = ((GroupSetting)this.id_byte[1]).id_throws();
      float var7 = this.id_package();
      float var8 = this.id_final();
      float var9 = this.id_new();
      float var10 = this.id_continue();
      int var11 = this.id_class(255);
      this.id_private().id_interface().id_class(var1, () -> this.id_class(var1, var5, var6, var7, var8, var9, var10, var11));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, -57, -9, -122, 103, -128, -113, 52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 160416314;
   }

   @Override
   public Setting<?> id_finally() {
      this.id_return();
      return (GroupSetting)this.id_byte[1];
   }

   private static void id_goto() {
      id_native = new short[]{0, 1, 0, 1, 255, 4, 0, 1};
   }

   private void id_return() {
      if (this.id_byte == null) {
         this.id_byte = new Object[2];
         Object[] var1 = this.id_byte;
      }
   }

   private static void id_while() {
      id_volatile = new float[]{2.0F, 1.5F, 0.5F, 0.7F, 2.0F, 5.0F, 0.5F, 10.0F, 2.0F, 5.0F, 5.0F};
   }

   private static void id_public() {
      id_throws = new byte[]{15, 2};
   }

   @Override
   public rrtN_2 id_private() {
      this.id_return();
      return (rrtN_2)this.id_byte[id_native[6]];
   }

   @Override
   public rruv_1 id_volatile() {
      return new rruv_1(this.id_package(), this.id_final() - 5.0F, this.id_new(), this.id_continue() - 5.0F);
   }

   private static void id_synchronized() {
      id_protected = new boolean[1];
   }
}
