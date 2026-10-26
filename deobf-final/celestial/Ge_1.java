package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ge_1 extends bq_3 implements rL_2, rrqd_3 {
   private static double[] catch_;
   private static byte[] private_;
   private static boolean[] implements_;
   private static String[] finally_;
   private static short[] extends_;
   public Object[] break_;
   public static Object[] throws_;

   private static int byte_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -174418236;
   }

   @Override
   public boolean byte_() {
      this.package_();
      return (ra_3)this.break_[0] != null ? true : implements_[1];
   }

   private rn_3 int_() {
      this.package_();
      ra_3 var1 = this.final_();
      if (var1 == null) {
         return null;
      } else {
         boolean var2 = (Boolean)C_class.instanceof_().catch_.class_[0];
         List var3 = (List)this.break_[1];
         if (!var3.isEmpty()) {
            EZ var14 = new EZ((C_class)this.case_[0]);
            List var5 = class_(var14, new ArrayList<>(var3), var1, 64, (List<rfH_2>)this.break_[2], this.implements_());
            rs_3 var6 = new rs_3(var5.stream().map(var3x -> this.class_(var3x, var5, var14)).toArray(rP_2[]::new));
            this.break_[1] = var5;
            return new rn_3(
               var6, var2 ? (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4] : (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[3]
            );
         } else if (!var2 && !(Boolean)C_class.instanceof_().b.class_[0]) {
            return null;
         } else {
            int var4 = (Integer)C_class.instanceof_().rx.class_[0];
            if ((rfH_2)this.break_[4] == null) {
               rU_2 var12 = ((Ps_1)this.case_[1]).volatile_();
               this.break_[4] = var12;
            }

            if ((rM_2)this.break_[5] == null) {
               Ga_1 var13 = new Ga_1(this, 1.0, var4, (rfH_2)this.break_[4]);
               this.break_[5] = var13;
            }

            return new rn_3((rM_2)this.break_[5], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[3]);
         }
      }
   }

   public Ge_1(C_class var1) {
      super(var1);
      this.package_();
      ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).break_(this);
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      Object[] var0 = new Object[]{64};
      throws_ = var0;
   }

   public static boolean class_(EZ var0, rfH_2 var1) {
      xc_3 var2 = ((bw_3)var0.break_[4]).class_(var1);
      if (EF.class_(var0, var1.b_(), var1.c_(), var1.d_(), var2, true) >= 1000000.0) {
         return false;
      } else if (EF.class_((bw_3)var0.break_[4], var1.b_(), var1.c_(), var1.d_(), var2)) {
         return false;
      } else {
         return ((bw_3)var0.break_[4]).class_(var1.final_()).break_() == xu_3.while_ && ((bw_3)var0.break_[4]).class_(var1.break_()).break_() == xu_3.while_
            ? implements_[28]
            : implements_[27];
      }
   }

   private void class_(List<rfH_2> var1, EZ var2) {
      this.package_();
      ra_3 var3 = this.final_();
      if (var3 != null) {
         if (!(Boolean)C_class.instanceof_().catch_.class_[0]) {
            List var4 = this.implements_();
            List var5 = class_(var2, var3, 64, var1, (List<rfH_2>)this.break_[2], var4);
            var5.addAll(var4);
            if (var5.isEmpty() && !(Boolean)C_class.instanceof_().b.class_[0]) {
               this.case_("No locations for " + var3 + " known, cancelling");
               if ((Boolean)C_class.instanceof_().PA.class_[0]) {
                  this.byte_("No locations for " + var3 + " known, cancelling", true);
               }

               this.private_();
            } else {
               this.break_[1] = var5;
            }
         }
      }
   }

   @Override
   public void class_(int var1, ra_3 var2) {
      this.package_();
      this.break_[0] = var2;
      if (this.final_() == null) {
         Object var8 = null;
         this.break_[0] = var8;
      }

      Integer var9 = var1;
      this.break_[6] = var9;
      ArrayList var10 = new ArrayList();
      this.break_[1] = var10;
      ArrayList var11 = new ArrayList();
      this.break_[2] = var11;
      Object var12 = null;
      this.break_[4] = var12;
      Object var13 = null;
      this.break_[5] = var13;
      HashMap var14 = new HashMap();
      this.break_[3] = var14;
      if (var2 != null) {
         this.class_(new ArrayList<>(), new EZ((C_class)this.case_[0]));
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, -45, -20, -102, 75, -123, 84, 16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean class_(rfH_2 var1, EZ var2, List<rfH_2> var3) {
      this.package_();
      if (var3.contains(var1)) {
         return true;
      } else {
         xc_3 var4 = ((bw_3)var2.break_[4]).class_(var1);
         if ((Boolean)C_class.instanceof_().rF.class_[0] && var4.break_() instanceof Ja_1) {
            return true;
         } else {
            return ((ra_3)this.break_[0]).class_(var4) && class_(var2, var1) ? true : implements_[15];
         }
      }
   }

   @Override
   public void class_(Collection<rrqz_3> var1) {
      if (var1.isEmpty()) {
         ((C_class)this.case_[0]).void_().case_();
      }
   }

   @Override
   public void class_(int var1, String... var2) {
      this.class_(var1, new ra_3(var2));
   }

   private rP_2 class_(rfH_2 var1, List<rfH_2> var2, EZ var3) {
      boolean var4 = !(((bw_3)((C_class)this.case_[0]).break_[34]).class_(var1.final_()).break_() instanceof dH_2) ? true : implements_[17];
      if (!(Boolean)C_class.instanceof_().rC.class_[0]) {
         return (rP_2)(var4 ? new Gi_1(var1) : new rh_3(var1));
      } else {
         boolean var5 = this.class_(var1.final_(), var3, var2);
         boolean var6 = this.class_(var1.break_(), var3, var2);
         boolean var7 = this.class_(var1.catch_(2), var3, var2);
         if (var5 == var6) {
            return (rP_2)(var7 && var4 ? new Gi_1(var1) : new rh_3(var1));
         } else if (var5) {
            return new rS_2(var1);
         } else {
            return (rP_2)(var7 && var4 ? new rh_3(var1.break_()) : new rS_2(var1.break_()));
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6847321065769746491L;
   }

   @Override
   public rn_3 class_(boolean var1, boolean var2) {
      this.package_();
      XRay var3 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().x();
      if (var3.aJ_() && var3.continue_() && var3.super_() instanceof rrqk_3 var5 && !var5.finally_()) {
         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
      } else {
         if ((Integer)this.break_[6] > 0) {
            int var15 = ((rhz_3)((Ps_1)this.case_[1]).catch_().implements_[1]).class_.stream().filter(var1x -> {
               this.package_();
               return ((ra_3)this.break_[0]).class_(var1x);
            }).mapToInt(rdn_3::char_).sum();
            if (var15 >= (Integer)this.break_[6]) {
               this.case_("Have " + var15 + " valid items");
               this.private_();
               return null;
            }
         }

         if (var1) {
            if (((List)this.break_[1]).isEmpty() || !(Boolean)C_class.instanceof_().Ph.class_[0]) {
               this.case_("Unable to find any path to " + (ra_3)this.break_[0] + ", canceling mine");
               if ((Boolean)C_class.instanceof_().PA.class_[0]) {
                  this.byte_("Unable to find any path to " + (ra_3)this.break_[0] + ", canceling mine", true);
               }

               this.private_();
               return null;
            }

            this.case_("Unable to find any path to " + (ra_3)this.break_[0] + ", blacklisting presumably unreachable closest instance...");
            if ((Boolean)C_class.instanceof_().PA.class_[0]) {
               this.byte_("Unable to find any path to " + (ra_3)this.break_[0] + ", blacklisting presumably unreachable closest instance...", true);
            }

            ((List)this.break_[1]).stream().min(Comparator.comparingDouble(((Ps_1)this.case_[1]).catch_()::byte_)).ifPresent(((List)this.break_[2])::add);
            ((List)this.break_[1]).removeIf(((List)this.break_[2])::contains);
         }

         this.native_();
         int var16 = (Integer)C_class.instanceof_().Pf.class_[0];
         ArrayList var17 = new ArrayList((List)this.break_[1]);
         if (var16 != 0) {
            int var10002 = (Integer)this.break_[7];
            Integer var14 = var10002 + 1;
            this.break_[7] = var14;
            if (var10002 % var16 == 0) {
               EZ var6 = new EZ((C_class)this.case_[0], true);
               C_class.interface_().execute(() -> this.class_(var17, var6));
            }
         }

         if ((Boolean)C_class.instanceof_().catch_.class_[0] && !this.new_()) {
            this.private_();
            return null;
         } else {
            Optional var18 = var17.stream()
               .filter(
                  var1x -> var1x.b_() == ((Ps_1)this.case_[1]).volatile_().b_() && var1x.d_() == ((Ps_1)this.case_[1]).volatile_().d_()
                        ? true
                        : implements_[51]
               )
               .filter(var1x -> var1x.c_() >= ((Ps_1)this.case_[1]).volatile_().c_() ? true : implements_[49])
               .filter(var1x -> !(bw_3.class_((Ps_1)this.case_[1], var1x).break_() instanceof Ja_1) ? true : implements_[47])
               .min(Comparator.comparingDouble(((Ps_1)this.case_[1]).volatile_().class_()::private_));
            ((C_class)this.case_[0]).int_().class_();
            if (var18.isPresent() && ((Ps_1)this.case_[1]).catch_().BL()) {
               rfH_2 var7 = (rfH_2)var18.get();
               xc_3 var8 = ((bw_3)((C_class)this.case_[0]).break_[34]).class_(var7);
               if (!EF.class_((bw_3)((C_class)this.case_[0]).break_[34], var7.b_(), var7.c_(), var7.d_(), var8)) {
                  Optional var9 = PJ.class_((Ps_1)this.case_[1], var7);
                  if (var9.isPresent() && var2) {
                     ((C_class)this.case_[0]).private_().class_(((Px_1)var9.get()).class_(), true);
                     EF.class_((Ps_1)this.case_[1], ((Ps_1)this.case_[1]).case_().byte_(var7));
                     if (((Ps_1)this.case_[1]).class_(var7) || ((Ps_1)this.case_[1]).protected_().class_(((Px_1)var9.get()).class_())) {
                        ((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
                     }

                     return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
                  }
               }
            }

            rn_3 var19 = this.int_();
            if (var19 == null) {
               this.private_();
               return null;
            } else {
               return var19;
            }
         }
      }
   }

   public static List<rfH_2> class_(EZ var0, ra_3 var1, int var2, List<rfH_2> var3, List<rfH_2> var4, List<rfH_2> var5) {
      ArrayList var6 = new ArrayList();
      ArrayList var7 = new ArrayList();

      for (re_3 var9 : var1.class_()) {
         xd_3 var10 = var9.break_();
         if (((ImmutableSet)St_1.class_[0]).contains(var10)) {
            rU_2 var11 = ((C_case)var0.break_[1]).throw_().volatile_();
            var6.addAll(
               ((SR)var0.break_[3])
                  .break_()
                  .class_(ri_3.class_(var10), (Integer)C_class.instanceof_().c.class_[0], (Integer)var11.break_[0], (Integer)var11.break_[2], 2)
            );
         } else {
            var7.add(var10);
         }
      }

      List var12 = class_(var0, var6, var1, var2, var4, var5);
      if (!var7.isEmpty() || (Boolean)C_class.instanceof_().PU.class_[0] && var12.size() < var2) {
         var12.addAll(C_throws.class_().throws_().class_(var0.break_().throw_(), var1, var2, 10, 32));
      }

      var12.addAll(var3);
      return class_(var0, var12, var1, var2, var4, var5);
   }

   @Override
   public String class_() {
      this.package_();
      return "Mine " + (ra_3)this.break_[0];
   }

   private static List<rfH_2> class_(EZ var0, List<rfH_2> var1, ra_3 var2, int var3, List<rfH_2> var4, List<rfH_2> var5) {
      var5.removeIf(var3x -> {
         for (rfH_2 var5x : var1) {
            if (var5x.private_(var3x) <= 9.0 && var2.class_(var0.class_(var5x.b_(), var5x.c_(), var5x.d_())) && class_(var0, var5x)) {
               return true;
            }
         }

         return implements_[43];
      });
      List var6 = var1.stream()
         .distinct()
         .filter(
            var3x -> ((bw_3)var0.break_[4]).class_(var3x.b_(), var3x.d_())
                     && !var2.class_(var0.class_(var3x.b_(), var3x.c_(), var3x.d_()))
                     && !var5.contains(var3x)
                  ? implements_[41]
                  : implements_[40]
         )
         .filter(var1x -> class_(var0, var1x))
         .filter(var1x -> C_class.instanceof_().Z.class_[0] ? break_(var0, var1x) : implements_[39])
         .filter(var0x -> var0x.c_() >= C_class.instanceof_().import_.class_[0] ? true : implements_[38])
         .filter(var0x -> var0x.c_() <= C_class.instanceof_().rM.class_[0] ? true : implements_[36])
         .filter(var1x -> !var4.contains(var1x) ? true : implements_[34])
         .filter(var1x -> {
            XRay var2x = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().x();
            if (var2x.aJ_()) {
               if (var5.contains(var1x)) {
                  return true;
               } else {
                  for (rrqc_3 var4x : var2x.super_().final_()) {
                     if (var4x.break_().equals(var1x)) {
                        return true;
                     }
                  }

                  return implements_[31];
               }
            } else {
               return implements_[32];
            }
         })
         .sorted(Comparator.comparingDouble(var0.break_().throw_().catch_()::byte_))
         .collect(Collectors.toList());
      return var6.size() > var3 ? var6.subList(0, var3) : var6;
   }

   public static boolean break_(EZ var0, rfH_2 var1) {
      int var2 = (Integer)C_class.instanceof_().PB.class_[0];

      for (int var3 = -var2; var3 <= var2; var3++) {
         for (int var4 = -var2; var4 <= var2; var4++) {
            for (int var5 = -var2; var5 <= var2; var5++) {
               if (Math.abs(var3) + Math.abs(var4) + Math.abs(var5) <= var2 && EF.class_(var0.break_(var1.b_() + var3, var1.c_() + var4, var1.d_() + var5))) {
                  return true;
               }
            }
         }
      }

      return implements_[23];
   }

   private static void finally_() {
      finally_ = new String[]{new String("Unable to mine when allowBreak is false and target block is not in allowBreakAnyway!")};
   }

   private static void extends_() {
      extends_ = new short[]{
         0,
         0,
         0,
         1,
         6,
         1,
         1,
         6,
         1,
         0,
         0,
         0,
         0,
         1,
         1,
         2,
         1,
         2,
         0,
         0,
         0,
         0,
         1,
         7,
         7,
         0,
         0,
         1,
         0,
         1,
         0,
         34,
         0,
         34,
         1,
         0,
         1,
         1,
         1,
         1,
         0,
         4,
         1,
         3,
         1,
         3,
         3,
         0,
         0,
         1,
         0,
         2,
         1,
         4,
         3,
         0,
         0,
         4,
         1,
         4,
         5,
         4,
         5,
         5,
         3,
         0,
         2,
         0,
         0,
         1,
         4,
         0,
         0,
         0,
         34,
         0,
         0,
         1,
         0,
         3,
         0,
         1,
         3,
         0,
         0,
         2,
         0,
         1,
         1,
         1,
         0,
         1,
         1,
         1,
         0,
         1,
         2,
         1,
         0,
         4,
         4,
         4,
         4,
         0,
         0,
         6,
         1,
         2,
         4,
         5,
         3,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         0,
         4,
         1,
         0,
         1,
         1,
         1,
         1,
         0
      };
   }

   private static void continue_() {
      private_ = new byte[]{64, 64, 2, 2, 10, 32, 10, 64, 8, 6, 7, 64};
   }

   public List<rfH_2> implements_() {
      this.package_();
      if (!(Boolean)C_class.instanceof_().PV.class_[0]) {
         return Collections.emptyList();
      } else {
         ArrayList var1 = new ArrayList();
         byte var2 = 1;

         for (an_3 var4 : ((gm_3)((Ps_1)this.case_[1]).case_()).byte_()) {
            if (var4 instanceof rsE_2 var5 && ((ra_3)this.break_[0]).class_(var5.protected_())) {
               rfH_2 var6 = var4.Bs();

               for (int var7 = -var2; var7 <= var2; var7++) {
                  for (int var8 = -var2; var8 <= var2; var8++) {
                     for (int var9 = -var2; var9 <= var2; var9++) {
                        var1.add(var6.break_(var7, var8, var9));
                     }
                  }
               }
            }
         }

         var1.addAll(((Map)this.break_[3]).keySet());
         return var1;
      }
   }

   private boolean new_() {
      this.package_();
      List var1 = this.implements_();
      ((List)this.break_[1]).addAll(var1);
      rU_2 var2 = ((Ps_1)this.case_[1]).volatile_();
      bw_3 var3 = new bw_3((Ps_1)this.case_[1]);
      ra_3 var4 = this.final_();
      if (var4 == null) {
         return false;
      } else {
         byte var5 = private_[6];
         double var6 = 20.0;

         for (int var8 = var2.b_() - var5; var8 <= var2.b_() + var5; var8++) {
            for (int var9 = var2.c_() - var5; var9 <= var2.c_() + var5; var9++) {
               for (int var10 = var2.d_() - var5; var10 <= var2.d_() + var5; var10++) {
                  if (var4.class_(var3.class_(var8, var9, var10))) {
                     rfH_2 var11 = new rfH_2(var8, var9, var10);
                     if ((Boolean)C_class.instanceof_().i.class_[0]
                           && ((List)this.break_[1]).stream().anyMatch(var1x -> var1x.private_(var11) <= 2.0 ? true : implements_[45])
                        || PJ.class_((Ps_1)this.case_[1], var11, var6).isPresent()) {
                        ((List)this.break_[1]).add(var11);
                     }
                  }
               }
            }
         }

         List var16 = class_(new EZ((C_class)this.case_[0]), (List<rfH_2>)this.break_[1], var4, 64, (List<rfH_2>)this.break_[2], var1);
         this.break_[1] = var16;
         return true;
      }
   }

   private void package_() {
      if (this.break_ == null) {
         this.break_ = new Object[8];
         Object[] var1 = this.break_;
         var1[6] = 0;
         var1[7] = 0;
      }
   }

   private static void super_() {
      catch_ = new double[]{1.0, 20.0, 1000000.0, 9.0, 2.0};
   }

   @Override
   public void protected_() {
      super.protected_();
      this.class_(0, (ra_3)null);
   }

   private ra_3 final_() {
      this.package_();
      if ((ra_3)this.break_[0] == null) {
         return null;
      } else if (!C_class.instanceof_().throws_()) {
         ra_3 var1 = new ra_3(
            ((ra_3)this.break_[0]).class_().stream().filter(var0 -> ((List)C_class.instanceof_().I.class_[0]).contains(var0.break_())).toArray(re_3[]::new)
         );
         if (var1.class_().isEmpty()) {
            this.case_("Unable to mine when allowBreak is false and target block is not in allowBreakAnyway!");
            return null;
         } else {
            return var1;
         }
      } else {
         return (ra_3)this.break_[0];
      }
   }

   private static void volatile_() {
      implements_ = new boolean[]{
         true,
         false,
         true,
         true,
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
         false,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
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
         true,
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

   private void native_() {
      this.package_();
      HashMap var1 = new HashMap((Map)this.break_[3]);
      ((Ps_1)this.case_[1]).class_().ifPresent(var2 -> {
         this.package_();
         if (((List)this.break_[1]).contains(var2)) {
            var1.put(var2, System.currentTimeMillis() + (Long)C_class.instanceof_().q.class_[0]);
         }
      });

      for (rfH_2 var3 : ((Map)this.break_[3]).keySet()) {
         if ((Long)var1.get(var3) < System.currentTimeMillis()) {
            var1.remove(var3);
         }
      }

      this.break_[3] = var1;
   }
}
