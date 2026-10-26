package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FastSwap extends Module {
   public Object[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static String[] throws_;

   public FastSwap() {
      super("Fast Swap", "Меняет предмет в основной руке", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[0]);
      this.super_();
      ArrayList var5 = new ArrayList();
      this.break_[0] = var5;
      rrCQ var6 = this.class_(new rrCQ(this));
      this.break_[1] = var6;
      rrCl_1 var7 = this.class_(new rrCl_1(this));
      this.break_[2] = var7;
      rrCc_1 var8 = this.class_(new rrCc_1(this));
      this.break_[3] = var8;
      rrCm_1 var9 = this.class_(new rrCm_1(this));
      this.break_[4] = var9;
      rrCL var10 = this.class_(new rrCL(this));
      this.break_[5] = var10;
      rrCn_1 var11 = this.class_(new rrCn_1(this));
      this.break_[6] = var11;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      throws_ = new String[]{new String("Fast Swap"), new String("Меняет предмет в основной руке")};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1441733385;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5758067580203938874L;
   }

   @Override
   public void class_(boolean var1) {
      this.super_();
      super.class_(var1);

      for (rrTF var3 : (List)this.break_[0]) {
         var3.aI_();
      }
   }

   public <T extends rrTF<?>> T class_(T var1) {
      this.super_();
      ((List)this.break_[0]).add(var1);
      return (T)var1;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{74, 97, 118, -80, 53, 52, -23, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.super_();
      super.throws_(var1);

      for (rrTF var3 : (List)this.break_[0]) {
         var3.aK_();
      }
   }

   private static void continue_() {
      byte_ = new byte[]{7};
   }

   private static void new_() {
      protected_ = new short[]{0, 0, 1, 2, 3, 4, 5, 6, 0, 0, 0};
   }

   private void super_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
      }
   }
}
