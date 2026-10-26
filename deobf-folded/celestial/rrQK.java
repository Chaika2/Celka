package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrQK {
   private static boolean[] booleansd7edc8a98bf936d38fa97cfea6cbd552;
   private static String[] stringsd7edc8a98bf936d38fa97cfea6cbd552;
   private static short[] shortsd7edc8a98bf936d38fa97cfea6cbd552;
   private static byte[] bytesd7edc8a98bf936d38fa97cfea6cbd552;
   public static Object[] staticFieldsd7edc8a98bf936d38fa97cfea6cbd552;

   private static void id_byte() {
      booleansd7edc8a98bf936d38fa97cfea6cbd552 = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5996315059364003046L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 848920158;
   }

   private static void id_class() {
      stringsd7edc8a98bf936d38fa97cfea6cbd552 = new String[]{
         new String("OUT_QUAD"),
         new String("OUT_CIRC"),
         new String("OUT_BACK"),
         new String("LINEAR"),
         new String("OUT_BOUNCE"),
         new String("OUT_ELASTIC"),
         new String("OUT_EXPO"),
         new String("OUT_SINE"),
         new String("SPRING")
      };
   }

   public abstract double id_class(double var1);

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, -41, 42, 9, 55, 20, 116, -32}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrQD(), new rrQU(), new rrQe_1(), new rrQa_1(), new rrQi_1(), new rrNr_1(), new rrNP(), new rrNB(), new rrNS(), null};
      var0[9] = new rrQK[]{(rrQK)var0[1], (rrQK)var0[2], (rrQK)var0[3], (rrQK)var0[4], (rrQK)var0[5], (rrQK)var0[6], (rrQK)var0[7]};
      staticFieldsd7edc8a98bf936d38fa97cfea6cbd552 = var0;
   }

   private static void id_throws() {
      bytesd7edc8a98bf936d38fa97cfea6cbd552 = new byte[]{9, 2, 3, 4, 5, 6, 7, 8, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10};
   }

   private static void id_protected() {
      shortsd7edc8a98bf936d38fa97cfea6cbd552 = new short[]{9, 0, 1, 2, 3, 4, 5, 6, 7, 8};
   }
}
