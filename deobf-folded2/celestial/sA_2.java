package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sA_2 extends C_try {
   private static String[] id_throws;
   private static boolean[] id_case;
   private static float[] id_catch;
   private static double[] id_private;
   public Object[] id_break;
   private static byte[] id_implements;
   private static short[] id_finally;

   public sA_2(C_case var1) {
      super(var1, "fb", "farmbuilder");
      this.id_native();
      Object var6 = null;
      this.id_break[0] = var6;
      var1.s().id_class(new sn_3(this, var1));
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8888089848345993213L;
   }

   @Override
   public void id_class(String var1, C_static var2) throws x_1 {
      this.id_native();
      sl_3 var3 = sl_3.id_break(var2.id_extends());
      if (var3 == null) {
         throw new W(var2.id_private(), "действие");
      } else {
         FarmBuilder var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_finally();
         switch (((int[])sC_2.id_class[0])[var3.ordinal()]) {
            case 1:
            case 2:
               if (var3 == (sl_3)sl_3.staticFields30c4eacb1e233b1abdfca916ea51d438[1] && (rU_2)this.id_break[0] == null) {
                  throw new k_1("Сначала установите pos1, прежде чем использовать pos2");
               }

               rjU_2 var17 = ((Hh_1)((Ps_1)this.id_class[1]).id_throws().id_class[16]).id_finally().id_new();
               rU_2 var16;
               if (var17 != null) {
                  var16 = new rU_2(var17.id_class(0.0, (double)(((cb_3)b_.id_class[57]).Bx() / 2.0F), 0.0));
               } else if (b_.id_catch() != null) {
                  var16 = rU_2.id_class(b_.id_catch().Bs());
               } else {
                  var16 = ((Ps_1)this.id_class[1]).id_volatile();
               }

               rU_2 var18 = var2.id_final() ? var2.id_break((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[0], var16) : var16;
               var2.id_class(0);
               if (var3 == (sl_3)sl_3.staticFields30c4eacb1e233b1abdfca916ea51d438[0]) {
                  this.id_break[0] = var18;
                  this.id_case("Первая позиция была установлена, теперь установите вторую");
               } else {
                  var4.id_class(new bl_3((rU_2)this.id_break[0], var18.id_class()));
                  Object var15 = null;
                  this.id_break[0] = var15;
                  this.id_case("Выделение добавлено");
               }
               break;
            case 3:
               rY_2 var5 = var4.id_new();
               if (var5 == null) {
                  this.id_case("Выделение не установлено");
               } else {
                  rU_2 var6 = var5.id_byte();
                  rU_2 var7 = var5.id_case();
                  int var8 = Math.abs(var7.b_() - var6.b_()) + 1;
                  int var9 = Math.abs(var7.d_() - var6.d_()) + 1;
                  this.id_case("Позиция 1: " + var6);
                  this.id_case("Позиция 2: " + var7);
                  this.id_case("Радиус выделения: " + var8 + "x" + var9);
               }
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1626432210;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, -108, 25, -79, 53, 80, 62, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> id_break(String var1, C_static var2) throws x_1 {
      return var2.id_case() ? new v_1().id_break(sl_3.id_class()).id_class(var2.id_extends()).id_protected() : Stream.empty();
   }

   private static void id_throws() {
      id_case = new boolean[]{false, true, false, true, true, false, false, false, true, true, false, true, false, true, false, true, false, true, true};
   }

   private static void id_finally() {
      id_implements = new byte[]{2, 5, 2, 2, 2, 2, 3, 2, 4, 2};
   }

   @Override
   public List<String> id_catch() {
      String var1 = this.id_break().get(0);
      String var2 = (String)C_class.id_instanceof().id_protected.id_class[0];
      return Arrays.asList(
         "> %s%s pos1 - Установите первую позицию к вашему текущему положению".formatted(var2, var1),
         "> %s%s pos1 <x> <y> <z> - Установите первую позицию на любые координаты".formatted(var2, var1),
         "> %s%s pos2 - Установите вторую позицию к вашему текущему положению".formatted(var2, var1),
         "> %s%s pos2 <x> <y> <z> - Установите вторую позицию на любые координаты".formatted(var2, var1),
         "> %s%s sel - Узнать координаты выделенной области".formatted(var2, var1)
      );
   }

   private static void id_extends() {
      id_private = new double[2];
   }

   @Override
   public String id_implements() {
      return "Команда для автоматической постройки фермы криперов";
   }

   private static void id_package() {
      id_catch = new float[]{2.0F};
   }

   public rU_2 id_protected() {
      this.id_native();
      return (rU_2)this.id_break[0];
   }

   private static void id_final() {
      id_throws = new String[]{
         new String("fb"),
         new String("farmbuilder"),
         new String("действие"),
         new String("Сначала установите pos1, прежде чем использовать pos2"),
         new String("Первая позиция была установлена, теперь установите вторую"),
         new String("Выделение добавлено"),
         new String("Выделение не установлено"),
         new String("Команда для автоматической постройки фермы криперов"),
         new String("> %s%s pos1 - Установите первую позицию к вашему текущему положению"),
         new String("> %s%s pos1 <x> <y> <z> - Установите первую позицию на любые координаты"),
         new String("> %s%s pos2 - Установите вторую позицию к вашему текущему положению"),
         new String("> %s%s pos2 <x> <y> <z> - Установите вторую позицию на любые координаты"),
         new String("> %s%s sel - Узнать координаты выделенной области")
      };
   }

   private static void id_volatile() {
      id_finally = new short[]{0, 0, 0, 1, 0, 1, 16, 57, 1, 0, 0, 0, 0, 0, 0, 0};
   }

   private void id_native() {
      if (this.id_break == null) {
         this.id_break = new Object[1];
         Object[] var1 = this.id_break;
      }
   }
}
