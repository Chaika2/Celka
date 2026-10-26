package celestial;

import com.mojang.bridge.game.PerformanceMetrics;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Qe_1 implements PerformanceMetrics {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_protected = new boolean[]{false, false, true, false, false, false};
   }

   public Qe_1(int var1, int var2, int var3, int var4) {
      this.id_class();
      Integer var9 = var1;
      this.id_class[id_byte[0]] = var9;
      Integer var10 = var2;
      this.id_class[1] = var10;
      Integer var11 = var3;
      this.id_class[2] = var11;
      Integer var12 = var4;
      this.id_class[3] = var12;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5968386573037191792L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 120213118;
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         this.id_class[0] = 0;
         this.id_class[1] = 0;
         this.id_class[2] = 0;
         this.id_class[3] = 0;
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{111, -40, 116, 52, 34, -35, -70, -88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new byte[]{4, 2, 3};
   }

   private static void id_protected() {
      id_byte = new short[]{0, 1, 2, 3, 0, 1, 2, 3};
   }

   public int getMinTime() {
      return (Integer)this.id_class[id_byte[4]];
   }

   public int getMaxTime() {
      return (Integer)this.id_class[1];
   }

   public int getAverageTime() {
      return (Integer)this.id_class[2];
   }

   public int getSampleCount() {
      return (Integer)this.id_class[3];
   }
}
