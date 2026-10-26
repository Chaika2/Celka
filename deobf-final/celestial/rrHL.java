package celestial;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHL {
   private static String[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static float[] throws_;
   private static double[] case_;
   private static boolean[] catch_;
   public Object[] class_;

   public int byte_() {
      return (Integer)this.class_[0];
   }

   public rrHL(CasinoBot var1, int var2, String var3, rrfw_3 var4) {
      this.catch_();
      this.class_[3] = var1;
      Integer var10 = var2;
      this.class_[0] = var10;
      this.class_[1] = var3;
      this.class_[2] = var4;
   }

   static {
      ntfClinit();
   }

   private void class_(int var1) {
      ((cb_3)MinecraftAccessor.import_.class_[57]).protected_(String.format("/pay %s %s", (String)this.class_[1], var1));
      ((cb_3)MinecraftAccessor.import_.class_[57]).protected_(String.format("/pay %s %s", (String)this.class_[1], var1));
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{115, -102, -94, 115, -51, 1, -67, -78}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String class_() {
      return (String)this.class_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3351006238168479816L;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1463159880;
   }

   public rrfw_3 break_() {
      return (rrfw_3)this.class_[2];
   }

   private static void throws_() {
      throws_ = new float[]{0.0F, 1.6F};
   }

   private static void finally_() {
      case_ = new double[]{1000.0};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         this.class_[0] = 0;
      }
   }

   private static void extends_() {
      protected_ = new short[]{57, 1, 57, 1, 0, 2, 3, 3, 3, 0, 57, 1, 0, 57, 1, 0, 57, 1, 0, 0, 57, 1, 0, 0, 1, 2, 3, 0, 1, 2};
   }

   private static void case_() {
      catch_ = new boolean[]{false, true, false, true, true, false, true, true, false, true, false, true, false, true, true, false, false, false};
   }

   private static void implements_() {
      break_ = new String[]{
         new String("/pay %s %s"),
         new String("/pay %s %s"),
         new String("/m %s %s"),
         new String("Извините, баланса недостаточно. Ставка возвращена."),
         new String("/m %s %s"),
         new String("/m %s %s"),
         new String("/m %s %s")
      };
   }

   public boolean protected_() {
      double var1 = rrfQ_2.class_((double)ThreadLocalRandom.current().nextFloat(0.0F, 1.6F), 2);
      int var3 = (int)Math.round((double)((Integer)this.class_[0]).intValue() * var1);
      if (((rrfw_3)this.class_[2]).class_(1000.0)) {
         Integer var8 = (Integer)CasinoBot.byte_[3] + 1;
         CasinoBot.byte_[3] = var8;
         if ((long)var3 > ((CasinoBot)this.class_[3]).else_()) {
            this.class_((Integer)this.class_[0]);
            ((cb_3)MinecraftAccessor.import_.class_[57])
               .protected_(String.format("/m %s %s", (String)this.class_[1], "Извините, баланса недостаточно. Ставка возвращена."));
            return true;
         } else {
            if (var3 > 2) {
               this.class_(var3);
            }

            if (var3 == (Integer)this.class_[0]) {
               ((cb_3)MinecraftAccessor.import_.class_[57])
                  .protected_(String.format("/m %s %s", (String)this.class_[1], "Ваша ставка вернулась, множитель " + var1 + "x"));
            }

            if (var3 > (Integer)this.class_[0]) {
               ((cb_3)MinecraftAccessor.import_.class_[57])
                  .protected_(
                     String.format(
                        "/m %s %s",
                        (String)this.class_[1],
                        "Поздравляю, твои выигрыш " + Math.abs(var3 - (Integer)this.class_[0]) + "$, множитель " + var1 + "x, напишите отзыв о нас :)"
                     )
                  );
            }

            if (var3 < (Integer)this.class_[0]) {
               ((cb_3)MinecraftAccessor.import_.class_[57])
                  .protected_(
                     String.format(
                        "/m %s %s",
                        (String)this.class_[1],
                        "К сожалению, вы проиграли " + Math.abs(var3 - (Integer)this.class_[0]) + "$, множитель " + var1 + "x, может в следующий раз повезет"
                     )
                  );
            }

            return catch_[14];
         }
      } else {
         return catch_[15];
      }
   }

   private static void private_() {
      byte_ = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 4};
   }
}
