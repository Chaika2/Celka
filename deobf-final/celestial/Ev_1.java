package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class Ev_1 implements EF, rd_3 {
   private static double[] continue_;
   public static Object[] class_;
   public Object[] new_;
   private static boolean[] super_;
   private static short[] this_;
   private static byte[] else_;

   @Override
   public rfH_2 byte_() {
      return this.implements_().byte_(this.break_());
   }

   public List<rfH_2> byte_(bw_3 var1) {
      if ((List)this.new_[10] == null) {
         ArrayList var6 = new ArrayList();
         this.new_[10] = var6;
      }

      return (List<rfH_2>)this.new_[10];
   }

   public void byte_(double var1) {
      Double var7 = var1;
      this.new_[7] = var7;
   }

   public EA byte_(EA var1) {
      if (!this.break_(var1)) {
         return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[0]);
      } else {
         if (var1.byte_() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[0]) {
            var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[1]);
         }

         if (var1.byte_() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[1]) {
            var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]);
         }

         return var1;
      }
   }

   public void byte_(EZ var1) {
      Boolean var6 = ((bw_3)var1.break_[4]).class_((Integer)((rU_2)this.new_[4]).break_[0], (Integer)((rU_2)this.new_[4]).break_[2]);
      this.new_[12] = var6;
   }

   private static void int_() {
      continue_ = new double[]{0.0, 0.0, 0.0, 1.0, 1.1, 1.0};
   }

   public Ev_1(C_case var1, rU_2 var2, rU_2 var3, rU_2[] var4) {
      this(var1, var2, var3, var4, null);
   }

   public Ev_1(C_case var1, rU_2 var2, rU_2 var3, rU_2[] var4, rU_2 var5) {
      this.new_();
      EA var10 = new EA().class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[0]);
      this.new_[2] = var10;
      Object var11 = null;
      this.new_[8] = var11;
      Object var12 = null;
      this.new_[9] = var12;
      Object var13 = null;
      this.new_[10] = var13;
      Object var14 = null;
      this.new_[11] = var14;
      this.new_[0] = var1;
      Ps_1 var16 = var1.throw_();
      this.new_[1] = var16;
      this.new_[3] = var2;
      this.new_[4] = var3;
      this.new_[5] = var4;
      this.new_[6] = var5;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      this_ = new short[]{
         0,
         2,
         8,
         9,
         10,
         11,
         0,
         1,
         3,
         4,
         5,
         6,
         7,
         7,
         7,
         7,
         7,
         7,
         11,
         11,
         11,
         11,
         1,
         0,
         1,
         18,
         2,
         2,
         1,
         1,
         2,
         6,
         1,
         1,
         2,
         4,
         2,
         0,
         2,
         2,
         2,
         0,
         2,
         1,
         5,
         1,
         0,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         4,
         1,
         1,
         4,
         4,
         2,
         3,
         4,
         0,
         2,
         0,
         0,
         1,
         1,
         2,
         4,
         4,
         0,
         4,
         2,
         12,
         12,
         8,
         9,
         10,
         8,
         8,
         5,
         0,
         1,
         2,
         8,
         9,
         9,
         6,
         6,
         0,
         6,
         1,
         6,
         2,
         6,
         9,
         10,
         10,
         10,
         5,
         0,
         0,
         2,
         1,
         1
      };
   }

   public List<rfH_2> class_(bw_3 var1) {
      if ((List)this.new_[8] != null) {
         return (List<rfH_2>)this.new_[8];
      } else {
         ArrayList var2 = new ArrayList();

         for (rU_2 var6 : (rU_2[])this.new_[5]) {
            if (!EF.break_(var1, (Integer)var6.break_[0], (Integer)var6.break_[1], (Integer)var6.break_[2])) {
               var2.add(var6);
            }
         }

         this.new_[8] = var2;
         return var2;
      }
   }

   @Override
   public void class_() {
      EA var5 = new EA().class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[0]);
      this.new_[2] = var5;
   }

   public abstract double class_(EZ var1);

   public boolean class_(EA var1) {
      return true;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7757147260034478975L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -45, -52, 85, 21, 56, -82, -107}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean break_(EA var1) {
      if (var1.byte_() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[1]) {
         return true;
      } else {
         boolean var2 = super_[6];

         for (rU_2 var6 : (rU_2[])this.new_[5]) {
            if (!((Ps_1)this.new_[1]).case_().class_(rsB_2.class, new rfl_3(0.0, 0.0, 0.0, 1.0, 1.1, 1.0).class_(var6)).isEmpty()
               && (Boolean)C_class.instanceof_().PL.class_[0]) {
               return false;
            }

            if (!EF.class_((Ps_1)this.new_[1], var6) && !(bw_3.break_((Ps_1)this.new_[1], var6) instanceof dj_3)) {
               var2 = true;
               EF.class_((Ps_1)this.new_[1], bw_3.class_((Ps_1)this.new_[1], var6));
               Optional var7 = PJ.class_((Ps_1)this.new_[1], var6, ((Ps_1)this.new_[1]).native_().case_());
               if (!var7.isPresent()) {
                  var1.class_(new En_1(PJ.class_(((Ps_1)this.new_[1]).finally_(), Pu_1.class_(var6), ((Ps_1)this.new_[1]).protected_()), true));
                  var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
                  return false;
               }

               PX var8 = ((Px_1)var7.get()).class_();
               var1.class_(new En_1(var8, true));
               if (((Ps_1)this.new_[1]).class_(var6) || ((Ps_1)this.new_[1]).protected_().class_(var8)) {
                  var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
               }

               return super_[12];
            }
         }

         if (var2) {
            var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
            return true;
         } else {
            return super_[17];
         }
      }
   }

   public List<rfH_2> break_(bw_3 var1) {
      if ((List)this.new_[9] != null) {
         return (List<rfH_2>)this.new_[9];
      } else {
         ArrayList var2 = new ArrayList();
         if ((rU_2)this.new_[6] != null
            && !EF.byte_(var1, (Integer)((rU_2)this.new_[6]).break_[0], (Integer)((rU_2)this.new_[6]).break_[1], (Integer)((rU_2)this.new_[6]).break_[2])) {
            var2.add((rU_2)this.new_[6]);
         }

         this.new_[9] = var2;
         return var2;
      }
   }

   @Override
   public rU_2 break_() {
      return (rU_2)this.new_[3];
   }

   public double break_(EZ var1) {
      if ((Double)this.new_[7] == null) {
         Double var6 = this.class_(var1);
         this.new_[7] = var6;
      }

      return (Double)this.new_[7];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1978203550;
   }

   @Override
   public double throws_() throws NullPointerException {
      return (Double)this.new_[7];
   }

   public rfH_2[] finally_() {
      return (rU_2[])this.new_[5];
   }

   @Override
   public rk_3 catch_() {
      ((rhx_3)((Ps_1)this.new_[1]).catch_().implements_[18]).break_ = false;
      EA var5 = this.byte_((EA)this.new_[2]);
      this.new_[2] = var5;
      if (EF.protected_((Ps_1)this.new_[1], ((Ps_1)this.new_[1]).volatile_())) {
         ((EA)this.new_[2]).class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true);
      }

      if (((Ps_1)this.new_[1]).catch_().Bz()) {
         ((Ps_1)this.new_[1]).class_().ifPresent(var1 -> EF.class_((Ps_1)this.new_[1], bw_3.class_((Ps_1)this.new_[1], var1)));
         ((EA)this.new_[2]).class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
      }

      ((EA)this.new_[2]).class_().break_().ifPresent(var1 -> ((Br_1)((C_case)this.new_[0]).catch_()).class_(var1, ((EA)this.new_[2]).class_().class_()));
      ((C_case)this.new_[0]).new_().class_();
      ((EA)this.new_[2]).break_().forEach((var1, var2) -> ((C_case)this.new_[0]).new_().class_(var1, var2));
      ((EA)this.new_[2]).break_().clear();
      if (((EA)this.new_[2]).byte_().class_()) {
         ((C_case)this.new_[0]).new_().class_();
      }

      return ((EA)this.new_[2]).byte_();
   }

   public boolean extends_() {
      return !this.volatile_().contains(((Ps_1)this.new_[1]).volatile_()) && !this.volatile_().contains(((BO)((C_case)this.new_[0]).this_()).super_())
         ? super_[1]
         : super_[0];
   }

   @Override
   public boolean case_() {
      return (Boolean)this.new_[12];
   }

   private static void continue_() {
      Object[] var0 = new Object[1];
      rpr_3[] var2 = new rpr_3[5];
      var0[0] = var2;
      class_ = var0;
   }

   @Override
   public rU_2 implements_() {
      return (rU_2)this.new_[4];
   }

   private void new_() {
      if (this.new_ == null) {
         this.new_ = new Object[13];
         Object[] var1 = this.new_;
      }
   }

   private static void package_() {
      else_ = new byte[]{5, 2, 3, 4, 13};
   }

   private static void super_() {
      super_ = new boolean[]{
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
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
         true
      };
   }

   @Override
   public boolean protected_() {
      return this.class_((EA)this.new_[2]);
   }

   public double protected_(EZ var1) {
      Object var6 = null;
      this.new_[7] = var6;
      return this.break_(var1);
   }

   @Override
   public void private_() {
      Object var5 = null;
      this.new_[8] = var5;
      Object var6 = null;
      this.new_[9] = var6;
      Object var7 = null;
      this.new_[10] = var7;
   }

   public Set<rU_2> volatile_() {
      if ((Set)this.new_[11] == null) {
         Set var5 = this.native_();
         this.new_[11] = var5;
         Objects.requireNonNull((Set)this.new_[11]);
      }

      return (Set<rU_2>)this.new_[11];
   }

   public abstract Set<rU_2> native_();
}
