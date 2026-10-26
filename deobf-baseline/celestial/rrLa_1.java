package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLa_1 {
   private static byte[] id_byte;
   public static Object[] id_class;
   private static boolean[] id_protected;
   private static short[] id_throws;
   public Object[] id_break;

   private void id_byte() {
      if (this.id_break == null) {
         this.id_break = new Object[id_byte[0]];
         Object[] var1 = this.id_break;
      }
   }

   public rrLa_1() {
      this.id_byte();
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4559259143583947058L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, -47, 65, -47, 117, -42, 70, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -243824677;
   }

   public static rrLa_1 id_class(rdn_3 var0, rrLi_1 var1) {
      ((rrLa_1)id_class[id_throws[0]]).id_break[id_throws[1]] = var0;
      ((rrLa_1)id_class[id_throws[2]]).id_break[id_throws[3]] = var1;
      return (rrLa_1)id_class[id_throws[4]];
   }

   public rdn_3 id_class() {
      return (rdn_3)this.id_break[id_throws[5]];
   }

   public static void id_break(rdn_3 var0, rrLi_1 var1) {
      QY.id_instanceof().id_class(() -> {
         rrLa_1 var2 = id_class(var0, var1);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[7]]).id_finally().id_class(var2);
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_throws[8]]).id_class(var2);
      });
   }

   public rrLi_1 id_break() {
      return (rrLi_1)this.id_break[id_throws[6]];
   }

   private static void id_throws() {
      id_protected = new boolean[]{false, true};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrLa_1()};
      id_class = var0;
   }

   private static void id_case() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 1, 0, 0};
   }

   private static void id_protected() {
      id_byte = new byte[]{2};
   }
}
