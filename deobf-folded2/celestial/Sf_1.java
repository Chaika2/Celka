package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sf_1 implements Runnable {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   Sf_1(SI var1) {
      this.id_byte();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public void run() {
      while (true) {
         try {
            rfj_3 var1 = (rfj_3)((LinkedBlockingQueue)((SI)this.id_class[id_byte[1]]).id_break[id_byte[2]]).take();
            roJ_2 var2 = (roJ_2)((Map)((SI)this.id_class[id_byte[3]]).id_break[id_byte[4]]).remove(var1);
            if (((LinkedBlockingQueue)((SI)this.id_class[id_byte[5]]).id_break[id_byte[6]]).size() <= (Integer)C_class.id_instanceof().rw.id_class[id_byte[7]]) {
               St_1 var3 = Sj_1.id_class(var2);
               ((SI)this.id_class[id_byte[8]]).id_class(var3);
            }
         } catch (InterruptedException var4) {
            var4.printStackTrace();
            return;
         } catch (Throwable var5) {
            var5.printStackTrace();
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1801402066;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2409789568923652307L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{53, 29, -88, -44, -4, -56, -89, -20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new boolean[]{true};
   }

   private static void id_break() {
      id_byte = new short[]{0, 0, 2, 0, 3, 0, 2, 0, 0};
   }
}
