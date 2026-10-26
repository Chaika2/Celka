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
      Integer var6 = (Integer)this.id_class[id_break[9]] + var1;
      this.id_class[id_break[10]] = var6;
      return this;
   }

   public Z(E... var1) {
      this.id_case();
      Integer var6 = Integer.valueOf(id_catch[1]);
      this.id_class[id_break[3]] = var6;
      Integer var7 = Integer.valueOf(id_throws[1]);
      this.id_class[id_break[4]] = var7;
      List var8 = Arrays.asList(var1);
      this.id_class[id_break[5]] = var8;
   }

   public Z(List<E> var1) {
      this.id_case();
      Integer var6 = Integer.valueOf(id_catch[0]);
      this.id_class[id_break[0]] = var6;
      Integer var7 = Integer.valueOf(id_throws[0]);
      this.id_class[id_break[1]] = var7;
      this.id_class[id_break[2]] = var1;
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
      return (((List)this.id_class[id_break[7]]).size() - id_throws[2]) / (Integer)this.id_class[id_break[8]] + id_throws[3];
   }

   public static <T> void id_class(C_static var0, List<T> var1, Function<T, rVe_1> var2) throws x_1 {
      id_class(var0, new Z(var1), null, var2, null);
   }

   public static <T> void id_class(C_static var0, List<T> var1, Function<T, rVe_1> var2, String var3) throws x_1 {
      id_class(var0, new Z(var1), null, var2, var3);
   }

   public void id_class(Function<E, rVe_1> var1, String var2) {
      int var3 = ((Integer)this.id_class[id_break[11]] - id_throws[6]) * (Integer)this.id_class[id_break[12]];

      for (int var4 = var3; var4 < var3 + this.id_class[id_break[13]]; var4++) {
         if (var4 < ((List)this.id_class[id_break[14]]).size()) {
            rVi_1[] var10001 = new rVi_1[id_throws[7]];
            var10001[id_throws[8]] = (rVi_1)var1.apply(((List)this.id_class[id_break[15]]).get(var4));
            this.id_class(var10001);
         }
      }

      boolean var9 = var2 != null && this.id_break((Integer)this.id_class[id_break[16]] - id_throws[9]) ? id_throws[10] : id_throws[11];
      boolean var5 = var2 != null && this.id_break((Integer)this.id_class[id_break[17]] + id_throws[12]) ? id_throws[13] : id_throws[14];
      rgN_2 var6 = new rgN_2(id_case[0]);
      if (var9) {
         rgc_3 var10 = var6.id_class();
         rgH_2 var10004 = rgH_2.RUN_COMMAND;
         String var10005 = id_case[1];
         Object[] var10006 = new Object[id_catch[2]];
         var10006[id_throws[15]] = var2;
         var10006[id_throws[16]] = (Integer)this.id_class[id_break[18]] - id_throws[17];
         var6.id_class(var10.id_class(new rgl_3(var10004, String.format(var10005, var10006))).id_class(new rgy_3(rgp_3.id_class, new rgN_2(id_case[2]))));
      } else {
         var6.id_class(var6.id_class().id_class(rgF_2.DARK_GRAY));
      }

      rgN_2 var7 = new rgN_2(id_case[3]);
      if (var5) {
         rgc_3 var11 = var7.id_class();
         rgH_2 var14 = rgH_2.RUN_COMMAND;
         String var15 = id_case[4];
         Object[] var16 = new Object[id_catch[3]];
         var16[id_throws[18]] = var2;
         var16[id_throws[19]] = (Integer)this.id_class[id_break[19]] + id_throws[20];
         var7.id_class(var11.id_class(new rgl_3(var14, String.format(var15, var16))).id_class(new rgy_3(rgp_3.id_class, new rgN_2(id_case[5]))));
      } else {
         var7.id_class(var7.id_class().id_class(rgF_2.DARK_GRAY));
      }

      rVe_1 var8 = new rVe_1(id_case[6]);
      var8.id_class(var8.id_class().id_class(rgF_2.GRAY));
      var8.id_class(var6);
      var8.id_class(id_case[7]);
      var8.id_class(var7);
      String var12 = id_case[8];
      Object[] var10002 = new Object[id_catch[4]];
      var10002[id_throws[21]] = (Integer)this.id_class[id_break[20]];
      var10002[id_throws[22]] = this.id_class();
      var8.id_class(String.format(var12, var10002));
      rVi_1[] var13 = new rVi_1[id_throws[23]];
      var13[id_throws[24]] = var8;
      this.id_class(var13);
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
      int var5 = id_throws[25];
      var0.id_class(id_throws[26]);
      if (var0.id_final()) {
         var5 = var0.id_catch(Integer.class);
         if (!var1.id_break(var5)) {
            C_import var10002 = var0.id_private();
            String var10003 = id_case[9];
            Object[] var10004 = new Object[id_throws[27]];
            var10004[id_throws[28]] = var1.id_class();
            throw new W(var10002, String.format(var10003, var10004), var0.id_private().id_break());
         }
      }

      var1.id_byte(var5 - (Integer)var1.id_class[id_break[21]]);
      if (var2 != null) {
         var2.run();
      }

      var1.id_class(var3, var4);
   }

   public Z<E> id_class(int var1) {
      Integer var6 = var1;
      this.id_class[id_break[6]] = var6;
      return this;
   }

   public boolean id_break(int var1) {
      return var1 > 0 && var1 <= this.id_class() ? id_throws[4] : id_throws[5];
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
         this.id_class = new Object[id_catch[5]];
         Object[] var1 = this.id_class;
         var1[id_throws[29]] = Integer.valueOf(id_throws[30]);
         var1[id_catch[6]] = Integer.valueOf(id_throws[31]);
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
