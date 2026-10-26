package celestial;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mm_1 {
   private static String[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   private static byte[] throws_;

   public int byte_() {
      return (Integer)this.class_[0];
   }

   public Mm_1(int var1) {
      this.catch_();
      Integer var6 = var1;
      this.class_[0] = var6;
      byte[] var7 = class_((Integer)this.class_[0]);
      this.class_[1] = var7;
      Integer var8 = ((byte[])this.class_[1]).length;
      this.class_[2] = var8;
   }

   static {
      ntfClinit();
   }

   public byte[] class_() {
      return (byte[])this.class_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{6, 58, -126, 4, 76, 79, 48, -105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5603589747736289309L;
   }

   private static byte[] class_(int var0) {
      ByteArrayList var1 = new ByteArrayList();

      int var2;
      for (var2 = var0; (var2 & 128) != 0; var2 >>>= 7) {
         var1.add((byte)(var2 & 127 | 128));
      }

      var1.add((byte)(var2 & 0xFF));
      return var1.toByteArray();
   }

   public static Mm_1 class_(byte[] var0) {
      return class_(var0, 0);
   }

   public static Mm_1 class_(byte[] var0, int var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = var1;

      byte var5;
      do {
         var5 = var0[var4++];
         var2 |= (var5 & 127) << var3++ * 7;
         if (var3 > 5) {
            throw new IllegalArgumentException("VarInt size cannot exceed 5 bytes");
         }
      } while ((var5 & 128) != 0);

      return new Mm_1(var2);
   }

   public int break_() {
      return (Integer)this.class_[2];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2488485;
   }

   private static void throws_() {
      break_ = new String[]{new String("VarInt size cannot exceed 5 bytes")};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[2] = 0;
      }
   }

   private static void case_() {
      byte_ = new short[]{0, 0, 1, 1, 2, 0, 2, 1, 128, 128, 255, 128};
   }

   private static void protected_() {
      throws_ = new byte[]{127, 7, 127, 7, 5, 3, 2};
   }

   private static void private_() {
      protected_ = new boolean[6];
   }
}
