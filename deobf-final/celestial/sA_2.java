package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sA_2 extends C_try {
   private static String[] throws_;
   private static boolean[] case_;
   private static float[] catch_;
   private static double[] private_;
   public Object[] break_;
   private static byte[] implements_;
   private static short[] finally_;

   public sA_2(C_case var1) {
      super(var1, "fb", "farmbuilder");
      this.native_();
      Object var6 = null;
      this.break_[0] = var6;
      var1.s().class_(new sn_3(this, var1));
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8888089848345993213L;
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      this.native_();
      sl_3 var3 = sl_3.break_(var2.extends_());
      if (var3 == null) {
         throw new W(var2.private_(), "действие");
      } else {
         FarmBuilder var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().finally_();
         switch (((int[])sC_2.class_[0])[var3.ordinal()]) {
            case 1:
            case 2:
               if (var3 == (sl_3)sl_3.staticFields30c4eacb1e233b1abdfca916ea51d438[1] && (rU_2)this.break_[0] == null) {
                  throw new k_1("Сначала установите pos1, прежде чем использовать pos2");
               }

               rjU_2 var17 = ((Hh_1)((Ps_1)this.class_[1]).throws_().class_[16]).finally_().new_();
               rU_2 var16;
               if (var17 != null) {
                  var16 = new rU_2(var17.class_(0.0, (double)(((cb_3)b_.class_[57]).Bx() / 2.0F), 0.0));
               } else if (b_.catch_() != null) {
                  var16 = rU_2.class_(b_.catch_().Bs());
               } else {
                  var16 = ((Ps_1)this.class_[1]).volatile_();
               }

               rU_2 var18 = var2.final_() ? var2.break_((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[0], var16) : var16;
               var2.class_(0);
               if (var3 == (sl_3)sl_3.staticFields30c4eacb1e233b1abdfca916ea51d438[0]) {
                  this.break_[0] = var18;
                  this.case_("Первая позиция была установлена, теперь установите вторую");
               } else {
                  var4.class_(new bl_3((rU_2)this.break_[0], var18.class_()));
                  Object var15 = null;
                  this.break_[0] = var15;
                  this.case_("Выделение добавлено");
               }
               break;
            case 3:
               rY_2 var5 = var4.new_();
               if (var5 == null) {
                  this.case_("Выделение не установлено");
               } else {
                  rU_2 var6 = var5.byte_();
                  rU_2 var7 = var5.case_();
                  int var8 = Math.abs(var7.b_() - var6.b_()) + 1;
                  int var9 = Math.abs(var7.d_() - var6.d_()) + 1;
                  this.case_("Позиция 1: " + var6);
                  this.case_("Позиция 2: " + var7);
                  this.case_("Радиус выделения: " + var8 + "x" + var9);
               }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1626432210;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, -108, 25, -79, 53, 80, 62, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      return var2.case_() ? new v_1().break_(sl_3.class_()).class_(var2.extends_()).protected_() : Stream.empty();
   }

   private static void throws_() {
      case_ = new boolean[]{false, true, false, true, true, false, false, false, true, true, false, true, false, true, false, true, false, true, true};
   }

   private static void finally_() {
      implements_ = new byte[]{2, 5, 2, 2, 2, 2, 3, 2, 4, 2};
   }

   @Override
   public List<String> catch_() {
      String var1 = this.break_().get(0);
      String var2 = (String)C_class.instanceof_().protected_.class_[0];
      return Arrays.asList(
         "> %s%s pos1 - Установите первую позицию к вашему текущему положению".formatted(var2, var1),
         "> %s%s pos1 <x> <y> <z> - Установите первую позицию на любые координаты".formatted(var2, var1),
         "> %s%s pos2 - Установите вторую позицию к вашему текущему положению".formatted(var2, var1),
         "> %s%s pos2 <x> <y> <z> - Установите вторую позицию на любые координаты".formatted(var2, var1),
         "> %s%s sel - Узнать координаты выделенной области".formatted(var2, var1)
      );
   }

   private static void extends_() {
      private_ = new double[2];
   }

   @Override
   public String implements_() {
      return "Команда для автоматической постройки фермы криперов";
   }

   private static void package_() {
      catch_ = new float[]{2.0F};
   }

   public rU_2 protected_() {
      this.native_();
      return (rU_2)this.break_[0];
   }

   private static void final_() {
      throws_ = new String[]{
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

   private static void volatile_() {
      finally_ = new short[]{0, 0, 0, 1, 0, 1, 16, 57, 1, 0, 0, 0, 0, 0, 0, 0};
   }

   private void native_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }
}
