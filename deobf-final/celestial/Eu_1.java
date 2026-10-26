package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Eu_1 implements Ec_1 {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;

   @Override
   public boolean byte_() {
      return (Em_1)this.class_[0] == null ? true : byte_[1];
   }

   public Eu_1() {
      this.class_();
      Object var5 = null;
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5817836150584933902L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -236754141;
   }

   @Override
   public void class_(EQ var1) {
      Em_1 var2 = new Em_1();
      var2.class_[1] = var1;
      Em_1 var8 = (Em_1)this.class_[0];
      var2.class_[0] = var8;
      this.class_[0] = var2;
   }

   private void class_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-21, -50, 1, -125, 9, -44, -126, 50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(EQ var1) {
   }

   @Override
   public EQ break_() {
      if ((Em_1)this.class_[0] == null) {
         return null;
      } else {
         Em_1 var1 = (Em_1)((Em_1)this.class_[0]).class_[0];
         if (var1 == null) {
            Em_1 var18 = (Em_1)this.class_[0];
            Object var13 = null;
            this.class_[0] = var13;
            return (EQ)var18.class_[1];
         } else {
            Em_1 var2 = (Em_1)this.class_[0];
            double var3 = (Double)((EQ)((Em_1)this.class_[0]).class_[1]).class_[5];
            Em_1 var5 = (Em_1)this.class_[0];

            Em_1 var6;
            for (var6 = null; var1 != null; var1 = (Em_1)var1.class_[0]) {
               double var7 = (Double)((EQ)var1.class_[1]).class_[5];
               if (var7 < var3) {
                  var3 = var7;
                  var5 = var1;
                  var6 = var2;
               }

               var2 = var1;
            }

            if (var6 == null) {
               Em_1 var14 = (Em_1)((Em_1)this.class_[0]).class_[0];
               this.class_[0] = var14;
               Object var15 = null;
               var5.class_[0] = var15;
               return (EQ)var5.class_[1];
            } else {
               Em_1 var16 = (Em_1)var5.class_[0];
               var6.class_[0] = var16;
               Object var17 = null;
               var5.class_[0] = var17;
               return (EQ)var5.class_[1];
            }
         }
      }
   }

   private static void throws_() {
      byte_ = new boolean[]{true, false, true};
   }

   private static void protected_() {
      break_ = new short[]{0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 5, 0, 1, 5, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1};
   }
}
