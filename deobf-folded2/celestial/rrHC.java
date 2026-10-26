package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHC implements rrHH {
   private static boolean[] id_break;
   private static String[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   private static void id_byte() {
      id_protected = new short[]{0, 0, 0, 57};
   }

   public rrHC(ChatHelper var1) {
      this.id_break();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public rVi_1 id_class(Aw_1 var1) {
      String var2 = var1.id_class().getName();
      rgN_2 var3 = new rgN_2(rgF_2.YELLOW + "Call");
      rgn_3 var4 = new rgn_3("chathelper.fastaction.call", var2);
      return rgv_3.id_class(var3, new rgy_3(rgp_3.id_class, var4), new rgl_3(() -> ((cb_3)MinecraftAccessor.id_import.id_class[57]).id_case("/call " + var2)));
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -763279024761319880L;
   }

   @Override
   public boolean id_class() {
      return ((rrIk_1)((ChatHelper)this.id_class[0]).id_break[0]).id_class();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1607747235;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, -110, 0, -3, 49, 75, 94, 63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   private static void id_throws() {
      id_break = new boolean[]{true, false, true};
   }

   private static void id_protected() {
      id_byte = new String[]{new String("chathelper.fastaction.call")};
   }
}
