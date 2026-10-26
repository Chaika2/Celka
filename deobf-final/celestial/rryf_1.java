package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryf_1 extends rrpu_3 {
   public static Object[] class_;
   private static long[] byte_;
   public Object[] break_;
   private static float[] protected_;
   private static boolean[] case_;
   private static byte[] catch_;
   private static String[] private_;
   private static short[] implements_;

   private int byte_(int var1) {
      this.else_();
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
         ((rrfP_2)this.break_[3]).class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         ((Ax_1)import_.class_[55]).class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.break_();
         this.break_[5] = var6;
         return var1;
      } else {
         return catch_[13];
      }
   }

   @Override
   public rdn_3 byte_() {
      return (rdn_3)class_[0];
   }

   private static void int_() {
      case_ = new boolean[]{
         true,
         true,
         true,
         true,
         false,
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
         false,
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
         false,
         false,
         false,
         true
      };
   }

   public rryf_1(FtHelper var1) {
      super(var1);
      this.else_();
      rrIk_1 var6 = new rrIk_1("Рядом игрок", true);
      this.break_[0] = var6;
      rrIF var7 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.break_[1] = var7;
      CheckGroup var8 = new CheckGroup().catch_(true).case_(true).class_(true);
      this.break_[2] = var8;
      rrfP_2 var9 = new rrfP_2();
      this.break_[3] = var9;
      Integer var10 = -1;
      this.break_[6] = var10;
      var1.class_(new GroupSetting("Дезориентация", new rrIc_1("Проверки", (rrIk_1)this.break_[0]), (rrIF)this.break_[1]));
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      private_ = new String[]{
         new String("Рядом игрок"),
         new String("Активация"),
         new String("Дезориентация"),
         new String("Проверки"),
         new String("дезориентации"),
         new String("Нет игроков поблизости"),
         new String("[★] Дезориентация"),
         new String("desorientation"),
         new String("spooky-item")
      };
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -962392608973498530L;
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.else_();
      ((rrfP_2)this.break_[3]).class_(var1);
   }

   @EventTarget
   public void class_(rrAo_1 var1) {
      this.else_();
      ((rrfP_2)this.break_[3]).class_(rqR_2.break_() - this.break_[5] > 300L ? true : case_[10]);
      if ((Boolean)this.break_[4]) {
         FtHelper var2 = this.continue_();
         int var3 = this.public_();
         rryj_1 var4 = this.class_(var3);
         if (var4 == (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[2]) {
            int var5 = ((cb_3)import_.class_[57]).sK().protected_(rdy_3.JT);
            float var6 = (float)var5 / 20.0F;
            rrfu_3.class_(var2, "дезориентации", var6);
         } else if (var4 == (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[3]) {
            String var18 = "Нет игроков поблизости";
            rrfu_3.byte_(rrfu_3.class_((Module)var2) + var18);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[0]).class_(new rrtx_3(var2.final_(), var18, 2000));
         } else if (var4 == (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[0]) {
            int var19 = this.byte_(var3);
            if (var19 > 8) {
               Integer var11 = var19;
               this.break_[6] = var11;
               Integer var12 = 0;
               this.break_[7] = var12;
            }
         }

         Boolean var13 = false;
         this.break_[4] = var13;
      }

      if ((Integer)this.break_[6] != -1) {
         byte var17 = !((cb_3)import_.class_[57]).sV() && !((cb_3)import_.class_[57]).sZ() ? catch_[4] : case_[13];
         int var10002 = (Integer)this.break_[7] + 1;
         Integer var14 = var10002;
         this.break_[7] = var14;
         if (var10002 > var17) {
            ((Ax_1)import_.class_[55]).class_((Integer)this.break_[6]);
            Integer var15 = -1;
            this.break_[6] = var15;
            Integer var16 = 0;
            this.break_[7] = var16;
         }
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-95, 6, 26, 114, -6, 124, -23, -94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.else_();
      if (var1.break_() == ((rrIF)this.break_[1]).finally_().byte_()) {
         Boolean var6 = true;
         this.break_[4] = var6;
      }
   }

   private rryj_1 class_(int var1) {
      if (var1 == -1) {
         return (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[1];
      } else if (((cb_3)import_.class_[57]).sK().class_(rdy_3.JT)) {
         return (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[2];
      } else {
         return !this.final_()
            ? (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[3]
            : (rryj_1)rryj_1.staticFields0ba82fb5ac3130929eb6fe12cd822ba8[0];
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1808484833;
   }

   public int break_() {
      this.else_();
      return (Integer)this.break_[7];
   }

   @Override
   public rrIF throws_() {
      this.else_();
      return (rrIF)this.break_[1];
   }

   public boolean finally_() {
      this.else_();
      return (Boolean)this.break_[4];
   }

   public rrIk_1 extends_() {
      this.else_();
      return (rrIk_1)this.break_[0];
   }

   private static void goto_() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.JT, 1)};
      class_ = var0;
   }

   public CheckGroup case_() {
      this.else_();
      return (CheckGroup)this.break_[2];
   }

   private void else_() {
      if (this.break_ == null) {
         this.break_ = new Object[8];
         this.break_[4] = false;
         this.break_[5] = 0L;
         this.break_[6] = 0;
         this.break_[7] = 0;
      }
   }

   public int implements_() {
      this.else_();
      return (Integer)this.break_[6];
   }

   private static void new_() {
      catch_ = new byte[]{-1, 2, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 8, 4, 5, 6, 7};
   }

   private static void package_() {
      byte_ = new long[]{300L, 0L};
   }

   private static void return_() {
      protected_ = new float[]{20.0F, 10.0F};
   }

   private int public_() {
      Predicate var1 = this.protected_();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)import_.class_[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)import_.class_[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = case_[21]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return catch_[18];
      }
   }

   @Override
   public Predicate<rdn_3> protected_() {
      return var0 -> {
         if (var0.break_() != rdy_3.JT) {
            return false;
         } else if (var0.continue_().byte_().equalsIgnoreCase("[★] Дезориентация")) {
            return true;
         } else {
            return !var0.protected_("desorientation") && !var0.protected_("spooky-item") ? case_[25] : case_[24];
         }
      };
   }

   public long private_() {
      this.else_();
      return (Long)this.break_[5];
   }

   private boolean final_() {
      this.else_();
      if (!((rrIk_1)this.break_[0]).class_()) {
         return true;
      } else {
         ObjectIterator var1 = ((gm_3)import_.class_[56]).return_().int2ObjectEntrySet().iterator();

         while (var1.hasNext()) {
            Entry var2 = (Entry)var1.next();
            an_3 var3 = (an_3)var2.getValue();
            if (var3 != this.O() && rrff_3.class_(var3, (CheckGroup)this.break_[2]) && ((cb_3)import_.class_[57]).implements_(var3) <= 10.0F) {
               return true;
            }
         }

         return case_[20];
      }
   }

   private static void synchronized_() {
      implements_ = new short[]{
         0,
         0,
         1,
         2,
         3,
         6,
         0,
         1,
         1,
         4,
         3,
         3,
         5,
         4,
         2,
         57,
         3,
         0,
         2000,
         0,
         6,
         7,
         4,
         6,
         57,
         57,
         7,
         7,
         55,
         6,
         6,
         7,
         4,
         6,
         7,
         1,
         57,
         2,
         3,
         0,
         0,
         56,
         2,
         57,
         57,
         1,
         3,
         57,
         1,
         55,
         5,
         0,
         1,
         57,
         57,
         57,
         1,
         0,
         2,
         3,
         4,
         5,
         6,
         7
      };
   }

   public rrfP_2 native_() {
      this.else_();
      return (rrfP_2)this.break_[3];
   }

   @Override
   public boolean aK_() {
      this.else_();
      Boolean var5 = false;
      this.break_[4] = var5;
      Integer var6 = -1;
      this.break_[6] = var6;
      Integer var7 = 0;
      this.break_[7] = var7;
      return super.aK_();
   }
}
