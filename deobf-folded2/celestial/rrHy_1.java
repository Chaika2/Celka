package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHy_1 implements rrHH {
   private static boolean[] id_break;
   private static String[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   private static void id_byte() {
      id_protected = new short[]{0, 0, 1, 57};
   }

   public rrHy_1(ChatHelper var1) {
      this.id_throws();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1352108435;
   }

   @Override
   public boolean id_class() {
      return ((rrIk_1)((ChatHelper)this.id_class[0]).id_break[1]).id_class();
   }

   @Override
   public rVi_1 id_class(Aw_1 var1) {
      String var2 = var1.id_class().getName();
      rgN_2 var3 = new rgN_2(rgF_2.YELLOW + "Invsee");
      rgn_3 var4 = new rgn_3("chathelper.fastaction.invsee", var2);
      return rgv_3.id_class(var3, new rgy_3(rgp_3.id_class, var4), new rgl_3(() -> ((cb_3)MinecraftAccessor.id_import.id_class[57]).id_case("/invsee " + var2)));
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{55, -105, -54, 119, 1, -36, 27, 16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3043644053810448757L;
   }

   private static void id_break() {
      id_break = new boolean[]{true, false, true};
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   private static void id_protected() {
      id_byte = new String[]{new String("chathelper.fastaction.invsee")};
   }
}
