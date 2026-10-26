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
      return this.id_class[id_byte[24]] == 0 ? id_throws[7] : id_throws[8];
   }

   public EN(int var1) {
      this.id_catch();
      Integer var6 = Integer.valueOf(id_throws[0]);
      this.id_class[id_byte[1]] = var6;
      EQ[] var7 = new EQ[var1];
      this.id_class[id_byte[2]] = var7;
   }

   public EN() {
      this(id_byte[0]);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1567374055445369379L;
   }

   @Override
   public void id_class(EQ var1) {
      if ((Integer)this.id_class[id_byte[4]] >= ((EQ[])this.id_class[id_byte[5]]).length - id_throws[1]) {
         EQ[] var6 = Arrays.copyOf((EQ[])this.id_class[id_byte[6]], ((EQ[])this.id_class[id_byte[7]]).length << id_throws[2]);
         this.id_class[id_byte[8]] = var6;
      }

      Integer var7 = (Integer)this.id_class[id_byte[9]] + id_throws[3];
      this.id_class[id_byte[10]] = var7;
      Integer var8 = (Integer)this.id_class[id_byte[11]];
      var1.id_class[id_byte[12]] = var8;
      ((EQ[])this.id_class[id_byte[13]])[this.id_class[id_byte[14]]] = var1;
      this.id_break(var1);
   }

   public int id_class() {
      return (Integer)this.id_class[id_byte[3]];
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
      if ((Integer)this.id_class[id_byte[25]] == 0) {
         throw new IllegalStateException();
      } else {
         EQ var1 = ((EQ[])this.id_class[id_byte[26]])[id_throws[9]];
         EQ var2 = ((EQ[])this.id_class[id_byte[27]])[this.id_class[id_byte[28]]];
         ((EQ[])this.id_class[id_byte[29]])[id_throws[10]] = var2;
         Integer var17 = Integer.valueOf(id_throws[11]);
         var2.id_class[id_byte[30]] = var17;
         ((EQ[])this.id_class[id_byte[31]])[this.id_class[id_byte[32]]] = null;
         Integer var18 = (Integer)this.id_class[id_byte[33]] - id_throws[12];
         this.id_class[id_byte[34]] = var18;
         Integer var19 = Integer.valueOf(id_protected[0]);
         var1.id_class[id_byte[35]] = var19;
         if ((Integer)this.id_class[id_byte[36]] < id_protected[1]) {
            return var1;
         } else {
            int var3 = id_throws[13];
            int var4 = id_protected[2];
            double var5 = (Double)var2.id_class[id_byte[37]];

            do {
               EQ var7 = ((EQ[])this.id_class[id_byte[38]])[var4];
               double var8 = (Double)var7.id_class[id_byte[39]];
               if (var4 < (Integer)this.id_class[id_byte[40]]) {
                  EQ var10 = ((EQ[])this.id_class[id_byte[41]])[var4 + id_throws[14]];
                  double var11 = (Double)var10.id_class[id_byte[42]];
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
               var2.id_class[id_byte[45]] = var20;
               Integer var21 = var3;
               var7.id_class[id_byte[46]] = var21;
               var3 = var4;
            } while ((var4 <<= id_throws[15]) <= this.id_class[id_byte[47]]);

            return var1;
         }
      }
   }

   @Override
   public void id_break(EQ var1) {
      int var2 = (Integer)var1.id_class[id_byte[15]];
      int var3 = var2 >>> id_throws[4];
      double var4 = (Double)var1.id_class[id_byte[16]];

      for (EQ var6 = ((EQ[])this.id_class[id_byte[17]])[var3];
         var2 > id_throws[5] && var6.id_class[id_byte[18]] > var4;
         var6 = ((EQ[])this.id_class[id_byte[23]])[var3]
      ) {
         ((EQ[])this.id_class[id_byte[19]])[var2] = var6;
         ((EQ[])this.id_class[id_byte[20]])[var3] = var1;
         Integer var11 = var3;
         var1.id_class[id_byte[21]] = var11;
         Integer var12 = var2;
         var6.id_class[id_byte[22]] = var12;
         var2 = var3;
         var3 >>>= id_throws[6];
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
         this.id_class = new Object[id_protected[3]];
         Object[] var1 = this.id_class;
         var1[id_throws[16]] = Integer.valueOf(id_throws[17]);
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
