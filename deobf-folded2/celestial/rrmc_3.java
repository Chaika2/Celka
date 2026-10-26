package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmc_3 implements rruT<xd_3>, rruq_1 {
   private static String[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_break = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n")};
   }

   rrmc_3(rrmW_2 var1) {
      this.id_break();
      this.id_class[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5303252691636795084L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -820355685;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{125, 94, 33, -40, 39, -64, -78, 7}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(C_static var1) {
      ((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).id_class(var1x -> {
         rVe_1 var2 = this.id_class(var1x);
         ((rrmW_2)this.id_class[0]).id_class(new rVi_1[]{var2});
      });
   }

   public rVe_1 id_class(xd_3 var1) {
      String var2 = var1.id_native().getString();
      rVe_1 var3 = new rVe_1(" - ");
      var3.id_class(new rgN_2("Удалить").id_class(var3.id_class().id_class(rgF_2.RED)));
      rVe_1 var4 = new rVe_1("");
      var4.id_class(var4.id_class().id_class(rgF_2.GRAY));
      var4.id_class(String.join("\n", "Нажмите чтобы удалить '" + var2 + "' из списка блоков"));
      var3.id_class(var3.id_class().id_class(new rgy_3(rgp_3.id_class, var4)));
      rVe_1 var5 = rrfu_3.id_class((Object)var2).id_break();
      var5.id_class(var5.id_class().id_class(rgF_2.GRAY));
      var5.id_class(var3);
      var5.id_class(var5.id_class().id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[0] + "nuker remove " + var2)));
      return var5;
   }

   private static void id_class() {
      id_byte = new short[4];
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_protected() {
      id_protected = new boolean[]{true, false, true, false, true};
   }
}
