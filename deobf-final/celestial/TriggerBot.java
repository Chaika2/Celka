package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class TriggerBot extends Module implements rrnL_2 {
   private static float[] protected_;
   private static byte[] throws_;
   private static boolean[] catch_;
   public static Object[] break_;
   private static short[] private_;
   private static long[] implements_;
   public Object[] byte_;
   private static String[] finally_;
   private static double[] extends_;

   private void char_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[18];
         this.byte_[9] = 0L;
         this.byte_[10] = false;
         this.byte_[11] = 0L;
         this.byte_[12] = 0;
         this.byte_[13] = 0;
         this.byte_[14] = 0;
         this.byte_[15] = 0;
         this.byte_[16] = false;
         this.byte_[17] = 0.0F;
      }
   }

   private void byte_(iB_2 var1) {
      this.char_();
      if (var1 != null) {
         this.byte_[8] = var1;
         Long var7 = System.currentTimeMillis();
         this.byte_[9] = var7;
      }

      this.byte_[7] = var1;
   }

   private static void long_() {
      implements_ = new long[]{1000L, 0L, 0L};
   }

   private static void float_() {
      catch_ = new boolean[]{
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
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
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         false,
         true
      };
   }

   public TriggerBot() {
      super("Trigger Bot", "Автоматически бьет существо\nесли оно на прицеле", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.char_();
      CheckGroup var5 = new CheckGroup().catch_(true).case_(true).throws_(false).implements_(false).byte_(false).protected_(false).class_(true);
      this.byte_[0] = var5;
      rrIQ var6 = new rrIQ("Обход спринта", "Funtime", "Funtime", "Legit").class_("change_mode", (var1, var2) -> {
         this.char_();
         Integer var7x = 0;
         this.byte_[12] = var7x;
         Integer var8x = 0;
         this.byte_[14] = var8x;
         Integer var9x = 0;
         this.byte_[15] = var9x;
         Boolean var10x = false;
         this.byte_[16] = var10x;
         Float var11x = -1.0F;
         this.byte_[17] = var11x;
      });
      this.byte_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Только криты", true);
      this.byte_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Останавливать при\nиспользовании предмета", false);
      this.byte_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Останавливать при\nоткрытом контейнере", false);
      this.byte_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Только с пробелом", false).class_(() -> {
         this.char_();
         return ((rrIk_1)this.byte_[2]).class_();
      });
      this.byte_[5] = var10;
      rrIk_1 var11 = new rrIk_1("Таргет-HUD", true);
      this.byte_[6] = var11;
      Float var12 = -1.0F;
      this.byte_[17] = var12;
      this.class_(
         new Setting[]{
            new GroupSetting("Цели", new rrIc_1("Выбор", ((CheckGroup)this.byte_[0]).byte_())),
            new GroupSetting("Обходы", (rrIQ)this.byte_[1]),
            new GroupSetting("Визуалы", new rrIc_1("Отображать", (rrIk_1)this.byte_[6])),
            new GroupSetting("Удары", (rrIk_1)this.byte_[2], (rrIk_1)this.byte_[3], (rrIk_1)this.byte_[4]),
            new GroupSetting("Криты", (rrIk_1)this.byte_[5])
         }
      );
   }

   static {
      ntfClinit();
   }

   public Y this_() {
      return (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0];
   }

   private static void interface_() {
      finally_ = new String[]{
         new String("Trigger Bot"),
         new String("Автоматически бьет существо\nесли оно на прицеле"),
         new String("Обход спринта"),
         new String("Funtime"),
         new String("Funtime"),
         new String("Legit"),
         new String("change_mode"),
         new String("Только криты"),
         new String("Останавливать при\nиспользовании предмета"),
         new String("Останавливать при\nоткрытом контейнере"),
         new String("Только с пробелом"),
         new String("Таргет-HUD"),
         new String("Цели"),
         new String("Выбор"),
         new String("Обходы"),
         new String("Визуалы"),
         new String("Отображать"),
         new String("Удары"),
         new String("Криты"),
         new String("Legit"),
         new String("Legit"),
         new String("Legit")
      };
   }

   public boolean class_(an_3 var1) {
      this.char_();
      if (var1 == ((cb_3)import_.class_[57]).ra()) {
         return false;
      } else if (var1 == (cb_3)import_.class_[57]) {
         return false;
      } else if (var1 instanceof rSY) {
         return false;
      } else {
         return !var1.Pu() ? false : rrff_3.class_(var1, (CheckGroup)this.byte_[0]);
      }
   }

   public boolean class_(float var1, int var2, boolean var3, boolean var4, int var5) {
      this.char_();
      if (this.new_() == null) {
         return false;
      } else if (((rrIk_1)this.byte_[3]).class_() && ((cb_3)import_.class_[57]).sL()) {
         return false;
      } else if (!((rrIk_1)this.byte_[4]).class_() || (vm_3)import_.class_[73] == null && !C_throws.byte_().return_().class_()) {
         if (!this.class_(var1, var2)) {
            return false;
         } else {
            return ((rrIk_1)this.byte_[2]).class_() ? this.class_(var3, var4, var5) : catch_[56];
         }
      } else {
         return catch_[54];
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.char_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((Integer)this.byte_[13] > 0 && ((cb_3)import_.class_[57]).BL()) {
            Integer var9 = (Integer)this.byte_[13] - 1;
            this.byte_[13] = var9;
         }

         if ((Integer)this.byte_[12] > 0) {
            Integer var10 = (Integer)this.byte_[12] - 1;
            this.byte_[12] = var10;
         }

         this.byte_(null);
         if (((Ax_1)import_.class_[55]).finally_()) {
            return;
         }

         rjG_2 var3 = (rjG_2)import_.class_[64];
         if (var3 instanceof rfo_3 var2) {
            an_3 var11 = var2.class_();
            if (var11 instanceof iB_2 var4 && this.class_(var11)) {
               this.byte_(var4);
               this.class_((iB_2)this.byte_[7]);
               if (this.goto_()) {
                  this.break_(var4);
               }
            }
         }
      }

      this.break_(var1);
   }

   public void class_(iB_2 var1) {
      this.char_();
      if (var1 != null && rmD_2.break_ && ((rrIQ)this.byte_[1]).byte_().equals("Legit")) {
         if (this.throw_() && this.class_(2.0F, 50, false, false, 1)) {
            ((cb_3)import_.class_[57]).c_(false);
            Integer var6 = 1;
            this.byte_[12] = var6;
         }
      }
   }

   @EventTarget
   public void class_(rrAS var1) {
      this.char_();
      if ((Integer)this.byte_[13] > 0) {
         var1.class_(true);
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1807743029;
   }

   @EventTarget
   public void class_(rrAF var1) {
      this.char_();
      if ((Integer)this.byte_[12] > 0) {
         var1.class_(false);
      }
   }

   public boolean class_(boolean var1, boolean var2, int var3) {
      this.char_();
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().t().new_()) {
         return true;
      } else if (var1 && !this.throw_()) {
         return true;
      } else {
         if (var2) {
            double var4 = Math.abs((double)((int)((cb_3)import_.class_[57]).re()) - ((cb_3)import_.class_[57]).re());
            if (var4 == 0.43152384527073195) {
               Integer var12 = 2;
               this.byte_[13] = var12;
            } else if (var4 == 0.0548933470320776) {
               Integer var13 = 3;
               this.byte_[13] = var13;
            }
         }

         float var5;
         boolean var14;
         if (var3 > 0) {
            rrvy_1 var6 = new rrvy_1((cb_3)import_.class_[57]);
            var6.class_(var3);
            var14 = !var6.BL() && var6.throws_[31] > 0.0F ? true : catch_[63];
            var5 = (Float)var6.throws_[31];
         } else {
            var14 = !((cb_3)import_.class_[57]).BL() && ((cb_3)import_.class_[57]).throws_[31] > 0.0F ? true : catch_[65];
            var5 = (Float)((cb_3)import_.class_[57]).throws_[31];
         }

         if (((rrIQ)this.byte_[1]).byte_().equals("Legit") && (Boolean)this.byte_[16] && (Float)this.byte_[17] == var5) {
            rrvy_1 var15 = new rrvy_1((cb_3)import_.class_[57]);
            List var7 = var15.else_();
            if (var7.size() > 1) {
               return false;
            }
         }

         return var14;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2028490841078140124L;
   }

   public boolean class_(float var1, int var2) {
      this.char_();
      if (!rrfo_3.class_(var1)) {
         return false;
      } else {
         return (float)(System.currentTimeMillis() - this.byte_[11]) >= 500.0F - (float)var2 ? true : catch_[59];
      }
   }

   private static void void_() {
      extends_ = new double[]{0.43152384527073195, 0.0548933470320776, 0.0, 0.1, 0.0, 0.125, 0.1875};
   }

   public boolean break_(iB_2 var1) {
      this.char_();
      boolean var2 = ((rrIQ)this.byte_[1]).byte_().equals("Legit");
      if (this.throw_() && rmD_2.break_) {
         if (var2) {
            ((cb_3)import_.class_[57]).c_(false);
            if ((Integer)this.byte_[12] == 0) {
               Integer var7 = 1;
               this.byte_[12] = var7;
            }

            return catch_[36];
         }

         ((cb_3)import_.class_[57]).c_(false);
         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rmD_2((cb_3)import_.class_[57], rmU_2.STOP_SPRINTING));
         Boolean var8 = true;
         this.byte_[10] = var8;
      }

      ((Ax_1)import_.class_[55]).class_((cb_3)import_.class_[57], var1, true);
      if (var2) {
         int var10002 = (Integer)this.byte_[14] + 1;
         Integer var9 = var10002;
         this.byte_[14] = var9;
         if (var10002 >= 2) {
            Integer var10 = 0;
            this.byte_[14] = var10;
            Integer var11 = 1;
            this.byte_[12] = var11;
         }

         var10002 = (Integer)this.byte_[15] + 1;
         Integer var12 = var10002;
         this.byte_[15] = var12;
         if (var10002 >= 14) {
            Boolean var13 = true;
            this.byte_[16] = var13;
            Float var14 = (Float)((cb_3)import_.class_[57]).throws_[31];
            this.byte_[17] = var14;
         }

         if ((Integer)this.byte_[15] >= 15) {
            Integer var15 = 0;
            this.byte_[15] = var15;
            Boolean var16 = false;
            this.byte_[16] = var16;
            Float var17 = -1.0F;
            this.byte_[17] = var17;
         }
      }

      Long var18 = System.currentTimeMillis();
      this.byte_[11] = var18;
      return true;
   }

   public void break_(q_1 var1) {
      this.char_();
      if (var1.class_() == this.this_() && (Boolean)this.byte_[10]) {
         ((Aq_1)((cb_3)import_.class_[57]).break_[0]).class_(new rmD_2((cb_3)import_.class_[57], rmU_2.START_SPRINTING));
         ((cb_3)import_.class_[57]).c_(true);
         Boolean var6 = false;
         this.byte_[10] = var6;
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{5, 36, 86, -123, -26, 83, -110, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.char_();
      super.throws_(var1);
      this.byte_(null);
      Integer var6 = 0;
      this.byte_[13] = var6;
      Integer var7 = 0;
      this.byte_[12] = var7;
      Float var8 = -1.0F;
      this.byte_[17] = var8;
   }

   public boolean goto_() {
      return this.class_(0.5F, 0, true, true, 0);
   }

   public rrIk_1 continue_() {
      this.char_();
      return (rrIk_1)this.byte_[4];
   }

   public boolean else_() {
      if (this.while_().class_()) {
         return true;
      } else {
         return ((cb_3)import_.class_[57]).break_(rLD.private_) ? true : catch_[81];
      }
   }

   private static void import_() {
      private_ = new short[]{
         0,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         17,
         0,
         1,
         6,
         2,
         3,
         4,
         5,
         0,
         13,
         57,
         13,
         13,
         12,
         12,
         12,
         55,
         64,
         7,
         13,
         12,
         13,
         12,
         17,
         1,
         57,
         12,
         12,
         57,
         57,
         0,
         57,
         10,
         55,
         57,
         14,
         14,
         14,
         12,
         15,
         15,
         16,
         57,
         31,
         17,
         15,
         15,
         16,
         17,
         11,
         3,
         57,
         4,
         73,
         2,
         11,
         0,
         57,
         57,
         13,
         13,
         57,
         31,
         31,
         57,
         57,
         31,
         57,
         31,
         1,
         16,
         17,
         57,
         57,
         57,
         17,
         57,
         57,
         56,
         57,
         57,
         57,
         57,
         57,
         57,
         18,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         57,
         1,
         57,
         12,
         10,
         57,
         0,
         57,
         57,
         10,
         57,
         57,
         0,
         7,
         6,
         8,
         9,
         8,
         8,
         9,
         7,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         2,
         12,
         14,
         15,
         16,
         17
      };
   }

   private static void instanceof_() {
      protected_ = new float[]{-1.0F, -1.0F, -1.0F, 0.5F, 500.0F, 0.0F, 0.0F, 0.8F, 2.0F, -1.0F, 0.0F};
   }

   public iB_2 new_() {
      this.char_();
      return (iB_2)this.byte_[7];
   }

   public rrIk_1 return_() {
      this.char_();
      return (rrIk_1)this.byte_[3];
   }

   public rrIk_1 super_() {
      this.char_();
      return (rrIk_1)this.byte_[2];
   }

   private boolean throw_() {
      boolean var1 = ((cb_3)import_.class_[57]).BL();
      if (this.else_() && !((rqr_3)((cb_3)import_.class_[57]).break_[17]).private_ && var1) {
         return false;
      } else {
         float var2 = protected_[7];
         boolean var3 = ((cb_3)import_.class_[57]).PZ() && !((cb_3)import_.class_[57]).catch_(var2) ? true : catch_[70];
         boolean var4 = ((gm_3)import_.class_[56]).break_(((cb_3)import_.class_[57]).rN().protected_(0.0, 0.1, 0.0));
         double var5 = Math.abs((double)((int)((cb_3)import_.class_[57]).re()) - ((cb_3)import_.class_[57]).re());
         boolean var7 = (var5 == 0.125 || var5 == 0.1875) && !var4 ? true : catch_[72];
         boolean var8 = ((cb_3)import_.class_[57]).throws_(iM_2.STANDING) && var1 ? true : catch_[74];
         boolean var9 = !var4 && var1 ? true : catch_[76];
         return !((cb_3)import_.class_[57]).Sy()
               && !((rhx_3)((cb_3)import_.class_[57]).implements_[18]).break_
               && !((cb_3)import_.class_[57]).break_(rLD.goto_)
               && !((cb_3)import_.class_[57]).break_(rLD.package_)
               && !((cb_3)import_.class_[57]).break_(rLD.instanceof_)
               && !((cb_3)import_.class_[57]).break_(rLD.protected_)
               && !((cb_3)import_.class_[57]).Pm()
               && !((cb_3)import_.class_[57]).o_()
               && !((cb_3)import_.class_[57]).Y()
               && !((cb_3)import_.class_[57]).Pe()
               && !((cb_3)import_.class_[57]).Py()
               && !var3
               && !var7
               && !var8
               && !var9
            ? true
            : catch_[78];
      }
   }

   public rrIQ try_() {
      this.char_();
      return (rrIQ)this.byte_[1];
   }

   public rrIk_1 while_() {
      this.char_();
      return (rrIk_1)this.byte_[5];
   }

   private static void static_() {
      throws_ = new byte[]{2, 5, 2, 3, 3, 2, 4, 2, 14, 15, 2, 3, 50, 18, 9, 10, 11, 12, 13, 14, 15, 16, 17, 3, 2, 14, 2, 15};
   }

   public rrIk_1 public_() {
      this.char_();
      return (rrIk_1)this.byte_[6];
   }

   private static void abstract_() {
      Object[] var0 = new Object[]{2, 14, 15};
      break_ = var0;
   }

   @Override
   public iB_2 native_() {
      this.char_();
      if (!((rrIk_1)this.byte_[6]).class_()) {
         return null;
      } else {
         iB_2 var1 = this.new_();
         return var1 == null && (iB_2)this.byte_[8] != null && System.currentTimeMillis() - this.byte_[9] < 1000L ? (iB_2)this.byte_[8] : var1;
      }
   }
}
