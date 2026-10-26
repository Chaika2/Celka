package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class GuiComponent implements MinecraftAccessor {
   private static boolean[] class_;

   public rdn_3 byte_() {
      return null;
   }

   static {
      ntfClinit();
   }

   public boolean class_(char var1, int var2) {
      return false;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2008534072;
   }

   public boolean class_(rrtu_3 var1, int var2, int var3, int var4, boolean var5) {
      boolean var10000;
      label21: {
         if (this.class_() instanceof rrZT var7 && var7.case_().finally_()) {
            var10000 = true;
            break label21;
         }

         var10000 = class_[1];
      }

      boolean var6 = var10000;
      return this.protected_().break_((float)var2, (float)var3) && !var6 ? true : class_[3];
   }

   public void class_(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
   }

   public boolean class_(int var1, int var2, int var3) {
      return false;
   }

   public void class_(Category var1, Category var2) {
   }

   public boolean class_(rrtu_3 var1, int var2, int var3, double var4, boolean var6, boolean var7) {
      return true;
   }

   public abstract rrZN class_();

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4395724268278196479L;
   }

   public void break_(int var1, int var2, int var3) {
   }

   public void break_(Ml_1 var1, rrtu_3 var2, int var3, int var4, rruv_1 var5, boolean var6, boolean var7) {
   }

   private static void break_() {
      class_ = new boolean[]{true, false, true, false, true, false, false};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-47, -14, 26, -98, 94, 94, 81, 24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public abstract rruv_1 protected_();

   public void final_() {
   }

   public void am_() {
   }

   public void an_() {
   }

   public void al_() {
   }
}
