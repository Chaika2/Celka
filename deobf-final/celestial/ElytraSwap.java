package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ElytraSwap extends Module {
   private static byte[] byte_;
   private static boolean[] protected_;
   private static long[] throws_;
   public Object[] break_;
   private static int[] catch_;
   private static short[] private_;
   private static String[] implements_;

   private void char_() {
      this.super_();
      boolean var1 = rrfY_2.class_(rdy_3.kc);
      rdn_3 var2 = ((cb_3)import_.class_[57]).class_(rXQ.CHEST);
      if (var2.break_() != rdy_3.kc || var1) {
         int var3 = rrfY_2.break_(rrfY_2.class_(protected_[21], false));
         if (var3 != -1) {
            if (((rrIk_1)this.break_[7]).class_() && rrfZ_2.byte_()) {
               ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(this.final_(), "Вы находитесь в ПВП режиме", 2000));
            } else {
               ((rrmi_3)this.break_[10]).class_(var2, var3);
               this.class_(var3, 6);
               Boolean var8 = true;
               this.break_[13] = var8;
            }
         }
      }
   }

   public ElytraSwap() {
      super("Elytra Swap", "Автоматически переключает слот\nс нагрудником на элитру", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.super_();
      rrIF var5 = new rrIF("Клавиша свапа", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.break_[0] = var5;
      rrIF var6 = new rrIF("Клавиша\nфейерверка", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.break_[1] = var6;
      rrIk_1 var7 = new rrIk_1("Получил урон", false);
      this.break_[2] = var7;
      rrIk_1 var8 = new rrIk_1("Приземлился", false);
      this.break_[3] = var8;
      rrIk_1 var9 = new rrIk_1("Нанёс урон", false);
      this.break_[4] = var9;
      rrIk_1 var10 = new rrIk_1("Автоматический полёт", true);
      this.break_[5] = var10;
      rrIk_1 var11 = new rrIk_1("Запускать 1 фейерверк", false);
      this.break_[6] = var11;
      rrIk_1 var12 = new rrIk_1("Не работать в ПВП", false);
      this.break_[7] = var12;
      rrfP_2 var13 = new rrfP_2();
      this.break_[8] = var13;
      rrmi_3 var14 = new rrmi_3();
      this.break_[10] = var14;
      rrfg_3 var15 = new rrfg_3();
      this.break_[11] = var15;
      this.class_(
         new Setting[]{
            new rrIc_1("Перекл. если", (rrIk_1)this.break_[4], (rrIk_1)this.break_[2], (rrIk_1)this.break_[3]),
            (rrIF)this.break_[0],
            (rrIF)this.break_[1],
            (rrIk_1)this.break_[5],
            (rrIk_1)this.break_[6],
            (rrIk_1)this.break_[7]
         }
      );
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      implements_ = new String[]{
         new String("Elytra Swap"),
         new String("Автоматически переключает слот\nс нагрудником на элитру"),
         new String("Клавиша свапа"),
         new String("Клавиша\nфейерверка"),
         new String("Получил урон"),
         new String("Приземлился"),
         new String("Нанёс урон"),
         new String("Автоматический полёт"),
         new String("Запускать 1 фейерверк"),
         new String("Не работать в ПВП"),
         new String("Перекл. если"),
         new String("Вы находитесь в ПВП режиме")
      };
   }

   private boolean interface_() {
      this.super_();
      if (!(Boolean)this.break_[13]) {
         return false;
      } else if (((rrIk_1)this.break_[2]).class_() && ((rrfg_3)this.break_[11]).class_()) {
         return true;
      } else {
         return ((rrIk_1)this.break_[3]).class_() && ((cb_3)import_.class_[57]).BL() && ((cb_3)import_.class_[57]).break_[40] ? true : protected_[30];
      }
   }

   private void class_(int var1, int var2) {
      int var3 = ((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_;
      if (var1 > 36) {
         ((Ax_1)import_.class_[55]).class_(var3, var2, var1 - 36, rXa_1.SWAP, false);
      } else {
         int var4 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_ % 8 + 1;
         ((Ax_1)import_.class_[55]).class_(var3, var1, var4, rXa_1.SWAP, true);
         ((Ax_1)import_.class_[55]).class_(var3, var2, var4, rXa_1.SWAP, true);
         ((Ax_1)import_.class_[55]).class_(var3, var1, var4, rXa_1.SWAP, false);
      }

      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1596290211;
   }

   @EventTarget
   public void class_(rrAg_1 var1) {
      this.super_();
      rdn_3 var2 = var1.byte_();
      if ((rdn_3)this.break_[12] != null) {
         if (rdn_3.break_(var2, (rdn_3)this.break_[12])) {
            if (var2.break_() == rdy_3.kc) {
               Boolean var7 = false;
               this.break_[13] = var7;
            } else {
               ((rrmi_3)this.break_[10]).class_(var2, var1.class_());
               Boolean var8 = true;
               this.break_[13] = var8;
            }
         }
      }
   }

   @EventTarget
   public void class_(rrAK var1) {
      this.super_();
      rdn_3 var6 = ((cb_3)import_.class_[57]).class_(rXQ.CHEST);
      this.break_[12] = var6;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2268418545072937999L;
   }

   @EventTarget
   public void class_(rrFj_1 var1) {
      this.super_();
      if (var1.class_() instanceof rhd_3 && ((rrIk_1)this.break_[4]).class_() && (Boolean)this.break_[13]) {
         this.continue_();
      }
   }

   @EventTarget
   public void class_(rrnh_3 var1) {
      this.super_();
      ((rrfg_3)this.break_[11]).class_(var1);
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.super_();
      ((rrfP_2)this.break_[8]).class_(var1);
      ((rrfg_3)this.break_[11]).class_(var1);
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.super_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.break_[8]).class_(rqR_2.break_() - this.break_[9] > 200L ? true : protected_[14]);
         if (this.interface_()) {
            this.continue_();
         }

         if (((cb_3)import_.class_[57]).Sy()) {
            rdn_3 var2 = ((cb_3)import_.class_[57]).class_(rXQ.CHEST);
            if (var2.break_() == rdy_3.kc) {
               Integer var7 = (Integer)this.break_[15] + 1;
               this.break_[15] = var7;
               if (((rrIk_1)this.break_[6]).class_() && (Integer)this.break_[15] < 2) {
                  this.try_();
               }
            } else {
               Integer var8 = 0;
               this.break_[15] = var8;
            }

            if ((Boolean)this.break_[14]) {
               this.try_();
               Boolean var9 = false;
               this.break_[14] = var9;
            }
         }
      }
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.super_();
      if (var1.break_() == ((rrIF)this.break_[0]).finally_().byte_()) {
         this.goto_();
      } else if (var1.break_() == ((rrIF)this.break_[1]).finally_().byte_() && ((cb_3)import_.class_[57]).Sy()) {
         Boolean var6 = true;
         this.break_[14] = var6;
      }
   }

   @EventTarget
   public void class_(rrAL var1) {
      this.return_();
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-96, 53, -10, 114, 102, -47, 94, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private int break_(int var1) {
      this.super_();
      if (var1 == -2) {
         rrfo_3.class_(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.class_(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         rrfo_3.class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         rrfo_3.class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.break_[8]).class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         ((Ax_1)import_.class_[55]).class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.break_();
         this.break_[9] = var6;
         return var1;
      } else {
         return byte_[18];
      }
   }

   @Override
   public void throws_(boolean var1) {
      this.super_();
      super.throws_(var1);
      this.while_();
      ((rrmi_3)this.break_[10]).throws_();
      Boolean var6 = false;
      this.break_[14] = var6;
      Integer var7 = 0;
      this.break_[15] = var7;
   }

   private void goto_() {
      rdn_3 var1 = ((cb_3)import_.class_[57]).class_(rXQ.CHEST);
      if (var1.break_() == rdy_3.kc) {
         this.continue_();
      } else {
         this.char_();
      }
   }

   private void continue_() {
      this.super_();
      if (((rrmi_3)this.break_[10]).class_()) {
         int var1 = ((rrmi_3)this.break_[10]).class_(true);
         if (var1 != -1) {
            this.class_(var1, 6);
            this.while_();
         }
      }
   }

   private static void else_() {
      private_ = new short[]{
         4,
         0,
         0,
         0,
         1,
         2,
         3,
         4,
         5,
         6,
         7,
         8,
         10,
         11,
         4,
         2,
         3,
         0,
         1,
         5,
         6,
         7,
         10,
         14,
         15,
         0,
         1,
         57,
         14,
         0,
         8,
         9,
         57,
         57,
         15,
         15,
         6,
         15,
         15,
         14,
         14,
         8,
         11,
         57,
         12,
         12,
         12,
         13,
         10,
         13,
         11,
         4,
         13,
         57,
         55,
         57,
         57,
         57,
         1,
         57,
         1,
         8,
         57,
         1,
         55,
         9,
         57,
         7,
         0,
         2000,
         10,
         13,
         10,
         10,
         0,
         5,
         57,
         38,
         13,
         2,
         11,
         3,
         57,
         57,
         40,
         57,
         4,
         55,
         57,
         1,
         55,
         55,
         55,
         0,
         11,
         15,
         13
      };
   }

   private static void instanceof_() {
      catch_ = new int[]{Integer.MAX_VALUE};
   }

   private static void new_() {
      protected_ = new boolean[]{
         false,
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
         false,
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
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false
      };
   }

   private void return_() {
      this.super_();
      rrvT var1 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_();
      if (((rrIk_1)this.break_[5]).class_()) {
         if (var1.P().super_()) {
            cb_3 var10000 = (cb_3)import_.class_[57];
            Boolean var6 = true;
            var10000.break_[38] = var6;
         }
      }
   }

   private void super_() {
      if (this.break_ == null) {
         this.break_ = new Object[16];
         this.break_[9] = 0L;
         this.break_[13] = false;
         this.break_[14] = false;
         this.break_[15] = 0;
      }
   }

   private static void throw_() {
      throws_ = new long[]{200L, 0L};
   }

   private void try_() {
      int var1 = this.public_();
      int var2 = this.break_(var1);
      if (var2 > 8) {
         ((Ax_1)import_.class_[55]).class_(var2);
      }
   }

   private void while_() {
      this.super_();
      ((rrfg_3)this.break_[11]).break_();
      Integer var5 = 0;
      this.break_[15] = var5;
      Boolean var6 = false;
      this.break_[13] = var6;
   }

   private int public_() {
      if (((cb_3)import_.class_[57]).ss().break_() == rdy_3.dc) {
         return -2;
      } else if (((cb_3)import_.class_[57]).Sn().break_() == rdy_3.dc) {
         return -3;
      } else {
         int var1 = catch_[0];
         int var2 = -1;

         for (int var3 = 0; var3 < 45; var3++) {
            rdn_3 var4 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var3);
            if (var4.break_() == rdy_3.dc) {
               int var5 = var4.char_();
               if (var5 < var1) {
                  var2 = var3;
                  var1 = var5;
               }
            }
         }

         return var2;
      }
   }

   private static void abstract_() {
      byte_ = new byte[]{6, 3, 2, 2, 3, 4, 5, 2, 8, -2, -3, -1, 45, -2, -3, 9, 9, 36, -1, -1, 6, -1, 6, 36, 36, 8, 16, 9, 13, 14, 15};
   }
}
