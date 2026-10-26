package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLs_1 extends Om_1 {
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;
   public Object[] id_class;
   public static Object[] id_break;

   public rrLs_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1299680969;
   }

   public static rrLs_1 id_class(Va_1 var0, int var1, int var2) {
      rrLs_1 var3 = id_break(var0, var1, var2);
      if (var2 == id_protected[1]) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[8]]).id_finally().id_class(var3);
         ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[9]]).id_class(var3);
      }

      return var3;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{45, -26, 23, -36, 8, 17, 53, 116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3723347138302305828L;
   }

   public int id_class() {
      this.id_throws();
      return (Integer)this.id_class[id_byte[12]];
   }

   private static rrLs_1 id_break(Va_1 var0, int var1, int var2) {
      ((rrLs_1)id_break[id_byte[0]]).id_class[id_byte[1]] = var0;
      rrLs_1 var10000 = (rrLs_1)id_break[id_byte[2]];
      Integer var8 = var1;
      var10000.id_class[id_byte[3]] = var8;
      var10000 = (rrLs_1)id_break[id_byte[4]];
      Integer var9 = var2;
      var10000.id_class[id_byte[5]] = var9;
      ((rrLs_1)id_break[id_byte[6]]).id_class(id_protected[0]);
      return (rrLs_1)id_break[id_byte[7]];
   }

   public Va_1 id_break() {
      this.id_throws();
      return (Va_1)this.id_class[id_byte[10]];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[0]];
         Object[] var1 = this.id_class;
         var1[id_protected[3]] = Integer.valueOf(id_protected[4]);
         var1[id_throws[1]] = Integer.valueOf(id_protected[5]);
      }
   }

   private static void id_catch() {
      id_throws = new byte[]{3, 2};
   }

   private static void id_case() {
      id_protected = new boolean[]{false, true, false, true, false, false, true};
   }

   private static void id_implements() {
      Object[] var0 = new Object[]{new rrLs_1()};
      id_break = var0;
   }

   public int id_protected() {
      this.id_throws();
      return (Integer)this.id_class[id_byte[11]];
   }

   private static void id_private() {
      id_byte = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 0, 1, 2};
   }
}
