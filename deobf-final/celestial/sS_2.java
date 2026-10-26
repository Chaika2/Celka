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
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static boolean[] protected_;
   private static String[] throws_;

   @Override
   public <E extends Enum<?>> E byte_(Class<E> var1) throws W, Q {
      return this.protected_(var1, 0);
   }

   @Override
   public <T> T byte_(C_double<T> var1) {
      return this.package_().protected_(var1);
   }

   @Override
   public <T> T byte_(Class<T> var1, T var2) throws Q {
      try {
         Object var3 = this.catch_().byte_(var1);
         this.throws_();
         return (T)var3;
      } catch (W var4) {
         return (T)var2;
      }
   }

   @Override
   public <E extends Enum<?>> E byte_(Class<E> var1, int var2) throws Q {
      try {
         return this.protected_(var1, var2);
      } catch (W var4) {
         return null;
      }
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-81, 57, -76, -101, 48, -127, -35, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public LinkedList<C_import> byte_() {
      return (LinkedList<C_import>)this.class_[2];
   }

   @Override
   public <T, O, D extends C_switch<T, O>> T byte_(D var1, O var2) {
      return this.break_((D)var1, var2, null);
   }

   @Override
   public C_import byte_(int var1) throws Q {
      this.private_(var1 + 1);
      return (C_import)((LinkedList)this.class_[2]).get(var1);
   }

   private static void int_() {
      byte_ = new short[]{0, 1, 2, 3, 2, 3, 2, 2, 2, 2, 2, 2, 2, 3, 1, 2, 3, 2, 2, 3, 3, 1, 2, 3, 2, 2, 3, 3, 1, 2, 2, 2, 3, 2, 3, 3, 3, 3, 0, 2, 3};
   }

   private sS_2(F var1, Deque<C_import> var2, Deque<C_import> var3) {
      this.continue_();
      this.class_[0] = var1;
      ss_3 var9 = new ss_3(this);
      this.class_[1] = var9;
      LinkedList var10 = new LinkedList(var2);
      this.class_[2] = var10;
      LinkedList var11 = new LinkedList(var3);
      this.class_[3] = var11;
   }

   public sS_2(F var1, List<C_import> var2) {
      this(var1, new LinkedList<>(var2), new LinkedList<>());
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new boolean[]{
         true, false, true, true, false, true, true, false, true, true, false, false, false, false, true, false, false, false, false, false, true, true, false
      };
   }

   @Override
   public String class_(String var1, int var2) throws Q {
      this.private_(var2 + 1);
      return ((LinkedList)this.class_[2]).stream().skip((long)var2).map(C_import::break_).reduce((var1x, var2x) -> var1x + var1 + var2x).orElse("");
   }

   @Override
   public <T, O> T class_(C_switch<T, O> var1) {
      return this.package_().throws_(var1, null);
   }

   @Override
   public <T, D extends C_double<T>> T class_(D var1, T var2) {
      ArrayList var3 = new ArrayList((LinkedList)this.class_[2]);
      ArrayList var4 = new ArrayList((Deque)this.class_[3]);

      try {
         return this.break_((D)var1);
      } catch (Exception var6) {
         ((LinkedList)this.class_[2]).clear();
         ((LinkedList)this.class_[2]).addAll(var3);
         ((Deque)this.class_[3]).clear();
         ((Deque)this.class_[3]).addAll(var4);
         return (T)var2;
      }
   }

   @Override
   public <E extends Enum<?>> E class_(Class<E> var1, E var2) throws Q {
      try {
         this.byte_(var1);
         return this.implements_(var1);
      } catch (W var4) {
         return (E)var2;
      }
   }

   @Override
   public String class_() {
      return ((LinkedList)this.class_[2]).size() > 0 ? ((C_import)((LinkedList)this.class_[2]).getFirst()).byte_() : throws_[1];
   }

   @Override
   public <T, O, D extends C_switch<T, O>> T class_(D var1, O var2, T var3) {
      ArrayList var4 = new ArrayList((LinkedList)this.class_[2]);
      ArrayList var5 = new ArrayList((Deque)this.class_[3]);

      try {
         return this.break_((D)var1, var2);
      } catch (Exception var7) {
         ((LinkedList)this.class_[2]).clear();
         ((LinkedList)this.class_[2]).addAll(var4);
         ((Deque)this.class_[3]).clear();
         ((Deque)this.class_[3]).addAll(var5);
         return (T)var3;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5907730455122818838L;
   }

   @Override
   public String[] class_(String var1) {
      return ((LinkedList)this.class_[2]).stream().map(C_import::break_).flatMap(var1x -> Stream.of(var1x.split(var1))).toArray(String[]::new);
   }

   @Override
   public <T> T class_(Class<T> var1, int var2) throws Q, W {
      return this.byte_(var2).byte_(var1);
   }

   @Override
   public <T> T class_(Class<T> var1, T var2, int var3) throws Q {
      try {
         return this.class_(var1, var3);
      } catch (W var5) {
         return (T)var2;
      }
   }

   @Override
   public <T> T class_(C_double<T> var1) throws W, Q {
      return this.package_().break_(var1);
   }

   @Override
   public <T extends C_transient> Stream<String> class_(T var1) {
      try {
         return var1.class_((C_for)this.class_[byte_[28]]);
      } catch (Exception var3) {
         var3.printStackTrace();
         return Stream.empty();
      }
   }

   @Override
   public <T, D extends C_double<T>> T class_(Class<D> var1) {
      return this.package_().class_(var1);
   }

   @Override
   public <T, O, D extends C_switch<T, O>> T class_(D var1, O var2) throws W, Q {
      return this.package_().break_((D)var1, var2);
   }

   @Override
   public <T> T class_(Class<T> var1, T var2) throws Q {
      return this.class_(var1, (T)var2, 0);
   }

   @Override
   public void class_(int var1) throws c_1 {
      if (((LinkedList)this.class_[2]).size() > var1) {
         throw new c_1(var1 + ((Deque)this.class_[3]).size());
      }
   }

   @Override
   public <T, O, D extends C_switch<T, O>> T break_(D var1, O var2) throws W, Q {
      try {
         return (T)var1.class_((C_for)this.class_[byte_[14]], var2);
      } catch (Exception var4) {
         throw new W(this.final_() ? this.catch_() : this.private_(), var4);
      }
   }

   @Override
   public <T, D extends C_double<T>> T break_(Class<D> var1, T var2) {
      return this.package_().break_(var1, (T)var2);
   }

   @Override
   public String break_(String var1) throws Q {
      return this.class_(var1, 0);
   }

   @Override
   public String break_() {
      return this.private_().break_();
   }

   @Override
   public <T> T break_(Class<T> var1, int var2) throws Q {
      return this.class_(var1, null, var2);
   }

   @Override
   public <T, O> T break_(C_switch<T, O> var1) throws W, Q {
      return this.protected_(var1, null);
   }

   @Override
   public <T, D extends C_double<T>> T break_(D var1) throws W, Q {
      try {
         return (T)var1.byte_((C_for)this.class_[byte_[21]]);
      } catch (Exception var3) {
         throw new W(this.final_() ? this.catch_() : this.private_(), var3);
      }
   }

   @Override
   public <T, O, D extends C_switch<T, O>> T break_(D var1, O var2, T var3) {
      return this.package_().class_((D)var1, var2, (T)var3);
   }

   @Override
   public <T> T break_(Class<T> var1) throws Q {
      return this.byte_(var1, null);
   }

   @Override
   public boolean break_(int var1) {
      return ((LinkedList)this.class_[2]).size() >= var1 ? true : protected_[1];
   }

   @Override
   public <T, O, D extends C_switch<T, O>> T throws_(D var1, O var2) {
      return this.class_((D)var1, var2, null);
   }

   @Override
   public <T> T throws_(Class<T> var1) throws Q {
      return this.break_(var1, 0);
   }

   @Override
   public C_import throws_() throws Q {
      this.private_(1);
      C_import var1 = (C_import)((LinkedList)this.class_[2]).removeFirst();
      ((Deque)this.class_[3]).add(var1);
      return var1;
   }

   @Override
   public String throws_(int var1) throws Q {
      return this.byte_(var1).break_();
   }

   @Override
   public boolean throws_(Class<?> var1, int var2) throws Q {
      return this.byte_(var2).class_(var1);
   }

   @Override
   public <E extends Enum<?>> E finally_(Class<E> var1) throws Q {
      return this.class_(var1, null);
   }

   private static int finally_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1727909586;
   }

   @Override
   public boolean catch_(int var1) {
      return ((LinkedList)this.class_[2]).size() <= var1 ? true : protected_[4];
   }

   @Override
   public C_import catch_() throws Q {
      return this.byte_(0);
   }

   @Override
   public <T> T catch_(Class<T> var1) throws W, Q {
      return this.throws_().byte_(var1);
   }

   @Override
   public String extends_() throws Q {
      return this.throws_().break_();
   }

   @Override
   public boolean extends_(Class<?> var1) throws Q {
      return this.throws_(var1, 0);
   }

   @Override
   public boolean case_() {
      return this.case_(1);
   }

   @Override
   public boolean case_(int var1) {
      return ((LinkedList)this.class_[2]).size() == var1 ? true : protected_[7];
   }

   @Override
   public <T, D extends C_double<T>> T case_(Class<D> var1) {
      return this.break_(var1, null);
   }

   private void continue_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
      }
   }

   @Override
   public String implements_() throws Q {
      return this.throws_(0);
   }

   @Override
   public <E extends Enum<?>> E implements_(Class<E> var1) throws W, Q {
      return this.throws_().break_(var1);
   }

   private static void new_() {
      break_ = new byte[]{4};
   }

   public sS_2 package_() {
      return new sS_2((F)this.class_[0], (LinkedList)this.class_[2], (Deque<C_import>)this.class_[3]);
   }

   private static void super_() {
      throws_ = new String[]{new String(""), new String("")};
   }

   @Override
   public Deque<C_import> protected_() {
      return (Deque<C_import>)this.class_[3];
   }

   @Override
   public <T, D extends C_double<T>> T protected_(D var1) {
      return this.class_((D)var1, null);
   }

   @Override
   public <T> T protected_(Class<T> var1) throws W, Q {
      return this.class_(var1, 0);
   }

   @Override
   public void protected_(int var1) throws x_1 {
      this.private_(var1);
      this.class_(var1);
   }

   @Override
   public <E extends Enum<?>> E protected_(Class<E> var1, int var2) throws Q, W {
      return this.byte_(var2).break_(var1);
   }

   @Override
   public <T, O> T protected_(C_switch<T, O> var1, O var2) throws W, Q {
      return this.package_().break_(var1, var2);
   }

   @Override
   public <E extends Enum<?>> E private_(Class<E> var1) throws Q {
      return this.byte_(var1, 0);
   }

   @Override
   public C_import private_() {
      return (C_import)(!((Deque)this.class_[3]).isEmpty() ? (C_import)((Deque)this.class_[3]).getLast() : sG_2.class_());
   }

   @Override
   public void private_(int var1) throws Q {
      if (((LinkedList)this.class_[2]).size() < var1) {
         throw new Q(var1 + ((Deque)this.class_[3]).size());
      }
   }

   @Override
   public boolean final_() {
      return this.break_(1);
   }

   @Override
   public boolean volatile_() {
      return !((Deque)this.class_[3]).isEmpty() ? true : protected_[22];
   }

   @Override
   public boolean native_() {
      return this.catch_(1);
   }
}
