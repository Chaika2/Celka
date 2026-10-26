package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pa_1 extends Pv_1 implements PP {
   private static boolean[] throws_;
   public Object[] break_;
   private static byte[] case_;
   private static short[] catch_;

   private static void byte_() {
      catch_ = new short[]{0, 0, 0, 74, 74, 0, 74, 74, 74, 0, 64, 0, 0, 0};
   }

   public Pa_1(C_class var1) {
      super(var1);
      this.throws_();
      HashSet var6 = new HashSet();
      this.break_[0] = var6;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_(rrFK var1) {
      this.throws_();
      ((Set)this.break_[0]).clear();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3465471855421415170L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -37821508;
   }

   @Override
   public void class_(q_1 var1) {
      this.throws_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         Iterator var2 = ((Set)this.break_[0]).iterator();

         while (var2.hasNext()) {
            Pi_1 var3 = (Pi_1)var2.next();
            iB_2 var4 = var3.break_();
            rjG_2 var5 = var3.class_();
            Integer var10 = (Integer)var4.private_[74] + 1;
            var4.private_[74] = var10;
            if (!var4.Pu()) {
               ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrnx_3.class_(var4, var5));
               var2.remove();
            } else if ((Integer)var4.private_[74] > 5) {
               var2.remove();
               Integer var11 = 0;
               var4.private_[74] = var11;
            }
         }
      }
   }

   public Set<Pi_1> class_() {
      this.throws_();
      return (Set<Pi_1>)this.break_[0];
   }

   @Override
   public void class_(rrFj_1 var1) {
      this.throws_();
      if (var1.class_() instanceof iB_2 var3) {
         Integer var8 = 0;
         var3.private_[74] = var8;
         ((Set)this.break_[0]).add(new Pi_1(var3, (rjG_2)b_.class_[64]));
      }
   }

   @Override
   public void class_(rrAQ var1) {
      this.throws_();
      ((Set)this.break_[0]).removeIf(var1x -> var1x.break_().equals(var1.class_()));
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{23, 93, 42, -107, 90, 77, -60, 69}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      case_ = new byte[]{5};
   }

   private void throws_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   private static void protected_() {
      throws_ = new boolean[]{true, false, false, true};
   }
}
