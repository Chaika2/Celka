package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryV extends rrpu_3 {
   public Object[] class_;
   private static boolean[] break_;
   private static String[] byte_;
   private static long[] protected_;
   private static short[] case_;
   private static byte[] catch_;
   private static float[] private_;

   @Override
   public rdn_3 byte_() {
      return ((rrfx_3)rrfx_3.staticFields97c38e70a72b3cd78288699f914dd87f[36]).break_().class_();
   }

   private int byte_(int var1) {
      this.final_();
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
         ((rrfP_2)this.class_[1]).class_(((rhz_3)((cb_3)import_.class_[57]).implements_[1]).protected_);
         ((Ax_1)import_.class_[55]).class_(var1);
         rrfo_3.class_(rpm_3.MAIN_HAND);
         Long var6 = rqR_2.break_();
         this.class_[3] = var6;
         return var1;
      } else {
         return catch_[12];
      }
   }

   public rryV(FtHelper var1) {
      super(var1);
      this.final_();
      rrIF var6 = new rrIF("Активация", (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[0]);
      this.class_[0] = var6;
      rrfP_2 var7 = new rrfP_2();
      this.class_[1] = var7;
      Integer var8 = -1;
      this.class_[4] = var8;
      var1.class_(new GroupSetting("Хлопушка", (rrIF)this.class_[0]));
   }

   static {
      ntfClinit();
   }

   @EventTarget
   public void class_(rrLu_1 var1) {
      this.final_();
      ((rrfP_2)this.class_[1]).class_(var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2180190500202839399L;
   }

   @EventTarget
   public void class_(rrLB var1) {
      this.final_();
      if (var1.break_() == ((rrIF)this.class_[0]).finally_().byte_()) {
         Boolean var6 = true;
         this.class_[2] = var6;
      }
   }

   @EventTarget
   public void class_(q_1 var1) {
      this.final_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         ((rrfP_2)this.class_[1]).class_(rqR_2.break_() - this.class_[3] > 300L ? true : break_[4]);
         if ((Boolean)this.class_[2]) {
            FtHelper var2 = this.continue_();
            int var3 = this.finally_();
            rryg_1 var4 = this.break_(var3);
            if (var4 == (rryg_1)rryg_1.staticFields024e8373b551338f96ec40891e552616[2]) {
               int var5 = ((cb_3)import_.class_[57]).sK().protected_(rdy_3.kk);
               float var6 = (float)var5 / 20.0F;
               rrfu_3.class_(var2, "хлопушки", var6);
            } else if (var4 == (rryg_1)rryg_1.staticFields024e8373b551338f96ec40891e552616[0]) {
               int var18 = this.byte_(var3);
               if (var18 > 8) {
                  Integer var11 = var18;
                  this.class_[4] = var11;
                  Integer var12 = 0;
                  this.class_[5] = var12;
               }
            }

            Boolean var13 = false;
            this.class_[2] = var13;
         }

         if ((Integer)this.class_[4] != -1) {
            byte var17 = !((cb_3)import_.class_[57]).sV() && !((cb_3)import_.class_[57]).sZ() ? catch_[3] : break_[7];
            int var10002 = (Integer)this.class_[5] + 1;
            Integer var14 = var10002;
            this.class_[5] = var14;
            if (var10002 > var17) {
               ((Ax_1)import_.class_[55]).class_((Integer)this.class_[4]);
               Integer var15 = -1;
               this.class_[4] = var15;
               Integer var16 = 0;
               this.class_[5] = var16;
            }
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1530722420;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-122, 11, 36, 95, -77, 43, 119, 51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private rryg_1 break_(int var1) {
      if (var1 == -1) {
         return (rryg_1)rryg_1.staticFields024e8373b551338f96ec40891e552616[1];
      } else {
         return ((cb_3)import_.class_[57]).sK().class_(rdy_3.kk)
            ? (rryg_1)rryg_1.staticFields024e8373b551338f96ec40891e552616[2]
            : (rryg_1)rryg_1.staticFields024e8373b551338f96ec40891e552616[0];
      }
   }

   private static void break_() {
      protected_ = new long[]{300L, 0L};
   }

   @Override
   public rrIF throws_() {
      this.final_();
      return (rrIF)this.class_[0];
   }

   private int finally_() {
      Predicate var1 = this.protected_();
      if (var1 == null) {
         return -1;
      } else if (var1.test(((cb_3)import_.class_[57]).ss())) {
         return -2;
      } else if (var1.test(((cb_3)import_.class_[57]).Sn())) {
         return -3;
      } else {
         for (int var2 = break_[12]; var2 < 45; var2++) {
            rdn_3 var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
            if (var1.test(var3)) {
               return var2;
            }
         }

         return catch_[17];
      }
   }

   private static void extends_() {
      break_ = new boolean[]{
         true, false, true, true, false, false, false, false, true, false, false, false, false, false, true, true, false, false, false, false
      };
   }

   private static void case_() {
      private_ = new float[]{20.0F};
   }

   private static void implements_() {
      byte_ = new String[]{new String("Активация"), new String("Хлопушка"), new String("хлопушки"), new String("[★] Хлопушка")};
   }

   @Override
   public Predicate<rdn_3> protected_() {
      return var0 -> {
         if (var0.break_() != rdy_3.kk) {
            return false;
         } else {
            String var1 = var0.continue_().byte_();
            if (var1.equalsIgnoreCase("[★] Хлопушка")) {
               return true;
            } else {
               List var2 = Arrays.stream(((rrfO_2)rrfO_2.staticFieldsf407dfe4cb09378d9b156ac8f4322895[0]).class_())
                  .map(rLY::class_)
                  .collect(Collectors.toList());
               return rAB.break_(var0, var2) ? true : break_[16];
            }
         }
      };
   }

   private static void private_() {
      catch_ = new byte[]{-1, 8, -1, 2, -1, -1, -1, -2, -3, 9, 9, 36, -1, -1, -2, -3, 45, -1, 6, 2, 3, 4, 5};
   }

   private void final_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         this.class_[2] = false;
         this.class_[3] = 0L;
         this.class_[4] = 0;
         this.class_[5] = 0;
      }
   }

   private static void native_() {
      case_ = new short[]{
         0,
         0,
         1,
         4,
         0,
         0,
         2,
         1,
         0,
         1,
         3,
         2,
         2,
         57,
         0,
         4,
         5,
         2,
         4,
         57,
         57,
         5,
         5,
         55,
         4,
         4,
         5,
         2,
         4,
         5,
         1,
         57,
         2,
         0,
         36,
         0,
         57,
         1,
         1,
         57,
         1,
         55,
         3,
         57,
         57,
         57,
         1,
         0
      };
   }

   @Override
   public boolean aK_() {
      this.final_();
      Boolean var5 = false;
      this.class_[2] = var5;
      Integer var6 = -1;
      this.class_[4] = var6;
      Integer var7 = 0;
      this.class_[5] = var7;
      return super.aK_();
   }
}
