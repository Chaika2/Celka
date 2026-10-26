package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class HwHelper extends Module {
   public Object[] break_;
   private static byte[] byte_;
   private static short[] protected_;
   private static String[] throws_;

   public HwHelper() {
      super("HW Helper", "Утилитарный модуль для\nHolyWorld", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.else_();
      ArrayList var5 = new ArrayList();
      this.break_[0] = var5;
      rrpt_3 var6 = this.class_(new rrpt_3(this));
      this.break_[1] = var6;
      rrpg_3 var7 = this.class_(new rrpg_3(this));
      this.break_[2] = var7;
      rrpp_3 var8 = this.class_(new rrpp_3(this));
      this.break_[3] = var8;
      rrpf_3 var9 = this.class_(new rrpf_3(this));
      this.break_[4] = var9;
      rrpU_2 var10 = this.class_(new rrpU_2(this));
      this.break_[5] = var10;
      rrpo_3 var11 = this.class_(new rrpo_3(this));
      this.break_[6] = var11;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      protected_ = new short[]{4, 0, 1, 2, 3, 4, 5, 6, 0, 0, 0, 0};
   }

   @Override
   public void class_(boolean var1) {
      this.else_();
      super.class_(var1);

      for (rrTF var3 : (List)this.break_[0]) {
         var3.aI_();
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2772057757312276803L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 240166308;
   }

   public <T extends rrTF<?>> T class_(T var1) {
      this.else_();
      ((List)this.break_[0]).add(var1);
      return (T)var1;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-10, -54, 108, -17, 98, 47, -103, -108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void throws_(boolean var1) {
      this.else_();
      super.throws_(var1);

      for (rrTF var3 : (List)this.break_[0]) {
         var3.aK_();
      }
   }

   private static void continue_() {
      byte_ = new byte[]{7};
   }

   private void else_() {
      if (this.break_ == null) {
         this.break_ = new Object[7];
      }
   }

   public List<rrTF<?>> new_() {
      this.else_();
      return (List<rrTF<?>>)this.break_[0];
   }

   private static void super_() {
      throws_ = new String[]{new String("HW Helper"), new String("Утилитарный модуль для\nHolyWorld")};
   }
}
