package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Eu_1 implements Ec_1 {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;

   @Override
   public boolean id_byte() {
      return (Em_1)this.id_class[id_break[1]] == null ? true : id_byte[1];
   }

   public Eu_1() {
      this.id_class();
      Object var5 = null;
      this.id_class[id_break[0]] = var5;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5817836150584933902L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -236754141;
   }

   @Override
   public void id_class(EQ var1) {
      Em_1 var2 = new Em_1();
      var2.id_class[1] = var1;
      Em_1 var8 = (Em_1)this.id_class[id_break[3]];
      var2.id_class[id_break[4]] = var8;
      this.id_class[id_break[5]] = var2;
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-21, -50, 1, -125, 9, -44, -126, 50}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_break(EQ var1) {
   }

   @Override
   public EQ id_break() {
      if ((Em_1)this.id_class[id_break[6]] == null) {
         return null;
      } else {
         Em_1 var1 = (Em_1)((Em_1)this.id_class[id_break[7]]).id_class[id_break[8]];
         if (var1 == null) {
            Em_1 var18 = (Em_1)this.id_class[id_break[9]];
            Object var13 = null;
            this.id_class[id_break[10]] = var13;
            return (EQ)var18.id_class[1];
         } else {
            Em_1 var2 = (Em_1)this.id_class[id_break[12]];
            double var3 = (Double)((EQ)((Em_1)this.id_class[id_break[13]]).id_class[1]).id_class[5];
            Em_1 var5 = (Em_1)this.id_class[id_break[16]];

            Em_1 var6;
            for (var6 = null; var1 != null; var1 = (Em_1)var1.id_class[id_break[19]]) {
               double var7 = (Double)((EQ)var1.id_class[1]).id_class[5];
               if (var7 < var3) {
                  var3 = var7;
                  var5 = var1;
                  var6 = var2;
               }

               var2 = var1;
            }

            if (var6 == null) {
               Em_1 var14 = (Em_1)((Em_1)this.id_class[id_break[20]]).id_class[id_break[21]];
               this.id_class[id_break[22]] = var14;
               Object var15 = null;
               var5.id_class[id_break[23]] = var15;
               return (EQ)var5.id_class[1];
            } else {
               Em_1 var16 = (Em_1)var5.id_class[id_break[25]];
               var6.id_class[id_break[26]] = var16;
               Object var17 = null;
               var5.id_class[id_break[27]] = var17;
               return (EQ)var5.id_class[1];
            }
         }
      }
   }

   private static void id_throws() {
      id_byte = new boolean[]{true, false, true};
   }

   private static void id_protected() {
      id_break = new short[]{0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 5, 0, 1, 5, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1};
   }
}
