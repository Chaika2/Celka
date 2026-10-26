package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrZN implements MinecraftAccessor {
   private static short[] break_;
   private static byte[] byte_;
   public Object[] class_;
   private static boolean[] protected_;

   public void byte_(int var1, int var2, int var3) {
   }

   public rrZN() {
      this.volatile_();
      rrvx_1 var5 = new rrvx_1();
      this.class_[0] = var5;
   }

   static {
      ntfClinit();
   }

   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6) {
      return var6 && rrtu_3.class_(var1, var2, var3) ? protected_[7] : protected_[6];
   }

   public void class_(rrFK var1) {
   }

   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      return var5 && rrtu_3.class_(var1, var2, var3) ? protected_[3] : protected_[2];
   }

   public void class_(Category var1, Category var2) {
      AnimValue var3 = this.implements_().class_();
      var3.extends_();
      if (this instanceof rrZT var4) {
         var4.case_().package_().extends_();
      }
   }

   public boolean class_(int var1, int var2, float var3, float var4, float var5, float var6) {
      return (float)var1 >= var3 && (float)var1 <= var3 + var5 && (float)var2 >= var4 && (float)var2 <= var4 + var6 ? true : protected_[12];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4406281564037110083L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -332116438;
   }

   public boolean class_(Ml_1 var1, rrtu_3 var2, float var3, float var4, float var5, float var6, int var7, int var8, boolean var9) {
      return var9 && rrtu_3.class_(var2, var7, var8) ? protected_[5] : protected_[4];
   }

   public boolean class_(int var1, int var2, int var3) {
      return false;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-109, 106, -17, -74, 48, -109, 44, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean class_(char var1, int var2) {
      return false;
   }

   public void break_(int var1, int var2, int var3) {
   }

   public void throws_() {
   }

   private static void finally_() {
      byte_ = new byte[]{2};
   }

   public void catch_() {
   }

   private static void extends_() {
      protected_ = new boolean[]{true, false, true, false, true, false, true, false, false, false, true, true, false, true, false};
   }

   public rrvx_1 implements_() {
      return (rrvx_1)this.class_[0];
   }

   public void protected_() {
   }

   public void private_() {
   }

   private void volatile_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = false;
      }
   }

   private static void native_() {
      break_ = new short[]{0, 1, 1, 1, 0};
   }

   public void d_(boolean var1) {
      Boolean var6 = var1;
      this.class_[1] = var6;
   }

   public boolean ai_() {
      return (Boolean)this.class_[1];
   }

   public boolean aj_() {
      return true;
   }

   public boolean ak_() {
      AnimValue var1 = this.implements_().class_();
      return this.class_[1] && var1.new_() && var1.protected_() ? true : protected_[1];
   }

   public rdn_3 ag_() {
      return null;
   }
}
