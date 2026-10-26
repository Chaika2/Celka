package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Z<E> implements PP {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_throws;
   private static String[] id_case;
   private static byte[] id_catch;

   private static void id_byte() {
      id_break = new short[]{1, 2, 0, 1, 2, 0, 1, 0, 1, 2, 2, 2, 1, 1, 0, 0, 2, 2, 2, 2, 2, 2};
   }

   public Z<E> id_byte(int var1) {
      Integer var6 = (Integer)this.id_class[2] + var1;
      this.id_class[2] = var6;
      return this;
   }

   public Z(E... var1) {
      this.id_case();
      Integer var6 = 8;
      this.id_class[1] = var6;
      Integer var7 = 1;
      this.id_class[2] = var7;
      List var8 = Arrays.asList(var1);
      this.id_class[0] = var8;
   }

   public Z(List<E> var1) {
      this.id_case();
      Integer var6 = 8;
      this.id_class[1] = var6;
      Integer var7 = 1;
      this.id_class[2] = var7;
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static <T> void id_class(C_static var0, Z<T> var1, Function<T, rVe_1> var2) throws x_1 {
      id_class(var0, var1, null, var2, null);
   }

   public static <T> void id_class(C_static var0, T[] var1, Function<T, rVe_1> var2) throws x_1 {
      id_class(var0, Arrays.asList(var1), null, var2, null);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1131579604588302438L;
   }

   public int id_class() {
      return (((List)this.id_class[0]).size() - 1) / (Integer)this.id_class[1] + 1;
   }

   public static <T> void id_class(C_static var0, List<T> var1, Function<T, rVe_1> var2) throws x_1 {
      id_class(var0, new Z(var1), null, var2, null);
   }

   public static <T> void id_class(C_static var0, List<T> var1, Function<T, rVe_1> var2, String var3) throws x_1 {
      id_class(var0, new Z(var1), null, var2, var3);
   }

   public void id_class(Function<E, rVe_1> var1, String var2) {
      int var3 = ((Integer)this.id_class[2] - 1) * (Integer)this.id_class[1];

      for (int var4 = var3; var4 < var3 + this.id_class[1]; var4++) {
         if (var4 < ((List)this.id_class[0]).size()) {
            this.id_class(new rVi_1[]{(rVi_1)var1.apply(((List)this.id_class[0]).get(var4))});
         }
      }

      boolean var9 = var2 != null && this.id_break((Integer)this.id_class[2] - 1) ? true : id_throws[11];
      boolean var5 = var2 != null && this.id_break((Integer)this.id_class[2] + 1) ? true : id_throws[14];
      rgN_2 var6 = new rgN_2("«");
      if (var9) {
         var6.id_class(
            var6.id_class()
               .id_class(new rgl_3(rgH_2.RUN_COMMAND, String.format("%s %d", var2, (Integer)this.id_class[2] - 1)))
               .id_class(new rgy_3(rgp_3.id_class, new rgN_2("Нажмите для просмотра предыдущей страницы")))
         );
      } else {
         var6.id_class(var6.id_class().id_class(rgF_2.DARK_GRAY));
      }

      rgN_2 var7 = new rgN_2("»");
      if (var5) {
         var7.id_class(
            var7.id_class()
               .id_class(new rgl_3(rgH_2.RUN_COMMAND, String.format("%s %d", var2, (Integer)this.id_class[2] + 1)))
               .id_class(new rgy_3(rgp_3.id_class, new rgN_2("Нажмите для просмотра следующей страницы")))
         );
      } else {
         var7.id_class(var7.id_class().id_class(rgF_2.DARK_GRAY));
      }

      rVe_1 var8 = new rVe_1("");
      var8.id_class(var8.id_class().id_class(rgF_2.GRAY));
      var8.id_class(var6);
      var8.id_class(" | ");
      var8.id_class(var7);
      var8.id_class(String.format(" %d/%d", (Integer)this.id_class[2], this.id_class()));
      this.id_class(new rVi_1[]{var8});
   }

   public static <T> void id_class(C_static var0, List<T> var1, Runnable var2, Function<T, rVe_1> var3, String var4) throws x_1 {
      id_class(var0, new Z(var1), var2, var3, var4);
   }

   public static <T> void id_class(C_static var0, T[] var1, Runnable var2, Function<T, rVe_1> var3) throws x_1 {
      id_class(var0, Arrays.asList(var1), var2, var3, null);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 28, 71, -11, -95, 6, 81, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static <T> void id_class(C_static var0, Z<T> var1, Function<T, rVe_1> var2, String var3) throws x_1 {
      id_class(var0, var1, null, var2, var3);
   }

   public static <T> void id_class(C_static var0, T[] var1, Runnable var2, Function<T, rVe_1> var3, String var4) throws x_1 {
      id_class(var0, Arrays.asList(var1), var2, var3, var4);
   }

   public static <T> void id_class(C_static var0, List<T> var1, Runnable var2, Function<T, rVe_1> var3) throws x_1 {
      id_class(var0, new Z(var1), var2, var3, null);
   }

   public void id_class(Function<E, rVe_1> var1) {
      this.id_class(var1, null);
   }

   public static <T> void id_class(C_static var0, Z<T> var1, Runnable var2, Function<T, rVe_1> var3) throws x_1 {
      id_class(var0, var1, var2, var3, null);
   }

   public static <T> void id_class(C_static var0, T[] var1, Function<T, rVe_1> var2, String var3) throws x_1 {
      id_class(var0, Arrays.asList(var1), null, var2, var3);
   }

   public static <T> void id_class(C_static var0, Z<T> var1, Runnable var2, Function<T, rVe_1> var3, String var4) throws x_1 {
      int var5 = 1;
      var0.id_class(1);
      if (var0.id_final()) {
         var5 = var0.id_catch(Integer.class);
         if (!var1.id_break(var5)) {
            throw new W(var0.id_private(), String.format("действительная страница (1-%d)", var1.id_class()), var0.id_private().id_break());
         }
      }

      var1.id_byte(var5 - (Integer)var1.id_class[2]);
      if (var2 != null) {
         var2.run();
      }

      var1.id_class(var3, var4);
   }

   public Z<E> id_class(int var1) {
      Integer var6 = var1;
      this.id_class[1] = var6;
      return this;
   }

   public boolean id_break(int var1) {
      return var1 > 0 && var1 <= this.id_class() ? true : id_throws[5];
   }

   private static void id_break() {
      id_catch = new byte[]{8, 8, 2, 2, 2, 3, 2};
   }

   private static void id_throws() {
      id_case = new String[]{
         new String("«"),
         new String("%s %d"),
         new String("Нажмите для просмотра предыдущей страницы"),
         new String("»"),
         new String("%s %d"),
         new String("Нажмите для просмотра следующей страницы"),
         new String(""),
         new String(" | "),
         new String(" %d/%d"),
         new String("действительная страница (1-%d)")
      };
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[1] = 0;
         var1[2] = 0;
      }
   }

   private static int id_protected(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -75744566;
   }

   private static void id_protected() {
      id_throws = new boolean[]{
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         false
      };
   }
}
