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
      return (Integer)this.id_class[0];
   }

   public rrHL(CasinoBot var1, int var2, String var3, rrfw_3 var4) {
      this.id_catch();
      this.id_class[3] = var1;
      Integer var10 = var2;
      this.id_class[0] = var10;
      this.id_class[1] = var3;
      this.id_class[2] = var4;
   }

   static {
      ntfClinit();
   }

   private void id_class(int var1) {
      ((cb_3)MinecraftAccessor.id_import.id_class[57]).id_protected(String.format("/pay %s %s", (String)this.id_class[1], var1));
      ((cb_3)MinecraftAccessor.id_import.id_class[57]).id_protected(String.format("/pay %s %s", (String)this.id_class[1], var1));
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{115, -102, -94, 115, -51, 1, -67, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String id_class() {
      return (String)this.id_class[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3351006238168479816L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1463159880;
   }

   public rrfw_3 id_break() {
      return (rrfw_3)this.id_class[2];
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
      double var1 = rrfQ_2.id_class((double)ThreadLocalRandom.current().nextFloat(0.0F, 1.6F), 2);
      int var3 = (int)Math.round((double)((Integer)this.id_class[0]).intValue() * var1);
      if (((rrfw_3)this.id_class[2]).id_class(1000.0)) {
         Integer var8 = (Integer)CasinoBot.id_byte[3] + 1;
         CasinoBot.id_byte[3] = var8;
         if ((long)var3 > ((CasinoBot)this.id_class[3]).id_else()) {
            this.id_class((Integer)this.id_class[0]);
            ((cb_3)MinecraftAccessor.id_import.id_class[57])
               .id_protected(String.format("/m %s %s", (String)this.id_class[1], "Извините, баланса недостаточно. Ставка возвращена."));
            return true;
         } else {
            if (var3 > 2) {
               this.id_class(var3);
            }

            if (var3 == (Integer)this.id_class[0]) {
               ((cb_3)MinecraftAccessor.id_import.id_class[57])
                  .id_protected(String.format("/m %s %s", (String)this.id_class[1], "Ваша ставка вернулась, множитель " + var1 + "x"));
            }

            if (var3 > (Integer)this.id_class[0]) {
               ((cb_3)MinecraftAccessor.id_import.id_class[57])
                  .id_protected(
                     String.format(
                        "/m %s %s",
                        (String)this.id_class[1],
                        "Поздравляю, твои выигрыш " + Math.abs(var3 - (Integer)this.id_class[0]) + "$, множитель " + var1 + "x, напишите отзыв о нас :)"
                     )
                  );
            }

            if (var3 < (Integer)this.id_class[0]) {
               ((cb_3)MinecraftAccessor.id_import.id_class[57])
                  .id_protected(
                     String.format(
                        "/m %s %s",
                        (String)this.id_class[1],
                        "К сожалению, вы проиграли " + Math.abs(var3 - (Integer)this.id_class[0]) + "$, множитель " + var1 + "x, может в следующий раз повезет"
                     )
                  );
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
