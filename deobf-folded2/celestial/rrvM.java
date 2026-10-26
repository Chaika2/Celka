package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvM extends rrtN_2 implements rrZA {
   private static short[] id_byte;
   private static float[] id_protected;
   private static double[] id_native;
   public Object[] id_class;
   public static Object[] id_break;
   private static int[] id_volatile;
   private static boolean[] id_final;
   private static byte[] id_package;
   private static String[] id_int;

   @Override
   public String id_byte() {
      this.id_throw();
      return ((rrZY)this.id_class[0]).id_break().id_case();
   }

   public rrvM(rrZY var1, Supplier<Float> var2, Supplier<Float> var3) {
      super(var2, var3, () -> 140.0F, () -> 14.0F);
      this.id_throw();
      AnimValue var8 = new AnimValue(0.5F, true).id_throws();
      this.id_class[3] = var8;
      this.id_class[0] = var1;
      rrZH var10 = new rrZH(0.5F);
      this.id_class[1] = var10;
      rrZl_1 var11 = new rrZl_1(this, (rrZH)this.id_class[1]);
      this.id_class[2] = var11;
      this.id_else();
      this.id_switch();
   }

   static {
      ntfClinit();
   }

   private static void B() {
      id_package = new byte[]{5, -1, -1, 4};
   }

   private static void id_this() {
      id_protected = new float[]{
         0.5F,
         0.5F,
         14.0F,
         28.0F,
         192.0F,
         192.0F,
         10.0F,
         0.0F,
         192.0F,
         0.0F,
         0.0F,
         2.0F,
         192.0F,
         10.0F,
         14.0F,
         21.0F,
         25.0F,
         9.0F,
         20.0F,
         5.0F,
         10.0F,
         14.0F,
         9.0F,
         255.0F,
         2.0F,
         10.0F,
         10.0F,
         10.0F,
         10.0F,
         15.0F,
         13.0F,
         10.0F,
         10.0F,
         10.0F,
         10.0F,
         1.5F,
         1.5F,
         10.5F,
         10.0F,
         14.0F,
         140.0F
      };
   }

   private static void s() {
      id_final = new boolean[]{
         true,
         true,
         false,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false
      };
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{1, 51, -100, 79, -102, -108, 30, -34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      this.id_throw();
      ((rrZl_1)this.id_class[2]).id_class(var1, var2, var3, var4, false);
      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   private float id_class(float var1) {
      this.id_throw();
      byte var2 = 5;
      return var1 + ((float)var2 - ((AnimValue)this.id_class[3]).id_byte() * (float)var2);
   }

   @Override
   public float id_class() {
      return 192.0F;
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.id_throw();
      super.id_class(var1, var2, var3, var4, var5);
      float var6 = this.id_default();
      float var7 = this.id_abstract();
      if (!var5) {
         ((rrZH)this.id_class[1]).id_class(this.id_class(true) - 14.0F, (float)((int)this.ao_()) - 28.0F);
      }

      this.id_interface().id_class(var1, () -> {
         if (!var5) {
            rrfD_2.id_class(var1, rrZL.id_break, var6 + 1.5F, var7 + 1.5F, 10.5F, 10.0F, -657931);
         }
      }, var2, var3, var4, true, var5);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7544597634608847112L;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      this.id_throw();
      boolean var8 = ((rrZH)this.id_class[1]).id_class(this.id_break(var1, var2, var3), var4, 25.0);
      return !super.id_class(var1, var2, var3, var4, var6, var7) && !var8 ? id_final[14] : id_final[13];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1346067524;
   }

   @Override
   public void id_class(int var1, int var2, int var3) {
      this.id_throw();
      super.id_class(var1, var2, var3);
      ((rrZl_1)this.id_class[2]).id_break(var1, var2, var3);
   }

   @Override
   public float id_class(boolean var1) {
      float var2 = 0.0F;

      for (rrtm_3 var5 : this.id_strictfp()) {
         var2 += var1 ? var5.id_class(var5) : var5.id_continue();
      }

      return var2;
   }

   @Override
   public void id_break(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.id_throw();
      if (!var5) {
         float var6 = this.id_class(true);
         ((AnimValue)this.id_class[3]).id_class(var6 > 192.0F ? true : id_final[7]);
         float var7 = this.id_default();
         float var8 = this.id_abstract();
         float var9 = this.id_implements();
         float var10 = this.ao_();
         if (this.ah_()) {
            this.id_interface()
               .id_class(var1, () -> rrfD_2.id_class(var1, var7, var8 + 15.0F, var9, var10 - 13.0F, 10.0F, 10.0F, 10.0F, 10.0F, -1), false, true);
         }

         for (int var11 = this.id_strictfp().size() - 1; var11 >= 0; var11--) {
            rrtm_3 var12 = this.id_strictfp().get(var11);
            if (var12.id_private().ap_()) {
               var12.id_this().id_class().id_class(var12.id_finally().id_private());
            }

            var12.id_class(((rrZH)this.id_class[1]).id_case());
            if (!rrtm_3.id_class(var12, this)) {
               var12.id_class(var1, var2, var3, var4);
            }
         }

         if (this.ah_()) {
            this.id_interface().id_class(var1, rrfi_3::id_class, true, false);
         }

         this.id_interface()
            .id_class(
               var1,
               () -> {
                  this.id_throw();
                  this.id_interface().id_class(var1, () -> rrfD_2.id_class(var1, var7, var8, var9, var10 + 2.0F, 10.0F, 10.0F, 10.0F, 10.0F, -1), false, false);
                  rrvJ.id_class(var1, (rrZH)this.id_class[1], var7, var8 + 14.0F, var8 + var10 - 21.0F, var9, 25.0F);
                  this.id_interface().id_class(var1, rrfi_3::id_class, true, false);
                  if (((AnimValue)this.id_class[3]).id_case()) {
                     float var10x = this.id_class(var9);
                     ((rrZl_1)this.id_class[2])
                        .id_class(
                           var1,
                           var2,
                           var7 + var10x - 9.0F,
                           var8 + 20.0F,
                           var3,
                           var4,
                           5.0F,
                           var6 - 10.0F,
                           var10 - 14.0F - 9.0F,
                           false,
                           255.0F * ((AnimValue)this.id_class[3]).id_byte()
                        );
                  }
               }
            );
      }
   }

   public float id_finally() {
      float var1 = 0.0F;

      for (rrtm_3 var4 : this.id_strictfp()) {
         var1 += var4.id_class(var4);
      }

      return Math.min(var1 - 2.0F, 192.0F) + 10.0F;
   }

   @Override
   public String id_catch() {
      return "AutoBuySettingPopUp";
   }

   private static void id_continue() {
      id_int = new String[]{new String("AutoBuySettingPopUp")};
   }

   private void id_else() {
      this.id_throw();
      if ((rrZY)this.id_class[0] != null) {
         rrNd_1 var1 = ((rrZY)this.id_class[0]).id_break();

         for (Setting var3 : var1.b()) {
            if (var3 != null) {
               this.id_class(new Setting[]{var3});
            }
         }
      }
   }

   @Override
   public float id_implements() {
      this.id_throw();
      return super.id_implements() + (rrZA.super.ah_() ? 10.0F * ((AnimValue)this.id_class[3]).id_byte() : id_protected[7]);
   }

   private static void id_return() {
      id_byte = new short[]{3, 0, 1, 1, 2, 0, 0, 1, 3, 1, 3, 1, 2, 2, 2, 0, 3, 3, 1, 3, 2, 3, 192};
   }

   private static void id_super() {
      id_native = new double[]{25.0};
   }

   private void id_throw() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_try() {
      Object[] var0 = new Object[]{192};
      id_break = var0;
   }

   private static void id_while() {
      id_volatile = new int[]{-657931};
   }

   @Override
   public boolean id_protected() {
      return true;
   }

   @Override
   public void id_private() {
      this.id_throw();
      super.id_private();
      ((rrZl_1)this.id_class[2]).id_private();
   }

   @Override
   public boolean ap_() {
      return true;
   }

   @Override
   public float ao_() {
      return this.id_class(true) > 192.0F ? this.id_finally() : super.ao_();
   }

   @Override
   public boolean ah_() {
      this.id_throw();
      boolean var1 = ((AnimValue)this.id_class[3]).id_case() && this.id_interface().id_class().P() ? true : id_final[20];
      return !rrZA.super.ah_() && !var1 ? id_final[22] : id_final[21];
   }
}
