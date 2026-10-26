package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EN implements Ec_1 {
   public Object[] id_class;
   private static short[] id_byte;
   public static Object[] id_break;
   private static byte[] id_protected;
   private static boolean[] id_throws;

   @Override
   public boolean id_byte() {
      return this.id_class[1] == 0 ? true : id_throws[8];
   }

   public EN(int var1) {
      this.id_catch();
      Integer var6 = Integer.valueOf(id_throws[0]);
      this.id_class[1] = var6;
      EQ[] var7 = new EQ[var1];
      this.id_class[id_byte[2]] = var7;
   }

   public EN() {
      this(1024);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1567374055445369379L;
   }

   @Override
   public void id_class(EQ var1) {
      if ((Integer)this.id_class[1] >= ((EQ[])this.id_class[id_byte[5]]).length - 1) {
         EQ[] var6 = Arrays.copyOf((EQ[])this.id_class[id_byte[6]], ((EQ[])this.id_class[id_byte[7]]).length << 1);
         this.id_class[id_byte[8]] = var6;
      }

      Integer var7 = (Integer)this.id_class[1] + 1;
      this.id_class[1] = var7;
      Integer var8 = (Integer)this.id_class[1];
      var1.id_class[7] = var8;
      ((EQ[])this.id_class[id_byte[13]])[this.id_class[1]] = var1;
      this.id_break(var1);
   }

   public int id_class() {
      return (Integer)this.id_class[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 978946705;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-34, 33, -81, -22, 123, -117, 19, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public EQ id_break() {
      if ((Integer)this.id_class[1] == 0) {
         throw new IllegalStateException();
      } else {
         EQ var1 = ((EQ[])this.id_class[id_byte[26]])[1];
         EQ var2 = ((EQ[])this.id_class[id_byte[27]])[this.id_class[1]];
         ((EQ[])this.id_class[id_byte[29]])[1] = var2;
         Integer var17 = 1;
         var2.id_class[7] = var17;
         ((EQ[])this.id_class[id_byte[31]])[this.id_class[1]] = null;
         Integer var18 = (Integer)this.id_class[1] - 1;
         this.id_class[1] = var18;
         Integer var19 = -1;
         var1.id_class[7] = var19;
         if ((Integer)this.id_class[1] < 2) {
            return var1;
         } else {
            int var3 = 1;
            int var4 = 2;
            double var5 = (Double)var2.id_class[5];

            do {
               EQ var7 = ((EQ[])this.id_class[id_byte[38]])[var4];
               double var8 = (Double)var7.id_class[5];
               if (var4 < (Integer)this.id_class[1]) {
                  EQ var10 = ((EQ[])this.id_class[id_byte[41]])[var4 + 1];
                  double var11 = (Double)var10.id_class[5];
                  if (var8 > var11) {
                     var4++;
                     var8 = var11;
                     var7 = var10;
                  }
               }

               if (var5 <= var8) {
                  break;
               }

               ((EQ[])this.id_class[id_byte[43]])[var3] = var7;
               ((EQ[])this.id_class[id_byte[44]])[var4] = var2;
               Integer var20 = var4;
               var2.id_class[7] = var20;
               Integer var21 = var3;
               var7.id_class[7] = var21;
               var3 = var4;
            } while ((var4 <<= 1) <= this.id_class[1]);

            return var1;
         }
      }
   }

   @Override
   public void id_break(EQ var1) {
      int var2 = (Integer)var1.id_class[7];
      int var3 = var2 >>> 1;
      double var4 = (Double)var1.id_class[5];

      for (EQ var6 = ((EQ[])this.id_class[id_byte[17]])[var3]; var2 > 1 && var6.id_class[5] > var4; var6 = ((EQ[])this.id_class[id_byte[23]])[var3]) {
         ((EQ[])this.id_class[id_byte[19]])[var2] = var6;
         ((EQ[])this.id_class[id_byte[20]])[var3] = var1;
         Integer var11 = var3;
         var1.id_class[7] = var11;
         Integer var12 = var2;
         var6.id_class[7] = var12;
         var2 = var3;
         var3 >>>= 1;
      }
   }

   private static void id_throws() {
      id_byte = new short[]{
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

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[1] = Integer.valueOf(id_throws[17]);
      }
   }

   private static void id_case() {
      id_throws = new boolean[]{false, true, true, true, true, true, true, true, false, true, true, true, true, true, true, true, true, false, true, false};
   }

   private static void id_protected() {
      id_protected = new byte[]{-1, 2, 2, 2};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{1024};
      id_break = var0;
   }
}
