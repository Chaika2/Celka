package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sx_3 extends C_try {
   public Object[] break_;
   private static double[] throws_;
   private static String[] case_;
   private static float[] catch_;
   private static short[] private_;
   private static byte[] implements_;
   private static boolean[] finally_;

   public sx_3(C_case var1) {
      super(var1, "cf", "creeperfarm");
      this.extends_();
      Object var6 = null;
      this.break_[0] = var6;
      var1.s().class_(new sd_3(this));
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(String var1, C_static var2) throws x_1 {
      this.extends_();
      sW_2 var3 = sW_2.break_(var2.extends_());
      if (var3 == null) {
         throw new W(var2.private_(), "действие");
      } else {
         CreeperFarm var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().i();
         switch (((int[])sk_3.class_[0])[var3.ordinal()]) {
            case 1:
            case 2:
               if (var3 == (sW_2)sW_2.staticFields6b259e9d4f13397ca074ec4185749984[1] && (rU_2)this.break_[0] == null) {
                  throw new k_1("Сначала установите pos1, прежде чем использовать pos2");
               }

               rjU_2 var20 = ((Hh_1)((Ps_1)this.class_[1]).throws_().class_[16]).finally_().new_();
               rU_2 var18;
               if (var20 != null) {
                  var18 = new rU_2(var20.class_(0.0, (double)(((cb_3)b_.class_[57]).Bx() / 2.0F), 0.0));
               } else if (b_.catch_() != null) {
                  var18 = rU_2.class_(b_.catch_().Bs());
               } else {
                  var18 = ((Ps_1)this.class_[1]).volatile_();
               }

               rU_2 var21 = var2.final_() ? var2.break_((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[0], var18) : var18;
               var2.class_(0);
               if (var3 == (sW_2)sW_2.staticFields6b259e9d4f13397ca074ec4185749984[0]) {
                  this.break_[0] = var21;
                  this.case_("Первая позиция была установлена, теперь установите вторую");
               } else {
                  bl_3 var22 = new bl_3((rU_2)this.break_[0], var21);
                  var4.class_(var22);
                  var4.continue_().add(var22);
                  Object var15 = null;
                  this.break_[0] = var15;
                  this.case_("Выделение добавлено");
               }
               break;
            case 3:
               rY_2 var17 = var4.new_();
               if (var17 == null) {
                  this.case_("Выделение не установлено");
               } else {
                  rU_2 var19 = var17.byte_();
                  rU_2 var7 = var17.case_();
                  int var8 = Math.abs(var7.b_() - var19.b_()) + 1;
                  int var9 = Math.abs(var7.d_() - var19.d_()) + 1;
                  this.case_("Позиция 1: " + var19);
                  this.case_("Позиция 2: " + var7);
                  this.case_("Радиус выделения: " + var8 + "x" + var9);
               }
               break;
            case 4:
               rY_2 var16 = var4.new_();
               if (var16 == null) {
                  this.case_("Выделение не установлено");
                  ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(var4.final_(), "Выделение не установлено", 2000));
                  return;
               }

               if (!var2.case_()) {
                  throw new W(var2.private_(), "имя");
               }

               String var6 = var2.extends_();
               if (rql_3.break_(var6)) {
                  throw new W(var2.private_(), "имя");
               }

               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).implements_().byte_(var6, true);
               break;
            case 5:
               if (!var2.case_()) {
                  throw new W(var2.private_(), "имя");
               }

               String var5 = var2.extends_();
               if (rql_3.break_(var5)) {
                  throw new W(var2.private_(), "имя");
               }

               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).implements_().break_(var5, true);
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2604597959512999945L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -312298097;
   }

   @Override
   public Stream<String> break_(String var1, C_static var2) throws x_1 {
      if (var2.case_()) {
         return new v_1().break_(sW_2.class_()).class_(var2.extends_()).protected_();
      } else {
         sW_2 var3 = sW_2.break_(var2.extends_());
         if (var3 != null) {
            if (var3 != (sW_2)sW_2.staticFields6b259e9d4f13397ca074ec4185749984[0] && var3 != (sW_2)sW_2.staticFields6b259e9d4f13397ca074ec4185749984[1]) {
               if (var3 == (sW_2)sW_2.staticFields6b259e9d4f13397ca074ec4185749984[3] || var3 == (sW_2)sW_2.staticFields6b259e9d4f13397ca074ec4185749984[4]) {
                  rrwY_2 var4 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).implements_();
                  var4.byte_(true);
                  Stream var5 = var4.break_().stream().map(var0 -> var0.break_());
                  return new v_1().break_(var5).class_(var2.extends_()).break_().protected_();
               }
            } else if (var2.catch_(3)) {
               return var2.class_((S)S.staticFields2b61d3be194f3208a61ab56674f124f7[0]);
            }
         }

         return Stream.empty();
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{113, 89, -126, -93, -14, 70, 33, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      implements_ = new byte[]{2, 3, 9, 2, 2, 2, 2, 3, 2, 4, 2, 5, 2, 6, 2, 7, 8, 2};
   }

   private static void finally_() {
      finally_ = new boolean[]{
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         false,
         true,
         true
      };
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
         "> %s%s sel - Узнать координаты выделенной области".formatted(var2, var1),
         "> %s%s save <name> - Сохранить конфиг с выделением".formatted(var2, var1),
         "> %s%s remove <name> - Удалить конфиг".formatted(var2, var1),
         "",
         "Пример: %s%s pos1 100 65 100".formatted(var2, var1)
      );
   }

   private void extends_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   @Override
   public String implements_() {
      return "Команда для управление модулем \"CreeperFarm\"";
   }

   private static void package_() {
      catch_ = new float[]{2.0F};
   }

   public rU_2 protected_() {
      this.extends_();
      return (rU_2)this.break_[0];
   }

   private static void final_() {
      case_ = new String[]{
         new String("cf"),
         new String("creeperfarm"),
         new String("действие"),
         new String("Сначала установите pos1, прежде чем использовать pos2"),
         new String("Первая позиция была установлена, теперь установите вторую"),
         new String("Выделение добавлено"),
         new String("Выделение не установлено"),
         new String("Выделение не установлено"),
         new String("Выделение не установлено"),
         new String("имя"),
         new String("имя"),
         new String("имя"),
         new String("имя"),
         new String("Команда для управление модулем \"CreeperFarm\""),
         new String("> %s%s pos1 - Установите первую позицию к вашему текущему положению"),
         new String("> %s%s pos1 <x> <y> <z> - Установите первую позицию на любые координаты"),
         new String("> %s%s pos2 - Установите вторую позицию к вашему текущему положению"),
         new String("> %s%s pos2 <x> <y> <z> - Установите вторую позицию на любые координаты"),
         new String("> %s%s sel - Узнать координаты выделенной области"),
         new String("> %s%s save <name> - Сохранить конфиг с выделением"),
         new String("> %s%s remove <name> - Удалить конфиг"),
         new String(""),
         new String("Пример: %s%s pos1 100 65 100")
      };
   }

   private static void volatile_() {
      private_ = new short[]{0, 0, 0, 1, 0, 1, 16, 57, 1, 0, 0, 0, 0, 0, 0, 2000, 0, 0, 0, 1, 0, 3, 4, 0, 0, 0};
   }

   private static void native_() {
      throws_ = new double[2];
   }
}
