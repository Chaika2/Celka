package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Z<E> implements PP {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] throws_;
   private static String[] case_;
   private static byte[] catch_;

   private static void byte_() {
      break_ = new short[]{1, 2, 0, 1, 2, 0, 1, 0, 1, 2, 2, 2, 1, 1, 0, 0, 2, 2, 2, 2, 2, 2};
   }

   public Z<E> byte_(int var1) {
      Integer var6 = (Integer)this.class_[2] + var1;
      this.class_[2] = var6;
      return this;
   }

   public Z(E... var1) {
      this.case_();
      Integer var6 = 8;
      this.class_[1] = var6;
      Integer var7 = 1;
      this.class_[2] = var7;
      List var8 = Arrays.asList(var1);
      this.class_[0] = var8;
   }

   public Z(List<E> var1) {
      this.case_();
      Integer var6 = 8;
      this.class_[1] = var6;
      Integer var7 = 1;
      this.class_[2] = var7;
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   public static <T> void class_(C_static var0, Z<T> var1, Function<T, rVe_1> var2) throws x_1 {
      class_(var0, var1, null, var2, null);
   }

   public static <T> void class_(C_static var0, T[] var1, Function<T, rVe_1> var2) throws x_1 {
      class_(var0, Arrays.asList(var1), null, var2, null);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1131579604588302438L;
   }

   public int class_() {
      return (((List)this.class_[0]).size() - 1) / (Integer)this.class_[1] + 1;
   }

   public static <T> void class_(C_static var0, List<T> var1, Function<T, rVe_1> var2) throws x_1 {
      class_(var0, new Z(var1), null, var2, null);
   }

   public static <T> void class_(C_static var0, List<T> var1, Function<T, rVe_1> var2, String var3) throws x_1 {
      class_(var0, new Z(var1), null, var2, var3);
   }

   public void class_(Function<E, rVe_1> var1, String var2) {
      int var3 = ((Integer)this.class_[2] - 1) * (Integer)this.class_[1];

      for (int var4 = var3; var4 < var3 + this.class_[1]; var4++) {
         if (var4 < ((List)this.class_[0]).size()) {
            this.class_(new rVi_1[]{(rVi_1)var1.apply(((List)this.class_[0]).get(var4))});
         }
      }

      boolean var9 = var2 != null && this.break_((Integer)this.class_[2] - 1) ? true : throws_[11];
      boolean var5 = var2 != null && this.break_((Integer)this.class_[2] + 1) ? true : throws_[14];
      rgN_2 var6 = new rgN_2("«");
      if (var9) {
         var6.class_(
            var6.class_()
               .class_(new rgl_3(rgH_2.RUN_COMMAND, String.format("%s %d", var2, (Integer)this.class_[2] - 1)))
               .class_(new rgy_3(rgp_3.class_, new rgN_2("Нажмите для просмотра предыдущей страницы")))
         );
      } else {
         var6.class_(var6.class_().class_(rgF_2.DARK_GRAY));
      }

      rgN_2 var7 = new rgN_2("»");
      if (var5) {
         var7.class_(
            var7.class_()
               .class_(new rgl_3(rgH_2.RUN_COMMAND, String.format("%s %d", var2, (Integer)this.class_[2] + 1)))
               .class_(new rgy_3(rgp_3.class_, new rgN_2("Нажмите для просмотра следующей страницы")))
         );
      } else {
         var7.class_(var7.class_().class_(rgF_2.DARK_GRAY));
      }

      rVe_1 var8 = new rVe_1("");
      var8.class_(var8.class_().class_(rgF_2.GRAY));
      var8.class_(var6);
      var8.class_(" | ");
      var8.class_(var7);
      var8.class_(String.format(" %d/%d", (Integer)this.class_[2], this.class_()));
      this.class_(new rVi_1[]{var8});
   }

   public static <T> void class_(C_static var0, List<T> var1, Runnable var2, Function<T, rVe_1> var3, String var4) throws x_1 {
      class_(var0, new Z(var1), var2, var3, var4);
   }

   public static <T> void class_(C_static var0, T[] var1, Runnable var2, Function<T, rVe_1> var3) throws x_1 {
      class_(var0, Arrays.asList(var1), var2, var3, null);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, 28, 71, -11, -95, 6, 81, -14}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static <T> void class_(C_static var0, Z<T> var1, Function<T, rVe_1> var2, String var3) throws x_1 {
      class_(var0, var1, null, var2, var3);
   }

   public static <T> void class_(C_static var0, T[] var1, Runnable var2, Function<T, rVe_1> var3, String var4) throws x_1 {
      class_(var0, Arrays.asList(var1), var2, var3, var4);
   }

   public static <T> void class_(C_static var0, List<T> var1, Runnable var2, Function<T, rVe_1> var3) throws x_1 {
      class_(var0, new Z(var1), var2, var3, null);
   }

   public void class_(Function<E, rVe_1> var1) {
      this.class_(var1, null);
   }

   public static <T> void class_(C_static var0, Z<T> var1, Runnable var2, Function<T, rVe_1> var3) throws x_1 {
      class_(var0, var1, var2, var3, null);
   }

   public static <T> void class_(C_static var0, T[] var1, Function<T, rVe_1> var2, String var3) throws x_1 {
      class_(var0, Arrays.asList(var1), null, var2, var3);
   }

   public static <T> void class_(C_static var0, Z<T> var1, Runnable var2, Function<T, rVe_1> var3, String var4) throws x_1 {
      int var5 = 1;
      var0.class_(1);
      if (var0.final_()) {
         var5 = var0.catch_(Integer.class);
         if (!var1.break_(var5)) {
            throw new W(var0.private_(), String.format("действительная страница (1-%d)", var1.class_()), var0.private_().break_());
         }
      }

      var1.byte_(var5 - (Integer)var1.class_[2]);
      if (var2 != null) {
         var2.run();
      }

      var1.class_(var3, var4);
   }

   public Z<E> class_(int var1) {
      Integer var6 = var1;
      this.class_[1] = var6;
      return this;
   }

   public boolean break_(int var1) {
      return var1 > 0 && var1 <= this.class_() ? true : throws_[5];
   }

   private static void break_() {
      catch_ = new byte[]{8, 8, 2, 2, 2, 3, 2};
   }

   private static void throws_() {
      case_ = new String[]{
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

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[1] = 0;
         var1[2] = 0;
      }
   }

   private static int protected_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -75744566;
   }

   private static void protected_() {
      throws_ = new boolean[]{
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
