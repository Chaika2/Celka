package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtT_2 extends rrtm_3 implements rrvs_1 {
   private static float[] id_throws;
   public static Object[] id_byte;
   private static byte[] id_native;
   private static String[] id_volatile;
   public Object[] id_protected;
   private static boolean[] id_final;
   private static short[] id_package;

   @Override
   public void id_byte(int var1, int var2, int var3) {
      this.id_return();
      super.id_byte(var1, var2, var3);
      if (((rrIF)this.id_protected[1]).id_volatile() || var1 != 261 && var1 != 256) {
         Boolean var8 = false;
         this.id_protected[2] = var8;
      }
   }

   public rrtT_2(rrtN_2 var1, rrIF var2, float var3, float var4, float var5, float var6) {
      super(var3, var4, var5, var6);
      this.id_return();
      AnimValue var11 = new AnimValue(0.5F, true);
      this.id_protected[4] = var11;
      AnimValue var12 = new AnimValue(0.5F, true);
      this.id_protected[5] = var12;
      this.id_protected[0] = var1;
      this.id_protected[1] = var2;
      ((AnimValue)this.id_protected[4]).id_class(this.id_class(this.id_instanceof(), this.id_class(((rrIF)this.id_protected[1]).id_finally())));
      ((AnimValue)this.id_protected[5]).id_class();
      ((rrvd_1)rrvd_1.staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[0]).id_break(this);
   }

   static {
      ntfClinit();
   }

   private static void id_interface() {
      id_volatile = new String[]{new String("?")};
   }

   @Override
   public void id_class(int var1, int var2, int var3) {
      this.id_return();
      super.id_class(var1, var2, var3);
      if ((Boolean)this.id_protected[2]) {
         switch (var1) {
            case 256:
            case 261:
               ((rrIF)this.id_protected[1]).id_class((KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0], false, true);
               break;
            default:
               ((rrIF)this.id_protected[1]).id_class(rrfC_2.id_class(var1), false, true);
         }
      }
   }

   public float id_class(rrZO var1, String var2) {
      return var1.id_break(var2) + 4.0F;
   }

   private void id_class(Ml_1 var1, rrZO var2, rrZO var3, float var4, float var5, float var6, String var7) {
      this.id_return();
      rrtF_2.id_class(var1, this, var2, ((rrIF)this.id_protected[1]).id_throws(), var4, var5 + 3.0F, rrZF.k_, 255);
      ((AnimValue)this.id_protected[4]).id_break(this.id_class(var3, var7));
      Float var13 = ((AnimValue)this.id_protected[4]).id_byte();
      this.id_protected[3] = var13;
      boolean var8 = ((AnimValue)this.id_protected[4]).id_protected();
      ((AnimValue)this.id_protected[5]).id_class(var8);
      rrtw_3.id_class(var1, this, var4 + var6 - (Float)this.id_protected[3], var5, (Float)this.id_protected[3], 10.0F);
      if (var8) {
         rrtF_2.id_protected(
            var1,
            this,
            this.id_instanceof(),
            var7,
            var4 + var6 - (Float)this.id_protected[3] + 2.0F,
            var5 + 3.0F,
            rrZF.d_,
            (int)(((AnimValue)this.id_protected[5]).id_byte() * 255.0F)
         );
      }
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4) {
      this.id_return();
      super.id_class(var1, var2, var3, var4);
      rrZO var5 = this.id_throw();
      rrZO var6 = this.id_instanceof();
      float var7 = this.id_package();
      float var8 = this.id_final();
      float var9 = this.id_new();
      KeyBind var10 = ((rrIF)this.id_protected[1]).id_finally();
      this.id_private().id_interface().id_class(var1, () -> this.id_class(var1, var5, var6, var7, var8, var9, this.id_class(var10)));
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4) {
      this.id_return();
      super.id_class(var1, var2, var3, var4);
      if ((Boolean)this.id_protected[2]) {
         ((rrIF)this.id_protected[1]).id_class(rrfC_2.id_class(var4), false, true);
         Boolean var9 = false;
         this.id_protected[2] = var9;
      }

      return id_final[13];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3218405159159548219L;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.id_return();
      if (var4 == 0 && super.id_class(var1, var2, var3, var4, var5)) {
         Boolean var10 = true;
         this.id_protected[2] = var10;
         return true;
      } else {
         return id_final[9];
      }
   }

   private String id_class(KeyBind var1) {
      this.id_return();
      return this.id_protected[2] ? "?" : var1.id_break();
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{40, -27, -67, 16, -71, 108, -21, 70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1997779396;
   }

   @Override
   public Setting<?> id_finally() {
      this.id_return();
      return (rrIF)this.id_protected[1];
   }

   private static void id_goto() {
      id_package = new short[]{
         4, 5, 0, 1, 4, 1, 5, 0, 1, 1, 255, 4, 4, 3, 4, 5, 3, 3, 3, 5, 2, 1, 0, 1, 1, 261, 256, 2, 2, 2, 1, 2, 2, 2, 0, 3, 3, 1, 2, 1, 1, 2
      };
   }

   @Override
   public void id_case() {
      this.id_return();
      super.id_case();
      Boolean var5 = false;
      this.id_protected[2] = var5;
   }

   private rrZO id_instanceof() {
      this.id_return();
      return ((rrIF)this.id_protected[1]).id_native();
   }

   private void id_return() {
      if (this.id_protected == null) {
         this.id_protected = new Object[6];
         Object[] var1 = this.id_protected;
         var1[2] = false;
         var1[3] = 0.0F;
      }
   }

   private rrZO id_throw() {
      this.id_return();
      return ((rrIF)this.id_protected[1]).id_extends();
   }

   private static void id_try() {
      id_throws = new float[]{0.5F, 0.5F, 3.0F, 10.0F, 2.0F, 3.0F, 255.0F, 10.0F, 4.0F, 0.0F};
   }

   private static void id_while() {
      id_native = new byte[]{6, 2, 3, 10};
   }

   private static void id_public() {
      Object[] var0 = new Object[]{10};
      id_byte = var0;
   }

   @Override
   public rrtN_2 id_private() {
      this.id_return();
      return (rrtN_2)this.id_protected[0];
   }

   @Override
   public rruv_1 id_volatile() {
      this.id_return();
      return new rruv_1(this.id_package() + this.id_new() - (Float)this.id_protected[3], this.id_final(), (Float)this.id_protected[3], 10.0F);
   }

   private static void id_synchronized() {
      id_final = new boolean[]{true, true, false, true, false, true, false, true, true, false, false, true, false, false, false, false, false, true, false};
   }

   @Override
   public boolean aO_() {
      this.id_return();
      return (Boolean)this.id_protected[2];
   }

   @Override
   public void aP_() {
      this.id_return();
      super.aP_();
      Boolean var5 = false;
      this.id_protected[2] = var5;
   }
}
