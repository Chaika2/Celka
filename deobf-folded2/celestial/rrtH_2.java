package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtH_2 extends rrtm_3 {
   private static byte[] id_protected;
   private static float[] id_throws;
   private static short[] id_native;
   public Object[] id_byte;
   private static boolean[] id_volatile;

   public rrtH_2(rrtN_2 var1, rrIz_1 var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.id_while();
      this.id_byte[0] = var1;
      this.id_byte[1] = var2;
      rrvX var13 = new rrvX(this, () -> var3, () -> var4);
      this.id_byte[2] = var13;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7842636540898921007L;
   }

   private void id_class(Ml_1 var1, float var2, float var3, float var4, int var5) {
      this.id_while();
      rruv_1 var6 = this.id_volatile();
      rrtF_2.id_class(
         var1,
         this,
         ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).id_finally(),
         ((rrIz_1)this.id_byte[1]).id_throws(),
         var2,
         var3 + 2.5F,
         rrZF.k_,
         255
      );
      RenderSystem.enableAlphaTest();
      if (ClickGuiTheme.id_class()) {
         rrtF_2.id_class(var1, var2 + var4 - 11.0F, var3 + 0.5F, 12.0F, 7.0F, 6, var5, this.id_class((int)(((rrvX)this.id_byte[2]).id_break() * 150.0F)));
      }

      rrtF_2.id_class(
         var1,
         var2 + var4 - 10.0F,
         var3 + 1.5F,
         10.0F,
         5.0F,
         1.0F,
         var5,
         var5,
         ColorHelper.id_class(var5, 0.5F),
         ColorHelper.id_class(var5, 0.5F),
         this.id_class((int)(((rrvX)this.id_byte[2]).id_break() * 255.0F))
      );
      RenderSystem.disableAlphaTest();
      ((rrvX)this.id_byte[2]).id_class(var6.id_break() + 5.0F);
      ((rrvX)this.id_byte[2]).id_break(var6.id_protected() + 3.0F);
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_while();
      if (var4 == 1 && super.id_class(var1, var2, var3, var4, var5)) {
         if (!((rrvX)this.id_byte[2]).id_interface().id_byte()) {
            float var6 = this.id_package() + this.id_private().id_implements() + 5.0F;
            float var7 = this.id_final();
            if (var6 > id_const.id_volatile() - ((rrvX)this.id_byte[2]).id_implements()) {
               var6 = this.id_package();
            }

            if (var7 + ((rrvX)this.id_byte[2]).id_double() > id_const.id_final()) {
               var7 = this.id_final() - ((rrvX)this.id_byte[2]).id_double();
            }

            var1.id_class(((rrvX)this.id_byte[2]).id_class(var6, var7), () -> {
               this.id_while();
               ((rrvX)this.id_byte[2]).id_class(var1);
            });
         }

         return id_volatile[1];
      } else {
         return id_volatile[2];
      }
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      this.id_while();
      super.id_class(var1, var2, var3, var4);
      float var5 = this.id_package();
      float var6 = this.id_final();
      float var7 = this.id_new();
      int var8 = ((rrIz_1)this.id_byte[1]).id_byte();
      this.id_private().id_interface().id_class(var1, () -> this.id_class(var1, var5, var6, var7, var8));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{44, -69, 46, -34, 125, -84, -11, 78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 197262072;
   }

   @Override
   public Setting<Integer> id_finally() {
      this.id_while();
      return (rrIz_1)this.id_byte[1];
   }

   private static void id_goto() {
      id_throws = new float[]{2.5F, 11.0F, 0.5F, 12.0F, 7.0F, 150.0F, 10.0F, 1.5F, 10.0F, 5.0F, 1.0F, 0.5F, 0.5F, 255.0F, 5.0F, 3.0F, 5.0F, 11.0F, 12.0F, 8.0F};
   }

   private static void id_return() {
      id_volatile = new boolean[]{true, true, false};
   }

   private static void id_try() {
      id_native = new short[]{0, 1, 2, 1, 0, 1, 255, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 1, 2};
   }

   private void id_while() {
      if (this.id_byte == null) {
         this.id_byte = new Object[3];
         Object[] var1 = this.id_byte;
      }
   }

   private static void id_public() {
      id_protected = new byte[]{6, 3};
   }

   @Override
   public rrtN_2 id_private() {
      this.id_while();
      return (rrtN_2)this.id_byte[0];
   }

   @Override
   public rruv_1 id_volatile() {
      return new rruv_1(this.id_package() + this.id_new() - 11.0F, this.id_final(), 12.0F, 8.0F);
   }

   public rrIz_1 id_synchronized() {
      this.id_while();
      return (rrIz_1)this.id_byte[1];
   }
}
