package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFo_1 {
   public Object[] id_class;
   private static byte[] id_byte;
   public static Object[] id_break;
   private static boolean[] id_protected;
   private static short[] id_throws;

   private static void id_byte() {
      id_byte = new byte[]{2};
   }

   public rrFo_1() {
      this.id_throws();
   }

   static {
      ntfClinit();
   }

   public void id_class(boolean var1) {
      Boolean var6 = var1;
      this.id_class[1] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6094234995490456253L;
   }

   public boolean id_class() {
      return (Boolean)this.id_class[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{4, -112, -7, -46, 71, -23, 10, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrFo_1 id_class(vm_3 var0) {
      ((rrFo_1)id_break[0]).id_class[0] = var0;
      rrFo_1 var10000 = (rrFo_1)id_break[0];
      Boolean var6 = false;
      var10000.id_class[1] = var6;
      return (rrFo_1)id_break[0];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2051213003;
   }

   public static rrFo_1 id_break(vm_3 var0) {
      rrFo_1 var1 = id_class(var0);
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var1);
      ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[0]).id_class(var1);
      return var1;
   }

   public vm_3 id_break() {
      return (vm_3)this.id_class[0];
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[1] = false;
      }
   }

   private static void id_catch() {
      id_throws = new short[]{0, 0, 0, 1, 0, 0, 0, 0, 1, 1};
   }

   private static void id_case() {
      id_protected = new boolean[]{false, false, true, false, true};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrFo_1()};
      id_break = var0;
   }
}
