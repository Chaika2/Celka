package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GroupSetting extends Setting<List<Setting<?>>> {
   private static boolean[] break_;

   public GroupSetting(String var1, Setting<?>... var2) {
      super(var1, new ArrayList<>(List.of(var2)));
   }

   static {
      ntfClinit();
   }

   public void class_(Setting<?> var1) {
      this.byte_().add(var1);
   }

   private static void class_() {
      break_ = new boolean[]{true, false, false};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1116085572;
   }

   public void class_(Setting<?>... var1) {
      for (Setting var5 : var1) {
         this.class_(var5);
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1269229668225156864L;
   }

   public static String protected_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, -74, -123, -12, -44, 100, -92, -5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean private_() {
      List var1 = this.byte_();
      return !super.private_() || !var1.isEmpty() && !var1.stream().anyMatch(Setting::private_) ? break_[1] : break_[0];
   }
}
