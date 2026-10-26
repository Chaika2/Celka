package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bp_1 {
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;
   public static Object[] id_class;
   public Object[] id_break;

   public Bq_1 id_byte() {
      return (Bq_1)this.id_break[0];
   }

   public Bp_1() {
      this.id_private();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{112, -82, 4, -113, -9, 44, 64, -105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 170856849;
   }

   public BT id_class() {
      return (BT)this.id_break[2];
   }

   public static Bp_1 id_class(Bq_1 var0, Bt_1 var1, BT var2) {
      ((Bp_1)id_class[0]).id_break[0] = var0;
      ((Bp_1)id_class[0]).id_break[1] = var1;
      ((Bp_1)id_class[0]).id_break[2] = var2;
      return (Bp_1)id_class[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1909701072573517804L;
   }

   public Bt_1 id_break() {
      return (Bt_1)this.id_break[1];
   }

   private static void id_throws() {
      id_protected = new byte[]{3};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new Bp_1()};
      id_class = var0;
   }

   private static void id_case() {
      id_byte = new boolean[]{false, true};
   }

   private static void id_protected() {
      id_throws = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 1, 2};
   }

   private void id_private() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
      }
   }
}
