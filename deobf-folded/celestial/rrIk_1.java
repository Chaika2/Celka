package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIk_1 extends Setting<Boolean> {
   private static short[] id_byte;
   public Object[] id_break;
   private static boolean[] id_protected;
   private static byte[] id_throws;

   public rrIk_1(String var1, boolean var2, rrZO var3) {
      this(var1, var2);
      this.id_break[1] = var3;
   }

   public rrIk_1(String var1, boolean var2) {
      super(var1, var2);
      this.id_volatile();
      Boolean var7 = var2;
      this.id_break[id_byte[0]] = var7;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1640420870455538881L;
   }

   public Boolean id_class() {
      return super.id_byte() && this.id_private() ? true : id_protected[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1524705312;
   }

   public rrZO id_break() {
      this.id_volatile();
      return (rrZO)this.id_break[1];
   }

   public boolean id_finally() {
      this.id_volatile();
      return (Boolean)this.id_break[id_byte[2]];
   }

   private static void id_extends() {
      id_byte = new short[]{0, 1, 0, 1};
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{109, 2, -63, -13, -113, 25, -98, 47}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_final() {
      id_throws = new byte[]{2};
   }

   private void id_volatile() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
         var1[id_protected[2]] = id_protected[3];
      }
   }

   private static void id_native() {
      id_protected = new boolean[]{true, false, false, false};
   }
}
