package celestial;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvH<T> extends LinkedList<T> {
   private static short[] id_break;
   private static boolean[] id_byte;
   public Object[] id_class;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
         var1[id_byte[3]] = Integer.valueOf(id_byte[4]);
      }
   }

   public rrvH(int var1) {
      this.id_byte();
      Integer var6 = var1;
      this.id_class[id_break[0]] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean add(T var1) {
      if (this.size() >= (Integer)this.id_class[id_break[1]]) {
         this.removeFirst();
      }

      return super.add(var1);
   }

   public int id_class() {
      return (Integer)this.id_class[id_break[3]];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 4, 88, 92, 120, 21, -96, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(int var1) {
      Integer var6 = var1;
      this.id_class[id_break[4]] = var6;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8543015812637597795L;
   }

   public boolean id_break() {
      return this.size() >= this.id_class[id_break[2]] ? true : id_byte[1];
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1156335885;
   }

   private static void id_throws() {
      id_break = new short[5];
   }

   private static void id_protected() {
      id_byte = new boolean[]{true, false, true, false, false};
   }
}
