package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gd_1 extends bq_3 {
   public Object[] break_;
   private static boolean[] throws_;
   private static String[] catch_;
   private static double[] private_;
   private static short[] implements_;

   @Override
   public boolean byte_() {
      this.native_();
      if (((Ps_1)this.case_[1]).catch_() != null && ((Ps_1)this.case_[1]).case_() != null) {
         if (!(Boolean)C_class.instanceof_().B.class_[0]) {
            return false;
         } else if ((Boolean)C_class.instanceof_().double_.class_[0]) {
            this.case_("Backfill cannot be used with allowParkour true");
            C_extends var10000 = C_class.instanceof_().B;
            Boolean var7 = false;
            var10000.class_[0] = var7;
            return false;
         } else {
            for (rfH_2 var2 : new ArrayList(((HashMap)this.break_[0]).keySet())) {
               if (((Ps_1)this.case_[1]).case_().volatile_(var2) instanceof ron_3 || ((Ps_1)this.case_[1]).case_().byte_(var2).break_() != xu_3.class_) {
                  ((HashMap)this.break_[0]).remove(var2);
               }
            }

            this.volatile_();
            ((C_class)this.case_[0]).int_().class_();
            return !this.private_().isEmpty() ? true : throws_[5];
         }
      } else {
         return throws_[0];
      }
   }

   public Gd_1(C_class var1) {
      super(var1);
      this.native_();
      HashMap var6 = new HashMap();
      this.break_[0] = var6;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -718363754166185546L;
   }

   @Override
   public rn_3 class_(boolean var1, boolean var2) {
      if (!var2) {
         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
      } else {
         ((C_class)this.case_[0]).int_().class_();

         for (rfH_2 var4 : this.private_()) {
            EA var5 = new EA();
            switch (((int[])Gk_1.class_[0])[EF.class_(var5, (C_class)this.case_[0], var4, false, false).ordinal()]) {
               case 1:
                  break;
               case 2:
                  ((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
               case 3:
                  ((C_class)this.case_[0]).private_().class_(var5.class_().break_().get(), true);
                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
               default:
                  throw new IllegalStateException();
            }
         }

         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[5]);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, 35, -79, 24, 121, -112, 117, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private boolean class_(rfH_2 var1) {
      Gh_1 var2 = ((C_class)this.case_[0]).while_().new_();
      if (var2 != null && !var2.protected_() && !var2.private_()) {
         Ev_1 var3 = (Ev_1)var2.class_().catch_().get(var2.break_());
         return Arrays.asList(var3.finally_()).contains(var1);
      } else {
         return throws_[10];
      }
   }

   @Override
   public String class_() {
      return "Backfill";
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 847841638;
   }

   private static void finally_() {
      catch_ = new String[]{new String("Backfill cannot be used with allowParkour true"), new String("Backfill")};
   }

   @Override
   public boolean catch_() {
      return true;
   }

   private static void extends_() {
      throws_ = new boolean[]{false, false, false, false, true, false, false, false, true, true, false, true, true, false, true, false, true};
   }

   @Override
   public double case_() {
      return 5.0;
   }

   private static void implements_() {
      private_ = new double[]{5.0};
   }

   @Override
   public void protected_() {
      this.native_();
      super.protected_();
      if ((HashMap)this.break_[0] != null && !((HashMap)this.break_[0]).isEmpty()) {
         ((HashMap)this.break_[0]).clear();
      }
   }

   public List<rfH_2> private_() {
      this.native_();
      return ((HashMap)this.break_[0])
         .keySet()
         .stream()
         .filter(var1 -> ((Ps_1)this.case_[1]).case_().byte_(var1).break_() == xu_3.class_ ? true : throws_[15])
         .filter(var1 -> ((C_class)this.case_[0]).b().class_(var1, xu_3.finally_.continue_()))
         .filter(var1 -> !this.class_(var1) ? true : throws_[13])
         .sorted(Comparator.comparingDouble(((Ps_1)this.case_[1]).volatile_()::private_).reversed())
         .collect(Collectors.toList());
   }

   private static void final_() {
      implements_ = new short[]{0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 5, 1, 0, 1, 5, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1};
   }

   private void volatile_() {
      this.native_();
      if (((Ps_1)this.case_[1]).class_().isPresent() && ((C_class)this.case_[0]).while_().catch_()) {
         ((HashMap)this.break_[0]).put(((Ps_1)this.case_[1]).class_().get(), ((Ps_1)this.case_[1]).case_().byte_(((Ps_1)this.case_[1]).class_().get()));
      }
   }

   private void native_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }
}
