package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFb_1 implements rrFE {
   private static float[] id_break;
   private static byte[] id_byte;
   public Object[] id_class;
   private static short[] id_protected;
   private static boolean[] id_throws;

   @Override
   public String id_byte() {
      return (String)this.id_class[id_protected[4]];
   }

   public rrFb_1(rrFs_1 var1, String var2, String var3) {
      this.id_finally();
      this.id_class[3] = var1;
      AnimValue var9 = new AnimValue(0.5F, id_throws[0]);
      this.id_class[2] = var9;
      this.id_class[id_protected[2]] = var2;
      this.id_class[1] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public AnimValue id_class() {
      return (AnimValue)this.id_class[2];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -581733409953449915L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-108, 31, 91, -38, 40, 103, 28, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1778175768;
   }

   @Override
   public void id_class(boolean var1) {
      ((AnimValue)this.id_class[2]).id_class(var1);
   }

   @Override
   public String id_break() {
      return (String)this.id_class[1];
   }

   @Override
   public boolean id_throws() {
      return ((rrFS)((rrFs_1)this.id_class[3]).id_class[id_protected[9]]).id_super();
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_protected = new short[]{3, 2, 0, 1, 0, 1, 2, 2, 3, 0};
   }

   private static void id_case() {
      id_break = new float[]{0.5F};
   }

   private static void id_implements() {
      id_throws = new boolean[]{false, true};
   }

   @Override
   public boolean id_protected() {
      return true;
   }

   private static void id_private() {
      id_byte = new byte[]{4};
   }
}
