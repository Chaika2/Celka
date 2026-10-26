package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtl_3 extends rrtm_3 {
   private static float[] id_protected;
   private static boolean[] id_throws;
   private static short[] id_native;
   private static int[] id_volatile;
   public Object[] id_byte;
   private static byte[] id_final;

   public rrtl_3(rrtN_2 var1, rrIk_1 var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.id_goto();
      rrtv_3 var11 = new rrtv_3(0.6F, id_throws[0]);
      this.id_byte[2] = var11;
      this.id_byte[id_native[1]] = var1;
      this.id_byte[1] = var2;
   }

   static {
      ntfClinit();
   }

   public static void id_class(Ml_1 var0, rrtm_3 var1, rrtv_3 var2, Setting<?> var3, rrZO var4, float var5, float var6, float var7, boolean var8) {
      int var9 = var8 ? ColorHelper.id_class(id_protected[1]) : 6781311;
      int var10 = var8 ? ColorHelper.id_class(90.0F) : 6781311;
      int var11 = var8 ? ColorHelper.id_class(270.0F) : 6781311;
      int var12 = var8 ? ColorHelper.id_class(180.0F) : 6781311;
      int var13 = var8 ? -1 : 8;
      var2.id_class().id_break((float)var13);
      float var14 = var2.id_class().id_byte();
      rrtF_2.id_class(var0, var1, var4, var3.id_throws(), var5, var6 + 2.5F, rrZF.k_, 255);
      if (ClickGuiTheme.id_class()) {
         rrtF_2.id_class(var0, var5 + var7 - 17.0F, var6, 17.0F, 8.0F, 6, var9, var1.id_class(255));
      }

      rrtF_2.id_class(var0, var5 + var7 - 17.0F, var6, 17.0F, 8.0F, 3.5F, var9, var10, var11, var12, var1.id_class(255));
      rrtF_2.id_class(var0, var1, var5 - 3.0F + var7 - var14 - 2.0F, var6 + 4.0F, 7.5F, rrZF.d_, 255, var1.id_private().id_long() * rrvk_1.id_class());
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_goto();
      if (var4 == 0 && super.id_class(var1, var2, var3, var4, var5)) {
         ((rrIk_1)this.id_byte[1]).id_class(Boolean.valueOf(!((rrIk_1)this.id_byte[1]).id_class() ? true : id_throws[2]), id_throws[3], true);
         return true;
      } else {
         return id_throws[6];
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2208922259631976299L;
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      this.id_goto();
      super.id_class(var1, var2, var3, var4);
      float var5 = this.id_package();
      float var6 = this.id_final();
      float var7 = this.id_new();
      boolean var8 = ((rrIk_1)this.id_byte[1]).id_class();
      this.id_private().id_interface().id_class(var1, () -> this.id_break(var1, var5, var6, var7, var8));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-103, 96, 50, -44, 22, -47, 75, -72}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 992720293;
   }

   private void id_break(Ml_1 var1, float var2, float var3, float var4, boolean var5) {
      this.id_goto();
      rrZO var6 = ((rrIk_1)this.id_byte[1]).id_break() == null
         ? ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_native[5]]).id_finally()
         : ((rrIk_1)this.id_byte[1]).id_break();
      id_class(var1, this, (rrtv_3)this.id_byte[2], (rrIk_1)this.id_byte[1], var6, var2, var3, var4, var5);
   }

   @Override
   public Setting<Boolean> id_finally() {
      this.id_goto();
      return (rrIk_1)this.id_byte[1];
   }

   private void id_goto() {
      if (this.id_byte == null) {
         this.id_byte = new Object[3];
         Object[] var1 = this.id_byte;
      }
   }

   private static void id_return() {
      id_final = new byte[]{-1, 8, 6, 3};
   }

   private static void id_try() {
      id_volatile = new int[]{6781311, 6781311, 6781311, 6781311};
   }

   private static void id_while() {
      id_native = new short[]{2, 0, 1, 1, 1, 0, 1, 2, 1, 255, 255, 255, 255, 1, 1, 0, 1};
   }

   private static void id_public() {
      id_throws = new boolean[]{false, true, false, false, true, true, false};
   }

   @Override
   public rrtN_2 id_private() {
      this.id_goto();
      return (rrtN_2)this.id_byte[id_native[15]];
   }

   @Override
   public rruv_1 id_volatile() {
      return new rruv_1(this.id_package() + this.id_new() - 18.0F, this.id_final() - 4.0F, 19.0F, 12.0F);
   }

   private static void id_synchronized() {
      id_protected = new float[]{
         0.6F, 0.0F, 90.0F, 270.0F, 180.0F, 2.5F, 17.0F, 17.0F, 8.0F, 17.0F, 17.0F, 8.0F, 3.5F, 3.0F, 2.0F, 4.0F, 7.5F, 18.0F, 4.0F, 19.0F, 12.0F
      };
   }
}
