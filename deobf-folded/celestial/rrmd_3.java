package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmd_3 implements rruT<rrvm_1>, rruq_1 {
   public Object[] id_class;
   private static String[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_break = new String[]{
         new String(""),
         new String("\n"),
         new String(""),
         new String(""),
         new String("\n"),
         new String("\nНазвание: "),
         new String("\nКлавиша: "),
         new String("\nКоманда: ")
      };
   }

   rrmd_3(rrmX_2 var1) {
      this.id_class();
      this.id_class[id_byte[0]] = var1;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{97, 53, -59, -27, -43, -49, 47, 48}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 944904070559177472L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -473532622;
   }

   @Override
   public void id_class(C_static var1) {
      ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_byte[1]]).id_class(var1x -> {
         rVe_1 var2 = this.id_class(var1x);
         rrmX_2 var10000 = (rrmX_2)this.id_class[id_byte[4]];
         rVi_1[] var10001 = new rVi_1[1];
         var10001[id_protected[4]] = var2;
         var10000.id_class(var10001);
      });
   }

   public rVe_1 id_class(rrvm_1 var1) {
      Set var2 = ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_byte[2]]).id_byte();
      int var3 = var2.stream().toList().indexOf(var1) + 1;
      String var4 = "Макрос #" + var3;
      String var5 = "\nНажмите чтобы удалить" + (var3 == var2.size() ? id_break[0] : id_break[1]);
      rVe_1 var6 = new rVe_1(id_break[2]);
      var6.id_class(new rgN_2(var5).id_class(var6.id_class().id_class(rgF_2.RED)));
      rVe_1 var7 = new rVe_1(id_break[3]);
      var7.id_class(var7.id_class().id_class(rgF_2.GRAY));
      String var10001 = id_break[4];
      CharSequence[] var10002 = new CharSequence[1];
      var10002[id_protected[2]] = "Нажмите чтобы удалить '" + var1.id_byte() + "' из макросов";
      var7.id_class(String.join(var10001, var10002));
      var6.id_class(var6.id_class().id_class(new rgy_3(rgp_3.id_class, var7)));
      rVe_1 var8 = new rVe_1(var4);
      var8.id_class(id_break[5]);
      var8.id_class(rrfu_3.id_class(var1.id_byte()).id_break());
      var8.id_class(id_break[6]);
      var8.id_class(rrfu_3.id_class(var1.id_class().id_break()).id_break());
      var8.id_class(id_break[7]);
      var8.id_class(rrfu_3.id_class(var1.id_break()).id_break());
      var8.id_class(var8.id_class().id_class(rgF_2.GRAY));
      var8.id_class(var6);
      var8.id_class(
         var8.id_class()
            .id_class(new rgl_3(rgH_2.RUN_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_byte[3]] + "macro remove " + var1.id_byte()))
      );
      return var8;
   }

   private void id_class() {
      if (this.id_class == null) {
         this.id_class = new Object[1];
         Object[] var1 = this.id_class;
      }
   }

   private static void id_break() {
      id_byte = new short[5];
   }

   private static void id_protected() {
      id_protected = new boolean[]{true, true, false, true, false, true};
   }
}
