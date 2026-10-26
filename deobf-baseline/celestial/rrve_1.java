package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrve_1 implements rrvU {
   private static float[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;

   @Override
   public boolean id_byte() {
      return id_protected[1];
   }

   public rrve_1(rrvK var1, String var2, String var3) {
      this.id_private();
      this.id_class[id_byte[0]] = var1;
      AnimValue var9 = new AnimValue(id_break[0], id_protected[0]);
      this.id_class[id_byte[1]] = var9;
      this.id_class[id_byte[2]] = var2;
      this.id_class[id_byte[3]] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(boolean var1) {
      ((AnimValue)this.id_class[id_byte[7]]).id_class(var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5131821260646357481L;
   }

   @Override
   public String id_class() {
      return (String)this.id_class[id_byte[5]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 814251297;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-93, 89, -115, 33, 108, -87, 63, 93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public AnimValue id_break() {
      return (AnimValue)this.id_class[id_byte[6]];
   }

   private static void id_throws() {
      id_protected = new boolean[]{false, true};
   }

   private static void id_finally() {
      id_break = new float[]{0.5F};
   }

   @Override
   public boolean id_catch() {
      return ((rrvo_1)((rrvK)this.id_class[id_byte[8]]).id_class[id_byte[9]]).id_super();
   }

   @Override
   public String id_case() {
      return (String)this.id_class[id_byte[4]];
   }

   private static void id_implements() {
      id_byte = new short[]{3, 2, 0, 1, 0, 1, 2, 2, 3, 0};
   }

   private static void id_protected() {
      id_throws = new byte[]{4};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[0]];
         Object[] var1 = this.id_class;
      }
   }
}
