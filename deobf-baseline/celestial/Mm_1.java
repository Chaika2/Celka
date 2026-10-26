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
      return (Integer)this.id_class[id_byte[5]];
   }

   public Mm_1(int var1) {
      this.id_catch();
      Integer var6 = var1;
      this.id_class[id_byte[0]] = var6;
      byte[] var7 = id_class((Integer)this.id_class[id_byte[1]]);
      this.id_class[id_byte[2]] = var7;
      Integer var8 = ((byte[])this.id_class[id_byte[3]]).length;
      this.id_class[id_byte[4]] = var8;
   }

   static {
      ntfClinit();
   }

   public byte[] id_class() {
      return (byte[])this.id_class[id_byte[7]];
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
      for (var2 = var0; (var2 & id_byte[8]) != 0; var2 >>>= id_throws[1]) {
         var1.add((byte)(var2 & id_throws[0] | id_byte[9]));
      }

      var1.add((byte)(var2 & id_byte[10]));
      return var1.toByteArray();
   }

   public static Mm_1 id_class(byte[] var0) {
      return id_class(var0, id_protected[0]);
   }

   public static Mm_1 id_class(byte[] var0, int var1) {
      int var2 = id_protected[1];
      int var3 = id_protected[2];
      int var4 = var1;

      byte var5;
      do {
         var5 = var0[var4++];
         var2 |= (var5 & id_throws[2]) << var3++ * id_throws[3];
         if (var3 > id_throws[4]) {
            throw new IllegalArgumentException(id_break[0]);
         }
      } while ((var5 & id_byte[11]) != 0);

      return new Mm_1(var2);
   }

   public int id_break() {
      return (Integer)this.id_class[id_byte[6]];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2488485;
   }

   private static void id_throws() {
      id_break = new String[]{new String("VarInt size cannot exceed 5 bytes")};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[5]];
         Object[] var1 = this.id_class;
         var1[id_protected[3]] = Integer.valueOf(id_protected[4]);
         var1[id_throws[6]] = Integer.valueOf(id_protected[5]);
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
