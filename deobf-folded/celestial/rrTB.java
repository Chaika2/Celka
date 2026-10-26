package celestial;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrTB {
   private static byte[] id_break;
   public Object[] id_class;
   private static float[] id_byte;
   private static short[] id_protected;
   private static String[] id_throws;
   private static boolean[] id_case;

   public float id_byte() {
      return (Float)this.id_class[5];
   }

   public rrTB(rrTS var1, String var2, rrTE[] var3) {
      this.id_finally();
      String var8 = id_throws[0];
      this.id_class[3] = var8;
      this.id_class[1] = var1;
      this.id_class[2] = var2;
      this.id_class[id_protected[3]] = var3;
   }

   static {
      ntfClinit();
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_class[5] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5463614634277186153L;
   }

   public void id_class(int var1) {
      Integer var6 = var1;
      this.id_class[6] = var6;
   }

   public rrTS id_class() {
      return (rrTS)this.id_class[1];
   }

   public void id_class(LocalDateTime var1) {
      this.id_class[4] = var1;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{101, 127, -48, 114, -100, 14, -86, 34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 357133775;
   }

   public void id_break(String var1) {
      this.id_class[3] = var1;
   }

   public int id_break() {
      return (Integer)this.id_class[6];
   }

   public String id_throws() {
      return (String)this.id_class[2];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[7];
         this.id_class[5] = 0.0F;
         this.id_class[6] = 0;
      }
   }

   public rrTE[] id_catch() {
      return (rrTE[])this.id_class[id_protected[4]];
   }

   private static void id_extends() {
      id_protected = new short[]{3, 1, 2, 0, 0, 1, 2, 3, 4, 5, 6, 3, 4, 5, 6};
   }

   public String id_case() {
      return (String)this.id_class[3];
   }

   private static void id_implements() {
      id_case = new boolean[1];
   }

   public LocalDateTime id_protected() {
      return (LocalDateTime)this.id_class[4];
   }

   private static void id_private() {
      id_byte = new float[1];
   }

   private static void id_volatile() {
      id_break = new byte[]{7, 5, 6};
   }

   private static void id_native() {
      id_throws = new String[]{new String("")};
   }
}
