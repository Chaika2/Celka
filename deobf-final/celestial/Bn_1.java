package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bn_1 extends Bt_1 {
   private static byte[] byte_;
   private static short[] protected_;
   public Object[] class_;
   private static boolean[] throws_;

   public Bn_1(String var1, Pattern[] var2) {
      super(var1);
      this.private_();
      this.class_[0] = var2;
   }

   static {
      ntfClinit();
   }

   public void class_(rja_3 var1) {
      this.private_();
      this.class_[1] = var1;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -333173100301758550L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{69, -115, -28, -108, 35, -62, 118, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1473327590;
   }

   public rja_3 break_(String var1) throws NullPointerException {
      this.private_();
      if (((Pattern[])this.class_[0]).length == 0) {
         throw new NullPointerException("Не указаны паттерны для " + this.getClass().getSimpleName());
      } else {
         for (Pattern var5 : (Pattern[])this.class_[0]) {
            Matcher var6 = var5.matcher(var1);
            if (var6.find()) {
               try {
                  int var7 = Integer.parseInt(var6.group(throws_[1]));
                  int var8 = byte_[0];
                  int var10 = var6.groupCount();
                  String var11 = var6.group(byte_[1]);
                  int var9;
                  if (var10 == byte_[2]) {
                     var9 = Integer.parseInt(var11);
                  } else {
                     if (var11 != null) {
                        var8 = Integer.parseInt(var11);
                     }

                     var9 = Integer.parseInt(var6.group(byte_[3]));
                  }

                  return new rja_3(var7, var8, var9);
               } catch (Exception var12) {
                  var12.printStackTrace();
                  return null;
               }
            }
         }

         return null;
      }
   }

   public Pattern[] break_() {
      this.private_();
      return (Pattern[])this.class_[0];
   }

   private static void finally_() {
      byte_ = new byte[]{75, 2, 2, 3, 2};
   }

   private static void catch_() {
      protected_ = new short[]{0, 0, 0, 0, 1, 1};
   }

   private static void implements_() {
      throws_ = new boolean[]{false, true};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public rja_3 e_() {
      this.private_();
      return (rja_3)this.class_[1];
   }
}
