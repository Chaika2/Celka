package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class v_1 {
   private static boolean[] break_;
   public Object[] class_;
   private static short[] byte_;

   public v_1 byte_() {
      return this.break_(
         ((List)C_throws.break_().Pj[1])
            .stream()
            .filter(var0 -> !Pd_1.throws_(var0) ? true : break_[1])
            .map(C_extends::protected_)
            .sorted(String.CASE_INSENSITIVE_ORDER)
      );
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-44, -22, -84, -91, -85, -39, 27, 56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public v_1(List<String> var1) {
      this.implements_();
      Stream var6 = var1.stream();
      this.class_[0] = var6;
   }

   public v_1() {
      this.implements_();
      Stream var5 = Stream.empty();
      this.class_[0] = var5;
   }

   public v_1(String[] var1) {
      this.implements_();
      Stream var6 = Stream.of(var1);
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   public v_1 class_(Stream<String> var1) {
      Stream var6 = Stream.concat(var1, (Stream)this.class_[0]);
      this.class_[0] = var6;
      return this;
   }

   public v_1 class_(Predicate<String> var1) {
      Stream var6 = ((Stream)this.class_[0]).filter(var1);
      this.class_[0] = var6;
      return this;
   }

   public v_1 class_(Class<? extends Enum<?>> var1) {
      return this.class_(Stream.of((Enum[])var1.getEnumConstants()).map(Enum::name).map(String::toLowerCase));
   }

   public v_1 class_(String... var1) {
      return this.class_(Stream.of(var1));
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4041651473842828959L;
   }

   public v_1 class_(Function<String, String> var1) {
      Stream var6 = ((Stream)this.class_[0]).map(var1);
      this.class_[0] = var6;
      return this;
   }

   public v_1 class_(F var1) {
      return this.break_(var1.class_().byte_().flatMap(var0 -> var0.break_().stream()).distinct());
   }

   public v_1 class_(String var1) {
      return this.class_(var1x -> var1x.toLowerCase(Locale.US).startsWith(var1.toLowerCase(Locale.US)));
   }

   public String[] class_() {
      return ((Stream)this.class_[0]).toArray(String[]::new);
   }

   public v_1 class_(Comparator<String> var1) {
      Stream var6 = ((Stream)this.class_[0]).sorted(var1);
      this.class_[0] = var6;
      return this;
   }

   public v_1 break_(String... var1) {
      return this.break_(Stream.of(var1));
   }

   public v_1 break_(String var1) {
      rqO_2 var2 = rqO_2.break_(var1);
      if (var2 == null) {
         Stream var7 = Stream.empty();
         this.class_[0] = var7;
         return this;
      } else {
         return this.class_(var2.toString());
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 221746413;
   }

   public v_1 break_() {
      return this.class_(String.CASE_INSENSITIVE_ORDER);
   }

   public v_1 break_(Class<? extends Enum<?>> var1) {
      return this.break_(Stream.of((Enum[])var1.getEnumConstants()).map(Enum::name).map(String::toLowerCase));
   }

   public v_1 break_(Stream<String> var1) {
      Stream var6 = Stream.concat((Stream)this.class_[0], var1);
      this.class_[0] = var6;
      return this;
   }

   public v_1 throws_() {
      return this.break_(C_throws.break_().class_(Boolean.class).stream().map(C_extends::protected_).sorted(String.CASE_INSENSITIVE_ORDER));
   }

   private static void catch_() {
      byte_ = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
   }

   public v_1 case_() {
      return this.break_(Pd_1.class_(C_throws.break_()).stream().map(C_extends::protected_).sorted(String.CASE_INSENSITIVE_ORDER));
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public Stream<String> protected_() {
      return (Stream<String>)this.class_[0];
   }

   private static void private_() {
      break_ = new boolean[]{true, false, true};
   }
}
