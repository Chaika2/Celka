package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIo_1 {
   private static boolean[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static long[] id_protected;
   private static short[] id_throws;

   public rrfw_3 id_byte() {
      return (rrfw_3)this.id_class[1];
   }

   public rrIo_1(Runnable var1, long var2, int var4) {
      this.id_finally();
      rrfw_3 var9 = new rrfw_3();
      this.id_class[1] = var9;
      this.id_class[0] = var1;
      Long var11 = var2;
      this.id_class[2] = var11;
      Integer var12 = var4;
      this.id_class[3] = var12;
   }

   public rrIo_1(Runnable var1, long var2) {
      this(var1, var2, 1);
   }

   static {
      ntfClinit();
   }

   public int id_class() {
      return (Integer)this.id_class[3];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{16, 95, 81, 95, 14, -38, 49, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1698046026;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2909589133474120779L;
   }

   public long id_break() {
      return (Long)this.id_class[2];
   }

   public boolean id_throws() {
      return (Boolean)this.id_class[5];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
         var1[2] = 0L;
         var1[3] = 0;
         var1[4] = 0;
         var1[5] = false;
      }
   }

   public Runnable id_catch() {
      return (Runnable)this.id_class[0];
   }

   private static void id_extends() {
      id_protected = new long[1];
   }

   public void id_case() {
      Boolean var5 = true;
      this.id_class[5] = var5;
   }

   private static void id_implements() {
      id_break = new boolean[]{true, true, true, false, false, false};
   }

   public int id_protected() {
      return (Integer)this.id_class[4];
   }

   public void id_private() {
      if (((rrfw_3)this.id_class[1]).id_class((double)((Long)this.id_class[2]).longValue())) {
         ((Runnable)this.id_class[0]).run();
         ((rrfw_3)this.id_class[1]).id_class();
         int var10002 = (Integer)this.id_class[4] + 1;
         Integer var5 = var10002;
         this.id_class[4] = var5;
         if (var10002 >= (Integer)this.id_class[3]) {
            this.id_case();
         }
      }
   }

   private static void id_volatile() {
      id_throws = new short[]{1, 0, 2, 3, 1, 2, 0, 1, 4, 4, 3, 5, 0, 1, 2, 3, 4, 5};
   }

   private static void id_native() {
      id_byte = new byte[]{6, 2, 3, 4, 5};
   }
}
