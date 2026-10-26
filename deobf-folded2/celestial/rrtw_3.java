package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrtw_3 extends rrtt_3 implements rrtL_2 {
   private static byte[] id_throws;
   private static short[] id_native;
   private static boolean[] id_volatile;
   private static float[] id_final;
   public Object[] id_protected;

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{37, 53, -116, 106, 32, -114, -12, -38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrtw_3(rrtN_2 var1, rrtf_3<?> var2, float var3, float var4, float var5, float var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.id_instanceof();
      rrtv_3 var11 = new rrtv_3(0.5F, false);
      this.id_protected[1] = var11;
      rrtI_2 var12 = new rrtI_2(this);
      this.id_protected[0] = var12;
   }

   static {
      ntfClinit();
   }

   private static void id_interface() {
      id_final = new float[]{0.5F, 2.5F, 0.0F, 0.0F, 90.0F, 270.0F, 180.0F, 2.0F, 2.0F, 4.0F, 4.0F, 2.0F, 1.0F, 1.0F, 10.0F};
   }

   @Override
   public boolean id_class() {
      this.id_instanceof();
      return (Boolean)this.id_protected[3];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2743466766927169627L;
   }

   public static void id_class(Ml_1 var0, rrtm_3 var1, float var2, float var3, float var4, float var5) {
      int var6 = var1.id_class(255);
      int var7 = ColorHelper.id_class(0.0F);
      int var8 = ColorHelper.id_class(90.0F);
      int var9 = ColorHelper.id_class(270.0F);
      int var10 = ColorHelper.id_class(180.0F);
      if (ClickGuiTheme.id_class()) {
         rrtF_2.id_class(var0, var2 - 2.0F, var3 - 2.0F, var4 + 4.0F, var5 + 4.0F, 6, var8, Math.min(var6, 100));
      }

      rrtF_2.id_class(var0, var2, var3, var4, var5, 2.0F, var7, var8, var9, var10, var6);
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      super.id_class(var1, var2, var3, var4);
      this.id_return().id_class(this.id_class());
      float var5 = this.id_package();
      float var6 = this.id_final();
      rruv_1 var7 = this.id_volatile();
      this.id_class(var7.id_break(), var7.id_protected(), var7.id_byte(), var7.id_class(), var3, var4);
      this.id_private().id_interface().id_class(var1, () -> this.id_class(var1, var5, var6, var3, var4));
   }

   public float id_class(float var1, float var2) {
      AnimValue var3 = this.id_return();
      int var4 = this.id_synchronized().id_class().size();
      float var5 = var3.id_case() ? (float)var4 * var1 - var2 : id_final[2];
      return var5 * var3.id_byte();
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4) {
      this.id_instanceof();
      super.id_class(var1, var2, var3, var4);
      this.id_class(false);
      return ((rrtI_2)this.id_protected[0]).id_class(var1, var2, var3, var4);
   }

   private void id_class(Ml_1 var1, float var2, float var3, int var4, int var5) {
      this.id_instanceof();
      rrtF_2.id_protected(
         var1,
         this,
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally(),
         this.id_synchronized().id_break().id_throws(),
         var2,
         var3 + 2.5F,
         rrZF.k_,
         255
      );
      ((rrtI_2)this.id_protected[0]).id_class(var1, var4, var5);
   }

   public abstract void id_class(Ml_1 var1, rrtI_2 var2, int var3, int var4);

   public void id_class(Ml_1 var1) {
      rrfi_3.id_class();
      var1.id_break();
   }

   @Override
   public void id_class(boolean var1) {
      this.id_instanceof();
      Boolean var6 = var1;
      this.id_protected[3] = var6;
   }

   public boolean id_class(float var1, float var2, float var3, float var4, int var5, int var6) {
      this.id_instanceof();
      boolean var10001 = (float)var5 >= var1 && (float)var5 <= var1 + var3 && (float)var6 >= var2 && (float)var6 <= var2 + var4 ? true : id_volatile[4];
      Boolean var11 = (float)var5 >= var1 && (float)var5 <= var1 + var3 && (float)var6 >= var2 && (float)var6 <= var2 + var4 ? true : id_volatile[4];
      this.id_protected[2] = var11;
      return var10001;
   }

   public void id_class(Ml_1 var1, float var2, float var3, float var4, float var5) {
      MT.id_transient();
      rrfi_3.id_break();
      rrfD_2.id_protected(var1, var2, var3, var4, var5, -1);
      rrfi_3.id_class(1);
   }

   public abstract boolean id_class(rrtu_3 var1, rrtI_2 var2, float var3, float var4, int var5, int var6, int var7);

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_instanceof();
      if (!super.id_class(var1, var2, var3, var4, var5)) {
         return false;
      } else {
         rruv_1 var6 = this.id_volatile();
         return ((rrtI_2)this.id_protected[0]).id_class(var1, var6.id_break(), var6.id_protected(), var2, var3, var4);
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1183800247;
   }

   public rrtI_2 id_goto() {
      this.id_instanceof();
      return (rrtI_2)this.id_protected[0];
   }

   @Override
   public boolean id_implements() {
      this.id_instanceof();
      return (Boolean)this.id_protected[2];
   }

   private void id_instanceof() {
      if (this.id_protected == null) {
         this.id_protected = new Object[4];
         Object[] var1 = this.id_protected;
         var1[2] = false;
         var1[3] = false;
      }
   }

   public AnimValue id_return() {
      this.id_instanceof();
      return ((rrtv_3)this.id_protected[1]).id_class();
   }

   @Override
   public float id_super() {
      this.id_instanceof();
      return ((rrtI_2)this.id_protected[0]).id_class() - 10.0F;
   }

   private static void id_throw() {
      id_throws = new byte[]{6, 100, -1, 4, 2, 3};
   }

   private static void id_try() {
      id_volatile = new boolean[]{false, false, false, true, false, true, false, false};
   }

   private static void id_while() {
      id_native = new short[]{1, 0, 0, 0, 255, 0, 0, 2, 255, 0, 0, 0, 2, 0, 0, 1, 3, 3};
   }

   public abstract float id_public();

   @Override
   public rruv_1 id_volatile() {
      this.id_instanceof();
      return new rruv_1(
            ((rrtI_2)this.id_protected[0]).id_break(), this.id_final(), ((rrtI_2)this.id_protected[0]).id_throws(), ((rrtI_2)this.id_protected[0]).id_class()
         )
         .id_class(1.0F, 1.0F);
   }
}
