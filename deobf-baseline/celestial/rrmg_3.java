package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmg_3 implements rruT<rrjD_2>, rruq_1 {
   private static boolean[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static String[] id_protected;

   private static void id_byte() {
      id_break = new boolean[]{true, false, true, false, true};
   }

   rrmg_3(rrmf_3 var1) {
      this.id_protected();
      this.id_class[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1772241081;
   }

   public rVe_1 id_class(rrjD_2 var1) {
      rVe_1 var2 = new rVe_1(id_protected[0]);
      var2.id_class(new rgN_2(id_protected[1]).id_class(var2.id_class().id_class(rgF_2.RED)));
      rVe_1 var3 = new rVe_1(id_protected[2]);
      var3.id_class(var3.id_class().id_class(rgF_2.GRAY));
      String var10001 = id_protected[3];
      CharSequence[] var10002 = new CharSequence[id_break[0]];
      var10002[id_break[1]] = "Нажмите чтобы удалить '" + var1.id_byte() + "' из вейпоинтов";
      var3.id_class(String.join(var10001, var10002));
      var2.id_class(var2.id_class().id_class(new rgy_3(rgp_3.id_class, var3)));
      eX_2 var4 = var1.id_break();
      rVe_1 var5 = rrfu_3.id_class(var1.id_byte())
         .id_break()
         .id_class(" | X: " + (int)var4.id_class() + " Y: " + (int)var4.id_break() + " Z: " + (int)var4.id_byte());
      var5.id_class(var5.id_class().id_class(rgF_2.GRAY));
      var5.id_class(var2);
      var5.id_class(
         var5.id_class()
            .id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_byte[2]] + "waypoint remove " + var1.id_byte()))
      );
      return var5;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3235561371888517021L;
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_byte[1]]).id_class(var1x -> {
         rVe_1 var2 = this.id_class(var1x);
         rrmf_3 var10000 = (rrmf_3)this.id_class[id_byte[3]];
         rVi_1[] var10001 = new rVi_1[id_break[2]];
         var10001[id_break[3]] = var2;
         var10000.id_class(var10001);
      });
   }

   private static void id_class() {
      id_byte = new short[4];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-80, 44, -122, -38, 41, 74, 23, -1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_protected = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n")};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[4]];
         Object[] var1 = this.id_class;
      }
   }
}
