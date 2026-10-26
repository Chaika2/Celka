package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvD implements rrvU {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static byte[] protected_;
   private static float[] throws_;

   @Override
   public boolean byte_() {
      return false;
   }

   public rrvD(rdn_3 var1) {
      this.final_();
      AnimValue var6 = new AnimValue(0.5F, false);
      this.class_[4] = var6;
      this.class_[0] = var1;
      String var8 = rrvK.byte_(var1.continue_().byte_());
      this.class_[1] = var8;
      String var9 = this.extends_();
      this.class_[2] = var9;
      Integer var10 = this.implements_();
      this.class_[3] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         rrvD var2 = (rrvD)var1;
         return Objects.equals(((rdn_3)this.class_[0]).continue_(), ((rdn_3)var2.class_[0]).continue_());
      } else {
         return byte_[6];
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(((rdn_3)this.class_[0]).continue_());
   }

   @Override
   public String class_() {
      return (String)this.class_[2];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8414222941013334400L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -969812477;
   }

   @Override
   public void class_(boolean var1) {
      ((AnimValue)this.class_[4]).class_(var1);
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{8, 77, 85, 104, 119, 35, 115, -120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public AnimValue break_() {
      return (AnimValue)this.class_[4];
   }

   public void throws_() {
      Integer var5 = this.implements_();
      this.class_[3] = var5;
      String var6 = this.extends_();
      this.class_[2] = var6;
   }

   private static void finally_() {
      break_ = new short[]{4, 0, 1, 2, 3, 1, 2, 4, 3, 3, 2, 3, 57, 57, 0, 57, 0, 0, 0, 0, 0, 3, 4};
   }

   @Override
   public boolean catch_() {
      return this.class_[3] > 0 ? true : byte_[2];
   }

   private String extends_() {
      return rql_3.class_((Integer)this.class_[3]);
   }

   @Override
   public String case_() {
      return (String)this.class_[1];
   }

   int implements_() {
      return (cb_3)MinecraftAccessor.import_.class_[57] == null
         ? 0
         : Math.max(
            ((cb_3)MinecraftAccessor.import_.class_[57]).sK().protected_(((rdn_3)this.class_[0]).break_()),
            ((cb_3)MinecraftAccessor.import_.class_[57]).r().byte_((rdn_3)this.class_[0])
         );
   }

   private static void package_() {
      protected_ = new byte[]{5, 3};
   }

   public int protected_() {
      return (Integer)this.class_[3];
   }

   public rdn_3 private_() {
      return (rdn_3)this.class_[0];
   }

   private void final_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
         var1[3] = 0;
      }
   }

   private static void volatile_() {
      byte_ = new boolean[]{false, true, false, false, false, true, false, false};
   }

   private static void native_() {
      throws_ = new float[]{0.5F};
   }
}
