package celestial;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class by_3 implements ro_3 {
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   @Override
   public rY_2[] id_byte() {
      return (rY_2[])this.id_class[1];
   }

   @Override
   public synchronized rY_2 id_byte(rY_2 var1, rpr_3 var2, int var3) {
      ListIterator var4 = ((LinkedList)this.id_class[id_protected[13]]).listIterator();

      while (var4.hasNext()) {
         rY_2 var5 = (rY_2)var4.next();
         if (var5 == var1) {
            var4.remove();
            var4.add(var5.id_class(var2, var3));
            this.id_implements();
            return (rY_2)var4.previous();
         }
      }

      return null;
   }

   public by_3(C_class var1) {
      this.id_finally();
      LinkedList var6 = new LinkedList();
      this.id_class[id_protected[0]] = var6;
      rY_2[] var7 = new rY_2[id_byte[0]];
      this.id_class[1] = var7;
      new bp_3(var1, this);
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class() {
      ((LinkedList)this.id_class[id_protected[14]]).clear();
      this.id_implements();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5651535762784370748L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 77032650;
   }

   @Override
   public rY_2 id_class(rU_2 var1, rU_2 var2) {
      return this.id_break(new bl_3(var1, var2));
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-91, 115, 107, 48, -51, 107, 10, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public synchronized rY_2 id_class(rY_2 var1, rpr_3 var2, int var3) {
      ListIterator var4 = ((LinkedList)this.id_class[id_protected[11]]).listIterator();

      while (var4.hasNext()) {
         rY_2 var5 = (rY_2)var4.next();
         if (var5 == var1) {
            var4.remove();
            var4.add(var5.id_byte(var2, var3));
            this.id_implements();
            return (rY_2)var4.previous();
         }
      }

      return null;
   }

   @Override
   public synchronized rY_2 id_class(rY_2 var1) {
      ((LinkedList)this.id_class[id_protected[5]]).remove(var1);
      this.id_implements();
      return var1;
   }

   @Override
   public synchronized rY_2 id_break(rY_2 var1) {
      ((LinkedList)this.id_class[id_protected[4]]).add(var1);
      this.id_implements();
      return var1;
   }

   @Override
   public rY_2 id_break() {
      return (rY_2)((LinkedList)this.id_class[id_protected[10]]).peekLast();
   }

   @Override
   public synchronized rY_2 id_break(rY_2 var1, rpr_3 var2, int var3) {
      ListIterator var4 = ((LinkedList)this.id_class[id_protected[12]]).listIterator();

      while (var4.hasNext()) {
         rY_2 var5 = (rY_2)var4.next();
         if (var5 == var1) {
            var4.remove();
            var4.add(var5.id_break(var2, var3));
            this.id_implements();
            return (rY_2)var4.previous();
         }
      }

      return null;
   }

   @Override
   public synchronized rY_2[] id_throws() {
      rY_2[] var1 = this.id_byte();
      ((LinkedList)this.id_class[id_protected[6]]).clear();
      this.id_implements();
      return var1;
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_catch() {
      id_byte = new boolean[]{false, false, true};
   }

   private static void id_case() {
      id_break = new byte[]{2};
   }

   private void id_implements() {
      rY_2[] var5 = ((LinkedList)this.id_class[id_protected[2]]).toArray(new rY_2[id_byte[1]]);
      this.id_class[1] = var5;
   }

   @Override
   public synchronized rY_2 id_protected() {
      return ((LinkedList)this.id_class[id_protected[8]]).size() == 1 ? (rY_2)((LinkedList)this.id_class[id_protected[9]]).peekFirst() : null;
   }

   private static void id_private() {
      id_protected = new short[]{0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0};
   }
}
