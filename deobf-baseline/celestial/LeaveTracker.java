package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class LeaveTracker extends Module {
   private static float[] id_break;
   private static String[] id_byte;
   private static short[] id_protected;

   public LeaveTracker() {
      super(id_byte[0], id_byte[1], (Category)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_protected[0]]);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1556851786;
   }

   @EventTarget
   public void id_class(rrAQ var1) {
      if (var1.id_class() instanceof cG_2 var3) {
         if (var3 == (cb_3)id_import.id_class[id_protected[1]]
            || var3.sc()
            || ((cb_3)id_import.id_class[id_protected[2]]).id_implements(var3) < id_break[0]
            || ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_protected[3]]).id_class(var3)) {
            return;
         }

         Object var4 = rrfu_3.id_class((Module)this);
         rgN_2 var5 = new rgN_2(rgF_2.GRAY + var4 + var3.id_extends() + " ливнул на " + var3.PG());
         rgN_2 var6 = new rgN_2(rgF_2.GRAY + "Нажмите чтобы скопировать координаты");
         Runnable var7 = () -> {
            ((Qj_1)id_import.id_class[id_protected[4]]).id_class((int)var3.rx() + " " + (int)var3.re() + " " + (int)var3.BO());
            rrfu_3.id_byte(var4 + "Координаты скопированы в буфер обмена");
         };
         rVi_1 var8 = rgv_3.id_class(var5, new rgy_3(rgp_3.id_class, var6), new rgl_3(var7));
         rrfu_3.id_class(var8);
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3220178965759834904L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{99, -76, 41, 17, -28, -114, -113, 29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_continue() {
      id_break = new float[]{100.0F};
   }

   private static void id_new() {
      id_byte = new String[]{new String("Leave Tracker"), new String("Отслеживает позицию телепорта\nигроков")};
   }

   private static void id_super() {
      id_protected = new short[]{4, 57, 57, 0, 23};
   }
}
