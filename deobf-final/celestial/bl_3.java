package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bl_3 implements rY_2 {
   private static short[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static String[] protected_;
   private static boolean[] throws_;

   @Override
   public rY_2 byte_(rpr_3 var1, int var2) {
      return this.class_(var1)
         ? new bl_3((rU_2)this.class_[0], ((rU_2)this.class_[1]).byte_(var1, var2))
         : new bl_3(((rU_2)this.class_[0]).byte_(var1, var2), (rU_2)this.class_[1]);
   }

   @Override
   public rU_2 byte_() {
      return (rU_2)this.class_[0];
   }

   public bl_3(rU_2 var1, rU_2 var2) {
      this.extends_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      rU_2 var9 = new rU_2(
         Math.min((Integer)var1.break_[0], (Integer)var2.break_[0]),
         Math.min((Integer)var1.break_[1], (Integer)var2.break_[1]),
         Math.min((Integer)var1.break_[2], (Integer)var2.break_[2])
      );
      this.class_[2] = var9;
      rU_2 var10 = new rU_2(
         Math.max((Integer)var1.break_[0], (Integer)var2.break_[0]),
         Math.max((Integer)var1.break_[1], (Integer)var2.break_[1]),
         Math.max((Integer)var1.break_[2], (Integer)var2.break_[2])
      );
      this.class_[3] = var10;
      rja_3 var11 = new rja_3(
         (Integer)((rU_2)this.class_[3]).break_[0] - (Integer)((rU_2)this.class_[2]).break_[0] + 1,
         (Integer)((rU_2)this.class_[3]).break_[1] - (Integer)((rU_2)this.class_[2]).break_[1] + 1,
         (Integer)((rU_2)this.class_[3]).break_[2] - (Integer)((rU_2)this.class_[2]).break_[2] + 1
      );
      this.class_[4] = var11;
      rfl_3 var12 = new rfl_3((rU_2)this.class_[2], ((rU_2)this.class_[3]).class_(1, 1, 1));
      this.class_[5] = var12;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return String.format("Selection{pos1=%s,pos2=%s}", (rU_2)this.class_[0], (rU_2)this.class_[1]);
   }

   @Override
   public int hashCode() {
      return ((rU_2)this.class_[0]).hashCode() ^ ((rU_2)this.class_[1]).hashCode();
   }

   @Override
   public rY_2 class_(double var1) {
      return new bl_3(((rU_2)this.class_[0]).break_(-var1, -var1, -var1), ((rU_2)this.class_[1]).break_(var1, var1, var1));
   }

   @Override
   public rY_2 class_(rpr_3 var1, int var2) {
      return new bl_3(((rU_2)this.class_[0]).byte_(var1, var2), ((rU_2)this.class_[1]).byte_(var1, var2));
   }

   private boolean class_(rpr_3 var1) {
      boolean var2 = var1.throws_().class_() < 0 ? true : throws_[9];
      switch (((int[])bH_2.class_[0])[var1.final_().ordinal()]) {
         case 1:
            return (((rU_2)this.class_[1]).break_[0] > ((rU_2)this.class_[0]).break_[0] ? true : throws_[11]) ^ var2;
         case 2:
            return (((rU_2)this.class_[1]).break_[1] > ((rU_2)this.class_[0]).break_[1] ? true : throws_[13]) ^ var2;
         case 3:
            return (((rU_2)this.class_[1]).break_[2] > ((rU_2)this.class_[0]).break_[2] ? true : throws_[15]) ^ var2;
         default:
            throw new IllegalStateException("Bad Direction.Axis");
      }
   }

   @Override
   public rU_2 class_() {
      return (rU_2)this.class_[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2644885729471228972L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1471830779;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-118, -51, -98, 38, 75, -31, -21, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public rY_2 break_(double var1) {
      return this.class_(-var1);
   }

   @Override
   public rfl_3 break_() {
      return (rfl_3)this.class_[5];
   }

   @Override
   public rY_2 break_(rpr_3 var1, int var2) {
      return this.class_(var1)
         ? new bl_3(((rU_2)this.class_[0]).byte_(var1, var2), (rU_2)this.class_[1])
         : new bl_3((rU_2)this.class_[0], ((rU_2)this.class_[1]).byte_(var1, var2));
   }

   @Override
   public rja_3 throws_() {
      return (rja_3)this.class_[4];
   }

   private static void finally_() {
      byte_ = new byte[]{2, 6};
   }

   private static void catch_() {
      protected_ = new String[]{new String("Selection{pos1=%s,pos2=%s}"), new String("Bad Direction.Axis")};
   }

   private void extends_() {
      if (this.class_ == null) {
         this.class_ = new Object[6];
         Object[] var1 = this.class_;
      }
   }

   @Override
   public rU_2 case_() {
      return (rU_2)this.class_[1];
   }

   private static void implements_() {
      break_ = new short[]{
         0,
         1,
         0,
         0,
         1,
         1,
         2,
         2,
         2,
         0,
         0,
         1,
         1,
         2,
         2,
         3,
         3,
         0,
         2,
         0,
         3,
         1,
         2,
         1,
         3,
         2,
         2,
         2,
         4,
         2,
         3,
         5,
         0,
         1,
         2,
         3,
         4,
         5,
         0,
         1,
         0,
         1,
         0,
         1,
         0,
         0,
         0,
         1,
         1,
         0,
         1,
         1,
         2,
         0,
         2,
         0,
         1,
         0,
         1,
         0,
         1,
         0,
         1,
         0,
         1,
         0,
         1
      };
   }

   @Override
   public rU_2 protected_() {
      return (rU_2)this.class_[3];
   }

   private static void private_() {
      throws_ = new boolean[]{true, true, true, true, true, true, false, true, true, false, true, false, true, false, true, false};
   }
}
