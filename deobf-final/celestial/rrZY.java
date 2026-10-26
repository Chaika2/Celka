package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrZY extends GuiComponent {
   public Object[] class_;
   public static Object[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   private static String[] throws_;
   private static int[] case_;
   private static short[] catch_;
   private static float[] private_;

   private float char_() {
      this.try_();
      return ((AnimValue)this.class_[6]).byte_() * ((rrZK)this.class_[1]).implements_().class_().byte_();
   }

   @Override
   public rdn_3 byte_() {
      this.try_();
      return (rdn_3)this.class_[14];
   }

   private void int_() {
      this.try_();
      if (((rrtY_2)this.class_[2]).aO_()) {
         ((rrtY_2)this.class_[2]).throws_();
         String var1 = ((rrtY_2)this.class_[2]).final_();
         if (var1.isEmpty()) {
            ((rrtY_2)this.class_[2]).byte_(String.valueOf(((rrNd_1)this.class_[3]).else_()));
         } else if (!((String)this.class_[13]).equals(var1)) {
            try {
               int var2 = Integer.parseInt(var1);
               ((rrNd_1)this.class_[catch_[51]]).break_(var2);
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[catch_[52]]).class_(new rrtQ_2(throws_[1], throws_[2], catch_[53]));
            } catch (NumberFormatException var4) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtQ_2("Auto Buy", "Слишком большая цена", 1500));
            }
         }
      }
   }

   public rrZY(rrZK var1, rrNd_1 var2, rrtu_3 var3, ClickGuiScreen var4, Supplier<Float> var5, Supplier<Float> var6, float var7, float var8) {
      this.try_();
      rruL var13 = new rruL();
      this.class_[0] = var13;
      AnimValue var14 = new AnimValue(0.5F, true);
      this.class_[6] = var14;
      this.class_[1] = var1;
      this.class_[7] = var5;
      this.class_[8] = var6;
      Float var18 = var7;
      this.class_[11] = var18;
      Float var19 = var8;
      this.class_[12] = var19;
      this.class_[3] = var2;
      rrvM var21 = new rrvM(this, this::extends_, this::case_);
      this.class_[4] = var21;
      rrtY_2 var22 = new rrtY_2(
            new rrIv_1(String.valueOf(var2.else_()), (rrte_3)break_[0]).class_(String.valueOf(var2.else_())),
            (rrtK_2)rrtK_2.staticFieldsc4d05dcb6ab834399a1b48042de01686[1]
         )
         .class_(var1x -> this.an_())
         .class_(() -> var7 / 1.7F)
         .break_(this::char_)
         .class_(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_())
         .class_(var0 -> "$" + rql_3.class_(var0, ' '))
         .break_(var2x -> {
            this.try_();
            String var7x = String.valueOf(var2.else_());
            this.class_[13] = var7x;
         });
      this.class_[2] = var22;
      this.class_(var3, var4);
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean class_(char var1, int var2) {
      this.try_();
      return ((rrtY_2)this.class_[2]).class_(var1, var2);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8823764644957395917L;
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      this.int_();
      return super.class_(var1, var2, var3, var4, var6, var7);
   }

   @Override
   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      this.try_();
      this.an_();
      if (this.protected_().break_((float)var2, (float)var3)) {
         boolean var6 = ((rruL)this.class_[0]).class_(var1, var2, var3, var4, var5);
         boolean var7 = !((rrtY_2)this.class_[2]).class_(var1, var2, var3, var4, var5) && !var6 ? protected_[10] : protected_[9];
         if (var4 == 0 && var7) {
            return true;
         }
      }

      return protected_[12];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-39, 33, 47, -15, 90, 91, 113, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      this.try_();
      return ((rrtY_2)this.class_[2]).class_(var1, var2, var3);
   }

   public void class_(boolean var1) {
      this.try_();
      Boolean var6 = var1;
      this.class_[5] = var6;
   }

   public void class_(float var1) {
      this.try_();
      Float var6 = var1;
      this.class_[9] = var6;
   }

   @Override
   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.try_();
      super.class_(var1, var2, var3, var4, var5, var6, var7);
      rrZO var8 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_();
      rrZO var9 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).class_();
      float var10 = var5.break_();
      float var11 = var5.protected_();
      int var12 = (int)var5.byte_();
      int var13 = (int)var5.class_();
      float var14 = ((rrZK)this.class_[1]).implements_().class_().byte_();
      int var15 = (int)(255.0F * ((AnimValue)this.class_[6]).byte_() * var14);
      int var16 = ColorHelper.break_((Integer)rrZI.break_[4], var15);
      int var17 = ColorHelper.break_(rrZF.d_, var15);
      int var18 = ColorHelper.break_(6781311, var15);
      rrfD_2.break_(var1, var10, var11, (float)var12, (float)var13, 4.0F, var16, var16, var16, var16);
      String var19 = ((rrNd_1)this.class_[3]).case_();
      String var20 = String.valueOf(((rrNd_1)this.class_[3]).else_());
      String var21 = "Цена за штуку:";
      float var22 = var9.break_(var21);
      rdn_3 var23 = ((rrNd_1)this.class_[3]).package_() == null ? ((rrNd_1)this.class_[3]).catch_().continue_() : ((rrNd_1)this.class_[3]).package_();
      short_.class_(var1, var23, var10 + 3.0F, var11 + 5.0F, this.char_());
      var8.protected_(var1, var19, var10 + 22.0F, var11 + 7.0F, var17, false);
      var9.protected_(var1, var21, var10 + 22.0F, var11 + 16.0F, var18, false);
      ((rrtY_2)this.class_[2]).class_(var1, var2, var10 + var22 + 24.0F, var11 + 16.0F, var9.break_(var20) + 8.0F, 4.0F, var3, var4, var6);
      ((rruL)this.class_[0]).class_(var1, var2, var3, var4, var6, var7);
      if (this.volatile_()) {
         float var25 = var11 - 11.5F;
         String var26 = ((rrNd_1)this.class_[3]).continue_().class_();
         float var27 = var8.break_(var26);
         rrtF_2.class_(var1, var10, var25, (float)var12, 0.5F, (Integer)rrZI.break_[4], var15);
         rrtF_2.class_(var1, var10 + 12.0F, var25 - 2.0F, var27 + 6.0F, (float)var8.class_(), rrZF.n_, var15);
         var8.class_(var1, var26, (double)(var10 + 15.0F), (double)(var25 - 1.5F), 15, var15, false);
      }
   }

   public void class_(rrtu_3 var1, ClickGuiScreen var2) {
      this.try_();
      Runnable var3 = () -> {
         this.try_();
         ((rrNd_1)this.class_[3]).break_(!((rrNd_1)this.class_[3]).while_() ? true : protected_[14]);
      };
      ((rruL)this.class_[0]).class_(new rruF(new rruA(() -> {
         this.try_();
         return ((rrNd_1)this.class_[3]).while_();
      }, () -> {
         rruv_1 var1x = this.protected_();
         return new rjK_2(var1x.break_() + this.catch_() - 23.0F, var1x.protected_() + 9.0F);
      }, () -> new rjK_2(17.0F, 8.0F)).class_(this::char_)).class_(var3));
      float var4 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[0]).finally_().break_(((rrNd_1)this.class_[3]).case_());
      Runnable var5 = () -> {
         this.try_();
         float var3x = rfU_2.class_((float)var2.abstract_() - ((rrvM)this.class_[4]).implements_() - 10.0F, 5.0F, const_.volatile_() - 5.0F);
         float var4x = rfU_2.class_((float)var2.finally_(), 5.0F, (float)const_.native_() - ((rrvM)this.class_[4]).double_() - 5.0F);
         var1.class_(((rrvM)this.class_[4]).class_(var3x, var4x), () -> {
            this.try_();
            ((rrvM)this.class_[4]).class_(var1);
         });
      };
      ((rruL)this.class_[0])
         .class_(
            new rruF(
                  new rrun_1(() -> rrZL.int_, () -> new rjK_2(this.extends_() + var4 + 23.5F, this.case_() + 5.5F), () -> new rjK_2(6.0F, 6.0F), () -> rrZF.d_)
                     .<rrun_1>class_(this::char_)
                     .class_(0.2F)
               )
               .class_(() -> {
                  this.try_();
                  return ((rrvM)this.class_[4]).static_();
               })
               .class_(var5)
               .class_(false)
         );
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -768797885;
   }

   @Override
   public rrZN class_() {
      this.try_();
      return (rrZK)this.class_[1];
   }

   public rrNd_1 break_() {
      this.try_();
      return (rrNd_1)this.class_[3];
   }

   public void break_(float var1) {
      this.try_();
      Float var6 = var1;
      this.class_[10] = var6;
   }

   @Override
   public void break_(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
      this.try_();
      super.break_(var1, var2, var3, var4, var5, var6, var7);
      if (var5.break_((float)var3, (float)var4) && ((rrZK)this.class_[1]).class_(var3, var4) && !rrtu_3.class_(var2, var3, var4)) {
         rdn_3 var12 = ((rrNd_1)this.class_[3]).package_() == null ? ((rrNd_1)this.class_[3]).catch_().continue_() : ((rrNd_1)this.class_[3]).package_();
         this.class_[14] = var12;
      } else {
         Object var13 = null;
         this.class_[14] = var13;
      }
   }

   @Override
   public void break_(int var1, int var2, int var3) {
      this.try_();
      super.break_(var1, var2, var3);
      ((rrtY_2)this.class_[2]).byte_(var1, var2, var3);
   }

   public float catch_() {
      this.try_();
      return (Float)this.class_[11];
   }

   public float extends_() {
      this.try_();
      return (Float)((Supplier)this.class_[7]).get() + (Float)this.class_[9];
   }

   public float case_() {
      this.try_();
      return (Float)((Supplier)this.class_[8]).get() + (Float)this.class_[10];
   }

   private static void continue_() {
      Object[] var0 = new Object[]{rrte_3.class_(Pattern.compile("[0-9]+", 0))};
      break_ = var0;
   }

   private static void instanceof_() {
      private_ = new float[]{
         0.5F,
         0.2F,
         255.0F,
         4.0F,
         3.0F,
         5.0F,
         22.0F,
         7.0F,
         22.0F,
         16.0F,
         24.0F,
         16.0F,
         8.0F,
         4.0F,
         11.5F,
         0.5F,
         12.0F,
         2.0F,
         6.0F,
         15.0F,
         1.5F,
         8.0F,
         0.0F,
         6.0F,
         6.0F,
         23.5F,
         5.5F,
         10.0F,
         5.0F,
         5.0F,
         5.0F,
         5.0F,
         17.0F,
         8.0F,
         23.0F,
         9.0F,
         1.7F,
         0.0F,
         0.0F,
         0.0F,
         0.0F
      };
   }

   private static void return_() {
      byte_ = new byte[]{15, 32, 15, 5, 9, 10, 11, 12};
   }

   private static void super_() {
      case_ = new int[]{6781311};
   }

   private void try_() {
      if (this.class_ == null) {
         this.class_ = new Object[15];
         Object[] var1 = this.class_;
         var1[5] = false;
         var1[9] = 0.0F;
         var1[10] = 0.0F;
         var1[11] = 0.0F;
         var1[12] = 0.0F;
      }
   }

   private static void while_() {
      catch_ = new short[]{
         0,
         6,
         1,
         7,
         8,
         11,
         12,
         3,
         4,
         0,
         1,
         0,
         2,
         0,
         0,
         3,
         0,
         0,
         0,
         1,
         6,
         4,
         3,
         3,
         3,
         3,
         3,
         2,
         0,
         3,
         4,
         1,
         3,
         3,
         3,
         14,
         14,
         0,
         2,
         2,
         2,
         2,
         2,
         2,
         3,
         2,
         2,
         2,
         2,
         3,
         13,
         3,
         0,
         1500,
         0,
         1500,
         1,
         14,
         1,
         1,
         0,
         0,
         7,
         9,
         8,
         10,
         11,
         12,
         9,
         10,
         6,
         6,
         1,
         3,
         5,
         5,
         4,
         4,
         4,
         4,
         4,
         3,
         3,
         3,
         13
      };
   }

   private static void public_() {
      throws_ = new String[]{
         new String("Цена за штуку:"),
         new String("Auto Buy"),
         new String("Цена предмета успешна изменена"),
         new String("Auto Buy"),
         new String("Слишком большая цена")
      };
   }

   @Override
   public rruv_1 protected_() {
      this.try_();
      float var1 = this.catch_();
      Pair var2 = ((rrZK)this.class_[1]).implements_().class_(((rrZK)this.class_[1]).case_());
      float var3 = 8.0F * (Float)var2.getLeft();
      if ((Boolean)var2.getRight()) {
         var1 -= var3;
         ((rruL)this.class_[0]).break_(-var3);
      } else {
         ((rruL)this.class_[0]).break_(0.0F);
      }

      return new rruv_1(this.extends_(), this.case_(), var1, this.native_());
   }

   public AnimValue private_() {
      this.try_();
      return (AnimValue)this.class_[6];
   }

   private static void abstract_() {
      protected_ = new boolean[]{
         true, true, false, true, false, false, false, false, false, true, false, true, false, true, false, true, true, false, false, false, true
      };
   }

   public boolean volatile_() {
      this.try_();
      return (Boolean)this.class_[5];
   }

   public float native_() {
      this.try_();
      return (Float)this.class_[12];
   }

   @Override
   public void am_() {
      this.try_();
      super.am_();
      ((rrtY_2)this.class_[2]).byte_(String.valueOf(((rrNd_1)this.class_[3]).else_()));
   }

   @Override
   public void an_() {
      super.an_();
      this.int_();
   }

   @Override
   public void al_() {
      this.try_();
      super.al_();
      ((rrtY_2)this.class_[2]).protected_();
   }
}
