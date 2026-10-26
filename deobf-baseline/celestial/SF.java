package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SF extends SC {
   private static byte[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;
   private static float[] id_throws;
   private static short[] id_case;
   private static long[] id_catch;

   public SF(String var1, long var2) {
      super(var1);
      this.id_private();
      Long var8 = var2;
      this.id_class[id_case[0]] = var8;
   }

   public SF(String var1) {
      this(var1, id_catch[0]);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -46791090;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6669433672064988013L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -120, -83, 4, 34, 113, 7, -33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public long id_class() {
      this.id_private();
      return (Long)this.id_class[id_case[3]];
   }

   @Override
   public int id_break() {
      this.id_private();
      return this.id_class[id_case[1]] < id_catch[1]
         ? id_byte[0]
         : (int)Math.ceil((double)((float)((Long)this.id_class[id_case[2]]).longValue() / id_throws[0]));
   }

   private static void id_throws() {
      id_case = new short[4];
   }

   private static void id_catch() {
      id_protected = new boolean[]{true, false};
   }

   private static void id_case() {
      id_catch = new long[]{-1L, 0L, 0L};
   }

   private static void id_implements() {
      id_byte = new byte[]{-1};
   }

   private static void id_protected() {
      id_throws = new float[]{50.0F};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[0]];
         Object[] var1 = this.id_class;
         var1[id_protected[1]] = id_catch[2];
      }
   }
}
