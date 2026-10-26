package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Go_1 extends bq_3 implements rF_2 {
   private static boolean[] throws_;
   public Object[] break_;
   private static String[] catch_;
   private static short[] private_;
   private static double[] implements_;
   private static byte[] finally_;

   private boolean byte_(xd_3 var1) {
      if (!(Boolean)C_class.instanceof_().rz.class_[0]) {
         return false;
      } else {
         return var1 != xu_3.PP && var1 != xu_3.Ps && var1 != xu_3.Xr && var1 != xu_3.SW && var1 != xu_3.re && var1 != xu_3.sZ ? throws_[31] : throws_[30];
      }
   }

   @Override
   public boolean byte_() {
      this.finally_();
      return (re_3)this.break_[0] != null ? true : throws_[5];
   }

   public Go_1(C_class var1) {
      super(var1);
      this.finally_();
      Integer var6 = 0;
      this.break_[4] = var6;
      Integer var7 = 0;
      this.break_[5] = var7;
   }

   static {
      ntfClinit();
   }

   private boolean class_(rfH_2 var1, rfH_2 var2) {
      int var3 = Math.abs(var1.b_() - var2.b_());
      int var4 = Math.abs(var1.c_() - var2.c_());
      int var5 = Math.abs(var1.d_() - var2.d_());
      return var3 + var4 + var5 == 1 ? true : throws_[16];
   }

   @Override
   public String class_() {
      this.finally_();
      return ((List)this.break_[1]).isEmpty()
         ? "Exploring randomly to find " + (re_3)this.break_[0] + ", no known locations"
         : "Get To " + (re_3)this.break_[0] + ", " + ((List)this.break_[1]).size() + " known locations";
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, -13, -46, -62, 14, -78, 61, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(re_3 var1) {
      this.finally_();
      this.protected_();
      this.break_[0] = var1;
      rU_2 var7 = ((Ps_1)this.case_[1]).volatile_();
      this.break_[3] = var7;
      ArrayList var8 = new ArrayList();
      this.break_[2] = var8;
      Integer var9 = 0;
      this.break_[5] = var9;
      this.break_(new ArrayList<>(), new GD(this, false));
   }

   private rP_2 class_(rfH_2 var1) {
      this.finally_();
      if (this.protected_(((re_3)this.break_[0]).break_())) {
         return new rh_3(var1);
      } else {
         return (rP_2)(this.break_(((re_3)this.break_[0]).break_()) && EF.catch_(((bw_3)((C_class)this.case_[0]).break_[34]).class_(var1.final_()))
            ? new rS_2(var1.final_())
            : new rE_2(var1));
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2057750871;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8475370078713254703L;
   }

   @Override
   public synchronized rn_3 class_(boolean var1, boolean var2) {
      this.finally_();
      if ((List)this.break_[1] == null) {
         this.break_(new ArrayList<>(), new GD(this, false));
      }

      if (((List)this.break_[1]).isEmpty()) {
         if ((Boolean)C_class.instanceof_().b.class_[0] && !var1) {
            return new rn_3(new GK(this, 1.0, (rfH_2)this.break_[3]), (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
         } else {
            this.case_("No known locations of " + (re_3)this.break_[0] + ", canceling GetToBlock");
            if (var2) {
               this.protected_();
            }

            return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
         }
      } else {
         rs_3 var3 = new rs_3(((List)this.break_[1]).stream().map(this::class_).toArray(rP_2[]::new));
         if (var1) {
            if ((Boolean)C_class.instanceof_().Ph.class_[0]) {
               this.case_("Unable to find any path to " + (re_3)this.break_[0] + ", blacklisting presumably unreachable closest instances...");
               this.private_();
               return this.class_(false, var2);
            } else {
               this.case_("Unable to find any path to " + (re_3)this.break_[0] + ", canceling GetToBlock");
               if (var2) {
                  this.protected_();
               }

               return new rn_3(var3, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
            }
         } else {
            int var4 = (Integer)C_class.instanceof_().Pf.class_[0];
            if (var4 != 0) {
               int var10002 = (Integer)this.break_[4];
               Integer var11 = var10002 + 1;
               this.break_[4] = var11;
               if (var10002 % var4 == 0) {
                  ArrayList var5 = new ArrayList((List)this.break_[1]);
                  GD var6 = new GD(this, true);
                  C_class.interface_().execute(() -> this.break_(var5, var6));
               }
            }

            if (var3.break_(((Ps_1)this.case_[1]).volatile_()) && var3.break_(((C_class)this.case_[0]).while_().super_()) && var2) {
               if (!this.byte_(((re_3)this.break_[0]).break_())) {
                  this.protected_();
                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
               }

               if (this.final_()) {
                  this.protected_();
                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
               }
            }

            return new rn_3(var3, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[3]);
         }
      }
   }

   private synchronized void break_(List<rfH_2> var1, EZ var2) {
      this.finally_();
      List var3 = Ge_1.class_(var2, new ra_3((re_3)this.break_[0]), 64, var1, (List<rfH_2>)this.break_[2], Collections.emptyList());
      var3.removeIf(((List)this.break_[2])::contains);
      this.break_[1] = var3;
   }

   private boolean break_(xd_3 var1) {
      if (!this.byte_(var1)) {
         return false;
      } else {
         return var1 != xu_3.SW && var1 != xu_3.re && var1 != xu_3.sZ ? throws_[34] : throws_[33];
      }
   }

   private void finally_() {
      if (this.break_ == null) {
         this.break_ = new Object[6];
         Object[] var1 = this.break_;
         var1[4] = 0;
         var1[5] = 0;
      }
   }

   private static void extends_() {
      catch_ = new String[]{new String("Right click timed out"), new String("Arrived but failed to right click open")};
   }

   private static void implements_() {
      private_ = new short[]{
         4,
         5,
         0,
         1,
         3,
         2,
         5,
         0,
         1,
         1,
         0,
         3,
         4,
         0,
         2,
         1,
         0,
         0,
         0,
         2,
         0,
         4,
         4,
         1,
         1,
         0,
         0,
         2,
         2,
         3,
         1,
         1,
         1,
         1,
         2,
         0,
         1,
         3,
         2,
         0,
         1,
         0,
         0,
         1,
         0,
         2,
         2,
         1,
         0,
         0,
         0,
         34,
         1,
         1,
         1,
         0,
         1,
         1,
         0,
         5,
         1,
         4,
         5,
         5,
         0,
         0,
         0
      };
   }

   private static void package_() {
      implements_ = new double[]{1.0};
   }

   private boolean protected_(xd_3 var1) {
      if (!(Boolean)C_class.instanceof_().P.class_[0]) {
         return false;
      } else {
         return var1 == xu_3.Pi ? true : throws_[28];
      }
   }

   @Override
   public synchronized void protected_() {
      this.finally_();
      super.protected_();
      Object var5 = null;
      this.break_[0] = var5;
      Object var6 = null;
      this.break_[1] = var6;
      Object var7 = null;
      this.break_[3] = var7;
      Object var8 = null;
      this.break_[2] = var8;
      ((C_class)this.case_[0]).int_().class_();
   }

   @Override
   public synchronized boolean private_() {
      this.finally_();
      ArrayList var1 = new ArrayList();
      ((List)this.break_[1]).stream().min(Comparator.comparingDouble(((Ps_1)this.case_[1]).volatile_()::private_)).ifPresent(var1::add);

      label32:
      while (true) {
         for (rfH_2 var3 : (List)this.break_[1]) {
            for (rfH_2 var5 : var1) {
               if (this.class_(var3, var5)) {
                  var1.add(var3);
                  ((List)this.break_[1]).remove(var3);
                  continue label32;
               }
            }
         }

         switch (var1.size()) {
            default:
               this.byte_("Blacklisting unreachable locations " + var1);
               ((List)this.break_[2]).addAll(var1);
               return !var1.isEmpty() ? true : throws_[13];
         }
      }
   }

   private boolean final_() {
      this.finally_();

      for (rfH_2 var2 : (List)this.break_[1]) {
         Optional var3 = PJ.class_(((Ps_1)this.case_[1]).catch_(), var2, ((Ps_1)this.case_[1]).native_().case_());
         if (var3.isPresent()) {
            ((C_class)this.case_[0]).private_().class_(((Px_1)var3.get()).class_(), true);
            if (((List)this.break_[1]).contains(((Ps_1)this.case_[1]).class_().orElse(null))) {
               ((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
               if (!((rJr_1)((Ps_1)this.case_[1]).catch_().implements_[4] instanceof rJT)) {
                  return true;
               }
            }

            int var10002 = (Integer)this.break_[5];
            Integer var8 = var10002 + 1;
            this.break_[5] = var8;
            if (var10002 > 20) {
               this.case_("Right click timed out");
               return true;
            }

            return throws_[24];
         }
      }

      this.case_("Arrived but failed to right click open");
      return true;
   }

   private static void volatile_() {
      finally_ = new byte[]{64, 20, 6, 4, 5};
   }

   private static void native_() {
      throws_ = new boolean[]{
         false,
         false,
         false,
         false,
         true,
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
         true,
         false,
         true,
         true,
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
         false,
         true,
         false,
         false,
         false
      };
   }
}
