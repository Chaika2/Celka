package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sS_2 implements C_static {
   private static byte[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;
   private static String[] id_throws;

   @Override
   public <E extends Enum<?>> E id_byte(Class<E> var1) throws W, Q {
      return this.id_protected(var1, id_protected[15]);
   }

   @Override
   public <T> T id_byte(C_double<T> var1) {
      return this.id_package().id_protected(var1);
   }

   @Override
   public <T> T id_byte(Class<T> var1, T var2) throws Q {
      try {
         Object var3 = this.id_catch().id_byte(var1);
         this.id_throws();
         return (T)var3;
      } catch (W var4) {
         return (T)var2;
      }
   }

   @Override
   public <E extends Enum<?>> E id_byte(Class<E> var1, int var2) throws Q {
      try {
         return this.id_protected(var1, var2);
      } catch (W var4) {
         return null;
      }
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-81, 57, -76, -101, 48, -127, -35, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public LinkedList<C_import> id_byte() {
      return (LinkedList<C_import>)this.id_class[2];
   }

   @Override
   public <T, O, D extends C_switch<T, O>> T id_byte(D var1, O var2) {
      return this.id_break((D)var1, var2, null);
   }

   @Override
   public C_import id_byte(int var1) throws Q {
      this.id_private(var1 + 1);
      return (C_import)((LinkedList)this.id_class[2]).get(var1);
   }

   private static void id_int() {
      id_byte = new short[]{0, 1, 2, 3, 2, 3, 2, 2, 2, 2, 2, 2, 2, 3, 1, 2, 3, 2, 2, 3, 3, 1, 2, 3, 2, 2, 3, 3, 1, 2, 2, 2, 3, 2, 3, 3, 3, 3, 0, 2, 3};
   }

   private sS_2(F var1, Deque<C_import> var2, Deque<C_import> var3) {
      this.id_continue();
      this.id_class[id_byte[0]] = var1;
      ss_3 var9 = new ss_3(this);
      this.id_class[1] = var9;
      LinkedList var10 = new LinkedList(var2);
      this.id_class[2] = var10;
      LinkedList var11 = new LinkedList(var3);
      this.id_class[3] = var11;
   }

   public sS_2(F var1, List<C_import> var2) {
      this(var1, new LinkedList<>(var2), new LinkedList<>());
   }

   static {
      ntfClinit();
   }

   private static void id_this() {
      id_protected = new boolean[]{
         true, false, true, true, false, true, true, false, true, true, false, false, false, false, true, false, false, false, false, false, true, true, false
      };
   }

   @Override
   public String id_class(String var1, int var2) throws Q {
      this.id_private(var2 + 1);
      return ((LinkedList)this.id_class[2])
         .stream()
         .skip((long)var2)
         .map(C_import::id_break)
         .reduce((var1x, var2x) -> var1x + var1 + var2x)
         .orElse(id_throws[0]);
   }

   @Override
   public <T, O> T id_class(C_switch<T, O> var1) {
      return this.id_package().id_throws(var1, null);
   }

   @Override
   public <T, D extends C_double<T>> T id_class(D var1, T var2) {
      ArrayList var3 = new ArrayList((LinkedList)this.id_class[2]);
      ArrayList var4 = new ArrayList((Deque)this.id_class[3]);

      try {
         return this.id_break((D)var1);
      } catch (Exception var6) {
         ((LinkedList)this.id_class[2]).clear();
         ((LinkedList)this.id_class[2]).addAll(var3);
         ((Deque)this.id_class[3]).clear();
         ((Deque)this.id_class[3]).addAll(var4);
         return (T)var2;
      }
   }

   @Override
   public <E extends Enum<?>> E id_class(Class<E> var1, E var2) throws Q {
      try {
         this.id_byte(var1);
         return this.id_implements(var1);
      } catch (W var4) {
         return (E)var2;
      }
   }

   @Override
   public String id_class() {
      return ((LinkedList)this.id_class[2]).size() > 0 ? ((C_import)((LinkedList)this.id_class[2]).getFirst()).id_byte() : id_throws[1];
   }

   @Override
   public <T, O, D extends C_switch<T, O>> T id_class(D var1, O var2, T var3) {
      ArrayList var4 = new ArrayList((LinkedList)this.id_class[2]);
      ArrayList var5 = new ArrayList((Deque)this.id_class[3]);

      try {
         return this.id_break((D)var1, var2);
      } catch (Exception var7) {
         ((LinkedList)this.id_class[2]).clear();
         ((LinkedList)this.id_class[2]).addAll(var4);
         ((Deque)this.id_class[3]).clear();
         ((Deque)this.id_class[3]).addAll(var5);
         return (T)var3;
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5907730455122818838L;
   }

   @Override
   public String[] id_class(String var1) {
      return ((LinkedList)this.id_class[2]).stream().map(C_import::id_break).flatMap(var1x -> Stream.of(var1x.split(var1))).toArray(String[]::new);
   }

   @Override
   public <T> T id_class(Class<T> var1, int var2) throws Q, W {
      return this.id_byte(var2).id_byte(var1);
   }

   @Override
   public <T> T id_class(Class<T> var1, T var2, int var3) throws Q {
      try {
         return this.id_class(var1, var3);
      } catch (W var5) {
         return (T)var2;
      }
   }

   @Override
   public <T> T id_class(C_double<T> var1) throws W, Q {
      return this.id_package().id_break(var1);
   }

   @Override
   public <T extends C_transient> Stream<String> id_class(T var1) {
      try {
         return var1.id_class((C_for)this.id_class[1]);
      } catch (Exception var3) {
         var3.printStackTrace();
         return Stream.empty();
      }
   }

   @Override
   public <T, D extends C_double<T>> T id_class(Class<D> var1) {
      return this.id_package().id_class(var1);
   }

   @Override
   public <T, O, D extends C_switch<T, O>> T id_class(D var1, O var2) throws W, Q {
      return this.id_package().id_break((D)var1, var2);
   }

   @Override
   public <T> T id_class(Class<T> var1, T var2) throws Q {
      return this.id_class(var1, (T)var2, id_protected[18]);
   }

   @Override
   public void id_class(int var1) throws c_1 {
      if (((LinkedList)this.id_class[2]).size() > var1) {
         throw new c_1(var1 + ((Deque)this.id_class[3]).size());
      }
   }

   @Override
   public <T, O, D extends C_switch<T, O>> T id_break(D var1, O var2) throws W, Q {
      try {
         return (T)var1.id_class((C_for)this.id_class[1], var2);
      } catch (Exception var4) {
         throw new W(this.id_final() ? this.id_catch() : this.id_private(), var4);
      }
   }

   @Override
   public <T, D extends C_double<T>> T id_break(Class<D> var1, T var2) {
      return this.id_package().id_break(var1, (T)var2);
   }

   @Override
   public String id_break(String var1) throws Q {
      return this.id_class(var1, id_protected[13]);
   }

   @Override
   public String id_break() {
      return this.id_private().id_break();
   }

   @Override
   public <T> T id_break(Class<T> var1, int var2) throws Q {
      return this.id_class(var1, null, var2);
   }

   @Override
   public <T, O> T id_break(C_switch<T, O> var1) throws W, Q {
      return this.id_protected(var1, null);
   }

   @Override
   public <T, D extends C_double<T>> T id_break(D var1) throws W, Q {
      try {
         return (T)var1.id_byte((C_for)this.id_class[1]);
      } catch (Exception var3) {
         throw new W(this.id_final() ? this.id_catch() : this.id_private(), var3);
      }
   }

   @Override
   public <T, O, D extends C_switch<T, O>> T id_break(D var1, O var2, T var3) {
      return this.id_package().id_class((D)var1, var2, (T)var3);
   }

   @Override
   public <T> T id_break(Class<T> var1) throws Q {
      return this.id_byte(var1, null);
   }

   @Override
   public boolean id_break(int var1) {
      return ((LinkedList)this.id_class[2]).size() >= var1 ? true : id_protected[1];
   }

   @Override
   public <T, O, D extends C_switch<T, O>> T id_throws(D var1, O var2) {
      return this.id_class((D)var1, var2, null);
   }

   @Override
   public <T> T id_throws(Class<T> var1) throws Q {
      return this.id_break(var1, id_protected[19]);
   }

   @Override
   public C_import id_throws() throws Q {
      this.id_private(1);
      C_import var1 = (C_import)((LinkedList)this.id_class[2]).removeFirst();
      ((Deque)this.id_class[3]).add(var1);
      return var1;
   }

   @Override
   public String id_throws(int var1) throws Q {
      return this.id_byte(var1).id_break();
   }

   @Override
   public boolean id_throws(Class<?> var1, int var2) throws Q {
      return this.id_byte(var2).id_class(var1);
   }

   @Override
   public <E extends Enum<?>> E id_finally(Class<E> var1) throws Q {
      return this.id_class(var1, null);
   }

   private static int id_finally(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1727909586;
   }

   @Override
   public boolean id_catch(int var1) {
      return ((LinkedList)this.id_class[2]).size() <= var1 ? true : id_protected[4];
   }

   @Override
   public C_import id_catch() throws Q {
      return this.id_byte(id_protected[10]);
   }

   @Override
   public <T> T id_catch(Class<T> var1) throws W, Q {
      return this.id_throws().id_byte(var1);
   }

   @Override
   public String id_extends() throws Q {
      return this.id_throws().id_break();
   }

   @Override
   public boolean id_extends(Class<?> var1) throws Q {
      return this.id_throws(var1, id_protected[11]);
   }

   @Override
   public boolean id_case() {
      return this.id_case(1);
   }

   @Override
   public boolean id_case(int var1) {
      return ((LinkedList)this.id_class[2]).size() == var1 ? true : id_protected[7];
   }

   @Override
   public <T, D extends C_double<T>> T id_case(Class<D> var1) {
      return this.id_break(var1, null);
   }

   private void id_continue() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
      }
   }

   @Override
   public String id_implements() throws Q {
      return this.id_throws(id_protected[12]);
   }

   @Override
   public <E extends Enum<?>> E id_implements(Class<E> var1) throws W, Q {
      return this.id_throws().id_break(var1);
   }

   private static void id_new() {
      id_break = new byte[]{4};
   }

   public sS_2 id_package() {
      return new sS_2((F)this.id_class[id_byte[38]], (LinkedList)this.id_class[2], (Deque<C_import>)this.id_class[3]);
   }

   private static void id_super() {
      id_throws = new String[]{new String(""), new String("")};
   }

   @Override
   public Deque<C_import> id_protected() {
      return (Deque<C_import>)this.id_class[3];
   }

   @Override
   public <T, D extends C_double<T>> T id_protected(D var1) {
      return this.id_class((D)var1, null);
   }

   @Override
   public <T> T id_protected(Class<T> var1) throws W, Q {
      return this.id_class(var1, id_protected[17]);
   }

   @Override
   public void id_protected(int var1) throws x_1 {
      this.id_private(var1);
      this.id_class(var1);
   }

   @Override
   public <E extends Enum<?>> E id_protected(Class<E> var1, int var2) throws Q, W {
      return this.id_byte(var2).id_break(var1);
   }

   @Override
   public <T, O> T id_protected(C_switch<T, O> var1, O var2) throws W, Q {
      return this.id_package().id_break(var1, var2);
   }

   @Override
   public <E extends Enum<?>> E id_private(Class<E> var1) throws Q {
      return this.id_byte(var1, id_protected[16]);
   }

   @Override
   public C_import id_private() {
      return (C_import)(!((Deque)this.id_class[3]).isEmpty() ? (C_import)((Deque)this.id_class[3]).getLast() : sG_2.id_class());
   }

   @Override
   public void id_private(int var1) throws Q {
      if (((LinkedList)this.id_class[2]).size() < var1) {
         throw new Q(var1 + ((Deque)this.id_class[3]).size());
      }
   }

   @Override
   public boolean id_final() {
      return this.id_break(1);
   }

   @Override
   public boolean id_volatile() {
      return !((Deque)this.id_class[3]).isEmpty() ? true : id_protected[22];
   }

   @Override
   public boolean id_native() {
      return this.id_catch(1);
   }
}
