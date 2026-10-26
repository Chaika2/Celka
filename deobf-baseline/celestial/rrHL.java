package celestial;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHL {
   private static String[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static float[] id_throws;
   private static double[] id_case;
   private static boolean[] id_catch;
   public Object[] id_class;

   public int id_byte() {
      return (Integer)this.id_class[id_protected[23]];
   }

   public rrHL(CasinoBot var1, int var2, String var3, rrfw_3 var4) {
      this.id_catch();
      this.id_class[id_protected[26]] = var1;
      Integer var10 = var2;
      this.id_class[id_protected[27]] = var10;
      this.id_class[id_protected[28]] = var3;
      this.id_class[id_protected[29]] = var4;
   }

   static {
      ntfClinit();
   }

   private void id_class(int var1) {
      cb_3 var10000 = (cb_3)MinecraftAccessor.id_import.id_class[id_protected[0]];
      String var10001 = id_break[0];
      Object[] var10002 = new Object[id_byte[0]];
      var10002[id_catch[0]] = (String)this.id_class[id_protected[1]];
      var10002[id_catch[1]] = var1;
      var10000.id_protected(String.format(var10001, var10002));
      var10000 = (cb_3)MinecraftAccessor.id_import.id_class[id_protected[2]];
      var10001 = id_break[1];
      var10002 = new Object[id_byte[1]];
      var10002[id_catch[2]] = (String)this.id_class[id_protected[3]];
      var10002[id_catch[3]] = var1;
      var10000.id_protected(String.format(var10001, var10002));
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{115, -102, -94, 115, -51, 1, -67, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_class() {
      return (String)this.id_class[id_protected[24]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3351006238168479816L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1463159880;
   }

   public rrfw_3 id_break() {
      return (rrfw_3)this.id_class[id_protected[25]];
   }

   private static void id_throws() {
      id_throws = new float[]{0.0F, 1.6F};
   }

   private static void id_finally() {
      id_case = new double[]{1000.0};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         this.id_class[0] = 0;
      }
   }

   private static void id_extends() {
      id_protected = new short[]{57, 1, 57, 1, 0, 2, 3, 3, 3, 0, 57, 1, 0, 57, 1, 0, 57, 1, 0, 0, 57, 1, 0, 0, 1, 2, 3, 0, 1, 2};
   }

   private static void id_case() {
      id_catch = new boolean[]{false, true, false, true, true, false, true, true, false, true, false, true, false, true, true, false, false, false};
   }

   private static void id_implements() {
      id_break = new String[]{
         new String("/pay %s %s"),
         new String("/pay %s %s"),
         new String("/m %s %s"),
         new String("Извините, баланса недостаточно. Ставка возвращена."),
         new String("/m %s %s"),
         new String("/m %s %s"),
         new String("/m %s %s")
      };
   }

   public boolean id_protected() {
      double var1 = rrfQ_2.id_class((double)ThreadLocalRandom.current().nextFloat(id_throws[0], id_throws[1]), id_byte[2]);
      int var3 = (int)Math.round((double)((Integer)this.id_class[id_protected[4]]).intValue() * var1);
      if (((rrfw_3)this.id_class[id_protected[5]]).id_class(id_case[0])) {
         Integer var8 = (Integer)CasinoBot.id_byte[id_protected[6]] + id_catch[4];
         CasinoBot.id_byte[id_protected[7]] = var8;
         if ((long)var3 > ((CasinoBot)this.id_class[id_protected[8]]).id_else()) {
            this.id_class((Integer)this.id_class[id_protected[9]]);
            cb_3 var11 = (cb_3)MinecraftAccessor.id_import.id_class[id_protected[10]];
            String var14 = id_break[2];
            Object[] var17 = new Object[id_byte[3]];
            var17[id_catch[5]] = (String)this.id_class[id_protected[11]];
            var17[id_catch[6]] = id_break[3];
            var11.id_protected(String.format(var14, var17));
            return id_catch[7];
         } else {
            if (var3 > id_byte[4]) {
               this.id_class(var3);
            }

            if (var3 == (Integer)this.id_class[id_protected[12]]) {
               cb_3 var10000 = (cb_3)MinecraftAccessor.id_import.id_class[id_protected[13]];
               String var10001 = id_break[4];
               Object[] var10002 = new Object[id_byte[5]];
               var10002[id_catch[8]] = (String)this.id_class[id_protected[14]];
               var10002[id_catch[9]] = "Ваша ставка вернулась, множитель " + var1 + "x";
               var10000.id_protected(String.format(var10001, var10002));
            }

            if (var3 > (Integer)this.id_class[id_protected[15]]) {
               cb_3 var9 = (cb_3)MinecraftAccessor.id_import.id_class[id_protected[16]];
               String var12 = id_break[5];
               Object[] var15 = new Object[id_byte[6]];
               var15[id_catch[10]] = (String)this.id_class[id_protected[17]];
               var15[id_catch[11]] = "Поздравляю, твои выигрыш "
                  + Math.abs(var3 - (Integer)this.id_class[id_protected[18]])
                  + "$, множитель "
                  + var1
                  + "x, напишите отзыв о нас :)";
               var9.id_protected(String.format(var12, var15));
            }

            if (var3 < (Integer)this.id_class[id_protected[19]]) {
               cb_3 var10 = (cb_3)MinecraftAccessor.id_import.id_class[id_protected[20]];
               String var13 = id_break[6];
               Object[] var16 = new Object[id_byte[7]];
               var16[id_catch[12]] = (String)this.id_class[id_protected[21]];
               var16[id_catch[13]] = "К сожалению, вы проиграли "
                  + Math.abs(var3 - (Integer)this.id_class[id_protected[22]])
                  + "$, множитель "
                  + var1
                  + "x, может в следующий раз повезет";
               var10.id_protected(String.format(var13, var16));
            }

            return id_catch[14];
         }
      } else {
         return id_catch[15];
      }
   }

   private static void id_private() {
      id_byte = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 4};
   }
}
