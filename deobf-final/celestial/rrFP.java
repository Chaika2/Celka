package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFP extends rrFr_1 {
   private static long[] byte_;
   private static String[] protected_;
   private static double[] throws_;
   private static short[] case_;
   private static boolean[] catch_;
   private static byte[] private_;
   private static float[] implements_;
   public Object[] break_;

   @Override
   public boolean byte_() {
      return false;
   }

   private long byte_(long var1) {
      this.super_();
      long var3 = var1 - (Long)this.break_[10];
      if (var3 >= 0L && var3 < 300L) {
         float var5 = (float)var3 / 300.0F;
         float var6 = var5 < 0.5F ? var5 : implements_[5] - var5;
         return var1 - (long)(var6 * 300.0F);
      } else {
         return var1;
      }
   }

   private static void int_() {
      case_ = new short[]{8, 10, 0, 1, 2, 3, 1, 8, 5, 4, 6, 7, 6, 4, 1, 0, 0, 5, 0, 6, 57, 57, 3, 7, 0, 8, 10, 5, 0, 9, 10, 9, 10, 2, 57, 57, 1, 2, 0};
   }

   public rrFP(rrHv_1 var1) {
      this.super_();
      String var7 = "";
      this.break_[8] = var7;
      Long var8 = -4611686018427387904L;
      this.break_[10] = var8;
      this.break_[0] = var1;
      rdn_3 var2 = var1.byte_();
      rdn_3 var10 = var2.implements_();
      this.break_[1] = var10;
      Predicate var11 = var1.protected_();
      this.break_[2] = var11;
      rdb_3 var12 = var2.break_();
      this.break_[3] = var12;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      implements_ = new float[]{0.0F, 300.0F, -4.0F, 300.0F, 0.5F, 1.0F, 300.0F};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 779070896;
   }

   @Override
   public rdn_3 class_() {
      this.super_();
      return (rdn_3)this.break_[1];
   }

   @Override
   public float class_(long var1) {
      this.super_();
      long var3 = var1 - (Long)this.break_[10];
      if (var3 >= 0L && var3 < 300L) {
         float var5 = (float)var3 / 300.0F;
         return -4.0F * (float)Math.sin(Math.PI * (double)var5);
      } else {
         return implements_[0];
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{34, -122, -33, 3, 66, 75, 49, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(rrZO var1) {
      this.super_();
      int var2 = this.continue_();
      Boolean var7 = var2 > 0 ? true : catch_[6];
      this.break_[4] = var7;
      ((rdn_3)this.break_[1]).throws_(var2);
      Boolean var8 = ((rrHv_1)this.break_[0]).throws_().finally_() != (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0] ? true : catch_[8];
      this.break_[5] = var8;
      Boolean var9 = ((rrHv_1)this.break_[0]).class_().aJ_();
      this.break_[6] = var9;
      Boolean var10 = (cb_3)import_.class_[57] != null && ((cb_3)import_.class_[57]).sK().class_((rdb_3)this.break_[3]) ? true : catch_[10];
      this.break_[7] = var10;
      String var11 = ((rrHv_1)this.break_[0]).throws_().finally_().break_();
      this.break_[8] = var11;
   }

   @Override
   public void break_(long var1) {
      this.protected_(var1);
   }

   @Override
   public boolean break_(boolean var1) {
      this.super_();
      return var1 && this.break_[6] ? true : catch_[4];
   }

   private static long throws_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3516123892194555693L;
   }

   public rrHv_1 extends_() {
      this.super_();
      return (rrHv_1)this.break_[0];
   }

   private int continue_() {
      this.super_();
      if ((Predicate)this.break_[2] != null && (cb_3)import_.class_[57] != null) {
         int var1 = catch_[14];

         for (int var2 = 0; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
            if (((Predicate)this.break_[2]).test(var3)) {
               var1 += var3.char_();
            }
         }

         return var1;
      } else {
         return catch_[13];
      }
   }

   @Override
   public String implements_() {
      this.super_();
      return (String)this.break_[8];
   }

   private static void new_() {
      protected_ = new String[]{new String("")};
   }

   private static void package_() {
      private_ = new byte[]{45, 11, 4, 5, 6, 7, 9, 10};
   }

   private void super_() {
      if (this.break_ == null) {
         this.break_ = new Object[11];
         Object[] var1 = this.break_;
         var1[4] = false;
         var1[5] = false;
         var1[6] = false;
         var1[7] = false;
         var1[9] = false;
         var1[10] = 0L;
      }
   }

   @Override
   public boolean protected_() {
      this.super_();
      return this.break_[5] && this.break_[4] && this.break_[6] && !this.break_[7] ? true : catch_[2];
   }

   private void protected_(long var1) {
      this.super_();
      boolean var3 = this.break_[5] && ((rrHv_1)this.break_[0]).throws_().break_() ? true : catch_[12];
      if (var3 && !(Boolean)this.break_[9]) {
         Long var8 = this.byte_(var1);
         this.break_[10] = var8;
      }

      Boolean var9 = var3;
      this.break_[9] = var9;
   }

   private static void final_() {
      byte_ = new long[]{-4611686018427387904L, 0L, 300L, 0L, 300L, 0L};
   }

   private static void volatile_() {
      catch_ = new boolean[]{
         false, true, false, true, false, true, false, true, false, true, false, true, false, false, false, false, false, false, false, false, false
      };
   }

   private static void native_() {
      throws_ = new double[]{Math.PI};
   }
}
