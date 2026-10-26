package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class L<V> {
   public Object[] class_;
   private static boolean[] break_;
   private static byte[] byte_;
   private static short[] protected_;

   public void byte_(V var1) {
      if (this.class_(var1)) {
         ((Deque)this.class_[0]).remove(var1);
         ((Set)this.class_[1]).remove(var1);
      }
   }

   public Stream<V> byte_() {
      return StreamSupport.stream(Spliterators.spliterator(this.class_(), (long)((Deque)this.class_[0]).size(), 16448), false);
   }

   public L() {
      this.case_();
      LinkedList var5 = new LinkedList();
      this.class_[0] = var5;
      HashSet var6 = new HashSet();
      this.class_[1] = var6;
      Collection var7 = Collections.unmodifiableCollection((Deque)this.class_[0]);
      this.class_[2] = var7;
   }

   static {
      ntfClinit();
   }

   public Iterator<V> class_() {
      return ((Deque)this.class_[0]).descendingIterator();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6219544457513045963L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-52, -87, -42, -18, -23, -86, 38, -42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -597805692;
   }

   public boolean class_(V var1) {
      return ((Set)this.class_[1]).contains(var1);
   }

   public Iterator<V> break_() {
      return ((Deque)this.class_[0]).iterator();
   }

   public boolean break_(V var1) {
      if (!this.class_((V)var1)) {
         ((Deque)this.class_[0]).addFirst(var1);
         ((Set)this.class_[1]).add(var1);
         return true;
      } else {
         return break_[1];
      }
   }

   private static void throws_() {
      break_ = new boolean[]{true, false, false};
   }

   private static void catch_() {
      protected_ = new short[]{0, 1, 0, 2, 1, 0, 1, 0, 1, 0, 0, 0, 0, 16448};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   public Stream<V> protected_() {
      return ((Deque)this.class_[0]).stream();
   }

   private static void private_() {
      byte_ = new byte[]{3};
   }
}
