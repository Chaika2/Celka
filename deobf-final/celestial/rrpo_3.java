package celestial;

import java.nio.charset.StandardCharsets;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpo_3 extends rrpi_3 implements rrnF_2 {
   private static boolean[] byte_;
   private static float[] protected_;
   private static byte[] case_;
   public Object[] class_;
   public static Object[] break_;
   private static String[] catch_;
   private static short[] private_;

   private int byte_(int var1) {
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
         ((Ax_1)import_.class_[55])
            .class_(((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_, var1, ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_, rXa_1.SWAP);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
         return var1;
      } else {
         return case_[10];
      }
   }

   @Override
   public rdn_3 byte_() {
      return (rdn_3)break_[0];
   }

   private void int_() {
      this.goto_();
      Boolean var5 = false;
      this.class_[2] = var5;
      Integer var6 = 0;
      this.class_[4] = var6;
      Integer var7 = -1;
      this.class_[3] = var7;
   }

   public rrpo_3(HwHelper var1) {
      super(var1);
      this.goto_();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.class_[0] = var6;
      rrTT var7 = new rrTT(this);
      this.class_[1] = var7;
      Integer var8 = -1;
      this.class_[3] = var8;
      var1.class_(new GroupSetting("Ком снега", (rrIF)this.class_[0]));
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      case_ = new byte[]{-1, -1, 8, -1, -1, -2, -3, 9, 9, 36, -1, 2, -1, -2, -3, 45, -1, 5, 2, 3, 4};
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.goto_();
      if (var1.break_() == ((rrIF)this.class_[0]).finally_().byte_()) {
         Boolean var6 = true;
         this.class_[2] = var6;
      }
   }

   private rrpD_2 class_(int var1) {
      if (var1 == -1) {
         return (rrpD_2)rrpD_2.staticFieldsb8f0ef75cc3a3659b008178ccc081710[1];
      } else {
         return ((cb_3)import_.class_[57]).sK().class_(rdy_3.hU)
            ? (rrpD_2)rrpD_2.staticFieldsb8f0ef75cc3a3659b008178ccc081710[2]
            : (rrpD_2)rrpD_2.staticFieldsb8f0ef75cc3a3659b008178ccc081710[0];
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-92, -99, -35, 12, -51, -28, -125, -73}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1993715081852602429L;
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.goto_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.class_[2]) {
         HwHelper var2 = this.continue_();
         int var3 = this.while_();
         int var4 = this.public_();
         rrpD_2 var5 = this.class_(var3);
         switch (((int[])rrpK_2.class_[0])[var5.ordinal()]) {
            case 1:
               int var6 = ((cb_3)import_.class_[57]).sK().protected_(rdy_3.hU);
               float var7 = (float)var6 / 20.0F;
               rrfu_3.class_(var2, "кома снега", var7);
               this.int_();
               return;
            case 2:
               this.int_();
               return;
         }

         if (var5 == (rrpD_2)rrpD_2.staticFieldsb8f0ef75cc3a3659b008178ccc081710[0]) {
            if (var4 > 0) {
               ((rrTT)this.class_[1])
                  .class_(
                     (rrTg_1)() -> new PX((Float)((cb_3)import_.class_[57]).break_[45], (Float)((cb_3)import_.class_[57]).break_[46]),
                     (rrTI)rrTI.staticFields26dd9f437bcd34c68d5b38988a1a3f7f[0]
                  );
            }

            if (var4 != 0) {
               int var10002 = (Integer)this.class_[4] + 1;
               Integer var12 = var10002;
               this.class_[4] = var12;
               if (var10002 < var4) {
                  return;
               }
            }

            if ((Integer)this.class_[3] == -1) {
               Integer var13 = this.byte_(var3);
               this.class_[3] = var13;
            }

            if ((Integer)this.class_[3] > 8) {
               if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().P().super_()) {
                  rrfo_3.class_(rpm_3.MAIN_HAND);
                  ((Ax_1)import_.class_[55])
                     .class_(
                        ((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_,
                        (Integer)this.class_[3],
                        ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_,
                        rXa_1.SWAP
                     );
                  ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
                  this.int_();
               }
            } else {
               this.int_();
            }

            if (var4 != 0) {
               ((rrTT)this.class_[1]).final_();
               ((rrTT)this.class_[1]).finally_();
            }
         }
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -377898209;
   }

   @Override
   public float break_() {
      return -1.0F;
   }

   @Override
   public rrIF throws_() {
      this.goto_();
      return (rrIF)this.class_[0];
   }

   @Override
   public rrTp_1 catch_() {
      return (rrTp_1)rrTp_1.staticFields0bf0cd3d5fc6358ba8402b11be019aa4[3];
   }

   private void goto_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         this.class_[2] = false;
         this.class_[3] = 0;
         this.class_[4] = 0;
      }
   }

   private static void else_() {
      private_ = new short[]{
         0,
         0,
         1,
         3,
         0,
         0,
         2,
         0,
         2,
         0,
         57,
         0,
         1,
         0,
         4,
         4,
         3,
         3,
         3,
         0,
         55,
         57,
         4,
         3,
         57,
         1,
         0,
         1,
         1,
         2,
         4,
         3,
         1,
         57,
         2,
         0,
         57,
         1,
         55,
         57,
         4,
         57,
         1,
         0,
         0,
         0,
         3,
         3,
         57,
         57,
         57,
         1,
         3,
         57,
         45,
         57,
         46
      };
   }

   private static void new_() {
      byte_ = new boolean[]{true, false, true, true, false, false, false, false, true, false, false, false, false, true};
   }

   private static void return_() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.hU, 1)};
      break_ = var0;
   }

   private int while_() {
      Predicate var1 = this.protected_();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)import_.class_[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)import_.class_[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = byte_[7]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return case_[16];
      }
   }

   private int public_() {
      return (C_volatile)rrTT.break_[3] instanceof rrTT && ((C_volatile)rrTT.break_[3]).byte_() != null ? 2 : byte_[6];
   }

   @Override
   public Predicate<rdn_3> protected_() {
      return var0 -> rrjk_3.case_(var0);
   }

   @Override
   public float private_() {
      return -1.0F;
   }

   private static void final_() {
      catch_ = new String[]{new String("Активация"), new String("Ком снега"), new String("кома снега")};
   }

   private static void synchronized_() {
      protected_ = new float[]{20.0F, -1.0F, -1.0F};
   }

   @Override
   public boolean aK_() {
      this.int_();
      return super.aK_();
   }
}
