package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GZ extends rE_2 {
   private static byte[] byte_;
   private static boolean[] protected_;
   public Object[] break_;
   private static short[] throws_;
   private static int[] case_;
   private static String[] catch_;

   private static void byte_() {
      catch_ = new String[]{new String("GoalAdjacent{x=%s,y=%s,z=%s}")};
   }

   public GZ(rfH_2 var1, rfH_2 var2, boolean var3) {
      super(var1);
      this.catch_();
      this.break_[1] = var2;
      Boolean var9 = var3;
      this.break_[0] = var9;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      this.catch_();
      if (!super.equals(var1)) {
         return false;
      } else {
         GZ var2 = (GZ)var1;
         return this.break_[0] == var2.break_[0] && Objects.equals((rfH_2)this.break_[1], (rfH_2)var2.break_[1]) ? true : protected_[8];
      }
   }

   @Override
   public String toString() {
      return String.format(
         "GoalAdjacent{x=%s,y=%s,z=%s}", Pd_1.class_((Integer)this.class_[0]), Pd_1.class_((Integer)this.class_[1]), Pd_1.class_((Integer)this.class_[2])
      );
   }

   @Override
   public int hashCode() {
      this.catch_();
      int var1 = 806368046;
      var1 = var1 * 1412661222 + super.hashCode();
      var1 = var1 * 1730799370 + (int)rU_2.byte_(((rfH_2)this.break_[1]).b_(), ((rfH_2)this.break_[1]).c_(), ((rfH_2)this.break_[1]).d_());
      return var1 * 260592149 + (this.break_[0] ? -1314802005 : case_[5]);
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      return (double)((Integer)this.class_[1] * 100) + super.class_(var1, var2, var3);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 744258569;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -891718153692355820L;
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      this.catch_();
      if (var1 == (Integer)this.class_[0] && var2 == (Integer)this.class_[1] && var3 == (Integer)this.class_[2]) {
         return false;
      } else if (var1 == ((rfH_2)this.break_[1]).b_() && var2 == ((rfH_2)this.break_[1]).c_() && var3 == ((rfH_2)this.break_[1]).d_()) {
         return false;
      } else if (!(Boolean)this.break_[0] && var2 == (Integer)this.class_[1] - 1) {
         return false;
      } else {
         return var2 < this.class_[1] - 1 ? false : super.break_(var1, var2, var3);
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{87, 23, -60, -9, 88, 11, -48, 33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      byte_ = new byte[]{100, 3, 2, 2};
   }

   private void catch_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
         var1[0] = false;
      }
   }

   private static void case_() {
      throws_ = new short[]{1, 0, 0, 1, 2, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 2};
   }

   private static void protected_() {
      case_ = new int[]{806368046, 1412661222, 1730799370, 260592149, -1314802005, 1565710265};
   }

   private static void private_() {
      protected_ = new boolean[]{false, false, true, false, true, false, false, true, false, false, true, false, false};
   }
}
