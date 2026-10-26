package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrNO extends Pv_1 implements MinecraftAccessor {
   private static byte[] byte_;
   private static String[] protected_;
   public Object[] break_;
   private static double[] throws_;
   private static short[] case_;
   private static boolean[] catch_;

   public void byte_() throws IllegalStateException {
      this.break_(!this.private_() ? true : catch_[11]);
   }

   private static void int_() {
      protected_ = new String[]{new String("Нельзя включить покупку, пока активен парсер"), new String("Нельзя включить парсер, пока активна покупка")};
   }

   public rrNO(C_class var1, rrfq_3... var2) {
      super(var1);
      this.new_();
      Set var7 = Set.of(var2);
      this.break_[0] = var7;
   }

   static {
      ntfClinit();
   }

   public List<LZ> class_(Fu_1<?> var1, String var2, int var3, int var4, int var5) {
      return null;
   }

   public void class_(Fu_1<?> var1, rrNV var2) {
   }

   public void class_(boolean var1) {
      this.new_();
      if (var1 && this.private_()) {
         throw new IllegalStateException("Нельзя включить покупку, пока активен парсер");
      } else {
         Boolean var6 = var1;
         this.break_[1] = var6;
         if ((Boolean)this.break_[1]) {
            this.protected_();
         } else {
            this.class_();
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5670072928212234382L;
   }

   public void class_() {
   }

   public int class_(int var1, int var2) {
      double var3 = ((Qw_1)import_.class_[20]).rS;
      return (int)((double)var1 * (1.0 - var3 / 100.0) / (double)var2);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 377425424;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-108, 35, -92, -15, 53, -22, -113, -118}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void break_(boolean var1) throws IllegalStateException {
      this.new_();
      if (this.case_() && var1) {
         throw new IllegalStateException("Нельзя включить парсер, пока активна покупка");
      } else {
         Boolean var6 = var1;
         this.break_[2] = var6;
         if ((Boolean)this.break_[2]) {
            this.throws_();
         } else {
            this.extends_();
         }
      }
   }

   public boolean break_() {
      return (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2] ? true : catch_[1];
   }

   public void throws_() {
   }

   public Set<rrfq_3> finally_() {
      this.new_();
      return (Set<rrfq_3>)this.break_[0];
   }

   public void catch_() {
      this.new_();
      if ((Boolean)this.break_[1]) {
         this.class_(false);
      }

      if ((Boolean)this.break_[2]) {
         this.break_(false);
      }
   }

   public void extends_() {
   }

   public boolean case_() {
      this.new_();
      if (!(Boolean)this.break_[1]) {
         return false;
      } else {
         rrfq_3 var1 = (rrfq_3)rrfp_3.class_[1];
         return var1 != null && ((Set)this.break_[0]).contains(var1) ? catch_[4] : catch_[3];
      }
   }

   private static void continue_() {
      throws_ = new double[]{1.0, 100.0};
   }

   public void implements_() throws IllegalStateException {
      this.class_(!this.case_() ? true : catch_[9]);
   }

   private void new_() {
      if (this.break_ == null) {
         this.break_ = new Object[3];
         Object[] var1 = this.break_;
         var1[1] = false;
         var1[2] = false;
      }
   }

   private static void package_() {
      byte_ = new byte[]{3, 2};
   }

   private static void super_() {
      catch_ = new boolean[]{true, false, false, false, true, false, false, true, true, false, true, false, false, false, true, false, false};
   }

   public void protected_() {
   }

   public boolean private_() throws IllegalStateException {
      this.new_();
      if (!(Boolean)this.break_[2]) {
         return false;
      } else {
         rrfq_3 var1 = (rrfq_3)rrfp_3.class_[1];
         return var1 != null && ((Set)this.break_[0]).contains(var1) ? catch_[7] : catch_[6];
      }
   }

   private static void final_() {
      case_ = new short[]{0, 1, 2, 1, 1, 0, 2, 1, 0, 20, 1, 1, 2, 2, 1, 2, 0};
   }
}
