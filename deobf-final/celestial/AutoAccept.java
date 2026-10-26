package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AutoAccept extends Module {
   private static boolean[] byte_;
   private static short[] protected_;
   public Object[] break_;
   private static String[] throws_;

   public AutoAccept() {
      super("Auto Accept", "Автоматически принимает\nзапросы на что-либо", (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[4]);
      this.super_();
      ArrayList var5 = new ArrayList();
      this.break_[0] = var5;
      this.class_(new rrlt_3(this));
      this.class_(new rrlq_3(this));
      this.class_(new rrlp_3(this));
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      byte_ = new boolean[]{true, false, true};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1269182477;
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

   public boolean class_(String[] var1) {
      Set var2 = Arrays.stream(var1).map(String::toLowerCase).collect(Collectors.toSet());
      Set var3 = ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_().keySet();

      for (String var5 : var2) {
         if (var3.contains(var5)) {
            return true;
         }
      }

      return byte_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7989256214832006234L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{38, 126, -100, -89, -97, 56, 99, 119}, "DES");
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
      throws_ = new String[]{new String("Auto Accept"), new String("Автоматически принимает\nзапросы на что-либо")};
   }

   private static void new_() {
      protected_ = new short[]{4, 0, 0, 0, 0, 0};
   }

   private void super_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
      }
   }
}
