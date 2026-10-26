package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bn_1 extends Bt_1 {
   private static byte[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   private static boolean[] id_throws;

   public Bn_1(String var1, Pattern[] var2) {
      super(var1);
      this.id_private();
      this.id_class[id_protected[0]] = var2;
   }

   static {
      ntfClinit();
   }

   public void id_class(rja_3 var1) {
      this.id_private();
      this.id_class[id_protected[5]] = var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -333173100301758550L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{69, -115, -28, -108, 35, -62, 118, -26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1473327590;
   }

   public rja_3 id_break(String var1) throws NullPointerException {
      this.id_private();
      if (((Pattern[])this.id_class[id_protected[1]]).length == 0) {
         throw new NullPointerException("Не указаны паттерны для " + this.getClass().getSimpleName());
      } else {
         Pattern[] var2 = (Pattern[])this.id_class[id_protected[2]];
         int var3 = var2.length;

         for (int var4 = id_throws[0]; var4 < var3; var4++) {
            Pattern var5 = var2[var4];
            Matcher var6 = var5.matcher(var1);
            if (var6.find()) {
               try {
                  int var7 = Integer.parseInt(var6.group(id_throws[1]));
                  int var8 = id_byte[0];
                  int var10 = var6.groupCount();
                  String var11 = var6.group(id_byte[1]);
                  int var9;
                  if (var10 == id_byte[2]) {
                     var9 = Integer.parseInt(var11);
                  } else {
                     if (var11 != null) {
                        var8 = Integer.parseInt(var11);
                     }

                     var9 = Integer.parseInt(var6.group(id_byte[3]));
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

   public Pattern[] id_break() {
      this.id_private();
      return (Pattern[])this.id_class[id_protected[3]];
   }

   private static void id_finally() {
      id_byte = new byte[]{75, 2, 2, 3, 2};
   }

   private static void id_catch() {
      id_protected = new short[]{0, 0, 0, 0, 1, 1};
   }

   private static void id_implements() {
      id_throws = new boolean[]{false, true};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[4]];
         Object[] var1 = this.id_class;
      }
   }

   public rja_3 e_() {
      this.id_private();
      return (rja_3)this.id_class[id_protected[4]];
   }
}
