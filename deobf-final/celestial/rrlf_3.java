package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrlf_3 extends rrlg_3 {
   private static short[] protected_;
   public Object[] class_;
   private static String[] case_;
   private static byte[] catch_;
   private static boolean[] private_;
   public static Object[] break_;

   private static void byte_() {
      case_ = new String[]{
         new String("Включено"), new String("enabled"), new String("Еда"), new String("display"), new String("RepairCost"), new String("Enchantments")
      };
   }

   private Pair<rdn_3, Integer> int_() {
      ArrayList var1 = new ArrayList();

      for (int var2 = 0; var2 < 45; var2++) {
         rdn_3 var3 = ((rhz_3)((cb_3)import_.class_[57]).implements_[1]).extends_(var2);
         if (!var3.class_() && var3.long_() && !this.break_(var3)) {
            var1.add(Pair.of(var3, rrfY_2.break_(var2)));
         }
      }

      return var1.isEmpty() ? null : (Pair)var1.stream().max((rrlj_3)break_[0]).orElse(null);
   }

   public rrlf_3(AutoUse var1) {
      super(var1);
      this.final_();
      rrIk_1 var6 = new rrIk_1("Включено", true).class_("enabled", (var1x, var2) -> {
         if (!var1x.byte_()) {
            this.extends_();
         }
      });
      this.class_[0] = var6;
      var1.class_(new GroupSetting("Еда", (rrIk_1)this.class_[0]));
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1358611595;
   }

   @EventTarget(
      id_class = 200
   )
   public void class_(rrLH var1) {
      this.final_();
      if (var1.protected_() == (rrLy_1)rrLy_1.staticFields4117bd257b2839b395dedb8ac6b8a087[0] && (Boolean)this.class_[1]) {
         var1.class_(true);
      }
   }

   @Override
   public boolean class_() {
      this.final_();
      return (Boolean)this.class_[1];
   }

   @EventTarget(
      id_class = 200
   )
   public void class_(rrLp_1 var1) {
      this.final_();
      rrLq_1 var2 = var1.case_();
      if ((var2 == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[1] || var2 == (rrLq_1)rrLq_1.staticFields2d4389a28d3a3bcfbac26ede38e74314[0])
         && (Boolean)this.class_[1]) {
         var1.class_(true);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6973746864388905614L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{77, -47, -126, 77, 38, 43, 47, -96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @EventTarget(
      id_class = 200
   )
   public void class_(rrAC var1) {
      this.final_();
      if (var1.break_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Boolean)this.class_[1]) {
         var1.class_(true);
      }
   }

   public boolean class_(rdn_3 var1) {
      this.final_();
      if (!this.case_()) {
         return false;
      } else if ((Boolean)this.class_[2]) {
         return true;
      } else {
         rpQ_2 var2 = ((cb_3)import_.class_[57]).sk();
         return var2.class_() <= var2.protected_() - var1.break_().this_().class_() ? true : private_[14];
      }
   }

   @EventTarget(
      id_class = 200
   )
   public void class_(q_1 var1) {
      this.final_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         AutoUse var2 = this.continue_();
         if (!((rrIk_1)this.class_[0]).class_() || !var2.class_(this)) {
            this.package_();
            return;
         }

         Pair var3 = this.int_();
         if (var3 == null) {
            this.package_();
            return;
         }

         rdn_3 var4 = (rdn_3)var3.getLeft();
         int var5 = (Integer)var3.getRight();
         if (!this.class_(var4)) {
            this.package_();
            return;
         }

         this.private_();
         rdn_3 var6 = ((cb_3)import_.class_[57]).Sn();
         int var7 = ((rJr_1)((cb_3)import_.class_[57]).implements_[4]).case_;
         if (var7 == 0 && !rdn_3.byte_(var6, var4)) {
            ((Ax_1)import_.class_[55]).class_(var7, var5, 40, rXa_1.SWAP, false);
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrLY.class_());
            Boolean var13 = false;
            this.class_[1] = var13;
            return;
         }

         if (!(Boolean)this.class_[1] && !((cb_3)import_.class_[57]).return_() && var6.break_().super_()) {
            ryZ_2 var8 = ((Ax_1)import_.class_[55]).class_(rpm_3.OFF_HAND);
            if (var8.class_()) {
               ((cb_3)import_.class_[57]).break_(rpm_3.OFF_HAND);
               ((Hh_1)import_.class_[16]).class_.class_(rpm_3.OFF_HAND);
               Boolean var14 = true;
               this.class_[1] = var14;
            }
         }

         if ((Boolean)this.class_[1]) {
            rpQ_2 var19 = ((cb_3)import_.class_[57]).sk();
            if (var19.class_() != (Integer)this.class_[3]) {
               Integer var15 = var19.class_();
               this.class_[3] = var15;
               Boolean var16 = var19.break_();
               this.class_[2] = var16;
            }

            if (!((cb_3)import_.class_[57]).return_()) {
               Boolean var17 = false;
               this.class_[1] = var17;
            } else if (((cb_3)import_.class_[57]).Sw() > var6.extends_() * 2) {
               ((Ax_1)import_.class_[55]).byte_((cb_3)import_.class_[57]);
               Boolean var18 = false;
               this.class_[1] = var18;
            }
         }
      }
   }

   private boolean break_(rdn_3 var1) {
      rcd_3 var2 = var1.package_();
      if (var2 == null) {
         return false;
      } else {
         rcd_3 var3 = var2.catch_();
         var3.continue_("display");
         var3.continue_("RepairCost");
         var3.continue_("Enchantments");
         return !var3.protected_().isEmpty() ? true : private_[18];
      }
   }

   private static void break_() {
      protected_ = new short[]{
         0,
         0,
         0,
         0,
         57,
         57,
         4,
         55,
         0,
         1,
         1,
         57,
         55,
         57,
         16,
         1,
         1,
         57,
         3,
         3,
         2,
         57,
         1,
         57,
         55,
         57,
         1,
         0,
         1,
         1,
         0,
         1,
         0,
         1,
         1,
         2,
         57,
         57,
         1,
         0,
         1,
         57,
         55,
         57,
         1,
         2
      };
   }

   private static void finally_() {
      private_ = new boolean[]{
         true,
         true,
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
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         false,
         true
      };
   }

   private void extends_() {
      this.final_();
      if ((Boolean)this.class_[1] && ((cb_3)import_.class_[57]).return_()) {
         ((Ax_1)import_.class_[55]).byte_((cb_3)import_.class_[57]);
      }

      this.package_();
   }

   private static void implements_() {
      catch_ = new byte[]{40, 2, 45, 4, 2, 3};
   }

   private void package_() {
      this.final_();
      Boolean var5 = false;
      this.class_[1] = var5;
      Boolean var6 = false;
      this.class_[2] = var6;
   }

   private void final_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         this.class_[1] = false;
         this.class_[2] = false;
         this.class_[3] = 0;
      }
   }

   private static void native_() {
      Object[] var0 = new Object[]{new rrlj_3()};
      break_ = var0;
   }

   @Override
   public boolean aK_() {
      this.extends_();
      return super.aK_();
   }
}
