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
   public Object[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;

   public void id_byte(V var1) {
      if (this.id_class(var1)) {
         ((Deque)this.id_class[id_protected[7]]).remove(var1);
         ((Set)this.id_class[id_protected[8]]).remove(var1);
      }
   }

   public Stream<V> id_byte() {
      return StreamSupport.stream(
         Spliterators.spliterator(this.id_class(), (long)((Deque)this.id_class[id_protected[12]]).size(), id_protected[13]), id_break[2]
      );
   }

   public L() {
      this.id_case();
      LinkedList var5 = new LinkedList();
      this.id_class[id_protected[0]] = var5;
      HashSet var6 = new HashSet();
      this.id_class[id_protected[1]] = var6;
      Collection var7 = Collections.unmodifiableCollection((Deque)this.id_class[id_protected[2]]);
      this.id_class[id_protected[3]] = var7;
   }

   static {
      ntfClinit();
   }

   public Iterator<V> id_class() {
      return ((Deque)this.id_class[id_protected[10]]).descendingIterator();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6219544457513045963L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-52, -87, -42, -18, -23, -86, 38, -42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -597805692;
   }

   public boolean id_class(V var1) {
      return ((Set)this.id_class[id_protected[4]]).contains(var1);
   }

   public Iterator<V> id_break() {
      return ((Deque)this.id_class[id_protected[9]]).iterator();
   }

   public boolean id_break(V var1) {
      if (!this.id_class((V)var1)) {
         ((Deque)this.id_class[id_protected[5]]).addFirst(var1);
         ((Set)this.id_class[id_protected[6]]).add(var1);
         return id_break[0];
      } else {
         return id_break[1];
      }
   }

   private static void id_throws() {
      id_break = new boolean[]{true, false, false};
   }

   private static void id_catch() {
      id_protected = new short[]{0, 1, 0, 2, 1, 0, 1, 0, 1, 0, 0, 0, 0, 16448};
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
      }
   }

   public Stream<V> id_protected() {
      return ((Deque)this.id_class[id_protected[11]]).stream();
   }

   private static void id_private() {
      id_byte = new byte[]{3};
   }
}
