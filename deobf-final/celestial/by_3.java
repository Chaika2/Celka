package celestial;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class by_3 implements ro_3 {
   private static byte[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] class_;

   @Override
   public rY_2[] byte_() {
      return (rY_2[])this.class_[1];
   }

   @Override
   public synchronized rY_2 byte_(rY_2 var1, rpr_3 var2, int var3) {
      ListIterator var4 = ((LinkedList)this.class_[0]).listIterator();

      while (var4.hasNext()) {
         rY_2 var5 = (rY_2)var4.next();
         if (var5 == var1) {
            var4.remove();
            var4.add(var5.class_(var2, var3));
            this.implements_();
            return (rY_2)var4.previous();
         }
      }

      return null;
   }

   public by_3(C_class var1) {
      this.finally_();
      LinkedList var6 = new LinkedList();
      this.class_[0] = var6;
      rY_2[] var7 = new rY_2[0];
      this.class_[1] = var7;
      new bp_3(var1, this);
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_() {
      ((LinkedList)this.class_[0]).clear();
      this.implements_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5651535762784370748L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 77032650;
   }

   @Override
   public rY_2 class_(rU_2 var1, rU_2 var2) {
      return this.break_(new bl_3(var1, var2));
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-91, 115, 107, 48, -51, 107, 10, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public synchronized rY_2 class_(rY_2 var1, rpr_3 var2, int var3) {
      ListIterator var4 = ((LinkedList)this.class_[0]).listIterator();

      while (var4.hasNext()) {
         rY_2 var5 = (rY_2)var4.next();
         if (var5 == var1) {
            var4.remove();
            var4.add(var5.byte_(var2, var3));
            this.implements_();
            return (rY_2)var4.previous();
         }
      }

      return null;
   }

   @Override
   public synchronized rY_2 class_(rY_2 var1) {
      ((LinkedList)this.class_[0]).remove(var1);
      this.implements_();
      return var1;
   }

   @Override
   public synchronized rY_2 break_(rY_2 var1) {
      ((LinkedList)this.class_[0]).add(var1);
      this.implements_();
      return var1;
   }

   @Override
   public rY_2 break_() {
      return (rY_2)((LinkedList)this.class_[0]).peekLast();
   }

   @Override
   public synchronized rY_2 break_(rY_2 var1, rpr_3 var2, int var3) {
      ListIterator var4 = ((LinkedList)this.class_[0]).listIterator();

      while (var4.hasNext()) {
         rY_2 var5 = (rY_2)var4.next();
         if (var5 == var1) {
            var4.remove();
            var4.add(var5.break_(var2, var3));
            this.implements_();
            return (rY_2)var4.previous();
         }
      }

      return null;
   }

   @Override
   public synchronized rY_2[] throws_() {
      rY_2[] var1 = this.byte_();
      ((LinkedList)this.class_[0]).clear();
      this.implements_();
      return var1;
   }

   private void finally_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      byte_ = new boolean[]{false, false, true};
   }

   private static void case_() {
      break_ = new byte[]{2};
   }

   private void implements_() {
      rY_2[] var5 = ((LinkedList)this.class_[0]).toArray(new rY_2[0]);
      this.class_[1] = var5;
   }

   @Override
   public synchronized rY_2 protected_() {
      return ((LinkedList)this.class_[0]).size() == 1 ? (rY_2)((LinkedList)this.class_[0]).peekFirst() : null;
   }

   private static void private_() {
      protected_ = new short[]{0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0};
   }
}
