package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GY extends bq_3 implements rv_3 {
   private static double[] throws_;
   public Object[] break_;
   private static byte[] catch_;
   private static short[] private_;
   private static boolean[] implements_;

   @Override
   public boolean byte_() {
      this.int_();
      if ((Predicate)this.break_[0] == null) {
         return false;
      } else {
         this.final_();
         return !((List)this.break_[1]).isEmpty() ? true : implements_[6];
      }
   }

   private void int_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
         var1[2] = false;
      }
   }

   public GY(C_class var1) {
      super(var1);
      this.int_();
   }

   static {
      ntfClinit();
   }

   private boolean class_(an_3 var1) {
      if (var1 == null) {
         return false;
      } else if (!var1.BM()) {
         return false;
      } else if (var1.equals(((Ps_1)this.case_[1]).catch_())) {
         return false;
      } else {
         int var2 = (Integer)C_class.instanceof_().interface_.class_[0];
         return var2 != 0 && var1.int_(((Ps_1)this.case_[1]).catch_()) > (double)(var2 * var2)
            ? false
            : ((Ps_1)this.case_[1]).implements_().anyMatch(var1::equals);
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{3, -30, 49, -31, -7, -5, -74, 12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public String class_() {
      this.int_();
      return "Following " + (List)this.break_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1705320050;
   }

   @Override
   public void class_(Predicate<rdn_3> var1) {
      this.int_();
      Predicate var6 = var1x -> {
         if (var1x instanceof rsE_2 var2 && var1.test(var2.protected_())) {
            return true;
         }

         return implements_[10];
      };
      this.break_[0] = var6;
      Boolean var7 = true;
      this.break_[2] = var7;
   }

   @Override
   public rn_3 class_(boolean var1, boolean var2) {
      this.int_();
      this.final_();
      rs_3 var3 = new rs_3(((List)this.break_[1]).stream().map(this::break_).toArray(rP_2[]::new));
      return new rn_3(var3, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[3]);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7993086142113992714L;
   }

   private rP_2 break_(an_3 var1) {
      this.int_();
      Object var2;
      if ((Double)C_class.instanceof_().while_.class_[0] != 0.0 && !(Boolean)this.break_[2]) {
         rX_2 var3 = rX_2.class_(var1.Ps(), (Float)C_class.instanceof_().PE.class_[0], (Double)C_class.instanceof_().while_.class_[0]);
         var2 = new rU_2((double)var3.byte_(), var1.Ps().byte_, (double)var3.break_());
      } else {
         var2 = var1.Bs();
      }

      return (rP_2)(this.break_[2] ? new rS_2((rfH_2)var2) : new rb_3((rfH_2)var2, (Integer)C_class.instanceof_().T.class_[0]));
   }

   @Override
   public void break_(Predicate<an_3> var1) {
      this.int_();
      this.break_[0] = var1;
      Boolean var7 = false;
      this.break_[2] = var7;
   }

   @Override
   public Predicate<an_3> finally_() {
      this.int_();
      return (Predicate<an_3>)this.break_[0];
   }

   private static void extends_() {
      implements_ = new boolean[]{false, false, false, false, false, true, false, false, true, true, false, false};
   }

   @Override
   public List<an_3> implements_() {
      this.int_();
      return (List<an_3>)this.break_[1];
   }

   private static void package_() {
      private_ = new short[]{1, 3, 0, 2, 0, 0, 2, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 2, 0, 2, 1, 0};
   }

   @Override
   public void protected_() {
      this.int_();
      super.protected_();
      Object var5 = null;
      this.break_[0] = var5;
      Object var6 = null;
      this.break_[1] = var6;
   }

   private void final_() {
      this.int_();
      List var5 = ((Ps_1)this.case_[1])
         .implements_()
         .filter(this::class_)
         .filter((Predicate<? super an_3>)this.break_[0])
         .distinct()
         .collect(Collectors.toList());
      this.break_[1] = var5;
   }

   private static void volatile_() {
      catch_ = new byte[]{3, 2};
   }

   private static void native_() {
      throws_ = new double[1];
   }
}
