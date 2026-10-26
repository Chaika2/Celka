package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrZa_1 extends GuiComponent {
   private static short[] break_;
   private static String[] byte_;
   public Object[] class_;
   private static float[] protected_;
   private static boolean[] throws_;
   private static byte[] case_;
   private static int[] catch_;

   private static void boolean_() {
      break_ = new short[]{
         4,
         5,
         6,
         3,
         2,
         0,
         1,
         9,
         10,
         6,
         1,
         7,
         4,
         0,
         0,
         2,
         7,
         0,
         3,
         5,
         4,
         2,
         2,
         2,
         7,
         4,
         4,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         7,
         8,
         0,
         0,
         1500,
         7,
         2,
         2,
         2,
         2,
         0,
         1500,
         3,
         3,
         4,
         4,
         3,
         5,
         5,
         5,
         0,
         6,
         2,
         0,
         1,
         11,
         9,
         10,
         11,
         5,
         6,
         6,
         6,
         5,
         3,
         3,
         270,
         180,
         0,
         2,
         0,
         2,
         5,
         6,
         8
      };
   }

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, -126, -82, 82, -59, -51, 11, -126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean int_() {
      this.new_();
      return ((AnimValue)this.class_[6]).catch_();
   }

   private float long_() {
      this.new_();
      return ((AnimValue)this.class_[5]).byte_() * ((rrZw_1)this.class_[3]).implements_().class_().byte_();
   }

   public rrZa_1(rrZw_1 var1, rrIX var2, Supplier<Float> var3, Supplier<Float> var4, float var5, float var6) {
      this.new_();
      rruL var11 = new rruL();
      this.class_[4] = var11;
      AnimValue var12 = new AnimValue(0.45F, false);
      this.class_[5] = var12;
      AnimValue var13 = new AnimValue(0.45F, false);
      this.class_[6] = var13;
      this.class_[3] = var1;
      this.class_[2] = var2;
      this.class_[0] = var3;
      this.class_[1] = var4;
      Float var18 = var5;
      this.class_[9] = var18;
      Float var19 = var6;
      this.class_[10] = var19;
      rrtY_2 var20 = new rrtY_2(
            new rrIv_1(var2.class_(), rrte_3.class_((Pattern)rrtR_2.class_[6])).class_(var2.class_()),
            (rrtK_2)rrtK_2.staticFieldsc4d05dcb6ab834399a1b48042de01686[1]
         )
         .class_(var1x -> this.an_())
         .class_(() -> var5 / 1.7F)
         .break_(this::long_)
         .break_(var2x -> {
            this.new_();
            String var7 = var2.class_();
            this.class_[8] = var7;
         });
      this.class_[7] = var20;
      this.throw_();
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.new_();
      super.class_(var1, var2, var3, var4, var5, var6, var7);
      if (this.int_()) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).catch_().break_((rrIX)this.class_[2], true);
         ((rrtY_2)this.class_[7]).throws_();
      } else {
         rrZO var8 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
         float var9 = var5.break_();
         float var10 = var5.protected_();
         int var11 = (int)var5.byte_();
         int var12 = (int)var5.class_();
         float var13 = ((rrZw_1)this.class_[3]).implements_().class_().byte_();
         int var14 = (int)(255.0F * ((AnimValue)this.class_[5]).byte_() * var13);
         int var15 = ColorHelper.break_((Integer)rrZI.break_[4], var14);
         rrfD_2.class_(var1, var9, var10, (float)var11, (float)var12, 8.0F, 8.0F, 8.0F, 8.0F, rrZF.n_);
         rrfD_2.break_(var1, var9, var10, (float)var11, (float)var12, 4.0F, var15, var15, var15, var15);
         String var16 = ((rrIX)this.class_[2]).class_();
         String var17 = ((rrIX)this.class_[2]).protected_();
         String var18 = ((rrIX)this.class_[2]).break_();
         String var19 = "Создан:";
         String var20 = "Автор:";
         float var21 = var8.break_(var19);
         float var22 = var8.break_(var18) + 10.0F;
         float var23 = var8.break_(var20);
         ((rrtY_2)this.class_[7]).class_(var1, var2, var9 + 5.0F, var10 + 6.0F, var8.break_(var16) + 5.0F, 4.0F, var3, var4, var6);
         int var24 = ColorHelper.break_(6781311, var14);
         var8.break_(var1, var19, (double)(var9 + 5.0F), (double)(var10 + 16.0F), var24, false, false);
         var8.class_(var1, var18, (double)(var9 + var21 + 7.0F), (double)(var10 + 16.0F), 15, var14, false);
         var8.break_(var1, var20, (double)(var9 + var21 + var22), (double)(var10 + 16.0F), var24, false, false);
         var8.class_(var1, var17, (double)(var9 + var21 + var22 + var23 + 2.0F), (double)(var10 + 16.0F), 15, var14, false);
         ((rruL)this.class_[4]).class_(var1, var2, var3, var4, var6, var7);
      }
   }

   @Override
   public rrZN class_() {
      this.new_();
      return (rrZw_1)this.class_[3];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 822288335582151767L;
   }

   @Override
   public boolean class_(char var1, int var2) {
      this.new_();
      return ((rrtY_2)this.class_[7]).class_(var1, var2);
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      this.abstract_();
      return super.class_(var1, var2, var3, var4, var6, var7);
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.new_();
      if (this.protected_().break_((float)var2, (float)var3)) {
         boolean var6 = ((rruL)this.class_[4]).class_(var1, var2, var3, var4, var5);
         boolean var7 = !((rrtY_2)this.class_[7]).class_(var1, var2, var3, var4, var5) && !var6 ? throws_[12] : throws_[11];
         if (var4 == 0 && var7) {
            return true;
         }
      }

      this.an_();
      return false;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1980855924;
   }

   public String class_(String var1) {
      if (var1.isEmpty()) {
         return "Имя конфига не может быть пустым";
      } else {
         return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).catch_().byte_(var1) ? "Такой конфиг уже существует" : null;
      }
   }

   @Override
   public void class_(Category var1, Category var2) {
      this.new_();
      super.class_(var1, var2);
      if (var2 == (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[5]) {
         ((AnimValue)this.class_[5]).extends_();
      }
   }

   public void class_(float var1) {
      this.new_();
      Float var6 = var1;
      this.class_[11] = var6;
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.new_();
      return ((rrtY_2)this.class_[7]).class_(var1, var2, var3);
   }

   public float break_() {
      this.new_();
      return (Float)((Supplier)this.class_[1]).get() + (Float)this.class_[11];
   }

   @Override
   public void break_(int var1, int var2, int var3) {
      this.new_();
      super.break_(var1, var2, var3);
      ((rrtY_2)this.class_[7]).byte_(var1, var2, var3);
   }

   public float catch_() {
      this.new_();
      return (Float)this.class_[10];
   }

   public rrIX extends_() {
      this.new_();
      return (rrIX)this.class_[2];
   }

   public float case_() {
      this.new_();
      return (Float)((Supplier)this.class_[0]).get();
   }

   private static void import_() {
      case_ = new byte[]{3, 2, 15, 15, 100, 90, 12, 9, 10, 11};
   }

   private void new_() {
      if (this.class_ == null) {
         this.class_ = new Object[12];
         Object[] var1 = this.class_;
         var1[9] = 0.0F;
         var1[10] = 0.0F;
         var1[11] = 0.0F;
      }
   }

   public AnimValue package_() {
      this.new_();
      return (AnimValue)this.class_[5];
   }

   private static void super_() {
      throws_ = new boolean[]{
         false, false, false, true, true, false, false, false, false, false, false, true, false, true, false, true, false, true, false, false
      };
   }

   private static void switch_() {
      protected_ = new float[]{
         0.45F,
         0.45F,
         0.2F,
         0.2F,
         0.2F,
         255.0F,
         8.0F,
         8.0F,
         8.0F,
         8.0F,
         4.0F,
         10.0F,
         5.0F,
         6.0F,
         5.0F,
         4.0F,
         5.0F,
         16.0F,
         7.0F,
         16.0F,
         16.0F,
         2.0F,
         16.0F,
         8.0F,
         0.0F,
         16.5F,
         4.5F,
         40.5F,
         12.0F,
         46.0F,
         7.0F,
         8.0F,
         8.0F,
         4.0F,
         2.0F,
         10.0F,
         10.0F,
         60.0F,
         8.0F,
         10.0F,
         10.0F,
         74.0F,
         8.0F,
         1.7F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   private void throw_() {
      this.new_();
      Runnable var1 = () -> {
         this.new_();
         ((AnimValue)this.class_[5]).class_(false);
         ((AnimValue)this.class_[6]).class_(false);
      };
      Runnable var2 = () -> {
         this.new_();
         this.abstract_();
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).catch_().class_((rrIX)this.class_[2], true);
      };
      Runnable var3 = () -> {
         this.new_();
         this.abstract_();
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).catch_().byte_((rrIX)this.class_[2], false);
      };
      Supplier var4 = () -> {
         this.new_();
         int var1x = ((rrZw_1)this.class_[3]).extends_().indexOf(this) * 100;
         return new rji_3(
            (float)ColorHelper.class_((float)var1x),
            (float)ColorHelper.class_((float)(var1x + 90)),
            (float)ColorHelper.class_((float)(var1x + 270)),
            (float)ColorHelper.class_((float)(var1x + 180))
         );
      };
      ((rruL)this.class_[4])
         .class_(
            new rruF(new rrun_1(() -> rrZL.m_, () -> {
               rruv_1 var1x = this.protected_();
               return new rjK_2(var1x.break_() + this.native_() - 74.0F, var1x.protected_() + 8.0F);
            }, () -> new rjK_2(10.0F, 10.0F), () -> rrZF.d_).<rrun_1>class_(this::long_).class_(0.2F)).class_(var1),
            new rruF(new rrun_1(() -> rrZL.private_, () -> {
               rruv_1 var1x = this.protected_();
               return new rjK_2(var1x.break_() + this.native_() - 60.0F, var1x.protected_() + 8.0F);
            }, () -> new rjK_2(10.0F, 10.0F), () -> rrZF.d_).<rrun_1>class_(this::long_).class_(0.2F)).class_(var3),
            new rruF(
                  new rruH(
                        () -> rrZL.extends_,
                        () -> new rjK_2(4.0F, 2.0F),
                        () -> new rjK_2(8.0F, 8.0F),
                        () -> rrZF.d_,
                        ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_(),
                        () -> "Load",
                        () -> {
                           rruv_1 var1x = this.protected_();
                           return new rjK_2(var1x.break_() + this.native_() - 46.0F, var1x.protected_() + 7.0F);
                        },
                        () -> new rjK_2(40.5F, 12.0F),
                        () -> new rjK_2(16.5F, 4.5F),
                        () -> rrZF.d_,
                        var4
                     )
                     .<rrup_1>break_(ClickGuiTheme::class_)
                     .<rrup_1>class_(this::long_)
                     .class_(0.2F)
               )
               .class_(var2)
         );
   }

   private static void try_() {
      catch_ = new int[]{6781311};
   }

   @Override
   public rruv_1 protected_() {
      this.new_();
      float var1 = this.native_();
      Pair var2 = ((rrZw_1)this.class_[3]).implements_().class_(((rrZw_1)this.class_[3]).case_());
      float var3 = 8.0F * (Float)var2.getLeft();
      if ((Boolean)var2.getRight()) {
         var1 -= var3;
         ((rruL)this.class_[4]).break_(-var3);
      } else {
         ((rruL)this.class_[4]).break_(0.0F);
      }

      return new rruv_1(this.case_(), this.break_(), var1, this.catch_());
   }

   public void private_() {
      this.new_();
      ((AnimValue)this.class_[6]).class_(true);
      ((AnimValue)this.class_[6]).class_();
   }

   private void abstract_() {
      this.new_();
      if (((rrtY_2)this.class_[7]).aO_()) {
         ((rrtY_2)this.class_[7]).throws_();
         String var1 = ((rrtY_2)this.class_[7]).final_();
         if (!((String)this.class_[8]).equals(var1)) {
            Map var2 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).catch_().throws_();
            String var3 = this.class_(var1);
            if (var3 != null) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3("Configs", var3, 1500));
               ((rrtY_2)this.class_[7]).byte_(((rrIX)this.class_[2]).class_());
            } else {
               var2.remove(((rrIX)this.class_[2]).class_());
               ((rrIX)this.class_[2]).protected_(var1);
               var2.put(var1, (rrIX)this.class_[2]);
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Configs", "Имя конфига успешно изменено", 1500));
            }
         }
      }
   }

   public AnimValue volatile_() {
      this.new_();
      return (AnimValue)this.class_[6];
   }

   private static void synchronized_() {
      byte_ = new String[]{
         new String("Создан:"),
         new String("Автор:"),
         new String("Configs"),
         new String("Configs"),
         new String("Имя конфига успешно изменено"),
         new String("Имя конфига не может быть пустым"),
         new String("Такой конфиг уже существует"),
         new String("Load")
      };
   }

   public float native_() {
      this.new_();
      return (Float)this.class_[9];
   }

   @Override
   public void am_() {
      this.new_();
      super.am_();
      ((AnimValue)this.class_[5]).extends_();
   }

   @Override
   public void an_() {
      super.an_();
      this.abstract_();
   }

   @Override
   public void al_() {
      this.new_();
      super.al_();
      ((rrtY_2)this.class_[7]).protected_();
   }
}
