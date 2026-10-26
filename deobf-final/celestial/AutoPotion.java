package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoPotion extends Module implements rrnF_2 {
   private static short[] protected_;
   private static boolean[] throws_;
   private static double[] catch_;
   public static Object[] break_;
   public Object[] byte_;
   private static byte[] private_;
   private static String[] implements_;
   private static long[] finally_;
   private static float[] extends_;

   public AutoPotion() {
      super("Auto Pot", "Автоматически кидает зелья", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.return_();
      rrIk_1 var5 = new rrIk_1("Только в ПВП", false);
      this.byte_[0] = var5;
      rrIk_1 var6 = new rrIk_1("Авто. выключение", false);
      this.byte_[1] = var6;
      rrTT var7 = new rrTT(this);
      this.byte_[2] = var7;
      rrfP_2 var8 = new rrfP_2();
      this.byte_[3] = var8;
      rrfw_3 var9 = new rrfw_3();
      this.byte_[4] = var9;
      this.class_(new Setting[]{new rrIc_1("Кидать", (rrIk_1)break_[2], (rrIk_1)break_[1], (rrIk_1)break_[0]), (rrIk_1)this.byte_[0], (rrIk_1)this.byte_[1]});
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      finally_ = new long[]{150L};
   }

   @EventTarget(
      id_class = 100
   )
   public void class_(q_1 var1) {
      this.return_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.goto_()) {
            this.super_();
            return;
         }

         HashMap var2 = new HashMap();

         for (rrnH_2 var6 : rrnH_2.values()) {
            if (var6.break_().get() && ((rrfw_3)this.byte_[4]).class_(600.0) && !this.break_(var6)) {
               int var7 = this.class_(var6);
               if (var7 != -1) {
                  var2.put(var7, var6);
               }
            }
         }

         boolean var9 = var2.isEmpty();
         ((rrfP_2)this.byte_[3]).class_(var9);
         if (var9) {
            this.super_();
            return;
         }

         rrTg_1 var10 = () -> ((cb_3)import_.class_[57]).goto_().case_(90.0F);
         ((rrTT)this.byte_[2]).class_(var10, (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]);
         if (!((cb_3)import_.class_[57]).z().break_(var10.getNeedRotation(), 0.05F)) {
            return;
         }

         for (Entry var12 : var2.entrySet()) {
            int var13 = (Integer)var12.getKey();
            int var8 = this.break_(var13);
            if (var8 != -1) {
               ((rrfw_3)this.byte_[4]).class_();
            }

            if (var8 > 8) {
               ((Ax_1)import_.class_[55]).class_(var8);
            }
         }

         rrfo_3.class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         if (((rrIk_1)this.byte_[1]).class_()) {
            this.byte_(false);
         }
      }
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.return_();
      ((rrfP_2)this.byte_[3]).class_(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2879881948232535233L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1305110724;
   }

   private int class_(rrnH_2 var1) {
      rdn_3 var2 = ((cb_3)import_.class_[57]).ss();
      rdn_3 var3 = ((cb_3)import_.class_[57]).Sn();
      if (rrfH_2.break_(var2.break_())) {
         for (rLY var5 : rAB.class_(var2)) {
            if (var5.class_() == var1.byte_()) {
               return -2;
            }
         }
      }

      if (rrfH_2.break_(var3.break_())) {
         for (rLY var11 : rAB.class_(var3)) {
            if (var11.class_() == var1.byte_()) {
               return -3;
            }
         }
      }

      for (int var9 = throws_[10]; var9 < 9; var9++) {
         rdn_3 var12 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var9);
         if (rrfH_2.break_(var12.break_())) {
            for (rLY var7 : rAB.class_(var12)) {
               if (var7.class_() == var1.byte_()) {
                  return var9;
               }
            }
         }
      }

      for (int var10 = private_[18]; var10 < 36; var10++) {
         rdn_3 var13 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var10);
         if (rrfH_2.break_(var13.break_())) {
            for (rLY var15 : rAB.class_(var13)) {
               if (var15.class_() == var1.byte_()) {
                  return var10;
               }
            }
         }
      }

      return private_[20];
   }

   @Override
   public float break_() {
      return -1.0F;
   }

   private int break_(int var1) {
      this.return_();
      if (var1 == -2) {
         rrfo_3.class_(rpm_3.MAIN_HAND);
         return var1;
      } else if (var1 == -3) {
         rrfo_3.class_(rpm_3.OFF_HAND);
         return var1;
      } else if (var1 >= 0 && var1 < 9) {
         ((rrfP_2)this.byte_[3]).class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         rrfo_3.class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         rrfo_3.class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         return var1;
      } else if (var1 >= 9 && var1 <= 36) {
         ((rrfP_2)this.byte_[3]).class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         ((Ax_1)import_.class_[55]).class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         return var1;
      } else {
         return private_[14];
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-123, 13, 20, 97, 106, -59, -114, 37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean break_(rrnH_2 var1) {
      rLR var2 = var1.byte_();
      byte var3 = 10;
      return ((cb_3)import_.class_[57]).break_(var2) && ((cb_3)import_.class_[57]).byte_(var2).break_() > 20 * var3 ? true : throws_[9];
   }

   @Override
   public void throws_(boolean var1) {
      super.throws_(var1);
      this.super_();
   }

   @Override
   public rrTp_1 catch_() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
   }

   private boolean goto_() {
      this.return_();
      if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().K().aJ_()) {
         return false;
      } else if (((rrIk_1)this.byte_[0]).class_() && !rrfZ_2.byte_()) {
         return false;
      } else if ((rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[0]
         && ((cq_3)import_.class_[19]).volatile_().matches("\\d+")) {
         return false;
      } else if ((!rrjc_3.break_(extends_[1]) || ((cb_3)import_.class_[57]).BL()) && !rrjc_3.class_(extends_[2])) {
         return ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().E().long_().break_() < 150L ? false : throws_[16];
      } else {
         return throws_[14];
      }
   }

   private static void continue_() {
      Object[] var0 = new Object[]{new rrIk_1("Силу", true), new rrIk_1("Скорость", true), new rrIk_1("Защиту от огня", true)};
      break_ = var0;
   }

   private static void else_() {
      extends_ = new float[]{0.05F, 0.5F, 2.0F, -1.0F, -1.0F, 90.0F};
   }

   private static void instanceof_() {
      throws_ = new boolean[]{
         false, false, false, false, true, true, false, false, true, false, false, false, false, false, false, false, true, true, false, true, true, true
      };
   }

   private static void new_() {
      protected_ = new short[]{
         0,
         0,
         1,
         2,
         3,
         4,
         2,
         1,
         0,
         0,
         1,
         0,
         4,
         3,
         2,
         0,
         57,
         4,
         55,
         57,
         1,
         1,
         3,
         57,
         57,
         3,
         57,
         1,
         57,
         1,
         3,
         57,
         1,
         55,
         57,
         57,
         57,
         1,
         57,
         1,
         0,
         0,
         1,
         0,
         19,
         57,
         0,
         2,
         3,
         57,
         57
      };
   }

   private void return_() {
      if (this.byte_ == null) {
         this.byte_ = new Object[5];
      }
   }

   private void super_() {
      this.return_();
      ((rrTT)this.byte_[2]).final_();
   }

   private static void try_() {
      catch_ = new double[]{600.0};
   }

   private static void while_() {
      private_ = new byte[]{3, 3, 2, 2, -1, -1, 8, 10, 20, -2, -3, 9, 9, 36, -1, -2, -3, 9, 9, 36, -1, 2, 5, 3};
   }

   private static void public_() {
      implements_ = new String[]{
         new String("Auto Pot"),
         new String("Автоматически кидает зелья"),
         new String("Только в ПВП"),
         new String("Авто. выключение"),
         new String("Кидать"),
         new String("\\d+"),
         new String("Силу"),
         new String("Скорость"),
         new String("Защиту от огня")
      };
   }

   @Override
   public float private_() {
      return -1.0F;
   }

   @Override
   public rrTq_1 aB_() {
      return new rrTq_1(rjG_2.catch_(), ((cb_3)import_.class_[57]).goto_());
   }
}
