package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruj_1 implements rruT<Module>, rruq_1 {
   private static String[] id_break;
   private static short[] id_byte;
   public Object[] id_class;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_protected = new boolean[]{true, false, true, false, true};
   }

   rruj_1(rruf_1 var1) {
      this.id_protected();
      this.id_class[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   public rVe_1 id_class(Module var1) {
      rVe_1 var2 = new rVe_1(id_break[0]);
      var2.id_class(new rgN_2(id_break[1]).id_class(var2.id_class().id_class(rgF_2.RED)));
      rVe_1 var3 = new rVe_1(id_break[2]);
      var3.id_class(var3.id_class().id_class(rgF_2.GRAY));
      String var10001 = id_break[3];
      CharSequence[] var10002 = new CharSequence[id_protected[0]];
      var10002[id_protected[1]] = "Нажмите чтобы сбросить бинд у '" + var1.id_final() + "'";
      var3.id_class(String.join(var10001, var10002));
      var2.id_class(var2.id_class().id_class(new rgy_3(rgp_3.id_class, var3)));
      rVe_1 var4 = rrfu_3.id_class(var1.id_final()).id_break().id_class(rgF_2.GRAY + " [" + var1.id_package().id_break() + "]");
      var4.id_class(var4.id_class().id_class(rgF_2.GRAY));
      var4.id_class(var2);
      var4.id_class(var4.id_class().id_class(new rgl_3(() -> ((rrvw_1)rrvw_1.staticFieldsb5a707e7713735c98363c6b6bc5591b6[id_byte[2]]).id_class(var1))));
      return var4;
   }

   @Override
   public void id_class(C_static var1) {
      ((rrvw_1)rrvw_1.staticFieldsb5a707e7713735c98363c6b6bc5591b6[id_byte[1]]).id_class(var1x -> {
         rVe_1 var2 = this.id_class(var1x);
         rruf_1 var10000 = (rruf_1)this.id_class[id_byte[3]];
         rVi_1[] var10001 = new rVi_1[id_protected[2]];
         var10001[id_protected[3]] = var2;
         var10000.id_class(var10001);
      });
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5872283121780540937L;
   }

   private static void id_class() {
      id_break = new String[]{new String(" - "), new String("Сбросить"), new String(""), new String("\n")};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, 82, 2, -10, 94, -96, 12, -114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1103116183;
   }

   private static void id_break() {
      id_byte = new short[4];
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_protected[4]];
         Object[] var1 = this.id_class;
      }
   }
}
