package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHn_1 implements rrHH {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;
   private static String[] id_protected;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
      }
   }

   public rrHn_1(ChatHelper var1) {
      this.id_byte();
      this.id_class[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 547195259;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1027650636904956267L;
   }

   @Override
   public boolean id_class() {
      return ((rrIk_1)((ChatHelper)this.id_class[id_byte[1]]).id_break[2]).id_class();
   }

   @Override
   public rVi_1 id_class(Aw_1 var1) {
      String var2 = var1.id_class().getName();
      rgN_2 var3 = new rgN_2(rgF_2.YELLOW + "Ah");
      String var10002 = id_protected[0];
      Object[] var10003 = new Object[1];
      var10003[id_break[1]] = var2;
      rgn_3 var4 = new rgn_3(var10002, var10003);
      return rgv_3.id_class(var3, new rgy_3(rgp_3.id_class, var4), new rgl_3(() -> ((cb_3)MinecraftAccessor.id_import.id_class[57]).id_case("/ah " + var2)));
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-15, 15, -26, -117, -67, 117, 92, 21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_protected = new String[]{new String("chathelper.fastaction.ahsearch")};
   }

   private static void id_throws() {
      id_byte = new short[]{0, 0, 2, 57};
   }

   private static void id_protected() {
      id_break = new boolean[]{true, false, true};
   }
}
