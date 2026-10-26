package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAS extends Om_1 {
   private static float[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;
   public static Object[] id_break;
   private static boolean[] id_throws;
   private static byte[] id_case;

   public rrAS() {
      this.id_finally();
   }

   static {
      ntfClinit();
   }

   public void id_class(float var1) {
      this.id_finally();
      Float var6 = var1;
      this.id_class[2] = var6;
   }

   public static rrAS id_class(float var0, int var1, float var2) {
      rrAS var3 = id_break(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var3);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var3);
      return var3;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4156794149661167508L;
   }

   public float id_class() {
      this.id_finally();
      return (Float)this.id_class[2];
   }

   public void id_class(int var1) {
      this.id_finally();
      Integer var6 = var1;
      this.id_class[1] = var6;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{8, -88, -23, 84, 88, -84, 3, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAS id_break(float var0, int var1, float var2) {
      rrAS var10000 = (rrAS)id_break[0];
      Float var7 = var0;
      var10000.id_class[0] = var7;
      var10000 = (rrAS)id_break[0];
      Integer var8 = var1;
      var10000.id_class[1] = var8;
      var10000 = (rrAS)id_break[0];
      Float var9 = var2;
      var10000.id_class[2] = var9;
      ((rrAS)id_break[0]).id_class(false);
      return (rrAS)id_break[0];
   }

   public int id_break() {
      this.id_finally();
      return (Integer)this.id_class[1];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 237386252;
   }

   public void id_break(float var1) {
      this.id_finally();
      Float var6 = var1;
      this.id_class[0] = var6;
   }

   private static void id_throws() {
      id_byte = new float[2];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[0] = 0.0F;
         var1[1] = 0;
         var1[2] = 0.0F;
      }
   }

   private static void id_catch() {
      id_case = new byte[]{3, 2};
   }

   private static void id_case() {
      id_protected = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 1, 2, 0, 1, 2};
   }

   private static void id_implements() {
      Object[] var0 = new Object[]{new rrAS()};
      id_break = var0;
   }

   public float id_protected() {
      this.id_finally();
      return (Float)this.id_class[0];
   }

   private static void id_private() {
      id_throws = new boolean[]{false, false, false, true, false, true};
   }
}
