package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLI {
   public static Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static byte[] id_throws;
   public Object[] id_break;

   public iB_2 id_byte() {
      return (iB_2)this.id_break[id_byte[9]];
   }

   public rrLI() {
      this.id_case();
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1919238544;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8464193706500080951L;
   }

   public boolean id_class() {
      return (Boolean)this.id_break[id_byte[11]];
   }

   public static rrLI id_class(iB_2 var0, rLY var1, boolean var2) {
      ((rrLI)id_class[id_byte[0]]).id_break[id_byte[1]] = var0;
      ((rrLI)id_class[id_byte[2]]).id_break[id_byte[3]] = var1;
      rrLI var10000 = (rrLI)id_class[id_byte[4]];
      Boolean var9 = var2;
      var10000.id_break[id_byte[5]] = var9;
      return (rrLI)id_class[id_byte[6]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{77, 100, -28, 122, 127, -95, -26, 96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static void id_break(iB_2 var0, rLY var1, boolean var2) {
      rrLI var3 = id_class(var0, var1, var2);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[7]]).id_finally().id_class(var3);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[8]]).id_class(var3);
   }

   public rLY id_break() {
      return (rLY)this.id_break[id_byte[10]];
   }

   private static void id_throws() {
      id_byte = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 1, 2};
   }

   private static void id_catch() {
      Object[] var0 = new Object[]{new rrLI()};
      id_class = var0;
   }

   private void id_case() {
      if (this.id_break == null) {
         this.id_break = new Object[id_throws[0]];
         Object[] var1 = this.id_break;
         var1[id_throws[1]] = id_protected[1];
      }
   }

   private static void id_protected() {
      id_protected = new boolean[]{false, false, true};
   }

   private static void id_private() {
      id_throws = new byte[]{3, 2};
   }
}
