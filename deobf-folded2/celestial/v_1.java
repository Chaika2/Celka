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
   private static boolean[] id_break;
   public Object[] id_class;
   private static short[] id_byte;

   public v_1 id_byte() {
      return this.id_break(
         ((List)C_throws.id_break().Pj[1])
            .stream()
            .filter(var0 -> !Pd_1.id_throws(var0) ? true : id_break[1])
            .map(C_extends::id_protected)
            .sorted(String.CASE_INSENSITIVE_ORDER)
      );
   }

   public static String id_byte(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-44, -22, -84, -91, -85, -39, 27, 56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public v_1(List<String> var1) {
      this.id_implements();
      Stream var6 = var1.stream();
      this.id_class[0] = var6;
   }

   public v_1() {
      this.id_implements();
      Stream var5 = Stream.empty();
      this.id_class[0] = var5;
   }

   public v_1(String[] var1) {
      this.id_implements();
      Stream var6 = Stream.of(var1);
      this.id_class[0] = var6;
   }

   static {
      ntfClinit();
   }

   public v_1 id_class(Stream<String> var1) {
      Stream var6 = Stream.concat(var1, (Stream)this.id_class[0]);
      this.id_class[0] = var6;
      return this;
   }

   public v_1 id_class(Predicate<String> var1) {
      Stream var6 = ((Stream)this.id_class[0]).filter(var1);
      this.id_class[0] = var6;
      return this;
   }

   public v_1 id_class(Class<? extends Enum<?>> var1) {
      return this.id_class(Stream.of((Enum[])var1.getEnumConstants()).map(Enum::name).map(String::toLowerCase));
   }

   public v_1 id_class(String... var1) {
      return this.id_class(Stream.of(var1));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4041651473842828959L;
   }

   public v_1 id_class(Function<String, String> var1) {
      Stream var6 = ((Stream)this.id_class[0]).map(var1);
      this.id_class[0] = var6;
      return this;
   }

   public v_1 id_class(F var1) {
      return this.id_break(var1.id_class().id_byte().flatMap(var0 -> var0.id_break().stream()).distinct());
   }

   public v_1 id_class(String var1) {
      return this.id_class(var1x -> var1x.toLowerCase(Locale.US).startsWith(var1.toLowerCase(Locale.US)));
   }

   public String[] id_class() {
      return ((Stream)this.id_class[0]).toArray(String[]::new);
   }

   public v_1 id_class(Comparator<String> var1) {
      Stream var6 = ((Stream)this.id_class[0]).sorted(var1);
      this.id_class[0] = var6;
      return this;
   }

   public v_1 id_break(String... var1) {
      return this.id_break(Stream.of(var1));
   }

   public v_1 id_break(String var1) {
      rqO_2 var2 = rqO_2.id_break(var1);
      if (var2 == null) {
         Stream var7 = Stream.empty();
         this.id_class[0] = var7;
         return this;
      } else {
         return this.id_class(var2.toString());
      }
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 221746413;
   }

   public v_1 id_break() {
      return this.id_class(String.CASE_INSENSITIVE_ORDER);
   }

   public v_1 id_break(Class<? extends Enum<?>> var1) {
      return this.id_break(Stream.of((Enum[])var1.getEnumConstants()).map(Enum::name).map(String::toLowerCase));
   }

   public v_1 id_break(Stream<String> var1) {
      Stream var6 = Stream.concat((Stream)this.id_class[0], var1);
      this.id_class[0] = var6;
      return this;
   }

   public v_1 id_throws() {
      return this.id_break(C_throws.id_break().id_class(Boolean.class).stream().map(C_extends::id_protected).sorted(String.CASE_INSENSITIVE_ORDER));
   }

   private static void id_catch() {
      id_byte = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
   }

   public v_1 id_case() {
      return this.id_break(Pd_1.id_class(C_throws.id_break()).stream().map(C_extends::id_protected).sorted(String.CASE_INSENSITIVE_ORDER));
   }

   private void id_implements() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   public Stream<String> id_protected() {
      return (Stream<String>)this.id_class[0];
   }

   private static void id_private() {
      id_break = new boolean[]{true, false, true};
   }
}
