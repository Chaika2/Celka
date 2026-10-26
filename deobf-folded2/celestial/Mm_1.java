package celestial;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mm_1 {
   private static String[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   private static byte[] id_throws;

   public int id_byte() {
      return (Integer)this.id_class[0];
   }

   public Mm_1(int var1) {
      this.id_catch();
      Integer var6 = var1;
      this.id_class[0] = var6;
      byte[] var7 = id_class((Integer)this.id_class[0]);
      this.id_class[1] = var7;
      Integer var8 = ((byte[])this.id_class[1]).length;
      this.id_class[2] = var8;
   }

   static {
      ntfClinit();
   }

   public byte[] id_class() {
      return (byte[])this.id_class[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{6, 58, -126, 4, 76, 79, 48, -105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5603589747736289309L;
   }

   private static byte[] id_class(int var0) {
      ByteArrayList var1 = new ByteArrayList();

      int var2;
      for (var2 = var0; (var2 & 128) != 0; var2 >>>= 7) {
         var1.add((byte)(var2 & 127 | 128));
      }

      var1.add((byte)(var2 & 0xFF));
      return var1.toByteArray();
   }

   public static Mm_1 id_class(byte[] var0) {
      return id_class(var0, 0);
   }

   public static Mm_1 id_class(byte[] var0, int var1) {
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

   public int id_break() {
      return (Integer)this.id_class[2];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2488485;
   }

   private static void id_throws() {
      id_break = new String[]{new String("VarInt size cannot exceed 5 bytes")};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[0] = 0;
         var1[2] = 0;
      }
   }

   private static void id_case() {
      id_byte = new short[]{0, 0, 1, 1, 2, 0, 2, 1, 128, 128, 255, 128};
   }

   private static void id_protected() {
      id_throws = new byte[]{127, 7, 127, 7, 5, 3, 2};
   }

   private static void id_private() {
      id_protected = new boolean[6];
   }
}
