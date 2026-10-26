package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqH_2 {
   private static float[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;
   private static boolean[] id_throws;

   public void id_byte() {
      ((AnimValue)this.id_class[id_protected[3]]).id_class((Boolean)((Supplier)this.id_class[id_protected[4]]).get());
   }

   public rrqH_2(Supplier<StringBuilder> var1, Supplier<Boolean> var2) {
      this.id_finally();
      AnimValue var7 = new AnimValue(id_break[0], id_throws[0]);
      this.id_class[id_protected[0]] = var7;
      this.id_class[id_protected[1]] = var1;
      this.id_class[id_protected[2]] = var2;
   }

   static {
      ntfClinit();
   }

   public void id_class(AnimValue var1) {
      this.id_class[id_protected[11]] = var1;
   }

   public Supplier<StringBuilder> id_class() {
      return (Supplier<StringBuilder>)this.id_class[id_protected[6]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{43, -22, 94, -34, 1, 5, -53, -107}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1555469603;
   }

   public void id_class(Supplier<Boolean> var1) {
      this.id_class[id_protected[10]] = var1;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2354895094762763557L;
   }

   public float id_break() {
      return ((AnimValue)this.id_class[id_protected[5]]).id_byte() * id_break[1];
   }

   public void id_break(Supplier<StringBuilder> var1) {
      this.id_class[id_protected[9]] = var1;
   }

   public AnimValue id_throws() {
      return (AnimValue)this.id_class[id_protected[8]];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
      }
   }

   private static void id_catch() {
      id_protected = new short[]{2, 0, 1, 2, 1, 2, 0, 1, 2, 0, 1, 2};
   }

   private static void id_case() {
      id_throws = new boolean[1];
   }

   private static void id_implements() {
      id_break = new float[]{0.5F, 8.0F};
   }

   public Supplier<Boolean> id_protected() {
      return (Supplier<Boolean>)this.id_class[id_protected[7]];
   }

   private static void id_private() {
      id_byte = new byte[]{3};
   }
}
