package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAT {
   private static boolean[] id_byte;
   public Object[] id_class;
   public static Object[] id_break;
   private static short[] id_protected;
   private static byte[] id_throws;

   public List<rJY> id_byte() {
      return (List<rJY>)this.id_class[1];
   }

   public rrAT() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public static void id_class(rJr_1 var0, List<rJY> var1, int var2) {
      rrAT var3 = id_break(var0, var1, var2);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var3);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var3);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-71, 8, 39, 71, -95, -16, 0, -4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 584240663;
   }

   public rJr_1 id_class() {
      return (rJr_1)this.id_class[0];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8691768938729903830L;
   }

   public static rrAT id_break(rJr_1 var0, List<rJY> var1, int var2) {
      ((rrAT)id_break[0]).id_class[0] = var0;
      ((rrAT)id_break[0]).id_class[1] = var1;
      rrAT var10000 = (rrAT)id_break[0];
      Integer var9 = var2;
      var10000.id_class[2] = var9;
      return (rrAT)id_break[0];
   }

   public int id_break() {
      return (Integer)this.id_class[2];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[2] = 0;
      }
   }

   private static void id_catch() {
      id_throws = new byte[]{3, 2};
   }

   private static void id_case() {
      id_protected = new short[]{0, 0, 0, 1, 0, 2, 0, 0, 0, 0, 1, 2};
   }

   private static void id_protected() {
      id_byte = new boolean[]{false, false, true};
   }

   private static void id_private() {
      Object[] var0 = new Object[]{new rrAT()};
      id_break = var0;
   }
}
