package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EN implements Ec_1 {
   public Object[] class_;
   private static short[] byte_;
   public static Object[] break_;
   private static byte[] protected_;
   private static boolean[] throws_;

   @Override
   public boolean byte_() {
      return this.class_[1] == 0 ? true : throws_[8];
   }

   public EN(int var1) {
      this.catch_();
      Integer var6 = 0;
      this.class_[1] = var6;
      EQ[] var7 = new EQ[var1];
      this.class_[0] = var7;
   }

   public EN() {
      this(1024);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1567374055445369379L;
   }

   @Override
   public void class_(EQ var1) {
      if ((Integer)this.class_[1] >= ((EQ[])this.class_[0]).length - 1) {
         EQ[] var6 = Arrays.copyOf((EQ[])this.class_[0], ((EQ[])this.class_[0]).length << 1);
         this.class_[0] = var6;
      }

      Integer var7 = (Integer)this.class_[1] + 1;
      this.class_[1] = var7;
      Integer var8 = (Integer)this.class_[1];
      var1.class_[7] = var8;
      ((EQ[])this.class_[0])[this.class_[1]] = var1;
      this.break_(var1);
   }

   public int class_() {
      return (Integer)this.class_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 978946705;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-34, 33, -81, -22, 123, -117, 19, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public EQ break_() {
      if ((Integer)this.class_[1] == 0) {
         throw new IllegalStateException();
      } else {
         EQ var1 = ((EQ[])this.class_[0])[1];
         EQ var2 = ((EQ[])this.class_[0])[this.class_[1]];
         ((EQ[])this.class_[0])[1] = var2;
         Integer var17 = 1;
         var2.class_[7] = var17;
         ((EQ[])this.class_[0])[this.class_[1]] = null;
         Integer var18 = (Integer)this.class_[1] - 1;
         this.class_[1] = var18;
         Integer var19 = -1;
         var1.class_[7] = var19;
         if ((Integer)this.class_[1] < 2) {
            return var1;
         } else {
            int var3 = throws_[13];
            int var4 = 2;
            double var5 = (Double)var2.class_[5];

            do {
               EQ var7 = ((EQ[])this.class_[0])[var4];
               double var8 = (Double)var7.class_[5];
               if (var4 < (Integer)this.class_[1]) {
                  EQ var10 = ((EQ[])this.class_[0])[var4 + 1];
                  double var11 = (Double)var10.class_[5];
                  if (var8 > var11) {
                     var4++;
                     var8 = var11;
                     var7 = var10;
                  }
               }

               if (var5 <= var8) {
                  break;
               }

               ((EQ[])this.class_[0])[var3] = var7;
               ((EQ[])this.class_[0])[var4] = var2;
               Integer var20 = var4;
               var2.class_[7] = var20;
               Integer var21 = var3;
               var7.class_[7] = var21;
               var3 = var4;
            } while ((var4 <<= 1) <= this.class_[1]);

            return var1;
         }
      }
   }

   @Override
   public void break_(EQ var1) {
      int var2 = (Integer)var1.class_[7];
      int var3 = var2 >>> 1;
      double var4 = (Double)var1.class_[5];

      for (EQ var6 = ((EQ[])this.class_[0])[var3]; var2 > 1 && var6.class_[5] > var4; var6 = ((EQ[])this.class_[0])[var3]) {
         ((EQ[])this.class_[0])[var2] = var6;
         ((EQ[])this.class_[0])[var3] = var1;
         Integer var11 = var3;
         var1.class_[7] = var11;
         Integer var12 = var2;
         var6.class_[7] = var12;
         var2 = var3;
         var3 >>>= 1;
      }
   }

   private static void throws_() {
      byte_ = new short[]{
         1024,
         1,
         0,
         1,
         1,
         0,
         0,
         0,
         0,
         1,
         1,
         1,
         7,
         0,
         1,
         7,
         5,
         0,
         5,
         0,
         0,
         7,
         7,
         0,
         1,
         1,
         0,
         0,
         1,
         0,
         7,
         0,
         1,
         1,
         1,
         7,
         1,
         5,
         0,
         5,
         1,
         0,
         5,
         0,
         0,
         7,
         7,
         1,
         1024
      };
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = 0;
      }
   }

   private static void case_() {
      throws_ = new boolean[]{false, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, false, true, false};
   }

   private static void protected_() {
      protected_ = new byte[]{-1, 2, 2, 2};
   }

   private static void private_() {
      Object[] var0 = new Object[]{1024};
      break_ = var0;
   }
}
