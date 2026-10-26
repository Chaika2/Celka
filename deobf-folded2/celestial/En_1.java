package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class En_1 {
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;
   public Object[] id_class;

   private static void id_byte() {
      id_break = new byte[]{2};
   }

   public En_1() {
      this(null, false);
   }

   public En_1(PX var1, boolean var2) {
      this.id_case();
      this.id_class[0] = var1;
      Boolean var8 = var2;
      this.id_class[1] = var8;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -808027246108947349L;
   }

   public En_1 id_class(PX var1) {
      this.id_class[0] = var1;
      return this;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{94, -45, -72, 44, 4, -82, -36, 9}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -201943199;
   }

   public boolean id_class() {
      return (Boolean)this.id_class[1];
   }

   public Optional<PX> id_break() {
      return Optional.ofNullable((PX)this.id_class[0]);
   }

   private static void id_throws() {
      id_byte = new short[]{0, 1, 0, 0, 1};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[1] = false;
      }
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, true, false};
   }
}
