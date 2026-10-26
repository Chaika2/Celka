package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFG implements rrFE {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static float[] id_protected;
   private static boolean[] id_throws;

   @Override
   public String id_byte() {
      return ((Module)this.id_class[id_byte[2]]).id_final();
   }

   public rrFG(Module var1) {
      this.id_finally();
      AnimValue var6 = new AnimValue(0.5F, id_throws[0]);
      this.id_class[1] = var6;
      this.id_class[id_byte[1]] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(boolean var1) {
      ((AnimValue)this.id_class[1]).id_class(var1);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1534443748;
   }

   @Override
   public AnimValue id_class() {
      return (AnimValue)this.id_class[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7187839267519686352L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{94, 51, 11, -89, -102, 122, -82, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public String id_break() {
      return "[" + ((Module)this.id_class[id_byte[4]]).id_package().id_break() + "]";
   }

   @Override
   public boolean id_throws() {
      return ((Module)this.id_class[id_byte[7]]).aJ_()
            && ((Module)this.id_class[id_byte[8]]).id_package() != (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_byte[9]]
         ? true
         : id_throws[2];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_throws = new boolean[]{false, true, false, false};
   }

   private static void id_extends() {
      id_protected = new float[]{0.5F};
   }

   public KeyBind id_case() {
      return ((Module)this.id_class[id_byte[6]]).id_package();
   }

   private static void id_implements() {
      id_break = new byte[]{2};
   }

   @Override
   public boolean id_protected() {
      return id_throws[3];
   }

   private static void id_private() {
      id_byte = new short[]{1, 0, 0, 1, 0, 1, 0, 0, 0, 0};
   }
}
