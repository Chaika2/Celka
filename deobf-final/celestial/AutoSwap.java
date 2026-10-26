package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class AutoSwap extends Module {
   private static String[] protected_;
   public Object[] break_;
   private static byte[] throws_;
   private static long[] catch_;
   private static boolean[] private_;
   private static short[] implements_;
   public static Object[] byte_;
   private static float[] finally_;

   private rrCh_1 boolean_() {
      this.B();
      if (this.instanceof_()) {
         return (rrCh_1)this.break_[4];
      } else if (this.new_()) {
         return (rrCh_1)this.break_[1];
      } else if (this.continue_()) {
         return (rrCh_1)this.break_[2];
      } else if (this.else_()) {
         return (rrCh_1)this.break_[3];
      } else if (this.this_()) {
         return (rrCh_1)this.break_[5];
      } else {
         return (rrCh_1)(this.throw_() ? (rrCd_1)this.break_[6] : (rrCh_1)this.break_[4]);
      }
   }

   public boolean char_() {
      this.B();
      return ((rrIQ)this.break_[9]).byte_().equals("Умный");
   }

   private static void byte_(String var0) {
   }

   private boolean byte_(rrCh_1 var1) {
      return ((cb_3)import_.class_[57]).sK().class_(var1.class_());
   }

   private static void long_() {
      private_ = new boolean[]{
         false,
         true,
         false,
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
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false
      };
   }

   public AutoSwap() {
      super("Auto Swap", "Автоматически меняет предмет\nв правой руке", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.B();
      rrmi_3 var5 = new rrmi_3();
      this.break_[0] = var5;
      rrCM var6 = new rrCM();
      this.break_[1] = var6;
      rrCb_1 var7 = new rrCb_1();
      this.break_[2] = var7;
      rrCx_1 var8 = new rrCx_1();
      this.break_[3] = var8;
      rrCJ var9 = new rrCJ();
      this.break_[4] = var9;
      rrCX var10 = new rrCX();
      this.break_[5] = var10;
      rrCd_1 var11 = new rrCd_1();
      this.break_[6] = var11;
      rrIQ var12 = new rrIQ("Режим", "Умный", "Умный", "Бинд").class_("change_mode", (var1, var2) -> this.strictfp_());
      this.break_[9] = var12;
      rrIQ var13 = new rrIQ("Менять с", "Щит", "Щит", "Гепл", "Шар", "Руна", "Сфера", "Тотем").class_("change_mode", (var1, var2) -> this.strictfp_());
      this.break_[10] = var13;
      rrIQ var14 = new rrIQ("Менять на", "Гепл", "Гепл", "Щит", "Шар", "Руна", "Сфера", "Тотем").class_("change_mode", (var1, var2) -> this.strictfp_());
      this.break_[11] = var14;
      rrIF var15 = new rrIF("Клавиша свапа", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[3]).class_(() -> this.try_());
      this.break_[12] = var15;
      rrIm_1 var16 = new rrIm_1("Здоровье", 16.5F, 1.0F, 19.5F, 0.5F).class_(() -> this.char_());
      this.break_[13] = var16;
      rrIk_1 var17 = new rrIk_1("Проверять кристалл", true).class_(() -> this.char_() && this.continue_() ? true : private_[46]);
      this.break_[14] = var17;
      this.class_(
         new Setting[]{
            (rrIQ)this.break_[9], (rrIQ)this.break_[10], (rrIQ)this.break_[11], (rrIF)this.break_[12], (rrIm_1)this.break_[13], (rrIk_1)this.break_[14]
         }
      );
   }

   static {
      ntfClinit();
   }

   private void B() {
      if (this.break_ == null) {
         this.break_ = new Object[15];
         this.break_[7] = 0L;
         this.break_[8] = 0;
      }
   }

   public boolean this_() {
      this.B();
      return ((rrIQ)this.break_[10]).byte_().equals("Руна");
   }

   public boolean interface_() {
      this.B();
      return ((rrIQ)this.break_[11]).byte_().equals("Шар");
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1553158444;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4924245967987713692L;
   }

   @EventTarget
   public void class_(rrLa_1 var1) {
      if (this.char_()) {
         rdn_3 var2 = var1.class_();
         rrLi_1 var3 = var1.break_();
         if (this.P()) {
            int var4 = ((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_;
            rdn_3 var5 = ((cb_3)import_.class_[57]).Sn();
            rrCh_1 var6 = this.switch_();
            rrCh_1 var7 = this.boolean_();
            Pair var8 = this.class_(var6);
            Pair var9 = this.class_(var7);
            Predicate var10 = var6.break_(this);
            Predicate var11 = var7.break_(this);
            if (this.class_(var2, var3)) {
               this.class_(var8, var10, var9, var5, var4);
            } else if (this.class_(var10, var2, var3) && this.static_()) {
               this.class_(var7, var9, var11, var5, var4, false);
            }
         }
      }
   }

   @EventTarget
   public void class_(rrAM var1) {
      this.strictfp_();
   }

   private boolean class_(Predicate<rdn_3> var1, rdn_3 var2, rrLi_1 var3) {
      if (var3 instanceof rrAP && this.instanceof_() && var2.break_() == rdy_3.kN) {
         return true;
      } else {
         return var3 instanceof rrAr_1 && var1.test(var2) ? true : private_[35];
      }
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.B();
      if (var1.break_() == ((rrIF)this.break_[12]).finally_().byte_() && this.try_()) {
         int var2 = ((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_;
         rdn_3 var3 = ((cb_3)import_.class_[57]).Sn();
         rrCh_1 var4 = this.switch_();
         rrCh_1 var5 = this.boolean_();
         Pair var6 = this.class_(var4);
         Pair var7 = this.class_(var5);
         if (!this.P()) {
            return;
         }

         Predicate var8 = var4.break_(this);
         Predicate var9 = var5.break_(this);
         if (this.class_(var8, var3)) {
            this.class_(var5, var7, var9, var3, var2, true);
         } else {
            this.class_(var6, var8, var7, var3, var2);
         }
      }
   }

   private boolean class_(rdn_3 var1, rrLi_1 var2) {
      if (!(var2 instanceof rrAr_1)) {
         return private_[32];
      } else {
         return this.instanceof_() && var1.break_() == rdy_3.kN ? true : private_[31];
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.B();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && this.char_()) {
         int var2 = ((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_;
         rdn_3 var3 = ((cb_3)import_.class_[57]).Sn();
         rrCh_1 var4 = this.switch_();
         rrCh_1 var5 = this.boolean_();
         Predicate var6 = var4.break_(this);
         Predicate var7 = var5.break_(this);
         if (this.break_(var7, var3)) {
            Integer var14 = (Integer)this.break_[8] + 1;
            this.break_[8] = var14;
         } else {
            Integer var15 = 0;
            this.break_[8] = var15;
         }

         if (((cb_3)import_.class_[57]).P() == rpm_3.OFF_HAND && this.class_(var6, ((cb_3)import_.class_[57]).sX())) {
            Long var16 = System.currentTimeMillis();
            this.break_[7] = var16;
         }

         if (!this.P()) {
            return;
         }

         Pair var8 = this.class_(var4);
         Pair var9 = this.class_(var5);
         if (this.break_(var4)) {
            this.class_(var8, var6, var9, var3, var2);
         } else if (this.static_()) {
            this.class_(var5, var9, var7, var3, var2, false);
         }
      }
   }

   private Pair<rdn_3, Integer> class_(rrCh_1 var1) {
      Predicate var2 = var1.break_(this);
      ArrayList var3 = new ArrayList();

      for (int var4 = 0; var4 < 36; var4++) {
         rdn_3 var5 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var4);
         if (!var5.class_() && var2.test(var5)) {
            var3.add(Pair.of(var5, var4));
         }
      }

      Comparator var6 = var1.byte_(this);
      if (var6 != null) {
         var3.sort(var6);
      }

      return var3.isEmpty() ? null : (Pair)var3.get(0);
   }

   private void class_(Pair<rdn_3, Integer> var1, Predicate<rdn_3> var2, Pair<rdn_3, Integer> var3, rdn_3 var4, int var5) {
      this.B();
      if (var1 != null) {
         if (!this.class_(var2, var4)) {
            int var6 = (Integer)var1.getRight();
            if (var6 != -1) {
               int var7 = rrfY_2.break_(var6);
               if (var3 != null) {
                  rdn_3 var8 = (rdn_3)var3.getLeft();
                  ((rrmi_3)this.break_[0]).class_(var8, var7);
                  byte_("saved swap back item " + var7);
               }

               this.class_(var5, var7, 40);
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
               rVi_1 var9 = rrfu_3.class_()
                  .class_("Свапнул ")
                  .break_(rVa_1.class_(rrZF.d_), rVa_1.class_(rrZF.d_))
                  .break_()
                  .class_(((cb_3)import_.class_[57]).Sn().continue_());
               ((cq_3)import_.class_[19]).class_(var9, false, true);
            }
         }
      }
   }

   private boolean class_(rdb_3 var1) {
      boolean var2 = false;

      for (int var3 = 0; var3 < 36; var3++) {
         if (((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var3).break_() == var1) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   private int class_(Pair<rdn_3, Integer> var1) {
      this.B();
      if (this.try_()) {
         return var1 != null ? (Integer)var1.getValue() : throws_[21];
      } else {
         return ((rrmi_3)this.break_[0]).class_(true);
      }
   }

   private void class_(int var1, int var2, int var3) {
      ((Ax_1)import_.class_[55]).class_(var1, var2, var3, rXa_1.SWAP, false);
   }

   private void class_(rrCh_1 var1, Pair<rdn_3, Integer> var2, Predicate<rdn_3> var3, rdn_3 var4, int var5, boolean var6) {
      this.B();
      int var7 = this.class_(var2);
      if (var7 >= 0) {
         int var8 = rrfY_2.break_(var7);
         if (this.break_(var3, var4) && (!var1.class_(this) || !this.class_(var4.break_()))) {
            if (!var6 && (Integer)this.break_[8] > 5) {
               ((rrmi_3)this.break_[0]).throws_();
               byte_("reset swap back item");
            }
         } else {
            this.class_(var5, var8, 40);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
            rVi_1 var9 = rrfu_3.class_()
               .class_("Свапнул ")
               .break_(rVa_1.class_(rrZF.d_), rVa_1.class_(rrZF.d_))
               .break_()
               .class_(((cb_3)import_.class_[57]).Sn().continue_());
            ((cq_3)import_.class_[19]).class_(var9, false, true);
         }

         if (var6) {
            ((rrmi_3)this.break_[0]).throws_();
            byte_("reset swap back item");
         }
      }
   }

   @EventTarget
   public void class_(rrFK var1) {
      this.strictfp_();
   }

   private boolean class_(Predicate<rdn_3> var1, rdn_3 var2) {
      return var1.test(var2);
   }

   private static void short_() {
      finally_ = new float[]{16.5F, 1.0F, 19.5F, 0.5F, 6.0F};
   }

   private static void void_() {
      Object[] var0 = new Object[]{40, -1, false};
      byte_ = var0;
   }

   private static void r() {
      throws_ = new byte[]{2, 6, 2, 3, 4, 5, 6, 2, 3, 4, 5, 6, 2, 3, 4, 5, -1, 40, 40, 5, 36, -1, 36, 15, 7, 8, 3, 40, -1, 2};
   }

   private boolean break_(rrCh_1 var1) {
      if (this.byte_(var1)) {
         return false;
      } else {
         return this.const_() ? false : this.abstract_();
      }
   }

   private boolean break_(Predicate<rdn_3> var1, rdn_3 var2) {
      return var1.test(var2);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{6, -25, -84, -87, 105, -3, -76, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.strictfp_();
   }

   private boolean P() {
      if (((cb_3)import_.class_[57]).native_()) {
         return false;
      } else {
         return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().this_().new_().break_() ? false : private_[24];
      }
   }

   public boolean goto_() {
      this.B();
      return ((rrIQ)this.break_[11]).byte_().equals("Сфера");
   }

   private boolean const_() {
      this.B();
      return ((rrIk_1)this.break_[14]).class_() && this.continue_()
         ? ((gm_3)import_.class_[56])
            .return_()
            .int2ObjectEntrySet()
            .stream()
            .filter(var0 -> var0.getValue() instanceof rSa_1)
            .anyMatch(var0 -> ((an_3)var0.getValue()).implements_((cb_3)import_.class_[57]) <= 6.0F ? true : private_[44])
         : private_[38];
   }

   public boolean continue_() {
      this.B();
      return ((rrIQ)this.break_[10]).byte_().equals("Шар");
   }

   public boolean else_() {
      this.B();
      return ((rrIQ)this.break_[10]).byte_().equals("Сфера");
   }

   private static void for_() {
      catch_ = new long[]{400L, 0L};
   }

   private static void import_() {
      implements_ = new short[]{
         0,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         9,
         10,
         11,
         3,
         12,
         13,
         14,
         9,
         10,
         11,
         12,
         13,
         14,
         0,
         57,
         4,
         57,
         8,
         8,
         8,
         57,
         57,
         7,
         12,
         57,
         4,
         57,
         57,
         4,
         57,
         0,
         0,
         57,
         19,
         0,
         57,
         19,
         8,
         0,
         0,
         55,
         57,
         1,
         57,
         0,
         57,
         0,
         7,
         57,
         57,
         13,
         14,
         56,
         0,
         57,
         1,
         1,
         4,
         2,
         3,
         5,
         6,
         1,
         4,
         1,
         2,
         3,
         5,
         6,
         4,
         57,
         0,
         11,
         11,
         11,
         11,
         11,
         11,
         10,
         10,
         10,
         10,
         10,
         10,
         9,
         9,
         57
      };
   }

   public boolean instanceof_() {
      this.B();
      return ((rrIQ)this.break_[10]).byte_().equals("Щит");
   }

   public boolean new_() {
      this.B();
      return ((rrIQ)this.break_[10]).byte_().equals("Гепл");
   }

   public boolean return_() {
      this.B();
      return ((rrIQ)this.break_[11]).byte_().equals("Гепл");
   }

   public boolean super_() {
      this.B();
      return ((rrIQ)this.break_[11]).byte_().equals("Руна");
   }

   private rrCh_1 switch_() {
      this.B();
      if (this.return_()) {
         return (rrCh_1)this.break_[1];
      } else if (this.while_()) {
         return (rrCh_1)this.break_[4];
      } else if (this.interface_()) {
         return (rrCh_1)this.break_[2];
      } else if (this.goto_()) {
         return (rrCh_1)this.break_[3];
      } else if (this.super_()) {
         return (rrCh_1)this.break_[5];
      } else {
         return (rrCh_1)(this.public_() ? (rrCd_1)this.break_[6] : (rrCh_1)this.break_[1]);
      }
   }

   public boolean throw_() {
      this.B();
      return ((rrIQ)this.break_[10]).byte_().equals("Тотем");
   }

   public boolean try_() {
      this.B();
      return ((rrIQ)this.break_[9]).byte_().equals("Бинд");
   }

   public boolean while_() {
      this.B();
      return ((rrIQ)this.break_[11]).byte_().equals("Щит");
   }

   private boolean static_() {
      this.B();
      if (((cb_3)import_.class_[57]).sK().class_(((rrmi_3)this.break_[0]).protected_())) {
         return false;
      } else {
         return System.currentTimeMillis() - this.break_[7] < 400L ? false : private_[29];
      }
   }

   public boolean public_() {
      this.B();
      return ((rrIQ)this.break_[11]).byte_().equals("Тотем");
   }

   private boolean abstract_() {
      this.B();
      float var1 = ((cb_3)import_.class_[57]).Ss() + ((cb_3)import_.class_[57]).Sd();
      return var1 <= ((rrIm_1)this.break_[13]).byte_() ? true : private_[37];
   }

   private static void transient_() {
      protected_ = new String[]{
         new String("Auto Swap"),
         new String("Автоматически меняет предмет\nв правой руке"),
         new String("Режим"),
         new String("Умный"),
         new String("Умный"),
         new String("Бинд"),
         new String("change_mode"),
         new String("Менять с"),
         new String("Щит"),
         new String("Щит"),
         new String("Гепл"),
         new String("Шар"),
         new String("Руна"),
         new String("Сфера"),
         new String("Тотем"),
         new String("change_mode"),
         new String("Менять на"),
         new String("Гепл"),
         new String("Гепл"),
         new String("Щит"),
         new String("Шар"),
         new String("Руна"),
         new String("Сфера"),
         new String("Тотем"),
         new String("change_mode"),
         new String("Клавиша свапа"),
         new String("Здоровье"),
         new String("Проверять кристалл"),
         new String("Свапнул "),
         new String("Свапнул "),
         new String("reset swap back item"),
         new String("reset swap back item"),
         new String("Гепл"),
         new String("Щит"),
         new String("Шар"),
         new String("Сфера"),
         new String("Руна"),
         new String("Тотем"),
         new String("Шар"),
         new String("Сфера"),
         new String("Руна"),
         new String("Щит"),
         new String("Гепл"),
         new String("Тотем"),
         new String("Бинд"),
         new String("Умный")
      };
   }

   private void strictfp_() {
      this.B();
      ((rrmi_3)this.break_[0]).throws_();
   }
}
