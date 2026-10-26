package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SE extends Bt_1 implements By_1 {
   public Object[] id_class;
   private static short[] id_byte;
   private static String[] id_protected;
   private static boolean[] id_throws;

   public SE() {
      super(id_protected[0]);
      this.id_implements();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -944474185;
   }

   @Override
   public String id_class() {
      this.id_implements();
      return (SG)this.id_class[id_byte[3]] == null ? null : ((SG)this.id_class[id_byte[4]]).id_class();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{81, -80, -67, 123, 63, -119, -59, -105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8417179066477686441L;
   }

   private static void id_break() {
      id_protected = new String[]{new String("Снежная бойня")};
   }

   @Override
   public void id_throws(String var1) {
      this.id_implements();
      super.id_throws(var1);
      SG var6 = SG.id_class(var1);
      this.id_class[id_byte[0]] = var6;
      if ((SG)this.id_class[id_byte[1]] != null) {
         this.id_protected(((SG)this.id_class[id_byte[2]]).id_class() + " " + this.id_throws().toLowerCase());
      }
   }

   private static void id_catch() {
      id_throws = new boolean[]{true};
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_private() {
      id_byte = new short[5];
   }
}
