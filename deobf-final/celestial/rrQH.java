package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrQH extends vm_3 {
   private static byte[] throws_;
   private static short[] case_;
   private static boolean[] catch_;
   public Object[] class_;

   public rrQH(rgP_2 var1, vm_3 var2, vm_3 var3) {
      super(var1);
      this.package_();
      this.class_[0] = var2;
      this.class_[1] = var3;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-29, -25, -39, 21, -96, 6, -122, -4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7217574025071726421L;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -338405534;
   }

   private static void finally_() {
      case_ = new short[]{0, 1, 2, 3, 2, 1, 0};
   }

   private void package_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[2] = false;
         var1[3] = false;
      }
   }

   @Override
   public void private_() {
      this.package_();
      super.private_();
      if ((Boolean)this.class_[2] && (Boolean)this.class_[3]) {
         this.volatile_();
      }
   }

   private static void final_() {
      catch_ = new boolean[2];
   }

   @Override
   public void volatile_() {
      this.package_();
      super.volatile_();
      import_.break_(this.class_[2] ? (vm_3)this.class_[1] : (vm_3)this.class_[0]);
   }

   private static void native_() {
      throws_ = new byte[]{4, 2, 3};
   }

   @Override
   public void v_() {
      super.v_();
   }
}
