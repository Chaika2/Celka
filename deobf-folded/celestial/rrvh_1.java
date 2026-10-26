package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvh_1 extends rrtN_2 implements rrZA {
   private static int[] id_byte;
   private static byte[] id_protected;
   private static boolean[] id_native;
   public static Object[] id_class;
   public Object[] id_break;
   private static float[] id_volatile;
   private static String[] id_final;
   private static short[] id_package;
   private static double[] id_int;

   @Override
   public String id_byte() {
      this.id_continue();
      return ((rrZi_1)this.id_break[id_package[15]]).id_private().id_final();
   }

   public rrvh_1(rrZi_1 var1, Supplier<Float> var2, Supplier<Float> var3) {
      super(var2, var3, () -> 140.0F, () -> 14.0F);
      this.id_continue();
      AnimValue var8 = new AnimValue(0.5F, true).id_throws();
      this.id_break[3] = var8;
      this.id_break[id_package[1]] = var1;
      rrZH var10 = new rrZH(0.5F);
      this.id_break[1] = var10;
      rrZl_1 var11 = new rrZl_1(this, (rrZH)this.id_break[1]);
      this.id_break[2] = var11;
      this.id_else();
      this.id_switch();
   }

   static {
      ntfClinit();
   }

   private static void B() {
      id_final = new String[]{new String("ModuleSettingPopUp")};
   }

   private static void S() {
      id_protected = new byte[]{5, -1, -1, 4};
   }

   private static void id_this() {
      id_native = new boolean[]{
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
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

   @Override
   public void id_class(int var1, int var2, int var3) {
      this.id_continue();
      super.id_class(var1, var2, var3);
      ((rrZl_1)this.id_break[2]).id_break(var1, var2, var3);
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      this.id_continue();
      boolean var8 = ((rrZH)this.id_break[1]).id_class(this.id_break(var1, var2, var3), var4, 25.0);
      return !super.id_class(var1, var2, var3, var4, var6, var7) && !var8 ? id_native[14] : true;
   }

   @Override
   public float id_class() {
      return 192.0F;
   }

   @Override
   public float id_class(boolean var1) {
      float var2 = id_volatile[9];

      for (rrtm_3 var5 : this.id_strictfp()) {
         var2 += var1 ? var5.id_class(var5) : var5.id_continue();
      }

      return var2;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-127, 46, -26, -32, -74, 33, -3, -20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1474399309;
   }

   @Override
   public boolean id_class(rrtu_3 var1, int var2, int var3, int var4, boolean var5, boolean var6) {
      this.id_continue();
      ((rrZl_1)this.id_break[2]).id_class(var1, var2, var3, var4, id_native[15]);
      return super.id_class(var1, var2, var3, var4, var5, var6);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5719284113162494025L;
   }

   private float id_class(float var1) {
      this.id_continue();
      byte var2 = 5;
      return var1 + ((float)var2 - ((AnimValue)this.id_break[3]).id_byte() * (float)var2);
   }

   @Override
   public void id_class(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.id_continue();
      super.id_class(var1, var2, var3, var4, var5);
      float var6 = this.id_default();
      float var7 = this.id_abstract();
      if (!var5) {
         ((rrZH)this.id_break[1]).id_class(this.id_class(true) - 14.0F, (float)((int)this.ao_()) - 28.0F);
      }

      this.id_interface().id_class(var1, () -> {
         if (!var5) {
            rrfD_2.id_class(var1, rrZL.id_break, var6 + 1.5F, var7 + 1.5F, 10.5F, 10.0F, -657931);
         }
      }, var2, var3, var4, id_native[4], var5);
   }

   @Override
   public void id_break(Ml_1 var1, rrtu_3 var2, int var3, int var4, boolean var5) {
      this.id_continue();
      if (!var5) {
         float var6 = this.id_default();
         float var7 = this.id_abstract();
         float var8 = this.id_implements();
         float var9 = this.ao_();
         if (this.ah_()) {
            this.id_interface()
               .id_class(var1, () -> rrfD_2.id_class(var1, var6, var7 + 15.0F, var8, var9 - 13.0F, 10.0F, 10.0F, 10.0F, 10.0F, -1), id_native[5], true);
         }

         for (int var10 = this.id_strictfp().size() - 1; var10 >= 0; var10--) {
            rrtm_3 var11 = this.id_strictfp().get(var10);
            if (var11.id_private().ap_()) {
               var11.id_this().id_class().id_class(var11.id_finally().id_private());
            }

            var11.id_class(((rrZH)this.id_break[1]).id_case());
            if (!rrtm_3.id_class(var11, this)) {
               var11.id_class(var1, var2, var3, var4);
            }
         }

         if (this.ah_()) {
            this.id_interface().id_class(var1, rrfi_3::id_class, true, id_native[9]);
         }

         float var12 = this.id_class(true);
         ((AnimValue)this.id_break[3]).id_class(var12 > 192.0F ? true : id_native[12]);
         this.id_interface()
            .id_class(
               var1,
               () -> {
                  this.id_continue();
                  this.id_interface()
                     .id_class(var1, () -> rrfD_2.id_class(var1, var6, var7, var8, var9 + 2.0F, 10.0F, 10.0F, 10.0F, 10.0F, -1), id_native[23], id_native[24]);
                  rrvJ.id_class(var1, (rrZH)this.id_break[1], var6, var7 + 14.0F, var7 + var9 - 21.0F, var8, 25.0F);
                  this.id_interface().id_class(var1, rrfi_3::id_class, true, id_native[26]);
                  if (((AnimValue)this.id_break[3]).id_case()) {
                     float var10x = this.id_class(var8);
                     ((rrZl_1)this.id_break[2])
                        .id_class(
                           var1,
                           var2,
                           var6 + var10x - 9.0F,
                           var7 + 20.0F,
                           var3,
                           var4,
                           5.0F,
                           var12 - 10.0F,
                           var9 - 14.0F - 9.0F,
                           id_native[27],
                           255.0F * ((AnimValue)this.id_break[3]).id_byte()
                        );
                  }
               }
            );
      }
   }

   public float id_finally() {
      float var1 = id_volatile[10];

      for (rrtm_3 var4 : this.id_strictfp()) {
         var1 += var4.id_class(var4);
      }

      return Math.min(var1 - 2.0F, 192.0F) + 10.0F;
   }

   @Override
   public String id_catch() {
      return id_final[0];
   }

   private void id_continue() {
      if (this.id_break == null) {
         this.id_break = new Object[4];
         Object[] var1 = this.id_break;
      }
   }

   private void id_else() {
      this.id_continue();
      if ((rrZi_1)this.id_break[id_package[5]] != null) {
         for (Setting var2 : ((rrZi_1)this.id_break[id_package[6]]).id_private().b()) {
            if (var2 != null) {
               Setting[] var10001 = new Setting[1];
               var10001[id_native[2]] = var2;
               this.id_class(var10001);
            }
         }
      }
   }

   @Override
   public float id_implements() {
      this.id_continue();
      return super.id_implements() + (rrZA.super.ah_() ? 10.0F * ((AnimValue)this.id_break[3]).id_byte() : id_volatile[7]);
   }

   private static void id_package() {
      id_int = new double[]{25.0};
   }

   private static void id_super() {
      id_volatile = new float[]{
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

   private static void id_throw() {
      id_package = new short[]{3, 0, 1, 1, 2, 0, 0, 1, 1, 3, 3, 1, 2, 2, 2, 0, 3, 3, 1, 3, 2, 3, 192};
   }

   private static void id_try() {
      Object[] var0 = new Object[]{192};
      id_class = var0;
   }

   private static void id_while() {
      id_byte = new int[]{-657931};
   }

   @Override
   public boolean id_protected() {
      return true;
   }

   @Override
   public void id_private() {
      this.id_continue();
      super.id_private();
      ((rrZl_1)this.id_break[2]).id_private();
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
      this.id_continue();
      boolean var1 = ((AnimValue)this.id_break[3]).id_case() && this.id_interface().id_class().P() ? true : id_native[20];
      return !rrZA.super.ah_() && !var1 ? id_native[22] : true;
   }
}
