package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrud_1 implements rruO {
   private static float[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static byte[] protected_;
   private static boolean[] throws_;
   private static double[] case_;

   @Override
   public void byte_() {
      this.int_();
      this.private_();
      this.implements_();
      this.final_();
      this.implements_();
      this.case_();
      this.native_();
   }

   private void int_() {
      float var1 = 0.05F;
      rrub_1 var2 = ((rrub_1)this.class_[2]).byte_().break_((Float)this.class_[3] * 0.05F);
      rrub_1 var3 = new rrub_1(0.0F, 0.0F, 0.0F);

      for (rruk_1 var5 : (List)this.class_[0]) {
         if (!(Boolean)var5.class_[2]) {
            var3.byte_((rrub_1)var5.class_[0]);
            ((rrub_1)var5.class_[0]).class_(var2);
            ((rrub_1)var5.class_[1]).byte_(var3);
         }
      }
   }

   public rrud_1() {
      this.extends_();
      ArrayList var5 = new ArrayList();
      this.class_[0] = var5;
      ArrayList var6 = new ArrayList();
      this.class_[1] = var6;
      rrub_1 var7 = new rrub_1(0.0F, -1.0F, 0.0F);
      this.class_[2] = var7;
      Float var8 = (float)((Integer)((rruE)rruS.class_[0]).class_[4]).intValue();
      this.class_[3] = var8;
      Integer var9 = 30;
      this.class_[4] = var9;
      Float var10 = 20.0F;
      this.class_[5] = var10;
      Boolean var11 = false;
      this.class_[6] = var11;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean class_(int var1) {
      if (((List)this.class_[0]).size() != var1) {
         ((List)this.class_[0]).clear();
         ((List)this.class_[1]).clear();

         for (int var2 = 0; var2 < var1; var2++) {
            rruk_1 var3 = new rruk_1();
            rrub_1 var10000 = (rrub_1)var3.class_[0];
            Float var8 = (float)(-var2);
            var10000.class_[1] = var8;
            var10000 = (rrub_1)var3.class_[0];
            Float var9 = (float)(-var2);
            var10000.class_[0] = var9;
            Boolean var10 = var2 == 0 ? true : throws_[3];
            var3.class_[2] = var10;
            ((List)this.class_[0]).add(var3);
            if (var2 > 0) {
               ((List)this.class_[1]).add(new rruW((rruk_1)((List)this.class_[0]).get(var2 - 1), var3, 1.0F));
            }
         }

         return throws_[5];
      } else {
         return throws_[6];
      }
   }

   @Override
   public void class_(rrub_1 var1) {
      ((rrub_1)((rruk_1)((List)this.class_[0]).get(0)).class_[1]).byte_((rrub_1)((rruk_1)((List)this.class_[0]).get(0)).class_[0]);
      ((rrub_1)((rruk_1)((List)this.class_[0]).get(0)).class_[0]).class_(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4755344464434380591L;
   }

   @Override
   public void class_(float var1) {
      Float var6 = var1;
      this.class_[3] = var6;
   }

   private rrub_1 class_(rrub_1 var1, rrub_1 var2, double var3) {
      rrub_1 var5 = var1.byte_().break_(var2);
      var5.class_((float)var3).class_(var1);
      return var5;
   }

   @Override
   public float class_() {
      return (Float)this.class_[3];
   }

   @Override
   public void class_(boolean var1) {
      Boolean var6 = var1;
      this.class_[6] = var6;
   }

   private double class_(rrub_1 var1, rrub_1 var2, rrub_1 var3) {
      float var4 = (Float)var2.class_[0] - (Float)var1.class_[0];
      float var5 = (Float)var2.class_[1] - (Float)var1.class_[1];
      float var6 = (Float)var2.class_[0] - (Float)var3.class_[0];
      float var7 = (Float)var2.class_[1] - (Float)var3.class_[1];
      float var8 = var4 * var6 + var5 * var7;
      float var9 = var4 * var7 - var5 * var6;
      double var10 = rfU_2.protected_((double)var9, (double)var8);
      return var10 * 180.0 / Math.PI;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{61, 121, 97, 66, -117, -98, -3, 29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(rrub_1 var1) {
      this.class_[2] = var1;
   }

   @Override
   public boolean break_() {
      return ((List)this.class_[1]).isEmpty();
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 692486837;
   }

   @Override
   public boolean throws_() {
      return (Boolean)this.class_[6];
   }

   private static void finally_() {
      break_ = new float[]{
         0.0F, -1.0F, 0.0F, 20.0F, 1.0F, 0.05F, 0.05F, 0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, 2.0F, 0.5F, 0.5F, 2.0F, 2.0F, 0.0F, 5.0F, 0.0F, 0.0F
      };
   }

   private static void catch_() {
      throws_ = new boolean[]{
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false
      };
   }

   private void extends_() {
      if (this.class_ == null) {
         this.class_ = new Object[7];
         Object[] var1 = this.class_;
         var1[3] = 0.0F;
         var1[4] = 0;
         var1[5] = 0.0F;
         var1[6] = false;
      }
   }

   private void case_() {
      for (int var1 = 1; var1 < ((List)this.class_[0]).size() - 2; var1++) {
         double var2 = this.class_(
            (rrub_1)((rruk_1)((List)this.class_[0]).get(var1)).class_[0],
            (rrub_1)((rruk_1)((List)this.class_[0]).get(var1 - 1)).class_[0],
            (rrub_1)((rruk_1)((List)this.class_[0]).get(var1 + 1)).class_[0]
         );
         if (var2 < (double)(-(Float)this.class_[5])) {
            rrub_1 var4 = this.class_(
               (rrub_1)((rruk_1)((List)this.class_[0]).get(var1)).class_[0],
               (rrub_1)((rruk_1)((List)this.class_[0]).get(var1 - 1)).class_[0],
               (double)(-(Float)this.class_[5] * 2.0F)
            );
            ((rruk_1)((List)this.class_[0]).get(var1 + 1)).class_[0] = var4;
         }

         if (var2 > (double)((Float)this.class_[5]).floatValue()) {
            rrub_1 var11 = this.class_(
               (rrub_1)((rruk_1)((List)this.class_[0]).get(var1)).class_[0],
               (rrub_1)((rruk_1)((List)this.class_[0]).get(var1 - 1)).class_[0],
               (double)((Float)this.class_[5] * 2.0F)
            );
            ((rruk_1)((List)this.class_[0]).get(var1 + 1)).class_[0] = var11;
         }
      }
   }

   private void implements_() {
      boolean var1 = false;
      int var2 = 0;

      do {
         var1 = throws_[12];

         for (int var3 = 0; var3 < ((List)this.class_[0]).size(); var3++) {
            for (int var4 = var3 + 1; var4 < ((List)this.class_[0]).size(); var4++) {
               rruk_1 var5 = (rruk_1)((List)this.class_[0]).get(var3);
               rruk_1 var6 = (rruk_1)((List)this.class_[0]).get(var4);
               rrub_1 var7 = ((rrub_1)var5.class_[0]).byte_().break_((rrub_1)var6.class_[0]);
               if ((double)var7.class_() < 0.99) {
                  var1 = true;
                  var2++;
                  var7.break_();
                  rrub_1 var8 = ((rrub_1)var5.class_[0]).byte_().class_((rrub_1)var6.class_[0]).byte_(2.0F);
                  if (!(Boolean)var5.class_[2]) {
                     rrub_1 var13 = var8.byte_().class_(var7.byte_().break_(0.5F));
                     var5.class_[0] = var13;
                  }

                  if (!(Boolean)var6.class_[2]) {
                     rrub_1 var14 = var8.byte_().break_(var7.byte_().break_(0.5F));
                     var6.class_[0] = var14;
                  }
               }
            }
         }
      } while (var1 && var2 < 32);
   }

   private static void new_() {
      protected_ = new byte[]{30, 32, 2, 7, 3, 4, 5, 6};
   }

   private static void package_() {
      byte_ = new short[]{
         0,
         1,
         2,
         0,
         4,
         3,
         4,
         5,
         6,
         0,
         0,
         1,
         0,
         1,
         0,
         0,
         2,
         0,
         1,
         0,
         2,
         3,
         0,
         2,
         0,
         0,
         1,
         4,
         1,
         1,
         0,
         0,
         1,
         0,
         0,
         0,
         1,
         0,
         0,
         2,
         0,
         2,
         0,
         1,
         2,
         1,
         2,
         0,
         1,
         1,
         0,
         0,
         1,
         0,
         1,
         2,
         1,
         0,
         0,
         2,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         2,
         0,
         2,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         5,
         0,
         0,
         0,
         0,
         5,
         0,
         0,
         5,
         0,
         0,
         0,
         0,
         5,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         2,
         0,
         2,
         0,
         0,
         2,
         2,
         0,
         0,
         2,
         2,
         0,
         0,
         1,
         1,
         0,
         0,
         1,
         1,
         2,
         3,
         3,
         6,
         6,
         1,
         0,
         1,
         0,
         0,
         0,
         0,
         0
      };
   }

   @Override
   public List<rruG> protected_() {
      return (List<rruG>)this.class_[0];
   }

   private void private_() {
      rruk_1 var1 = (rruk_1)((List)this.class_[0]).get(0);

      for (int var2 = 1; var2 < ((List)this.class_[0]).size(); var2++) {
         rruk_1 var3 = (rruk_1)((List)this.class_[0]).get(var2);
         if ((Float)((rrub_1)var3.class_[0]).class_[0] - (Float)((rrub_1)var1.class_[0]).class_[0] > 0.0F) {
            rrub_1 var10000 = (rrub_1)var3.class_[0];
            Float var10 = (Float)((rrub_1)var1.class_[0]).class_[0];
            var10000.class_[0] = var10;
         }

         float var4 = (float)var2 / (float)((List)this.class_[0]).size() * ((float)var2 / (float)((List)this.class_[0]).size()) * 5.0F;
         float var5 = (Float)((rrub_1)var1.class_[0]).class_[2] - (Float)((rrub_1)var3.class_[0]).class_[2];
         if (var5 > var4) {
            rrub_1 var13 = (rrub_1)var3.class_[0];
            Float var11 = (Float)((rrub_1)var1.class_[0]).class_[2] - var4;
            var13.class_[2] = var11;
         }

         if (var5 < -var4) {
            rrub_1 var14 = (rrub_1)var3.class_[0];
            Float var12 = (Float)((rrub_1)var1.class_[0]).class_[2] + var4;
            var14.class_[2] = var12;
         }
      }
   }

   private void final_() {
      for (int var1 = 0; var1 < this.class_[4]; var1++) {
         for (int var2 = ((List)this.class_[1]).size() - 1; var2 >= 0; var2--) {
            rruW var3 = (rruW)((List)this.class_[1]).get(var2);
            rrub_1 var4 = ((rrub_1)((rruk_1)var3.class_[0]).class_[0]).byte_().class_((rrub_1)((rruk_1)var3.class_[1]).class_[0]).byte_(2.0F);
            rrub_1 var5 = ((rrub_1)((rruk_1)var3.class_[0]).class_[0]).byte_().break_((rrub_1)((rruk_1)var3.class_[1]).class_[0]).break_();
            if (!(Boolean)((rruk_1)var3.class_[0]).class_[2]) {
               rruk_1 var10000 = (rruk_1)var3.class_[0];
               rrub_1 var10 = var4.byte_().class_(var5.byte_().break_((Float)var3.class_[2] / 2.0F));
               var10000.class_[0] = var10;
            }

            if (!(Boolean)((rruk_1)var3.class_[1]).class_[2]) {
               rruk_1 var12 = (rruk_1)var3.class_[1];
               rrub_1 var11 = var4.byte_().break_(var5.byte_().break_((Float)var3.class_[2] / 2.0F));
               var12.class_[0] = var11;
            }
         }
      }
   }

   private static void volatile_() {
      case_ = new double[]{0.99, 180.0, Math.PI};
   }

   private void native_() {
      for (int var1 = 0; var1 < ((List)this.class_[1]).size(); var1++) {
         rruW var2 = (rruW)((List)this.class_[1]).get(var1);
         rrub_1 var3 = ((rrub_1)((rruk_1)var2.class_[0]).class_[0]).byte_().break_((rrub_1)((rruk_1)var2.class_[1]).class_[0]).break_();
         if (!(Boolean)((rruk_1)var2.class_[1]).class_[2]) {
            rruk_1 var10000 = (rruk_1)var2.class_[1];
            rrub_1 var8 = ((rrub_1)((rruk_1)var2.class_[0]).class_[0]).byte_().break_(var3.break_((Float)var2.class_[2]));
            var10000.class_[0] = var8;
         }
      }
   }
}
