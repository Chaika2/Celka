package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GroupSetting extends Setting<List<Setting<?>>> {
   private static boolean[] id_break;

   public GroupSetting(String var1, Setting<?>... var2) {
      super(var1, new ArrayList<>(List.of(var2)));
   }

   static {
      ntfClinit();
   }

   public void id_class(Setting<?> var1) {
      this.id_byte().add(var1);
   }

   private static void id_class() {
      id_break = new boolean[]{true, false, false};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1116085572;
   }

   public void id_class(Setting<?>... var1) {
      Setting[] var2 = var1;
      int var3 = var1.length;

      for (int var4 = id_break[2]; var4 < var3; var4++) {
         Setting var5 = var2[var4];
         this.id_class(var5);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1269229668225156864L;
   }

   public static String id_protected(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-84, -74, -123, -12, -44, 100, -92, -5}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_private() {
      List var1 = this.id_byte();
      return !super.id_private() || !var1.isEmpty() && !var1.stream().anyMatch(Setting::id_private) ? id_break[1] : true;
   }
}
