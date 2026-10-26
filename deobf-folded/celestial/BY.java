package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BY extends Bt_1 implements By_1 {
   private static String[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   private static short[] id_throws;

   public BY() {
      super(id_byte[0]);
      this.id_private();
   }

   static {
      ntfClinit();
   }

   @Override
   public String id_class() {
      this.id_private();
      return (Bo_1)this.id_class[id_throws[3]] == null ? null : ((Bo_1)this.id_class[id_throws[4]]).id_class();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-89, 54, 102, 85, 96, 55, 45, 38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1894617103352371136L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1898191739;
   }

   private static void id_break() {
      id_byte = new String[]{new String("Сундук смерти")};
   }

   @Override
   public void id_throws(String var1) {
      this.id_private();
      super.id_throws(var1);
      Bo_1 var6 = Bo_1.id_class(var1);
      this.id_class[id_throws[0]] = var6;
      if ((Bo_1)this.id_class[id_throws[1]] != null) {
         this.id_protected(((Bo_1)this.id_class[id_throws[2]]).id_class() + " " + this.id_throws().toLowerCase());
      }
   }

   private static void id_catch() {
      id_throws = new short[5];
   }

   private static void id_implements() {
      id_protected = new boolean[]{true};
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }
}
