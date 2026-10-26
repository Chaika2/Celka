package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmU_2 implements rruT<rrqz_3>, rruq_1 {
   private static boolean[] id_break;
   private static String[] id_byte;
   private static short[] id_protected;
   public Object[] id_class;

   private static void id_byte() {
      id_byte = new String[]{new String(" - "), new String("Удалить"), new String(""), new String("\n")};
   }

   rrmU_2(rrmY_2 var1) {
      this.id_class();
      this.id_class[id_protected[0]] = var1;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(C_static var1) {
      ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_protected[1]]).id_class(var1x -> {
         rVe_1 var2 = this.id_class(var1x);
         rrmY_2 var10000 = (rrmY_2)this.id_class[id_protected[3]];
         rVi_1[] var10001 = new rVi_1[1];
         var10001[id_break[3]] = var2;
         var10000.id_class(var10001);
      });
   }

   public rVe_1 id_class(rrqz_3 var1) {
      String var2 = var1.id_break();
      rVe_1 var3 = new rVe_1(id_byte[0]);
      var3.id_class(new rgN_2(id_byte[1]).id_class(var3.id_class().id_class(rgF_2.RED)));
      rVe_1 var4 = new rVe_1(id_byte[2]);
      var4.id_class(var4.id_class().id_class(rgF_2.GRAY));
      String var10001 = id_byte[3];
      CharSequence[] var10002 = new CharSequence[1];
      var10002[id_break[1]] = "Нажмите чтобы удалить '" + var2 + "' из списка блоков";
      var4.id_class(String.join(var10001, var10002));
      var3.id_class(var3.id_class().id_class(new rgy_3(rgp_3.id_class, var4)));
      rVe_1 var5 = rrfu_3.id_class((Object)var2).id_break();
      var5.id_class(var5.id_class().id_class(rgF_2.GRAY));
      var5.id_class(var3);
      var5.id_class(
         var5.id_class().id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_protected[2]] + "xray remove " + var2))
      );
      return var5;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -907121634;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 95488440474732932L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -96, 7, 85, 23, 102, 127, 111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_break() {
      id_break = new boolean[]{true, false, true, false, true};
   }

   private static void id_protected() {
      id_protected = new short[4];
   }
}
