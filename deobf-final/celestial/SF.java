package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SF extends SC {
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] class_;
   private static float[] throws_;
   private static short[] case_;
   private static long[] catch_;

   public SF(String var1, long var2) {
      super(var1);
      this.private_();
      Long var8 = var2;
      this.class_[0] = var8;
   }

   public SF(String var1) {
      this(var1, -1L);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -46791090;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6669433672064988013L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-124, -120, -83, 4, 34, 113, 7, -33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public long class_() {
      this.private_();
      return (Long)this.class_[0];
   }

   @Override
   public int break_() {
      this.private_();
      return this.class_[0] < 0L ? -1 : (int)Math.ceil((double)((float)((Long)this.class_[0]).longValue() / 50.0F));
   }

   private static void throws_() {
      case_ = new short[4];
   }

   private static void catch_() {
      protected_ = new boolean[]{true, false};
   }

   private static void case_() {
      catch_ = new long[]{-1L, 0L, 0L};
   }

   private static void implements_() {
      byte_ = new byte[]{-1};
   }

   private static void protected_() {
      throws_ = new float[]{50.0F};
   }

   private void private_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
         var1[0] = 0L;
      }
   }
}
