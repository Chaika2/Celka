package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIz_1 extends Setting<Integer> {
   private static boolean[] id_byte;
   public Object[] id_break;
   private static short[] id_protected;
   private static byte[] id_throws;

   private void id_int() {
      if (this.id_break == null) {
         this.id_break = new Object[2];
         Object[] var1 = this.id_break;
      }
   }

   public rrIz_1(String var1, int var2) {
      super(var1, var2);
      this.id_int();
      this.id_class[id_protected[0]] = var1;
      Integer var8 = var2;
      this.id_break[1] = var8;
      Supplier var9 = () -> true;
      this.id_break[id_protected[2]] = var9;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4854059563237423760L;
   }

   public Supplier<Boolean> id_class() {
      this.id_int();
      return (Supplier<Boolean>)this.id_break[id_protected[4]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 363394284;
   }

   public rrIz_1 id_break() {
      this.id_int();
      Supplier var5 = () -> id_byte[0];
      this.id_break[id_protected[3]] = var5;
      return this;
   }

   public Integer id_finally() {
      this.id_int();
      return (Integer)this.id_break[1];
   }

   private static void id_extends() {
      id_protected = new short[]{0, 1, 0, 0, 0, 1};
   }

   private static void id_package() {
      id_throws = new byte[]{2};
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-62, -35, 35, -42, 68, -54, -10, 127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_final() {
      id_byte = new boolean[]{false, true};
   }
}
