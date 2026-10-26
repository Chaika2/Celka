package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFc_1 implements rrFz_1 {
   private static short[] id_break;
   private static float[] id_byte;
   public Object[] id_class;
   private static byte[] id_protected;
   private static boolean[] id_throws;

   @Override
   public boolean id_byte() {
      return true;
   }

   public rrFc_1(rrFk_1 var1, String var2, String var3, String var4) {
      this.id_extends();
      this.id_class[4] = var1;
      AnimValue var10 = new AnimValue(0.5F, false);
      this.id_class[3] = var10;
      this.id_class[0] = var2;
      this.id_class[1] = var3;
      this.id_class[2] = var4;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{59, 7, 82, 101, 46, -3, -47, 58}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2011812485;
   }

   @Override
   public void id_class(boolean var1) {
      ((AnimValue)this.id_class[3]).id_class(var1);
   }

   @Override
   public AnimValue id_class() {
      return (AnimValue)this.id_class[3];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -233107418784869349L;
   }

   @Override
   public String id_break() {
      return (String)this.id_class[2];
   }

   @Override
   public boolean id_throws() {
      return ((rrFd_1)((rrFk_1)this.id_class[4]).id_break[0]).id_super();
   }

   private static void id_finally() {
      id_throws = new boolean[]{false, true};
   }

   private static void id_catch() {
      id_protected = new byte[]{5};
   }

   private void id_extends() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         Object[] var1 = this.id_class;
      }
   }

   public String id_case() {
      return (String)this.id_class[1];
   }

   private static void id_implements() {
      id_break = new short[]{4, 3, 0, 1, 2, 0, 1, 3, 4, 0, 1, 2, 3};
   }

   @Override
   public String id_protected() {
      return (String)this.id_class[0] + " " + rgF_2.RED + (String)this.id_class[1];
   }

   private static void id_private() {
      id_byte = new float[]{0.5F};
   }
}
